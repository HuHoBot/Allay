package org.allaymc.api.data;

import org.allaymc.api.block.tag.BlockTag;

import java.util.HashMap;
import java.util.Map;

/**
 * Automatically generated by {@code org.allaymc.codegen.VanillaBlockTagGen} <br>
 * Allay Project <p>
 *
 * @author daoge_cmd
 */
public interface VanillaBlockTags {
    Map<String, BlockTag> NAME_TO_TAG = new HashMap<>();

    BlockTag CROP = create("minecraft:crop");

    BlockTag FERTILIZE_AREA = create("minecraft:fertilize_area");

    BlockTag MOB_SPAWNER = create("minecraft:mob_spawner");

    BlockTag DIRT = create("minecraft:dirt");

    BlockTag DIAMOND_PICK_DIGGABLE = create("minecraft:diamond_pick_diggable");

    BlockTag GRAVEL = create("minecraft:gravel");

    BlockTag WATER = create("minecraft:water");

    BlockTag GRASS = create("minecraft:grass");

    BlockTag BIRCH = create("minecraft:birch");

    BlockTag JUNGLE = create("minecraft:jungle");

    BlockTag ACACIA = create("minecraft:acacia");

    BlockTag DARK_OAK = create("minecraft:dark_oak");

    BlockTag LOG = create("minecraft:log");

    BlockTag WOOD = create("minecraft:wood");

    BlockTag TEXT_SIGN = create("minecraft:text_sign");

    BlockTag PLANT = create("minecraft:plant");

    BlockTag IRON_PICK_DIGGABLE = create("minecraft:iron_pick_diggable");

    BlockTag PUMPKIN = create("minecraft:pumpkin");

    BlockTag SPRUCE = create("minecraft:spruce");

    BlockTag OAK = create("minecraft:oak");

    BlockTag STONE = create("minecraft:stone");

    BlockTag SAND = create("minecraft:sand");

    BlockTag SNOW = create("minecraft:snow");

    BlockTag METAL = create("minecraft:metal");

    BlockTag REPLACEABLE = create("minecraft:replaceable");

    BlockTag NOT_FEATURE_REPLACEABLE = create("minecraft:not_feature_replaceable");

    BlockTag TRAPDOORS = create("minecraft:trapdoors");

    BlockTag STONE_PICK_DIGGABLE = create("minecraft:stone_pick_diggable");

    BlockTag RAIL = create("minecraft:rail");

    static BlockTag create(String name) {
        var tag = new BlockTag(name);
        NAME_TO_TAG.put(name, tag);
        return tag;
    }

    static BlockTag getTagByName(String name) {
        return NAME_TO_TAG.get(name);
    }
}
