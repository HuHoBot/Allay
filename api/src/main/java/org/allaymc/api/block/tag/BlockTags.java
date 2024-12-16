package org.allaymc.api.block.tag;

import java.util.HashMap;
import java.util.Map;

/**
 * Automatically generated by {@code org.allaymc.codegen.TagGen}
 */
public interface BlockTags {
    Map<String, BlockTag> NAME_TO_TAG = new HashMap<>();

    BlockTag CROP = create("minecraft:crop");

    BlockTag FERTILIZE_AREA = create("minecraft:fertilize_area");

    BlockTag MOB_SPAWNER = create("minecraft:mob_spawner");

    BlockTag DIAMOND_TIER_DESTRUCTIBLE = create("minecraft:diamond_tier_destructible");

    BlockTag IS_SHEARS_ITEM_DESTRUCTIBLE = create("minecraft:is_shears_item_destructible");

    BlockTag DIRT = create("minecraft:dirt");

    BlockTag IRON_TIER_DESTRUCTIBLE = create("minecraft:iron_tier_destructible");

    BlockTag DIAMOND_PICK_DIGGABLE = create("minecraft:diamond_pick_diggable");

    BlockTag GRAVEL = create("minecraft:gravel");

    BlockTag ONE_WAY_COLLIDABLE = create("minecraft:one_way_collidable");

    BlockTag WATER = create("minecraft:water");

    BlockTag GRASS = create("minecraft:grass");

    BlockTag BIRCH = create("minecraft:birch");

    BlockTag JUNGLE = create("minecraft:jungle");

    BlockTag ACACIA = create("minecraft:acacia");

    BlockTag DARK_OAK = create("minecraft:dark_oak");

    BlockTag LOG = create("minecraft:log");

    BlockTag IS_SWORD_ITEM_DESTRUCTIBLE = create("minecraft:is_sword_item_destructible");

    BlockTag WOOD = create("minecraft:wood");

    BlockTag TEXT_SIGN = create("minecraft:text_sign");

    BlockTag IS_AXE_ITEM_DESTRUCTIBLE = create("minecraft:is_axe_item_destructible");

    BlockTag PLANT = create("minecraft:plant");

    BlockTag IRON_PICK_DIGGABLE = create("minecraft:iron_pick_diggable");

    BlockTag PUMPKIN = create("minecraft:pumpkin");

    BlockTag SPRUCE = create("minecraft:spruce");

    BlockTag OAK = create("minecraft:oak");

    BlockTag WOOL = create("minecraft:wool");

    BlockTag IS_SHOVEL_ITEM_DESTRUCTIBLE = create("minecraft:is_shovel_item_destructible");

    BlockTag STONE = create("minecraft:stone");

    BlockTag SAND = create("minecraft:sand");

    BlockTag STONE_TIER_DESTRUCTIBLE = create("minecraft:stone_tier_destructible");

    BlockTag SNOW = create("minecraft:snow");

    BlockTag METAL = create("minecraft:metal");

    BlockTag REPLACEABLE = create("minecraft:replaceable");

    BlockTag IS_PICKAXE_ITEM_DESTRUCTIBLE = create("minecraft:is_pickaxe_item_destructible");

    BlockTag NOT_FEATURE_REPLACEABLE = create("minecraft:not_feature_replaceable");

    BlockTag TRAPDOORS = create("minecraft:trapdoors");

    BlockTag STONE_PICK_DIGGABLE = create("minecraft:stone_pick_diggable");

    BlockTag IS_HOE_ITEM_DESTRUCTIBLE = create("minecraft:is_hoe_item_destructible");

    BlockTag LEAVES = create("minecraft:leaves");

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
