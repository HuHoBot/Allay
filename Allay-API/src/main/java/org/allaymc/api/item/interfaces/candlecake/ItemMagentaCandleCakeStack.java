package org.allaymc.api.item.interfaces.candlecake;

import org.allaymc.api.data.VanillaItemId;
import org.allaymc.api.item.ItemStack;
import org.allaymc.api.item.type.ItemType;
import org.allaymc.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemMagentaCandleCakeStack extends ItemStack {
  ItemType<ItemMagentaCandleCakeStack> MAGENTA_CANDLE_CAKE_TYPE = ItemTypeBuilder
          .builder(ItemMagentaCandleCakeStack.class)
          .vanillaItem(VanillaItemId.MAGENTA_CANDLE_CAKE)
          .build();
}
