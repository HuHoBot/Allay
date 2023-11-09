package org.allaymc.api.item.interfaces;

import org.allaymc.api.data.VanillaItemId;
import org.allaymc.api.item.ItemStack;
import org.allaymc.api.item.type.ItemType;
import org.allaymc.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemPrismarineCrystalsStack extends ItemStack {
  ItemType<ItemPrismarineCrystalsStack> PRISMARINE_CRYSTALS_TYPE = ItemTypeBuilder
          .builder(ItemPrismarineCrystalsStack.class)
          .vanillaItem(VanillaItemId.PRISMARINE_CRYSTALS)
          .build();
}
