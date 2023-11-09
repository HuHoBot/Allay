package org.allaymc.api.block.interfaces;

import org.allaymc.api.block.BlockBehavior;
import org.allaymc.api.block.type.BlockType;
import org.allaymc.api.block.type.BlockTypeBuilder;
import org.allaymc.api.data.VanillaBlockId;
import org.allaymc.api.data.VanillaBlockPropertyTypes;

/**
 * @author daoge_cmd | Cool_Loong <br>
 * Allay Project <br>
 */
public interface BlockWeepingVinesBehavior extends BlockBehavior {
  BlockType<BlockWeepingVinesBehavior> WEEPING_VINES_TYPE = BlockTypeBuilder
          .builder(BlockWeepingVinesBehavior.class)
          .vanillaBlock(VanillaBlockId.WEEPING_VINES)
          .setProperties(VanillaBlockPropertyTypes.WEEPING_VINES_AGE)
          .build();
}
