package cn.allay.api.item.interfaces;

import cn.allay.api.component.interfaces.ComponentProvider;
import cn.allay.api.data.VanillaItemId;
import cn.allay.api.item.CommonUseItemFunctions;
import cn.allay.api.item.ItemStack;
import cn.allay.api.item.component.base.ItemBaseComponentImpl;
import cn.allay.api.item.type.ItemStackInitInfo;
import cn.allay.api.item.type.ItemType;
import cn.allay.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemBambooMosaicStairsStack extends ItemStack {
    ItemType<ItemBambooMosaicStairsStack> BAMBOO_MOSAIC_STAIRS_TYPE = ItemTypeBuilder
            .builder(ItemBambooMosaicStairsStack.class)
            .vanillaItem(VanillaItemId.BAMBOO_MOSAIC_STAIRS)
            .addComponent(ComponentProvider.of(initInfo -> new ItemBaseComponentImpl<>((ItemStackInitInfo<?>) initInfo, CommonUseItemFunctions.ITEM_STAIR_USE_ON), ItemBaseComponentImpl.class))
            .build();
}
