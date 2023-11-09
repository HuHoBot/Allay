package org.allaymc.api.entity.interfaces.fishinghook;

import org.allaymc.api.data.VanillaEntityId;
import org.allaymc.api.entity.Entity;
import org.allaymc.api.entity.type.EntityType;
import org.allaymc.api.entity.type.EntityTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface EntityFishingHook extends Entity {
  EntityType<EntityFishingHook> FISHING_HOOK_TYPE = EntityTypeBuilder
          .builder(EntityFishingHook.class)
          .vanillaEntity(VanillaEntityId.FISHING_HOOK)
          .build();
}
