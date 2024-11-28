package org.allaymc.server.block.impl;

import org.allaymc.api.block.interfaces.BlockStonePressurePlateBehavior;
import org.allaymc.api.component.interfaces.Component;
import org.allaymc.server.component.interfaces.ComponentProvider;

import java.util.List;

public class BlockStonePressurePlateBehaviorImpl extends BlockBehaviorImpl implements BlockStonePressurePlateBehavior {
    public BlockStonePressurePlateBehaviorImpl(
            List<ComponentProvider<? extends Component>> componentProviders) {
        super(componentProviders);
    }
}
