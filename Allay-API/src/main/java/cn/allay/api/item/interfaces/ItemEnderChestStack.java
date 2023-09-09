package cn.allay.api.item.interfaces;

import cn.allay.api.data.VanillaItemId;
import cn.allay.api.item.ItemStack;
import cn.allay.api.item.type.ItemType;
import cn.allay.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemEnderChestStack extends ItemStack {
    ItemType<ItemEnderChestStack> ENDER_CHEST_TYPE = ItemTypeBuilder
            .builder(ItemEnderChestStack.class)
            .vanillaItem(VanillaItemId.ENDER_CHEST)
            .build();
}
