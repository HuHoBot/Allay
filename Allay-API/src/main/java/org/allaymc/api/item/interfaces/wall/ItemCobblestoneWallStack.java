package org.allaymc.api.item.interfaces.wall;

import org.allaymc.api.data.VanillaItemId;
import org.allaymc.api.item.ItemStack;
import org.allaymc.api.item.type.ItemType;
import org.allaymc.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemCobblestoneWallStack extends ItemStack {
  ItemType<ItemCobblestoneWallStack> COBBLESTONE_WALL_TYPE = ItemTypeBuilder
          .builder(ItemCobblestoneWallStack.class)
          .vanillaItem(VanillaItemId.COBBLESTONE_WALL)
          .build();
}
