package org.allaymc.api.item.interfaces;

import org.allaymc.api.data.VanillaItemId;
import org.allaymc.api.item.ItemStack;
import org.allaymc.api.item.type.ItemType;
import org.allaymc.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemBorderBlockStack extends ItemStack {
  ItemType<ItemBorderBlockStack> BORDER_BLOCK_TYPE = ItemTypeBuilder
          .builder(ItemBorderBlockStack.class)
          .vanillaItem(VanillaItemId.BORDER_BLOCK)
          .build();
}
