package cn.allay.api.item.interfaces;

import cn.allay.api.data.VanillaItemId;
import cn.allay.api.item.ItemStack;
import cn.allay.api.item.type.ItemType;
import cn.allay.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemBambooRaftStack extends ItemStack {
    ItemType<ItemBambooRaftStack> BAMBOO_RAFT_TYPE = ItemTypeBuilder
            .builder(ItemBambooRaftStack.class)
            .vanillaItem(VanillaItemId.BAMBOO_RAFT)
            .build();
}
