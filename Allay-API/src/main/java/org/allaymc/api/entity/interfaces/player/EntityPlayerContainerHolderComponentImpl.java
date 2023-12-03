package org.allaymc.api.entity.interfaces.player;

import org.allaymc.api.component.annotation.ComponentedObject;
import org.allaymc.api.component.interfaces.ComponentInitInfo;
import org.allaymc.api.container.impl.*;
import org.allaymc.api.entity.component.container.EntityContainerHolderComponentImpl;

/**
 * Allay Project 2023/12/2
 *
 * @author daoge_cmd
 */
public class EntityPlayerContainerHolderComponentImpl extends EntityContainerHolderComponentImpl implements EntityPlayerContainerHolderComponent {

    @ComponentedObject
    private EntityPlayer player;

    public EntityPlayerContainerHolderComponentImpl() {
        super(new PlayerCursorContainer(),
                new PlayerCreatedOutputContainer(),
                new PlayerArmorContainer(),
                new PlayerOffhandContainer(),
                new CraftingGridContainer());
    }

    @Override
    public void onInitFinish(ComponentInitInfo initInfo) {
        addContainer(new PlayerInventoryContainer(player));
    }
}
