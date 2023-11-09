package org.allaymc.api.item.interfaces;

import org.allaymc.api.data.VanillaItemId;
import org.allaymc.api.item.ItemStack;
import org.allaymc.api.item.type.ItemType;
import org.allaymc.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemShearsStack extends ItemStack {
  ItemType<ItemShearsStack> SHEARS_TYPE = ItemTypeBuilder
          .builder(ItemShearsStack.class)
          .vanillaItem(VanillaItemId.SHEARS)
          .build();
}
