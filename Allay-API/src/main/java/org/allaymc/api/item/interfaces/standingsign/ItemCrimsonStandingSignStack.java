package org.allaymc.api.item.interfaces.standingsign;

import org.allaymc.api.data.VanillaItemId;
import org.allaymc.api.item.ItemStack;
import org.allaymc.api.item.type.ItemType;
import org.allaymc.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemCrimsonStandingSignStack extends ItemStack {
  ItemType<ItemCrimsonStandingSignStack> CRIMSON_STANDING_SIGN_TYPE = ItemTypeBuilder
          .builder(ItemCrimsonStandingSignStack.class)
          .vanillaItem(VanillaItemId.CRIMSON_STANDING_SIGN)
          .build();
}
