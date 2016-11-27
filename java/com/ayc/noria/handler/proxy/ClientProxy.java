package com.ayc.noria.handler.proxy;

import com.ayc.noria.handler.registry.RegBlocks;
import com.ayc.noria.handler.render.TESR_Noria;
import com.ayc.noria.tileentity.test2;
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

		ModelLoader.setCustomModelResourceLocation((Item)RegBlocks.iblock_test, 0, new ModelResourceLocation(Noria_Blocks.TEST.nameRegistry, "inventory"));
		renderItem.getItemModelMesher().register((Item)RegBlocks.iblock_test, 0, new ModelResourceLocation(Noria_Blocks.TEST.nameRegistry, "inventory"));
		
		ModelLoader.setCustomModelResourceLocation((Item)RegBlocks.iblock_test2, 0, new ModelResourceLocation(Noria_Blocks.TEST2.nameRegistry, "inventory"));
		renderItem.getItemModelMesher().register((Item)RegBlocks.iblock_test2, 0, new ModelResourceLocation(Noria_Blocks.TEST2.nameRegistry, "inventory"));
		
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

		ModelLoader.setCustomModelResourceLocation((Item)RegBlocks.iblock_ceramicjar, 0, new ModelResourceLocation(Noria_Blocks.CERAMICJAR.nameRegistry, "inventory"));
		renderItem.getItemModelMesher().register((Item)RegBlocks.iblock_ceramicjar, 0, new ModelResourceLocation(Noria_Blocks.CERAMICJAR.nameRegistry, "inventory"));
		
		ModelLoader.setCustomModelResourceLocation((Item)RegBlocks.iblock_scorchedwood, 0, new ModelResourceLocation(Noria_Blocks.SCORCHEDWOOD.nameRegistry, "inventorya"));
		renderItem.getItemModelMesher().register((Item)RegBlocks.iblock_scorchedwood, 0, new ModelResourceLocation(Noria_Blocks.SCORCHEDWOOD.nameRegistry, "inventorya"));
		ModelLoader.setCustomModelResourceLocation((Item)RegBlocks.iblock_scorchedwood, 1, new ModelResourceLocation(Noria_Blocks.SCORCHEDWOOD.nameRegistry, "inventoryb"));
		renderItem.getItemModelMesher().register((Item)RegBlocks.iblock_scorchedwood, 1, new ModelResourceLocation(Noria_Blocks.SCORCHEDWOOD.nameRegistry, "inventoryb"));
		ModelLoader.setCustomModelResourceLocation((Item)RegBlocks.iblock_scorchedwood, 2, new ModelResourceLocation(Noria_Blocks.SCORCHEDWOOD.nameRegistry, "inventoryc"));
		renderItem.getItemModelMesher().register((Item)RegBlocks.iblock_scorchedwood, 2, new ModelResourceLocation(Noria_Blocks.SCORCHEDWOOD.nameRegistry, "inventoryc"));
		ModelLoader.setCustomModelResourceLocation((Item)RegBlocks.iblock_scorchedwood, 3, new ModelResourceLocation(Noria_Blocks.SCORCHEDWOOD.nameRegistry, "inventoryd"));
		renderItem.getItemModelMesher().register((Item)RegBlocks.iblock_scorchedwood, 3, new ModelResourceLocation(Noria_Blocks.SCORCHEDWOOD.nameRegistry, "inventoryd"));
		ModelLoader.setCustomModelResourceLocation((Item)RegBlocks.iblock_scorchedwood, 4, new ModelResourceLocation(Noria_Blocks.SCORCHEDWOOD.nameRegistry, "inventorye"));
		renderItem.getItemModelMesher().register((Item)RegBlocks.iblock_scorchedwood, 4, new ModelResourceLocation(Noria_Blocks.SCORCHEDWOOD.nameRegistry, "inventorye"));
		ModelLoader.setCustomModelResourceLocation((Item)RegBlocks.iblock_scorchedwood, 5, new ModelResourceLocation(Noria_Blocks.SCORCHEDWOOD.nameRegistry, "inventoryf"));
		renderItem.getItemModelMesher().register((Item)RegBlocks.iblock_scorchedwood, 5, new ModelResourceLocation(Noria_Blocks.SCORCHEDWOOD.nameRegistry, "inventoryf"));
		ModelLoader.setCustomModelResourceLocation((Item)RegBlocks.iblock_scorchedwood, 6, new ModelResourceLocation(Noria_Blocks.SCORCHEDWOOD.nameRegistry, "inventoryg"));
		renderItem.getItemModelMesher().register((Item)RegBlocks.iblock_scorchedwood, 6, new ModelResourceLocation(Noria_Blocks.SCORCHEDWOOD.nameRegistry, "inventoryg"));
		ModelLoader.setCustomModelResourceLocation((Item)RegBlocks.iblock_scorchedwood, 7, new ModelResourceLocation(Noria_Blocks.SCORCHEDWOOD.nameRegistry, "inventoryh"));
		renderItem.getItemModelMesher().register((Item)RegBlocks.iblock_scorchedwood, 7, new ModelResourceLocation(Noria_Blocks.SCORCHEDWOOD.nameRegistry, "inventoryh"));
		ModelLoader.setCustomModelResourceLocation((Item)RegBlocks.iblock_scorchedwood, 8, new ModelResourceLocation(Noria_Blocks.SCORCHEDWOOD.nameRegistry, "inventoryi"));
		renderItem.getItemModelMesher().register((Item)RegBlocks.iblock_scorchedwood, 8, new ModelResourceLocation(Noria_Blocks.SCORCHEDWOOD.nameRegistry, "inventoryi"));
		ModelLoader.setCustomModelResourceLocation((Item)RegBlocks.iblock_scorchedwood, 9, new ModelResourceLocation(Noria_Blocks.SCORCHEDWOOD.nameRegistry, "inventoryj"));
		renderItem.getItemModelMesher().register((Item)RegBlocks.iblock_scorchedwood, 9, new ModelResourceLocation(Noria_Blocks.SCORCHEDWOOD.nameRegistry, "inventoryj"));
		ModelLoader.setCustomModelResourceLocation((Item)RegBlocks.iblock_scorchedwood, 10, new ModelResourceLocation(Noria_Blocks.SCORCHEDWOOD.nameRegistry, "inventoryk"));
		renderItem.getItemModelMesher().register((Item)RegBlocks.iblock_scorchedwood, 10, new ModelResourceLocation(Noria_Blocks.SCORCHEDWOOD.nameRegistry, "inventoryk"));
		ModelLoader.setCustomModelResourceLocation((Item)RegBlocks.iblock_scorchedwood, 11, new ModelResourceLocation(Noria_Blocks.SCORCHEDWOOD.nameRegistry, "inventoryl"));
		renderItem.getItemModelMesher().register((Item)RegBlocks.iblock_scorchedwood, 11, new ModelResourceLocation(Noria_Blocks.SCORCHEDWOOD.nameRegistry, "inventoryl"));
		
		ModelLoader.setCustomModelResourceLocation((Item)RegBlocks.iblock_treetap, 0, new ModelResourceLocation(Noria_Blocks.TREETAP.nameRegistry, "inventory"));
		renderItem.getItemModelMesher().register((Item)RegBlocks.iblock_treetap, 0, new ModelResourceLocation(Noria_Blocks.TREETAP.nameRegistry, "inventory"));
	}
	
	private void initRenderTileEntities()
	{
		ClientRegistry.bindTileEntitySpecialRenderer(test2.class, new TESR_Noria());
		
	}
	
	
	
}