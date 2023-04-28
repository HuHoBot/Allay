package cn.allay.block.impl;

import cn.allay.block.Block;
import cn.allay.block.data.VanillaBlockId;
import cn.allay.block.type.BlockType;
import cn.allay.block.type.BlockTypeBuilder;

/**
 * Author: daoge_cmd <br>
 * Allay Project <br>
 */
public interface BlockBambooPlanks extends Block {
    BlockType<BlockBambooPlanks> TYPE = BlockTypeBuilder
            .builder(BlockBambooPlanks.class)
            .vanillaBlock(VanillaBlockId.BAMBOO_PLANKS, true)
            .addBasicComponents()
            .build();
}
