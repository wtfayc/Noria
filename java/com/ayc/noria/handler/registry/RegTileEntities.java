package com.ayc.noria.handler.registry;

import com.ayc.noria.tileentity.heat.lancashire.TE_Lancashire;
import com.ayc.noria.tileentity.heat.lancashire.TE_Lancashire_Ash;
import com.ayc.noria.tileentity.heat.lancashire.TE_Lancashire_Chimney;
import com.ayc.noria.tileentity.heat.lancashire.TE_Lancashire_Ctrl;
import com.ayc.noria.tileentity.heat.lancashire.TE_Lancashire_Maintenance;
import com.ayc.noria.tileentity.heat.lancashire.TE_Lancashire_Valve;
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
		GameRegistry.registerTileEntity(TE_Lancashire_Ctrl.class, "noria_te_lacanshirectrl");
		GameRegistry.registerTileEntity(TE_Lancashire_Ash.class, "noria_te_lacanshireash");
		GameRegistry.registerTileEntity(TE_Lancashire_Valve.class, "noria_te_lacanshirevalve");
		GameRegistry.registerTileEntity(TE_Lancashire_Maintenance.class, "noria_te_lacanshiremaintenance");
		GameRegistry.registerTileEntity(TE_Lancashire_Chimney.class, "noria_te_lacanshirechimney");
	}
	
	
	
	
	
	
}