package org.allaymc.api.block.interfaces;

import org.allaymc.api.block.BlockBehavior;
import org.allaymc.api.block.type.BlockType;
import org.allaymc.api.block.type.BlockTypeBuilder;
import org.allaymc.api.data.VanillaBlockId;
import org.allaymc.api.data.VanillaBlockPropertyTypes;

/**
 * @author daoge_cmd | Cool_Loong <br>
 * Allay Project <br>
 */
public interface BlockVineBehavior extends BlockBehavior {
  BlockType<BlockVineBehavior> VINE_TYPE = BlockTypeBuilder
          .builder(BlockVineBehavior.class)
          .vanillaBlock(VanillaBlockId.VINE)
          .setProperties(VanillaBlockPropertyTypes.VINE_DIRECTION_BITS)
          .build();
}
