package org.allaymc.api.block.interfaces.element;

import org.allaymc.api.block.BlockBehavior;
import org.allaymc.api.block.type.BlockType;
import org.allaymc.api.block.type.BlockTypeBuilder;
import org.allaymc.api.data.VanillaBlockId;

/**
 * @author daoge_cmd | Cool_Loong <br>
 * Allay Project <br>
 */
public interface BlockElement44Behavior extends BlockBehavior {
  BlockType<BlockElement44Behavior> ELEMENT_44_TYPE = BlockTypeBuilder
          .builder(BlockElement44Behavior.class)
          .vanillaBlock(VanillaBlockId.ELEMENT_44)
          .build();
}
