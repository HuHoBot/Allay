package org.allaymc.api.item.interfaces;

import org.allaymc.api.data.VanillaItemId;
import org.allaymc.api.item.ItemStack;
import org.allaymc.api.item.type.ItemType;
import org.allaymc.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemNetherBrickStack extends ItemStack {
  ItemType<ItemNetherBrickStack> NETHER_BRICK_TYPE = ItemTypeBuilder
          .builder(ItemNetherBrickStack.class)
          .vanillaItem(VanillaItemId.NETHER_BRICK)
          .build();
}
