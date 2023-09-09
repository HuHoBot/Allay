package cn.allay.api.block.interfaces;

import cn.allay.api.block.BlockBehavior;
import cn.allay.api.block.type.BlockType;
import cn.allay.api.block.type.BlockTypeBuilder;
import cn.allay.api.data.VanillaBlockId;

/**
 * @author daoge_cmd | Cool_Loong <br>
 * Allay Project <br>
 */
public interface BlockWarpedFenceBehavior extends BlockBehavior {
    BlockType<BlockWarpedFenceBehavior> WARPED_FENCE_TYPE = BlockTypeBuilder
            .builder(BlockWarpedFenceBehavior.class)
            .vanillaBlock(VanillaBlockId.WARPED_FENCE)
            .build();
}
