package cn.allay.api.block.interfaces;

import cn.allay.api.block.BlockBehavior;
import cn.allay.api.block.type.BlockType;
import cn.allay.api.block.type.BlockTypeBuilder;
import cn.allay.api.data.VanillaBlockId;

/**
 * @author daoge_cmd | Cool_Loong <br>
 * Allay Project <br>
 */
public interface BlockMagentaWoolBehavior extends BlockBehavior {
    BlockType<BlockMagentaWoolBehavior> MAGENTA_WOOL_TYPE = BlockTypeBuilder
            .builder(BlockMagentaWoolBehavior.class)
            .vanillaBlock(VanillaBlockId.MAGENTA_WOOL)
            .build();
}
