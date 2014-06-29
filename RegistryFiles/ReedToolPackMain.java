package com.rj.ReedToolPack.RegistryFiles;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;


@Mod(modid = ReedToolPackMain.MODID, version = ReedToolPackMain.VERSION)
public class ReedToolPackMain {
    public static final String MODID = "reedtoolpack";
    public static final String VERSION = "0.1";

    @Mod.Instance(MODID)
    public static ReedToolPackMain instance;


    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        RegisterHelper.registerAll();

    }

    public void init(FMLInitializationEvent event) {


    }
}