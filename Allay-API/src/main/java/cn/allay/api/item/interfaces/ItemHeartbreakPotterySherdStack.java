package cn.allay.api.item.interfaces;

import cn.allay.api.data.VanillaItemId;
import cn.allay.api.item.ItemStack;
import cn.allay.api.item.type.ItemType;
import cn.allay.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemHeartbreakPotterySherdStack extends ItemStack {
    ItemType<ItemHeartbreakPotterySherdStack> HEARTBREAK_POTTERY_SHERD_TYPE = ItemTypeBuilder
            .builder(ItemHeartbreakPotterySherdStack.class)
            .vanillaItem(VanillaItemId.HEARTBREAK_POTTERY_SHERD)
            .build();
}
