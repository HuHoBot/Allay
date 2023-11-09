package org.allaymc.api.item.interfaces;

import org.allaymc.api.data.VanillaItemId;
import org.allaymc.api.item.ItemStack;
import org.allaymc.api.item.type.ItemType;
import org.allaymc.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemRawCopperBlockStack extends ItemStack {
  ItemType<ItemRawCopperBlockStack> RAW_COPPER_BLOCK_TYPE = ItemTypeBuilder
          .builder(ItemRawCopperBlockStack.class)
          .vanillaItem(VanillaItemId.RAW_COPPER_BLOCK)
          .build();
}
