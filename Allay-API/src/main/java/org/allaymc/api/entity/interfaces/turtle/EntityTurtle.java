package org.allaymc.api.entity.interfaces.turtle;

import org.allaymc.api.data.VanillaEntityId;
import org.allaymc.api.entity.Entity;
import org.allaymc.api.entity.type.EntityType;
import org.allaymc.api.entity.type.EntityTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface EntityTurtle extends Entity {
  EntityType<EntityTurtle> TURTLE_TYPE = EntityTypeBuilder
          .builder(EntityTurtle.class)
          .vanillaEntity(VanillaEntityId.TURTLE)
          .build();
}
