package org.allaymc.api.entity.interfaces.xporb;

import org.allaymc.api.data.VanillaEntityId;
import org.allaymc.api.entity.Entity;
import org.allaymc.api.entity.type.EntityType;
import org.allaymc.api.entity.type.EntityTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface EntityXpOrb extends Entity {
  EntityType<EntityXpOrb> XP_ORB_TYPE = EntityTypeBuilder
          .builder(EntityXpOrb.class)
          .vanillaEntity(VanillaEntityId.XP_ORB)
          .build();
}
