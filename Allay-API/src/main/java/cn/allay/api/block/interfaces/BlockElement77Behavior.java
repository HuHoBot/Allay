package cn.allay.api.block.interfaces;

import cn.allay.api.block.BlockBehavior;
import cn.allay.api.block.type.BlockType;
import cn.allay.api.block.type.BlockTypeBuilder;
import cn.allay.api.data.VanillaBlockId;

/**
 * @author daoge_cmd | Cool_Loong <br>
 * Allay Project <br>
 */
public interface BlockElement77Behavior extends BlockBehavior {
    BlockType<BlockElement77Behavior> ELEMENT_77_TYPE = BlockTypeBuilder
            .builder(BlockElement77Behavior.class)
            .vanillaBlock(VanillaBlockId.ELEMENT_77)
            .build();
}
