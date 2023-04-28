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
public interface BlockSponge extends Block {
    BlockType<BlockSponge> TYPE = BlockTypeBuilder
            .builder(BlockSponge.class)
            .vanillaBlock(VanillaBlockId.SPONGE, true)
            .withProperties(VanillaBlockPropertyTypes.SPONGE_TYPE)
            .addBasicComponents()
            .build();
}
