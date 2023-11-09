package org.allaymc.api.item.interfaces.carpet;

import org.allaymc.api.data.VanillaItemId;
import org.allaymc.api.item.ItemStack;
import org.allaymc.api.item.type.ItemType;
import org.allaymc.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemBlackCarpetStack extends ItemStack {
  ItemType<ItemBlackCarpetStack> BLACK_CARPET_TYPE = ItemTypeBuilder
          .builder(ItemBlackCarpetStack.class)
          .vanillaItem(VanillaItemId.BLACK_CARPET)
          .build();
}
