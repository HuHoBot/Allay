package org.allaymc.api.blockentity.component;

import org.allaymc.api.container.Container;
import org.allaymc.api.container.ContainerHolder;
import org.allaymc.api.container.FullContainerType;
import org.jetbrains.annotations.UnmodifiableView;

import java.util.Map;

/**
 * @author daoge_cmd
 */
public interface BlockEntityContainerHolderComponent extends ContainerHolder, BlockEntityComponent {
    @Override
    @UnmodifiableView
    default Map<FullContainerType<?>, Container> getContainers() {
        Container container = getContainer();
        return Map.of(container.getContainerType(), container);
    }

    @Override
    default <T extends Container> T getContainer(FullContainerType<T> type) {
        return getContainer();
    }

    @Override
    default void addContainer(Container container) {
        setContainer(container);
    }

    /**
     * Gets the container.
     *
     * @param <T> the type of the container
     *
     * @return the container
     */
    <T extends Container> T getContainer();

    /**
     * Sets the container.
     *
     * @param container the container to set
     */
    void setContainer(Container container);
}
