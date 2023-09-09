package cn.allay.api.entity.interfaces;

import cn.allay.api.data.VanillaEntityId;
import cn.allay.api.entity.Entity;
import cn.allay.api.entity.type.EntityType;
import cn.allay.api.entity.type.EntityTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface EntityChicken extends Entity {
  EntityType<EntityChicken> CHICKEN_TYPE = EntityTypeBuilder
          .builder(EntityChicken.class)
          .vanillaEntity(VanillaEntityId.CHICKEN)
          .build();
}
