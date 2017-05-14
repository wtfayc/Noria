package com.ayc.noria.handler.registry;

import com.ayc.noria.item.Item_Part;
import com.ayc.noria.item.Item_Tool;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RegItems {

	public static final Item item_part = new Item_Part();
	public static final Item item_tool = new Item_Tool();
	
	public static void preInit()
	{
		GameRegistry.register(item_part);
		GameRegistry.register(item_tool);
	}
}