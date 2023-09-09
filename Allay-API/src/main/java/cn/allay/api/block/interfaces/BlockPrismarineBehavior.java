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
public interface BlockPrismarineBehavior extends BlockBehavior {
    BlockType<BlockPrismarineBehavior> PRISMARINE_TYPE = BlockTypeBuilder
            .builder(BlockPrismarineBehavior.class)
            .vanillaBlock(VanillaBlockId.PRISMARINE)
            .setProperties(VanillaBlockPropertyTypes.PRISMARINE_BLOCK_TYPE)
            .build();
}
