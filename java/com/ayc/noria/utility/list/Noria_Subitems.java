package com.ayc.noria.utility.list;

import com.ayc.noria.handler.registry.RegItems;
import com.ayc.noria.utility.Reference_Static;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public enum Noria_Subitems {

	PART_BOILER_WATER_LEVEL			(RegItems.item_part, 0, "boiler_water_level"),
	PART_BOILER_GAUGE				(RegItems.item_part, 1, "boiler_gauge"),
	
	TOOL_HAMMER						(RegItems.item_tool, 0, "tool_hammer"),
	
	;
	public Item item;
	public int meta;
	public String name;
	public ResourceLocation resourceLocation;
	
	private Noria_Subitems (Item item, int meta, String name)
	{
		this.item = item;
		this.meta = meta;
		this.name = name;
		this.resourceLocation = new ResourceLocation(Reference_Static.MOD_ID.toLowerCase() + ":Item_" + name);
	}
	
	
	
}