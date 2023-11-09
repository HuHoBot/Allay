package org.allaymc.api.item.interfaces.wallsign;

import org.allaymc.api.data.VanillaItemId;
import org.allaymc.api.item.ItemStack;
import org.allaymc.api.item.type.ItemType;
import org.allaymc.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemAcaciaWallSignStack extends ItemStack {
  ItemType<ItemAcaciaWallSignStack> ACACIA_WALL_SIGN_TYPE = ItemTypeBuilder
          .builder(ItemAcaciaWallSignStack.class)
          .vanillaItem(VanillaItemId.ACACIA_WALL_SIGN)
          .build();
}
