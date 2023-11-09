package org.allaymc.api.item.interfaces.wool;

import org.allaymc.api.data.VanillaItemId;
import org.allaymc.api.item.ItemStack;
import org.allaymc.api.item.type.ItemType;
import org.allaymc.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemGreenWoolStack extends ItemStack {
  ItemType<ItemGreenWoolStack> GREEN_WOOL_TYPE = ItemTypeBuilder
          .builder(ItemGreenWoolStack.class)
          .vanillaItem(VanillaItemId.GREEN_WOOL)
          .build();
}
