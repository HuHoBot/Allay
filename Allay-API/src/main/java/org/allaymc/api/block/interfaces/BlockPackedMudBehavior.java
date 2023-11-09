package org.allaymc.api.block.interfaces;

import org.allaymc.api.block.BlockBehavior;
import org.allaymc.api.block.type.BlockType;
import org.allaymc.api.block.type.BlockTypeBuilder;
import org.allaymc.api.data.VanillaBlockId;

/**
 * @author daoge_cmd | Cool_Loong <br>
 * Allay Project <br>
 */
public interface BlockPackedMudBehavior extends BlockBehavior {
  BlockType<BlockPackedMudBehavior> PACKED_MUD_TYPE = BlockTypeBuilder
          .builder(BlockPackedMudBehavior.class)
          .vanillaBlock(VanillaBlockId.PACKED_MUD)
          .build();
}
