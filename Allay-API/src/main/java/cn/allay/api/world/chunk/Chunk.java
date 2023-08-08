package cn.allay.api.world.chunk;

import cn.allay.api.block.type.BlockState;
import cn.allay.api.world.biome.BiomeType;
import org.cloudburstmc.protocol.bedrock.packet.BedrockPacket;
import org.cloudburstmc.protocol.bedrock.packet.LevelChunkPacket;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.UnmodifiableView;

import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;
import java.util.Set;
import java.util.function.Consumer;

/**
 * Allay Project 2023/5/30
 *
 * @author Cool_Loong
 */
@ThreadSafe
public interface Chunk extends UnsafeChunk {
    int SUB_CHUNK_VERSION = 9;
    int SECTION_SIZE = 16 * 16 * 16;

    static @Range(from = 0, to = 4095) int index(@Range(from = 0, to = 15) int x, @Range(from = 0, to = 15) int y, @Range(from = 0, to = 15) int z) {
        //The bedrock chunk order is xzy,the chunk order of java version is yzx
        return (x << 8) + (z << 4) + y;
    }

    void compareAndSetBlock(@Range(from = 0, to = 15) int x, @Range(from = -512, to = 511) int y, @Range(from = 0, to = 15) int z, BlockState expectedValue, BlockState newValue, boolean layer, boolean send, boolean update);

    void compareAndSetBiome(@Range(from = 0, to = 15) int x, @Range(from = -512, to = 511) int y, @Range(from = 0, to = 15) int z, BiomeType expectedValue, BiomeType newValue);

    void compareAndSetBlockLight(@Range(from = 0, to = 15) int x, @Range(from = -512, to = 511) int y, @Range(from = 0, to = 15) int z, @Range(from = 0, to = 15) int expectedValue, @Range(from = 0, to = 15) int newValue);

    void compareAndSetSkyLight(@Range(from = 0, to = 15) int x, @Range(from = -512, to = 511) int y, @Range(from = 0, to = 15) int z, @Range(from = 0, to = 15) int expectedValue, @Range(from = 0, to = 15) int newValue);

    void batchProcess(@Nullable Consumer<SectionOperate> sectionOperate,
                      @Nullable Consumer<HeightOperate> heightOperate,
                      @Nullable Consumer<LightOperate> lightOperate);

    LevelChunkPacket createLevelChunkPacket();
}
