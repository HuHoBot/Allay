package org.allaymc.api.item.enchantment.type;

import org.allaymc.api.identifier.Identifier;
import org.allaymc.api.item.enchantment.Rarity;
import org.allaymc.api.item.enchantment.AbstractEnchantmentType;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public class EnchantmentLureType extends AbstractEnchantmentType {
    public static final EnchantmentLureType LURE_TYPE = new EnchantmentLureType();
  private EnchantmentLureType() {
    super(new Identifier("minecraft:lure"), 24, 3, Rarity.RARE);
  }
}
