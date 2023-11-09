package org.allaymc.api.block.interfaces;

import org.allaymc.api.block.BlockBehavior;
import org.allaymc.api.block.type.BlockType;
import org.allaymc.api.block.type.BlockTypeBuilder;
import org.allaymc.api.data.VanillaBlockId;

/**
 * @author daoge_cmd | Cool_Loong <br>
 * Allay Project <br>
 */
public interface BlockFletchingTableBehavior extends BlockBehavior {
  BlockType<BlockFletchingTableBehavior> FLETCHING_TABLE_TYPE = BlockTypeBuilder
          .builder(BlockFletchingTableBehavior.class)
          .vanillaBlock(VanillaBlockId.FLETCHING_TABLE)
          .build();
}
