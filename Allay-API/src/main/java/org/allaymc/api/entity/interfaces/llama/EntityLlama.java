package org.allaymc.api.entity.interfaces.llama;

import org.allaymc.api.data.VanillaEntityId;
import org.allaymc.api.entity.Entity;
import org.allaymc.api.entity.type.EntityType;
import org.allaymc.api.entity.type.EntityTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface EntityLlama extends Entity {
  EntityType<EntityLlama> LLAMA_TYPE = EntityTypeBuilder
          .builder(EntityLlama.class)
          .vanillaEntity(VanillaEntityId.LLAMA)
          .build();
}
