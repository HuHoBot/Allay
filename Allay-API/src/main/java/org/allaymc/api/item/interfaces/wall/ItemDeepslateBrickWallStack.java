package org.allaymc.api.item.interfaces.wall;

import org.allaymc.api.data.VanillaItemId;
import org.allaymc.api.item.ItemStack;
import org.allaymc.api.item.type.ItemType;
import org.allaymc.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemDeepslateBrickWallStack extends ItemStack {
  ItemType<ItemDeepslateBrickWallStack> DEEPSLATE_BRICK_WALL_TYPE = ItemTypeBuilder
          .builder(ItemDeepslateBrickWallStack.class)
          .vanillaItem(VanillaItemId.DEEPSLATE_BRICK_WALL)
          .build();
}
