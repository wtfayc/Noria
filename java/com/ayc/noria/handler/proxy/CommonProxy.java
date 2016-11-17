package com.ayc.noria.handler.proxy;

import com.ayc.noria.handler.registry.RegBlocks;
import com.ayc.noria.handler.registry.RegTileEntities;

public abstract class CommonProxy implements IProxy{

	public static void preInit()
	{
		RegBlocks.preInit();
	}
	
	public static void init()
	{
		RegTileEntities.init();
	}
	
	public static void postInit()
	{
		
	}
}