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
public interface BlockPolishedBasaltBehavior extends BlockBehavior {
    BlockType<BlockPolishedBasaltBehavior> POLISHED_BASALT_TYPE = BlockTypeBuilder
            .builder(BlockPolishedBasaltBehavior.class)
            .vanillaBlock(VanillaBlockId.POLISHED_BASALT)
            .setProperties(VanillaBlockPropertyTypes.PILLAR_AXIS)
            .build();
}
