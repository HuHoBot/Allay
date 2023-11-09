package org.allaymc.api.block.interfaces.concrete;

import org.allaymc.api.block.BlockBehavior;
import org.allaymc.api.block.type.BlockType;
import org.allaymc.api.block.type.BlockTypeBuilder;
import org.allaymc.api.data.VanillaBlockId;

/**
 * @author daoge_cmd | Cool_Loong <br>
 * Allay Project <br>
 */
public interface BlockPinkConcreteBehavior extends BlockBehavior {
  BlockType<BlockPinkConcreteBehavior> PINK_CONCRETE_TYPE = BlockTypeBuilder
          .builder(BlockPinkConcreteBehavior.class)
          .vanillaBlock(VanillaBlockId.PINK_CONCRETE)
          .build();
}
