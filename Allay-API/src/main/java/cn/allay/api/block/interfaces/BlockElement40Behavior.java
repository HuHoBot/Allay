package cn.allay.api.block.interfaces;

import cn.allay.api.block.BlockBehavior;
import cn.allay.api.block.type.BlockType;
import cn.allay.api.block.type.BlockTypeBuilder;
import cn.allay.api.data.VanillaBlockId;

/**
 * @author daoge_cmd | Cool_Loong <br>
 * Allay Project <br>
 */
public interface BlockElement40Behavior extends BlockBehavior {
    BlockType<BlockElement40Behavior> ELEMENT_40_TYPE = BlockTypeBuilder
            .builder(BlockElement40Behavior.class)
            .vanillaBlock(VanillaBlockId.ELEMENT_40)
            .build();
}
