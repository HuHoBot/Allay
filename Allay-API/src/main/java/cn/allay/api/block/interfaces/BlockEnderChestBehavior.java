package cn.allay.api.block.interfaces;

import cn.allay.api.block.BlockBehavior;
import cn.allay.api.block.type.BlockType;
import cn.allay.api.block.type.BlockTypeBuilder;
import cn.allay.api.data.VanillaBlockId;
import cn.allay.api.data.VanillaBlockPropertyTypes;

/**
 * @author daoge_cmd | Cool_Loong <br>
 * Allay Project <br>
 */
public interface BlockEnderChestBehavior extends BlockBehavior {
  BlockType<BlockEnderChestBehavior> ENDER_CHEST_TYPE = BlockTypeBuilder
          .builder(BlockEnderChestBehavior.class)
          .vanillaBlock(VanillaBlockId.ENDER_CHEST)
          .setProperties(VanillaBlockPropertyTypes.MINECRAFT_CARDINAL_DIRECTION)
          .build();
}
