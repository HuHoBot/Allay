package org.allaymc.api.item.interfaces.boat;

import org.allaymc.api.data.VanillaItemId;
import org.allaymc.api.item.ItemStack;
import org.allaymc.api.item.type.ItemType;
import org.allaymc.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemCherryChestBoatStack extends ItemStack {
  ItemType<ItemCherryChestBoatStack> CHERRY_CHEST_BOAT_TYPE = ItemTypeBuilder
          .builder(ItemCherryChestBoatStack.class)
          .vanillaItem(VanillaItemId.CHERRY_CHEST_BOAT)
          .build();
}
