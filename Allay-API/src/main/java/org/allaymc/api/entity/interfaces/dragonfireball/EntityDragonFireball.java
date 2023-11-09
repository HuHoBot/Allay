package org.allaymc.api.entity.interfaces.dragonfireball;

import org.allaymc.api.data.VanillaEntityId;
import org.allaymc.api.entity.Entity;
import org.allaymc.api.entity.type.EntityType;
import org.allaymc.api.entity.type.EntityTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface EntityDragonFireball extends Entity {
  EntityType<EntityDragonFireball> DRAGON_FIREBALL_TYPE = EntityTypeBuilder
          .builder(EntityDragonFireball.class)
          .vanillaEntity(VanillaEntityId.DRAGON_FIREBALL)
          .build();
}
