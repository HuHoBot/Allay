package org.allaymc.api.block.interfaces.carpet;

import org.allaymc.api.block.BlockBehavior;
import org.allaymc.api.block.type.BlockType;
import org.allaymc.api.block.type.BlockTypeBuilder;
import org.allaymc.api.data.VanillaBlockId;

/**
 * @author daoge_cmd | Cool_Loong <br>
 * Allay Project <br>
 */
public interface BlockMossCarpetBehavior extends BlockBehavior {
  BlockType<BlockMossCarpetBehavior> MOSS_CARPET_TYPE = BlockTypeBuilder
          .builder(BlockMossCarpetBehavior.class)
          .vanillaBlock(VanillaBlockId.MOSS_CARPET)
          .build();
}
