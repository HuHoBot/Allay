package cn.allay.api.item.interfaces;

import cn.allay.api.data.VanillaItemId;
import cn.allay.api.item.ItemStack;
import cn.allay.api.item.type.ItemType;
import cn.allay.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemGoldNuggetStack extends ItemStack {
    ItemType<ItemGoldNuggetStack> GOLD_NUGGET_TYPE = ItemTypeBuilder
            .builder(ItemGoldNuggetStack.class)
            .vanillaItem(VanillaItemId.GOLD_NUGGET)
            .build();
}
