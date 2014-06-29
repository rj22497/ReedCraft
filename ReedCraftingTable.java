package com.rj.ReedToolPack;

import com.rj.ReedToolPack.RegistryFiles.ReedToolPackMain;
import com.rj.ReedToolPack.RegistryFiles.RegisterHelper;
import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

/**
 * Created by Ralph on 6/26/2014.
 */
public class ReedCraftingTable extends Block {

    @SideOnly(Side.CLIENT)
    private IIcon reedCraftingTableTop;

    public ReedCraftingTable()
    {
        super(Material.wood);
        setBlockName("reed_crafting_table");
        setHardness(2.0F);
        setHarvestLevel("axe",0);
        setResistance(1.0F);
        setStepSound(Block.soundTypeWood);
        setBlockTextureName(ReedToolPackMain.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(RegisterHelper.reedTab);
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side,int metadata)
    {
        return side == 1? this.reedCraftingTableTop : this.blockIcon;
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        this.blockIcon = iconRegister.registerIcon(ReedToolPackMain.MODID + ":" + "ReedCrafingTableSide");
        this.reedCraftingTableTop = iconRegister.registerIcon(ReedToolPackMain.MODID + ":" + "ReedCrafingTableTop");
    }

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int q, float a,float b, float c)
    {
        if(!player.isSneaking())
        {
            FMLNetworkHandler.openGui(player, ReedToolPackMain.instance, RegisterHelper.guiIDreedCraftingTable,world,x,y,z);
            return true;
        }
        else{return false;}
    }
}
