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
public interface BlockDecoratedPotBehavior extends BlockBehavior {
  BlockType<BlockDecoratedPotBehavior> DECORATED_POT_TYPE = BlockTypeBuilder
          .builder(BlockDecoratedPotBehavior.class)
          .vanillaBlock(VanillaBlockId.DECORATED_POT)
          .setProperties(VanillaBlockPropertyTypes.DIRECTION)
          .build();
}
