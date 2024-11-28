package org.allaymc.server.block.impl;

import org.allaymc.api.block.interfaces.BlockBlueIceBehavior;
import org.allaymc.api.component.interfaces.Component;
import org.allaymc.server.component.interfaces.ComponentProvider;

import java.util.List;

public class BlockBlueIceBehaviorImpl extends BlockBehaviorImpl implements BlockBlueIceBehavior {
    public BlockBlueIceBehaviorImpl(
            List<ComponentProvider<? extends Component>> componentProviders) {
        super(componentProviders);
    }
}
