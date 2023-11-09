package org.allaymc.api.entity.interfaces.sheep;

import org.allaymc.api.data.VanillaEntityId;
import org.allaymc.api.entity.Entity;
import org.allaymc.api.entity.type.EntityType;
import org.allaymc.api.entity.type.EntityTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface EntitySheep extends Entity {
  EntityType<EntitySheep> SHEEP_TYPE = EntityTypeBuilder
          .builder(EntitySheep.class)
          .vanillaEntity(VanillaEntityId.SHEEP)
          .build();
}
