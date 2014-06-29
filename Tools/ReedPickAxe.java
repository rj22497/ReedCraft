package com.rj.ReedToolPack.Tools;

import com.rj.ReedToolPack.RegistryFiles.RegisterHelper;
import com.rj.ReedToolPack.RegistryFiles.ReedToolPackMain;
import net.minecraft.item.ItemPickaxe;

/**
 * Created by Ralph on 6/26/2014.
 */
public class ReedPickAxe extends ItemPickaxe
{

    public ReedPickAxe(ToolMaterial mat) {
        super(mat);
        setCreativeTab(RegisterHelper.reedTab);
        setUnlocalizedName("reed_pickaxe");
        setTextureName(ReedToolPackMain.MODID + ":" + getUnlocalizedName().substring(5));
    }
}
