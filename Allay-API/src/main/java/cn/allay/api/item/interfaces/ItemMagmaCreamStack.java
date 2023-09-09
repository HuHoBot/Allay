package cn.allay.api.item.interfaces;

import cn.allay.api.data.VanillaItemId;
import cn.allay.api.item.ItemStack;
import cn.allay.api.item.type.ItemType;
import cn.allay.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemMagmaCreamStack extends ItemStack {
    ItemType<ItemMagmaCreamStack> MAGMA_CREAM_TYPE = ItemTypeBuilder
            .builder(ItemMagmaCreamStack.class)
            .vanillaItem(VanillaItemId.MAGMA_CREAM)
            .build();
}
