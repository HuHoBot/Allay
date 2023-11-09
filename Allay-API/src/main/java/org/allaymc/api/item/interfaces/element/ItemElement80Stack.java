package org.allaymc.api.item.interfaces.element;

import org.allaymc.api.data.VanillaItemId;
import org.allaymc.api.item.ItemStack;
import org.allaymc.api.item.type.ItemType;
import org.allaymc.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemElement80Stack extends ItemStack {
  ItemType<ItemElement80Stack> ELEMENT_80_TYPE = ItemTypeBuilder
          .builder(ItemElement80Stack.class)
          .vanillaItem(VanillaItemId.ELEMENT_80)
          .build();
}
