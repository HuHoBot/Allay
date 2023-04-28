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
public interface BlockSand extends Block {
    BlockType<BlockSand> TYPE = BlockTypeBuilder
            .builder(BlockSand.class)
            .vanillaBlock(VanillaBlockId.SAND, true)
            .withProperties(VanillaBlockPropertyTypes.SAND_TYPE)
            .addBasicComponents()
            .build();
}
