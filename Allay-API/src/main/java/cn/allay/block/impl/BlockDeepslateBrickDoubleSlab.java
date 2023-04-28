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
public interface BlockDeepslateBrickDoubleSlab extends Block {
    BlockType<BlockDeepslateBrickDoubleSlab> TYPE = BlockTypeBuilder
            .builder(BlockDeepslateBrickDoubleSlab.class)
            .vanillaBlock(VanillaBlockId.DEEPSLATE_BRICK_DOUBLE_SLAB, true)
            .withProperties(VanillaBlockPropertyTypes.TOP_SLOT_BIT)
            .addBasicComponents()
            .build();
}
