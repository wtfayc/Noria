package com.ayc.noria.handler.registry;

import com.ayc.noria.tileentity.heat.TE_Lancashire;
import com.ayc.noria.tileentity.rotary.TE_Millstone;
import com.ayc.noria.tileentity.rotary.TE_MillstoneBot;
import com.ayc.noria.tileentity.rotary.TE_MillstoneRed;
import com.ayc.noria.tileentity.water.TE_Noria;
import com.ayc.noria.tileentity.water.TE_Canal;
import com.ayc.noria.tileentity.water.TE_Undershot;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class RegTileEntities {

	public static void init()
	{
		GameRegistry.registerTileEntity(TE_Noria.class, "noria_te_noria");
		GameRegistry.registerTileEntity(TE_Undershot.class, "noria_te_undershot");
		GameRegistry.registerTileEntity(TE_Canal.class, "noria_te_canal");
		
		GameRegistry.registerTileEntity(TE_Millstone.class, "noria_te_millstone");
		GameRegistry.registerTileEntity(TE_MillstoneRed.class, "noria_te_millstonered");
		GameRegistry.registerTileEntity(TE_MillstoneBot.class, "noria_te_millstonebot");
		
		GameRegistry.registerTileEntity(TE_Lancashire.class, "noria_te_lacanshire");
	}
	
	
	
	
	
	
}