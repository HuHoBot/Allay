package cn.allay.api.item.interfaces;

import cn.allay.api.data.VanillaItemId;
import cn.allay.api.item.ItemStack;
import cn.allay.api.item.type.ItemType;
import cn.allay.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemHayBlockStack extends ItemStack {
    ItemType<ItemHayBlockStack> HAY_BLOCK_TYPE = ItemTypeBuilder
            .builder(ItemHayBlockStack.class)
            .vanillaItem(VanillaItemId.HAY_BLOCK)
            .build();
}
