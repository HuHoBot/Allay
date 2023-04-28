package cn.allay.block.impl;

import cn.allay.block.Block;
import cn.allay.block.data.VanillaBlockId;
import cn.allay.block.type.BlockType;
import cn.allay.block.type.BlockTypeBuilder;

/**
 * Author: daoge_cmd <br>
 * Allay Project <br>
 */
public interface BlockMud extends Block {
    BlockType<BlockMud> TYPE = BlockTypeBuilder
            .builder(BlockMud.class)
            .vanillaBlock(VanillaBlockId.MUD, true)
            .addBasicComponents()
            .build();
}
