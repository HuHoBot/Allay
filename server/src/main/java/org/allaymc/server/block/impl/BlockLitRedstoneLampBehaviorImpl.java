package org.allaymc.server.block.impl;

import org.allaymc.api.block.interfaces.BlockLitRedstoneLampBehavior;
import org.allaymc.api.component.interfaces.Component;
import org.allaymc.server.component.interfaces.ComponentProvider;

import java.util.List;

public class BlockLitRedstoneLampBehaviorImpl extends BlockBehaviorImpl implements BlockLitRedstoneLampBehavior {
    public BlockLitRedstoneLampBehaviorImpl(
            List<ComponentProvider<? extends Component>> componentProviders) {
        super(componentProviders);
    }
}
