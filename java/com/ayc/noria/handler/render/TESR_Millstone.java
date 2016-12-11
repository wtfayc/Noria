package com.ayc.noria.handler.render;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.model.IModel;
import net.minecraftforge.client.model.ModelLoaderRegistry;
import net.minecraftforge.common.model.TRSRTransformation;

import org.lwjgl.opengl.GL11;

import com.ayc.noria.tileentity.rotary.TE_Millstone;
import com.ayc.noria.tileentity.water.TE_Noria;
import com.ayc.noria.utility.Reference_Static;

public class TESR_Millstone extends TileEntitySpecialRenderer<TE_Millstone>{
	
    private IModel model;
    private IBakedModel bakedModel;

    private IBakedModel getBakedModel() 
    {
        if (bakedModel == null) {
            try {
                model = ModelLoaderRegistry.getModel(new ResourceLocation(Reference_Static.MOD_ID, "block/millstone"));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            bakedModel = model.bake(TRSRTransformation.identity(), DefaultVertexFormats.ITEM,
            		location -> Minecraft.getMinecraft().getTextureMapBlocks().getAtlasSprite(location.toString()));
        }
        return bakedModel;
    }

    @Override
    public void renderTileEntityAt(TE_Millstone te, double x, double y, double z, float partialTicks, int destroyStage) {
        GlStateManager.pushAttrib();
        GlStateManager.pushMatrix();
        GlStateManager.translate(x, y, z);
        GlStateManager.disableRescaleNormal();

        
        GlStateManager.pushMatrix();

        GlStateManager.translate(0.5, 0, 0.5);
        //float angle = (float) te.getTick();
        long angle = (System.currentTimeMillis() / 50) % 360;
        GlStateManager.rotate(angle, 0, 1, 0);
        GlStateManager.translate(-0.5, 0, -0.5);

        RenderHelper.disableStandardItemLighting();
        this.bindTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);
        if (Minecraft.isAmbientOcclusionEnabled()) {
            GlStateManager.shadeModel(GL11.GL_SMOOTH);
        } else {
            GlStateManager.shadeModel(GL11.GL_FLAT);
        }

        World world = te.getWorld();
        GlStateManager.translate(-te.getPos().getX(), -te.getPos().getY(), -te.getPos().getZ());

        Tessellator tessellator = Tessellator.getInstance();
        tessellator.getBuffer().begin(GL11.GL_QUADS, DefaultVertexFormats.BLOCK);
        Minecraft.getMinecraft().getBlockRendererDispatcher().getBlockModelRenderer().renderModel(
                world,
                getBakedModel(),
                world.getBlockState(te.getPos()),
                te.getPos(),
                Tessellator.getInstance().getBuffer(),
                true);
        tessellator.draw();

        RenderHelper.enableStandardItemLighting();
        GlStateManager.popMatrix();
   
        
        GlStateManager.popMatrix();
        GlStateManager.popAttrib();
    }
}