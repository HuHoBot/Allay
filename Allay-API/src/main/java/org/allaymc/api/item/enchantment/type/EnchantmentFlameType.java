package org.allaymc.api.item.enchantment.type;

import org.allaymc.api.identifier.Identifier;
import org.allaymc.api.item.enchantment.Rarity;
import org.allaymc.api.item.enchantment.AbstractEnchantmentType;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public class EnchantmentFlameType extends AbstractEnchantmentType {
    public static final EnchantmentFlameType FLAME_TYPE = new EnchantmentFlameType();
  private EnchantmentFlameType() {
    super(new Identifier("minecraft:flame"), 21, 1, Rarity.RARE);
  }
}
