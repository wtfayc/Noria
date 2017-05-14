package com.ayc.noria.utility.list;

import com.ayc.noria.handler.Noria_CreativeTabs;
import com.ayc.noria.utility.Reference_Static;

import net.minecraft.creativetab.CreativeTabs;

public enum Noria_Items {

	PART		("part", "part", Noria_CreativeTabs.NORIA_BASE_TAB, true, 64),
	TOOL		("tool", "tool", Noria_CreativeTabs.NORIA_BASE_TAB, true, 1),
	
	;
	public String name;
	public String nameUnlocalized;
	public String nameRegistry;
	public CreativeTabs creativeTabs;
	public boolean hasSubtypes;
	public int maxStackSize;
	
	private Noria_Items (String name, String nameUnlocalized, CreativeTabs creativeTabs, boolean hasSubtypes, int maxStackSize)
	{
		this.name = name;
		this.nameUnlocalized = nameUnlocalized;
		this.nameRegistry = Reference_Static.MOD_ID + ":" + name;
		this.creativeTabs = creativeTabs;
		this.hasSubtypes = hasSubtypes;
		this.maxStackSize = maxStackSize;
	}
	
	
}