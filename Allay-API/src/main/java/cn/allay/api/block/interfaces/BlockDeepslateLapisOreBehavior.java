package cn.allay.api.block.interfaces;

import cn.allay.api.block.BlockBehavior;
import cn.allay.api.block.type.BlockType;
import cn.allay.api.block.type.BlockTypeBuilder;
import cn.allay.api.data.VanillaBlockId;

/**
 * @author daoge_cmd | Cool_Loong <br>
 * Allay Project <br>
 */
public interface BlockDeepslateLapisOreBehavior extends BlockBehavior {
    BlockType<BlockDeepslateLapisOreBehavior> DEEPSLATE_LAPIS_ORE_TYPE = BlockTypeBuilder
            .builder(BlockDeepslateLapisOreBehavior.class)
            .vanillaBlock(VanillaBlockId.DEEPSLATE_LAPIS_ORE)
            .build();
}
