package org.allaymc.api.entity.interfaces.allay;

import org.allaymc.api.data.VanillaEntityId;
import org.allaymc.api.entity.Entity;
import org.allaymc.api.entity.type.EntityType;
import org.allaymc.api.entity.type.EntityTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface EntityAllay extends Entity {
  EntityType<EntityAllay> ALLAY_TYPE = EntityTypeBuilder
          .builder(EntityAllay.class)
          .vanillaEntity(VanillaEntityId.ALLAY)
          .build();
}
