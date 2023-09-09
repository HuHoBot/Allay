package cn.allay.api.item.interfaces;

import cn.allay.api.data.VanillaItemId;
import cn.allay.api.item.ItemStack;
import cn.allay.api.item.type.ItemType;
import cn.allay.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemHeartPotterySherdStack extends ItemStack {
    ItemType<ItemHeartPotterySherdStack> HEART_POTTERY_SHERD_TYPE = ItemTypeBuilder
            .builder(ItemHeartPotterySherdStack.class)
            .vanillaItem(VanillaItemId.HEART_POTTERY_SHERD)
            .build();
}
