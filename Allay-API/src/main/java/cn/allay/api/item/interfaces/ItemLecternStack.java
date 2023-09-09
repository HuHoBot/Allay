package cn.allay.api.item.interfaces;

import cn.allay.api.data.VanillaItemId;
import cn.allay.api.item.ItemStack;
import cn.allay.api.item.type.ItemType;
import cn.allay.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemLecternStack extends ItemStack {
    ItemType<ItemLecternStack> LECTERN_TYPE = ItemTypeBuilder
            .builder(ItemLecternStack.class)
            .vanillaItem(VanillaItemId.LECTERN)
            .build();
}
