package cn.allay.api.block.interfaces;

import cn.allay.api.block.BlockBehavior;
import cn.allay.api.block.type.BlockType;
import cn.allay.api.block.type.BlockTypeBuilder;
import cn.allay.api.data.VanillaBlockId;

/**
 * @author daoge_cmd | Cool_Loong <br>
 * Allay Project <br>
 */
public interface BlockWaxedOxidizedCopperBehavior extends BlockBehavior {
    BlockType<BlockWaxedOxidizedCopperBehavior> WAXED_OXIDIZED_COPPER_TYPE = BlockTypeBuilder
            .builder(BlockWaxedOxidizedCopperBehavior.class)
            .vanillaBlock(VanillaBlockId.WAXED_OXIDIZED_COPPER)
            .build();
}
