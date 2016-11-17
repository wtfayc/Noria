package com.ayc.noria;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.ayc.noria.handler.proxy.CommonProxy;
import com.ayc.noria.handler.proxy.IProxy;
import com.ayc.noria.utility.Helper_Log;
import com.ayc.noria.utility.Reference_Static;

@Mod(modid = Reference_Static.MOD_ID, name = Reference_Static.MOD_NAME, version = Reference_Static.MOD_VERSION)

public class Noria {

	@Mod.Instance(Reference_Static.MOD_ID)
	public static Noria instance;
	
	@SidedProxy(clientSide = Reference_Static.CLIENT_PROXY_CLASS, serverSide = Reference_Static.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		CommonProxy.preInit();	
		proxy.preInitRender();		
		
		//ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		//NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
		//RegFluids.init();
		//DescriptionNetworkHandler.init();
		//MinecraftForge.EVENT_BUS.register(this);
		//if (Loader.isModLoaded("GeoStrata")) GeoStrataHandler.init();
		
		Helper_Log.info("Pre Initialization Complete!");
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		CommonProxy.init();
		proxy.initRender();
		
        //FMLInterModComms.sendMessage("Waila", "register", Reference_Static.WAILA_HANDLER);
        
        Helper_Log.info("Initialization Complete!");
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		//CommonProxy.postInit();
		Helper_Log.info("Post Initialization Complete!");
	}
	/*
	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public void textureHook(TextureStitchEvent.Pre event) 
	{
		if (event.map.getTextureType() == 0)
		{
			for (RGIFluids fluids : RGIFluids.values())
			{
				IIcon fluidtexture = event.map.registerIcon(fluids.fluidTexture);				
				FluidRegistry.getFluid(fluids.fluidName).setIcons(fluidtexture);
			}
			if (ConfigurationHandler.debug == true) Helper_Log.info("Fluid Textures Loaded!");
		}
	}	
	*/
}