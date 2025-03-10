package org.allaymc.server.block.impl;

import org.allaymc.api.block.interfaces.BlockPolishedBlackstoneBehavior;
import org.allaymc.api.component.interfaces.Component;
import org.allaymc.server.component.interfaces.ComponentProvider;

import java.util.List;

public class BlockPolishedBlackstoneBehaviorImpl extends BlockBehaviorImpl implements BlockPolishedBlackstoneBehavior {
    public BlockPolishedBlackstoneBehaviorImpl(
            List<ComponentProvider<? extends Component>> componentProviders) {
        super(componentProviders);
    }
}
