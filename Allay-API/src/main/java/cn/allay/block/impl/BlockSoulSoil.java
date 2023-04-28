package cn.allay.block.impl;

import cn.allay.block.Block;
import cn.allay.block.data.VanillaBlockId;
import cn.allay.block.type.BlockType;
import cn.allay.block.type.BlockTypeBuilder;

/**
 * Author: daoge_cmd <br>
 * Allay Project <br>
 */
public interface BlockSoulSoil extends Block {
    BlockType<BlockSoulSoil> TYPE = BlockTypeBuilder
            .builder(BlockSoulSoil.class)
            .vanillaBlock(VanillaBlockId.SOUL_SOIL, true)
            .addBasicComponents()
            .build();
}
