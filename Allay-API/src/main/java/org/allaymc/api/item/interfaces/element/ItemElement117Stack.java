package org.allaymc.api.item.interfaces.element;

import org.allaymc.api.data.VanillaItemId;
import org.allaymc.api.item.ItemStack;
import org.allaymc.api.item.type.ItemType;
import org.allaymc.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemElement117Stack extends ItemStack {
  ItemType<ItemElement117Stack> ELEMENT_117_TYPE = ItemTypeBuilder
          .builder(ItemElement117Stack.class)
          .vanillaItem(VanillaItemId.ELEMENT_117)
          .build();
}
