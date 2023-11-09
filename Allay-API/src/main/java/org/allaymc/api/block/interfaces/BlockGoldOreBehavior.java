package org.allaymc.api.block.interfaces;

import org.allaymc.api.block.BlockBehavior;
import org.allaymc.api.block.type.BlockType;
import org.allaymc.api.block.type.BlockTypeBuilder;
import org.allaymc.api.data.VanillaBlockId;

/**
 * @author daoge_cmd | Cool_Loong <br>
 * Allay Project <br>
 */
public interface BlockGoldOreBehavior extends BlockBehavior {
  BlockType<BlockGoldOreBehavior> GOLD_ORE_TYPE = BlockTypeBuilder
          .builder(BlockGoldOreBehavior.class)
          .vanillaBlock(VanillaBlockId.GOLD_ORE)
          .build();
}
