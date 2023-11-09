package org.allaymc.api.item.interfaces.fence;

import org.allaymc.api.data.VanillaItemId;
import org.allaymc.api.item.ItemStack;
import org.allaymc.api.item.type.ItemType;
import org.allaymc.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemMangroveFenceStack extends ItemStack {
  ItemType<ItemMangroveFenceStack> MANGROVE_FENCE_TYPE = ItemTypeBuilder
          .builder(ItemMangroveFenceStack.class)
          .vanillaItem(VanillaItemId.MANGROVE_FENCE)
          .build();
}
