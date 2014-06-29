package com.rj.ReedToolPack.Other;

import com.rj.ReedToolPack.RegistryFiles.RegisterHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * Created by Ralph on 6/26/2014.
 */
public class ReedToolsCreativeTab extends CreativeTabs {

    public ReedToolsCreativeTab(String tabName)
    {
        super(tabName);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem()
    {
        return Items.reeds;
    }
}
