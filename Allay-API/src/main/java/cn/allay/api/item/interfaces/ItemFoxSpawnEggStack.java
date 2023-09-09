package cn.allay.api.item.interfaces;

import cn.allay.api.data.VanillaItemId;
import cn.allay.api.item.ItemStack;
import cn.allay.api.item.type.ItemType;
import cn.allay.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemFoxSpawnEggStack extends ItemStack {
    ItemType<ItemFoxSpawnEggStack> FOX_SPAWN_EGG_TYPE = ItemTypeBuilder
            .builder(ItemFoxSpawnEggStack.class)
            .vanillaItem(VanillaItemId.FOX_SPAWN_EGG)
            .build();
}
