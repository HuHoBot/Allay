package cn.allay.block.impl;

import cn.allay.block.Block;
import cn.allay.block.data.VanillaBlockId;
import cn.allay.block.type.BlockType;
import cn.allay.block.type.BlockTypeBuilder;

/**
 * Author: daoge_cmd <br>
 * Allay Project <br>
 */
public interface BlockElement97 extends Block {
    BlockType<BlockElement97> TYPE = BlockTypeBuilder
            .builder(BlockElement97.class)
            .vanillaBlock(VanillaBlockId.ELEMENT_97, true)
            .addBasicComponents()
            .build();
}
