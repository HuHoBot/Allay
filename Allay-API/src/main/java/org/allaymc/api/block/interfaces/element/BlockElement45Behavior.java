package org.allaymc.api.block.interfaces.element;

import org.allaymc.api.block.BlockBehavior;
import org.allaymc.api.block.type.BlockType;
import org.allaymc.api.block.type.BlockTypeBuilder;
import org.allaymc.api.data.VanillaBlockId;

/**
 * @author daoge_cmd | Cool_Loong <br>
 * Allay Project <br>
 */
public interface BlockElement45Behavior extends BlockBehavior {
  BlockType<BlockElement45Behavior> ELEMENT_45_TYPE = BlockTypeBuilder
          .builder(BlockElement45Behavior.class)
          .vanillaBlock(VanillaBlockId.ELEMENT_45)
          .build();
}
