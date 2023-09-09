package cn.allay.api.item.interfaces;

import cn.allay.api.data.VanillaItemId;
import cn.allay.api.item.ItemStack;
import cn.allay.api.item.type.ItemType;
import cn.allay.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemMagmaCubeSpawnEggStack extends ItemStack {
    ItemType<ItemMagmaCubeSpawnEggStack> MAGMA_CUBE_SPAWN_EGG_TYPE = ItemTypeBuilder
            .builder(ItemMagmaCubeSpawnEggStack.class)
            .vanillaItem(VanillaItemId.MAGMA_CUBE_SPAWN_EGG)
            .build();
}
