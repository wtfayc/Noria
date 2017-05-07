package com.ayc.noria.handler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Noria_CreativeTabs {

	public static CreativeTabs NORIA_BASE_TAB = new CreativeTabs(12, "NORIA BASE")
	{
		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem()
		{
			return Items.ENDER_EYE;
		}
	};
	
	public static CreativeTabs NORIA_TECH_TAB = new CreativeTabs(13, "NORIA TECH")
	{
		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem()
		{
			return Items.ENDER_EYE;
		}
	};
	
	public static CreativeTabs NORIA_TEMP_TAB = new CreativeTabs(14, "NORIA TEMP")
	{
		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem()
		{
			return Items.ENDER_EYE;
		}
	};
}