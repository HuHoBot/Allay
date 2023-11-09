package org.allaymc.api.entity.interfaces.leashknot;

import org.allaymc.api.data.VanillaEntityId;
import org.allaymc.api.entity.Entity;
import org.allaymc.api.entity.type.EntityType;
import org.allaymc.api.entity.type.EntityTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface EntityLeashKnot extends Entity {
  EntityType<EntityLeashKnot> LEASH_KNOT_TYPE = EntityTypeBuilder
          .builder(EntityLeashKnot.class)
          .vanillaEntity(VanillaEntityId.LEASH_KNOT)
          .build();
}
