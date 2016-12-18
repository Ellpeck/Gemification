/*
 * This file ("InitBlocks.java") is part of the Actually Additions mod for Minecraft.
 * It is created and owned by Ellpeck and distributed
 * under the Actually Additions License to be found at
 * http://ellpeck.de/actaddlicense
 * View the source code at https://github.com/Ellpeck/ActuallyAdditions
 *
 * © 2015-2016 Ellpeck
 */

package de.ellpeck.actuallyadditions.mod.blocks;

import de.ellpeck.actuallyadditions.mod.blocks.BlockLaserRelay.Type;
import de.ellpeck.actuallyadditions.mod.blocks.base.BlockPlant;
import de.ellpeck.actuallyadditions.mod.blocks.base.BlockStair;
import de.ellpeck.actuallyadditions.mod.blocks.metalists.TheMiscBlocks;
import de.ellpeck.actuallyadditions.mod.util.ModUtil;
import de.ellpeck.actuallyadditions.mod.util.compat.CompatUtil;
import net.minecraft.block.Block;

public final class InitBlocks{

    public static Block blockCompost;
    public static Block blockMisc;
    public static Block blockWildPlant;
    public static Block blockFeeder;
    public static Block blockGiantChest;
    public static Block blockGiantChestMedium;
    public static Block blockGiantChestLarge;
    public static Block blockGrinder;
    public static Block blockGrinderDouble;
    public static Block blockFurnaceDouble;
    public static Block blockInputter;
    public static Block blockInputterAdvanced;
    public static Block blockFishingNet;
    public static Block blockFurnaceSolar;
    public static Block blockHeatCollector;
    public static Block blockItemRepairer;
    public static Block blockGreenhouseGlass;
    public static Block blockBreaker;
    public static Block blockPlacer;
    public static Block blockDropper;
    public static Block blockRice;
    public static Block blockCanola;
    public static Block blockFlax;
    public static Block blockCoffee;
    public static Block blockCanolaPress;
    public static Block blockFermentingBarrel;
    public static Block blockCoalGenerator;
    public static Block blockOilGenerator;
    public static Block blockPhantomface;
    public static Block blockPhantomPlacer;
    public static Block blockPhantomBreaker;
    public static Block blockPhantomLiquiface;
    public static Block blockPhantomEnergyface;
    public static Block blockPhantomRedstoneface;
    public static Block blockPlayerInterface;
    public static Block blockFluidPlacer;
    public static Block blockFluidCollector;
    public static Block blockLavaFactoryController;
    public static Block blockCoffeeMachine;
    public static Block blockPhantomBooster;
    public static Block blockEnergizer;
    public static Block blockEnervator;
    public static Block blockTestifiBucksGreenWall;
    public static Block blockTestifiBucksWhiteWall;
    public static Block blockTestifiBucksGreenStairs;
    public static Block blockTestifiBucksWhiteStairs;
    public static Block blockTestifiBucksGreenSlab;
    public static Block blockTestifiBucksWhiteSlab;
    public static Block blockTestifiBucksGreenFence;
    public static Block blockTestifiBucksWhiteFence;
    public static Block blockColoredLamp;
    public static Block blockColoredLampOn;
    public static Block blockLampPowerer;
    public static Block blockTreasureChest;
    public static Block blockXPSolidifier;
    public static Block blockSmileyCloud;
    public static Block blockLeafGenerator;
    public static Block blockDirectionalBreaker;
    public static Block blockRangedCollector;
    public static Block blockLaserRelay;
    public static Block blockLaserRelayAdvanced;
    public static Block blockLaserRelayExtreme;
    public static Block blockLaserRelayFluids;
    public static Block blockLaserRelayItem;
    public static Block blockLaserRelayItemWhitelist;
    public static Block blockItemViewer;
    public static Block blockItemViewerHopping;
    public static Block blockBlackLotus;
    public static Block blockCrystal;
    public static Block blockCrystalEmpowered;
    public static Block blockAtomicReconstructor;
    public static Block blockMiner;
    public static Block blockFireworkBox;
    public static Block blockQuartzWall;
    public static Block blockQuartzStair;
    public static Block blockQuartzSlab;
    public static Block blockChiseledQuartzWall;
    public static Block blockChiseledQuartzStair;
    public static Block blockChiseledQuartzSlab;
    public static Block blockPillarQuartzWall;
    public static Block blockPillarQuartzStair;
    public static Block blockPillarQuartzSlab;
    public static Block blockDisplayStand;
    public static Block blockShockSuppressor;
    public static Block blockEmpowerer;
    public static Block blockDistributorItem;
    public static Block blockBioReactor;
    public static Block blockTinyTorch;
    public static Block blockFarmer;
    public static Block blockBatteryBox;

    public static void init(){
        ModUtil.LOGGER.info("Initializing Blocks...");

        blockBatteryBox = new BlockBatteryBox("block_battery_box");
        blockItemViewerHopping = new BlockItemViewerHopping("block_item_viewer_hopping");
        blockFarmer = new BlockFarmer("block_farmer");
        blockBioReactor = new BlockBioReactor("block_bio_reactor");
        blockDistributorItem = new BlockDistributorItem("block_distributor_item");
        blockEmpowerer = new BlockEmpowerer("block_empowerer");
        blockTinyTorch = new BlockTinyTorch("block_tiny_torch");
        blockShockSuppressor = new BlockShockSuppressor("block_shock_suppressor");
        blockDisplayStand = new BlockDisplayStand("block_display_stand");
        blockPlayerInterface = new BlockPlayerInterface("block_player_interface");
        blockItemViewer = new BlockItemViewer("block_item_viewer");
        blockFireworkBox = new BlockFireworkBox("block_firework_box");
        blockMiner = new BlockMiner("block_miner");
        blockAtomicReconstructor = new BlockAtomicReconstructor("block_atomic_reconstructor");
        blockCrystal = new BlockCrystal("block_crystal", false);
        blockCrystalEmpowered = new BlockCrystal("block_crystal_empowered", true);
        blockBlackLotus = new BlockBlackLotus("block_black_lotus");
        blockLaserRelay = new BlockLaserRelay("block_laser_relay", Type.ENERGY_BASIC);
        blockLaserRelayAdvanced = new BlockLaserRelay("block_laser_relay_advanced", Type.ENERGY_ADVANCED);
        blockLaserRelayExtreme = new BlockLaserRelay("block_laser_relay_extreme", Type.ENERGY_EXTREME);
        blockLaserRelayFluids = new BlockLaserRelay("block_laser_relay_fluids", Type.FLUIDS);
        blockLaserRelayItem = new BlockLaserRelay("block_laser_relay_item", Type.ITEM);
        blockLaserRelayItemWhitelist = new BlockLaserRelay("block_laser_relay_item_whitelist", Type.ITEM_WHITELIST);
        blockRangedCollector = new BlockRangedCollector("block_ranged_collector");
        blockDirectionalBreaker = new BlockDirectionalBreaker("block_directional_breaker");
        blockLeafGenerator = new BlockLeafGenerator("block_leaf_generator");
        blockSmileyCloud = new BlockSmileyCloud("block_smiley_cloud");
        blockXPSolidifier = new BlockXPSolidifier("block_xp_solidifier");
        blockTestifiBucksGreenWall = new BlockGeneric("block_testifi_bucks_green_wall");
        blockTestifiBucksWhiteWall = new BlockGeneric("block_testifi_bucks_white_wall");
        blockTestifiBucksGreenStairs = new BlockStair(blockTestifiBucksGreenWall, "block_testifi_bucks_green_stairs");
        blockTestifiBucksWhiteStairs = new BlockStair(blockTestifiBucksWhiteWall, "block_testifi_bucks_white_stairs");
        blockTestifiBucksGreenSlab = new BlockSlabs("block_testifi_bucks_green_slab", blockTestifiBucksGreenWall);
        blockTestifiBucksWhiteSlab = new BlockSlabs("block_testifi_bucks_white_slab", blockTestifiBucksWhiteWall);
        blockTestifiBucksGreenFence = new BlockWallAA("block_testifi_bucks_green_fence", blockTestifiBucksGreenWall);
        blockTestifiBucksWhiteFence = new BlockWallAA("block_testifi_bucks_white_fence", blockTestifiBucksWhiteWall);
        blockColoredLamp = new BlockColoredLamp(false, "block_colored_lamp");
        blockColoredLampOn = new BlockColoredLamp(true, "block_colored_lamp_on");
        blockLampPowerer = new BlockLampPowerer("block_lamp_powerer");
        blockTreasureChest = new BlockTreasureChest("block_treasure_chest");
        blockEnergizer = new BlockEnergizer(true, "block_energizer");
        blockEnervator = new BlockEnergizer(false, "block_enervator");
        blockLavaFactoryController = new BlockLavaFactoryController("block_lava_factory_controller");
        blockCanolaPress = new BlockCanolaPress("block_canola_press");
        blockPhantomface = new BlockPhantom(BlockPhantom.Type.FACE, "block_phantomface");
        blockPhantomPlacer = new BlockPhantom(BlockPhantom.Type.PLACER, "block_phantom_placer");
        blockPhantomLiquiface = new BlockPhantom(BlockPhantom.Type.LIQUIFACE, "block_phantom_liquiface");
        blockPhantomEnergyface = new BlockPhantom(BlockPhantom.Type.ENERGYFACE, "block_phantom_energyface");
        blockPhantomRedstoneface = new BlockPhantom(BlockPhantom.Type.REDSTONEFACE, "block_phantom_redstoneface");
        blockPhantomBreaker = new BlockPhantom(BlockPhantom.Type.BREAKER, "block_phantom_breaker");
        blockCoalGenerator = new BlockCoalGenerator("block_coal_generator");
        blockOilGenerator = new BlockOilGenerator("block_oil_generator");
        blockFermentingBarrel = new BlockFermentingBarrel("block_fermenting_barrel");
        blockRice = new BlockPlant("block_rice", 1, 2);
        CompatUtil.registerMFRPlant(blockRice);
        blockCanola = new BlockPlant("block_canola", 2, 3);
        CompatUtil.registerMFRPlant(blockCanola);
        blockFlax = new BlockPlant("block_flax", 2, 4);
        CompatUtil.registerMFRPlant(blockFlax);
        blockCoffee = new BlockPlant("block_coffee", 2, 2);
        CompatUtil.registerMFRPlant(blockCoffee);
        blockCompost = new BlockCompost("block_compost");
        blockMisc = new BlockMisc("block_misc");
        blockFeeder = new BlockFeeder("block_feeder");
        blockGiantChest = new BlockGiantChest("block_giant_chest", 0);
        blockGiantChestMedium = new BlockGiantChest("block_giant_chest_medium", 1);
        blockGiantChestLarge = new BlockGiantChest("block_giant_chest_large", 2);
        blockGrinder = new BlockGrinder(false, "block_grinder");
        blockGrinderDouble = new BlockGrinder(true, "block_grinder_double");
        blockFurnaceDouble = new BlockFurnaceDouble("block_furnace_double");
        blockInputter = new BlockInputter(false, "block_inputter");
        blockInputterAdvanced = new BlockInputter(true, "block_inputter_advanced");
        blockFishingNet = new BlockFishingNet("block_fishing_net");
        blockFurnaceSolar = new BlockFurnaceSolar("block_furnace_solar");
        blockHeatCollector = new BlockHeatCollector("block_heat_collector");
        blockItemRepairer = new BlockItemRepairer("block_item_repairer");
        blockGreenhouseGlass = new BlockGreenhouseGlass("block_greenhouse_glass");
        blockBreaker = new BlockBreaker(false, "block_breaker");
        blockPlacer = new BlockBreaker(true, "block_placer");
        blockDropper = new BlockDropper("block_dropper");
        blockFluidPlacer = new BlockFluidCollector(true, "block_fluid_placer");
        blockFluidCollector = new BlockFluidCollector(false, "block_fluid_collector");
        blockCoffeeMachine = new BlockCoffeeMachine("block_coffee_machine");
        blockPhantomBooster = new BlockPhantomBooster("block_phantom_booster");
        blockWildPlant = new BlockWildPlant("block_wild");
        blockQuartzWall = new BlockWallAA("block_quartz_wall", blockMisc, TheMiscBlocks.QUARTZ.ordinal());
        blockChiseledQuartzWall = new BlockWallAA("block_chiseled_quartz_wall", blockMisc, TheMiscBlocks.QUARTZ_CHISELED.ordinal());
        blockPillarQuartzWall = new BlockWallAA("block_pillar_quartz_wall", blockMisc, TheMiscBlocks.QUARTZ_PILLAR.ordinal());
        blockQuartzStair = new BlockStair(blockMisc, "block_quartz_stair", TheMiscBlocks.QUARTZ.ordinal());
        blockChiseledQuartzStair = new BlockStair(blockMisc, "block_chiseled_quartz_stair", TheMiscBlocks.QUARTZ_CHISELED.ordinal());
        blockPillarQuartzStair = new BlockStair(blockMisc, "block_pillar_quartz_stair", TheMiscBlocks.QUARTZ_PILLAR.ordinal());
        blockQuartzSlab = new BlockSlabs("block_quartz_slab", blockMisc, TheMiscBlocks.QUARTZ.ordinal());
        blockChiseledQuartzSlab = new BlockSlabs("block_chiseled_quartz_slab", blockMisc, TheMiscBlocks.QUARTZ_CHISELED.ordinal());
        blockPillarQuartzSlab = new BlockSlabs("block_pillar_quartz_slab", blockMisc, TheMiscBlocks.QUARTZ_PILLAR.ordinal());
    }
}