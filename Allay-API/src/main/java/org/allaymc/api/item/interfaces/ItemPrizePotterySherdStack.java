package org.allaymc.api.item.interfaces;

import org.allaymc.api.data.VanillaItemId;
import org.allaymc.api.item.ItemStack;
import org.allaymc.api.item.type.ItemType;
import org.allaymc.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemPrizePotterySherdStack extends ItemStack {
  ItemType<ItemPrizePotterySherdStack> PRIZE_POTTERY_SHERD_TYPE = ItemTypeBuilder
          .builder(ItemPrizePotterySherdStack.class)
          .vanillaItem(VanillaItemId.PRIZE_POTTERY_SHERD)
          .build();
}
