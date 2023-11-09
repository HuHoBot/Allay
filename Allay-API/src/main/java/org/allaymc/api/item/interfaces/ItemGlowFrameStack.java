package org.allaymc.api.item.interfaces;

import org.allaymc.api.data.VanillaItemId;
import org.allaymc.api.item.ItemStack;
import org.allaymc.api.item.type.ItemType;
import org.allaymc.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemGlowFrameStack extends ItemStack {
  ItemType<ItemGlowFrameStack> GLOW_FRAME_TYPE = ItemTypeBuilder
          .builder(ItemGlowFrameStack.class)
          .vanillaItem(VanillaItemId.GLOW_FRAME)
          .build();
}
