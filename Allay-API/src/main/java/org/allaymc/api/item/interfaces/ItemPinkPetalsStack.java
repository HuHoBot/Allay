package org.allaymc.api.item.interfaces;

import org.allaymc.api.data.VanillaItemId;
import org.allaymc.api.item.ItemStack;
import org.allaymc.api.item.type.ItemType;
import org.allaymc.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemPinkPetalsStack extends ItemStack {
  ItemType<ItemPinkPetalsStack> PINK_PETALS_TYPE = ItemTypeBuilder
          .builder(ItemPinkPetalsStack.class)
          .vanillaItem(VanillaItemId.PINK_PETALS)
          .build();
}
