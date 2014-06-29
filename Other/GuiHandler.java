package com.rj.ReedToolPack.Other;

import com.rj.ReedToolPack.RegistryFiles.ReedToolPackMain;
import com.rj.ReedToolPack.RegistryFiles.RegisterHelper;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

/**
 * Created by Ralph on 6/26/2014.
 */
public class GuiHandler implements IGuiHandler {
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

        if(ID == RegisterHelper.guiIDreedCraftingTable)
        {
            return ID == RegisterHelper.guiIDreedCraftingTable && world.getBlock(x,y,z) == RegisterHelper.rCraftingTable ? new ContainerReedCraftingTable(player.inventory, world, x,y,z) : null;
        }

        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        if(ID == RegisterHelper.guiIDreedCraftingTable)
        {
            return ID == RegisterHelper.guiIDreedCraftingTable && world.getBlock(x,y,z) == RegisterHelper.rCraftingTable ? new GuiReedCraftingTable(player.inventory, world, x,y,z) : null;
        }
        return null;
    }
}
