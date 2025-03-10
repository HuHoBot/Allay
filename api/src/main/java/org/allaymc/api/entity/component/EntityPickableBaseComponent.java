package org.allaymc.api.entity.component;

/**
 * @author IWareQ
 */
public interface EntityPickableBaseComponent extends EntityBaseComponent {
    /**
     * Get the pickup delay of this entity item.
     *
     * @return the pickup delay.
     */
    int getPickupDelay();

    /**
     * Set the pickup delay of this entity item.
     *
     * @param delay the pickup delay.
     */
    void setPickupDelay(int delay);

    /**
     * Get the age of this entity item.
     *
     * @return the age.
     */
    int getAge();

    /**
     * Set the age of this entity item.
     *
     * @param age the age.
     */
    void setAge(int age);

    /**
     * Check if this entity item can be picked up.
     *
     * @return {@code true} if the pickup delay is 0, {@code false} otherwise.
     */
    default boolean canBePicked() {
        return getPickupDelay() == 0;
    }
}
