package com.ayc.noria.handler.registry;

import com.ayc.noria.tileentity.test2;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class RegTileEntities {

	public static void init()
	{
		GameRegistry.registerTileEntity(test2.class, "TE_TEST");
	}
	
	
	
	
	
	
}