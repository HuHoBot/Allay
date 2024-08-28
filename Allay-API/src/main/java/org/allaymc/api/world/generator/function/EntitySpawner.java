package org.allaymc.api.world.generator.function;

import org.allaymc.api.world.generator.context.EntitySpawnContext;

/**
 * Allay Project 2024/6/16
 *
 * @author daoge_cmd
 */
public interface EntitySpawner extends GenerateFunction {
    boolean apply(EntitySpawnContext entitySpawnContext);
}
