package org.allaymc.api.block.interfaces.element;

import org.allaymc.api.block.BlockBehavior;
import org.allaymc.api.block.type.BlockType;
import org.allaymc.api.block.type.BlockTypeBuilder;
import org.allaymc.api.data.VanillaBlockId;

/**
 * @author daoge_cmd | Cool_Loong <br>
 * Allay Project <br>
 */
public interface BlockElement25Behavior extends BlockBehavior {
  BlockType<BlockElement25Behavior> ELEMENT_25_TYPE = BlockTypeBuilder
          .builder(BlockElement25Behavior.class)
          .vanillaBlock(VanillaBlockId.ELEMENT_25)
          .build();
}
