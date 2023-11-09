package org.allaymc.api.item.interfaces.element;

import org.allaymc.api.data.VanillaItemId;
import org.allaymc.api.item.ItemStack;
import org.allaymc.api.item.type.ItemType;
import org.allaymc.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemElement58Stack extends ItemStack {
  ItemType<ItemElement58Stack> ELEMENT_58_TYPE = ItemTypeBuilder
          .builder(ItemElement58Stack.class)
          .vanillaItem(VanillaItemId.ELEMENT_58)
          .build();
}
