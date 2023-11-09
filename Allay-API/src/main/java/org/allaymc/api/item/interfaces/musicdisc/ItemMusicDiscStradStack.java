package org.allaymc.api.item.interfaces.musicdisc;

import org.allaymc.api.data.VanillaItemId;
import org.allaymc.api.item.ItemStack;
import org.allaymc.api.item.type.ItemType;
import org.allaymc.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemMusicDiscStradStack extends ItemStack {
  ItemType<ItemMusicDiscStradStack> MUSIC_DISC_STRAD_TYPE = ItemTypeBuilder
          .builder(ItemMusicDiscStradStack.class)
          .vanillaItem(VanillaItemId.MUSIC_DISC_STRAD)
          .build();
}
