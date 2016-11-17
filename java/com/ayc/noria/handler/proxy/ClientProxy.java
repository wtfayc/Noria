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
		
	}
	
	private void initRenderTileEntities()
	{
		ClientRegistry.bindTileEntitySpecialRenderer(test2.class, new TESR_Noria());
		
	}
	
	
	
}