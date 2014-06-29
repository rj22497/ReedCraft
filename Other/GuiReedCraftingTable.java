package com.rj.ReedToolPack.Other;

import com.rj.ReedToolPack.RegistryFiles.ReedToolPackMain;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

/**
 * Created by Ralph on 6/26/2014.
 */
public class GuiReedCraftingTable extends GuiContainer
{
    private ResourceLocation texture = new ResourceLocation(ReedToolPackMain.MODID + ":" + "textures/gui/reed_crafting_table.png");

    public GuiReedCraftingTable(InventoryPlayer invPlayer, World world, int x, int y, int z)
    {
        super(new ContainerReedCraftingTable(invPlayer,world ,x,y,z));

        this.xSize = 176;
        this.ySize = 166;
    }

    public void onGuiClosed()
    {
        super.onGuiClosed();
    }

    protected void drawGuiContainerForegroundLayer(int i, int j)
    {
        this.fontRendererObj.drawString(StatCollector.translateToLocal("Reed Crafting Table"), 100,5,0xFFFFFF);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3)
    {
        GL11.glColor4f(1F,1F,1F,1F);

        Minecraft.getMinecraft().getTextureManager().bindTexture(texture);

        drawTexturedModalRect(guiLeft,guiTop,0,0,xSize,ySize);
    }
}
