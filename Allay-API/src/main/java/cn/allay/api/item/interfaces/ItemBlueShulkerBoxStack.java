package cn.allay.api.item.interfaces;

import cn.allay.api.data.VanillaItemId;
import cn.allay.api.item.ItemStack;
import cn.allay.api.item.type.ItemType;
import cn.allay.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemBlueShulkerBoxStack extends ItemStack {
    ItemType<ItemBlueShulkerBoxStack> BLUE_SHULKER_BOX_TYPE = ItemTypeBuilder
            .builder(ItemBlueShulkerBoxStack.class)
            .vanillaItem(VanillaItemId.BLUE_SHULKER_BOX)
            .build();
}
