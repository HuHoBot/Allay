package cn.allay.block.impl;

import cn.allay.block.Block;
import cn.allay.block.data.VanillaBlockId;
import cn.allay.block.property.vanilla.VanillaBlockPropertyTypes;
import cn.allay.block.type.BlockType;
import cn.allay.block.type.BlockTypeBuilder;

/**
 * Author: daoge_cmd <br>
 * Allay Project <br>
 */
public interface BlockBambooWallSign extends Block {
    BlockType<BlockBambooWallSign> TYPE = BlockTypeBuilder
            .builder(BlockBambooWallSign.class)
            .vanillaBlock(VanillaBlockId.BAMBOO_WALL_SIGN, true)
            .withProperties(VanillaBlockPropertyTypes.FACING_DIRECTION)
            .addBasicComponents()
            .build();
}
