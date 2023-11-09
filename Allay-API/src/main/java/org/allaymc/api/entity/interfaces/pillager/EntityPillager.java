package org.allaymc.api.entity.interfaces.pillager;

import org.allaymc.api.data.VanillaEntityId;
import org.allaymc.api.entity.Entity;
import org.allaymc.api.entity.type.EntityType;
import org.allaymc.api.entity.type.EntityTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface EntityPillager extends Entity {
  EntityType<EntityPillager> PILLAGER_TYPE = EntityTypeBuilder
          .builder(EntityPillager.class)
          .vanillaEntity(VanillaEntityId.PILLAGER)
          .build();
}
