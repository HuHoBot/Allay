package cn.allay.api.block.interfaces;

import cn.allay.api.block.BlockBehavior;
import cn.allay.api.block.type.BlockType;
import cn.allay.api.block.type.BlockTypeBuilder;
import cn.allay.api.data.VanillaBlockId;

/**
 * @author daoge_cmd | Cool_Loong <br>
 * Allay Project <br>
 */
public interface BlockYellowShulkerBoxBehavior extends BlockBehavior {
    BlockType<BlockYellowShulkerBoxBehavior> YELLOW_SHULKER_BOX_TYPE = BlockTypeBuilder
            .builder(BlockYellowShulkerBoxBehavior.class)
            .vanillaBlock(VanillaBlockId.YELLOW_SHULKER_BOX)
            .build();
}
