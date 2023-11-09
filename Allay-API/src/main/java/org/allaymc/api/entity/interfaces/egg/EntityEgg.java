package org.allaymc.api.entity.interfaces.egg;

import org.allaymc.api.data.VanillaEntityId;
import org.allaymc.api.entity.Entity;
import org.allaymc.api.entity.type.EntityType;
import org.allaymc.api.entity.type.EntityTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface EntityEgg extends Entity {
  EntityType<EntityEgg> EGG_TYPE = EntityTypeBuilder
          .builder(EntityEgg.class)
          .vanillaEntity(VanillaEntityId.EGG)
          .build();
}
