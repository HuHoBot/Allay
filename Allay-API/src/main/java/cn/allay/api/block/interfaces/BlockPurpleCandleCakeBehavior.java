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
public interface BlockPurpleCandleCakeBehavior extends BlockBehavior {
    BlockType<BlockPurpleCandleCakeBehavior> PURPLE_CANDLE_CAKE_TYPE = BlockTypeBuilder
            .builder(BlockPurpleCandleCakeBehavior.class)
            .vanillaBlock(VanillaBlockId.PURPLE_CANDLE_CAKE)
            .setProperties(VanillaBlockPropertyTypes.LIT)
            .build();
}
