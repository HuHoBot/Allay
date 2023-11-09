package org.allaymc.api.item.interfaces;

import org.allaymc.api.data.VanillaItemId;
import org.allaymc.api.item.ItemStack;
import org.allaymc.api.item.type.ItemType;
import org.allaymc.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemVerdantFroglightStack extends ItemStack {
  ItemType<ItemVerdantFroglightStack> VERDANT_FROGLIGHT_TYPE = ItemTypeBuilder
          .builder(ItemVerdantFroglightStack.class)
          .vanillaItem(VanillaItemId.VERDANT_FROGLIGHT)
          .build();
}
