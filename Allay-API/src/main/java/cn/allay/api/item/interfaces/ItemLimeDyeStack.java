package cn.allay.api.item.interfaces;

import cn.allay.api.data.VanillaItemId;
import cn.allay.api.item.ItemStack;
import cn.allay.api.item.type.ItemType;
import cn.allay.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemLimeDyeStack extends ItemStack {
    ItemType<ItemLimeDyeStack> LIME_DYE_TYPE = ItemTypeBuilder
            .builder(ItemLimeDyeStack.class)
            .vanillaItem(VanillaItemId.LIME_DYE)
            .build();
}
