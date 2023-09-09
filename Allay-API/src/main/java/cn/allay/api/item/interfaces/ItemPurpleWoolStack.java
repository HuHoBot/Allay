package cn.allay.api.item.interfaces;

import cn.allay.api.data.VanillaItemId;
import cn.allay.api.item.ItemStack;
import cn.allay.api.item.type.ItemType;
import cn.allay.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemPurpleWoolStack extends ItemStack {
    ItemType<ItemPurpleWoolStack> PURPLE_WOOL_TYPE = ItemTypeBuilder
            .builder(ItemPurpleWoolStack.class)
            .vanillaItem(VanillaItemId.PURPLE_WOOL)
            .build();
}
