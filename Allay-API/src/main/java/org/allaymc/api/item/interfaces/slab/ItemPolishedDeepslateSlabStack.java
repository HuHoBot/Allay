package org.allaymc.api.item.interfaces.slab;

import org.allaymc.api.data.VanillaItemId;
import org.allaymc.api.item.ItemStack;
import org.allaymc.api.item.type.ItemType;
import org.allaymc.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemPolishedDeepslateSlabStack extends ItemStack {
  ItemType<ItemPolishedDeepslateSlabStack> POLISHED_DEEPSLATE_SLAB_TYPE = ItemTypeBuilder
          .builder(ItemPolishedDeepslateSlabStack.class)
          .vanillaItem(VanillaItemId.POLISHED_DEEPSLATE_SLAB)
          .build();
}
