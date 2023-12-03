package org.allaymc.api.block.component.event;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.allaymc.api.block.data.BlockFace;
import org.allaymc.api.component.interfaces.ComponentEvent;
import org.allaymc.api.entity.interfaces.player.EntityPlayer;
import org.allaymc.api.item.ItemStack;
import org.allaymc.api.world.Dimension;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector3fc;
import org.joml.Vector3ic;

import java.util.Objects;

/**
 * Allay Project 2023/9/23
 *
 * @author daoge_cmd
 */
@Getter
@Accessors(fluent = true)
public final class BlockOnInteractEvent implements ComponentEvent {
    private final @Nullable EntityPlayer player;
    private final ItemStack itemStack;
    private final Dimension dimension;
    private final Vector3ic blockPos;
    private final Vector3ic placeBlockPos;
    private final Vector3fc clickPos;
    private final BlockFace blockFace;
    @Setter
    private boolean success;

    /**
     *
     */
    public BlockOnInteractEvent(@Nullable EntityPlayer player, ItemStack itemStack, Dimension dimension, Vector3ic blockPos,
                                Vector3ic placeBlockPos, Vector3fc clickPos,
                                BlockFace blockFace, boolean success) {
        this.player = player;
        this.itemStack = itemStack;
        this.dimension = dimension;
        this.blockPos = blockPos;
        this.placeBlockPos = placeBlockPos;
        this.clickPos = clickPos;
        this.blockFace = blockFace;
        this.success = success;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (BlockOnInteractEvent) obj;
        return Objects.equals(this.player, that.player) &&
                Objects.equals(this.itemStack, that.itemStack) &&
                Objects.equals(this.dimension, that.dimension) &&
                Objects.equals(this.blockPos, that.blockPos) &&
                Objects.equals(this.placeBlockPos, that.placeBlockPos) &&
                Objects.equals(this.clickPos, that.clickPos) &&
                Objects.equals(this.blockFace, that.blockFace);
    }

    @Override
    public int hashCode() {
        return Objects.hash(player, itemStack, dimension, blockPos, placeBlockPos, clickPos, blockFace);
    }

    @Override
    public String toString() {
        return "BlockOnInteractEvent[" +
                "player=" + player + ", " +
                "itemStack=" + itemStack + ", " +
                "dimension=" + dimension + ", " +
                "blockPos=" + blockPos + ", " +
                "placeBlockPos=" + placeBlockPos + ", " +
                "clickPos=" + clickPos + ", " +
                "blockFace=" + blockFace + ']';
    }

}
