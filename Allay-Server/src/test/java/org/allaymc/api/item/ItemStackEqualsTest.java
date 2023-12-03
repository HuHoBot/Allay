package org.allaymc.api.item;

import org.allaymc.api.item.interfaces.ItemAirStack;
import org.allaymc.testutils.AllayTestExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * Allay Project 2023/12/1
 *
 * @author daoge_cmd
 */
@ExtendWith(AllayTestExtension.class)
public class ItemStackEqualsTest {

    /**
     * ItemStack.equals() should not be overridden.
     */
    @Test
    void testEquals() {
        ItemStack i1 = ItemAirStack.AIR_TYPE.createItemStack();
        ItemStack i2 = ItemAirStack.AIR_TYPE.createItemStack();

        assertNotEquals(i1, i2);
    }
}
