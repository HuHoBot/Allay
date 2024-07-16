package org.allaymc.api.item.type;

import org.allaymc.api.item.interfaces.*;
import org.allaymc.api.item.interfaces.axe.*;
import org.allaymc.api.item.interfaces.boat.*;
import org.allaymc.api.item.interfaces.boots.*;
import org.allaymc.api.item.interfaces.bricks.*;
import org.allaymc.api.item.interfaces.bucket.*;
import org.allaymc.api.item.interfaces.button.*;
import org.allaymc.api.item.interfaces.candle.*;
import org.allaymc.api.item.interfaces.candlecake.*;
import org.allaymc.api.item.interfaces.carpet.*;
import org.allaymc.api.item.interfaces.chestplate.*;
import org.allaymc.api.item.interfaces.concrete.*;
import org.allaymc.api.item.interfaces.concretepowder.ItemConcretePowderStack;
import org.allaymc.api.item.interfaces.concretepowder.*;
import org.allaymc.api.item.interfaces.copper.*;
import org.allaymc.api.item.interfaces.coral.*;
import org.allaymc.api.item.interfaces.coralblock.ItemBrainCoralBlockStack;
import org.allaymc.api.item.interfaces.coralblock.ItemBubbleCoralBlockStack;
import org.allaymc.api.item.interfaces.coralblock.ItemCoralBlockStack;
import org.allaymc.api.item.interfaces.coralblock.ItemDeadBrainCoralBlockStack;
import org.allaymc.api.item.interfaces.coralblock.ItemDeadBubbleCoralBlockStack;
import org.allaymc.api.item.interfaces.coralblock.ItemDeadFireCoralBlockStack;
import org.allaymc.api.item.interfaces.coralblock.ItemDeadHornCoralBlockStack;
import org.allaymc.api.item.interfaces.coralblock.ItemDeadTubeCoralBlockStack;
import org.allaymc.api.item.interfaces.coralblock.ItemFireCoralBlockStack;
import org.allaymc.api.item.interfaces.coralblock.ItemHornCoralBlockStack;
import org.allaymc.api.item.interfaces.coralblock.*;
import org.allaymc.api.item.interfaces.coralfan.*;
import org.allaymc.api.item.interfaces.door.*;
import org.allaymc.api.item.interfaces.egg.*;
import org.allaymc.api.item.interfaces.element.*;
import org.allaymc.api.item.interfaces.fence.*;
import org.allaymc.api.item.interfaces.fencegate.*;
import org.allaymc.api.item.interfaces.glass.ItemGlassStack;
import org.allaymc.api.item.interfaces.glass.ItemHardGlassStack;
import org.allaymc.api.item.interfaces.glass.ItemTintedGlassStack;
import org.allaymc.api.item.interfaces.glasspane.ItemGlassPaneStack;
import org.allaymc.api.item.interfaces.glasspane.ItemHardGlassPaneStack;
import org.allaymc.api.item.interfaces.hangingsign.*;
import org.allaymc.api.item.interfaces.helmet.*;
import org.allaymc.api.item.interfaces.hoe.*;
import org.allaymc.api.item.interfaces.leaves.*;
import org.allaymc.api.item.interfaces.leggings.*;
import org.allaymc.api.item.interfaces.liquid.ItemFlowingLavaStack;
import org.allaymc.api.item.interfaces.liquid.ItemFlowingWaterStack;
import org.allaymc.api.item.interfaces.liquid.ItemLavaStack;
import org.allaymc.api.item.interfaces.liquid.ItemWaterStack;
import org.allaymc.api.item.interfaces.log.*;
import org.allaymc.api.item.interfaces.minecart.*;
import org.allaymc.api.item.interfaces.musicdisc.*;
import org.allaymc.api.item.interfaces.pickaxe.*;
import org.allaymc.api.item.interfaces.piston.ItemPistonArmCollisionStack;
import org.allaymc.api.item.interfaces.piston.ItemPistonStack;
import org.allaymc.api.item.interfaces.piston.ItemStickyPistonArmCollisionStack;
import org.allaymc.api.item.interfaces.piston.ItemStickyPistonStack;
import org.allaymc.api.item.interfaces.planks.*;
import org.allaymc.api.item.interfaces.sapling.*;
import org.allaymc.api.item.interfaces.shovel.*;
import org.allaymc.api.item.interfaces.shulkerbox.*;
import org.allaymc.api.item.interfaces.sign.*;
import org.allaymc.api.item.interfaces.slab.*;
import org.allaymc.api.item.interfaces.stainedglass.*;
import org.allaymc.api.item.interfaces.stainedglasspane.*;
import org.allaymc.api.item.interfaces.stairs.*;
import org.allaymc.api.item.interfaces.standingsign.*;
import org.allaymc.api.item.interfaces.sword.*;
import org.allaymc.api.item.interfaces.terracotta.*;
import org.allaymc.api.item.interfaces.trapdoor.*;
import org.allaymc.api.item.interfaces.wall.*;
import org.allaymc.api.item.interfaces.wallsign.*;
import org.allaymc.api.item.interfaces.wood.*;
import org.allaymc.api.item.interfaces.wool.*;

public final class ItemTypes {
    public static ItemType<ItemAcaciaBoatStack> ACACIA_BOAT;

    public static ItemType<ItemAcaciaButtonStack> ACACIA_BUTTON;

    public static ItemType<ItemAcaciaChestBoatStack> ACACIA_CHEST_BOAT;

    public static ItemType<ItemAcaciaDoorStack> ACACIA_DOOR;

    public static ItemType<ItemAcaciaDoubleSlabStack> ACACIA_DOUBLE_SLAB;

    public static ItemType<ItemAcaciaFenceStack> ACACIA_FENCE;

    public static ItemType<ItemAcaciaFenceGateStack> ACACIA_FENCE_GATE;

    public static ItemType<ItemAcaciaHangingSignStack> ACACIA_HANGING_SIGN;

    public static ItemType<ItemAcaciaLeavesStack> ACACIA_LEAVES;

    public static ItemType<ItemAcaciaLogStack> ACACIA_LOG;

    public static ItemType<ItemAcaciaPlanksStack> ACACIA_PLANKS;

    public static ItemType<ItemAcaciaPressurePlateStack> ACACIA_PRESSURE_PLATE;

    public static ItemType<ItemAcaciaSaplingStack> ACACIA_SAPLING;

    public static ItemType<ItemAcaciaSignStack> ACACIA_SIGN;

    public static ItemType<ItemAcaciaSlabStack> ACACIA_SLAB;

    public static ItemType<ItemAcaciaStairsStack> ACACIA_STAIRS;

    public static ItemType<ItemAcaciaStandingSignStack> ACACIA_STANDING_SIGN;

    public static ItemType<ItemAcaciaTrapdoorStack> ACACIA_TRAPDOOR;

    public static ItemType<ItemAcaciaWallSignStack> ACACIA_WALL_SIGN;

    public static ItemType<ItemAcaciaWoodStack> ACACIA_WOOD;

    public static ItemType<ItemActivatorRailStack> ACTIVATOR_RAIL;

    public static ItemType<ItemAgentSpawnEggStack> AGENT_SPAWN_EGG;

    public static ItemType<ItemAirStack> AIR;

    public static ItemType<ItemAllaySpawnEggStack> ALLAY_SPAWN_EGG;

    public static ItemType<ItemAlliumStack> ALLIUM;

    public static ItemType<ItemAllowStack> ALLOW;

    public static ItemType<ItemAmethystBlockStack> AMETHYST_BLOCK;

    public static ItemType<ItemAmethystClusterStack> AMETHYST_CLUSTER;

    public static ItemType<ItemAmethystShardStack> AMETHYST_SHARD;

    public static ItemType<ItemAncientDebrisStack> ANCIENT_DEBRIS;

    public static ItemType<ItemAndesiteStack> ANDESITE;

    public static ItemType<ItemAndesiteStairsStack> ANDESITE_STAIRS;

    public static ItemType<ItemAnglerPotterySherdStack> ANGLER_POTTERY_SHERD;

    public static ItemType<ItemAnvilStack> ANVIL;

    public static ItemType<ItemAppleStack> APPLE;

    public static ItemType<ItemArcherPotterySherdStack> ARCHER_POTTERY_SHERD;

    public static ItemType<ItemArmadilloScuteStack> ARMADILLO_SCUTE;

    public static ItemType<ItemArmadilloSpawnEggStack> ARMADILLO_SPAWN_EGG;

    public static ItemType<ItemArmorStandStack> ARMOR_STAND;

    public static ItemType<ItemArmsUpPotterySherdStack> ARMS_UP_POTTERY_SHERD;

    public static ItemType<ItemArrowStack> ARROW;

    public static ItemType<ItemAxolotlBucketStack> AXOLOTL_BUCKET;

    public static ItemType<ItemAxolotlSpawnEggStack> AXOLOTL_SPAWN_EGG;

    public static ItemType<ItemAzaleaStack> AZALEA;

    public static ItemType<ItemAzaleaLeavesStack> AZALEA_LEAVES;

    public static ItemType<ItemAzaleaLeavesFloweredStack> AZALEA_LEAVES_FLOWERED;

    public static ItemType<ItemAzureBluetStack> AZURE_BLUET;

    public static ItemType<ItemBakedPotatoStack> BAKED_POTATO;

    public static ItemType<ItemBalloonStack> BALLOON;

    public static ItemType<ItemBambooStack> BAMBOO;

    public static ItemType<ItemBambooBlockStack> BAMBOO_BLOCK;

    public static ItemType<ItemBambooButtonStack> BAMBOO_BUTTON;

    public static ItemType<ItemBambooChestRaftStack> BAMBOO_CHEST_RAFT;

    public static ItemType<ItemBambooDoorStack> BAMBOO_DOOR;

    public static ItemType<ItemBambooDoubleSlabStack> BAMBOO_DOUBLE_SLAB;

    public static ItemType<ItemBambooFenceStack> BAMBOO_FENCE;

    public static ItemType<ItemBambooFenceGateStack> BAMBOO_FENCE_GATE;

    public static ItemType<ItemBambooHangingSignStack> BAMBOO_HANGING_SIGN;

    public static ItemType<ItemBambooMosaicStack> BAMBOO_MOSAIC;

    public static ItemType<ItemBambooMosaicDoubleSlabStack> BAMBOO_MOSAIC_DOUBLE_SLAB;

    public static ItemType<ItemBambooMosaicSlabStack> BAMBOO_MOSAIC_SLAB;

    public static ItemType<ItemBambooMosaicStairsStack> BAMBOO_MOSAIC_STAIRS;

    public static ItemType<ItemBambooPlanksStack> BAMBOO_PLANKS;

    public static ItemType<ItemBambooPressurePlateStack> BAMBOO_PRESSURE_PLATE;

    public static ItemType<ItemBambooRaftStack> BAMBOO_RAFT;

    public static ItemType<ItemBambooSaplingStack> BAMBOO_SAPLING;

    public static ItemType<ItemBambooSignStack> BAMBOO_SIGN;

    public static ItemType<ItemBambooSlabStack> BAMBOO_SLAB;

    public static ItemType<ItemBambooStairsStack> BAMBOO_STAIRS;

    public static ItemType<ItemBambooStandingSignStack> BAMBOO_STANDING_SIGN;

    public static ItemType<ItemBambooTrapdoorStack> BAMBOO_TRAPDOOR;

    public static ItemType<ItemBambooWallSignStack> BAMBOO_WALL_SIGN;

    public static ItemType<ItemBannerStack> BANNER;

    public static ItemType<ItemBannerPatternStack> BANNER_PATTERN;

    public static ItemType<ItemBarrelStack> BARREL;

    public static ItemType<ItemBarrierStack> BARRIER;

    public static ItemType<ItemBasaltStack> BASALT;

    public static ItemType<ItemBatSpawnEggStack> BAT_SPAWN_EGG;

    public static ItemType<ItemBeaconStack> BEACON;

    public static ItemType<ItemBedStack> BED;

    public static ItemType<ItemBedrockStack> BEDROCK;

    public static ItemType<ItemBeeNestStack> BEE_NEST;

    public static ItemType<ItemBeeSpawnEggStack> BEE_SPAWN_EGG;

    public static ItemType<ItemBeefStack> BEEF;

    public static ItemType<ItemBeehiveStack> BEEHIVE;

    public static ItemType<ItemBeetrootStack> BEETROOT;

    public static ItemType<ItemBeetrootSeedsStack> BEETROOT_SEEDS;

    public static ItemType<ItemBeetrootSoupStack> BEETROOT_SOUP;

    public static ItemType<ItemBellStack> BELL;

    public static ItemType<ItemBigDripleafStack> BIG_DRIPLEAF;

    public static ItemType<ItemBirchBoatStack> BIRCH_BOAT;

    public static ItemType<ItemBirchButtonStack> BIRCH_BUTTON;

    public static ItemType<ItemBirchChestBoatStack> BIRCH_CHEST_BOAT;

    public static ItemType<ItemBirchDoorStack> BIRCH_DOOR;

    public static ItemType<ItemBirchDoubleSlabStack> BIRCH_DOUBLE_SLAB;

    public static ItemType<ItemBirchFenceStack> BIRCH_FENCE;

    public static ItemType<ItemBirchFenceGateStack> BIRCH_FENCE_GATE;

    public static ItemType<ItemBirchHangingSignStack> BIRCH_HANGING_SIGN;

    public static ItemType<ItemBirchLeavesStack> BIRCH_LEAVES;

    public static ItemType<ItemBirchLogStack> BIRCH_LOG;

    public static ItemType<ItemBirchPlanksStack> BIRCH_PLANKS;

    public static ItemType<ItemBirchPressurePlateStack> BIRCH_PRESSURE_PLATE;

    public static ItemType<ItemBirchSaplingStack> BIRCH_SAPLING;

    public static ItemType<ItemBirchSignStack> BIRCH_SIGN;

    public static ItemType<ItemBirchSlabStack> BIRCH_SLAB;

    public static ItemType<ItemBirchStairsStack> BIRCH_STAIRS;

    public static ItemType<ItemBirchStandingSignStack> BIRCH_STANDING_SIGN;

    public static ItemType<ItemBirchTrapdoorStack> BIRCH_TRAPDOOR;

    public static ItemType<ItemBirchWallSignStack> BIRCH_WALL_SIGN;

    public static ItemType<ItemBirchWoodStack> BIRCH_WOOD;

    public static ItemType<ItemBlackCandleStack> BLACK_CANDLE;

    public static ItemType<ItemBlackCandleCakeStack> BLACK_CANDLE_CAKE;

    public static ItemType<ItemBlackCarpetStack> BLACK_CARPET;

    public static ItemType<ItemBlackConcreteStack> BLACK_CONCRETE;

    public static ItemType<ItemBlackConcretePowderStack> BLACK_CONCRETE_POWDER;

    public static ItemType<ItemBlackDyeStack> BLACK_DYE;

    public static ItemType<ItemBlackGlazedTerracottaStack> BLACK_GLAZED_TERRACOTTA;

    public static ItemType<ItemBlackShulkerBoxStack> BLACK_SHULKER_BOX;

    public static ItemType<ItemBlackStainedGlassStack> BLACK_STAINED_GLASS;

    public static ItemType<ItemBlackStainedGlassPaneStack> BLACK_STAINED_GLASS_PANE;

    public static ItemType<ItemBlackTerracottaStack> BLACK_TERRACOTTA;

    public static ItemType<ItemBlackWoolStack> BLACK_WOOL;

    public static ItemType<ItemBlackstoneStack> BLACKSTONE;

    public static ItemType<ItemBlackstoneDoubleSlabStack> BLACKSTONE_DOUBLE_SLAB;

    public static ItemType<ItemBlackstoneSlabStack> BLACKSTONE_SLAB;

    public static ItemType<ItemBlackstoneStairsStack> BLACKSTONE_STAIRS;

    public static ItemType<ItemBlackstoneWallStack> BLACKSTONE_WALL;

    public static ItemType<ItemBladePotterySherdStack> BLADE_POTTERY_SHERD;

    public static ItemType<ItemBlastFurnaceStack> BLAST_FURNACE;

    public static ItemType<ItemBlazePowderStack> BLAZE_POWDER;

    public static ItemType<ItemBlazeRodStack> BLAZE_ROD;

    public static ItemType<ItemBlazeSpawnEggStack> BLAZE_SPAWN_EGG;

    public static ItemType<ItemBleachStack> BLEACH;

    public static ItemType<ItemBlueCandleStack> BLUE_CANDLE;

    public static ItemType<ItemBlueCandleCakeStack> BLUE_CANDLE_CAKE;

    public static ItemType<ItemBlueCarpetStack> BLUE_CARPET;

    public static ItemType<ItemBlueConcreteStack> BLUE_CONCRETE;

    public static ItemType<ItemBlueConcretePowderStack> BLUE_CONCRETE_POWDER;

    public static ItemType<ItemBlueDyeStack> BLUE_DYE;

    public static ItemType<ItemBlueGlazedTerracottaStack> BLUE_GLAZED_TERRACOTTA;

    public static ItemType<ItemBlueIceStack> BLUE_ICE;

    public static ItemType<ItemBlueOrchidStack> BLUE_ORCHID;

    public static ItemType<ItemBlueShulkerBoxStack> BLUE_SHULKER_BOX;

    public static ItemType<ItemBlueStainedGlassStack> BLUE_STAINED_GLASS;

    public static ItemType<ItemBlueStainedGlassPaneStack> BLUE_STAINED_GLASS_PANE;

    public static ItemType<ItemBlueTerracottaStack> BLUE_TERRACOTTA;

    public static ItemType<ItemBlueWoolStack> BLUE_WOOL;

    public static ItemType<ItemBoatStack> BOAT;

    public static ItemType<ItemBoggedSpawnEggStack> BOGGED_SPAWN_EGG;

    public static ItemType<ItemBoltArmorTrimSmithingTemplateStack> BOLT_ARMOR_TRIM_SMITHING_TEMPLATE;

    public static ItemType<ItemBoneStack> BONE;

    public static ItemType<ItemBoneBlockStack> BONE_BLOCK;

    public static ItemType<ItemBoneMealStack> BONE_MEAL;

    public static ItemType<ItemBookStack> BOOK;

    public static ItemType<ItemBookshelfStack> BOOKSHELF;

    public static ItemType<ItemBorderBlockStack> BORDER_BLOCK;

    public static ItemType<ItemBordureIndentedBannerPatternStack> BORDURE_INDENTED_BANNER_PATTERN;

    public static ItemType<ItemBowStack> BOW;

    public static ItemType<ItemBowlStack> BOWL;

    public static ItemType<ItemBrainCoralStack> BRAIN_CORAL;

    public static ItemType<ItemBrainCoralBlockStack> BRAIN_CORAL_BLOCK;

    public static ItemType<ItemBrainCoralFanStack> BRAIN_CORAL_FAN;

    public static ItemType<ItemBreadStack> BREAD;

    public static ItemType<ItemBreezeRodStack> BREEZE_ROD;

    public static ItemType<ItemBreezeSpawnEggStack> BREEZE_SPAWN_EGG;

    public static ItemType<ItemBrewerPotterySherdStack> BREWER_POTTERY_SHERD;

    public static ItemType<ItemBrewingStandStack> BREWING_STAND;

    public static ItemType<ItemBrickStack> BRICK;

    public static ItemType<ItemBrickBlockStack> BRICK_BLOCK;

    public static ItemType<ItemBrickSlabStack> BRICK_SLAB;

    public static ItemType<ItemBrickStairsStack> BRICK_STAIRS;

    public static ItemType<ItemBrownCandleStack> BROWN_CANDLE;

    public static ItemType<ItemBrownCandleCakeStack> BROWN_CANDLE_CAKE;

    public static ItemType<ItemBrownCarpetStack> BROWN_CARPET;

    public static ItemType<ItemBrownConcreteStack> BROWN_CONCRETE;

    public static ItemType<ItemBrownConcretePowderStack> BROWN_CONCRETE_POWDER;

    public static ItemType<ItemBrownDyeStack> BROWN_DYE;

    public static ItemType<ItemBrownGlazedTerracottaStack> BROWN_GLAZED_TERRACOTTA;

    public static ItemType<ItemBrownMushroomStack> BROWN_MUSHROOM;

    public static ItemType<ItemBrownMushroomBlockStack> BROWN_MUSHROOM_BLOCK;

    public static ItemType<ItemBrownShulkerBoxStack> BROWN_SHULKER_BOX;

    public static ItemType<ItemBrownStainedGlassStack> BROWN_STAINED_GLASS;

    public static ItemType<ItemBrownStainedGlassPaneStack> BROWN_STAINED_GLASS_PANE;

    public static ItemType<ItemBrownTerracottaStack> BROWN_TERRACOTTA;

    public static ItemType<ItemBrownWoolStack> BROWN_WOOL;

    public static ItemType<ItemBrushStack> BRUSH;

    public static ItemType<ItemBubbleColumnStack> BUBBLE_COLUMN;

    public static ItemType<ItemBubbleCoralStack> BUBBLE_CORAL;

    public static ItemType<ItemBubbleCoralBlockStack> BUBBLE_CORAL_BLOCK;

    public static ItemType<ItemBubbleCoralFanStack> BUBBLE_CORAL_FAN;

    public static ItemType<ItemBucketStack> BUCKET;

    public static ItemType<ItemBuddingAmethystStack> BUDDING_AMETHYST;

    public static ItemType<ItemBurnPotterySherdStack> BURN_POTTERY_SHERD;

    public static ItemType<ItemCactusStack> CACTUS;

    public static ItemType<ItemCakeStack> CAKE;

    public static ItemType<ItemCalciteStack> CALCITE;

    public static ItemType<ItemCalibratedSculkSensorStack> CALIBRATED_SCULK_SENSOR;

    public static ItemType<ItemCamelSpawnEggStack> CAMEL_SPAWN_EGG;

    public static ItemType<ItemCameraStack> CAMERA;

    public static ItemType<ItemCampfireStack> CAMPFIRE;

    public static ItemType<ItemCandleStack> CANDLE;

    public static ItemType<ItemCandleCakeStack> CANDLE_CAKE;

    public static ItemType<ItemCarpetStack> CARPET;

    public static ItemType<ItemCarrotStack> CARROT;

    public static ItemType<ItemCarrotOnAStickStack> CARROT_ON_A_STICK;

    public static ItemType<ItemCarrotsStack> CARROTS;

    public static ItemType<ItemCartographyTableStack> CARTOGRAPHY_TABLE;

    public static ItemType<ItemCarvedPumpkinStack> CARVED_PUMPKIN;

    public static ItemType<ItemCatSpawnEggStack> CAT_SPAWN_EGG;

    public static ItemType<ItemCauldronStack> CAULDRON;

    public static ItemType<ItemCaveSpiderSpawnEggStack> CAVE_SPIDER_SPAWN_EGG;

    public static ItemType<ItemCaveVinesStack> CAVE_VINES;

    public static ItemType<ItemCaveVinesBodyWithBerriesStack> CAVE_VINES_BODY_WITH_BERRIES;

    public static ItemType<ItemCaveVinesHeadWithBerriesStack> CAVE_VINES_HEAD_WITH_BERRIES;

    public static ItemType<ItemChainStack> CHAIN;

    public static ItemType<ItemChainCommandBlockStack> CHAIN_COMMAND_BLOCK;

    public static ItemType<ItemChainmailBootsStack> CHAINMAIL_BOOTS;

    public static ItemType<ItemChainmailChestplateStack> CHAINMAIL_CHESTPLATE;

    public static ItemType<ItemChainmailHelmetStack> CHAINMAIL_HELMET;

    public static ItemType<ItemChainmailLeggingsStack> CHAINMAIL_LEGGINGS;

    public static ItemType<ItemCharcoalStack> CHARCOAL;

    public static ItemType<ItemChemicalHeatStack> CHEMICAL_HEAT;

    public static ItemType<ItemChemistryTableStack> CHEMISTRY_TABLE;

    public static ItemType<ItemCherryBoatStack> CHERRY_BOAT;

    public static ItemType<ItemCherryButtonStack> CHERRY_BUTTON;

    public static ItemType<ItemCherryChestBoatStack> CHERRY_CHEST_BOAT;

    public static ItemType<ItemCherryDoorStack> CHERRY_DOOR;

    public static ItemType<ItemCherryDoubleSlabStack> CHERRY_DOUBLE_SLAB;

    public static ItemType<ItemCherryFenceStack> CHERRY_FENCE;

    public static ItemType<ItemCherryFenceGateStack> CHERRY_FENCE_GATE;

    public static ItemType<ItemCherryHangingSignStack> CHERRY_HANGING_SIGN;

    public static ItemType<ItemCherryLeavesStack> CHERRY_LEAVES;

    public static ItemType<ItemCherryLogStack> CHERRY_LOG;

    public static ItemType<ItemCherryPlanksStack> CHERRY_PLANKS;

    public static ItemType<ItemCherryPressurePlateStack> CHERRY_PRESSURE_PLATE;

    public static ItemType<ItemCherrySaplingStack> CHERRY_SAPLING;

    public static ItemType<ItemCherrySignStack> CHERRY_SIGN;

    public static ItemType<ItemCherrySlabStack> CHERRY_SLAB;

    public static ItemType<ItemCherryStairsStack> CHERRY_STAIRS;

    public static ItemType<ItemCherryStandingSignStack> CHERRY_STANDING_SIGN;

    public static ItemType<ItemCherryTrapdoorStack> CHERRY_TRAPDOOR;

    public static ItemType<ItemCherryWallSignStack> CHERRY_WALL_SIGN;

    public static ItemType<ItemCherryWoodStack> CHERRY_WOOD;

    public static ItemType<ItemChestStack> CHEST;

    public static ItemType<ItemChestBoatStack> CHEST_BOAT;

    public static ItemType<ItemChestMinecartStack> CHEST_MINECART;

    public static ItemType<ItemChickenStack> CHICKEN;

    public static ItemType<ItemChickenSpawnEggStack> CHICKEN_SPAWN_EGG;

    public static ItemType<ItemChiseledBookshelfStack> CHISELED_BOOKSHELF;

    public static ItemType<ItemChiseledCopperStack> CHISELED_COPPER;

    public static ItemType<ItemChiseledDeepslateStack> CHISELED_DEEPSLATE;

    public static ItemType<ItemChiseledNetherBricksStack> CHISELED_NETHER_BRICKS;

    public static ItemType<ItemChiseledPolishedBlackstoneStack> CHISELED_POLISHED_BLACKSTONE;

    public static ItemType<ItemChiseledTuffStack> CHISELED_TUFF;

    public static ItemType<ItemChiseledTuffBricksStack> CHISELED_TUFF_BRICKS;

    public static ItemType<ItemChorusFlowerStack> CHORUS_FLOWER;

    public static ItemType<ItemChorusFruitStack> CHORUS_FRUIT;

    public static ItemType<ItemChorusPlantStack> CHORUS_PLANT;

    public static ItemType<ItemClayStack> CLAY;

    public static ItemType<ItemClayBallStack> CLAY_BALL;

    public static ItemType<ItemClientRequestPlaceholderBlockStack> CLIENT_REQUEST_PLACEHOLDER_BLOCK;

    public static ItemType<ItemClockStack> CLOCK;

    public static ItemType<ItemCoalStack> COAL;

    public static ItemType<ItemCoalBlockStack> COAL_BLOCK;

    public static ItemType<ItemCoalOreStack> COAL_ORE;

    public static ItemType<ItemCoastArmorTrimSmithingTemplateStack> COAST_ARMOR_TRIM_SMITHING_TEMPLATE;

    public static ItemType<ItemCobbledDeepslateStack> COBBLED_DEEPSLATE;

    public static ItemType<ItemCobbledDeepslateDoubleSlabStack> COBBLED_DEEPSLATE_DOUBLE_SLAB;

    public static ItemType<ItemCobbledDeepslateSlabStack> COBBLED_DEEPSLATE_SLAB;

    public static ItemType<ItemCobbledDeepslateStairsStack> COBBLED_DEEPSLATE_STAIRS;

    public static ItemType<ItemCobbledDeepslateWallStack> COBBLED_DEEPSLATE_WALL;

    public static ItemType<ItemCobblestoneStack> COBBLESTONE;

    public static ItemType<ItemCobblestoneSlabStack> COBBLESTONE_SLAB;

    public static ItemType<ItemCobblestoneWallStack> COBBLESTONE_WALL;

    public static ItemType<ItemCocoaStack> COCOA;

    public static ItemType<ItemCocoaBeansStack> COCOA_BEANS;

    public static ItemType<ItemCodStack> COD;

    public static ItemType<ItemCodBucketStack> COD_BUCKET;

    public static ItemType<ItemCodSpawnEggStack> COD_SPAWN_EGG;

    public static ItemType<ItemColoredTorchBpStack> COLORED_TORCH_BP;

    public static ItemType<ItemColoredTorchRgStack> COLORED_TORCH_RG;

    public static ItemType<ItemCommandBlockStack> COMMAND_BLOCK;

    public static ItemType<ItemCommandBlockMinecartStack> COMMAND_BLOCK_MINECART;

    public static ItemType<ItemComparatorStack> COMPARATOR;

    public static ItemType<ItemCompassStack> COMPASS;

    public static ItemType<ItemComposterStack> COMPOSTER;

    public static ItemType<ItemCompoundStack> COMPOUND;

    public static ItemType<ItemConcreteStack> CONCRETE;

    public static ItemType<ItemConcretePowderStack> CONCRETE_POWDER;

    public static ItemType<ItemConduitStack> CONDUIT;

    public static ItemType<ItemCookedBeefStack> COOKED_BEEF;

    public static ItemType<ItemCookedChickenStack> COOKED_CHICKEN;

    public static ItemType<ItemCookedCodStack> COOKED_COD;

    public static ItemType<ItemCookedMuttonStack> COOKED_MUTTON;

    public static ItemType<ItemCookedPorkchopStack> COOKED_PORKCHOP;

    public static ItemType<ItemCookedRabbitStack> COOKED_RABBIT;

    public static ItemType<ItemCookedSalmonStack> COOKED_SALMON;

    public static ItemType<ItemCookieStack> COOKIE;

    public static ItemType<ItemCopperBlockStack> COPPER_BLOCK;

    public static ItemType<ItemCopperBulbStack> COPPER_BULB;

    public static ItemType<ItemCopperDoorStack> COPPER_DOOR;

    public static ItemType<ItemCopperGrateStack> COPPER_GRATE;

    public static ItemType<ItemCopperIngotStack> COPPER_INGOT;

    public static ItemType<ItemCopperOreStack> COPPER_ORE;

    public static ItemType<ItemCopperTrapdoorStack> COPPER_TRAPDOOR;

    public static ItemType<ItemCoralStack> CORAL;

    public static ItemType<ItemCoralBlockStack> CORAL_BLOCK;

    public static ItemType<ItemCoralFanStack> CORAL_FAN;

    public static ItemType<ItemCoralFanDeadStack> CORAL_FAN_DEAD;

    public static ItemType<ItemCoralFanHangStack> CORAL_FAN_HANG;

    public static ItemType<ItemCoralFanHang2Stack> CORAL_FAN_HANG2;

    public static ItemType<ItemCoralFanHang3Stack> CORAL_FAN_HANG3;

    public static ItemType<ItemCornflowerStack> CORNFLOWER;

    public static ItemType<ItemCowSpawnEggStack> COW_SPAWN_EGG;

    public static ItemType<ItemCrackedDeepslateBricksStack> CRACKED_DEEPSLATE_BRICKS;

    public static ItemType<ItemCrackedDeepslateTilesStack> CRACKED_DEEPSLATE_TILES;

    public static ItemType<ItemCrackedNetherBricksStack> CRACKED_NETHER_BRICKS;

    public static ItemType<ItemCrackedPolishedBlackstoneBricksStack> CRACKED_POLISHED_BLACKSTONE_BRICKS;

    public static ItemType<ItemCrafterStack> CRAFTER;

    public static ItemType<ItemCraftingTableStack> CRAFTING_TABLE;

    public static ItemType<ItemCreeperBannerPatternStack> CREEPER_BANNER_PATTERN;

    public static ItemType<ItemCreeperSpawnEggStack> CREEPER_SPAWN_EGG;

    public static ItemType<ItemCrimsonButtonStack> CRIMSON_BUTTON;

    public static ItemType<ItemCrimsonDoorStack> CRIMSON_DOOR;

    public static ItemType<ItemCrimsonDoubleSlabStack> CRIMSON_DOUBLE_SLAB;

    public static ItemType<ItemCrimsonFenceStack> CRIMSON_FENCE;

    public static ItemType<ItemCrimsonFenceGateStack> CRIMSON_FENCE_GATE;

    public static ItemType<ItemCrimsonFungusStack> CRIMSON_FUNGUS;

    public static ItemType<ItemCrimsonHangingSignStack> CRIMSON_HANGING_SIGN;

    public static ItemType<ItemCrimsonHyphaeStack> CRIMSON_HYPHAE;

    public static ItemType<ItemCrimsonNyliumStack> CRIMSON_NYLIUM;

    public static ItemType<ItemCrimsonPlanksStack> CRIMSON_PLANKS;

    public static ItemType<ItemCrimsonPressurePlateStack> CRIMSON_PRESSURE_PLATE;

    public static ItemType<ItemCrimsonRootsStack> CRIMSON_ROOTS;

    public static ItemType<ItemCrimsonSignStack> CRIMSON_SIGN;

    public static ItemType<ItemCrimsonSlabStack> CRIMSON_SLAB;

    public static ItemType<ItemCrimsonStairsStack> CRIMSON_STAIRS;

    public static ItemType<ItemCrimsonStandingSignStack> CRIMSON_STANDING_SIGN;

    public static ItemType<ItemCrimsonStemStack> CRIMSON_STEM;

    public static ItemType<ItemCrimsonTrapdoorStack> CRIMSON_TRAPDOOR;

    public static ItemType<ItemCrimsonWallSignStack> CRIMSON_WALL_SIGN;

    public static ItemType<ItemCrossbowStack> CROSSBOW;

    public static ItemType<ItemCryingObsidianStack> CRYING_OBSIDIAN;

    public static ItemType<ItemCutCopperStack> CUT_COPPER;

    public static ItemType<ItemCutCopperSlabStack> CUT_COPPER_SLAB;

    public static ItemType<ItemCutCopperStairsStack> CUT_COPPER_STAIRS;

    public static ItemType<ItemCyanCandleStack> CYAN_CANDLE;

    public static ItemType<ItemCyanCandleCakeStack> CYAN_CANDLE_CAKE;

    public static ItemType<ItemCyanCarpetStack> CYAN_CARPET;

    public static ItemType<ItemCyanConcreteStack> CYAN_CONCRETE;

    public static ItemType<ItemCyanConcretePowderStack> CYAN_CONCRETE_POWDER;

    public static ItemType<ItemCyanDyeStack> CYAN_DYE;

    public static ItemType<ItemCyanGlazedTerracottaStack> CYAN_GLAZED_TERRACOTTA;

    public static ItemType<ItemCyanShulkerBoxStack> CYAN_SHULKER_BOX;

    public static ItemType<ItemCyanStainedGlassStack> CYAN_STAINED_GLASS;

    public static ItemType<ItemCyanStainedGlassPaneStack> CYAN_STAINED_GLASS_PANE;

    public static ItemType<ItemCyanTerracottaStack> CYAN_TERRACOTTA;

    public static ItemType<ItemCyanWoolStack> CYAN_WOOL;

    public static ItemType<ItemDangerPotterySherdStack> DANGER_POTTERY_SHERD;

    public static ItemType<ItemDarkOakBoatStack> DARK_OAK_BOAT;

    public static ItemType<ItemDarkOakButtonStack> DARK_OAK_BUTTON;

    public static ItemType<ItemDarkOakChestBoatStack> DARK_OAK_CHEST_BOAT;

    public static ItemType<ItemDarkOakDoorStack> DARK_OAK_DOOR;

    public static ItemType<ItemDarkOakDoubleSlabStack> DARK_OAK_DOUBLE_SLAB;

    public static ItemType<ItemDarkOakFenceStack> DARK_OAK_FENCE;

    public static ItemType<ItemDarkOakFenceGateStack> DARK_OAK_FENCE_GATE;

    public static ItemType<ItemDarkOakHangingSignStack> DARK_OAK_HANGING_SIGN;

    public static ItemType<ItemDarkOakLeavesStack> DARK_OAK_LEAVES;

    public static ItemType<ItemDarkOakLogStack> DARK_OAK_LOG;

    public static ItemType<ItemDarkOakPlanksStack> DARK_OAK_PLANKS;

    public static ItemType<ItemDarkOakPressurePlateStack> DARK_OAK_PRESSURE_PLATE;

    public static ItemType<ItemDarkOakSaplingStack> DARK_OAK_SAPLING;

    public static ItemType<ItemDarkOakSignStack> DARK_OAK_SIGN;

    public static ItemType<ItemDarkOakSlabStack> DARK_OAK_SLAB;

    public static ItemType<ItemDarkOakStairsStack> DARK_OAK_STAIRS;

    public static ItemType<ItemDarkOakTrapdoorStack> DARK_OAK_TRAPDOOR;

    public static ItemType<ItemDarkOakWoodStack> DARK_OAK_WOOD;

    public static ItemType<ItemDarkPrismarineStairsStack> DARK_PRISMARINE_STAIRS;

    public static ItemType<ItemDarkoakStandingSignStack> DARKOAK_STANDING_SIGN;

    public static ItemType<ItemDarkoakWallSignStack> DARKOAK_WALL_SIGN;

    public static ItemType<ItemDaylightDetectorStack> DAYLIGHT_DETECTOR;

    public static ItemType<ItemDaylightDetectorInvertedStack> DAYLIGHT_DETECTOR_INVERTED;

    public static ItemType<ItemDeadBrainCoralStack> DEAD_BRAIN_CORAL;

    public static ItemType<ItemDeadBrainCoralBlockStack> DEAD_BRAIN_CORAL_BLOCK;

    public static ItemType<ItemDeadBrainCoralFanStack> DEAD_BRAIN_CORAL_FAN;

    public static ItemType<ItemDeadBubbleCoralStack> DEAD_BUBBLE_CORAL;

    public static ItemType<ItemDeadBubbleCoralBlockStack> DEAD_BUBBLE_CORAL_BLOCK;

    public static ItemType<ItemDeadBubbleCoralFanStack> DEAD_BUBBLE_CORAL_FAN;

    public static ItemType<ItemDeadFireCoralStack> DEAD_FIRE_CORAL;

    public static ItemType<ItemDeadFireCoralBlockStack> DEAD_FIRE_CORAL_BLOCK;

    public static ItemType<ItemDeadFireCoralFanStack> DEAD_FIRE_CORAL_FAN;

    public static ItemType<ItemDeadHornCoralStack> DEAD_HORN_CORAL;

    public static ItemType<ItemDeadHornCoralBlockStack> DEAD_HORN_CORAL_BLOCK;

    public static ItemType<ItemDeadHornCoralFanStack> DEAD_HORN_CORAL_FAN;

    public static ItemType<ItemDeadTubeCoralStack> DEAD_TUBE_CORAL;

    public static ItemType<ItemDeadTubeCoralBlockStack> DEAD_TUBE_CORAL_BLOCK;

    public static ItemType<ItemDeadTubeCoralFanStack> DEAD_TUBE_CORAL_FAN;

    public static ItemType<ItemDeadbushStack> DEADBUSH;

    public static ItemType<ItemDecoratedPotStack> DECORATED_POT;

    public static ItemType<ItemDeepslateStack> DEEPSLATE;

    public static ItemType<ItemDeepslateBrickDoubleSlabStack> DEEPSLATE_BRICK_DOUBLE_SLAB;

    public static ItemType<ItemDeepslateBrickSlabStack> DEEPSLATE_BRICK_SLAB;

    public static ItemType<ItemDeepslateBrickStairsStack> DEEPSLATE_BRICK_STAIRS;

    public static ItemType<ItemDeepslateBrickWallStack> DEEPSLATE_BRICK_WALL;

    public static ItemType<ItemDeepslateBricksStack> DEEPSLATE_BRICKS;

    public static ItemType<ItemDeepslateCoalOreStack> DEEPSLATE_COAL_ORE;

    public static ItemType<ItemDeepslateCopperOreStack> DEEPSLATE_COPPER_ORE;

    public static ItemType<ItemDeepslateDiamondOreStack> DEEPSLATE_DIAMOND_ORE;

    public static ItemType<ItemDeepslateEmeraldOreStack> DEEPSLATE_EMERALD_ORE;

    public static ItemType<ItemDeepslateGoldOreStack> DEEPSLATE_GOLD_ORE;

    public static ItemType<ItemDeepslateIronOreStack> DEEPSLATE_IRON_ORE;

    public static ItemType<ItemDeepslateLapisOreStack> DEEPSLATE_LAPIS_ORE;

    public static ItemType<ItemDeepslateRedstoneOreStack> DEEPSLATE_REDSTONE_ORE;

    public static ItemType<ItemDeepslateTileDoubleSlabStack> DEEPSLATE_TILE_DOUBLE_SLAB;

    public static ItemType<ItemDeepslateTileSlabStack> DEEPSLATE_TILE_SLAB;

    public static ItemType<ItemDeepslateTileStairsStack> DEEPSLATE_TILE_STAIRS;

    public static ItemType<ItemDeepslateTileWallStack> DEEPSLATE_TILE_WALL;

    public static ItemType<ItemDeepslateTilesStack> DEEPSLATE_TILES;

    public static ItemType<ItemDenyStack> DENY;

    public static ItemType<ItemDetectorRailStack> DETECTOR_RAIL;

    public static ItemType<ItemDiamondStack> DIAMOND;

    public static ItemType<ItemDiamondAxeStack> DIAMOND_AXE;

    public static ItemType<ItemDiamondBlockStack> DIAMOND_BLOCK;

    public static ItemType<ItemDiamondBootsStack> DIAMOND_BOOTS;

    public static ItemType<ItemDiamondChestplateStack> DIAMOND_CHESTPLATE;

    public static ItemType<ItemDiamondHelmetStack> DIAMOND_HELMET;

    public static ItemType<ItemDiamondHoeStack> DIAMOND_HOE;

    public static ItemType<ItemDiamondHorseArmorStack> DIAMOND_HORSE_ARMOR;

    public static ItemType<ItemDiamondLeggingsStack> DIAMOND_LEGGINGS;

    public static ItemType<ItemDiamondOreStack> DIAMOND_ORE;

    public static ItemType<ItemDiamondPickaxeStack> DIAMOND_PICKAXE;

    public static ItemType<ItemDiamondShovelStack> DIAMOND_SHOVEL;

    public static ItemType<ItemDiamondSwordStack> DIAMOND_SWORD;

    public static ItemType<ItemDioriteStack> DIORITE;

    public static ItemType<ItemDioriteStairsStack> DIORITE_STAIRS;

    public static ItemType<ItemDirtStack> DIRT;

    public static ItemType<ItemDirtWithRootsStack> DIRT_WITH_ROOTS;

    public static ItemType<ItemDiscFragment5Stack> DISC_FRAGMENT_5;

    public static ItemType<ItemDispenserStack> DISPENSER;

    public static ItemType<ItemDolphinSpawnEggStack> DOLPHIN_SPAWN_EGG;

    public static ItemType<ItemDonkeySpawnEggStack> DONKEY_SPAWN_EGG;

    public static ItemType<ItemDoubleCutCopperSlabStack> DOUBLE_CUT_COPPER_SLAB;

    public static ItemType<ItemDoublePlantStack> DOUBLE_PLANT;

    public static ItemType<ItemDoubleStoneBlockSlabStack> DOUBLE_STONE_BLOCK_SLAB;

    public static ItemType<ItemDoubleStoneBlockSlab2Stack> DOUBLE_STONE_BLOCK_SLAB2;

    public static ItemType<ItemDoubleStoneBlockSlab3Stack> DOUBLE_STONE_BLOCK_SLAB3;

    public static ItemType<ItemDoubleStoneBlockSlab4Stack> DOUBLE_STONE_BLOCK_SLAB4;

    public static ItemType<ItemDragonBreathStack> DRAGON_BREATH;

    public static ItemType<ItemDragonEggStack> DRAGON_EGG;

    public static ItemType<ItemDriedKelpStack> DRIED_KELP;

    public static ItemType<ItemDriedKelpBlockStack> DRIED_KELP_BLOCK;

    public static ItemType<ItemDripstoneBlockStack> DRIPSTONE_BLOCK;

    public static ItemType<ItemDropperStack> DROPPER;

    public static ItemType<ItemDrownedSpawnEggStack> DROWNED_SPAWN_EGG;

    public static ItemType<ItemDuneArmorTrimSmithingTemplateStack> DUNE_ARMOR_TRIM_SMITHING_TEMPLATE;

    public static ItemType<ItemDyeStack> DYE;

    public static ItemType<ItemEchoShardStack> ECHO_SHARD;

    public static ItemType<ItemEggStack> EGG;

    public static ItemType<ItemElderGuardianSpawnEggStack> ELDER_GUARDIAN_SPAWN_EGG;

    public static ItemType<ItemElement0Stack> ELEMENT_0;

    public static ItemType<ItemElement1Stack> ELEMENT_1;

    public static ItemType<ItemElement10Stack> ELEMENT_10;

    public static ItemType<ItemElement100Stack> ELEMENT_100;

    public static ItemType<ItemElement101Stack> ELEMENT_101;

    public static ItemType<ItemElement102Stack> ELEMENT_102;

    public static ItemType<ItemElement103Stack> ELEMENT_103;

    public static ItemType<ItemElement104Stack> ELEMENT_104;

    public static ItemType<ItemElement105Stack> ELEMENT_105;

    public static ItemType<ItemElement106Stack> ELEMENT_106;

    public static ItemType<ItemElement107Stack> ELEMENT_107;

    public static ItemType<ItemElement108Stack> ELEMENT_108;

    public static ItemType<ItemElement109Stack> ELEMENT_109;

    public static ItemType<ItemElement11Stack> ELEMENT_11;

    public static ItemType<ItemElement110Stack> ELEMENT_110;

    public static ItemType<ItemElement111Stack> ELEMENT_111;

    public static ItemType<ItemElement112Stack> ELEMENT_112;

    public static ItemType<ItemElement113Stack> ELEMENT_113;

    public static ItemType<ItemElement114Stack> ELEMENT_114;

    public static ItemType<ItemElement115Stack> ELEMENT_115;

    public static ItemType<ItemElement116Stack> ELEMENT_116;

    public static ItemType<ItemElement117Stack> ELEMENT_117;

    public static ItemType<ItemElement118Stack> ELEMENT_118;

    public static ItemType<ItemElement12Stack> ELEMENT_12;

    public static ItemType<ItemElement13Stack> ELEMENT_13;

    public static ItemType<ItemElement14Stack> ELEMENT_14;

    public static ItemType<ItemElement15Stack> ELEMENT_15;

    public static ItemType<ItemElement16Stack> ELEMENT_16;

    public static ItemType<ItemElement17Stack> ELEMENT_17;

    public static ItemType<ItemElement18Stack> ELEMENT_18;

    public static ItemType<ItemElement19Stack> ELEMENT_19;

    public static ItemType<ItemElement2Stack> ELEMENT_2;

    public static ItemType<ItemElement20Stack> ELEMENT_20;

    public static ItemType<ItemElement21Stack> ELEMENT_21;

    public static ItemType<ItemElement22Stack> ELEMENT_22;

    public static ItemType<ItemElement23Stack> ELEMENT_23;

    public static ItemType<ItemElement24Stack> ELEMENT_24;

    public static ItemType<ItemElement25Stack> ELEMENT_25;

    public static ItemType<ItemElement26Stack> ELEMENT_26;

    public static ItemType<ItemElement27Stack> ELEMENT_27;

    public static ItemType<ItemElement28Stack> ELEMENT_28;

    public static ItemType<ItemElement29Stack> ELEMENT_29;

    public static ItemType<ItemElement3Stack> ELEMENT_3;

    public static ItemType<ItemElement30Stack> ELEMENT_30;

    public static ItemType<ItemElement31Stack> ELEMENT_31;

    public static ItemType<ItemElement32Stack> ELEMENT_32;

    public static ItemType<ItemElement33Stack> ELEMENT_33;

    public static ItemType<ItemElement34Stack> ELEMENT_34;

    public static ItemType<ItemElement35Stack> ELEMENT_35;

    public static ItemType<ItemElement36Stack> ELEMENT_36;

    public static ItemType<ItemElement37Stack> ELEMENT_37;

    public static ItemType<ItemElement38Stack> ELEMENT_38;

    public static ItemType<ItemElement39Stack> ELEMENT_39;

    public static ItemType<ItemElement4Stack> ELEMENT_4;

    public static ItemType<ItemElement40Stack> ELEMENT_40;

    public static ItemType<ItemElement41Stack> ELEMENT_41;

    public static ItemType<ItemElement42Stack> ELEMENT_42;

    public static ItemType<ItemElement43Stack> ELEMENT_43;

    public static ItemType<ItemElement44Stack> ELEMENT_44;

    public static ItemType<ItemElement45Stack> ELEMENT_45;

    public static ItemType<ItemElement46Stack> ELEMENT_46;

    public static ItemType<ItemElement47Stack> ELEMENT_47;

    public static ItemType<ItemElement48Stack> ELEMENT_48;

    public static ItemType<ItemElement49Stack> ELEMENT_49;

    public static ItemType<ItemElement5Stack> ELEMENT_5;

    public static ItemType<ItemElement50Stack> ELEMENT_50;

    public static ItemType<ItemElement51Stack> ELEMENT_51;

    public static ItemType<ItemElement52Stack> ELEMENT_52;

    public static ItemType<ItemElement53Stack> ELEMENT_53;

    public static ItemType<ItemElement54Stack> ELEMENT_54;

    public static ItemType<ItemElement55Stack> ELEMENT_55;

    public static ItemType<ItemElement56Stack> ELEMENT_56;

    public static ItemType<ItemElement57Stack> ELEMENT_57;

    public static ItemType<ItemElement58Stack> ELEMENT_58;

    public static ItemType<ItemElement59Stack> ELEMENT_59;

    public static ItemType<ItemElement6Stack> ELEMENT_6;

    public static ItemType<ItemElement60Stack> ELEMENT_60;

    public static ItemType<ItemElement61Stack> ELEMENT_61;

    public static ItemType<ItemElement62Stack> ELEMENT_62;

    public static ItemType<ItemElement63Stack> ELEMENT_63;

    public static ItemType<ItemElement64Stack> ELEMENT_64;

    public static ItemType<ItemElement65Stack> ELEMENT_65;

    public static ItemType<ItemElement66Stack> ELEMENT_66;

    public static ItemType<ItemElement67Stack> ELEMENT_67;

    public static ItemType<ItemElement68Stack> ELEMENT_68;

    public static ItemType<ItemElement69Stack> ELEMENT_69;

    public static ItemType<ItemElement7Stack> ELEMENT_7;

    public static ItemType<ItemElement70Stack> ELEMENT_70;

    public static ItemType<ItemElement71Stack> ELEMENT_71;

    public static ItemType<ItemElement72Stack> ELEMENT_72;

    public static ItemType<ItemElement73Stack> ELEMENT_73;

    public static ItemType<ItemElement74Stack> ELEMENT_74;

    public static ItemType<ItemElement75Stack> ELEMENT_75;

    public static ItemType<ItemElement76Stack> ELEMENT_76;

    public static ItemType<ItemElement77Stack> ELEMENT_77;

    public static ItemType<ItemElement78Stack> ELEMENT_78;

    public static ItemType<ItemElement79Stack> ELEMENT_79;

    public static ItemType<ItemElement8Stack> ELEMENT_8;

    public static ItemType<ItemElement80Stack> ELEMENT_80;

    public static ItemType<ItemElement81Stack> ELEMENT_81;

    public static ItemType<ItemElement82Stack> ELEMENT_82;

    public static ItemType<ItemElement83Stack> ELEMENT_83;

    public static ItemType<ItemElement84Stack> ELEMENT_84;

    public static ItemType<ItemElement85Stack> ELEMENT_85;

    public static ItemType<ItemElement86Stack> ELEMENT_86;

    public static ItemType<ItemElement87Stack> ELEMENT_87;

    public static ItemType<ItemElement88Stack> ELEMENT_88;

    public static ItemType<ItemElement89Stack> ELEMENT_89;

    public static ItemType<ItemElement9Stack> ELEMENT_9;

    public static ItemType<ItemElement90Stack> ELEMENT_90;

    public static ItemType<ItemElement91Stack> ELEMENT_91;

    public static ItemType<ItemElement92Stack> ELEMENT_92;

    public static ItemType<ItemElement93Stack> ELEMENT_93;

    public static ItemType<ItemElement94Stack> ELEMENT_94;

    public static ItemType<ItemElement95Stack> ELEMENT_95;

    public static ItemType<ItemElement96Stack> ELEMENT_96;

    public static ItemType<ItemElement97Stack> ELEMENT_97;

    public static ItemType<ItemElement98Stack> ELEMENT_98;

    public static ItemType<ItemElement99Stack> ELEMENT_99;

    public static ItemType<ItemElytraStack> ELYTRA;

    public static ItemType<ItemEmeraldStack> EMERALD;

    public static ItemType<ItemEmeraldBlockStack> EMERALD_BLOCK;

    public static ItemType<ItemEmeraldOreStack> EMERALD_ORE;

    public static ItemType<ItemEmptyMapStack> EMPTY_MAP;

    public static ItemType<ItemEnchantedBookStack> ENCHANTED_BOOK;

    public static ItemType<ItemEnchantedGoldenAppleStack> ENCHANTED_GOLDEN_APPLE;

    public static ItemType<ItemEnchantingTableStack> ENCHANTING_TABLE;

    public static ItemType<ItemEndBrickStairsStack> END_BRICK_STAIRS;

    public static ItemType<ItemEndBricksStack> END_BRICKS;

    public static ItemType<ItemEndCrystalStack> END_CRYSTAL;

    public static ItemType<ItemEndGatewayStack> END_GATEWAY;

    public static ItemType<ItemEndPortalStack> END_PORTAL;

    public static ItemType<ItemEndPortalFrameStack> END_PORTAL_FRAME;

    public static ItemType<ItemEndRodStack> END_ROD;

    public static ItemType<ItemEndStoneStack> END_STONE;

    public static ItemType<ItemEnderChestStack> ENDER_CHEST;

    public static ItemType<ItemEnderDragonSpawnEggStack> ENDER_DRAGON_SPAWN_EGG;

    public static ItemType<ItemEnderEyeStack> ENDER_EYE;

    public static ItemType<ItemEnderPearlStack> ENDER_PEARL;

    public static ItemType<ItemEndermanSpawnEggStack> ENDERMAN_SPAWN_EGG;

    public static ItemType<ItemEndermiteSpawnEggStack> ENDERMITE_SPAWN_EGG;

    public static ItemType<ItemEvokerSpawnEggStack> EVOKER_SPAWN_EGG;

    public static ItemType<ItemExperienceBottleStack> EXPERIENCE_BOTTLE;

    public static ItemType<ItemExplorerPotterySherdStack> EXPLORER_POTTERY_SHERD;

    public static ItemType<ItemExposedChiseledCopperStack> EXPOSED_CHISELED_COPPER;

    public static ItemType<ItemExposedCopperStack> EXPOSED_COPPER;

    public static ItemType<ItemExposedCopperBulbStack> EXPOSED_COPPER_BULB;

    public static ItemType<ItemExposedCopperDoorStack> EXPOSED_COPPER_DOOR;

    public static ItemType<ItemExposedCopperGrateStack> EXPOSED_COPPER_GRATE;

    public static ItemType<ItemExposedCopperTrapdoorStack> EXPOSED_COPPER_TRAPDOOR;

    public static ItemType<ItemExposedCutCopperStack> EXPOSED_CUT_COPPER;

    public static ItemType<ItemExposedCutCopperSlabStack> EXPOSED_CUT_COPPER_SLAB;

    public static ItemType<ItemExposedCutCopperStairsStack> EXPOSED_CUT_COPPER_STAIRS;

    public static ItemType<ItemExposedDoubleCutCopperSlabStack> EXPOSED_DOUBLE_CUT_COPPER_SLAB;

    public static ItemType<ItemEyeArmorTrimSmithingTemplateStack> EYE_ARMOR_TRIM_SMITHING_TEMPLATE;

    public static ItemType<ItemFarmlandStack> FARMLAND;

    public static ItemType<ItemFeatherStack> FEATHER;

    public static ItemType<ItemFenceStack> FENCE;

    public static ItemType<ItemFenceGateStack> FENCE_GATE;

    public static ItemType<ItemFermentedSpiderEyeStack> FERMENTED_SPIDER_EYE;

    public static ItemType<ItemFernStack> FERN;

    public static ItemType<ItemFieldMasonedBannerPatternStack> FIELD_MASONED_BANNER_PATTERN;

    public static ItemType<ItemFilledMapStack> FILLED_MAP;

    public static ItemType<ItemFireStack> FIRE;

    public static ItemType<ItemFireChargeStack> FIRE_CHARGE;

    public static ItemType<ItemFireCoralStack> FIRE_CORAL;

    public static ItemType<ItemFireCoralBlockStack> FIRE_CORAL_BLOCK;

    public static ItemType<ItemFireCoralFanStack> FIRE_CORAL_FAN;

    public static ItemType<ItemFireworkRocketStack> FIREWORK_ROCKET;

    public static ItemType<ItemFireworkStarStack> FIREWORK_STAR;

    public static ItemType<ItemFishingRodStack> FISHING_ROD;

    public static ItemType<ItemFletchingTableStack> FLETCHING_TABLE;

    public static ItemType<ItemFlintStack> FLINT;

    public static ItemType<ItemFlintAndSteelStack> FLINT_AND_STEEL;

    public static ItemType<ItemFlowArmorTrimSmithingTemplateStack> FLOW_ARMOR_TRIM_SMITHING_TEMPLATE;

    public static ItemType<ItemFlowBannerPatternStack> FLOW_BANNER_PATTERN;

    public static ItemType<ItemFlowPotterySherdStack> FLOW_POTTERY_SHERD;

    public static ItemType<ItemFlowerBannerPatternStack> FLOWER_BANNER_PATTERN;

    public static ItemType<ItemFlowerPotStack> FLOWER_POT;

    public static ItemType<ItemFloweringAzaleaStack> FLOWERING_AZALEA;

    public static ItemType<ItemFlowingLavaStack> FLOWING_LAVA;

    public static ItemType<ItemFlowingWaterStack> FLOWING_WATER;

    public static ItemType<ItemFoxSpawnEggStack> FOX_SPAWN_EGG;

    public static ItemType<ItemFrameStack> FRAME;

    public static ItemType<ItemFriendPotterySherdStack> FRIEND_POTTERY_SHERD;

    public static ItemType<ItemFrogSpawnStack> FROG_SPAWN;

    public static ItemType<ItemFrogSpawnEggStack> FROG_SPAWN_EGG;

    public static ItemType<ItemFrostedIceStack> FROSTED_ICE;

    public static ItemType<ItemFurnaceStack> FURNACE;

    public static ItemType<ItemGhastSpawnEggStack> GHAST_SPAWN_EGG;

    public static ItemType<ItemGhastTearStack> GHAST_TEAR;

    public static ItemType<ItemGildedBlackstoneStack> GILDED_BLACKSTONE;

    public static ItemType<ItemGlassStack> GLASS;

    public static ItemType<ItemGlassBottleStack> GLASS_BOTTLE;

    public static ItemType<ItemGlassPaneStack> GLASS_PANE;

    public static ItemType<ItemGlisteringMelonSliceStack> GLISTERING_MELON_SLICE;

    public static ItemType<ItemGlobeBannerPatternStack> GLOBE_BANNER_PATTERN;

    public static ItemType<ItemGlowBerriesStack> GLOW_BERRIES;

    public static ItemType<ItemGlowFrameStack> GLOW_FRAME;

    public static ItemType<ItemGlowInkSacStack> GLOW_INK_SAC;

    public static ItemType<ItemGlowLichenStack> GLOW_LICHEN;

    public static ItemType<ItemGlowSquidSpawnEggStack> GLOW_SQUID_SPAWN_EGG;

    public static ItemType<ItemGlowStickStack> GLOW_STICK;

    public static ItemType<ItemGlowingobsidianStack> GLOWINGOBSIDIAN;

    public static ItemType<ItemGlowstoneStack> GLOWSTONE;

    public static ItemType<ItemGlowstoneDustStack> GLOWSTONE_DUST;

    public static ItemType<ItemGoatHornStack> GOAT_HORN;

    public static ItemType<ItemGoatSpawnEggStack> GOAT_SPAWN_EGG;

    public static ItemType<ItemGoldBlockStack> GOLD_BLOCK;

    public static ItemType<ItemGoldIngotStack> GOLD_INGOT;

    public static ItemType<ItemGoldNuggetStack> GOLD_NUGGET;

    public static ItemType<ItemGoldOreStack> GOLD_ORE;

    public static ItemType<ItemGoldenAppleStack> GOLDEN_APPLE;

    public static ItemType<ItemGoldenAxeStack> GOLDEN_AXE;

    public static ItemType<ItemGoldenBootsStack> GOLDEN_BOOTS;

    public static ItemType<ItemGoldenCarrotStack> GOLDEN_CARROT;

    public static ItemType<ItemGoldenChestplateStack> GOLDEN_CHESTPLATE;

    public static ItemType<ItemGoldenHelmetStack> GOLDEN_HELMET;

    public static ItemType<ItemGoldenHoeStack> GOLDEN_HOE;

    public static ItemType<ItemGoldenHorseArmorStack> GOLDEN_HORSE_ARMOR;

    public static ItemType<ItemGoldenLeggingsStack> GOLDEN_LEGGINGS;

    public static ItemType<ItemGoldenPickaxeStack> GOLDEN_PICKAXE;

    public static ItemType<ItemGoldenRailStack> GOLDEN_RAIL;

    public static ItemType<ItemGoldenShovelStack> GOLDEN_SHOVEL;

    public static ItemType<ItemGoldenSwordStack> GOLDEN_SWORD;

    public static ItemType<ItemGraniteStack> GRANITE;

    public static ItemType<ItemGraniteStairsStack> GRANITE_STAIRS;

    public static ItemType<ItemGrassBlockStack> GRASS_BLOCK;

    public static ItemType<ItemGrassPathStack> GRASS_PATH;

    public static ItemType<ItemGravelStack> GRAVEL;

    public static ItemType<ItemGrayCandleStack> GRAY_CANDLE;

    public static ItemType<ItemGrayCandleCakeStack> GRAY_CANDLE_CAKE;

    public static ItemType<ItemGrayCarpetStack> GRAY_CARPET;

    public static ItemType<ItemGrayConcreteStack> GRAY_CONCRETE;

    public static ItemType<ItemGrayConcretePowderStack> GRAY_CONCRETE_POWDER;

    public static ItemType<ItemGrayDyeStack> GRAY_DYE;

    public static ItemType<ItemGrayGlazedTerracottaStack> GRAY_GLAZED_TERRACOTTA;

    public static ItemType<ItemGrayShulkerBoxStack> GRAY_SHULKER_BOX;

    public static ItemType<ItemGrayStainedGlassStack> GRAY_STAINED_GLASS;

    public static ItemType<ItemGrayStainedGlassPaneStack> GRAY_STAINED_GLASS_PANE;

    public static ItemType<ItemGrayTerracottaStack> GRAY_TERRACOTTA;

    public static ItemType<ItemGrayWoolStack> GRAY_WOOL;

    public static ItemType<ItemGreenCandleStack> GREEN_CANDLE;

    public static ItemType<ItemGreenCandleCakeStack> GREEN_CANDLE_CAKE;

    public static ItemType<ItemGreenCarpetStack> GREEN_CARPET;

    public static ItemType<ItemGreenConcreteStack> GREEN_CONCRETE;

    public static ItemType<ItemGreenConcretePowderStack> GREEN_CONCRETE_POWDER;

    public static ItemType<ItemGreenDyeStack> GREEN_DYE;

    public static ItemType<ItemGreenGlazedTerracottaStack> GREEN_GLAZED_TERRACOTTA;

    public static ItemType<ItemGreenShulkerBoxStack> GREEN_SHULKER_BOX;

    public static ItemType<ItemGreenStainedGlassStack> GREEN_STAINED_GLASS;

    public static ItemType<ItemGreenStainedGlassPaneStack> GREEN_STAINED_GLASS_PANE;

    public static ItemType<ItemGreenTerracottaStack> GREEN_TERRACOTTA;

    public static ItemType<ItemGreenWoolStack> GREEN_WOOL;

    public static ItemType<ItemGrindstoneStack> GRINDSTONE;

    public static ItemType<ItemGuardianSpawnEggStack> GUARDIAN_SPAWN_EGG;

    public static ItemType<ItemGunpowderStack> GUNPOWDER;

    public static ItemType<ItemGusterBannerPatternStack> GUSTER_BANNER_PATTERN;

    public static ItemType<ItemGusterPotterySherdStack> GUSTER_POTTERY_SHERD;

    public static ItemType<ItemHangingRootsStack> HANGING_ROOTS;

    public static ItemType<ItemHardBlackStainedGlassStack> HARD_BLACK_STAINED_GLASS;

    public static ItemType<ItemHardBlackStainedGlassPaneStack> HARD_BLACK_STAINED_GLASS_PANE;

    public static ItemType<ItemHardBlueStainedGlassStack> HARD_BLUE_STAINED_GLASS;

    public static ItemType<ItemHardBlueStainedGlassPaneStack> HARD_BLUE_STAINED_GLASS_PANE;

    public static ItemType<ItemHardBrownStainedGlassStack> HARD_BROWN_STAINED_GLASS;

    public static ItemType<ItemHardBrownStainedGlassPaneStack> HARD_BROWN_STAINED_GLASS_PANE;

    public static ItemType<ItemHardCyanStainedGlassStack> HARD_CYAN_STAINED_GLASS;

    public static ItemType<ItemHardCyanStainedGlassPaneStack> HARD_CYAN_STAINED_GLASS_PANE;

    public static ItemType<ItemHardGlassStack> HARD_GLASS;

    public static ItemType<ItemHardGlassPaneStack> HARD_GLASS_PANE;

    public static ItemType<ItemHardGrayStainedGlassStack> HARD_GRAY_STAINED_GLASS;

    public static ItemType<ItemHardGrayStainedGlassPaneStack> HARD_GRAY_STAINED_GLASS_PANE;

    public static ItemType<ItemHardGreenStainedGlassStack> HARD_GREEN_STAINED_GLASS;

    public static ItemType<ItemHardGreenStainedGlassPaneStack> HARD_GREEN_STAINED_GLASS_PANE;

    public static ItemType<ItemHardLightBlueStainedGlassStack> HARD_LIGHT_BLUE_STAINED_GLASS;

    public static ItemType<ItemHardLightBlueStainedGlassPaneStack> HARD_LIGHT_BLUE_STAINED_GLASS_PANE;

    public static ItemType<ItemHardLightGrayStainedGlassStack> HARD_LIGHT_GRAY_STAINED_GLASS;

    public static ItemType<ItemHardLightGrayStainedGlassPaneStack> HARD_LIGHT_GRAY_STAINED_GLASS_PANE;

    public static ItemType<ItemHardLimeStainedGlassStack> HARD_LIME_STAINED_GLASS;

    public static ItemType<ItemHardLimeStainedGlassPaneStack> HARD_LIME_STAINED_GLASS_PANE;

    public static ItemType<ItemHardMagentaStainedGlassStack> HARD_MAGENTA_STAINED_GLASS;

    public static ItemType<ItemHardMagentaStainedGlassPaneStack> HARD_MAGENTA_STAINED_GLASS_PANE;

    public static ItemType<ItemHardOrangeStainedGlassStack> HARD_ORANGE_STAINED_GLASS;

    public static ItemType<ItemHardOrangeStainedGlassPaneStack> HARD_ORANGE_STAINED_GLASS_PANE;

    public static ItemType<ItemHardPinkStainedGlassStack> HARD_PINK_STAINED_GLASS;

    public static ItemType<ItemHardPinkStainedGlassPaneStack> HARD_PINK_STAINED_GLASS_PANE;

    public static ItemType<ItemHardPurpleStainedGlassStack> HARD_PURPLE_STAINED_GLASS;

    public static ItemType<ItemHardPurpleStainedGlassPaneStack> HARD_PURPLE_STAINED_GLASS_PANE;

    public static ItemType<ItemHardRedStainedGlassStack> HARD_RED_STAINED_GLASS;

    public static ItemType<ItemHardRedStainedGlassPaneStack> HARD_RED_STAINED_GLASS_PANE;

    public static ItemType<ItemHardStainedGlassStack> HARD_STAINED_GLASS;

    public static ItemType<ItemHardStainedGlassPaneStack> HARD_STAINED_GLASS_PANE;

    public static ItemType<ItemHardWhiteStainedGlassStack> HARD_WHITE_STAINED_GLASS;

    public static ItemType<ItemHardWhiteStainedGlassPaneStack> HARD_WHITE_STAINED_GLASS_PANE;

    public static ItemType<ItemHardYellowStainedGlassStack> HARD_YELLOW_STAINED_GLASS;

    public static ItemType<ItemHardYellowStainedGlassPaneStack> HARD_YELLOW_STAINED_GLASS_PANE;

    public static ItemType<ItemHardenedClayStack> HARDENED_CLAY;

    public static ItemType<ItemHayBlockStack> HAY_BLOCK;

    public static ItemType<ItemHeartOfTheSeaStack> HEART_OF_THE_SEA;

    public static ItemType<ItemHeartPotterySherdStack> HEART_POTTERY_SHERD;

    public static ItemType<ItemHeartbreakPotterySherdStack> HEARTBREAK_POTTERY_SHERD;

    public static ItemType<ItemHeavyCoreStack> HEAVY_CORE;

    public static ItemType<ItemHeavyWeightedPressurePlateStack> HEAVY_WEIGHTED_PRESSURE_PLATE;

    public static ItemType<ItemHoglinSpawnEggStack> HOGLIN_SPAWN_EGG;

    public static ItemType<ItemHoneyBlockStack> HONEY_BLOCK;

    public static ItemType<ItemHoneyBottleStack> HONEY_BOTTLE;

    public static ItemType<ItemHoneycombStack> HONEYCOMB;

    public static ItemType<ItemHoneycombBlockStack> HONEYCOMB_BLOCK;

    public static ItemType<ItemHopperStack> HOPPER;

    public static ItemType<ItemHopperMinecartStack> HOPPER_MINECART;

    public static ItemType<ItemHornCoralStack> HORN_CORAL;

    public static ItemType<ItemHornCoralBlockStack> HORN_CORAL_BLOCK;

    public static ItemType<ItemHornCoralFanStack> HORN_CORAL_FAN;

    public static ItemType<ItemHorseSpawnEggStack> HORSE_SPAWN_EGG;

    public static ItemType<ItemHostArmorTrimSmithingTemplateStack> HOST_ARMOR_TRIM_SMITHING_TEMPLATE;

    public static ItemType<ItemHowlPotterySherdStack> HOWL_POTTERY_SHERD;

    public static ItemType<ItemHuskSpawnEggStack> HUSK_SPAWN_EGG;

    public static ItemType<ItemIceStack> ICE;

    public static ItemType<ItemIceBombStack> ICE_BOMB;

    public static ItemType<ItemInfestedDeepslateStack> INFESTED_DEEPSLATE;

    public static ItemType<ItemInfoUpdateStack> INFO_UPDATE;

    public static ItemType<ItemInfoUpdate2Stack> INFO_UPDATE2;

    public static ItemType<ItemInkSacStack> INK_SAC;

    public static ItemType<ItemInvisibleBedrockStack> INVISIBLE_BEDROCK;

    public static ItemType<ItemIronAxeStack> IRON_AXE;

    public static ItemType<ItemIronBarsStack> IRON_BARS;

    public static ItemType<ItemIronBlockStack> IRON_BLOCK;

    public static ItemType<ItemIronBootsStack> IRON_BOOTS;

    public static ItemType<ItemIronChestplateStack> IRON_CHESTPLATE;

    public static ItemType<ItemIronDoorStack> IRON_DOOR;

    public static ItemType<ItemIronGolemSpawnEggStack> IRON_GOLEM_SPAWN_EGG;

    public static ItemType<ItemIronHelmetStack> IRON_HELMET;

    public static ItemType<ItemIronHoeStack> IRON_HOE;

    public static ItemType<ItemIronHorseArmorStack> IRON_HORSE_ARMOR;

    public static ItemType<ItemIronIngotStack> IRON_INGOT;

    public static ItemType<ItemIronLeggingsStack> IRON_LEGGINGS;

    public static ItemType<ItemIronNuggetStack> IRON_NUGGET;

    public static ItemType<ItemIronOreStack> IRON_ORE;

    public static ItemType<ItemIronPickaxeStack> IRON_PICKAXE;

    public static ItemType<ItemIronShovelStack> IRON_SHOVEL;

    public static ItemType<ItemIronSwordStack> IRON_SWORD;

    public static ItemType<ItemIronTrapdoorStack> IRON_TRAPDOOR;

    public static ItemType<ItemItemAcaciaDoorStack> ITEM_ACACIA_DOOR;

    public static ItemType<ItemItemBedStack> ITEM_BED;

    public static ItemType<ItemItemBeetrootStack> ITEM_BEETROOT;

    public static ItemType<ItemItemBirchDoorStack> ITEM_BIRCH_DOOR;

    public static ItemType<ItemItemBrewingStandStack> ITEM_BREWING_STAND;

    public static ItemType<ItemItemCakeStack> ITEM_CAKE;

    public static ItemType<ItemItemCameraStack> ITEM_CAMERA;

    public static ItemType<ItemItemCampfireStack> ITEM_CAMPFIRE;

    public static ItemType<ItemItemCauldronStack> ITEM_CAULDRON;

    public static ItemType<ItemItemChainStack> ITEM_CHAIN;

    public static ItemType<ItemItemCrimsonDoorStack> ITEM_CRIMSON_DOOR;

    public static ItemType<ItemItemDarkOakDoorStack> ITEM_DARK_OAK_DOOR;

    public static ItemType<ItemItemFlowerPotStack> ITEM_FLOWER_POT;

    public static ItemType<ItemItemFrameStack> ITEM_FRAME;

    public static ItemType<ItemItemGlowFrameStack> ITEM_GLOW_FRAME;

    public static ItemType<ItemItemHopperStack> ITEM_HOPPER;

    public static ItemType<ItemItemIronDoorStack> ITEM_IRON_DOOR;

    public static ItemType<ItemItemJungleDoorStack> ITEM_JUNGLE_DOOR;

    public static ItemType<ItemItemKelpStack> ITEM_KELP;

    public static ItemType<ItemItemMangroveDoorStack> ITEM_MANGROVE_DOOR;

    public static ItemType<ItemItemNetherSproutsStack> ITEM_NETHER_SPROUTS;

    public static ItemType<ItemItemNetherWartStack> ITEM_NETHER_WART;

    public static ItemType<ItemItemReedsStack> ITEM_REEDS;

    public static ItemType<ItemItemSkullStack> ITEM_SKULL;

    public static ItemType<ItemItemSoulCampfireStack> ITEM_SOUL_CAMPFIRE;

    public static ItemType<ItemItemSpruceDoorStack> ITEM_SPRUCE_DOOR;

    public static ItemType<ItemItemWarpedDoorStack> ITEM_WARPED_DOOR;

    public static ItemType<ItemItemWheatStack> ITEM_WHEAT;

    public static ItemType<ItemItemWoodenDoorStack> ITEM_WOODEN_DOOR;

    public static ItemType<ItemJigsawStack> JIGSAW;

    public static ItemType<ItemJukeboxStack> JUKEBOX;

    public static ItemType<ItemJungleBoatStack> JUNGLE_BOAT;

    public static ItemType<ItemJungleButtonStack> JUNGLE_BUTTON;

    public static ItemType<ItemJungleChestBoatStack> JUNGLE_CHEST_BOAT;

    public static ItemType<ItemJungleDoorStack> JUNGLE_DOOR;

    public static ItemType<ItemJungleDoubleSlabStack> JUNGLE_DOUBLE_SLAB;

    public static ItemType<ItemJungleFenceStack> JUNGLE_FENCE;

    public static ItemType<ItemJungleFenceGateStack> JUNGLE_FENCE_GATE;

    public static ItemType<ItemJungleHangingSignStack> JUNGLE_HANGING_SIGN;

    public static ItemType<ItemJungleLeavesStack> JUNGLE_LEAVES;

    public static ItemType<ItemJungleLogStack> JUNGLE_LOG;

    public static ItemType<ItemJunglePlanksStack> JUNGLE_PLANKS;

    public static ItemType<ItemJunglePressurePlateStack> JUNGLE_PRESSURE_PLATE;

    public static ItemType<ItemJungleSaplingStack> JUNGLE_SAPLING;

    public static ItemType<ItemJungleSignStack> JUNGLE_SIGN;

    public static ItemType<ItemJungleSlabStack> JUNGLE_SLAB;

    public static ItemType<ItemJungleStairsStack> JUNGLE_STAIRS;

    public static ItemType<ItemJungleStandingSignStack> JUNGLE_STANDING_SIGN;

    public static ItemType<ItemJungleTrapdoorStack> JUNGLE_TRAPDOOR;

    public static ItemType<ItemJungleWallSignStack> JUNGLE_WALL_SIGN;

    public static ItemType<ItemJungleWoodStack> JUNGLE_WOOD;

    public static ItemType<ItemKelpStack> KELP;

    public static ItemType<ItemLadderStack> LADDER;

    public static ItemType<ItemLanternStack> LANTERN;

    public static ItemType<ItemLapisBlockStack> LAPIS_BLOCK;

    public static ItemType<ItemLapisLazuliStack> LAPIS_LAZULI;

    public static ItemType<ItemLapisOreStack> LAPIS_ORE;

    public static ItemType<ItemLargeAmethystBudStack> LARGE_AMETHYST_BUD;

    public static ItemType<ItemLargeFernStack> LARGE_FERN;

    public static ItemType<ItemLavaStack> LAVA;

    public static ItemType<ItemLavaBucketStack> LAVA_BUCKET;

    public static ItemType<ItemLeadStack> LEAD;

    public static ItemType<ItemLeatherStack> LEATHER;

    public static ItemType<ItemLeatherBootsStack> LEATHER_BOOTS;

    public static ItemType<ItemLeatherChestplateStack> LEATHER_CHESTPLATE;

    public static ItemType<ItemLeatherHelmetStack> LEATHER_HELMET;

    public static ItemType<ItemLeatherHorseArmorStack> LEATHER_HORSE_ARMOR;

    public static ItemType<ItemLeatherLeggingsStack> LEATHER_LEGGINGS;

    public static ItemType<ItemLeavesStack> LEAVES;

    public static ItemType<ItemLeaves2Stack> LEAVES2;

    public static ItemType<ItemLecternStack> LECTERN;

    public static ItemType<ItemLeverStack> LEVER;

    public static ItemType<ItemLightBlockStack> LIGHT_BLOCK;

    public static ItemType<ItemLightBlueCandleStack> LIGHT_BLUE_CANDLE;

    public static ItemType<ItemLightBlueCandleCakeStack> LIGHT_BLUE_CANDLE_CAKE;

    public static ItemType<ItemLightBlueCarpetStack> LIGHT_BLUE_CARPET;

    public static ItemType<ItemLightBlueConcreteStack> LIGHT_BLUE_CONCRETE;

    public static ItemType<ItemLightBlueConcretePowderStack> LIGHT_BLUE_CONCRETE_POWDER;

    public static ItemType<ItemLightBlueDyeStack> LIGHT_BLUE_DYE;

    public static ItemType<ItemLightBlueGlazedTerracottaStack> LIGHT_BLUE_GLAZED_TERRACOTTA;

    public static ItemType<ItemLightBlueShulkerBoxStack> LIGHT_BLUE_SHULKER_BOX;

    public static ItemType<ItemLightBlueStainedGlassStack> LIGHT_BLUE_STAINED_GLASS;

    public static ItemType<ItemLightBlueStainedGlassPaneStack> LIGHT_BLUE_STAINED_GLASS_PANE;

    public static ItemType<ItemLightBlueTerracottaStack> LIGHT_BLUE_TERRACOTTA;

    public static ItemType<ItemLightBlueWoolStack> LIGHT_BLUE_WOOL;

    public static ItemType<ItemLightGrayCandleStack> LIGHT_GRAY_CANDLE;

    public static ItemType<ItemLightGrayCandleCakeStack> LIGHT_GRAY_CANDLE_CAKE;

    public static ItemType<ItemLightGrayCarpetStack> LIGHT_GRAY_CARPET;

    public static ItemType<ItemLightGrayConcreteStack> LIGHT_GRAY_CONCRETE;

    public static ItemType<ItemLightGrayConcretePowderStack> LIGHT_GRAY_CONCRETE_POWDER;

    public static ItemType<ItemLightGrayDyeStack> LIGHT_GRAY_DYE;

    public static ItemType<ItemLightGrayShulkerBoxStack> LIGHT_GRAY_SHULKER_BOX;

    public static ItemType<ItemLightGrayStainedGlassStack> LIGHT_GRAY_STAINED_GLASS;

    public static ItemType<ItemLightGrayStainedGlassPaneStack> LIGHT_GRAY_STAINED_GLASS_PANE;

    public static ItemType<ItemLightGrayTerracottaStack> LIGHT_GRAY_TERRACOTTA;

    public static ItemType<ItemLightGrayWoolStack> LIGHT_GRAY_WOOL;

    public static ItemType<ItemLightWeightedPressurePlateStack> LIGHT_WEIGHTED_PRESSURE_PLATE;

    public static ItemType<ItemLightningRodStack> LIGHTNING_ROD;

    public static ItemType<ItemLilacStack> LILAC;

    public static ItemType<ItemLilyOfTheValleyStack> LILY_OF_THE_VALLEY;

    public static ItemType<ItemLimeCandleStack> LIME_CANDLE;

    public static ItemType<ItemLimeCandleCakeStack> LIME_CANDLE_CAKE;

    public static ItemType<ItemLimeCarpetStack> LIME_CARPET;

    public static ItemType<ItemLimeConcreteStack> LIME_CONCRETE;

    public static ItemType<ItemLimeConcretePowderStack> LIME_CONCRETE_POWDER;

    public static ItemType<ItemLimeDyeStack> LIME_DYE;

    public static ItemType<ItemLimeGlazedTerracottaStack> LIME_GLAZED_TERRACOTTA;

    public static ItemType<ItemLimeShulkerBoxStack> LIME_SHULKER_BOX;

    public static ItemType<ItemLimeStainedGlassStack> LIME_STAINED_GLASS;

    public static ItemType<ItemLimeStainedGlassPaneStack> LIME_STAINED_GLASS_PANE;

    public static ItemType<ItemLimeTerracottaStack> LIME_TERRACOTTA;

    public static ItemType<ItemLimeWoolStack> LIME_WOOL;

    public static ItemType<ItemLingeringPotionStack> LINGERING_POTION;

    public static ItemType<ItemLitBlastFurnaceStack> LIT_BLAST_FURNACE;

    public static ItemType<ItemLitDeepslateRedstoneOreStack> LIT_DEEPSLATE_REDSTONE_ORE;

    public static ItemType<ItemLitFurnaceStack> LIT_FURNACE;

    public static ItemType<ItemLitPumpkinStack> LIT_PUMPKIN;

    public static ItemType<ItemLitRedstoneLampStack> LIT_REDSTONE_LAMP;

    public static ItemType<ItemLitRedstoneOreStack> LIT_REDSTONE_ORE;

    public static ItemType<ItemLitSmokerStack> LIT_SMOKER;

    public static ItemType<ItemLlamaSpawnEggStack> LLAMA_SPAWN_EGG;

    public static ItemType<ItemLodestoneStack> LODESTONE;

    public static ItemType<ItemLodestoneCompassStack> LODESTONE_COMPASS;

    public static ItemType<ItemLogStack> LOG;

    public static ItemType<ItemLog2Stack> LOG2;

    public static ItemType<ItemLoomStack> LOOM;

    public static ItemType<ItemMaceStack> MACE;

    public static ItemType<ItemMagentaCandleStack> MAGENTA_CANDLE;

    public static ItemType<ItemMagentaCandleCakeStack> MAGENTA_CANDLE_CAKE;

    public static ItemType<ItemMagentaCarpetStack> MAGENTA_CARPET;

    public static ItemType<ItemMagentaConcreteStack> MAGENTA_CONCRETE;

    public static ItemType<ItemMagentaConcretePowderStack> MAGENTA_CONCRETE_POWDER;

    public static ItemType<ItemMagentaDyeStack> MAGENTA_DYE;

    public static ItemType<ItemMagentaGlazedTerracottaStack> MAGENTA_GLAZED_TERRACOTTA;

    public static ItemType<ItemMagentaShulkerBoxStack> MAGENTA_SHULKER_BOX;

    public static ItemType<ItemMagentaStainedGlassStack> MAGENTA_STAINED_GLASS;

    public static ItemType<ItemMagentaStainedGlassPaneStack> MAGENTA_STAINED_GLASS_PANE;

    public static ItemType<ItemMagentaTerracottaStack> MAGENTA_TERRACOTTA;

    public static ItemType<ItemMagentaWoolStack> MAGENTA_WOOL;

    public static ItemType<ItemMagmaStack> MAGMA;

    public static ItemType<ItemMagmaCreamStack> MAGMA_CREAM;

    public static ItemType<ItemMagmaCubeSpawnEggStack> MAGMA_CUBE_SPAWN_EGG;

    public static ItemType<ItemMangroveBoatStack> MANGROVE_BOAT;

    public static ItemType<ItemMangroveButtonStack> MANGROVE_BUTTON;

    public static ItemType<ItemMangroveChestBoatStack> MANGROVE_CHEST_BOAT;

    public static ItemType<ItemMangroveDoorStack> MANGROVE_DOOR;

    public static ItemType<ItemMangroveDoubleSlabStack> MANGROVE_DOUBLE_SLAB;

    public static ItemType<ItemMangroveFenceStack> MANGROVE_FENCE;

    public static ItemType<ItemMangroveFenceGateStack> MANGROVE_FENCE_GATE;

    public static ItemType<ItemMangroveHangingSignStack> MANGROVE_HANGING_SIGN;

    public static ItemType<ItemMangroveLeavesStack> MANGROVE_LEAVES;

    public static ItemType<ItemMangroveLogStack> MANGROVE_LOG;

    public static ItemType<ItemMangrovePlanksStack> MANGROVE_PLANKS;

    public static ItemType<ItemMangrovePressurePlateStack> MANGROVE_PRESSURE_PLATE;

    public static ItemType<ItemMangrovePropaguleStack> MANGROVE_PROPAGULE;

    public static ItemType<ItemMangroveRootsStack> MANGROVE_ROOTS;

    public static ItemType<ItemMangroveSignStack> MANGROVE_SIGN;

    public static ItemType<ItemMangroveSlabStack> MANGROVE_SLAB;

    public static ItemType<ItemMangroveStairsStack> MANGROVE_STAIRS;

    public static ItemType<ItemMangroveStandingSignStack> MANGROVE_STANDING_SIGN;

    public static ItemType<ItemMangroveTrapdoorStack> MANGROVE_TRAPDOOR;

    public static ItemType<ItemMangroveWallSignStack> MANGROVE_WALL_SIGN;

    public static ItemType<ItemMangroveWoodStack> MANGROVE_WOOD;

    public static ItemType<ItemMedicineStack> MEDICINE;

    public static ItemType<ItemMediumAmethystBudStack> MEDIUM_AMETHYST_BUD;

    public static ItemType<ItemMelonBlockStack> MELON_BLOCK;

    public static ItemType<ItemMelonSeedsStack> MELON_SEEDS;

    public static ItemType<ItemMelonSliceStack> MELON_SLICE;

    public static ItemType<ItemMelonStemStack> MELON_STEM;

    public static ItemType<ItemMilkBucketStack> MILK_BUCKET;

    public static ItemType<ItemMinecartStack> MINECART;

    public static ItemType<ItemMinerPotterySherdStack> MINER_POTTERY_SHERD;

    public static ItemType<ItemMobSpawnerStack> MOB_SPAWNER;

    public static ItemType<ItemMojangBannerPatternStack> MOJANG_BANNER_PATTERN;

    public static ItemType<ItemMonsterEggStack> MONSTER_EGG;

    public static ItemType<ItemMooshroomSpawnEggStack> MOOSHROOM_SPAWN_EGG;

    public static ItemType<ItemMossBlockStack> MOSS_BLOCK;

    public static ItemType<ItemMossCarpetStack> MOSS_CARPET;

    public static ItemType<ItemMossyCobblestoneStack> MOSSY_COBBLESTONE;

    public static ItemType<ItemMossyCobblestoneStairsStack> MOSSY_COBBLESTONE_STAIRS;

    public static ItemType<ItemMossyStoneBrickStairsStack> MOSSY_STONE_BRICK_STAIRS;

    public static ItemType<ItemMournerPotterySherdStack> MOURNER_POTTERY_SHERD;

    public static ItemType<ItemMovingBlockStack> MOVING_BLOCK;

    public static ItemType<ItemMudStack> MUD;

    public static ItemType<ItemMudBrickDoubleSlabStack> MUD_BRICK_DOUBLE_SLAB;

    public static ItemType<ItemMudBrickSlabStack> MUD_BRICK_SLAB;

    public static ItemType<ItemMudBrickStairsStack> MUD_BRICK_STAIRS;

    public static ItemType<ItemMudBrickWallStack> MUD_BRICK_WALL;

    public static ItemType<ItemMudBricksStack> MUD_BRICKS;

    public static ItemType<ItemMuddyMangroveRootsStack> MUDDY_MANGROVE_ROOTS;

    public static ItemType<ItemMuleSpawnEggStack> MULE_SPAWN_EGG;

    public static ItemType<ItemMushroomStewStack> MUSHROOM_STEW;

    public static ItemType<ItemMusicDisc11Stack> MUSIC_DISC_11;

    public static ItemType<ItemMusicDisc13Stack> MUSIC_DISC_13;

    public static ItemType<ItemMusicDisc5Stack> MUSIC_DISC_5;

    public static ItemType<ItemMusicDiscBlocksStack> MUSIC_DISC_BLOCKS;

    public static ItemType<ItemMusicDiscCatStack> MUSIC_DISC_CAT;

    public static ItemType<ItemMusicDiscChirpStack> MUSIC_DISC_CHIRP;

    public static ItemType<ItemMusicDiscCreatorStack> MUSIC_DISC_CREATOR;

    public static ItemType<ItemMusicDiscCreatorMusicBoxStack> MUSIC_DISC_CREATOR_MUSIC_BOX;

    public static ItemType<ItemMusicDiscFarStack> MUSIC_DISC_FAR;

    public static ItemType<ItemMusicDiscMallStack> MUSIC_DISC_MALL;

    public static ItemType<ItemMusicDiscMellohiStack> MUSIC_DISC_MELLOHI;

    public static ItemType<ItemMusicDiscOthersideStack> MUSIC_DISC_OTHERSIDE;

    public static ItemType<ItemMusicDiscPigstepStack> MUSIC_DISC_PIGSTEP;

    public static ItemType<ItemMusicDiscPrecipiceStack> MUSIC_DISC_PRECIPICE;

    public static ItemType<ItemMusicDiscRelicStack> MUSIC_DISC_RELIC;

    public static ItemType<ItemMusicDiscStalStack> MUSIC_DISC_STAL;

    public static ItemType<ItemMusicDiscStradStack> MUSIC_DISC_STRAD;

    public static ItemType<ItemMusicDiscWaitStack> MUSIC_DISC_WAIT;

    public static ItemType<ItemMusicDiscWardStack> MUSIC_DISC_WARD;

    public static ItemType<ItemMuttonStack> MUTTON;

    public static ItemType<ItemMyceliumStack> MYCELIUM;

    public static ItemType<ItemNameTagStack> NAME_TAG;

    public static ItemType<ItemNautilusShellStack> NAUTILUS_SHELL;

    public static ItemType<ItemNetherBrickStack> NETHER_BRICK;

    public static ItemType<ItemNetherBrickFenceStack> NETHER_BRICK_FENCE;

    public static ItemType<ItemNetherBrickSlabStack> NETHER_BRICK_SLAB;

    public static ItemType<ItemNetherBrickStairsStack> NETHER_BRICK_STAIRS;

    public static ItemType<ItemNetherGoldOreStack> NETHER_GOLD_ORE;

    public static ItemType<ItemNetherSproutsStack> NETHER_SPROUTS;

    public static ItemType<ItemNetherStarStack> NETHER_STAR;

    public static ItemType<ItemNetherWartStack> NETHER_WART;

    public static ItemType<ItemNetherWartBlockStack> NETHER_WART_BLOCK;

    public static ItemType<ItemNetherbrick0Stack> NETHERBRICK;

    public static ItemType<ItemNetheriteAxeStack> NETHERITE_AXE;

    public static ItemType<ItemNetheriteBlockStack> NETHERITE_BLOCK;

    public static ItemType<ItemNetheriteBootsStack> NETHERITE_BOOTS;

    public static ItemType<ItemNetheriteChestplateStack> NETHERITE_CHESTPLATE;

    public static ItemType<ItemNetheriteHelmetStack> NETHERITE_HELMET;

    public static ItemType<ItemNetheriteHoeStack> NETHERITE_HOE;

    public static ItemType<ItemNetheriteIngotStack> NETHERITE_INGOT;

    public static ItemType<ItemNetheriteLeggingsStack> NETHERITE_LEGGINGS;

    public static ItemType<ItemNetheritePickaxeStack> NETHERITE_PICKAXE;

    public static ItemType<ItemNetheriteScrapStack> NETHERITE_SCRAP;

    public static ItemType<ItemNetheriteShovelStack> NETHERITE_SHOVEL;

    public static ItemType<ItemNetheriteSwordStack> NETHERITE_SWORD;

    public static ItemType<ItemNetheriteUpgradeSmithingTemplateStack> NETHERITE_UPGRADE_SMITHING_TEMPLATE;

    public static ItemType<ItemNetherrackStack> NETHERRACK;

    public static ItemType<ItemNetherreactorStack> NETHERREACTOR;

    public static ItemType<ItemNormalStoneStairsStack> NORMAL_STONE_STAIRS;

    public static ItemType<ItemNoteblockStack> NOTEBLOCK;

    public static ItemType<ItemNpcSpawnEggStack> NPC_SPAWN_EGG;

    public static ItemType<ItemOakBoatStack> OAK_BOAT;

    public static ItemType<ItemOakChestBoatStack> OAK_CHEST_BOAT;

    public static ItemType<ItemOakDoubleSlabStack> OAK_DOUBLE_SLAB;

    public static ItemType<ItemOakFenceStack> OAK_FENCE;

    public static ItemType<ItemOakHangingSignStack> OAK_HANGING_SIGN;

    public static ItemType<ItemOakLeavesStack> OAK_LEAVES;

    public static ItemType<ItemOakLogStack> OAK_LOG;

    public static ItemType<ItemOakPlanksStack> OAK_PLANKS;

    public static ItemType<ItemOakSaplingStack> OAK_SAPLING;

    public static ItemType<ItemOakSignStack> OAK_SIGN;

    public static ItemType<ItemOakSlabStack> OAK_SLAB;

    public static ItemType<ItemOakStairsStack> OAK_STAIRS;

    public static ItemType<ItemOakWoodStack> OAK_WOOD;

    public static ItemType<ItemObserverStack> OBSERVER;

    public static ItemType<ItemObsidianStack> OBSIDIAN;

    public static ItemType<ItemOcelotSpawnEggStack> OCELOT_SPAWN_EGG;

    public static ItemType<ItemOchreFroglightStack> OCHRE_FROGLIGHT;

    public static ItemType<ItemOminousBottleStack> OMINOUS_BOTTLE;

    public static ItemType<ItemOminousTrialKeyStack> OMINOUS_TRIAL_KEY;

    public static ItemType<ItemOrangeCandleStack> ORANGE_CANDLE;

    public static ItemType<ItemOrangeCandleCakeStack> ORANGE_CANDLE_CAKE;

    public static ItemType<ItemOrangeCarpetStack> ORANGE_CARPET;

    public static ItemType<ItemOrangeConcreteStack> ORANGE_CONCRETE;

    public static ItemType<ItemOrangeConcretePowderStack> ORANGE_CONCRETE_POWDER;

    public static ItemType<ItemOrangeDyeStack> ORANGE_DYE;

    public static ItemType<ItemOrangeGlazedTerracottaStack> ORANGE_GLAZED_TERRACOTTA;

    public static ItemType<ItemOrangeShulkerBoxStack> ORANGE_SHULKER_BOX;

    public static ItemType<ItemOrangeStainedGlassStack> ORANGE_STAINED_GLASS;

    public static ItemType<ItemOrangeStainedGlassPaneStack> ORANGE_STAINED_GLASS_PANE;

    public static ItemType<ItemOrangeTerracottaStack> ORANGE_TERRACOTTA;

    public static ItemType<ItemOrangeTulipStack> ORANGE_TULIP;

    public static ItemType<ItemOrangeWoolStack> ORANGE_WOOL;

    public static ItemType<ItemOxeyeDaisyStack> OXEYE_DAISY;

    public static ItemType<ItemOxidizedChiseledCopperStack> OXIDIZED_CHISELED_COPPER;

    public static ItemType<ItemOxidizedCopperStack> OXIDIZED_COPPER;

    public static ItemType<ItemOxidizedCopperBulbStack> OXIDIZED_COPPER_BULB;

    public static ItemType<ItemOxidizedCopperDoorStack> OXIDIZED_COPPER_DOOR;

    public static ItemType<ItemOxidizedCopperGrateStack> OXIDIZED_COPPER_GRATE;

    public static ItemType<ItemOxidizedCopperTrapdoorStack> OXIDIZED_COPPER_TRAPDOOR;

    public static ItemType<ItemOxidizedCutCopperStack> OXIDIZED_CUT_COPPER;

    public static ItemType<ItemOxidizedCutCopperSlabStack> OXIDIZED_CUT_COPPER_SLAB;

    public static ItemType<ItemOxidizedCutCopperStairsStack> OXIDIZED_CUT_COPPER_STAIRS;

    public static ItemType<ItemOxidizedDoubleCutCopperSlabStack> OXIDIZED_DOUBLE_CUT_COPPER_SLAB;

    public static ItemType<ItemPackedIceStack> PACKED_ICE;

    public static ItemType<ItemPackedMudStack> PACKED_MUD;

    public static ItemType<ItemPaintingStack> PAINTING;

    public static ItemType<ItemPandaSpawnEggStack> PANDA_SPAWN_EGG;

    public static ItemType<ItemPaperStack> PAPER;

    public static ItemType<ItemParrotSpawnEggStack> PARROT_SPAWN_EGG;

    public static ItemType<ItemPearlescentFroglightStack> PEARLESCENT_FROGLIGHT;

    public static ItemType<ItemPeonyStack> PEONY;

    public static ItemType<ItemPetrifiedOakSlabStack> PETRIFIED_OAK_SLAB;

    public static ItemType<ItemPhantomMembraneStack> PHANTOM_MEMBRANE;

    public static ItemType<ItemPhantomSpawnEggStack> PHANTOM_SPAWN_EGG;

    public static ItemType<ItemPigSpawnEggStack> PIG_SPAWN_EGG;

    public static ItemType<ItemPiglinBannerPatternStack> PIGLIN_BANNER_PATTERN;

    public static ItemType<ItemPiglinBruteSpawnEggStack> PIGLIN_BRUTE_SPAWN_EGG;

    public static ItemType<ItemPiglinSpawnEggStack> PIGLIN_SPAWN_EGG;

    public static ItemType<ItemPillagerSpawnEggStack> PILLAGER_SPAWN_EGG;

    public static ItemType<ItemPinkCandleStack> PINK_CANDLE;

    public static ItemType<ItemPinkCandleCakeStack> PINK_CANDLE_CAKE;

    public static ItemType<ItemPinkCarpetStack> PINK_CARPET;

    public static ItemType<ItemPinkConcreteStack> PINK_CONCRETE;

    public static ItemType<ItemPinkConcretePowderStack> PINK_CONCRETE_POWDER;

    public static ItemType<ItemPinkDyeStack> PINK_DYE;

    public static ItemType<ItemPinkGlazedTerracottaStack> PINK_GLAZED_TERRACOTTA;

    public static ItemType<ItemPinkPetalsStack> PINK_PETALS;

    public static ItemType<ItemPinkShulkerBoxStack> PINK_SHULKER_BOX;

    public static ItemType<ItemPinkStainedGlassStack> PINK_STAINED_GLASS;

    public static ItemType<ItemPinkStainedGlassPaneStack> PINK_STAINED_GLASS_PANE;

    public static ItemType<ItemPinkTerracottaStack> PINK_TERRACOTTA;

    public static ItemType<ItemPinkTulipStack> PINK_TULIP;

    public static ItemType<ItemPinkWoolStack> PINK_WOOL;

    public static ItemType<ItemPistonStack> PISTON;

    public static ItemType<ItemPistonArmCollisionStack> PISTON_ARM_COLLISION;

    public static ItemType<ItemPitcherCropStack> PITCHER_CROP;

    public static ItemType<ItemPitcherPlantStack> PITCHER_PLANT;

    public static ItemType<ItemPitcherPodStack> PITCHER_POD;

    public static ItemType<ItemPlanksStack> PLANKS;

    public static ItemType<ItemPlentyPotterySherdStack> PLENTY_POTTERY_SHERD;

    public static ItemType<ItemPodzolStack> PODZOL;

    public static ItemType<ItemPointedDripstoneStack> POINTED_DRIPSTONE;

    public static ItemType<ItemPoisonousPotatoStack> POISONOUS_POTATO;

    public static ItemType<ItemPolarBearSpawnEggStack> POLAR_BEAR_SPAWN_EGG;

    public static ItemType<ItemPolishedAndesiteStack> POLISHED_ANDESITE;

    public static ItemType<ItemPolishedAndesiteStairsStack> POLISHED_ANDESITE_STAIRS;

    public static ItemType<ItemPolishedBasaltStack> POLISHED_BASALT;

    public static ItemType<ItemPolishedBlackstoneStack> POLISHED_BLACKSTONE;

    public static ItemType<ItemPolishedBlackstoneBrickDoubleSlabStack> POLISHED_BLACKSTONE_BRICK_DOUBLE_SLAB;

    public static ItemType<ItemPolishedBlackstoneBrickSlabStack> POLISHED_BLACKSTONE_BRICK_SLAB;

    public static ItemType<ItemPolishedBlackstoneBrickStairsStack> POLISHED_BLACKSTONE_BRICK_STAIRS;

    public static ItemType<ItemPolishedBlackstoneBrickWallStack> POLISHED_BLACKSTONE_BRICK_WALL;

    public static ItemType<ItemPolishedBlackstoneBricksStack> POLISHED_BLACKSTONE_BRICKS;

    public static ItemType<ItemPolishedBlackstoneButtonStack> POLISHED_BLACKSTONE_BUTTON;

    public static ItemType<ItemPolishedBlackstoneDoubleSlabStack> POLISHED_BLACKSTONE_DOUBLE_SLAB;

    public static ItemType<ItemPolishedBlackstonePressurePlateStack> POLISHED_BLACKSTONE_PRESSURE_PLATE;

    public static ItemType<ItemPolishedBlackstoneSlabStack> POLISHED_BLACKSTONE_SLAB;

    public static ItemType<ItemPolishedBlackstoneStairsStack> POLISHED_BLACKSTONE_STAIRS;

    public static ItemType<ItemPolishedBlackstoneWallStack> POLISHED_BLACKSTONE_WALL;

    public static ItemType<ItemPolishedDeepslateStack> POLISHED_DEEPSLATE;

    public static ItemType<ItemPolishedDeepslateDoubleSlabStack> POLISHED_DEEPSLATE_DOUBLE_SLAB;

    public static ItemType<ItemPolishedDeepslateSlabStack> POLISHED_DEEPSLATE_SLAB;

    public static ItemType<ItemPolishedDeepslateStairsStack> POLISHED_DEEPSLATE_STAIRS;

    public static ItemType<ItemPolishedDeepslateWallStack> POLISHED_DEEPSLATE_WALL;

    public static ItemType<ItemPolishedDioriteStack> POLISHED_DIORITE;

    public static ItemType<ItemPolishedDioriteStairsStack> POLISHED_DIORITE_STAIRS;

    public static ItemType<ItemPolishedGraniteStack> POLISHED_GRANITE;

    public static ItemType<ItemPolishedGraniteStairsStack> POLISHED_GRANITE_STAIRS;

    public static ItemType<ItemPolishedTuffStack> POLISHED_TUFF;

    public static ItemType<ItemPolishedTuffDoubleSlabStack> POLISHED_TUFF_DOUBLE_SLAB;

    public static ItemType<ItemPolishedTuffSlabStack> POLISHED_TUFF_SLAB;

    public static ItemType<ItemPolishedTuffStairsStack> POLISHED_TUFF_STAIRS;

    public static ItemType<ItemPolishedTuffWallStack> POLISHED_TUFF_WALL;

    public static ItemType<ItemPoppedChorusFruitStack> POPPED_CHORUS_FRUIT;

    public static ItemType<ItemPoppyStack> POPPY;

    public static ItemType<ItemPorkchopStack> PORKCHOP;

    public static ItemType<ItemPortalStack> PORTAL;

    public static ItemType<ItemPotatoStack> POTATO;

    public static ItemType<ItemPotatoesStack> POTATOES;

    public static ItemType<ItemPotionStack> POTION;

    public static ItemType<ItemPowderSnowStack> POWDER_SNOW;

    public static ItemType<ItemPowderSnowBucketStack> POWDER_SNOW_BUCKET;

    public static ItemType<ItemPoweredComparatorStack> POWERED_COMPARATOR;

    public static ItemType<ItemPoweredRepeaterStack> POWERED_REPEATER;

    public static ItemType<ItemPrismarineStack> PRISMARINE;

    public static ItemType<ItemPrismarineBricksStairsStack> PRISMARINE_BRICKS_STAIRS;

    public static ItemType<ItemPrismarineCrystalsStack> PRISMARINE_CRYSTALS;

    public static ItemType<ItemPrismarineShardStack> PRISMARINE_SHARD;

    public static ItemType<ItemPrismarineStairsStack> PRISMARINE_STAIRS;

    public static ItemType<ItemPrizePotterySherdStack> PRIZE_POTTERY_SHERD;

    public static ItemType<ItemPufferfishStack> PUFFERFISH;

    public static ItemType<ItemPufferfishBucketStack> PUFFERFISH_BUCKET;

    public static ItemType<ItemPufferfishSpawnEggStack> PUFFERFISH_SPAWN_EGG;

    public static ItemType<ItemPumpkinStack> PUMPKIN;

    public static ItemType<ItemPumpkinPieStack> PUMPKIN_PIE;

    public static ItemType<ItemPumpkinSeedsStack> PUMPKIN_SEEDS;

    public static ItemType<ItemPumpkinStemStack> PUMPKIN_STEM;

    public static ItemType<ItemPurpleCandleStack> PURPLE_CANDLE;

    public static ItemType<ItemPurpleCandleCakeStack> PURPLE_CANDLE_CAKE;

    public static ItemType<ItemPurpleCarpetStack> PURPLE_CARPET;

    public static ItemType<ItemPurpleConcreteStack> PURPLE_CONCRETE;

    public static ItemType<ItemPurpleConcretePowderStack> PURPLE_CONCRETE_POWDER;

    public static ItemType<ItemPurpleDyeStack> PURPLE_DYE;

    public static ItemType<ItemPurpleGlazedTerracottaStack> PURPLE_GLAZED_TERRACOTTA;

    public static ItemType<ItemPurpleShulkerBoxStack> PURPLE_SHULKER_BOX;

    public static ItemType<ItemPurpleStainedGlassStack> PURPLE_STAINED_GLASS;

    public static ItemType<ItemPurpleStainedGlassPaneStack> PURPLE_STAINED_GLASS_PANE;

    public static ItemType<ItemPurpleTerracottaStack> PURPLE_TERRACOTTA;

    public static ItemType<ItemPurpleWoolStack> PURPLE_WOOL;

    public static ItemType<ItemPurpurBlockStack> PURPUR_BLOCK;

    public static ItemType<ItemPurpurStairsStack> PURPUR_STAIRS;

    public static ItemType<ItemQuartzStack> QUARTZ;

    public static ItemType<ItemQuartzBlockStack> QUARTZ_BLOCK;

    public static ItemType<ItemQuartzBricksStack> QUARTZ_BRICKS;

    public static ItemType<ItemQuartzOreStack> QUARTZ_ORE;

    public static ItemType<ItemQuartzSlabStack> QUARTZ_SLAB;

    public static ItemType<ItemQuartzStairsStack> QUARTZ_STAIRS;

    public static ItemType<ItemRabbitStack> RABBIT;

    public static ItemType<ItemRabbitFootStack> RABBIT_FOOT;

    public static ItemType<ItemRabbitHideStack> RABBIT_HIDE;

    public static ItemType<ItemRabbitSpawnEggStack> RABBIT_SPAWN_EGG;

    public static ItemType<ItemRabbitStewStack> RABBIT_STEW;

    public static ItemType<ItemRailStack> RAIL;

    public static ItemType<ItemRaiserArmorTrimSmithingTemplateStack> RAISER_ARMOR_TRIM_SMITHING_TEMPLATE;

    public static ItemType<ItemRapidFertilizerStack> RAPID_FERTILIZER;

    public static ItemType<ItemRavagerSpawnEggStack> RAVAGER_SPAWN_EGG;

    public static ItemType<ItemRawCopperStack> RAW_COPPER;

    public static ItemType<ItemRawCopperBlockStack> RAW_COPPER_BLOCK;

    public static ItemType<ItemRawGoldStack> RAW_GOLD;

    public static ItemType<ItemRawGoldBlockStack> RAW_GOLD_BLOCK;

    public static ItemType<ItemRawIronStack> RAW_IRON;

    public static ItemType<ItemRawIronBlockStack> RAW_IRON_BLOCK;

    public static ItemType<ItemRecoveryCompassStack> RECOVERY_COMPASS;

    public static ItemType<ItemRedCandleStack> RED_CANDLE;

    public static ItemType<ItemRedCandleCakeStack> RED_CANDLE_CAKE;

    public static ItemType<ItemRedCarpetStack> RED_CARPET;

    public static ItemType<ItemRedConcreteStack> RED_CONCRETE;

    public static ItemType<ItemRedConcretePowderStack> RED_CONCRETE_POWDER;

    public static ItemType<ItemRedDyeStack> RED_DYE;

    public static ItemType<ItemRedFlowerStack> RED_FLOWER;

    public static ItemType<ItemRedGlazedTerracottaStack> RED_GLAZED_TERRACOTTA;

    public static ItemType<ItemRedMushroomStack> RED_MUSHROOM;

    public static ItemType<ItemRedMushroomBlockStack> RED_MUSHROOM_BLOCK;

    public static ItemType<ItemRedNetherBrickStack> RED_NETHER_BRICK;

    public static ItemType<ItemRedNetherBrickStairsStack> RED_NETHER_BRICK_STAIRS;

    public static ItemType<ItemRedSandstoneStack> RED_SANDSTONE;

    public static ItemType<ItemRedSandstoneStairsStack> RED_SANDSTONE_STAIRS;

    public static ItemType<ItemRedShulkerBoxStack> RED_SHULKER_BOX;

    public static ItemType<ItemRedStainedGlassStack> RED_STAINED_GLASS;

    public static ItemType<ItemRedStainedGlassPaneStack> RED_STAINED_GLASS_PANE;

    public static ItemType<ItemRedTerracottaStack> RED_TERRACOTTA;

    public static ItemType<ItemRedTulipStack> RED_TULIP;

    public static ItemType<ItemRedWoolStack> RED_WOOL;

    public static ItemType<ItemRedstoneStack> REDSTONE;

    public static ItemType<ItemRedstoneBlockStack> REDSTONE_BLOCK;

    public static ItemType<ItemRedstoneLampStack> REDSTONE_LAMP;

    public static ItemType<ItemRedstoneOreStack> REDSTONE_ORE;

    public static ItemType<ItemRedstoneTorchStack> REDSTONE_TORCH;

    public static ItemType<ItemRedstoneWireStack> REDSTONE_WIRE;

    public static ItemType<ItemReinforcedDeepslateStack> REINFORCED_DEEPSLATE;

    public static ItemType<ItemRepeaterStack> REPEATER;

    public static ItemType<ItemRepeatingCommandBlockStack> REPEATING_COMMAND_BLOCK;

    public static ItemType<ItemReserved6Stack> RESERVED6;

    public static ItemType<ItemRespawnAnchorStack> RESPAWN_ANCHOR;

    public static ItemType<ItemRibArmorTrimSmithingTemplateStack> RIB_ARMOR_TRIM_SMITHING_TEMPLATE;

    public static ItemType<ItemRoseBushStack> ROSE_BUSH;

    public static ItemType<ItemRottenFleshStack> ROTTEN_FLESH;

    public static ItemType<ItemSaddleStack> SADDLE;

    public static ItemType<ItemSalmonStack> SALMON;

    public static ItemType<ItemSalmonBucketStack> SALMON_BUCKET;

    public static ItemType<ItemSalmonSpawnEggStack> SALMON_SPAWN_EGG;

    public static ItemType<ItemSandStack> SAND;

    public static ItemType<ItemSandstoneStack> SANDSTONE;

    public static ItemType<ItemSandstoneSlabStack> SANDSTONE_SLAB;

    public static ItemType<ItemSandstoneStairsStack> SANDSTONE_STAIRS;

    public static ItemType<ItemSaplingStack> SAPLING;

    public static ItemType<ItemScaffoldingStack> SCAFFOLDING;

    public static ItemType<ItemScrapePotterySherdStack> SCRAPE_POTTERY_SHERD;

    public static ItemType<ItemSculkStack> SCULK;

    public static ItemType<ItemSculkCatalystStack> SCULK_CATALYST;

    public static ItemType<ItemSculkSensorStack> SCULK_SENSOR;

    public static ItemType<ItemSculkShriekerStack> SCULK_SHRIEKER;

    public static ItemType<ItemSculkVeinStack> SCULK_VEIN;

    public static ItemType<ItemSeaLanternStack> SEA_LANTERN;

    public static ItemType<ItemSeaPickleStack> SEA_PICKLE;

    public static ItemType<ItemSeagrassStack> SEAGRASS;

    public static ItemType<ItemSentryArmorTrimSmithingTemplateStack> SENTRY_ARMOR_TRIM_SMITHING_TEMPLATE;

    public static ItemType<ItemShaperArmorTrimSmithingTemplateStack> SHAPER_ARMOR_TRIM_SMITHING_TEMPLATE;

    public static ItemType<ItemSheafPotterySherdStack> SHEAF_POTTERY_SHERD;

    public static ItemType<ItemShearsStack> SHEARS;

    public static ItemType<ItemSheepSpawnEggStack> SHEEP_SPAWN_EGG;

    public static ItemType<ItemShelterPotterySherdStack> SHELTER_POTTERY_SHERD;

    public static ItemType<ItemShieldStack> SHIELD;

    public static ItemType<ItemShortGrassStack> SHORT_GRASS;

    public static ItemType<ItemShroomlightStack> SHROOMLIGHT;

    public static ItemType<ItemShulkerBoxStack> SHULKER_BOX;

    public static ItemType<ItemShulkerShellStack> SHULKER_SHELL;

    public static ItemType<ItemShulkerSpawnEggStack> SHULKER_SPAWN_EGG;

    public static ItemType<ItemSilenceArmorTrimSmithingTemplateStack> SILENCE_ARMOR_TRIM_SMITHING_TEMPLATE;

    public static ItemType<ItemSilverGlazedTerracottaStack> SILVER_GLAZED_TERRACOTTA;

    public static ItemType<ItemSilverfishSpawnEggStack> SILVERFISH_SPAWN_EGG;

    public static ItemType<ItemSkeletonHorseSpawnEggStack> SKELETON_HORSE_SPAWN_EGG;

    public static ItemType<ItemSkeletonSpawnEggStack> SKELETON_SPAWN_EGG;

    public static ItemType<ItemSkullStack> SKULL;

    public static ItemType<ItemSkullBannerPatternStack> SKULL_BANNER_PATTERN;

    public static ItemType<ItemSkullPotterySherdStack> SKULL_POTTERY_SHERD;

    public static ItemType<ItemSlimeStack> SLIME;

    public static ItemType<ItemSlimeBallStack> SLIME_BALL;

    public static ItemType<ItemSlimeSpawnEggStack> SLIME_SPAWN_EGG;

    public static ItemType<ItemSmallAmethystBudStack> SMALL_AMETHYST_BUD;

    public static ItemType<ItemSmallDripleafBlockStack> SMALL_DRIPLEAF_BLOCK;

    public static ItemType<ItemSmithingTableStack> SMITHING_TABLE;

    public static ItemType<ItemSmokerStack> SMOKER;

    public static ItemType<ItemSmoothBasaltStack> SMOOTH_BASALT;

    public static ItemType<ItemSmoothQuartzStairsStack> SMOOTH_QUARTZ_STAIRS;

    public static ItemType<ItemSmoothRedSandstoneStairsStack> SMOOTH_RED_SANDSTONE_STAIRS;

    public static ItemType<ItemSmoothSandstoneStairsStack> SMOOTH_SANDSTONE_STAIRS;

    public static ItemType<ItemSmoothStoneStack> SMOOTH_STONE;

    public static ItemType<ItemSmoothStoneSlabStack> SMOOTH_STONE_SLAB;

    public static ItemType<ItemSnifferEggStack> SNIFFER_EGG;

    public static ItemType<ItemSnifferSpawnEggStack> SNIFFER_SPAWN_EGG;

    public static ItemType<ItemSnortPotterySherdStack> SNORT_POTTERY_SHERD;

    public static ItemType<ItemSnoutArmorTrimSmithingTemplateStack> SNOUT_ARMOR_TRIM_SMITHING_TEMPLATE;

    public static ItemType<ItemSnowStack> SNOW;

    public static ItemType<ItemSnowGolemSpawnEggStack> SNOW_GOLEM_SPAWN_EGG;

    public static ItemType<ItemSnowLayerStack> SNOW_LAYER;

    public static ItemType<ItemSnowballStack> SNOWBALL;

    public static ItemType<ItemSoulCampfireStack> SOUL_CAMPFIRE;

    public static ItemType<ItemSoulFireStack> SOUL_FIRE;

    public static ItemType<ItemSoulLanternStack> SOUL_LANTERN;

    public static ItemType<ItemSoulSandStack> SOUL_SAND;

    public static ItemType<ItemSoulSoilStack> SOUL_SOIL;

    public static ItemType<ItemSoulTorchStack> SOUL_TORCH;

    public static ItemType<ItemSparklerStack> SPARKLER;

    public static ItemType<ItemSpawnEggStack> SPAWN_EGG;

    public static ItemType<ItemSpiderEyeStack> SPIDER_EYE;

    public static ItemType<ItemSpiderSpawnEggStack> SPIDER_SPAWN_EGG;

    public static ItemType<ItemSpireArmorTrimSmithingTemplateStack> SPIRE_ARMOR_TRIM_SMITHING_TEMPLATE;

    public static ItemType<ItemSplashPotionStack> SPLASH_POTION;

    public static ItemType<ItemSpongeStack> SPONGE;

    public static ItemType<ItemSporeBlossomStack> SPORE_BLOSSOM;

    public static ItemType<ItemSpruceBoatStack> SPRUCE_BOAT;

    public static ItemType<ItemSpruceButtonStack> SPRUCE_BUTTON;

    public static ItemType<ItemSpruceChestBoatStack> SPRUCE_CHEST_BOAT;

    public static ItemType<ItemSpruceDoorStack> SPRUCE_DOOR;

    public static ItemType<ItemSpruceDoubleSlabStack> SPRUCE_DOUBLE_SLAB;

    public static ItemType<ItemSpruceFenceStack> SPRUCE_FENCE;

    public static ItemType<ItemSpruceFenceGateStack> SPRUCE_FENCE_GATE;

    public static ItemType<ItemSpruceHangingSignStack> SPRUCE_HANGING_SIGN;

    public static ItemType<ItemSpruceLeavesStack> SPRUCE_LEAVES;

    public static ItemType<ItemSpruceLogStack> SPRUCE_LOG;

    public static ItemType<ItemSprucePlanksStack> SPRUCE_PLANKS;

    public static ItemType<ItemSprucePressurePlateStack> SPRUCE_PRESSURE_PLATE;

    public static ItemType<ItemSpruceSaplingStack> SPRUCE_SAPLING;

    public static ItemType<ItemSpruceSignStack> SPRUCE_SIGN;

    public static ItemType<ItemSpruceSlabStack> SPRUCE_SLAB;

    public static ItemType<ItemSpruceStairsStack> SPRUCE_STAIRS;

    public static ItemType<ItemSpruceStandingSignStack> SPRUCE_STANDING_SIGN;

    public static ItemType<ItemSpruceTrapdoorStack> SPRUCE_TRAPDOOR;

    public static ItemType<ItemSpruceWallSignStack> SPRUCE_WALL_SIGN;

    public static ItemType<ItemSpruceWoodStack> SPRUCE_WOOD;

    public static ItemType<ItemSpyglassStack> SPYGLASS;

    public static ItemType<ItemSquidSpawnEggStack> SQUID_SPAWN_EGG;

    public static ItemType<ItemStainedGlassStack> STAINED_GLASS;

    public static ItemType<ItemStainedGlassPaneStack> STAINED_GLASS_PANE;

    public static ItemType<ItemStainedHardenedClayStack> STAINED_HARDENED_CLAY;

    public static ItemType<ItemStandingBannerStack> STANDING_BANNER;

    public static ItemType<ItemStandingSignStack> STANDING_SIGN;

    public static ItemType<ItemStickStack> STICK;

    public static ItemType<ItemStickyPistonStack> STICKY_PISTON;

    public static ItemType<ItemStickyPistonArmCollisionStack> STICKY_PISTON_ARM_COLLISION;

    public static ItemType<ItemStoneStack> STONE;

    public static ItemType<ItemStoneAxeStack> STONE_AXE;

    public static ItemType<ItemStoneBlockSlabStack> STONE_BLOCK_SLAB;

    public static ItemType<ItemStoneBlockSlab2Stack> STONE_BLOCK_SLAB2;

    public static ItemType<ItemStoneBlockSlab3Stack> STONE_BLOCK_SLAB3;

    public static ItemType<ItemStoneBlockSlab4Stack> STONE_BLOCK_SLAB4;

    public static ItemType<ItemStoneBrickSlabStack> STONE_BRICK_SLAB;

    public static ItemType<ItemStoneBrickStairsStack> STONE_BRICK_STAIRS;

    public static ItemType<ItemStoneButtonStack> STONE_BUTTON;

    public static ItemType<ItemStoneHoeStack> STONE_HOE;

    public static ItemType<ItemStonePickaxeStack> STONE_PICKAXE;

    public static ItemType<ItemStonePressurePlateStack> STONE_PRESSURE_PLATE;

    public static ItemType<ItemStoneShovelStack> STONE_SHOVEL;

    public static ItemType<ItemStoneStairsStack> STONE_STAIRS;

    public static ItemType<ItemStoneSwordStack> STONE_SWORD;

    public static ItemType<ItemStonebrickStack> STONEBRICK;

    public static ItemType<ItemStonecutterStack> STONECUTTER;

    public static ItemType<ItemStonecutterBlockStack> STONECUTTER_BLOCK;

    public static ItemType<ItemStraySpawnEggStack> STRAY_SPAWN_EGG;

    public static ItemType<ItemStriderSpawnEggStack> STRIDER_SPAWN_EGG;

    public static ItemType<ItemStringStack> STRING;

    public static ItemType<ItemStrippedAcaciaLogStack> STRIPPED_ACACIA_LOG;

    public static ItemType<ItemStrippedAcaciaWoodStack> STRIPPED_ACACIA_WOOD;

    public static ItemType<ItemStrippedBambooBlockStack> STRIPPED_BAMBOO_BLOCK;

    public static ItemType<ItemStrippedBirchLogStack> STRIPPED_BIRCH_LOG;

    public static ItemType<ItemStrippedBirchWoodStack> STRIPPED_BIRCH_WOOD;

    public static ItemType<ItemStrippedCherryLogStack> STRIPPED_CHERRY_LOG;

    public static ItemType<ItemStrippedCherryWoodStack> STRIPPED_CHERRY_WOOD;

    public static ItemType<ItemStrippedCrimsonHyphaeStack> STRIPPED_CRIMSON_HYPHAE;

    public static ItemType<ItemStrippedCrimsonStemStack> STRIPPED_CRIMSON_STEM;

    public static ItemType<ItemStrippedDarkOakLogStack> STRIPPED_DARK_OAK_LOG;

    public static ItemType<ItemStrippedDarkOakWoodStack> STRIPPED_DARK_OAK_WOOD;

    public static ItemType<ItemStrippedJungleLogStack> STRIPPED_JUNGLE_LOG;

    public static ItemType<ItemStrippedJungleWoodStack> STRIPPED_JUNGLE_WOOD;

    public static ItemType<ItemStrippedMangroveLogStack> STRIPPED_MANGROVE_LOG;

    public static ItemType<ItemStrippedMangroveWoodStack> STRIPPED_MANGROVE_WOOD;

    public static ItemType<ItemStrippedOakLogStack> STRIPPED_OAK_LOG;

    public static ItemType<ItemStrippedOakWoodStack> STRIPPED_OAK_WOOD;

    public static ItemType<ItemStrippedSpruceLogStack> STRIPPED_SPRUCE_LOG;

    public static ItemType<ItemStrippedSpruceWoodStack> STRIPPED_SPRUCE_WOOD;

    public static ItemType<ItemStrippedWarpedHyphaeStack> STRIPPED_WARPED_HYPHAE;

    public static ItemType<ItemStrippedWarpedStemStack> STRIPPED_WARPED_STEM;

    public static ItemType<ItemStructureBlockStack> STRUCTURE_BLOCK;

    public static ItemType<ItemStructureVoidStack> STRUCTURE_VOID;

    public static ItemType<ItemSugarStack> SUGAR;

    public static ItemType<ItemSugarCaneStack> SUGAR_CANE;

    public static ItemType<ItemSunflowerStack> SUNFLOWER;

    public static ItemType<ItemSuspiciousGravelStack> SUSPICIOUS_GRAVEL;

    public static ItemType<ItemSuspiciousSandStack> SUSPICIOUS_SAND;

    public static ItemType<ItemSuspiciousStewStack> SUSPICIOUS_STEW;

    public static ItemType<ItemSweetBerriesStack> SWEET_BERRIES;

    public static ItemType<ItemSweetBerryBushStack> SWEET_BERRY_BUSH;

    public static ItemType<ItemTadpoleBucketStack> TADPOLE_BUCKET;

    public static ItemType<ItemTadpoleSpawnEggStack> TADPOLE_SPAWN_EGG;

    public static ItemType<ItemTallGrassStack> TALL_GRASS;

    public static ItemType<ItemTallgrass0Stack> TALLGRASS;

    public static ItemType<ItemTargetStack> TARGET;

    public static ItemType<ItemTideArmorTrimSmithingTemplateStack> TIDE_ARMOR_TRIM_SMITHING_TEMPLATE;

    public static ItemType<ItemTintedGlassStack> TINTED_GLASS;

    public static ItemType<ItemTntStack> TNT;

    public static ItemType<ItemTntMinecartStack> TNT_MINECART;

    public static ItemType<ItemTorchStack> TORCH;

    public static ItemType<ItemTorchflowerStack> TORCHFLOWER;

    public static ItemType<ItemTorchflowerCropStack> TORCHFLOWER_CROP;

    public static ItemType<ItemTorchflowerSeedsStack> TORCHFLOWER_SEEDS;

    public static ItemType<ItemTotemOfUndyingStack> TOTEM_OF_UNDYING;

    public static ItemType<ItemTraderLlamaSpawnEggStack> TRADER_LLAMA_SPAWN_EGG;

    public static ItemType<ItemTrapdoorStack> TRAPDOOR;

    public static ItemType<ItemTrappedChestStack> TRAPPED_CHEST;

    public static ItemType<ItemTrialKeyStack> TRIAL_KEY;

    public static ItemType<ItemTrialSpawnerStack> TRIAL_SPAWNER;

    public static ItemType<ItemTridentStack> TRIDENT;

    public static ItemType<ItemTripWireStack> TRIP_WIRE;

    public static ItemType<ItemTripwireHookStack> TRIPWIRE_HOOK;

    public static ItemType<ItemTropicalFishStack> TROPICAL_FISH;

    public static ItemType<ItemTropicalFishBucketStack> TROPICAL_FISH_BUCKET;

    public static ItemType<ItemTropicalFishSpawnEggStack> TROPICAL_FISH_SPAWN_EGG;

    public static ItemType<ItemTubeCoralStack> TUBE_CORAL;

    public static ItemType<ItemTubeCoralBlockStack> TUBE_CORAL_BLOCK;

    public static ItemType<ItemTubeCoralFanStack> TUBE_CORAL_FAN;

    public static ItemType<ItemTuffStack> TUFF;

    public static ItemType<ItemTuffBrickDoubleSlabStack> TUFF_BRICK_DOUBLE_SLAB;

    public static ItemType<ItemTuffBrickSlabStack> TUFF_BRICK_SLAB;

    public static ItemType<ItemTuffBrickStairsStack> TUFF_BRICK_STAIRS;

    public static ItemType<ItemTuffBrickWallStack> TUFF_BRICK_WALL;

    public static ItemType<ItemTuffBricksStack> TUFF_BRICKS;

    public static ItemType<ItemTuffDoubleSlabStack> TUFF_DOUBLE_SLAB;

    public static ItemType<ItemTuffSlabStack> TUFF_SLAB;

    public static ItemType<ItemTuffStairsStack> TUFF_STAIRS;

    public static ItemType<ItemTuffWallStack> TUFF_WALL;

    public static ItemType<ItemTurtleEggStack> TURTLE_EGG;

    public static ItemType<ItemTurtleHelmetStack> TURTLE_HELMET;

    public static ItemType<ItemTurtleScuteStack> TURTLE_SCUTE;

    public static ItemType<ItemTurtleSpawnEggStack> TURTLE_SPAWN_EGG;

    public static ItemType<ItemTwistingVinesStack> TWISTING_VINES;

    public static ItemType<ItemUnderwaterTorchStack> UNDERWATER_TORCH;

    public static ItemType<ItemUndyedShulkerBoxStack> UNDYED_SHULKER_BOX;

    public static ItemType<ItemUnknownStack> UNKNOWN;

    public static ItemType<ItemUnlitRedstoneTorchStack> UNLIT_REDSTONE_TORCH;

    public static ItemType<ItemUnpoweredComparatorStack> UNPOWERED_COMPARATOR;

    public static ItemType<ItemUnpoweredRepeaterStack> UNPOWERED_REPEATER;

    public static ItemType<ItemVaultStack> VAULT;

    public static ItemType<ItemVerdantFroglightStack> VERDANT_FROGLIGHT;

    public static ItemType<ItemVexArmorTrimSmithingTemplateStack> VEX_ARMOR_TRIM_SMITHING_TEMPLATE;

    public static ItemType<ItemVexSpawnEggStack> VEX_SPAWN_EGG;

    public static ItemType<ItemVillagerSpawnEggStack> VILLAGER_SPAWN_EGG;

    public static ItemType<ItemVindicatorSpawnEggStack> VINDICATOR_SPAWN_EGG;

    public static ItemType<ItemVineStack> VINE;

    public static ItemType<ItemWallBannerStack> WALL_BANNER;

    public static ItemType<ItemWallSignStack> WALL_SIGN;

    public static ItemType<ItemWanderingTraderSpawnEggStack> WANDERING_TRADER_SPAWN_EGG;

    public static ItemType<ItemWardArmorTrimSmithingTemplateStack> WARD_ARMOR_TRIM_SMITHING_TEMPLATE;

    public static ItemType<ItemWardenSpawnEggStack> WARDEN_SPAWN_EGG;

    public static ItemType<ItemWarpedButtonStack> WARPED_BUTTON;

    public static ItemType<ItemWarpedDoorStack> WARPED_DOOR;

    public static ItemType<ItemWarpedDoubleSlabStack> WARPED_DOUBLE_SLAB;

    public static ItemType<ItemWarpedFenceStack> WARPED_FENCE;

    public static ItemType<ItemWarpedFenceGateStack> WARPED_FENCE_GATE;

    public static ItemType<ItemWarpedFungusStack> WARPED_FUNGUS;

    public static ItemType<ItemWarpedFungusOnAStickStack> WARPED_FUNGUS_ON_A_STICK;

    public static ItemType<ItemWarpedHangingSignStack> WARPED_HANGING_SIGN;

    public static ItemType<ItemWarpedHyphaeStack> WARPED_HYPHAE;

    public static ItemType<ItemWarpedNyliumStack> WARPED_NYLIUM;

    public static ItemType<ItemWarpedPlanksStack> WARPED_PLANKS;

    public static ItemType<ItemWarpedPressurePlateStack> WARPED_PRESSURE_PLATE;

    public static ItemType<ItemWarpedRootsStack> WARPED_ROOTS;

    public static ItemType<ItemWarpedSignStack> WARPED_SIGN;

    public static ItemType<ItemWarpedSlabStack> WARPED_SLAB;

    public static ItemType<ItemWarpedStairsStack> WARPED_STAIRS;

    public static ItemType<ItemWarpedStandingSignStack> WARPED_STANDING_SIGN;

    public static ItemType<ItemWarpedStemStack> WARPED_STEM;

    public static ItemType<ItemWarpedTrapdoorStack> WARPED_TRAPDOOR;

    public static ItemType<ItemWarpedWallSignStack> WARPED_WALL_SIGN;

    public static ItemType<ItemWarpedWartBlockStack> WARPED_WART_BLOCK;

    public static ItemType<ItemWaterStack> WATER;

    public static ItemType<ItemWaterBucketStack> WATER_BUCKET;

    public static ItemType<ItemWaterlilyStack> WATERLILY;

    public static ItemType<ItemWaxedChiseledCopperStack> WAXED_CHISELED_COPPER;

    public static ItemType<ItemWaxedCopperStack> WAXED_COPPER;

    public static ItemType<ItemWaxedCopperBulbStack> WAXED_COPPER_BULB;

    public static ItemType<ItemWaxedCopperDoorStack> WAXED_COPPER_DOOR;

    public static ItemType<ItemWaxedCopperGrateStack> WAXED_COPPER_GRATE;

    public static ItemType<ItemWaxedCopperTrapdoorStack> WAXED_COPPER_TRAPDOOR;

    public static ItemType<ItemWaxedCutCopperStack> WAXED_CUT_COPPER;

    public static ItemType<ItemWaxedCutCopperSlabStack> WAXED_CUT_COPPER_SLAB;

    public static ItemType<ItemWaxedCutCopperStairsStack> WAXED_CUT_COPPER_STAIRS;

    public static ItemType<ItemWaxedDoubleCutCopperSlabStack> WAXED_DOUBLE_CUT_COPPER_SLAB;

    public static ItemType<ItemWaxedExposedChiseledCopperStack> WAXED_EXPOSED_CHISELED_COPPER;

    public static ItemType<ItemWaxedExposedCopperStack> WAXED_EXPOSED_COPPER;

    public static ItemType<ItemWaxedExposedCopperBulbStack> WAXED_EXPOSED_COPPER_BULB;

    public static ItemType<ItemWaxedExposedCopperDoorStack> WAXED_EXPOSED_COPPER_DOOR;

    public static ItemType<ItemWaxedExposedCopperGrateStack> WAXED_EXPOSED_COPPER_GRATE;

    public static ItemType<ItemWaxedExposedCopperTrapdoorStack> WAXED_EXPOSED_COPPER_TRAPDOOR;

    public static ItemType<ItemWaxedExposedCutCopperStack> WAXED_EXPOSED_CUT_COPPER;

    public static ItemType<ItemWaxedExposedCutCopperSlabStack> WAXED_EXPOSED_CUT_COPPER_SLAB;

    public static ItemType<ItemWaxedExposedCutCopperStairsStack> WAXED_EXPOSED_CUT_COPPER_STAIRS;

    public static ItemType<ItemWaxedExposedDoubleCutCopperSlabStack> WAXED_EXPOSED_DOUBLE_CUT_COPPER_SLAB;

    public static ItemType<ItemWaxedOxidizedChiseledCopperStack> WAXED_OXIDIZED_CHISELED_COPPER;

    public static ItemType<ItemWaxedOxidizedCopperStack> WAXED_OXIDIZED_COPPER;

    public static ItemType<ItemWaxedOxidizedCopperBulbStack> WAXED_OXIDIZED_COPPER_BULB;

    public static ItemType<ItemWaxedOxidizedCopperDoorStack> WAXED_OXIDIZED_COPPER_DOOR;

    public static ItemType<ItemWaxedOxidizedCopperGrateStack> WAXED_OXIDIZED_COPPER_GRATE;

    public static ItemType<ItemWaxedOxidizedCopperTrapdoorStack> WAXED_OXIDIZED_COPPER_TRAPDOOR;

    public static ItemType<ItemWaxedOxidizedCutCopperStack> WAXED_OXIDIZED_CUT_COPPER;

    public static ItemType<ItemWaxedOxidizedCutCopperSlabStack> WAXED_OXIDIZED_CUT_COPPER_SLAB;

    public static ItemType<ItemWaxedOxidizedCutCopperStairsStack> WAXED_OXIDIZED_CUT_COPPER_STAIRS;

    public static ItemType<ItemWaxedOxidizedDoubleCutCopperSlabStack> WAXED_OXIDIZED_DOUBLE_CUT_COPPER_SLAB;

    public static ItemType<ItemWaxedWeatheredChiseledCopperStack> WAXED_WEATHERED_CHISELED_COPPER;

    public static ItemType<ItemWaxedWeatheredCopperStack> WAXED_WEATHERED_COPPER;

    public static ItemType<ItemWaxedWeatheredCopperBulbStack> WAXED_WEATHERED_COPPER_BULB;

    public static ItemType<ItemWaxedWeatheredCopperDoorStack> WAXED_WEATHERED_COPPER_DOOR;

    public static ItemType<ItemWaxedWeatheredCopperGrateStack> WAXED_WEATHERED_COPPER_GRATE;

    public static ItemType<ItemWaxedWeatheredCopperTrapdoorStack> WAXED_WEATHERED_COPPER_TRAPDOOR;

    public static ItemType<ItemWaxedWeatheredCutCopperStack> WAXED_WEATHERED_CUT_COPPER;

    public static ItemType<ItemWaxedWeatheredCutCopperSlabStack> WAXED_WEATHERED_CUT_COPPER_SLAB;

    public static ItemType<ItemWaxedWeatheredCutCopperStairsStack> WAXED_WEATHERED_CUT_COPPER_STAIRS;

    public static ItemType<ItemWaxedWeatheredDoubleCutCopperSlabStack> WAXED_WEATHERED_DOUBLE_CUT_COPPER_SLAB;

    public static ItemType<ItemWayfinderArmorTrimSmithingTemplateStack> WAYFINDER_ARMOR_TRIM_SMITHING_TEMPLATE;

    public static ItemType<ItemWeatheredChiseledCopperStack> WEATHERED_CHISELED_COPPER;

    public static ItemType<ItemWeatheredCopperStack> WEATHERED_COPPER;

    public static ItemType<ItemWeatheredCopperBulbStack> WEATHERED_COPPER_BULB;

    public static ItemType<ItemWeatheredCopperDoorStack> WEATHERED_COPPER_DOOR;

    public static ItemType<ItemWeatheredCopperGrateStack> WEATHERED_COPPER_GRATE;

    public static ItemType<ItemWeatheredCopperTrapdoorStack> WEATHERED_COPPER_TRAPDOOR;

    public static ItemType<ItemWeatheredCutCopperStack> WEATHERED_CUT_COPPER;

    public static ItemType<ItemWeatheredCutCopperSlabStack> WEATHERED_CUT_COPPER_SLAB;

    public static ItemType<ItemWeatheredCutCopperStairsStack> WEATHERED_CUT_COPPER_STAIRS;

    public static ItemType<ItemWeatheredDoubleCutCopperSlabStack> WEATHERED_DOUBLE_CUT_COPPER_SLAB;

    public static ItemType<ItemWebStack> WEB;

    public static ItemType<ItemWeepingVinesStack> WEEPING_VINES;

    public static ItemType<ItemWheatStack> WHEAT;

    public static ItemType<ItemWheatSeedsStack> WHEAT_SEEDS;

    public static ItemType<ItemWhiteCandleStack> WHITE_CANDLE;

    public static ItemType<ItemWhiteCandleCakeStack> WHITE_CANDLE_CAKE;

    public static ItemType<ItemWhiteCarpetStack> WHITE_CARPET;

    public static ItemType<ItemWhiteConcreteStack> WHITE_CONCRETE;

    public static ItemType<ItemWhiteConcretePowderStack> WHITE_CONCRETE_POWDER;

    public static ItemType<ItemWhiteDyeStack> WHITE_DYE;

    public static ItemType<ItemWhiteGlazedTerracottaStack> WHITE_GLAZED_TERRACOTTA;

    public static ItemType<ItemWhiteShulkerBoxStack> WHITE_SHULKER_BOX;

    public static ItemType<ItemWhiteStainedGlassStack> WHITE_STAINED_GLASS;

    public static ItemType<ItemWhiteStainedGlassPaneStack> WHITE_STAINED_GLASS_PANE;

    public static ItemType<ItemWhiteTerracottaStack> WHITE_TERRACOTTA;

    public static ItemType<ItemWhiteTulipStack> WHITE_TULIP;

    public static ItemType<ItemWhiteWoolStack> WHITE_WOOL;

    public static ItemType<ItemWildArmorTrimSmithingTemplateStack> WILD_ARMOR_TRIM_SMITHING_TEMPLATE;

    public static ItemType<ItemWindChargeStack> WIND_CHARGE;

    public static ItemType<ItemWitchSpawnEggStack> WITCH_SPAWN_EGG;

    public static ItemType<ItemWitherRoseStack> WITHER_ROSE;

    public static ItemType<ItemWitherSkeletonSpawnEggStack> WITHER_SKELETON_SPAWN_EGG;

    public static ItemType<ItemWitherSpawnEggStack> WITHER_SPAWN_EGG;

    public static ItemType<ItemWolfArmorStack> WOLF_ARMOR;

    public static ItemType<ItemWolfSpawnEggStack> WOLF_SPAWN_EGG;

    public static ItemType<ItemWoodStack> WOOD;

    public static ItemType<ItemWoodenAxeStack> WOODEN_AXE;

    public static ItemType<ItemWoodenButtonStack> WOODEN_BUTTON;

    public static ItemType<ItemWoodenDoorStack> WOODEN_DOOR;

    public static ItemType<ItemWoodenHoeStack> WOODEN_HOE;

    public static ItemType<ItemWoodenPickaxeStack> WOODEN_PICKAXE;

    public static ItemType<ItemWoodenPressurePlateStack> WOODEN_PRESSURE_PLATE;

    public static ItemType<ItemWoodenShovelStack> WOODEN_SHOVEL;

    public static ItemType<ItemWoodenSlabStack> WOODEN_SLAB;

    public static ItemType<ItemWoodenSwordStack> WOODEN_SWORD;

    public static ItemType<ItemWoolStack> WOOL;

    public static ItemType<ItemWritableBookStack> WRITABLE_BOOK;

    public static ItemType<ItemWrittenBookStack> WRITTEN_BOOK;

    public static ItemType<ItemYellowCandleStack> YELLOW_CANDLE;

    public static ItemType<ItemYellowCandleCakeStack> YELLOW_CANDLE_CAKE;

    public static ItemType<ItemYellowCarpetStack> YELLOW_CARPET;

    public static ItemType<ItemYellowConcreteStack> YELLOW_CONCRETE;

    public static ItemType<ItemYellowConcretePowderStack> YELLOW_CONCRETE_POWDER;

    public static ItemType<ItemYellowDyeStack> YELLOW_DYE;

    public static ItemType<ItemYellowFlowerStack> YELLOW_FLOWER;

    public static ItemType<ItemYellowGlazedTerracottaStack> YELLOW_GLAZED_TERRACOTTA;

    public static ItemType<ItemYellowShulkerBoxStack> YELLOW_SHULKER_BOX;

    public static ItemType<ItemYellowStainedGlassStack> YELLOW_STAINED_GLASS;

    public static ItemType<ItemYellowStainedGlassPaneStack> YELLOW_STAINED_GLASS_PANE;

    public static ItemType<ItemYellowTerracottaStack> YELLOW_TERRACOTTA;

    public static ItemType<ItemYellowWoolStack> YELLOW_WOOL;

    public static ItemType<ItemZoglinSpawnEggStack> ZOGLIN_SPAWN_EGG;

    public static ItemType<ItemZombieHorseSpawnEggStack> ZOMBIE_HORSE_SPAWN_EGG;

    public static ItemType<ItemZombiePigmanSpawnEggStack> ZOMBIE_PIGMAN_SPAWN_EGG;

    public static ItemType<ItemZombieSpawnEggStack> ZOMBIE_SPAWN_EGG;

    public static ItemType<ItemZombieVillagerSpawnEggStack> ZOMBIE_VILLAGER_SPAWN_EGG;
}
