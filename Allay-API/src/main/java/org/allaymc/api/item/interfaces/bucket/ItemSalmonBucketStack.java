package org.allaymc.api.item.interfaces.bucket;

import org.allaymc.api.data.VanillaItemId;
import org.allaymc.api.item.ItemStack;
import org.allaymc.api.item.type.ItemType;
import org.allaymc.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemSalmonBucketStack extends ItemStack {
  ItemType<ItemSalmonBucketStack> SALMON_BUCKET_TYPE = ItemTypeBuilder
          .builder(ItemSalmonBucketStack.class)
          .vanillaItem(VanillaItemId.SALMON_BUCKET)
          .build();
}
