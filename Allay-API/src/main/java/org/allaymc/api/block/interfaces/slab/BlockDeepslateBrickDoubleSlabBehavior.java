package org.allaymc.api.block.interfaces.slab;

import org.allaymc.api.block.BlockBehavior;
import org.allaymc.api.block.type.BlockType;
import org.allaymc.api.block.type.BlockTypeBuilder;
import org.allaymc.api.data.VanillaBlockId;
import org.allaymc.api.data.VanillaBlockPropertyTypes;

/**
 * @author daoge_cmd | Cool_Loong <br>
 * Allay Project <br>
 */
public interface BlockDeepslateBrickDoubleSlabBehavior extends BlockBehavior {
  BlockType<BlockDeepslateBrickDoubleSlabBehavior> DEEPSLATE_BRICK_DOUBLE_SLAB_TYPE = BlockTypeBuilder
          .builder(BlockDeepslateBrickDoubleSlabBehavior.class)
          .vanillaBlock(VanillaBlockId.DEEPSLATE_BRICK_DOUBLE_SLAB)
          .setProperties(VanillaBlockPropertyTypes.MINECRAFT_VERTICAL_HALF)
          .build();
}
