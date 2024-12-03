package org.allaymc.server.world.palette;

import com.google.common.base.Objects;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufOutputStream;
import it.unimi.dsi.fastutil.objects.ReferenceArrayList;
import lombok.extern.slf4j.Slf4j;
import org.allaymc.api.world.chunk.Chunk;
import org.allaymc.server.world.bitarray.BitArray;
import org.allaymc.server.world.bitarray.BitArrayVersion;
import org.cloudburstmc.nbt.NbtUtils;
import org.cloudburstmc.protocol.common.util.VarInts;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * TODO: add tests
 *
 * @author JukeboxMC | daoge_cmd | CoolLoong
 */
@Slf4j
public final class Palette<V> {

    private static final byte COPY_LAST_FLAG_HEADER = (byte) (0x7F << 1) | 1;

    private final List<V> palette;
    private BitArray bitArray;

    public Palette(V first) {
        this(first, BitArrayVersion.V2);
    }

    public Palette(V first, BitArrayVersion version) {
        this(first, new ReferenceArrayList<>(16), version);
    }

    public Palette(V first, List<V> palette, BitArrayVersion version) {
        this.bitArray = version.createArray(Chunk.SECTION_SIZE);
        this.palette = palette;
        this.palette.add(first);
    }

    private static boolean isPersistent(short header) {
        return (header & 1) == 0;
    }

    public V get(int index) {
        return this.palette.get(this.bitArray.get(index));
    }

    public void set(int index, V value) {
        var paletteIndex = this.paletteIndexFor(value);
        this.bitArray.set(index, paletteIndex);
    }

    public void writeToNetwork(ByteBuf byteBuf, RuntimeDataSerializer<V> serializer) {
        byteBuf.writeByte(getPaletteHeader(this.bitArray.version(), true));
        if (bitArray.version() != BitArrayVersion.V0) {
            for (int word : this.bitArray.words()) {
                byteBuf.writeIntLE(word);
            }
            VarInts.writeInt(byteBuf, this.palette.size());
        }

        this.palette.forEach(value -> VarInts.writeInt(byteBuf, serializer.serialize(value)));
    }

    public void writeToStoragePersistent(ByteBuf byteBuf, PersistentDataSerializer<V> serializer) {
        var version = isEmpty() ? BitArrayVersion.V0 : this.bitArray.version();
        byteBuf.writeByte(Palette.getPaletteHeader(version, false));

        if (version != BitArrayVersion.V0) {
            for (int word : this.bitArray.words()) {
                byteBuf.writeIntLE(word);
            }
            byteBuf.writeIntLE(this.palette.size());
        }

        try (var bufOutputStream = new ByteBufOutputStream(byteBuf);
             var outputStream = NbtUtils.createWriterLE(bufOutputStream)) {
            for (V value : this.palette) {
                // TODO: Maybe we can convert and cache the byte array of every block state tag, which will make chunk saving faster
                outputStream.writeTag(serializer.serialize(value));
            }
        } catch (IOException e) {
            throw new PaletteException(e);
        }
    }

    public void readFromStoragePersistent(ByteBuf byteBuf, PersistentDataDeserializer<V> deserializer) {
        var header = byteBuf.readUnsignedByte();
        if (!isPersistent(header)) {
            log.warn("Reading runtime data with persistent method!");
        }

        var version = getVersionFromPaletteHeader(header);
        this.palette.clear();
        int paletteSize = 1;

        if (version == BitArrayVersion.V0) {
            this.bitArray = version.createArray(Chunk.SECTION_SIZE, null);
        } else {
            readWords(byteBuf, version);
            paletteSize = byteBuf.readIntLE();
        }
        checkVersion(version, paletteSize);

        for (int i = 0; i < paletteSize; i++) {
            this.palette.add(deserializer.deserialize(byteBuf));
        }
        if (version == BitArrayVersion.V0) {
            this.onResize(BitArrayVersion.V2);
        }
    }

    public void writeToStorageRuntime(ByteBuf byteBuf, RuntimeDataSerializer<V> serializer, Palette<V> last) {
        // FIXME: copy last flag
//        if (last != null && last.palette.equals(this.palette)) {
//            byteBuf.writeByte(COPY_LAST_FLAG_HEADER);
//            return;
//        }

        var version = this.isEmpty() ? BitArrayVersion.V0 : this.bitArray.version();
        byteBuf.writeByte(Palette.getPaletteHeader(version, true));
        if (version != BitArrayVersion.V0) {
            for (int word : this.bitArray.words()) {
                byteBuf.writeIntLE(word);
            }
            byteBuf.writeIntLE(this.palette.size());
        }

        for (V value : this.palette) {
            byteBuf.writeIntLE(serializer.serialize(value));
        }
    }

    public void readFromStorageRuntime(ByteBuf byteBuf, RuntimeDataDeserializer<V> deserializer, Palette<V> last) {
        var header = byteBuf.readUnsignedByte();
        if (isPersistent(header)) {
            log.warn("Reading persistent data with runtime method!");
        }
        if (hasCopyLastFlag(header)) {
            last.copyTo(this);
            return;
        }

        var version = getVersionFromPaletteHeader(header);
        this.palette.clear();
        var paletteSize = 1;

        if (version == BitArrayVersion.V0) {
            this.bitArray = version.createArray(Chunk.SECTION_SIZE, null);
        } else {
            readWords(byteBuf, version);
            paletteSize = byteBuf.readIntLE();
        }
        checkVersion(version, paletteSize);

        for (int i = 0; i < paletteSize; i++) {
            this.palette.add(deserializer.deserialize(byteBuf.readIntLE()));
        }
        if (version == BitArrayVersion.V0) {
            this.onResize(BitArrayVersion.V2);
        }
    }

    public boolean isEmpty() {
        if (this.palette.size() == 1) {
            return true;
        }
        // Do not use stream, this will be quicker
        for (int word : this.bitArray.words()) {
            if (Integer.toUnsignedLong(word) != 0L) {
                return false;
            }
        }
        return true;
    }

    public void copyTo(Palette<V> palette) {
        palette.bitArray = this.bitArray.copy();
        palette.palette.clear();
        palette.palette.addAll(this.palette);
    }

    private void readWords(ByteBuf byteBuf, BitArrayVersion version) {
        var wordCount = version.getWordsForSize(Chunk.SECTION_SIZE);
        var words = new int[wordCount];
        Arrays.setAll(words, i -> byteBuf.readIntLE());

        this.bitArray = version.createArray(Chunk.SECTION_SIZE, words);
    }

    private void onResize(BitArrayVersion version) {
        var newBitArray = version.createArray(Chunk.SECTION_SIZE);
        for (int i = 0; i < Chunk.SECTION_SIZE; i++) {
            newBitArray.set(i, this.bitArray.get(i));
        }

        this.bitArray = newBitArray;
    }

    private int paletteIndexFor(V value) {
        var index = this.palette.indexOf(value);
        if (index != -1) {
            return index;
        }

        index = this.palette.size();
        this.palette.add(value);

        var version = this.bitArray.version();
        if (index > version.maxEntryValue) {
            var next = version.next;
            if (next != null) {
                this.onResize(next);
            }
        }

        return index;
    }

    private static boolean hasCopyLastFlag(short header) {
        return (header >> 1) == 0x7F;
    }

    private static int getPaletteHeader(BitArrayVersion version, boolean runtime) {
        return (version.bits << 1) | (runtime ? 1 : 0);
    }

    private static BitArrayVersion getVersionFromPaletteHeader(short header) {
        return BitArrayVersion.get(header >> 1, true);
    }

    private static void checkVersion(BitArrayVersion version, int paletteSize) {
        if (version.maxEntryValue < paletteSize - 1) {
            throw new PaletteException("Palette (version " + version.name() + ") is too large. Max size " + version.maxEntryValue + ". Actual size " + paletteSize);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Palette<?> palette1)) return false;
        return Objects.equal(palette, palette1.palette) && Objects.equal(bitArray, palette1.bitArray);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(palette, bitArray);
    }
}