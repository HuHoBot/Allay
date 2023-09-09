package cn.allay.api.block.interfaces;

import cn.allay.api.block.BlockBehavior;
import cn.allay.api.block.type.BlockType;
import cn.allay.api.block.type.BlockTypeBuilder;
import cn.allay.api.data.VanillaBlockId;

/**
 * @author daoge_cmd | Cool_Loong <br>
 * Allay Project <br>
 */
public interface BlockElement75Behavior extends BlockBehavior {
    BlockType<BlockElement75Behavior> ELEMENT_75_TYPE = BlockTypeBuilder
            .builder(BlockElement75Behavior.class)
            .vanillaBlock(VanillaBlockId.ELEMENT_75)
            .build();
}
