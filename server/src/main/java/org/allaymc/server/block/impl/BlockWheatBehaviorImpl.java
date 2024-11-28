package org.allaymc.server.block.impl;

import org.allaymc.api.block.interfaces.BlockWheatBehavior;
import org.allaymc.api.component.interfaces.Component;
import org.allaymc.server.component.interfaces.ComponentProvider;

import java.util.List;

public class BlockWheatBehaviorImpl extends BlockBehaviorImpl implements BlockWheatBehavior {
    public BlockWheatBehaviorImpl(List<ComponentProvider<? extends Component>> componentProviders) {
        super(componentProviders);
    }
}
