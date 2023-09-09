package cn.allay.api.block.interfaces;

import cn.allay.api.block.BlockBehavior;
import cn.allay.api.block.type.BlockType;
import cn.allay.api.block.type.BlockTypeBuilder;
import cn.allay.api.data.VanillaBlockId;

/**
 * @author daoge_cmd | Cool_Loong <br>
 * Allay Project <br>
 */
public interface BlockMagentaConcreteBehavior extends BlockBehavior {
    BlockType<BlockMagentaConcreteBehavior> MAGENTA_CONCRETE_TYPE = BlockTypeBuilder
            .builder(BlockMagentaConcreteBehavior.class)
            .vanillaBlock(VanillaBlockId.MAGENTA_CONCRETE)
            .build();
}
