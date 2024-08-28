package org.allaymc.api.world.generator.function;

import org.allaymc.api.world.generator.context.LightContext;

/**
 * Allay Project 2024/6/16
 *
 * @author daoge_cmd
 */
public interface Lighter extends GenerateFunction {
    boolean apply(LightContext lightContext);
}
