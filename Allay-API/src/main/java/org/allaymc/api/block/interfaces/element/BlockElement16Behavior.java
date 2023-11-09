package org.allaymc.api.block.interfaces.element;

import org.allaymc.api.block.BlockBehavior;
import org.allaymc.api.block.type.BlockType;
import org.allaymc.api.block.type.BlockTypeBuilder;
import org.allaymc.api.data.VanillaBlockId;

/**
 * @author daoge_cmd | Cool_Loong <br>
 * Allay Project <br>
 */
public interface BlockElement16Behavior extends BlockBehavior {
  BlockType<BlockElement16Behavior> ELEMENT_16_TYPE = BlockTypeBuilder
          .builder(BlockElement16Behavior.class)
          .vanillaBlock(VanillaBlockId.ELEMENT_16)
          .build();
}
