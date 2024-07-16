package org.allaymc.api.block.type;

import org.allaymc.api.block.interfaces.*;
import org.allaymc.api.block.interfaces.amethystbud.BlockLargeAmethystBudBehavior;
import org.allaymc.api.block.interfaces.amethystbud.BlockMediumAmethystBudBehavior;
import org.allaymc.api.block.interfaces.amethystbud.BlockSmallAmethystBudBehavior;
import org.allaymc.api.block.interfaces.bricks.*;
import org.allaymc.api.block.interfaces.button.*;
import org.allaymc.api.block.interfaces.candle.*;
import org.allaymc.api.block.interfaces.candlecake.*;
import org.allaymc.api.block.interfaces.carpet.*;
import org.allaymc.api.block.interfaces.concrete.*;
import org.allaymc.api.block.interfaces.concretepowder.*;
import org.allaymc.api.block.interfaces.copper.*;
import org.allaymc.api.block.interfaces.coral.*;
import org.allaymc.api.block.interfaces.coralblock.*;
import org.allaymc.api.block.interfaces.coralfan.*;
import org.allaymc.api.block.interfaces.door.*;
import org.allaymc.api.block.interfaces.element.*;
import org.allaymc.api.block.interfaces.fence.*;
import org.allaymc.api.block.interfaces.fencegate.*;
import org.allaymc.api.block.interfaces.glass.BlockGlassBehavior;
import org.allaymc.api.block.interfaces.glass.BlockHardGlassBehavior;
import org.allaymc.api.block.interfaces.glass.BlockTintedGlassBehavior;
import org.allaymc.api.block.interfaces.glasspane.BlockGlassPaneBehavior;
import org.allaymc.api.block.interfaces.glasspane.BlockHardGlassPaneBehavior;
import org.allaymc.api.block.interfaces.hangingsign.*;
import org.allaymc.api.block.interfaces.leaves.*;
import org.allaymc.api.block.interfaces.liquid.BlockFlowingLavaBehavior;
import org.allaymc.api.block.interfaces.liquid.BlockFlowingWaterBehavior;
import org.allaymc.api.block.interfaces.liquid.BlockLavaBehavior;
import org.allaymc.api.block.interfaces.liquid.BlockWaterBehavior;
import org.allaymc.api.block.interfaces.log.*;
import org.allaymc.api.block.interfaces.piston.BlockPistonArmCollisionBehavior;
import org.allaymc.api.block.interfaces.piston.BlockPistonBehavior;
import org.allaymc.api.block.interfaces.piston.BlockStickyPistonArmCollisionBehavior;
import org.allaymc.api.block.interfaces.piston.BlockStickyPistonBehavior;
import org.allaymc.api.block.interfaces.planks.*;
import org.allaymc.api.block.interfaces.sapling.*;
import org.allaymc.api.block.interfaces.shulkerbox.*;
import org.allaymc.api.block.interfaces.slab.*;
import org.allaymc.api.block.interfaces.stainedglass.*;
import org.allaymc.api.block.interfaces.stainedglasspane.*;
import org.allaymc.api.block.interfaces.stairs.*;
import org.allaymc.api.block.interfaces.standingsign.*;
import org.allaymc.api.block.interfaces.terracotta.*;
import org.allaymc.api.block.interfaces.torch.*;
import org.allaymc.api.block.interfaces.trapdoor.*;
import org.allaymc.api.block.interfaces.wall.*;
import org.allaymc.api.block.interfaces.wallsign.*;
import org.allaymc.api.block.interfaces.wood.*;
import org.allaymc.api.block.interfaces.wool.*;

public final class BlockTypes {
    public static BlockType<BlockAcaciaButtonBehavior> ACACIA_BUTTON;

    public static BlockType<BlockAcaciaDoorBehavior> ACACIA_DOOR;

    public static BlockType<BlockAcaciaDoubleSlabBehavior> ACACIA_DOUBLE_SLAB;

    public static BlockType<BlockAcaciaFenceBehavior> ACACIA_FENCE;

    public static BlockType<BlockAcaciaFenceGateBehavior> ACACIA_FENCE_GATE;

    public static BlockType<BlockAcaciaHangingSignBehavior> ACACIA_HANGING_SIGN;

    public static BlockType<BlockAcaciaLeavesBehavior> ACACIA_LEAVES;

    public static BlockType<BlockAcaciaLogBehavior> ACACIA_LOG;

    public static BlockType<BlockAcaciaPlanksBehavior> ACACIA_PLANKS;

    public static BlockType<BlockAcaciaPressurePlateBehavior> ACACIA_PRESSURE_PLATE;

    public static BlockType<BlockAcaciaSaplingBehavior> ACACIA_SAPLING;

    public static BlockType<BlockAcaciaSlabBehavior> ACACIA_SLAB;

    public static BlockType<BlockAcaciaStairsBehavior> ACACIA_STAIRS;

    public static BlockType<BlockAcaciaStandingSignBehavior> ACACIA_STANDING_SIGN;

    public static BlockType<BlockAcaciaTrapdoorBehavior> ACACIA_TRAPDOOR;

    public static BlockType<BlockAcaciaWallSignBehavior> ACACIA_WALL_SIGN;

    public static BlockType<BlockAcaciaWoodBehavior> ACACIA_WOOD;

    public static BlockType<BlockActivatorRailBehavior> ACTIVATOR_RAIL;

    public static BlockType<BlockAirBehavior> AIR;

    public static BlockType<BlockAlliumBehavior> ALLIUM;

    public static BlockType<BlockAllowBehavior> ALLOW;

    public static BlockType<BlockAmethystBlockBehavior> AMETHYST_BLOCK;

    public static BlockType<BlockAmethystClusterBehavior> AMETHYST_CLUSTER;

    public static BlockType<BlockAncientDebrisBehavior> ANCIENT_DEBRIS;

    public static BlockType<BlockAndesiteBehavior> ANDESITE;

    public static BlockType<BlockAndesiteStairsBehavior> ANDESITE_STAIRS;

    public static BlockType<BlockAnvilBehavior> ANVIL;

    public static BlockType<BlockAzaleaBehavior> AZALEA;

    public static BlockType<BlockAzaleaLeavesBehavior> AZALEA_LEAVES;

    public static BlockType<BlockAzaleaLeavesFloweredBehavior> AZALEA_LEAVES_FLOWERED;

    public static BlockType<BlockAzureBluetBehavior> AZURE_BLUET;

    public static BlockType<BlockBambooBehavior> BAMBOO;

    public static BlockType<BlockBambooBlockBehavior> BAMBOO_BLOCK;

    public static BlockType<BlockBambooButtonBehavior> BAMBOO_BUTTON;

    public static BlockType<BlockBambooDoorBehavior> BAMBOO_DOOR;

    public static BlockType<BlockBambooDoubleSlabBehavior> BAMBOO_DOUBLE_SLAB;

    public static BlockType<BlockBambooFenceBehavior> BAMBOO_FENCE;

    public static BlockType<BlockBambooFenceGateBehavior> BAMBOO_FENCE_GATE;

    public static BlockType<BlockBambooHangingSignBehavior> BAMBOO_HANGING_SIGN;

    public static BlockType<BlockBambooMosaicBehavior> BAMBOO_MOSAIC;

    public static BlockType<BlockBambooMosaicDoubleSlabBehavior> BAMBOO_MOSAIC_DOUBLE_SLAB;

    public static BlockType<BlockBambooMosaicSlabBehavior> BAMBOO_MOSAIC_SLAB;

    public static BlockType<BlockBambooMosaicStairsBehavior> BAMBOO_MOSAIC_STAIRS;

    public static BlockType<BlockBambooPlanksBehavior> BAMBOO_PLANKS;

    public static BlockType<BlockBambooPressurePlateBehavior> BAMBOO_PRESSURE_PLATE;

    public static BlockType<BlockBambooSaplingBehavior> BAMBOO_SAPLING;

    public static BlockType<BlockBambooSlabBehavior> BAMBOO_SLAB;

    public static BlockType<BlockBambooStairsBehavior> BAMBOO_STAIRS;

    public static BlockType<BlockBambooStandingSignBehavior> BAMBOO_STANDING_SIGN;

    public static BlockType<BlockBambooTrapdoorBehavior> BAMBOO_TRAPDOOR;

    public static BlockType<BlockBambooWallSignBehavior> BAMBOO_WALL_SIGN;

    public static BlockType<BlockBarrelBehavior> BARREL;

    public static BlockType<BlockBarrierBehavior> BARRIER;

    public static BlockType<BlockBasaltBehavior> BASALT;

    public static BlockType<BlockBeaconBehavior> BEACON;

    public static BlockType<BlockBedBehavior> BED;

    public static BlockType<BlockBedrockBehavior> BEDROCK;

    public static BlockType<BlockBeeNestBehavior> BEE_NEST;

    public static BlockType<BlockBeehiveBehavior> BEEHIVE;

    public static BlockType<BlockBeetrootBehavior> BEETROOT;

    public static BlockType<BlockBellBehavior> BELL;

    public static BlockType<BlockBigDripleafBehavior> BIG_DRIPLEAF;

    public static BlockType<BlockBirchButtonBehavior> BIRCH_BUTTON;

    public static BlockType<BlockBirchDoorBehavior> BIRCH_DOOR;

    public static BlockType<BlockBirchDoubleSlabBehavior> BIRCH_DOUBLE_SLAB;

    public static BlockType<BlockBirchFenceBehavior> BIRCH_FENCE;

    public static BlockType<BlockBirchFenceGateBehavior> BIRCH_FENCE_GATE;

    public static BlockType<BlockBirchHangingSignBehavior> BIRCH_HANGING_SIGN;

    public static BlockType<BlockBirchLeavesBehavior> BIRCH_LEAVES;

    public static BlockType<BlockBirchLogBehavior> BIRCH_LOG;

    public static BlockType<BlockBirchPlanksBehavior> BIRCH_PLANKS;

    public static BlockType<BlockBirchPressurePlateBehavior> BIRCH_PRESSURE_PLATE;

    public static BlockType<BlockBirchSaplingBehavior> BIRCH_SAPLING;

    public static BlockType<BlockBirchSlabBehavior> BIRCH_SLAB;

    public static BlockType<BlockBirchStairsBehavior> BIRCH_STAIRS;

    public static BlockType<BlockBirchStandingSignBehavior> BIRCH_STANDING_SIGN;

    public static BlockType<BlockBirchTrapdoorBehavior> BIRCH_TRAPDOOR;

    public static BlockType<BlockBirchWallSignBehavior> BIRCH_WALL_SIGN;

    public static BlockType<BlockBirchWoodBehavior> BIRCH_WOOD;

    public static BlockType<BlockBlackCandleBehavior> BLACK_CANDLE;

    public static BlockType<BlockBlackCandleCakeBehavior> BLACK_CANDLE_CAKE;

    public static BlockType<BlockBlackCarpetBehavior> BLACK_CARPET;

    public static BlockType<BlockBlackConcreteBehavior> BLACK_CONCRETE;

    public static BlockType<BlockBlackConcretePowderBehavior> BLACK_CONCRETE_POWDER;

    public static BlockType<BlockBlackGlazedTerracottaBehavior> BLACK_GLAZED_TERRACOTTA;

    public static BlockType<BlockBlackShulkerBoxBehavior> BLACK_SHULKER_BOX;

    public static BlockType<BlockBlackStainedGlassBehavior> BLACK_STAINED_GLASS;

    public static BlockType<BlockBlackStainedGlassPaneBehavior> BLACK_STAINED_GLASS_PANE;

    public static BlockType<BlockBlackTerracottaBehavior> BLACK_TERRACOTTA;

    public static BlockType<BlockBlackWoolBehavior> BLACK_WOOL;

    public static BlockType<BlockBlackstoneBehavior> BLACKSTONE;

    public static BlockType<BlockBlackstoneDoubleSlabBehavior> BLACKSTONE_DOUBLE_SLAB;

    public static BlockType<BlockBlackstoneSlabBehavior> BLACKSTONE_SLAB;

    public static BlockType<BlockBlackstoneStairsBehavior> BLACKSTONE_STAIRS;

    public static BlockType<BlockBlackstoneWallBehavior> BLACKSTONE_WALL;

    public static BlockType<BlockBlastFurnaceBehavior> BLAST_FURNACE;

    public static BlockType<BlockBlueCandleBehavior> BLUE_CANDLE;

    public static BlockType<BlockBlueCandleCakeBehavior> BLUE_CANDLE_CAKE;

    public static BlockType<BlockBlueCarpetBehavior> BLUE_CARPET;

    public static BlockType<BlockBlueConcreteBehavior> BLUE_CONCRETE;

    public static BlockType<BlockBlueConcretePowderBehavior> BLUE_CONCRETE_POWDER;

    public static BlockType<BlockBlueGlazedTerracottaBehavior> BLUE_GLAZED_TERRACOTTA;

    public static BlockType<BlockBlueIceBehavior> BLUE_ICE;

    public static BlockType<BlockBlueOrchidBehavior> BLUE_ORCHID;

    public static BlockType<BlockBlueShulkerBoxBehavior> BLUE_SHULKER_BOX;

    public static BlockType<BlockBlueStainedGlassBehavior> BLUE_STAINED_GLASS;

    public static BlockType<BlockBlueStainedGlassPaneBehavior> BLUE_STAINED_GLASS_PANE;

    public static BlockType<BlockBlueTerracottaBehavior> BLUE_TERRACOTTA;

    public static BlockType<BlockBlueWoolBehavior> BLUE_WOOL;

    public static BlockType<BlockBoneBlockBehavior> BONE_BLOCK;

    public static BlockType<BlockBookshelfBehavior> BOOKSHELF;

    public static BlockType<BlockBorderBlockBehavior> BORDER_BLOCK;

    public static BlockType<BlockBrainCoralBehavior> BRAIN_CORAL;

    public static BlockType<BlockBrainCoralBlockBehavior> BRAIN_CORAL_BLOCK;

    public static BlockType<BlockBrainCoralFanBehavior> BRAIN_CORAL_FAN;

    public static BlockType<BlockBrewingStandBehavior> BREWING_STAND;

    public static BlockType<BlockBrickBlockBehavior> BRICK_BLOCK;

    public static BlockType<BlockBrickSlabBehavior> BRICK_SLAB;

    public static BlockType<BlockBrickStairsBehavior> BRICK_STAIRS;

    public static BlockType<BlockBrownCandleBehavior> BROWN_CANDLE;

    public static BlockType<BlockBrownCandleCakeBehavior> BROWN_CANDLE_CAKE;

    public static BlockType<BlockBrownCarpetBehavior> BROWN_CARPET;

    public static BlockType<BlockBrownConcreteBehavior> BROWN_CONCRETE;

    public static BlockType<BlockBrownConcretePowderBehavior> BROWN_CONCRETE_POWDER;

    public static BlockType<BlockBrownGlazedTerracottaBehavior> BROWN_GLAZED_TERRACOTTA;

    public static BlockType<BlockBrownMushroomBehavior> BROWN_MUSHROOM;

    public static BlockType<BlockBrownMushroomBlockBehavior> BROWN_MUSHROOM_BLOCK;

    public static BlockType<BlockBrownShulkerBoxBehavior> BROWN_SHULKER_BOX;

    public static BlockType<BlockBrownStainedGlassBehavior> BROWN_STAINED_GLASS;

    public static BlockType<BlockBrownStainedGlassPaneBehavior> BROWN_STAINED_GLASS_PANE;

    public static BlockType<BlockBrownTerracottaBehavior> BROWN_TERRACOTTA;

    public static BlockType<BlockBrownWoolBehavior> BROWN_WOOL;

    public static BlockType<BlockBubbleColumnBehavior> BUBBLE_COLUMN;

    public static BlockType<BlockBubbleCoralBehavior> BUBBLE_CORAL;

    public static BlockType<BlockBubbleCoralBlockBehavior> BUBBLE_CORAL_BLOCK;

    public static BlockType<BlockBubbleCoralFanBehavior> BUBBLE_CORAL_FAN;

    public static BlockType<BlockBuddingAmethystBehavior> BUDDING_AMETHYST;

    public static BlockType<BlockCactusBehavior> CACTUS;

    public static BlockType<BlockCakeBehavior> CAKE;

    public static BlockType<BlockCalciteBehavior> CALCITE;

    public static BlockType<BlockCalibratedSculkSensorBehavior> CALIBRATED_SCULK_SENSOR;

    public static BlockType<BlockCameraBehavior> CAMERA;

    public static BlockType<BlockCampfireBehavior> CAMPFIRE;

    public static BlockType<BlockCandleBehavior> CANDLE;

    public static BlockType<BlockCandleCakeBehavior> CANDLE_CAKE;

    public static BlockType<BlockCarrotsBehavior> CARROTS;

    public static BlockType<BlockCartographyTableBehavior> CARTOGRAPHY_TABLE;

    public static BlockType<BlockCarvedPumpkinBehavior> CARVED_PUMPKIN;

    public static BlockType<BlockCauldronBehavior> CAULDRON;

    public static BlockType<BlockCaveVinesBehavior> CAVE_VINES;

    public static BlockType<BlockCaveVinesBodyWithBerriesBehavior> CAVE_VINES_BODY_WITH_BERRIES;

    public static BlockType<BlockCaveVinesHeadWithBerriesBehavior> CAVE_VINES_HEAD_WITH_BERRIES;

    public static BlockType<BlockChainBehavior> CHAIN;

    public static BlockType<BlockChainCommandBlockBehavior> CHAIN_COMMAND_BLOCK;

    public static BlockType<BlockChemicalHeatBehavior> CHEMICAL_HEAT;

    public static BlockType<BlockChemistryTableBehavior> CHEMISTRY_TABLE;

    public static BlockType<BlockCherryButtonBehavior> CHERRY_BUTTON;

    public static BlockType<BlockCherryDoorBehavior> CHERRY_DOOR;

    public static BlockType<BlockCherryDoubleSlabBehavior> CHERRY_DOUBLE_SLAB;

    public static BlockType<BlockCherryFenceBehavior> CHERRY_FENCE;

    public static BlockType<BlockCherryFenceGateBehavior> CHERRY_FENCE_GATE;

    public static BlockType<BlockCherryHangingSignBehavior> CHERRY_HANGING_SIGN;

    public static BlockType<BlockCherryLeavesBehavior> CHERRY_LEAVES;

    public static BlockType<BlockCherryLogBehavior> CHERRY_LOG;

    public static BlockType<BlockCherryPlanksBehavior> CHERRY_PLANKS;

    public static BlockType<BlockCherryPressurePlateBehavior> CHERRY_PRESSURE_PLATE;

    public static BlockType<BlockCherrySaplingBehavior> CHERRY_SAPLING;

    public static BlockType<BlockCherrySlabBehavior> CHERRY_SLAB;

    public static BlockType<BlockCherryStairsBehavior> CHERRY_STAIRS;

    public static BlockType<BlockCherryStandingSignBehavior> CHERRY_STANDING_SIGN;

    public static BlockType<BlockCherryTrapdoorBehavior> CHERRY_TRAPDOOR;

    public static BlockType<BlockCherryWallSignBehavior> CHERRY_WALL_SIGN;

    public static BlockType<BlockCherryWoodBehavior> CHERRY_WOOD;

    public static BlockType<BlockChestBehavior> CHEST;

    public static BlockType<BlockChiseledBookshelfBehavior> CHISELED_BOOKSHELF;

    public static BlockType<BlockChiseledCopperBehavior> CHISELED_COPPER;

    public static BlockType<BlockChiseledDeepslateBehavior> CHISELED_DEEPSLATE;

    public static BlockType<BlockChiseledNetherBricksBehavior> CHISELED_NETHER_BRICKS;

    public static BlockType<BlockChiseledPolishedBlackstoneBehavior> CHISELED_POLISHED_BLACKSTONE;

    public static BlockType<BlockChiseledTuffBehavior> CHISELED_TUFF;

    public static BlockType<BlockChiseledTuffBricksBehavior> CHISELED_TUFF_BRICKS;

    public static BlockType<BlockChorusFlowerBehavior> CHORUS_FLOWER;

    public static BlockType<BlockChorusPlantBehavior> CHORUS_PLANT;

    public static BlockType<BlockClayBehavior> CLAY;

    public static BlockType<BlockClientRequestPlaceholderBlockBehavior> CLIENT_REQUEST_PLACEHOLDER_BLOCK;

    public static BlockType<BlockCoalBlockBehavior> COAL_BLOCK;

    public static BlockType<BlockCoalOreBehavior> COAL_ORE;

    public static BlockType<BlockCobbledDeepslateBehavior> COBBLED_DEEPSLATE;

    public static BlockType<BlockCobbledDeepslateDoubleSlabBehavior> COBBLED_DEEPSLATE_DOUBLE_SLAB;

    public static BlockType<BlockCobbledDeepslateSlabBehavior> COBBLED_DEEPSLATE_SLAB;

    public static BlockType<BlockCobbledDeepslateStairsBehavior> COBBLED_DEEPSLATE_STAIRS;

    public static BlockType<BlockCobbledDeepslateWallBehavior> COBBLED_DEEPSLATE_WALL;

    public static BlockType<BlockCobblestoneBehavior> COBBLESTONE;

    public static BlockType<BlockCobblestoneSlabBehavior> COBBLESTONE_SLAB;

    public static BlockType<BlockCobblestoneWallBehavior> COBBLESTONE_WALL;

    public static BlockType<BlockCocoaBehavior> COCOA;

    public static BlockType<BlockColoredTorchBpBehavior> COLORED_TORCH_BP;

    public static BlockType<BlockColoredTorchRgBehavior> COLORED_TORCH_RG;

    public static BlockType<BlockCommandBlockBehavior> COMMAND_BLOCK;

    public static BlockType<BlockComposterBehavior> COMPOSTER;

    public static BlockType<BlockConduitBehavior> CONDUIT;

    public static BlockType<BlockCopperBlockBehavior> COPPER_BLOCK;

    public static BlockType<BlockCopperBulbBehavior> COPPER_BULB;

    public static BlockType<BlockCopperDoorBehavior> COPPER_DOOR;

    public static BlockType<BlockCopperGrateBehavior> COPPER_GRATE;

    public static BlockType<BlockCopperOreBehavior> COPPER_ORE;

    public static BlockType<BlockCopperTrapdoorBehavior> COPPER_TRAPDOOR;

    public static BlockType<BlockCoralFanHangBehavior> CORAL_FAN_HANG;

    public static BlockType<BlockCoralFanHang2Behavior> CORAL_FAN_HANG2;

    public static BlockType<BlockCoralFanHang3Behavior> CORAL_FAN_HANG3;

    public static BlockType<BlockCornflowerBehavior> CORNFLOWER;

    public static BlockType<BlockCrackedDeepslateBricksBehavior> CRACKED_DEEPSLATE_BRICKS;

    public static BlockType<BlockCrackedDeepslateTilesBehavior> CRACKED_DEEPSLATE_TILES;

    public static BlockType<BlockCrackedNetherBricksBehavior> CRACKED_NETHER_BRICKS;

    public static BlockType<BlockCrackedPolishedBlackstoneBricksBehavior> CRACKED_POLISHED_BLACKSTONE_BRICKS;

    public static BlockType<BlockCrafterBehavior> CRAFTER;

    public static BlockType<BlockCraftingTableBehavior> CRAFTING_TABLE;

    public static BlockType<BlockCrimsonButtonBehavior> CRIMSON_BUTTON;

    public static BlockType<BlockCrimsonDoorBehavior> CRIMSON_DOOR;

    public static BlockType<BlockCrimsonDoubleSlabBehavior> CRIMSON_DOUBLE_SLAB;

    public static BlockType<BlockCrimsonFenceBehavior> CRIMSON_FENCE;

    public static BlockType<BlockCrimsonFenceGateBehavior> CRIMSON_FENCE_GATE;

    public static BlockType<BlockCrimsonFungusBehavior> CRIMSON_FUNGUS;

    public static BlockType<BlockCrimsonHangingSignBehavior> CRIMSON_HANGING_SIGN;

    public static BlockType<BlockCrimsonHyphaeBehavior> CRIMSON_HYPHAE;

    public static BlockType<BlockCrimsonNyliumBehavior> CRIMSON_NYLIUM;

    public static BlockType<BlockCrimsonPlanksBehavior> CRIMSON_PLANKS;

    public static BlockType<BlockCrimsonPressurePlateBehavior> CRIMSON_PRESSURE_PLATE;

    public static BlockType<BlockCrimsonRootsBehavior> CRIMSON_ROOTS;

    public static BlockType<BlockCrimsonSlabBehavior> CRIMSON_SLAB;

    public static BlockType<BlockCrimsonStairsBehavior> CRIMSON_STAIRS;

    public static BlockType<BlockCrimsonStandingSignBehavior> CRIMSON_STANDING_SIGN;

    public static BlockType<BlockCrimsonStemBehavior> CRIMSON_STEM;

    public static BlockType<BlockCrimsonTrapdoorBehavior> CRIMSON_TRAPDOOR;

    public static BlockType<BlockCrimsonWallSignBehavior> CRIMSON_WALL_SIGN;

    public static BlockType<BlockCryingObsidianBehavior> CRYING_OBSIDIAN;

    public static BlockType<BlockCutCopperBehavior> CUT_COPPER;

    public static BlockType<BlockCutCopperSlabBehavior> CUT_COPPER_SLAB;

    public static BlockType<BlockCutCopperStairsBehavior> CUT_COPPER_STAIRS;

    public static BlockType<BlockCyanCandleBehavior> CYAN_CANDLE;

    public static BlockType<BlockCyanCandleCakeBehavior> CYAN_CANDLE_CAKE;

    public static BlockType<BlockCyanCarpetBehavior> CYAN_CARPET;

    public static BlockType<BlockCyanConcreteBehavior> CYAN_CONCRETE;

    public static BlockType<BlockCyanConcretePowderBehavior> CYAN_CONCRETE_POWDER;

    public static BlockType<BlockCyanGlazedTerracottaBehavior> CYAN_GLAZED_TERRACOTTA;

    public static BlockType<BlockCyanShulkerBoxBehavior> CYAN_SHULKER_BOX;

    public static BlockType<BlockCyanStainedGlassBehavior> CYAN_STAINED_GLASS;

    public static BlockType<BlockCyanStainedGlassPaneBehavior> CYAN_STAINED_GLASS_PANE;

    public static BlockType<BlockCyanTerracottaBehavior> CYAN_TERRACOTTA;

    public static BlockType<BlockCyanWoolBehavior> CYAN_WOOL;

    public static BlockType<BlockDarkOakButtonBehavior> DARK_OAK_BUTTON;

    public static BlockType<BlockDarkOakDoorBehavior> DARK_OAK_DOOR;

    public static BlockType<BlockDarkOakDoubleSlabBehavior> DARK_OAK_DOUBLE_SLAB;

    public static BlockType<BlockDarkOakFenceBehavior> DARK_OAK_FENCE;

    public static BlockType<BlockDarkOakFenceGateBehavior> DARK_OAK_FENCE_GATE;

    public static BlockType<BlockDarkOakHangingSignBehavior> DARK_OAK_HANGING_SIGN;

    public static BlockType<BlockDarkOakLeavesBehavior> DARK_OAK_LEAVES;

    public static BlockType<BlockDarkOakLogBehavior> DARK_OAK_LOG;

    public static BlockType<BlockDarkOakPlanksBehavior> DARK_OAK_PLANKS;

    public static BlockType<BlockDarkOakPressurePlateBehavior> DARK_OAK_PRESSURE_PLATE;

    public static BlockType<BlockDarkOakSaplingBehavior> DARK_OAK_SAPLING;

    public static BlockType<BlockDarkOakSlabBehavior> DARK_OAK_SLAB;

    public static BlockType<BlockDarkOakStairsBehavior> DARK_OAK_STAIRS;

    public static BlockType<BlockDarkOakTrapdoorBehavior> DARK_OAK_TRAPDOOR;

    public static BlockType<BlockDarkOakWoodBehavior> DARK_OAK_WOOD;

    public static BlockType<BlockDarkPrismarineStairsBehavior> DARK_PRISMARINE_STAIRS;

    public static BlockType<BlockDarkoakStandingSignBehavior> DARKOAK_STANDING_SIGN;

    public static BlockType<BlockDarkoakWallSignBehavior> DARKOAK_WALL_SIGN;

    public static BlockType<BlockDaylightDetectorBehavior> DAYLIGHT_DETECTOR;

    public static BlockType<BlockDaylightDetectorInvertedBehavior> DAYLIGHT_DETECTOR_INVERTED;

    public static BlockType<BlockDeadBrainCoralBehavior> DEAD_BRAIN_CORAL;

    public static BlockType<BlockDeadBrainCoralBlockBehavior> DEAD_BRAIN_CORAL_BLOCK;

    public static BlockType<BlockDeadBrainCoralFanBehavior> DEAD_BRAIN_CORAL_FAN;

    public static BlockType<BlockDeadBubbleCoralBehavior> DEAD_BUBBLE_CORAL;

    public static BlockType<BlockDeadBubbleCoralBlockBehavior> DEAD_BUBBLE_CORAL_BLOCK;

    public static BlockType<BlockDeadBubbleCoralFanBehavior> DEAD_BUBBLE_CORAL_FAN;

    public static BlockType<BlockDeadFireCoralBehavior> DEAD_FIRE_CORAL;

    public static BlockType<BlockDeadFireCoralBlockBehavior> DEAD_FIRE_CORAL_BLOCK;

    public static BlockType<BlockDeadFireCoralFanBehavior> DEAD_FIRE_CORAL_FAN;

    public static BlockType<BlockDeadHornCoralBehavior> DEAD_HORN_CORAL;

    public static BlockType<BlockDeadHornCoralBlockBehavior> DEAD_HORN_CORAL_BLOCK;

    public static BlockType<BlockDeadHornCoralFanBehavior> DEAD_HORN_CORAL_FAN;

    public static BlockType<BlockDeadTubeCoralBehavior> DEAD_TUBE_CORAL;

    public static BlockType<BlockDeadTubeCoralBlockBehavior> DEAD_TUBE_CORAL_BLOCK;

    public static BlockType<BlockDeadTubeCoralFanBehavior> DEAD_TUBE_CORAL_FAN;

    public static BlockType<BlockDeadbushBehavior> DEADBUSH;

    public static BlockType<BlockDecoratedPotBehavior> DECORATED_POT;

    public static BlockType<BlockDeepslateBehavior> DEEPSLATE;

    public static BlockType<BlockDeepslateBrickDoubleSlabBehavior> DEEPSLATE_BRICK_DOUBLE_SLAB;

    public static BlockType<BlockDeepslateBrickSlabBehavior> DEEPSLATE_BRICK_SLAB;

    public static BlockType<BlockDeepslateBrickStairsBehavior> DEEPSLATE_BRICK_STAIRS;

    public static BlockType<BlockDeepslateBrickWallBehavior> DEEPSLATE_BRICK_WALL;

    public static BlockType<BlockDeepslateBricksBehavior> DEEPSLATE_BRICKS;

    public static BlockType<BlockDeepslateCoalOreBehavior> DEEPSLATE_COAL_ORE;

    public static BlockType<BlockDeepslateCopperOreBehavior> DEEPSLATE_COPPER_ORE;

    public static BlockType<BlockDeepslateDiamondOreBehavior> DEEPSLATE_DIAMOND_ORE;

    public static BlockType<BlockDeepslateEmeraldOreBehavior> DEEPSLATE_EMERALD_ORE;

    public static BlockType<BlockDeepslateGoldOreBehavior> DEEPSLATE_GOLD_ORE;

    public static BlockType<BlockDeepslateIronOreBehavior> DEEPSLATE_IRON_ORE;

    public static BlockType<BlockDeepslateLapisOreBehavior> DEEPSLATE_LAPIS_ORE;

    public static BlockType<BlockDeepslateRedstoneOreBehavior> DEEPSLATE_REDSTONE_ORE;

    public static BlockType<BlockDeepslateTileDoubleSlabBehavior> DEEPSLATE_TILE_DOUBLE_SLAB;

    public static BlockType<BlockDeepslateTileSlabBehavior> DEEPSLATE_TILE_SLAB;

    public static BlockType<BlockDeepslateTileStairsBehavior> DEEPSLATE_TILE_STAIRS;

    public static BlockType<BlockDeepslateTileWallBehavior> DEEPSLATE_TILE_WALL;

    public static BlockType<BlockDeepslateTilesBehavior> DEEPSLATE_TILES;

    public static BlockType<BlockDenyBehavior> DENY;

    public static BlockType<BlockDetectorRailBehavior> DETECTOR_RAIL;

    public static BlockType<BlockDiamondBlockBehavior> DIAMOND_BLOCK;

    public static BlockType<BlockDiamondOreBehavior> DIAMOND_ORE;

    public static BlockType<BlockDioriteBehavior> DIORITE;

    public static BlockType<BlockDioriteStairsBehavior> DIORITE_STAIRS;

    public static BlockType<BlockDirtBehavior> DIRT;

    public static BlockType<BlockDirtWithRootsBehavior> DIRT_WITH_ROOTS;

    public static BlockType<BlockDispenserBehavior> DISPENSER;

    public static BlockType<BlockDoubleCutCopperSlabBehavior> DOUBLE_CUT_COPPER_SLAB;

    public static BlockType<BlockDoubleStoneBlockSlabBehavior> DOUBLE_STONE_BLOCK_SLAB;

    public static BlockType<BlockDoubleStoneBlockSlab2Behavior> DOUBLE_STONE_BLOCK_SLAB2;

    public static BlockType<BlockDoubleStoneBlockSlab3Behavior> DOUBLE_STONE_BLOCK_SLAB3;

    public static BlockType<BlockDoubleStoneBlockSlab4Behavior> DOUBLE_STONE_BLOCK_SLAB4;

    public static BlockType<BlockDragonEggBehavior> DRAGON_EGG;

    public static BlockType<BlockDriedKelpBlockBehavior> DRIED_KELP_BLOCK;

    public static BlockType<BlockDripstoneBlockBehavior> DRIPSTONE_BLOCK;

    public static BlockType<BlockDropperBehavior> DROPPER;

    public static BlockType<BlockElement0Behavior> ELEMENT_0;

    public static BlockType<BlockElement1Behavior> ELEMENT_1;

    public static BlockType<BlockElement10Behavior> ELEMENT_10;

    public static BlockType<BlockElement100Behavior> ELEMENT_100;

    public static BlockType<BlockElement101Behavior> ELEMENT_101;

    public static BlockType<BlockElement102Behavior> ELEMENT_102;

    public static BlockType<BlockElement103Behavior> ELEMENT_103;

    public static BlockType<BlockElement104Behavior> ELEMENT_104;

    public static BlockType<BlockElement105Behavior> ELEMENT_105;

    public static BlockType<BlockElement106Behavior> ELEMENT_106;

    public static BlockType<BlockElement107Behavior> ELEMENT_107;

    public static BlockType<BlockElement108Behavior> ELEMENT_108;

    public static BlockType<BlockElement109Behavior> ELEMENT_109;

    public static BlockType<BlockElement11Behavior> ELEMENT_11;

    public static BlockType<BlockElement110Behavior> ELEMENT_110;

    public static BlockType<BlockElement111Behavior> ELEMENT_111;

    public static BlockType<BlockElement112Behavior> ELEMENT_112;

    public static BlockType<BlockElement113Behavior> ELEMENT_113;

    public static BlockType<BlockElement114Behavior> ELEMENT_114;

    public static BlockType<BlockElement115Behavior> ELEMENT_115;

    public static BlockType<BlockElement116Behavior> ELEMENT_116;

    public static BlockType<BlockElement117Behavior> ELEMENT_117;

    public static BlockType<BlockElement118Behavior> ELEMENT_118;

    public static BlockType<BlockElement12Behavior> ELEMENT_12;

    public static BlockType<BlockElement13Behavior> ELEMENT_13;

    public static BlockType<BlockElement14Behavior> ELEMENT_14;

    public static BlockType<BlockElement15Behavior> ELEMENT_15;

    public static BlockType<BlockElement16Behavior> ELEMENT_16;

    public static BlockType<BlockElement17Behavior> ELEMENT_17;

    public static BlockType<BlockElement18Behavior> ELEMENT_18;

    public static BlockType<BlockElement19Behavior> ELEMENT_19;

    public static BlockType<BlockElement2Behavior> ELEMENT_2;

    public static BlockType<BlockElement20Behavior> ELEMENT_20;

    public static BlockType<BlockElement21Behavior> ELEMENT_21;

    public static BlockType<BlockElement22Behavior> ELEMENT_22;

    public static BlockType<BlockElement23Behavior> ELEMENT_23;

    public static BlockType<BlockElement24Behavior> ELEMENT_24;

    public static BlockType<BlockElement25Behavior> ELEMENT_25;

    public static BlockType<BlockElement26Behavior> ELEMENT_26;

    public static BlockType<BlockElement27Behavior> ELEMENT_27;

    public static BlockType<BlockElement28Behavior> ELEMENT_28;

    public static BlockType<BlockElement29Behavior> ELEMENT_29;

    public static BlockType<BlockElement3Behavior> ELEMENT_3;

    public static BlockType<BlockElement30Behavior> ELEMENT_30;

    public static BlockType<BlockElement31Behavior> ELEMENT_31;

    public static BlockType<BlockElement32Behavior> ELEMENT_32;

    public static BlockType<BlockElement33Behavior> ELEMENT_33;

    public static BlockType<BlockElement34Behavior> ELEMENT_34;

    public static BlockType<BlockElement35Behavior> ELEMENT_35;

    public static BlockType<BlockElement36Behavior> ELEMENT_36;

    public static BlockType<BlockElement37Behavior> ELEMENT_37;

    public static BlockType<BlockElement38Behavior> ELEMENT_38;

    public static BlockType<BlockElement39Behavior> ELEMENT_39;

    public static BlockType<BlockElement4Behavior> ELEMENT_4;

    public static BlockType<BlockElement40Behavior> ELEMENT_40;

    public static BlockType<BlockElement41Behavior> ELEMENT_41;

    public static BlockType<BlockElement42Behavior> ELEMENT_42;

    public static BlockType<BlockElement43Behavior> ELEMENT_43;

    public static BlockType<BlockElement44Behavior> ELEMENT_44;

    public static BlockType<BlockElement45Behavior> ELEMENT_45;

    public static BlockType<BlockElement46Behavior> ELEMENT_46;

    public static BlockType<BlockElement47Behavior> ELEMENT_47;

    public static BlockType<BlockElement48Behavior> ELEMENT_48;

    public static BlockType<BlockElement49Behavior> ELEMENT_49;

    public static BlockType<BlockElement5Behavior> ELEMENT_5;

    public static BlockType<BlockElement50Behavior> ELEMENT_50;

    public static BlockType<BlockElement51Behavior> ELEMENT_51;

    public static BlockType<BlockElement52Behavior> ELEMENT_52;

    public static BlockType<BlockElement53Behavior> ELEMENT_53;

    public static BlockType<BlockElement54Behavior> ELEMENT_54;

    public static BlockType<BlockElement55Behavior> ELEMENT_55;

    public static BlockType<BlockElement56Behavior> ELEMENT_56;

    public static BlockType<BlockElement57Behavior> ELEMENT_57;

    public static BlockType<BlockElement58Behavior> ELEMENT_58;

    public static BlockType<BlockElement59Behavior> ELEMENT_59;

    public static BlockType<BlockElement6Behavior> ELEMENT_6;

    public static BlockType<BlockElement60Behavior> ELEMENT_60;

    public static BlockType<BlockElement61Behavior> ELEMENT_61;

    public static BlockType<BlockElement62Behavior> ELEMENT_62;

    public static BlockType<BlockElement63Behavior> ELEMENT_63;

    public static BlockType<BlockElement64Behavior> ELEMENT_64;

    public static BlockType<BlockElement65Behavior> ELEMENT_65;

    public static BlockType<BlockElement66Behavior> ELEMENT_66;

    public static BlockType<BlockElement67Behavior> ELEMENT_67;

    public static BlockType<BlockElement68Behavior> ELEMENT_68;

    public static BlockType<BlockElement69Behavior> ELEMENT_69;

    public static BlockType<BlockElement7Behavior> ELEMENT_7;

    public static BlockType<BlockElement70Behavior> ELEMENT_70;

    public static BlockType<BlockElement71Behavior> ELEMENT_71;

    public static BlockType<BlockElement72Behavior> ELEMENT_72;

    public static BlockType<BlockElement73Behavior> ELEMENT_73;

    public static BlockType<BlockElement74Behavior> ELEMENT_74;

    public static BlockType<BlockElement75Behavior> ELEMENT_75;

    public static BlockType<BlockElement76Behavior> ELEMENT_76;

    public static BlockType<BlockElement77Behavior> ELEMENT_77;

    public static BlockType<BlockElement78Behavior> ELEMENT_78;

    public static BlockType<BlockElement79Behavior> ELEMENT_79;

    public static BlockType<BlockElement8Behavior> ELEMENT_8;

    public static BlockType<BlockElement80Behavior> ELEMENT_80;

    public static BlockType<BlockElement81Behavior> ELEMENT_81;

    public static BlockType<BlockElement82Behavior> ELEMENT_82;

    public static BlockType<BlockElement83Behavior> ELEMENT_83;

    public static BlockType<BlockElement84Behavior> ELEMENT_84;

    public static BlockType<BlockElement85Behavior> ELEMENT_85;

    public static BlockType<BlockElement86Behavior> ELEMENT_86;

    public static BlockType<BlockElement87Behavior> ELEMENT_87;

    public static BlockType<BlockElement88Behavior> ELEMENT_88;

    public static BlockType<BlockElement89Behavior> ELEMENT_89;

    public static BlockType<BlockElement9Behavior> ELEMENT_9;

    public static BlockType<BlockElement90Behavior> ELEMENT_90;

    public static BlockType<BlockElement91Behavior> ELEMENT_91;

    public static BlockType<BlockElement92Behavior> ELEMENT_92;

    public static BlockType<BlockElement93Behavior> ELEMENT_93;

    public static BlockType<BlockElement94Behavior> ELEMENT_94;

    public static BlockType<BlockElement95Behavior> ELEMENT_95;

    public static BlockType<BlockElement96Behavior> ELEMENT_96;

    public static BlockType<BlockElement97Behavior> ELEMENT_97;

    public static BlockType<BlockElement98Behavior> ELEMENT_98;

    public static BlockType<BlockElement99Behavior> ELEMENT_99;

    public static BlockType<BlockEmeraldBlockBehavior> EMERALD_BLOCK;

    public static BlockType<BlockEmeraldOreBehavior> EMERALD_ORE;

    public static BlockType<BlockEnchantingTableBehavior> ENCHANTING_TABLE;

    public static BlockType<BlockEndBrickStairsBehavior> END_BRICK_STAIRS;

    public static BlockType<BlockEndBricksBehavior> END_BRICKS;

    public static BlockType<BlockEndGatewayBehavior> END_GATEWAY;

    public static BlockType<BlockEndPortalBehavior> END_PORTAL;

    public static BlockType<BlockEndPortalFrameBehavior> END_PORTAL_FRAME;

    public static BlockType<BlockEndRodBehavior> END_ROD;

    public static BlockType<BlockEndStoneBehavior> END_STONE;

    public static BlockType<BlockEnderChestBehavior> ENDER_CHEST;

    public static BlockType<BlockExposedChiseledCopperBehavior> EXPOSED_CHISELED_COPPER;

    public static BlockType<BlockExposedCopperBehavior> EXPOSED_COPPER;

    public static BlockType<BlockExposedCopperBulbBehavior> EXPOSED_COPPER_BULB;

    public static BlockType<BlockExposedCopperDoorBehavior> EXPOSED_COPPER_DOOR;

    public static BlockType<BlockExposedCopperGrateBehavior> EXPOSED_COPPER_GRATE;

    public static BlockType<BlockExposedCopperTrapdoorBehavior> EXPOSED_COPPER_TRAPDOOR;

    public static BlockType<BlockExposedCutCopperBehavior> EXPOSED_CUT_COPPER;

    public static BlockType<BlockExposedCutCopperSlabBehavior> EXPOSED_CUT_COPPER_SLAB;

    public static BlockType<BlockExposedCutCopperStairsBehavior> EXPOSED_CUT_COPPER_STAIRS;

    public static BlockType<BlockExposedDoubleCutCopperSlabBehavior> EXPOSED_DOUBLE_CUT_COPPER_SLAB;

    public static BlockType<BlockFarmlandBehavior> FARMLAND;

    public static BlockType<BlockFenceGateBehavior> FENCE_GATE;

    public static BlockType<BlockFernBehavior> FERN;

    public static BlockType<BlockFireBehavior> FIRE;

    public static BlockType<BlockFireCoralBehavior> FIRE_CORAL;

    public static BlockType<BlockFireCoralBlockBehavior> FIRE_CORAL_BLOCK;

    public static BlockType<BlockFireCoralFanBehavior> FIRE_CORAL_FAN;

    public static BlockType<BlockFletchingTableBehavior> FLETCHING_TABLE;

    public static BlockType<BlockFlowerPotBehavior> FLOWER_POT;

    public static BlockType<BlockFloweringAzaleaBehavior> FLOWERING_AZALEA;

    public static BlockType<BlockFlowingLavaBehavior> FLOWING_LAVA;

    public static BlockType<BlockFlowingWaterBehavior> FLOWING_WATER;

    public static BlockType<BlockFrameBehavior> FRAME;

    public static BlockType<BlockFrogSpawnBehavior> FROG_SPAWN;

    public static BlockType<BlockFrostedIceBehavior> FROSTED_ICE;

    public static BlockType<BlockFurnaceBehavior> FURNACE;

    public static BlockType<BlockGildedBlackstoneBehavior> GILDED_BLACKSTONE;

    public static BlockType<BlockGlassBehavior> GLASS;

    public static BlockType<BlockGlassPaneBehavior> GLASS_PANE;

    public static BlockType<BlockGlowFrameBehavior> GLOW_FRAME;

    public static BlockType<BlockGlowLichenBehavior> GLOW_LICHEN;

    public static BlockType<BlockGlowingobsidianBehavior> GLOWINGOBSIDIAN;

    public static BlockType<BlockGlowstoneBehavior> GLOWSTONE;

    public static BlockType<BlockGoldBlockBehavior> GOLD_BLOCK;

    public static BlockType<BlockGoldOreBehavior> GOLD_ORE;

    public static BlockType<BlockGoldenRailBehavior> GOLDEN_RAIL;

    public static BlockType<BlockGraniteBehavior> GRANITE;

    public static BlockType<BlockGraniteStairsBehavior> GRANITE_STAIRS;

    public static BlockType<BlockGrassBlockBehavior> GRASS_BLOCK;

    public static BlockType<BlockGrassPathBehavior> GRASS_PATH;

    public static BlockType<BlockGravelBehavior> GRAVEL;

    public static BlockType<BlockGrayCandleBehavior> GRAY_CANDLE;

    public static BlockType<BlockGrayCandleCakeBehavior> GRAY_CANDLE_CAKE;

    public static BlockType<BlockGrayCarpetBehavior> GRAY_CARPET;

    public static BlockType<BlockGrayConcreteBehavior> GRAY_CONCRETE;

    public static BlockType<BlockGrayConcretePowderBehavior> GRAY_CONCRETE_POWDER;

    public static BlockType<BlockGrayGlazedTerracottaBehavior> GRAY_GLAZED_TERRACOTTA;

    public static BlockType<BlockGrayShulkerBoxBehavior> GRAY_SHULKER_BOX;

    public static BlockType<BlockGrayStainedGlassBehavior> GRAY_STAINED_GLASS;

    public static BlockType<BlockGrayStainedGlassPaneBehavior> GRAY_STAINED_GLASS_PANE;

    public static BlockType<BlockGrayTerracottaBehavior> GRAY_TERRACOTTA;

    public static BlockType<BlockGrayWoolBehavior> GRAY_WOOL;

    public static BlockType<BlockGreenCandleBehavior> GREEN_CANDLE;

    public static BlockType<BlockGreenCandleCakeBehavior> GREEN_CANDLE_CAKE;

    public static BlockType<BlockGreenCarpetBehavior> GREEN_CARPET;

    public static BlockType<BlockGreenConcreteBehavior> GREEN_CONCRETE;

    public static BlockType<BlockGreenConcretePowderBehavior> GREEN_CONCRETE_POWDER;

    public static BlockType<BlockGreenGlazedTerracottaBehavior> GREEN_GLAZED_TERRACOTTA;

    public static BlockType<BlockGreenShulkerBoxBehavior> GREEN_SHULKER_BOX;

    public static BlockType<BlockGreenStainedGlassBehavior> GREEN_STAINED_GLASS;

    public static BlockType<BlockGreenStainedGlassPaneBehavior> GREEN_STAINED_GLASS_PANE;

    public static BlockType<BlockGreenTerracottaBehavior> GREEN_TERRACOTTA;

    public static BlockType<BlockGreenWoolBehavior> GREEN_WOOL;

    public static BlockType<BlockGrindstoneBehavior> GRINDSTONE;

    public static BlockType<BlockHangingRootsBehavior> HANGING_ROOTS;

    public static BlockType<BlockHardBlackStainedGlassBehavior> HARD_BLACK_STAINED_GLASS;

    public static BlockType<BlockHardBlackStainedGlassPaneBehavior> HARD_BLACK_STAINED_GLASS_PANE;

    public static BlockType<BlockHardBlueStainedGlassBehavior> HARD_BLUE_STAINED_GLASS;

    public static BlockType<BlockHardBlueStainedGlassPaneBehavior> HARD_BLUE_STAINED_GLASS_PANE;

    public static BlockType<BlockHardBrownStainedGlassBehavior> HARD_BROWN_STAINED_GLASS;

    public static BlockType<BlockHardBrownStainedGlassPaneBehavior> HARD_BROWN_STAINED_GLASS_PANE;

    public static BlockType<BlockHardCyanStainedGlassBehavior> HARD_CYAN_STAINED_GLASS;

    public static BlockType<BlockHardCyanStainedGlassPaneBehavior> HARD_CYAN_STAINED_GLASS_PANE;

    public static BlockType<BlockHardGlassBehavior> HARD_GLASS;

    public static BlockType<BlockHardGlassPaneBehavior> HARD_GLASS_PANE;

    public static BlockType<BlockHardGrayStainedGlassBehavior> HARD_GRAY_STAINED_GLASS;

    public static BlockType<BlockHardGrayStainedGlassPaneBehavior> HARD_GRAY_STAINED_GLASS_PANE;

    public static BlockType<BlockHardGreenStainedGlassBehavior> HARD_GREEN_STAINED_GLASS;

    public static BlockType<BlockHardGreenStainedGlassPaneBehavior> HARD_GREEN_STAINED_GLASS_PANE;

    public static BlockType<BlockHardLightBlueStainedGlassBehavior> HARD_LIGHT_BLUE_STAINED_GLASS;

    public static BlockType<BlockHardLightBlueStainedGlassPaneBehavior> HARD_LIGHT_BLUE_STAINED_GLASS_PANE;

    public static BlockType<BlockHardLightGrayStainedGlassBehavior> HARD_LIGHT_GRAY_STAINED_GLASS;

    public static BlockType<BlockHardLightGrayStainedGlassPaneBehavior> HARD_LIGHT_GRAY_STAINED_GLASS_PANE;

    public static BlockType<BlockHardLimeStainedGlassBehavior> HARD_LIME_STAINED_GLASS;

    public static BlockType<BlockHardLimeStainedGlassPaneBehavior> HARD_LIME_STAINED_GLASS_PANE;

    public static BlockType<BlockHardMagentaStainedGlassBehavior> HARD_MAGENTA_STAINED_GLASS;

    public static BlockType<BlockHardMagentaStainedGlassPaneBehavior> HARD_MAGENTA_STAINED_GLASS_PANE;

    public static BlockType<BlockHardOrangeStainedGlassBehavior> HARD_ORANGE_STAINED_GLASS;

    public static BlockType<BlockHardOrangeStainedGlassPaneBehavior> HARD_ORANGE_STAINED_GLASS_PANE;

    public static BlockType<BlockHardPinkStainedGlassBehavior> HARD_PINK_STAINED_GLASS;

    public static BlockType<BlockHardPinkStainedGlassPaneBehavior> HARD_PINK_STAINED_GLASS_PANE;

    public static BlockType<BlockHardPurpleStainedGlassBehavior> HARD_PURPLE_STAINED_GLASS;

    public static BlockType<BlockHardPurpleStainedGlassPaneBehavior> HARD_PURPLE_STAINED_GLASS_PANE;

    public static BlockType<BlockHardRedStainedGlassBehavior> HARD_RED_STAINED_GLASS;

    public static BlockType<BlockHardRedStainedGlassPaneBehavior> HARD_RED_STAINED_GLASS_PANE;

    public static BlockType<BlockHardWhiteStainedGlassBehavior> HARD_WHITE_STAINED_GLASS;

    public static BlockType<BlockHardWhiteStainedGlassPaneBehavior> HARD_WHITE_STAINED_GLASS_PANE;

    public static BlockType<BlockHardYellowStainedGlassBehavior> HARD_YELLOW_STAINED_GLASS;

    public static BlockType<BlockHardYellowStainedGlassPaneBehavior> HARD_YELLOW_STAINED_GLASS_PANE;

    public static BlockType<BlockHardenedClayBehavior> HARDENED_CLAY;

    public static BlockType<BlockHayBlockBehavior> HAY_BLOCK;

    public static BlockType<BlockHeavyCoreBehavior> HEAVY_CORE;

    public static BlockType<BlockHeavyWeightedPressurePlateBehavior> HEAVY_WEIGHTED_PRESSURE_PLATE;

    public static BlockType<BlockHoneyBlockBehavior> HONEY_BLOCK;

    public static BlockType<BlockHoneycombBlockBehavior> HONEYCOMB_BLOCK;

    public static BlockType<BlockHopperBehavior> HOPPER;

    public static BlockType<BlockHornCoralBehavior> HORN_CORAL;

    public static BlockType<BlockHornCoralBlockBehavior> HORN_CORAL_BLOCK;

    public static BlockType<BlockHornCoralFanBehavior> HORN_CORAL_FAN;

    public static BlockType<BlockIceBehavior> ICE;

    public static BlockType<BlockInfestedDeepslateBehavior> INFESTED_DEEPSLATE;

    public static BlockType<BlockInfoUpdateBehavior> INFO_UPDATE;

    public static BlockType<BlockInfoUpdate2Behavior> INFO_UPDATE2;

    public static BlockType<BlockInvisibleBedrockBehavior> INVISIBLE_BEDROCK;

    public static BlockType<BlockIronBarsBehavior> IRON_BARS;

    public static BlockType<BlockIronBlockBehavior> IRON_BLOCK;

    public static BlockType<BlockIronDoorBehavior> IRON_DOOR;

    public static BlockType<BlockIronOreBehavior> IRON_ORE;

    public static BlockType<BlockIronTrapdoorBehavior> IRON_TRAPDOOR;

    public static BlockType<BlockJigsawBehavior> JIGSAW;

    public static BlockType<BlockJukeboxBehavior> JUKEBOX;

    public static BlockType<BlockJungleButtonBehavior> JUNGLE_BUTTON;

    public static BlockType<BlockJungleDoorBehavior> JUNGLE_DOOR;

    public static BlockType<BlockJungleDoubleSlabBehavior> JUNGLE_DOUBLE_SLAB;

    public static BlockType<BlockJungleFenceBehavior> JUNGLE_FENCE;

    public static BlockType<BlockJungleFenceGateBehavior> JUNGLE_FENCE_GATE;

    public static BlockType<BlockJungleHangingSignBehavior> JUNGLE_HANGING_SIGN;

    public static BlockType<BlockJungleLeavesBehavior> JUNGLE_LEAVES;

    public static BlockType<BlockJungleLogBehavior> JUNGLE_LOG;

    public static BlockType<BlockJunglePlanksBehavior> JUNGLE_PLANKS;

    public static BlockType<BlockJunglePressurePlateBehavior> JUNGLE_PRESSURE_PLATE;

    public static BlockType<BlockJungleSaplingBehavior> JUNGLE_SAPLING;

    public static BlockType<BlockJungleSlabBehavior> JUNGLE_SLAB;

    public static BlockType<BlockJungleStairsBehavior> JUNGLE_STAIRS;

    public static BlockType<BlockJungleStandingSignBehavior> JUNGLE_STANDING_SIGN;

    public static BlockType<BlockJungleTrapdoorBehavior> JUNGLE_TRAPDOOR;

    public static BlockType<BlockJungleWallSignBehavior> JUNGLE_WALL_SIGN;

    public static BlockType<BlockJungleWoodBehavior> JUNGLE_WOOD;

    public static BlockType<BlockKelpBehavior> KELP;

    public static BlockType<BlockLadderBehavior> LADDER;

    public static BlockType<BlockLanternBehavior> LANTERN;

    public static BlockType<BlockLapisBlockBehavior> LAPIS_BLOCK;

    public static BlockType<BlockLapisOreBehavior> LAPIS_ORE;

    public static BlockType<BlockLargeAmethystBudBehavior> LARGE_AMETHYST_BUD;

    public static BlockType<BlockLargeFernBehavior> LARGE_FERN;

    public static BlockType<BlockLavaBehavior> LAVA;

    public static BlockType<BlockLecternBehavior> LECTERN;

    public static BlockType<BlockLeverBehavior> LEVER;

    public static BlockType<BlockLightBlockBehavior> LIGHT_BLOCK;

    public static BlockType<BlockLightBlueCandleBehavior> LIGHT_BLUE_CANDLE;

    public static BlockType<BlockLightBlueCandleCakeBehavior> LIGHT_BLUE_CANDLE_CAKE;

    public static BlockType<BlockLightBlueCarpetBehavior> LIGHT_BLUE_CARPET;

    public static BlockType<BlockLightBlueConcreteBehavior> LIGHT_BLUE_CONCRETE;

    public static BlockType<BlockLightBlueConcretePowderBehavior> LIGHT_BLUE_CONCRETE_POWDER;

    public static BlockType<BlockLightBlueGlazedTerracottaBehavior> LIGHT_BLUE_GLAZED_TERRACOTTA;

    public static BlockType<BlockLightBlueShulkerBoxBehavior> LIGHT_BLUE_SHULKER_BOX;

    public static BlockType<BlockLightBlueStainedGlassBehavior> LIGHT_BLUE_STAINED_GLASS;

    public static BlockType<BlockLightBlueStainedGlassPaneBehavior> LIGHT_BLUE_STAINED_GLASS_PANE;

    public static BlockType<BlockLightBlueTerracottaBehavior> LIGHT_BLUE_TERRACOTTA;

    public static BlockType<BlockLightBlueWoolBehavior> LIGHT_BLUE_WOOL;

    public static BlockType<BlockLightGrayCandleBehavior> LIGHT_GRAY_CANDLE;

    public static BlockType<BlockLightGrayCandleCakeBehavior> LIGHT_GRAY_CANDLE_CAKE;

    public static BlockType<BlockLightGrayCarpetBehavior> LIGHT_GRAY_CARPET;

    public static BlockType<BlockLightGrayConcreteBehavior> LIGHT_GRAY_CONCRETE;

    public static BlockType<BlockLightGrayConcretePowderBehavior> LIGHT_GRAY_CONCRETE_POWDER;

    public static BlockType<BlockLightGrayShulkerBoxBehavior> LIGHT_GRAY_SHULKER_BOX;

    public static BlockType<BlockLightGrayStainedGlassBehavior> LIGHT_GRAY_STAINED_GLASS;

    public static BlockType<BlockLightGrayStainedGlassPaneBehavior> LIGHT_GRAY_STAINED_GLASS_PANE;

    public static BlockType<BlockLightGrayTerracottaBehavior> LIGHT_GRAY_TERRACOTTA;

    public static BlockType<BlockLightGrayWoolBehavior> LIGHT_GRAY_WOOL;

    public static BlockType<BlockLightWeightedPressurePlateBehavior> LIGHT_WEIGHTED_PRESSURE_PLATE;

    public static BlockType<BlockLightningRodBehavior> LIGHTNING_ROD;

    public static BlockType<BlockLilacBehavior> LILAC;

    public static BlockType<BlockLilyOfTheValleyBehavior> LILY_OF_THE_VALLEY;

    public static BlockType<BlockLimeCandleBehavior> LIME_CANDLE;

    public static BlockType<BlockLimeCandleCakeBehavior> LIME_CANDLE_CAKE;

    public static BlockType<BlockLimeCarpetBehavior> LIME_CARPET;

    public static BlockType<BlockLimeConcreteBehavior> LIME_CONCRETE;

    public static BlockType<BlockLimeConcretePowderBehavior> LIME_CONCRETE_POWDER;

    public static BlockType<BlockLimeGlazedTerracottaBehavior> LIME_GLAZED_TERRACOTTA;

    public static BlockType<BlockLimeShulkerBoxBehavior> LIME_SHULKER_BOX;

    public static BlockType<BlockLimeStainedGlassBehavior> LIME_STAINED_GLASS;

    public static BlockType<BlockLimeStainedGlassPaneBehavior> LIME_STAINED_GLASS_PANE;

    public static BlockType<BlockLimeTerracottaBehavior> LIME_TERRACOTTA;

    public static BlockType<BlockLimeWoolBehavior> LIME_WOOL;

    public static BlockType<BlockLitBlastFurnaceBehavior> LIT_BLAST_FURNACE;

    public static BlockType<BlockLitDeepslateRedstoneOreBehavior> LIT_DEEPSLATE_REDSTONE_ORE;

    public static BlockType<BlockLitFurnaceBehavior> LIT_FURNACE;

    public static BlockType<BlockLitPumpkinBehavior> LIT_PUMPKIN;

    public static BlockType<BlockLitRedstoneLampBehavior> LIT_REDSTONE_LAMP;

    public static BlockType<BlockLitRedstoneOreBehavior> LIT_REDSTONE_ORE;

    public static BlockType<BlockLitSmokerBehavior> LIT_SMOKER;

    public static BlockType<BlockLodestoneBehavior> LODESTONE;

    public static BlockType<BlockLoomBehavior> LOOM;

    public static BlockType<BlockMagentaCandleBehavior> MAGENTA_CANDLE;

    public static BlockType<BlockMagentaCandleCakeBehavior> MAGENTA_CANDLE_CAKE;

    public static BlockType<BlockMagentaCarpetBehavior> MAGENTA_CARPET;

    public static BlockType<BlockMagentaConcreteBehavior> MAGENTA_CONCRETE;

    public static BlockType<BlockMagentaConcretePowderBehavior> MAGENTA_CONCRETE_POWDER;

    public static BlockType<BlockMagentaGlazedTerracottaBehavior> MAGENTA_GLAZED_TERRACOTTA;

    public static BlockType<BlockMagentaShulkerBoxBehavior> MAGENTA_SHULKER_BOX;

    public static BlockType<BlockMagentaStainedGlassBehavior> MAGENTA_STAINED_GLASS;

    public static BlockType<BlockMagentaStainedGlassPaneBehavior> MAGENTA_STAINED_GLASS_PANE;

    public static BlockType<BlockMagentaTerracottaBehavior> MAGENTA_TERRACOTTA;

    public static BlockType<BlockMagentaWoolBehavior> MAGENTA_WOOL;

    public static BlockType<BlockMagmaBehavior> MAGMA;

    public static BlockType<BlockMangroveButtonBehavior> MANGROVE_BUTTON;

    public static BlockType<BlockMangroveDoorBehavior> MANGROVE_DOOR;

    public static BlockType<BlockMangroveDoubleSlabBehavior> MANGROVE_DOUBLE_SLAB;

    public static BlockType<BlockMangroveFenceBehavior> MANGROVE_FENCE;

    public static BlockType<BlockMangroveFenceGateBehavior> MANGROVE_FENCE_GATE;

    public static BlockType<BlockMangroveHangingSignBehavior> MANGROVE_HANGING_SIGN;

    public static BlockType<BlockMangroveLeavesBehavior> MANGROVE_LEAVES;

    public static BlockType<BlockMangroveLogBehavior> MANGROVE_LOG;

    public static BlockType<BlockMangrovePlanksBehavior> MANGROVE_PLANKS;

    public static BlockType<BlockMangrovePressurePlateBehavior> MANGROVE_PRESSURE_PLATE;

    public static BlockType<BlockMangrovePropaguleBehavior> MANGROVE_PROPAGULE;

    public static BlockType<BlockMangroveRootsBehavior> MANGROVE_ROOTS;

    public static BlockType<BlockMangroveSlabBehavior> MANGROVE_SLAB;

    public static BlockType<BlockMangroveStairsBehavior> MANGROVE_STAIRS;

    public static BlockType<BlockMangroveStandingSignBehavior> MANGROVE_STANDING_SIGN;

    public static BlockType<BlockMangroveTrapdoorBehavior> MANGROVE_TRAPDOOR;

    public static BlockType<BlockMangroveWallSignBehavior> MANGROVE_WALL_SIGN;

    public static BlockType<BlockMangroveWoodBehavior> MANGROVE_WOOD;

    public static BlockType<BlockMediumAmethystBudBehavior> MEDIUM_AMETHYST_BUD;

    public static BlockType<BlockMelonBlockBehavior> MELON_BLOCK;

    public static BlockType<BlockMelonStemBehavior> MELON_STEM;

    public static BlockType<BlockMobSpawnerBehavior> MOB_SPAWNER;

    public static BlockType<BlockMonsterEggBehavior> MONSTER_EGG;

    public static BlockType<BlockMossBlockBehavior> MOSS_BLOCK;

    public static BlockType<BlockMossCarpetBehavior> MOSS_CARPET;

    public static BlockType<BlockMossyCobblestoneBehavior> MOSSY_COBBLESTONE;

    public static BlockType<BlockMossyCobblestoneStairsBehavior> MOSSY_COBBLESTONE_STAIRS;

    public static BlockType<BlockMossyStoneBrickStairsBehavior> MOSSY_STONE_BRICK_STAIRS;

    public static BlockType<BlockMovingBlockBehavior> MOVING_BLOCK;

    public static BlockType<BlockMudBehavior> MUD;

    public static BlockType<BlockMudBrickDoubleSlabBehavior> MUD_BRICK_DOUBLE_SLAB;

    public static BlockType<BlockMudBrickSlabBehavior> MUD_BRICK_SLAB;

    public static BlockType<BlockMudBrickStairsBehavior> MUD_BRICK_STAIRS;

    public static BlockType<BlockMudBrickWallBehavior> MUD_BRICK_WALL;

    public static BlockType<BlockMudBricksBehavior> MUD_BRICKS;

    public static BlockType<BlockMuddyMangroveRootsBehavior> MUDDY_MANGROVE_ROOTS;

    public static BlockType<BlockMyceliumBehavior> MYCELIUM;

    public static BlockType<BlockNetherBrickBehavior> NETHER_BRICK;

    public static BlockType<BlockNetherBrickFenceBehavior> NETHER_BRICK_FENCE;

    public static BlockType<BlockNetherBrickSlabBehavior> NETHER_BRICK_SLAB;

    public static BlockType<BlockNetherBrickStairsBehavior> NETHER_BRICK_STAIRS;

    public static BlockType<BlockNetherGoldOreBehavior> NETHER_GOLD_ORE;

    public static BlockType<BlockNetherSproutsBehavior> NETHER_SPROUTS;

    public static BlockType<BlockNetherWartBehavior> NETHER_WART;

    public static BlockType<BlockNetherWartBlockBehavior> NETHER_WART_BLOCK;

    public static BlockType<BlockNetheriteBlockBehavior> NETHERITE_BLOCK;

    public static BlockType<BlockNetherrackBehavior> NETHERRACK;

    public static BlockType<BlockNetherreactorBehavior> NETHERREACTOR;

    public static BlockType<BlockNormalStoneStairsBehavior> NORMAL_STONE_STAIRS;

    public static BlockType<BlockNoteblockBehavior> NOTEBLOCK;

    public static BlockType<BlockOakDoubleSlabBehavior> OAK_DOUBLE_SLAB;

    public static BlockType<BlockOakFenceBehavior> OAK_FENCE;

    public static BlockType<BlockOakHangingSignBehavior> OAK_HANGING_SIGN;

    public static BlockType<BlockOakLeavesBehavior> OAK_LEAVES;

    public static BlockType<BlockOakLogBehavior> OAK_LOG;

    public static BlockType<BlockOakPlanksBehavior> OAK_PLANKS;

    public static BlockType<BlockOakSaplingBehavior> OAK_SAPLING;

    public static BlockType<BlockOakSlabBehavior> OAK_SLAB;

    public static BlockType<BlockOakStairsBehavior> OAK_STAIRS;

    public static BlockType<BlockOakWoodBehavior> OAK_WOOD;

    public static BlockType<BlockObserverBehavior> OBSERVER;

    public static BlockType<BlockObsidianBehavior> OBSIDIAN;

    public static BlockType<BlockOchreFroglightBehavior> OCHRE_FROGLIGHT;

    public static BlockType<BlockOrangeCandleBehavior> ORANGE_CANDLE;

    public static BlockType<BlockOrangeCandleCakeBehavior> ORANGE_CANDLE_CAKE;

    public static BlockType<BlockOrangeCarpetBehavior> ORANGE_CARPET;

    public static BlockType<BlockOrangeConcreteBehavior> ORANGE_CONCRETE;

    public static BlockType<BlockOrangeConcretePowderBehavior> ORANGE_CONCRETE_POWDER;

    public static BlockType<BlockOrangeGlazedTerracottaBehavior> ORANGE_GLAZED_TERRACOTTA;

    public static BlockType<BlockOrangeShulkerBoxBehavior> ORANGE_SHULKER_BOX;

    public static BlockType<BlockOrangeStainedGlassBehavior> ORANGE_STAINED_GLASS;

    public static BlockType<BlockOrangeStainedGlassPaneBehavior> ORANGE_STAINED_GLASS_PANE;

    public static BlockType<BlockOrangeTerracottaBehavior> ORANGE_TERRACOTTA;

    public static BlockType<BlockOrangeTulipBehavior> ORANGE_TULIP;

    public static BlockType<BlockOrangeWoolBehavior> ORANGE_WOOL;

    public static BlockType<BlockOxeyeDaisyBehavior> OXEYE_DAISY;

    public static BlockType<BlockOxidizedChiseledCopperBehavior> OXIDIZED_CHISELED_COPPER;

    public static BlockType<BlockOxidizedCopperBehavior> OXIDIZED_COPPER;

    public static BlockType<BlockOxidizedCopperBulbBehavior> OXIDIZED_COPPER_BULB;

    public static BlockType<BlockOxidizedCopperDoorBehavior> OXIDIZED_COPPER_DOOR;

    public static BlockType<BlockOxidizedCopperGrateBehavior> OXIDIZED_COPPER_GRATE;

    public static BlockType<BlockOxidizedCopperTrapdoorBehavior> OXIDIZED_COPPER_TRAPDOOR;

    public static BlockType<BlockOxidizedCutCopperBehavior> OXIDIZED_CUT_COPPER;

    public static BlockType<BlockOxidizedCutCopperSlabBehavior> OXIDIZED_CUT_COPPER_SLAB;

    public static BlockType<BlockOxidizedCutCopperStairsBehavior> OXIDIZED_CUT_COPPER_STAIRS;

    public static BlockType<BlockOxidizedDoubleCutCopperSlabBehavior> OXIDIZED_DOUBLE_CUT_COPPER_SLAB;

    public static BlockType<BlockPackedIceBehavior> PACKED_ICE;

    public static BlockType<BlockPackedMudBehavior> PACKED_MUD;

    public static BlockType<BlockPearlescentFroglightBehavior> PEARLESCENT_FROGLIGHT;

    public static BlockType<BlockPeonyBehavior> PEONY;

    public static BlockType<BlockPetrifiedOakSlabBehavior> PETRIFIED_OAK_SLAB;

    public static BlockType<BlockPinkCandleBehavior> PINK_CANDLE;

    public static BlockType<BlockPinkCandleCakeBehavior> PINK_CANDLE_CAKE;

    public static BlockType<BlockPinkCarpetBehavior> PINK_CARPET;

    public static BlockType<BlockPinkConcreteBehavior> PINK_CONCRETE;

    public static BlockType<BlockPinkConcretePowderBehavior> PINK_CONCRETE_POWDER;

    public static BlockType<BlockPinkGlazedTerracottaBehavior> PINK_GLAZED_TERRACOTTA;

    public static BlockType<BlockPinkPetalsBehavior> PINK_PETALS;

    public static BlockType<BlockPinkShulkerBoxBehavior> PINK_SHULKER_BOX;

    public static BlockType<BlockPinkStainedGlassBehavior> PINK_STAINED_GLASS;

    public static BlockType<BlockPinkStainedGlassPaneBehavior> PINK_STAINED_GLASS_PANE;

    public static BlockType<BlockPinkTerracottaBehavior> PINK_TERRACOTTA;

    public static BlockType<BlockPinkTulipBehavior> PINK_TULIP;

    public static BlockType<BlockPinkWoolBehavior> PINK_WOOL;

    public static BlockType<BlockPistonBehavior> PISTON;

    public static BlockType<BlockPistonArmCollisionBehavior> PISTON_ARM_COLLISION;

    public static BlockType<BlockPitcherCropBehavior> PITCHER_CROP;

    public static BlockType<BlockPitcherPlantBehavior> PITCHER_PLANT;

    public static BlockType<BlockPodzolBehavior> PODZOL;

    public static BlockType<BlockPointedDripstoneBehavior> POINTED_DRIPSTONE;

    public static BlockType<BlockPolishedAndesiteBehavior> POLISHED_ANDESITE;

    public static BlockType<BlockPolishedAndesiteStairsBehavior> POLISHED_ANDESITE_STAIRS;

    public static BlockType<BlockPolishedBasaltBehavior> POLISHED_BASALT;

    public static BlockType<BlockPolishedBlackstoneBehavior> POLISHED_BLACKSTONE;

    public static BlockType<BlockPolishedBlackstoneBrickDoubleSlabBehavior> POLISHED_BLACKSTONE_BRICK_DOUBLE_SLAB;

    public static BlockType<BlockPolishedBlackstoneBrickSlabBehavior> POLISHED_BLACKSTONE_BRICK_SLAB;

    public static BlockType<BlockPolishedBlackstoneBrickStairsBehavior> POLISHED_BLACKSTONE_BRICK_STAIRS;

    public static BlockType<BlockPolishedBlackstoneBrickWallBehavior> POLISHED_BLACKSTONE_BRICK_WALL;

    public static BlockType<BlockPolishedBlackstoneBricksBehavior> POLISHED_BLACKSTONE_BRICKS;

    public static BlockType<BlockPolishedBlackstoneButtonBehavior> POLISHED_BLACKSTONE_BUTTON;

    public static BlockType<BlockPolishedBlackstoneDoubleSlabBehavior> POLISHED_BLACKSTONE_DOUBLE_SLAB;

    public static BlockType<BlockPolishedBlackstonePressurePlateBehavior> POLISHED_BLACKSTONE_PRESSURE_PLATE;

    public static BlockType<BlockPolishedBlackstoneSlabBehavior> POLISHED_BLACKSTONE_SLAB;

    public static BlockType<BlockPolishedBlackstoneStairsBehavior> POLISHED_BLACKSTONE_STAIRS;

    public static BlockType<BlockPolishedBlackstoneWallBehavior> POLISHED_BLACKSTONE_WALL;

    public static BlockType<BlockPolishedDeepslateBehavior> POLISHED_DEEPSLATE;

    public static BlockType<BlockPolishedDeepslateDoubleSlabBehavior> POLISHED_DEEPSLATE_DOUBLE_SLAB;

    public static BlockType<BlockPolishedDeepslateSlabBehavior> POLISHED_DEEPSLATE_SLAB;

    public static BlockType<BlockPolishedDeepslateStairsBehavior> POLISHED_DEEPSLATE_STAIRS;

    public static BlockType<BlockPolishedDeepslateWallBehavior> POLISHED_DEEPSLATE_WALL;

    public static BlockType<BlockPolishedDioriteBehavior> POLISHED_DIORITE;

    public static BlockType<BlockPolishedDioriteStairsBehavior> POLISHED_DIORITE_STAIRS;

    public static BlockType<BlockPolishedGraniteBehavior> POLISHED_GRANITE;

    public static BlockType<BlockPolishedGraniteStairsBehavior> POLISHED_GRANITE_STAIRS;

    public static BlockType<BlockPolishedTuffBehavior> POLISHED_TUFF;

    public static BlockType<BlockPolishedTuffDoubleSlabBehavior> POLISHED_TUFF_DOUBLE_SLAB;

    public static BlockType<BlockPolishedTuffSlabBehavior> POLISHED_TUFF_SLAB;

    public static BlockType<BlockPolishedTuffStairsBehavior> POLISHED_TUFF_STAIRS;

    public static BlockType<BlockPolishedTuffWallBehavior> POLISHED_TUFF_WALL;

    public static BlockType<BlockPoppyBehavior> POPPY;

    public static BlockType<BlockPortalBehavior> PORTAL;

    public static BlockType<BlockPotatoesBehavior> POTATOES;

    public static BlockType<BlockPowderSnowBehavior> POWDER_SNOW;

    public static BlockType<BlockPoweredComparatorBehavior> POWERED_COMPARATOR;

    public static BlockType<BlockPoweredRepeaterBehavior> POWERED_REPEATER;

    public static BlockType<BlockPrismarineBehavior> PRISMARINE;

    public static BlockType<BlockPrismarineBricksStairsBehavior> PRISMARINE_BRICKS_STAIRS;

    public static BlockType<BlockPrismarineStairsBehavior> PRISMARINE_STAIRS;

    public static BlockType<BlockPumpkinBehavior> PUMPKIN;

    public static BlockType<BlockPumpkinStemBehavior> PUMPKIN_STEM;

    public static BlockType<BlockPurpleCandleBehavior> PURPLE_CANDLE;

    public static BlockType<BlockPurpleCandleCakeBehavior> PURPLE_CANDLE_CAKE;

    public static BlockType<BlockPurpleCarpetBehavior> PURPLE_CARPET;

    public static BlockType<BlockPurpleConcreteBehavior> PURPLE_CONCRETE;

    public static BlockType<BlockPurpleConcretePowderBehavior> PURPLE_CONCRETE_POWDER;

    public static BlockType<BlockPurpleGlazedTerracottaBehavior> PURPLE_GLAZED_TERRACOTTA;

    public static BlockType<BlockPurpleShulkerBoxBehavior> PURPLE_SHULKER_BOX;

    public static BlockType<BlockPurpleStainedGlassBehavior> PURPLE_STAINED_GLASS;

    public static BlockType<BlockPurpleStainedGlassPaneBehavior> PURPLE_STAINED_GLASS_PANE;

    public static BlockType<BlockPurpleTerracottaBehavior> PURPLE_TERRACOTTA;

    public static BlockType<BlockPurpleWoolBehavior> PURPLE_WOOL;

    public static BlockType<BlockPurpurBlockBehavior> PURPUR_BLOCK;

    public static BlockType<BlockPurpurStairsBehavior> PURPUR_STAIRS;

    public static BlockType<BlockQuartzBlockBehavior> QUARTZ_BLOCK;

    public static BlockType<BlockQuartzBricksBehavior> QUARTZ_BRICKS;

    public static BlockType<BlockQuartzOreBehavior> QUARTZ_ORE;

    public static BlockType<BlockQuartzSlabBehavior> QUARTZ_SLAB;

    public static BlockType<BlockQuartzStairsBehavior> QUARTZ_STAIRS;

    public static BlockType<BlockRailBehavior> RAIL;

    public static BlockType<BlockRawCopperBlockBehavior> RAW_COPPER_BLOCK;

    public static BlockType<BlockRawGoldBlockBehavior> RAW_GOLD_BLOCK;

    public static BlockType<BlockRawIronBlockBehavior> RAW_IRON_BLOCK;

    public static BlockType<BlockRedCandleBehavior> RED_CANDLE;

    public static BlockType<BlockRedCandleCakeBehavior> RED_CANDLE_CAKE;

    public static BlockType<BlockRedCarpetBehavior> RED_CARPET;

    public static BlockType<BlockRedConcreteBehavior> RED_CONCRETE;

    public static BlockType<BlockRedConcretePowderBehavior> RED_CONCRETE_POWDER;

    public static BlockType<BlockRedGlazedTerracottaBehavior> RED_GLAZED_TERRACOTTA;

    public static BlockType<BlockRedMushroomBehavior> RED_MUSHROOM;

    public static BlockType<BlockRedMushroomBlockBehavior> RED_MUSHROOM_BLOCK;

    public static BlockType<BlockRedNetherBrickBehavior> RED_NETHER_BRICK;

    public static BlockType<BlockRedNetherBrickStairsBehavior> RED_NETHER_BRICK_STAIRS;

    public static BlockType<BlockRedSandstoneBehavior> RED_SANDSTONE;

    public static BlockType<BlockRedSandstoneStairsBehavior> RED_SANDSTONE_STAIRS;

    public static BlockType<BlockRedShulkerBoxBehavior> RED_SHULKER_BOX;

    public static BlockType<BlockRedStainedGlassBehavior> RED_STAINED_GLASS;

    public static BlockType<BlockRedStainedGlassPaneBehavior> RED_STAINED_GLASS_PANE;

    public static BlockType<BlockRedTerracottaBehavior> RED_TERRACOTTA;

    public static BlockType<BlockRedTulipBehavior> RED_TULIP;

    public static BlockType<BlockRedWoolBehavior> RED_WOOL;

    public static BlockType<BlockRedstoneBlockBehavior> REDSTONE_BLOCK;

    public static BlockType<BlockRedstoneLampBehavior> REDSTONE_LAMP;

    public static BlockType<BlockRedstoneOreBehavior> REDSTONE_ORE;

    public static BlockType<BlockRedstoneTorchBehavior> REDSTONE_TORCH;

    public static BlockType<BlockRedstoneWireBehavior> REDSTONE_WIRE;

    public static BlockType<BlockReedsBehavior> REEDS;

    public static BlockType<BlockReinforcedDeepslateBehavior> REINFORCED_DEEPSLATE;

    public static BlockType<BlockRepeatingCommandBlockBehavior> REPEATING_COMMAND_BLOCK;

    public static BlockType<BlockReserved6Behavior> RESERVED6;

    public static BlockType<BlockRespawnAnchorBehavior> RESPAWN_ANCHOR;

    public static BlockType<BlockRoseBushBehavior> ROSE_BUSH;

    public static BlockType<BlockSandBehavior> SAND;

    public static BlockType<BlockSandstoneBehavior> SANDSTONE;

    public static BlockType<BlockSandstoneSlabBehavior> SANDSTONE_SLAB;

    public static BlockType<BlockSandstoneStairsBehavior> SANDSTONE_STAIRS;

    public static BlockType<BlockScaffoldingBehavior> SCAFFOLDING;

    public static BlockType<BlockSculkBehavior> SCULK;

    public static BlockType<BlockSculkCatalystBehavior> SCULK_CATALYST;

    public static BlockType<BlockSculkSensorBehavior> SCULK_SENSOR;

    public static BlockType<BlockSculkShriekerBehavior> SCULK_SHRIEKER;

    public static BlockType<BlockSculkVeinBehavior> SCULK_VEIN;

    public static BlockType<BlockSeaLanternBehavior> SEA_LANTERN;

    public static BlockType<BlockSeaPickleBehavior> SEA_PICKLE;

    public static BlockType<BlockSeagrassBehavior> SEAGRASS;

    public static BlockType<BlockShortGrassBehavior> SHORT_GRASS;

    public static BlockType<BlockShroomlightBehavior> SHROOMLIGHT;

    public static BlockType<BlockSilverGlazedTerracottaBehavior> SILVER_GLAZED_TERRACOTTA;

    public static BlockType<BlockSkullBehavior> SKULL;

    public static BlockType<BlockSlimeBehavior> SLIME;

    public static BlockType<BlockSmallAmethystBudBehavior> SMALL_AMETHYST_BUD;

    public static BlockType<BlockSmallDripleafBlockBehavior> SMALL_DRIPLEAF_BLOCK;

    public static BlockType<BlockSmithingTableBehavior> SMITHING_TABLE;

    public static BlockType<BlockSmokerBehavior> SMOKER;

    public static BlockType<BlockSmoothBasaltBehavior> SMOOTH_BASALT;

    public static BlockType<BlockSmoothQuartzStairsBehavior> SMOOTH_QUARTZ_STAIRS;

    public static BlockType<BlockSmoothRedSandstoneStairsBehavior> SMOOTH_RED_SANDSTONE_STAIRS;

    public static BlockType<BlockSmoothSandstoneStairsBehavior> SMOOTH_SANDSTONE_STAIRS;

    public static BlockType<BlockSmoothStoneBehavior> SMOOTH_STONE;

    public static BlockType<BlockSmoothStoneSlabBehavior> SMOOTH_STONE_SLAB;

    public static BlockType<BlockSnifferEggBehavior> SNIFFER_EGG;

    public static BlockType<BlockSnowBehavior> SNOW;

    public static BlockType<BlockSnowLayerBehavior> SNOW_LAYER;

    public static BlockType<BlockSoulCampfireBehavior> SOUL_CAMPFIRE;

    public static BlockType<BlockSoulFireBehavior> SOUL_FIRE;

    public static BlockType<BlockSoulLanternBehavior> SOUL_LANTERN;

    public static BlockType<BlockSoulSandBehavior> SOUL_SAND;

    public static BlockType<BlockSoulSoilBehavior> SOUL_SOIL;

    public static BlockType<BlockSoulTorchBehavior> SOUL_TORCH;

    public static BlockType<BlockSpongeBehavior> SPONGE;

    public static BlockType<BlockSporeBlossomBehavior> SPORE_BLOSSOM;

    public static BlockType<BlockSpruceButtonBehavior> SPRUCE_BUTTON;

    public static BlockType<BlockSpruceDoorBehavior> SPRUCE_DOOR;

    public static BlockType<BlockSpruceDoubleSlabBehavior> SPRUCE_DOUBLE_SLAB;

    public static BlockType<BlockSpruceFenceBehavior> SPRUCE_FENCE;

    public static BlockType<BlockSpruceFenceGateBehavior> SPRUCE_FENCE_GATE;

    public static BlockType<BlockSpruceHangingSignBehavior> SPRUCE_HANGING_SIGN;

    public static BlockType<BlockSpruceLeavesBehavior> SPRUCE_LEAVES;

    public static BlockType<BlockSpruceLogBehavior> SPRUCE_LOG;

    public static BlockType<BlockSprucePlanksBehavior> SPRUCE_PLANKS;

    public static BlockType<BlockSprucePressurePlateBehavior> SPRUCE_PRESSURE_PLATE;

    public static BlockType<BlockSpruceSaplingBehavior> SPRUCE_SAPLING;

    public static BlockType<BlockSpruceSlabBehavior> SPRUCE_SLAB;

    public static BlockType<BlockSpruceStairsBehavior> SPRUCE_STAIRS;

    public static BlockType<BlockSpruceStandingSignBehavior> SPRUCE_STANDING_SIGN;

    public static BlockType<BlockSpruceTrapdoorBehavior> SPRUCE_TRAPDOOR;

    public static BlockType<BlockSpruceWallSignBehavior> SPRUCE_WALL_SIGN;

    public static BlockType<BlockSpruceWoodBehavior> SPRUCE_WOOD;

    public static BlockType<BlockStandingBannerBehavior> STANDING_BANNER;

    public static BlockType<BlockStandingSignBehavior> STANDING_SIGN;

    public static BlockType<BlockStickyPistonBehavior> STICKY_PISTON;

    public static BlockType<BlockStickyPistonArmCollisionBehavior> STICKY_PISTON_ARM_COLLISION;

    public static BlockType<BlockStoneBehavior> STONE;

    public static BlockType<BlockStoneBlockSlab2Behavior> STONE_BLOCK_SLAB2;

    public static BlockType<BlockStoneBlockSlab3Behavior> STONE_BLOCK_SLAB3;

    public static BlockType<BlockStoneBlockSlab4Behavior> STONE_BLOCK_SLAB4;

    public static BlockType<BlockStoneBrickSlabBehavior> STONE_BRICK_SLAB;

    public static BlockType<BlockStoneBrickStairsBehavior> STONE_BRICK_STAIRS;

    public static BlockType<BlockStoneButtonBehavior> STONE_BUTTON;

    public static BlockType<BlockStonePressurePlateBehavior> STONE_PRESSURE_PLATE;

    public static BlockType<BlockStoneStairsBehavior> STONE_STAIRS;

    public static BlockType<BlockStonebrickBehavior> STONEBRICK;

    public static BlockType<BlockStonecutterBehavior> STONECUTTER;

    public static BlockType<BlockStonecutterBlockBehavior> STONECUTTER_BLOCK;

    public static BlockType<BlockStrippedAcaciaLogBehavior> STRIPPED_ACACIA_LOG;

    public static BlockType<BlockStrippedAcaciaWoodBehavior> STRIPPED_ACACIA_WOOD;

    public static BlockType<BlockStrippedBambooBlockBehavior> STRIPPED_BAMBOO_BLOCK;

    public static BlockType<BlockStrippedBirchLogBehavior> STRIPPED_BIRCH_LOG;

    public static BlockType<BlockStrippedBirchWoodBehavior> STRIPPED_BIRCH_WOOD;

    public static BlockType<BlockStrippedCherryLogBehavior> STRIPPED_CHERRY_LOG;

    public static BlockType<BlockStrippedCherryWoodBehavior> STRIPPED_CHERRY_WOOD;

    public static BlockType<BlockStrippedCrimsonHyphaeBehavior> STRIPPED_CRIMSON_HYPHAE;

    public static BlockType<BlockStrippedCrimsonStemBehavior> STRIPPED_CRIMSON_STEM;

    public static BlockType<BlockStrippedDarkOakLogBehavior> STRIPPED_DARK_OAK_LOG;

    public static BlockType<BlockStrippedDarkOakWoodBehavior> STRIPPED_DARK_OAK_WOOD;

    public static BlockType<BlockStrippedJungleLogBehavior> STRIPPED_JUNGLE_LOG;

    public static BlockType<BlockStrippedJungleWoodBehavior> STRIPPED_JUNGLE_WOOD;

    public static BlockType<BlockStrippedMangroveLogBehavior> STRIPPED_MANGROVE_LOG;

    public static BlockType<BlockStrippedMangroveWoodBehavior> STRIPPED_MANGROVE_WOOD;

    public static BlockType<BlockStrippedOakLogBehavior> STRIPPED_OAK_LOG;

    public static BlockType<BlockStrippedOakWoodBehavior> STRIPPED_OAK_WOOD;

    public static BlockType<BlockStrippedSpruceLogBehavior> STRIPPED_SPRUCE_LOG;

    public static BlockType<BlockStrippedSpruceWoodBehavior> STRIPPED_SPRUCE_WOOD;

    public static BlockType<BlockStrippedWarpedHyphaeBehavior> STRIPPED_WARPED_HYPHAE;

    public static BlockType<BlockStrippedWarpedStemBehavior> STRIPPED_WARPED_STEM;

    public static BlockType<BlockStructureBlockBehavior> STRUCTURE_BLOCK;

    public static BlockType<BlockStructureVoidBehavior> STRUCTURE_VOID;

    public static BlockType<BlockSunflowerBehavior> SUNFLOWER;

    public static BlockType<BlockSuspiciousGravelBehavior> SUSPICIOUS_GRAVEL;

    public static BlockType<BlockSuspiciousSandBehavior> SUSPICIOUS_SAND;

    public static BlockType<BlockSweetBerryBushBehavior> SWEET_BERRY_BUSH;

    public static BlockType<BlockTallGrassBehavior> TALL_GRASS;

    public static BlockType<BlockTargetBehavior> TARGET;

    public static BlockType<BlockTintedGlassBehavior> TINTED_GLASS;

    public static BlockType<BlockTntBehavior> TNT;

    public static BlockType<BlockTorchBehavior> TORCH;

    public static BlockType<BlockTorchflowerBehavior> TORCHFLOWER;

    public static BlockType<BlockTorchflowerCropBehavior> TORCHFLOWER_CROP;

    public static BlockType<BlockTrapdoorBehavior> TRAPDOOR;

    public static BlockType<BlockTrappedChestBehavior> TRAPPED_CHEST;

    public static BlockType<BlockTrialSpawnerBehavior> TRIAL_SPAWNER;

    public static BlockType<BlockTripWireBehavior> TRIP_WIRE;

    public static BlockType<BlockTripwireHookBehavior> TRIPWIRE_HOOK;

    public static BlockType<BlockTubeCoralBehavior> TUBE_CORAL;

    public static BlockType<BlockTubeCoralBlockBehavior> TUBE_CORAL_BLOCK;

    public static BlockType<BlockTubeCoralFanBehavior> TUBE_CORAL_FAN;

    public static BlockType<BlockTuffBehavior> TUFF;

    public static BlockType<BlockTuffBrickDoubleSlabBehavior> TUFF_BRICK_DOUBLE_SLAB;

    public static BlockType<BlockTuffBrickSlabBehavior> TUFF_BRICK_SLAB;

    public static BlockType<BlockTuffBrickStairsBehavior> TUFF_BRICK_STAIRS;

    public static BlockType<BlockTuffBrickWallBehavior> TUFF_BRICK_WALL;

    public static BlockType<BlockTuffBricksBehavior> TUFF_BRICKS;

    public static BlockType<BlockTuffDoubleSlabBehavior> TUFF_DOUBLE_SLAB;

    public static BlockType<BlockTuffSlabBehavior> TUFF_SLAB;

    public static BlockType<BlockTuffStairsBehavior> TUFF_STAIRS;

    public static BlockType<BlockTuffWallBehavior> TUFF_WALL;

    public static BlockType<BlockTurtleEggBehavior> TURTLE_EGG;

    public static BlockType<BlockTwistingVinesBehavior> TWISTING_VINES;

    public static BlockType<BlockUnderwaterTorchBehavior> UNDERWATER_TORCH;

    public static BlockType<BlockUndyedShulkerBoxBehavior> UNDYED_SHULKER_BOX;

    public static BlockType<BlockUnknownBehavior> UNKNOWN;

    public static BlockType<BlockUnlitRedstoneTorchBehavior> UNLIT_REDSTONE_TORCH;

    public static BlockType<BlockUnpoweredComparatorBehavior> UNPOWERED_COMPARATOR;

    public static BlockType<BlockUnpoweredRepeaterBehavior> UNPOWERED_REPEATER;

    public static BlockType<BlockVaultBehavior> VAULT;

    public static BlockType<BlockVerdantFroglightBehavior> VERDANT_FROGLIGHT;

    public static BlockType<BlockVineBehavior> VINE;

    public static BlockType<BlockWallBannerBehavior> WALL_BANNER;

    public static BlockType<BlockWallSignBehavior> WALL_SIGN;

    public static BlockType<BlockWarpedButtonBehavior> WARPED_BUTTON;

    public static BlockType<BlockWarpedDoorBehavior> WARPED_DOOR;

    public static BlockType<BlockWarpedDoubleSlabBehavior> WARPED_DOUBLE_SLAB;

    public static BlockType<BlockWarpedFenceBehavior> WARPED_FENCE;

    public static BlockType<BlockWarpedFenceGateBehavior> WARPED_FENCE_GATE;

    public static BlockType<BlockWarpedFungusBehavior> WARPED_FUNGUS;

    public static BlockType<BlockWarpedHangingSignBehavior> WARPED_HANGING_SIGN;

    public static BlockType<BlockWarpedHyphaeBehavior> WARPED_HYPHAE;

    public static BlockType<BlockWarpedNyliumBehavior> WARPED_NYLIUM;

    public static BlockType<BlockWarpedPlanksBehavior> WARPED_PLANKS;

    public static BlockType<BlockWarpedPressurePlateBehavior> WARPED_PRESSURE_PLATE;

    public static BlockType<BlockWarpedRootsBehavior> WARPED_ROOTS;

    public static BlockType<BlockWarpedSlabBehavior> WARPED_SLAB;

    public static BlockType<BlockWarpedStairsBehavior> WARPED_STAIRS;

    public static BlockType<BlockWarpedStandingSignBehavior> WARPED_STANDING_SIGN;

    public static BlockType<BlockWarpedStemBehavior> WARPED_STEM;

    public static BlockType<BlockWarpedTrapdoorBehavior> WARPED_TRAPDOOR;

    public static BlockType<BlockWarpedWallSignBehavior> WARPED_WALL_SIGN;

    public static BlockType<BlockWarpedWartBlockBehavior> WARPED_WART_BLOCK;

    public static BlockType<BlockWaterBehavior> WATER;

    public static BlockType<BlockWaterlilyBehavior> WATERLILY;

    public static BlockType<BlockWaxedChiseledCopperBehavior> WAXED_CHISELED_COPPER;

    public static BlockType<BlockWaxedCopperBehavior> WAXED_COPPER;

    public static BlockType<BlockWaxedCopperBulbBehavior> WAXED_COPPER_BULB;

    public static BlockType<BlockWaxedCopperDoorBehavior> WAXED_COPPER_DOOR;

    public static BlockType<BlockWaxedCopperGrateBehavior> WAXED_COPPER_GRATE;

    public static BlockType<BlockWaxedCopperTrapdoorBehavior> WAXED_COPPER_TRAPDOOR;

    public static BlockType<BlockWaxedCutCopperBehavior> WAXED_CUT_COPPER;

    public static BlockType<BlockWaxedCutCopperSlabBehavior> WAXED_CUT_COPPER_SLAB;

    public static BlockType<BlockWaxedCutCopperStairsBehavior> WAXED_CUT_COPPER_STAIRS;

    public static BlockType<BlockWaxedDoubleCutCopperSlabBehavior> WAXED_DOUBLE_CUT_COPPER_SLAB;

    public static BlockType<BlockWaxedExposedChiseledCopperBehavior> WAXED_EXPOSED_CHISELED_COPPER;

    public static BlockType<BlockWaxedExposedCopperBehavior> WAXED_EXPOSED_COPPER;

    public static BlockType<BlockWaxedExposedCopperBulbBehavior> WAXED_EXPOSED_COPPER_BULB;

    public static BlockType<BlockWaxedExposedCopperDoorBehavior> WAXED_EXPOSED_COPPER_DOOR;

    public static BlockType<BlockWaxedExposedCopperGrateBehavior> WAXED_EXPOSED_COPPER_GRATE;

    public static BlockType<BlockWaxedExposedCopperTrapdoorBehavior> WAXED_EXPOSED_COPPER_TRAPDOOR;

    public static BlockType<BlockWaxedExposedCutCopperBehavior> WAXED_EXPOSED_CUT_COPPER;

    public static BlockType<BlockWaxedExposedCutCopperSlabBehavior> WAXED_EXPOSED_CUT_COPPER_SLAB;

    public static BlockType<BlockWaxedExposedCutCopperStairsBehavior> WAXED_EXPOSED_CUT_COPPER_STAIRS;

    public static BlockType<BlockWaxedExposedDoubleCutCopperSlabBehavior> WAXED_EXPOSED_DOUBLE_CUT_COPPER_SLAB;

    public static BlockType<BlockWaxedOxidizedChiseledCopperBehavior> WAXED_OXIDIZED_CHISELED_COPPER;

    public static BlockType<BlockWaxedOxidizedCopperBehavior> WAXED_OXIDIZED_COPPER;

    public static BlockType<BlockWaxedOxidizedCopperBulbBehavior> WAXED_OXIDIZED_COPPER_BULB;

    public static BlockType<BlockWaxedOxidizedCopperDoorBehavior> WAXED_OXIDIZED_COPPER_DOOR;

    public static BlockType<BlockWaxedOxidizedCopperGrateBehavior> WAXED_OXIDIZED_COPPER_GRATE;

    public static BlockType<BlockWaxedOxidizedCopperTrapdoorBehavior> WAXED_OXIDIZED_COPPER_TRAPDOOR;

    public static BlockType<BlockWaxedOxidizedCutCopperBehavior> WAXED_OXIDIZED_CUT_COPPER;

    public static BlockType<BlockWaxedOxidizedCutCopperSlabBehavior> WAXED_OXIDIZED_CUT_COPPER_SLAB;

    public static BlockType<BlockWaxedOxidizedCutCopperStairsBehavior> WAXED_OXIDIZED_CUT_COPPER_STAIRS;

    public static BlockType<BlockWaxedOxidizedDoubleCutCopperSlabBehavior> WAXED_OXIDIZED_DOUBLE_CUT_COPPER_SLAB;

    public static BlockType<BlockWaxedWeatheredChiseledCopperBehavior> WAXED_WEATHERED_CHISELED_COPPER;

    public static BlockType<BlockWaxedWeatheredCopperBehavior> WAXED_WEATHERED_COPPER;

    public static BlockType<BlockWaxedWeatheredCopperBulbBehavior> WAXED_WEATHERED_COPPER_BULB;

    public static BlockType<BlockWaxedWeatheredCopperDoorBehavior> WAXED_WEATHERED_COPPER_DOOR;

    public static BlockType<BlockWaxedWeatheredCopperGrateBehavior> WAXED_WEATHERED_COPPER_GRATE;

    public static BlockType<BlockWaxedWeatheredCopperTrapdoorBehavior> WAXED_WEATHERED_COPPER_TRAPDOOR;

    public static BlockType<BlockWaxedWeatheredCutCopperBehavior> WAXED_WEATHERED_CUT_COPPER;

    public static BlockType<BlockWaxedWeatheredCutCopperSlabBehavior> WAXED_WEATHERED_CUT_COPPER_SLAB;

    public static BlockType<BlockWaxedWeatheredCutCopperStairsBehavior> WAXED_WEATHERED_CUT_COPPER_STAIRS;

    public static BlockType<BlockWaxedWeatheredDoubleCutCopperSlabBehavior> WAXED_WEATHERED_DOUBLE_CUT_COPPER_SLAB;

    public static BlockType<BlockWeatheredChiseledCopperBehavior> WEATHERED_CHISELED_COPPER;

    public static BlockType<BlockWeatheredCopperBehavior> WEATHERED_COPPER;

    public static BlockType<BlockWeatheredCopperBulbBehavior> WEATHERED_COPPER_BULB;

    public static BlockType<BlockWeatheredCopperDoorBehavior> WEATHERED_COPPER_DOOR;

    public static BlockType<BlockWeatheredCopperGrateBehavior> WEATHERED_COPPER_GRATE;

    public static BlockType<BlockWeatheredCopperTrapdoorBehavior> WEATHERED_COPPER_TRAPDOOR;

    public static BlockType<BlockWeatheredCutCopperBehavior> WEATHERED_CUT_COPPER;

    public static BlockType<BlockWeatheredCutCopperSlabBehavior> WEATHERED_CUT_COPPER_SLAB;

    public static BlockType<BlockWeatheredCutCopperStairsBehavior> WEATHERED_CUT_COPPER_STAIRS;

    public static BlockType<BlockWeatheredDoubleCutCopperSlabBehavior> WEATHERED_DOUBLE_CUT_COPPER_SLAB;

    public static BlockType<BlockWebBehavior> WEB;

    public static BlockType<BlockWeepingVinesBehavior> WEEPING_VINES;

    public static BlockType<BlockWheatBehavior> WHEAT;

    public static BlockType<BlockWhiteCandleBehavior> WHITE_CANDLE;

    public static BlockType<BlockWhiteCandleCakeBehavior> WHITE_CANDLE_CAKE;

    public static BlockType<BlockWhiteCarpetBehavior> WHITE_CARPET;

    public static BlockType<BlockWhiteConcreteBehavior> WHITE_CONCRETE;

    public static BlockType<BlockWhiteConcretePowderBehavior> WHITE_CONCRETE_POWDER;

    public static BlockType<BlockWhiteGlazedTerracottaBehavior> WHITE_GLAZED_TERRACOTTA;

    public static BlockType<BlockWhiteShulkerBoxBehavior> WHITE_SHULKER_BOX;

    public static BlockType<BlockWhiteStainedGlassBehavior> WHITE_STAINED_GLASS;

    public static BlockType<BlockWhiteStainedGlassPaneBehavior> WHITE_STAINED_GLASS_PANE;

    public static BlockType<BlockWhiteTerracottaBehavior> WHITE_TERRACOTTA;

    public static BlockType<BlockWhiteTulipBehavior> WHITE_TULIP;

    public static BlockType<BlockWhiteWoolBehavior> WHITE_WOOL;

    public static BlockType<BlockWitherRoseBehavior> WITHER_ROSE;

    public static BlockType<BlockWoodenButtonBehavior> WOODEN_BUTTON;

    public static BlockType<BlockWoodenDoorBehavior> WOODEN_DOOR;

    public static BlockType<BlockWoodenPressurePlateBehavior> WOODEN_PRESSURE_PLATE;

    public static BlockType<BlockYellowCandleBehavior> YELLOW_CANDLE;

    public static BlockType<BlockYellowCandleCakeBehavior> YELLOW_CANDLE_CAKE;

    public static BlockType<BlockYellowCarpetBehavior> YELLOW_CARPET;

    public static BlockType<BlockYellowConcreteBehavior> YELLOW_CONCRETE;

    public static BlockType<BlockYellowConcretePowderBehavior> YELLOW_CONCRETE_POWDER;

    public static BlockType<BlockYellowFlowerBehavior> YELLOW_FLOWER;

    public static BlockType<BlockYellowGlazedTerracottaBehavior> YELLOW_GLAZED_TERRACOTTA;

    public static BlockType<BlockYellowShulkerBoxBehavior> YELLOW_SHULKER_BOX;

    public static BlockType<BlockYellowStainedGlassBehavior> YELLOW_STAINED_GLASS;

    public static BlockType<BlockYellowStainedGlassPaneBehavior> YELLOW_STAINED_GLASS_PANE;

    public static BlockType<BlockYellowTerracottaBehavior> YELLOW_TERRACOTTA;

    public static BlockType<BlockYellowWoolBehavior> YELLOW_WOOL;
}
