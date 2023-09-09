package cn.allay.api.item.interfaces;

import cn.allay.api.data.VanillaItemId;
import cn.allay.api.item.ItemStack;
import cn.allay.api.item.type.ItemType;
import cn.allay.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemLightGrayDyeStack extends ItemStack {
    ItemType<ItemLightGrayDyeStack> LIGHT_GRAY_DYE_TYPE = ItemTypeBuilder
            .builder(ItemLightGrayDyeStack.class)
            .vanillaItem(VanillaItemId.LIGHT_GRAY_DYE)
            .build();
}
