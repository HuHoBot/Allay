package org.allaymc.api.block.interfaces;

import org.allaymc.api.block.BlockBehavior;
import org.allaymc.api.block.component.BlockEntityHolderComponent;
import org.allaymc.api.blockentity.interfaces.BlockEntityShulkerBox;

public interface BlockShulkerBoxBehavior extends BlockBehavior,
        BlockEntityHolderComponent<BlockEntityShulkerBox> {
}
