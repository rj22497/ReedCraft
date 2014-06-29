package com.rj.ReedToolPack.RegistryFiles;

import com.rj.ReedToolPack.Other.ReedToolsCreativeTab;
import com.rj.ReedToolPack.ReedCraftingTable;
import com.rj.ReedToolPack.Tools.ReedPickAxe;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Created by Ralph on 6/26/2014.
 */
public class RegisterHelper
{
    public static Item rPickAxe;

    public static Block rCraftingTable;
    public static final int guiIDreedCraftingTable = 1;

    static Item.ToolMaterial reedMaterial = EnumHelper.addToolMaterial("reedMaterial", 0, 30, 2.5F, 1.0F, 15);
    public static CreativeTabs reedTab = new ReedToolsCreativeTab("reedTab");



    public static void registerAll()
    {
        rPickAxe = new ReedPickAxe(reedMaterial);
        registerItem(rPickAxe);

        rCraftingTable = new ReedCraftingTable();
        registerBlock(rCraftingTable);

        GameRegistry.addRecipe(new ItemStack(rPickAxe), new Object[]{
                "XXX",
                " X ",
                " X ",
                'X', Items.reeds, 'Y', Items.stick
        });

        GameRegistry.addRecipe(new ItemStack(rCraftingTable), new Object[]{
                "XX ",
                "XX ",
                "  ",
                'X', Items.sugar
        });

    }
    public static void registerItem(Item item)
    {
        GameRegistry.registerItem(item, ReedToolPackMain.MODID+ "_" + item.getUnlocalizedName().substring(5));
    }
    public static void registerBlock(Block block)
    {
        GameRegistry.registerBlock(block, ReedToolPackMain.MODID + "_" + block.getUnlocalizedName().substring(5));
    }
}
