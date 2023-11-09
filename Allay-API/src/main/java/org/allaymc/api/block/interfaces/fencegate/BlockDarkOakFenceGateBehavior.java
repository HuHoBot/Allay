package org.allaymc.api.block.interfaces.fencegate;

import org.allaymc.api.block.BlockBehavior;
import org.allaymc.api.block.type.BlockType;
import org.allaymc.api.block.type.BlockTypeBuilder;
import org.allaymc.api.data.VanillaBlockId;
import org.allaymc.api.data.VanillaBlockPropertyTypes;

/**
 * @author daoge_cmd | Cool_Loong <br>
 * Allay Project <br>
 */
public interface BlockDarkOakFenceGateBehavior extends BlockBehavior {
  BlockType<BlockDarkOakFenceGateBehavior> DARK_OAK_FENCE_GATE_TYPE = BlockTypeBuilder
          .builder(BlockDarkOakFenceGateBehavior.class)
          .vanillaBlock(VanillaBlockId.DARK_OAK_FENCE_GATE)
          .setProperties(VanillaBlockPropertyTypes.DIRECTION, VanillaBlockPropertyTypes.IN_WALL_BIT, VanillaBlockPropertyTypes.OPEN_BIT)
          .build();
}
