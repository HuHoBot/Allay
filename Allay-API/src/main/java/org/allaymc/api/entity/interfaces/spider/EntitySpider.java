package org.allaymc.api.entity.interfaces.spider;

import org.allaymc.api.data.VanillaEntityId;
import org.allaymc.api.entity.Entity;
import org.allaymc.api.entity.type.EntityType;
import org.allaymc.api.entity.type.EntityTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface EntitySpider extends Entity {
  EntityType<EntitySpider> SPIDER_TYPE = EntityTypeBuilder
          .builder(EntitySpider.class)
          .vanillaEntity(VanillaEntityId.SPIDER)
          .build();
}
