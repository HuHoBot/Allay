package org.allaymc.api.block.interfaces.wallsign;

import org.allaymc.api.block.BlockBehavior;
import org.allaymc.api.block.type.BlockType;
import org.allaymc.api.block.type.BlockTypeBuilder;
import org.allaymc.api.data.VanillaBlockId;
import org.allaymc.api.data.VanillaBlockPropertyTypes;

/**
 * @author daoge_cmd | Cool_Loong <br>
 * Allay Project <br>
 */
public interface BlockCherryWallSignBehavior extends BlockBehavior {
  BlockType<BlockCherryWallSignBehavior> CHERRY_WALL_SIGN_TYPE = BlockTypeBuilder
          .builder(BlockCherryWallSignBehavior.class)
          .vanillaBlock(VanillaBlockId.CHERRY_WALL_SIGN)
          .setProperties(VanillaBlockPropertyTypes.FACING_DIRECTION)
          .build();
}
