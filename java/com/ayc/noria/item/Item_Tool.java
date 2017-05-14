package com.ayc.noria.item;

import java.util.List;

import com.ayc.noria.utility.list.Noria_Items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Item_Tool extends Noria_Item{

	public Item_Tool()
	{
		super(Noria_Items.TOOL);
	}
	
	@Override
	public void getSubItems(Item itemIn, CreativeTabs tab, List<ItemStack> subItems) 
	{
		for (int i = 0; i < 1; i ++) 
	    {
			subItems.add(new ItemStack(itemIn, 1, i));
	    }
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) 
	{
	    return this.getUnlocalizedName() + "_" + stack.getItemDamage();
	}

}