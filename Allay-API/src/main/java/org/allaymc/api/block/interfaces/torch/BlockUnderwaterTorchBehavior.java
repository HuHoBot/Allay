package org.allaymc.api.block.interfaces.torch;

import org.allaymc.api.block.BlockBehavior;
import org.allaymc.api.block.type.BlockType;
import org.allaymc.api.block.type.BlockTypeBuilder;
import org.allaymc.api.data.VanillaBlockId;
import org.allaymc.api.data.VanillaBlockPropertyTypes;

/**
 * @author daoge_cmd | Cool_Loong <br>
 * Allay Project <br>
 */
public interface BlockUnderwaterTorchBehavior extends BlockBehavior {
  BlockType<BlockUnderwaterTorchBehavior> UNDERWATER_TORCH_TYPE = BlockTypeBuilder
          .builder(BlockUnderwaterTorchBehavior.class)
          .vanillaBlock(VanillaBlockId.UNDERWATER_TORCH)
          .setProperties(VanillaBlockPropertyTypes.TORCH_FACING_DIRECTION)
          .setBlockBaseComponentSupplier(BlockTorchBaseComponentImpl::new)
          .build();
}
