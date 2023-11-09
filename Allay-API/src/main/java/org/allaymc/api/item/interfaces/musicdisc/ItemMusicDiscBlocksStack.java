package org.allaymc.api.item.interfaces.musicdisc;

import org.allaymc.api.data.VanillaItemId;
import org.allaymc.api.item.ItemStack;
import org.allaymc.api.item.type.ItemType;
import org.allaymc.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemMusicDiscBlocksStack extends ItemStack {
  ItemType<ItemMusicDiscBlocksStack> MUSIC_DISC_BLOCKS_TYPE = ItemTypeBuilder
          .builder(ItemMusicDiscBlocksStack.class)
          .vanillaItem(VanillaItemId.MUSIC_DISC_BLOCKS)
          .build();
}
