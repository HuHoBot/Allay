package org.allaymc.api.item.interfaces.slab;

import org.allaymc.api.data.VanillaItemId;
import org.allaymc.api.item.ItemStack;
import org.allaymc.api.item.type.ItemType;
import org.allaymc.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemDeepslateTileSlabStack extends ItemStack {
  ItemType<ItemDeepslateTileSlabStack> DEEPSLATE_TILE_SLAB_TYPE = ItemTypeBuilder
          .builder(ItemDeepslateTileSlabStack.class)
          .vanillaItem(VanillaItemId.DEEPSLATE_TILE_SLAB)
          .build();
}
