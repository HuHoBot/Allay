package org.allaymc.api.entity.interfaces.elderguardian;

import org.allaymc.api.data.VanillaEntityId;
import org.allaymc.api.entity.Entity;
import org.allaymc.api.entity.type.EntityType;
import org.allaymc.api.entity.type.EntityTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface EntityElderGuardian extends Entity {
  EntityType<EntityElderGuardian> ELDER_GUARDIAN_TYPE = EntityTypeBuilder
          .builder(EntityElderGuardian.class)
          .vanillaEntity(VanillaEntityId.ELDER_GUARDIAN)
          .build();
}
