/*
 * This file ("InitOreDict.java") is part of the Actually Additions Mod for Minecraft.
 * It is created and owned by Ellpeck and distributed
 * under the Actually Additions License to be found at
 * http://github.com/Ellpeck/ActuallyAdditions/blob/master/README.md
 * View the source code at https://github.com/Ellpeck/ActuallyAdditions
 *
 * © 2015 Ellpeck
 */

package ellpeck.actuallyadditions.ore;

import ellpeck.actuallyadditions.blocks.InitBlocks;
import ellpeck.actuallyadditions.blocks.metalists.TheMiscBlocks;
import ellpeck.actuallyadditions.items.InitItems;
import ellpeck.actuallyadditions.items.metalists.TheDusts;
import ellpeck.actuallyadditions.items.metalists.TheFoods;
import ellpeck.actuallyadditions.items.metalists.TheMiscItems;
import ellpeck.actuallyadditions.items.metalists.TheSpecialDrops;
import ellpeck.actuallyadditions.util.ModUtil;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class InitOreDict{

    public static void init(){
        ModUtil.LOGGER.info("Initializing OreDictionary Entries...");

        //Vanilla Ores
        addOre(Blocks.obsidian, "obsidian");
        addOre(Items.coal, "coal");
        addOre(Items.flint, "flint");
        addOre(Blocks.gravel, "gravel");
        addOre(Items.sugar, "sugar");
        addOre(Items.diamond_horse_armor, "armorHorseDiamond");
        addOre(Items.golden_horse_armor, "armorHorseGold");
        addOre(Items.iron_horse_armor, "armorHorseIron");
        addOre(Items.bone, "itemBone");
        addOre(Items.dye, 15, "boneMeal");
        addOre(Items.sugar, "sugar");
        addOre(Items.reeds, "sugarCane");

        addOre(Blocks.yellow_flower, "flowerDandelion");
        addOre(Blocks.red_flower, "flowerPoppy");
        addOre(Blocks.red_flower, 1, "flowerOrchid");
        addOre(Blocks.red_flower, 2, "flowerAllium");
        addOre(Blocks.red_flower, 3, "flowerBluet");
        addOre(Blocks.red_flower, 4, "flowerRedTulip");
        addOre(Blocks.red_flower, 5, "flowerOrangeTulip");
        addOre(Blocks.red_flower, 6, "flowerWhiteTulip");
        addOre(Blocks.red_flower, 7, "flowerPinkTulip");
        addOre(Blocks.red_flower, 8, "flowerDaisy");
        addOre(Blocks.double_plant, 0, "flowerSunflower");
        addOre(Blocks.double_plant, 1, "flowerLilac");
        addOre(Blocks.double_plant, 4, "flowerRoseBush");
        addOre(Blocks.double_plant, 5, "flowerPeony");

        //My Ores
        addOre(InitItems.itemDust, TheDusts.IRON.ordinal(), "dustIron");
        addOre(InitItems.itemDust, TheDusts.GOLD.ordinal(), "dustGold");
        addOre(InitItems.itemDust, TheDusts.DIAMOND.ordinal(), "dustDiamond");
        addOre(InitItems.itemDust, TheDusts.EMERALD.ordinal(), "dustEmerald");
        addOre(InitItems.itemDust, TheDusts.LAPIS.ordinal(), "dustLapis");
        addOre(InitItems.itemDust, TheDusts.QUARTZ.ordinal(), "dustQuartz");
        addOre(InitItems.itemDust, TheDusts.COAL.ordinal(), "dustCoal");
        addOre(InitItems.itemDust, TheDusts.QUARTZ_BLACK.ordinal(), "dustQuartzBlack");

        addOre(InitBlocks.blockMisc, TheMiscBlocks.ORE_QUARTZ.ordinal(), "oreQuartzBlack");

        addOre(InitItems.itemCanolaSeed, "seedCanola");
        addOre(InitItems.itemMisc, TheMiscItems.CANOLA.ordinal(), "cropCanola");

        addOre(InitItems.itemRiceSeed, "seedRice");
        addOre(InitItems.itemFoods, TheFoods.RICE.ordinal(), "cropRice");

        addOre(InitItems.itemFlaxSeed, "seedFlax");
        addOre(Items.string, "cropFlax");

        addOre(InitItems.itemCoffeeSeed, "seedCoffee");
        addOre(InitItems.itemCoffeeBean, "cropCoffee");

        addOre(InitItems.itemMisc, TheMiscItems.RICE_SLIME.ordinal(), "slimeball");
        addOre(InitBlocks.blockMisc, TheMiscBlocks.CHARCOAL_BLOCK.ordinal(), "blockCharcoal");

        addOre(InitItems.itemSpecialDrop, TheSpecialDrops.EMERALD_SHARD.ordinal(), "nuggetEmerald");
        addOre(InitItems.itemSpecialDrop, TheSpecialDrops.PEARL_SHARD.ordinal(), "nuggetEnderpearl");

        addOre(InitItems.itemMisc, TheMiscItems.QUARTZ.ordinal(), "gemQuartzBlack");

        addOre(InitItems.itemMisc, TheMiscItems.BLACK_DYE.ordinal(), "dyeBlack");
    }

    private static void addOre(ItemStack stack, String name){
        OreDictionary.registerOre(name, stack);
    }

    private static void addOre(Item item, int meta, String name){
        addOre(new ItemStack(item, 1, meta), name);
    }

    private static void addOre(Item item, String name){
        addOre(item, 0, name);
    }

    private static void addOre(Block block, int meta, String name){
        addOre(new ItemStack(block, 1, meta), name);
    }

    private static void addOre(Block block, String name){
        addOre(block, 0, name);
    }
}
