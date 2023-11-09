package org.allaymc.api.item.enchantment.type;

import org.allaymc.api.identifier.Identifier;
import org.allaymc.api.item.enchantment.Rarity;
import org.allaymc.api.item.enchantment.AbstractEnchantmentType;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public class EnchantmentPunchType extends AbstractEnchantmentType {
    public static final EnchantmentPunchType PUNCH_TYPE = new EnchantmentPunchType();
  private EnchantmentPunchType() {
    super(new Identifier("minecraft:punch"), 20, 2, Rarity.RARE);
  }
}
