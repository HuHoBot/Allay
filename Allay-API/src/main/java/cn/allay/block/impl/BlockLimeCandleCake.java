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
public interface BlockLimeCandleCake extends Block {
    BlockType<BlockLimeCandleCake> TYPE = BlockTypeBuilder
            .builder(BlockLimeCandleCake.class)
            .vanillaBlock(VanillaBlockId.LIME_CANDLE_CAKE, true)
            .withProperties(VanillaBlockPropertyTypes.LIT)
            .addBasicComponents()
            .build();
}
