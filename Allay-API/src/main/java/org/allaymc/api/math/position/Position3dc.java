package org.allaymc.api.math.position;

import org.allaymc.api.world.World;
import org.joml.Vector3dc;

/**
 * Allay Project 7/30/2023
 *
 * @author Cool_Loong
 */
public interface Position3dc extends Vector3dc {
    World world();
}
