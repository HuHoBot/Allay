package org.allaymc.api.item.interfaces.boat;

import org.allaymc.api.data.VanillaItemId;
import org.allaymc.api.item.ItemStack;
import org.allaymc.api.item.type.ItemType;
import org.allaymc.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemJungleChestBoatStack extends ItemStack {
  ItemType<ItemJungleChestBoatStack> JUNGLE_CHEST_BOAT_TYPE = ItemTypeBuilder
          .builder(ItemJungleChestBoatStack.class)
          .vanillaItem(VanillaItemId.JUNGLE_CHEST_BOAT)
          .build();
}
