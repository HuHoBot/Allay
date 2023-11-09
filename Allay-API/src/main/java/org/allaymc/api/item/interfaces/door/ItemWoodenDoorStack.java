package org.allaymc.api.item.interfaces.door;

import org.allaymc.api.data.VanillaItemId;
import org.allaymc.api.item.ItemStack;
import org.allaymc.api.item.type.ItemType;
import org.allaymc.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemWoodenDoorStack extends ItemStack {
  ItemType<ItemWoodenDoorStack> WOODEN_DOOR_TYPE = ItemTypeBuilder
          .builder(ItemWoodenDoorStack.class)
          .vanillaItem(VanillaItemId.WOODEN_DOOR)
          .build();
}
