package cn.allay.api.block.interfaces;

import cn.allay.api.block.BlockBehavior;
import cn.allay.api.block.type.BlockType;
import cn.allay.api.block.type.BlockTypeBuilder;
import cn.allay.api.data.VanillaBlockId;
import cn.allay.api.data.VanillaBlockPropertyTypes;

/**
 * @author daoge_cmd | Cool_Loong <br>
 * Allay Project <br>
 */
public interface BlockWhiteCandleBehavior extends BlockBehavior {
    BlockType<BlockWhiteCandleBehavior> WHITE_CANDLE_TYPE = BlockTypeBuilder
            .builder(BlockWhiteCandleBehavior.class)
            .vanillaBlock(VanillaBlockId.WHITE_CANDLE)
            .setProperties(VanillaBlockPropertyTypes.CANDLES, VanillaBlockPropertyTypes.LIT)
            .build();
}
