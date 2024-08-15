package org.allaymc.server.block.component.sign;

import org.allaymc.api.block.BlockBehavior;
import org.allaymc.api.block.component.RequireBlockProperty;
import org.allaymc.api.block.component.common.PlayerInteractInfo;
import org.allaymc.api.block.data.BlockFace;
import org.allaymc.api.block.data.BlockStateWithPos;
import org.allaymc.api.block.property.type.BlockPropertyType;
import org.allaymc.api.block.type.BlockState;
import org.allaymc.api.block.type.BlockType;
import org.allaymc.api.data.VanillaBlockPropertyTypes;
import org.allaymc.api.entity.Entity;
import org.allaymc.api.item.ItemStack;
import org.allaymc.api.item.type.ItemType;
import org.allaymc.api.world.Dimension;
import org.allaymc.server.block.PlaceBlockHelper;
import org.allaymc.server.block.component.common.BlockBaseComponentImpl;
import org.joml.Vector3ic;

import java.util.Set;

/**
 * Allay Project 2024/8/15
 *
 * @author daoge_cmd
 */
@RequireBlockProperty(type = BlockPropertyType.Type.INT, name = "ground_sign_direction")
public class BlockStandingSignBaseComponentImpl extends BlockBaseComponentImpl {

    protected ItemType<?> dropItemType;

    public BlockStandingSignBaseComponentImpl(BlockType<? extends BlockBehavior> blockType, ItemType<?> dropItemType) {
        super(blockType);
        this.dropItemType = dropItemType;
    }

    @Override
    public boolean place(Dimension dimension, BlockState blockState, Vector3ic placeBlockPos, PlayerInteractInfo placementInfo) {
        checkPlaceMethodParam(dimension, blockState, placeBlockPos, placementInfo);
        blockState = blockState.setProperty(VanillaBlockPropertyTypes.GROUND_SIGN_DIRECTION.createValue(
                ((int) Math.floor((placementInfo.player().getLocation().yaw() + 180) * 16 / 360 + 0.5)) & 0x0f
        ));
        dimension.setBlockState(
                placeBlockPos.x(), placeBlockPos.y(), placeBlockPos.z(),
                blockState, placementInfo
        );
        return true;
    }

    @Override
    public boolean canKeepExisting(BlockStateWithPos current, BlockStateWithPos neighbor, BlockFace face) {
        if (face != BlockFace.DOWN) return true;
        return neighbor.blockState().getBlockType().getMaterial().isSolid();
    }

    @Override
    public Set<ItemStack> getDrops(BlockStateWithPos blockState, ItemStack usedItem, Entity entity) {
        return Set.of(dropItemType.createItemStack(1));
    }

    @Override
    public ItemStack getSilkTouchDrop(BlockStateWithPos blockState) {
        return dropItemType.createItemStack(1);
    }
}
