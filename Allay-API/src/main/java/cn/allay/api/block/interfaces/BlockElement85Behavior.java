package cn.allay.api.block.interfaces;

import cn.allay.api.block.BlockBehavior;
import cn.allay.api.block.type.BlockType;
import cn.allay.api.block.type.BlockTypeBuilder;
import cn.allay.api.data.VanillaBlockId;

/**
 * @author daoge_cmd | Cool_Loong <br>
 * Allay Project <br>
 */
public interface BlockElement85Behavior extends BlockBehavior {
    BlockType<BlockElement85Behavior> ELEMENT_85_TYPE = BlockTypeBuilder
            .builder(BlockElement85Behavior.class)
            .vanillaBlock(VanillaBlockId.ELEMENT_85)
            .build();
}
