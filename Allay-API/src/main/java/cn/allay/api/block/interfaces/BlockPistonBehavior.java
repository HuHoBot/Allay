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
public interface BlockPistonBehavior extends BlockBehavior {
    BlockType<BlockPistonBehavior> PISTON_TYPE = BlockTypeBuilder
            .builder(BlockPistonBehavior.class)
            .vanillaBlock(VanillaBlockId.PISTON)
            .setProperties(VanillaBlockPropertyTypes.FACING_DIRECTION)
            .build();
}
