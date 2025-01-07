package org.allaymc.server.blockentity.type;

import lombok.experimental.UtilityClass;
import org.allaymc.api.blockentity.data.BlockEntityId;
import org.allaymc.api.blockentity.type.BlockEntityTypes;
import org.allaymc.api.container.impl.*;
import org.allaymc.server.blockentity.component.*;
import org.allaymc.server.blockentity.component.furnace.BlockEntityBlastFurnaceBaseComponentImpl;
import org.allaymc.server.blockentity.component.furnace.BlockEntityFurnaceBaseComponentImpl;
import org.allaymc.server.blockentity.component.furnace.BlockEntitySmokerFurnaceBaseComponentImpl;
import org.allaymc.server.blockentity.component.shulkerbox.BlockEntityShulkerBoxBaseComponentImpl;
import org.allaymc.server.blockentity.component.shulkerbox.BlockEntityShulkerBoxContainerHolderComponentImpl;
import org.allaymc.server.blockentity.impl.*;

/**
 * @author daoge_cmd
 */
@SuppressWarnings("unused")
@UtilityClass
public final class BlockEntityTypeInitializer {
    public static void initJukebox() {
        BlockEntityTypes.JUKEBOX = AllayBlockEntityType
                .builder(BlockEntityJukeboxImpl.class)
                .name(BlockEntityId.JUKEBOX)
                .addComponent(BlockEntityJukeboxBaseComponentImpl::new, BlockEntityJukeboxBaseComponentImpl.class)
                .build();
    }

    public static void initBarrel() {
        BlockEntityTypes.BARREL = AllayBlockEntityType
                .builder(BlockEntityBarrelImpl.class)
                .name(BlockEntityId.BARREL)
                .addComponent(BlockEntityBarrelBaseComponentImpl::new, BlockEntityBarrelBaseComponentImpl.class)
                .addComponent(() -> new BlockEntityContainerHolderComponentImpl(BarrelContainer::new), BlockEntityContainerHolderComponentImpl.class)
                .build();
    }

    public static void initChest() {
        BlockEntityTypes.CHEST = AllayBlockEntityType
                .builder(BlockEntityChestImpl.class)
                .name(BlockEntityId.CHEST)
                .addComponent(BlockEntityChestBaseComponentImpl::new, BlockEntityChestBaseComponentImpl.class)
                .addComponent(() -> new BlockEntityContainerHolderComponentImpl(ChestContainer::new), BlockEntityContainerHolderComponentImpl.class)
                .build();
    }

    public static void initShulkerBox() {
        BlockEntityTypes.SHULKER_BOX = AllayBlockEntityType
                .builder(BlockEntityShulkerBoxImpl.class)
                .name(BlockEntityId.SHULKER_BOX)
                .addComponent(BlockEntityShulkerBoxBaseComponentImpl::new, BlockEntityShulkerBoxBaseComponentImpl.class)
                .addComponent(BlockEntityShulkerBoxContainerHolderComponentImpl::new, BlockEntityShulkerBoxContainerHolderComponentImpl.class)
                .build();
    }

    public static void initFurnace() {
        BlockEntityTypes.FURNACE = AllayBlockEntityType
                .builder(BlockEntityFurnaceImpl.class)
                .name(BlockEntityId.FURNACE)
                .addComponent(BlockEntityFurnaceBaseComponentImpl::new, BlockEntityFurnaceBaseComponentImpl.class)
                .addComponent(() -> new BlockEntityContainerHolderComponentImpl(FurnaceContainer::new), BlockEntityContainerHolderComponentImpl.class)
                .build();
        BlockEntityTypes.BLAST_FURNACE = AllayBlockEntityType
                .builder(BlockEntityFurnaceImpl.class)
                .name(BlockEntityId.BLAST_FURNACE)
                .addComponent(BlockEntityBlastFurnaceBaseComponentImpl::new, BlockEntityBlastFurnaceBaseComponentImpl.class)
                .addComponent(() -> new BlockEntityContainerHolderComponentImpl(BlastFurnaceContainer::new), BlockEntityContainerHolderComponentImpl.class)
                .build();
        BlockEntityTypes.SMOKER = AllayBlockEntityType
                .builder(BlockEntityFurnaceImpl.class)
                .name(BlockEntityId.SMOKER)
                .addComponent(BlockEntitySmokerFurnaceBaseComponentImpl::new, BlockEntitySmokerFurnaceBaseComponentImpl.class)
                .addComponent(() -> new BlockEntityContainerHolderComponentImpl(SmokerContainer::new), BlockEntityContainerHolderComponentImpl.class)
                .build();
    }

    public static void initSign() {
        BlockEntityTypes.SIGN = AllayBlockEntityType
                .builder(BlockEntitySignImpl.class)
                .name(BlockEntityId.SIGN)
                .addComponent(BlockEntitySignBaseComponentImpl::new, BlockEntitySignBaseComponentImpl.class)
                .build();
        BlockEntityTypes.HANGING_SIGN = AllayBlockEntityType
                .builder(BlockEntitySignImpl.class)
                .name(BlockEntityId.HANGING_SIGN)
                .addComponent(BlockEntitySignBaseComponentImpl::new, BlockEntitySignBaseComponentImpl.class)
                .build();
    }

    public static void initEnchantTable() {
        BlockEntityTypes.ENCHANT_TABLE = AllayBlockEntityType
                .builder(BlockEntityEnchantTableImpl.class)
                .name(BlockEntityId.ENCHANT_TABLE)
                .addComponent(BlockEntityEnchantTableBaseComponentImpl::new, BlockEntityEnchantTableBaseComponentImpl.class)
                .build();
    }

    public static void initBeacon() {
        BlockEntityTypes.BEACON = AllayBlockEntityType
                .builder(BlockEntityBeaconImpl.class)
                .name(BlockEntityId.BEACON)
                .addComponent(BlockEntityBeaconBaseComponentImpl::new, BlockEntityBeaconBaseComponentImpl.class)
                .build();
    }
}
