package org.allaymc.api.block.interfaces.coral;

import org.allaymc.api.block.BlockBehavior;
import org.allaymc.api.block.type.BlockType;
import org.allaymc.api.block.type.BlockTypeBuilder;
import org.allaymc.api.data.VanillaBlockId;

/**
 * @author daoge_cmd | Cool_Loong <br>
 * Allay Project <br>
 */
public interface BlockDeadFireCoralBehavior extends BlockBehavior {
  BlockType<BlockDeadFireCoralBehavior> DEAD_FIRE_CORAL_TYPE = BlockTypeBuilder
          .builder(BlockDeadFireCoralBehavior.class)
          .vanillaBlock(VanillaBlockId.DEAD_FIRE_CORAL)
          .build();
}
