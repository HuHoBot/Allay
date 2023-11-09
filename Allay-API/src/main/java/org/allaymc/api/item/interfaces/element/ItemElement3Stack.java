package org.allaymc.api.item.interfaces.element;

import org.allaymc.api.data.VanillaItemId;
import org.allaymc.api.item.ItemStack;
import org.allaymc.api.item.type.ItemType;
import org.allaymc.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemElement3Stack extends ItemStack {
  ItemType<ItemElement3Stack> ELEMENT_3_TYPE = ItemTypeBuilder
          .builder(ItemElement3Stack.class)
          .vanillaItem(VanillaItemId.ELEMENT_3)
          .build();
}
