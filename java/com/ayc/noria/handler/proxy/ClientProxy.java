package com.ayc.noria.handler.proxy;

import com.ayc.noria.handler.registry.RegBlocks;
import com.ayc.noria.handler.render.TESR_Millstone;
import com.ayc.noria.handler.render.TESR_MillstoneRed;
import com.ayc.noria.handler.render.TESR_Noria;
import com.ayc.noria.handler.render.TESR_Undershot;
import com.ayc.noria.tileentity.rotary.TE_Millstone;
import com.ayc.noria.tileentity.rotary.TE_MillstoneRed;
import com.ayc.noria.tileentity.water.TE_Noria;
import com.ayc.noria.tileentity.water.TE_Undershot;
import com.ayc.noria.utility.list.Noria_Blocks;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.ModelLoaderRegistry;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy{

	@Override
	public void preInitRender()
	{
		OBJLoader.INSTANCE.addDomain("noria");
	}
	

	@Override
	public void initRender()
	{
		initRenderBlocks();
		initRenderTileEntities();
	}
	
	private void initRenderBlocks()
	{
		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		
		ModelLoader.setCustomModelResourceLocation((Item)RegBlocks.iblock_noria, 0, new ModelResourceLocation(Noria_Blocks.NORIA.nameRegistry, "inventorya"));
		renderItem.getItemModelMesher().register((Item)RegBlocks.iblock_noria, 0, new ModelResourceLocation(Noria_Blocks.NORIA.nameRegistry, "inventorya"));
		ModelLoader.setCustomModelResourceLocation((Item)RegBlocks.iblock_noria, 1, new ModelResourceLocation(Noria_Blocks.NORIA.nameRegistry, "inventoryb"));
		renderItem.getItemModelMesher().register((Item)RegBlocks.iblock_noria, 1, new ModelResourceLocation(Noria_Blocks.NORIA.nameRegistry, "inventoryb"));
		
		ModelLoader.setCustomModelResourceLocation((Item)RegBlocks.iblock_canal, 0, new ModelResourceLocation(Noria_Blocks.CANAL.nameRegistry, "inventorya"));
		renderItem.getItemModelMesher().register((Item)RegBlocks.iblock_canal, 0, new ModelResourceLocation(Noria_Blocks.CANAL.nameRegistry, "inventorya"));
		ModelLoader.setCustomModelResourceLocation((Item)RegBlocks.iblock_canal, 1, new ModelResourceLocation(Noria_Blocks.CANAL.nameRegistry, "inventoryb"));
		renderItem.getItemModelMesher().register((Item)RegBlocks.iblock_canal, 1, new ModelResourceLocation(Noria_Blocks.CANAL.nameRegistry, "inventoryb"));
		ModelLoader.setCustomModelResourceLocation((Item)RegBlocks.iblock_canal, 2, new ModelResourceLocation(Noria_Blocks.CANAL.nameRegistry, "inventoryc"));
		renderItem.getItemModelMesher().register((Item)RegBlocks.iblock_canal, 2, new ModelResourceLocation(Noria_Blocks.CANAL.nameRegistry, "inventoryc")); 
		ModelLoader.setCustomModelResourceLocation((Item)RegBlocks.iblock_canal, 3, new ModelResourceLocation(Noria_Blocks.CANAL.nameRegistry, "inventoryd"));
		renderItem.getItemModelMesher().register((Item)RegBlocks.iblock_canal, 3, new ModelResourceLocation(Noria_Blocks.CANAL.nameRegistry, "inventoryd")); 
		ModelLoader.setCustomModelResourceLocation((Item)RegBlocks.iblock_canal, 4, new ModelResourceLocation(Noria_Blocks.CANAL.nameRegistry, "inventorye"));
		renderItem.getItemModelMesher().register((Item)RegBlocks.iblock_canal, 4, new ModelResourceLocation(Noria_Blocks.CANAL.nameRegistry, "inventorye")); 
		ModelLoader.setCustomModelResourceLocation((Item)RegBlocks.iblock_canal, 5, new ModelResourceLocation(Noria_Blocks.CANAL.nameRegistry, "inventoryf"));
		renderItem.getItemModelMesher().register((Item)RegBlocks.iblock_canal, 5, new ModelResourceLocation(Noria_Blocks.CANAL.nameRegistry, "inventoryf")); 
		ModelLoader.setCustomModelResourceLocation((Item)RegBlocks.iblock_canal, 6, new ModelResourceLocation(Noria_Blocks.CANAL.nameRegistry, "inventoryg"));
		renderItem.getItemModelMesher().register((Item)RegBlocks.iblock_canal, 6, new ModelResourceLocation(Noria_Blocks.CANAL.nameRegistry, "inventoryg")); 
		ModelLoader.setCustomModelResourceLocation((Item)RegBlocks.iblock_canal, 7, new ModelResourceLocation(Noria_Blocks.CANAL.nameRegistry, "inventoryh"));
		renderItem.getItemModelMesher().register((Item)RegBlocks.iblock_canal, 7, new ModelResourceLocation(Noria_Blocks.CANAL.nameRegistry, "inventoryh")); 

		ModelLoader.setCustomModelResourceLocation((Item)RegBlocks.iblock_rotarymachine, 0, new ModelResourceLocation(Noria_Blocks.ROTARYMACHINE.nameRegistry, "inventorya"));
		renderItem.getItemModelMesher().register((Item)RegBlocks.iblock_rotarymachine, 0, new ModelResourceLocation(Noria_Blocks.ROTARYMACHINE.nameRegistry, "inventorya"));
		ModelLoader.setCustomModelResourceLocation((Item)RegBlocks.iblock_rotarymachine, 1, new ModelResourceLocation(Noria_Blocks.ROTARYMACHINE.nameRegistry, "inventoryb"));
		renderItem.getItemModelMesher().register((Item)RegBlocks.iblock_rotarymachine, 1, new ModelResourceLocation(Noria_Blocks.ROTARYMACHINE.nameRegistry, "inventoryb"));
		
		ModelLoader.setCustomModelResourceLocation((Item)RegBlocks.iblock_staticmachine, 0, new ModelResourceLocation(Noria_Blocks.STATICMACHINE.nameRegistry, "inventorya"));
		renderItem.getItemModelMesher().register((Item)RegBlocks.iblock_staticmachine, 0, new ModelResourceLocation(Noria_Blocks.STATICMACHINE.nameRegistry, "inventorya"));
		ModelLoader.setCustomModelResourceLocation((Item)RegBlocks.iblock_staticmachine, 1, new ModelResourceLocation(Noria_Blocks.STATICMACHINE.nameRegistry, "inventoryb"));
		renderItem.getItemModelMesher().register((Item)RegBlocks.iblock_staticmachine, 1, new ModelResourceLocation(Noria_Blocks.STATICMACHINE.nameRegistry, "inventoryb"));
		
		ModelLoader.setCustomModelResourceLocation((Item)RegBlocks.iblock_woodpart, 0, new ModelResourceLocation(Noria_Blocks.WOODPART.nameRegistry, "inventorya"));
		renderItem.getItemModelMesher().register((Item)RegBlocks.iblock_woodpart, 0, new ModelResourceLocation(Noria_Blocks.WOODPART.nameRegistry, "inventorya"));
		ModelLoader.setCustomModelResourceLocation((Item)RegBlocks.iblock_woodpart, 1, new ModelResourceLocation(Noria_Blocks.WOODPART.nameRegistry, "inventoryb"));
		renderItem.getItemModelMesher().register((Item)RegBlocks.iblock_woodpart, 1, new ModelResourceLocation(Noria_Blocks.WOODPART.nameRegistry, "inventoryb"));
		ModelLoader.setCustomModelResourceLocation((Item)RegBlocks.iblock_woodpart, 2, new ModelResourceLocation(Noria_Blocks.WOODPART.nameRegistry, "inventoryc"));
		renderItem.getItemModelMesher().register((Item)RegBlocks.iblock_woodpart, 2, new ModelResourceLocation(Noria_Blocks.WOODPART.nameRegistry, "inventoryc"));
		ModelLoader.setCustomModelResourceLocation((Item)RegBlocks.iblock_woodpart, 3, new ModelResourceLocation(Noria_Blocks.WOODPART.nameRegistry, "inventoryd"));
		renderItem.getItemModelMesher().register((Item)RegBlocks.iblock_woodpart, 3, new ModelResourceLocation(Noria_Blocks.WOODPART.nameRegistry, "inventoryd"));
		ModelLoader.setCustomModelResourceLocation((Item)RegBlocks.iblock_woodpart, 4, new ModelResourceLocation(Noria_Blocks.WOODPART.nameRegistry, "inventorye"));
		renderItem.getItemModelMesher().register((Item)RegBlocks.iblock_woodpart, 4, new ModelResourceLocation(Noria_Blocks.WOODPART.nameRegistry, "inventorye"));
		ModelLoader.setCustomModelResourceLocation((Item)RegBlocks.iblock_woodpart, 5, new ModelResourceLocation(Noria_Blocks.WOODPART.nameRegistry, "inventoryf"));
		renderItem.getItemModelMesher().register((Item)RegBlocks.iblock_woodpart, 5, new ModelResourceLocation(Noria_Blocks.WOODPART.nameRegistry, "inventoryf"));
		ModelLoader.setCustomModelResourceLocation((Item)RegBlocks.iblock_woodpart, 6, new ModelResourceLocation(Noria_Blocks.WOODPART.nameRegistry, "inventoryg"));
		renderItem.getItemModelMesher().register((Item)RegBlocks.iblock_woodpart, 6, new ModelResourceLocation(Noria_Blocks.WOODPART.nameRegistry, "inventoryg"));
		
		ModelLoader.setCustomModelResourceLocation((Item)RegBlocks.iblock_ceramicjar, 0, new ModelResourceLocation(Noria_Blocks.CERAMICJAR.nameRegistry, "inventory"));
		renderItem.getItemModelMesher().register((Item)RegBlocks.iblock_ceramicjar, 0, new ModelResourceLocation(Noria_Blocks.CERAMICJAR.nameRegistry, "inventory"));
		
		ModelLoader.setCustomModelResourceLocation((Item)RegBlocks.iblock_debarkedwood, 0, new ModelResourceLocation(Noria_Blocks.DEBARKEDWOOD.nameRegistry, "inventorya"));
		renderItem.getItemModelMesher().register((Item)RegBlocks.iblock_debarkedwood, 0, new ModelResourceLocation(Noria_Blocks.DEBARKEDWOOD.nameRegistry, "inventorya"));
		ModelLoader.setCustomModelResourceLocation((Item)RegBlocks.iblock_debarkedwood, 1, new ModelResourceLocation(Noria_Blocks.DEBARKEDWOOD.nameRegistry, "inventoryb"));
		renderItem.getItemModelMesher().register((Item)RegBlocks.iblock_debarkedwood, 1, new ModelResourceLocation(Noria_Blocks.DEBARKEDWOOD.nameRegistry, "inventoryb"));
		ModelLoader.setCustomModelResourceLocation((Item)RegBlocks.iblock_debarkedwood, 2, new ModelResourceLocation(Noria_Blocks.DEBARKEDWOOD.nameRegistry, "inventoryc"));
		renderItem.getItemModelMesher().register((Item)RegBlocks.iblock_debarkedwood, 2, new ModelResourceLocation(Noria_Blocks.DEBARKEDWOOD.nameRegistry, "inventoryc"));
		ModelLoader.setCustomModelResourceLocation((Item)RegBlocks.iblock_debarkedwood, 3, new ModelResourceLocation(Noria_Blocks.DEBARKEDWOOD.nameRegistry, "inventoryd"));
		renderItem.getItemModelMesher().register((Item)RegBlocks.iblock_debarkedwood, 3, new ModelResourceLocation(Noria_Blocks.DEBARKEDWOOD.nameRegistry, "inventoryd"));
		ModelLoader.setCustomModelResourceLocation((Item)RegBlocks.iblock_debarkedwood, 4, new ModelResourceLocation(Noria_Blocks.DEBARKEDWOOD.nameRegistry, "inventorye"));
		renderItem.getItemModelMesher().register((Item)RegBlocks.iblock_debarkedwood, 4, new ModelResourceLocation(Noria_Blocks.DEBARKEDWOOD.nameRegistry, "inventorye"));
		ModelLoader.setCustomModelResourceLocation((Item)RegBlocks.iblock_debarkedwood, 5, new ModelResourceLocation(Noria_Blocks.DEBARKEDWOOD.nameRegistry, "inventoryf"));
		renderItem.getItemModelMesher().register((Item)RegBlocks.iblock_debarkedwood, 5, new ModelResourceLocation(Noria_Blocks.DEBARKEDWOOD.nameRegistry, "inventoryf"));
		ModelLoader.setCustomModelResourceLocation((Item)RegBlocks.iblock_debarkedwood, 6, new ModelResourceLocation(Noria_Blocks.DEBARKEDWOOD.nameRegistry, "inventoryg"));
		renderItem.getItemModelMesher().register((Item)RegBlocks.iblock_debarkedwood, 6, new ModelResourceLocation(Noria_Blocks.DEBARKEDWOOD.nameRegistry, "inventoryg"));
		ModelLoader.setCustomModelResourceLocation((Item)RegBlocks.iblock_debarkedwood, 7, new ModelResourceLocation(Noria_Blocks.DEBARKEDWOOD.nameRegistry, "inventoryh"));
		renderItem.getItemModelMesher().register((Item)RegBlocks.iblock_debarkedwood, 7, new ModelResourceLocation(Noria_Blocks.DEBARKEDWOOD.nameRegistry, "inventoryh"));
		ModelLoader.setCustomModelResourceLocation((Item)RegBlocks.iblock_debarkedwood, 8, new ModelResourceLocation(Noria_Blocks.DEBARKEDWOOD.nameRegistry, "inventoryi"));
		renderItem.getItemModelMesher().register((Item)RegBlocks.iblock_debarkedwood, 8, new ModelResourceLocation(Noria_Blocks.DEBARKEDWOOD.nameRegistry, "inventoryi"));
		ModelLoader.setCustomModelResourceLocation((Item)RegBlocks.iblock_debarkedwood, 9, new ModelResourceLocation(Noria_Blocks.DEBARKEDWOOD.nameRegistry, "inventoryj"));
		renderItem.getItemModelMesher().register((Item)RegBlocks.iblock_debarkedwood, 9, new ModelResourceLocation(Noria_Blocks.DEBARKEDWOOD.nameRegistry, "inventoryj"));
		ModelLoader.setCustomModelResourceLocation((Item)RegBlocks.iblock_debarkedwood, 10, new ModelResourceLocation(Noria_Blocks.DEBARKEDWOOD.nameRegistry, "inventoryk"));
		renderItem.getItemModelMesher().register((Item)RegBlocks.iblock_debarkedwood, 10, new ModelResourceLocation(Noria_Blocks.DEBARKEDWOOD.nameRegistry, "inventoryk"));
		ModelLoader.setCustomModelResourceLocation((Item)RegBlocks.iblock_debarkedwood, 11, new ModelResourceLocation(Noria_Blocks.DEBARKEDWOOD.nameRegistry, "inventoryl"));
		renderItem.getItemModelMesher().register((Item)RegBlocks.iblock_debarkedwood, 11, new ModelResourceLocation(Noria_Blocks.DEBARKEDWOOD.nameRegistry, "inventoryl"));
		
		ModelLoader.setCustomModelResourceLocation((Item)RegBlocks.iblock_treetap, 0, new ModelResourceLocation(Noria_Blocks.TREETAP.nameRegistry, "inventory"));
		renderItem.getItemModelMesher().register((Item)RegBlocks.iblock_treetap, 0, new ModelResourceLocation(Noria_Blocks.TREETAP.nameRegistry, "inventory"));
	}
	
	private void initRenderTileEntities()
	{
		ClientRegistry.bindTileEntitySpecialRenderer(TE_Noria.class, new TESR_Noria());
		ClientRegistry.bindTileEntitySpecialRenderer(TE_Undershot.class, new TESR_Undershot());
		ClientRegistry.bindTileEntitySpecialRenderer(TE_Millstone.class, new TESR_Millstone());
		ClientRegistry.bindTileEntitySpecialRenderer(TE_MillstoneRed.class, new TESR_MillstoneRed());
	}
	
	
	
}