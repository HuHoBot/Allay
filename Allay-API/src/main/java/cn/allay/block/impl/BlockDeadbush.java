package cn.allay.block.impl;

import cn.allay.block.Block;
import cn.allay.block.data.VanillaBlockId;
import cn.allay.block.type.BlockType;
import cn.allay.block.type.BlockTypeBuilder;

/**
 * Author: daoge_cmd <br>
 * Allay Project <br>
 */
public interface BlockDeadbush extends Block {
    BlockType<BlockDeadbush> TYPE = BlockTypeBuilder
            .builder(BlockDeadbush.class)
            .vanillaBlock(VanillaBlockId.DEADBUSH, true)
            .addBasicComponents()
            .build();
}
