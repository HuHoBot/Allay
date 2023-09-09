package cn.allay.api.item.interfaces;

import cn.allay.api.data.VanillaItemId;
import cn.allay.api.item.ItemStack;
import cn.allay.api.item.type.ItemType;
import cn.allay.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemSnifferEggStack extends ItemStack {
    ItemType<ItemSnifferEggStack> SNIFFER_EGG_TYPE = ItemTypeBuilder
            .builder(ItemSnifferEggStack.class)
            .vanillaItem(VanillaItemId.SNIFFER_EGG)
            .build();
}
