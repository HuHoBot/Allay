package org.allaymc.api.entity.interfaces.mule;

import org.allaymc.api.data.VanillaEntityId;
import org.allaymc.api.entity.Entity;
import org.allaymc.api.entity.type.EntityType;
import org.allaymc.api.entity.type.EntityTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface EntityMule extends Entity {
  EntityType<EntityMule> MULE_TYPE = EntityTypeBuilder
          .builder(EntityMule.class)
          .vanillaEntity(VanillaEntityId.MULE)
          .build();
}
