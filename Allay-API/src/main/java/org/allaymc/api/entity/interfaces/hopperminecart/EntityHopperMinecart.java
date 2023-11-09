package org.allaymc.api.entity.interfaces.hopperminecart;

import org.allaymc.api.data.VanillaEntityId;
import org.allaymc.api.entity.Entity;
import org.allaymc.api.entity.type.EntityType;
import org.allaymc.api.entity.type.EntityTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface EntityHopperMinecart extends Entity {
  EntityType<EntityHopperMinecart> HOPPER_MINECART_TYPE = EntityTypeBuilder
          .builder(EntityHopperMinecart.class)
          .vanillaEntity(VanillaEntityId.HOPPER_MINECART)
          .build();
}
