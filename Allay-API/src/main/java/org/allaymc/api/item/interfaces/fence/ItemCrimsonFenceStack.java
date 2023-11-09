package org.allaymc.api.item.interfaces.fence;

import org.allaymc.api.data.VanillaItemId;
import org.allaymc.api.item.ItemStack;
import org.allaymc.api.item.type.ItemType;
import org.allaymc.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemCrimsonFenceStack extends ItemStack {
  ItemType<ItemCrimsonFenceStack> CRIMSON_FENCE_TYPE = ItemTypeBuilder
          .builder(ItemCrimsonFenceStack.class)
          .vanillaItem(VanillaItemId.CRIMSON_FENCE)
          .build();
}
