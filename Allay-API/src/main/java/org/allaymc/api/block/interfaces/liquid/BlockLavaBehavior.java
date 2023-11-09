package org.allaymc.api.block.interfaces.liquid;

import org.allaymc.api.block.BlockBehavior;
import org.allaymc.api.block.type.BlockType;
import org.allaymc.api.block.type.BlockTypeBuilder;
import org.allaymc.api.data.VanillaBlockId;
import org.allaymc.api.data.VanillaBlockPropertyTypes;

/**
 * @author daoge_cmd | Cool_Loong <br>
 * Allay Project <br>
 */
public interface BlockLavaBehavior extends BlockBehavior {
  BlockType<BlockLavaBehavior> LAVA_TYPE = BlockTypeBuilder
          .builder(BlockLavaBehavior.class)
          .vanillaBlock(VanillaBlockId.LAVA)
          .setProperties(VanillaBlockPropertyTypes.LIQUID_DEPTH)
          .build();
}
