package org.allaymc.api.block.interfaces.terracotta;

import org.allaymc.api.block.BlockBehavior;
import org.allaymc.api.block.type.BlockType;
import org.allaymc.api.block.type.BlockTypeBuilder;
import org.allaymc.api.data.VanillaBlockId;
import org.allaymc.api.data.VanillaBlockPropertyTypes;

/**
 * @author daoge_cmd | Cool_Loong <br>
 * Allay Project <br>
 */
public interface BlockCyanGlazedTerracottaBehavior extends BlockBehavior {
  BlockType<BlockCyanGlazedTerracottaBehavior> CYAN_GLAZED_TERRACOTTA_TYPE = BlockTypeBuilder
          .builder(BlockCyanGlazedTerracottaBehavior.class)
          .vanillaBlock(VanillaBlockId.CYAN_GLAZED_TERRACOTTA)
          .setProperties(VanillaBlockPropertyTypes.FACING_DIRECTION)
          .build();
}
