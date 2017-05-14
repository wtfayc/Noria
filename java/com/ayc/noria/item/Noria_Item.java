package com.ayc.noria.item;

import com.ayc.noria.utility.Reference_Static;
import com.ayc.noria.utility.list.Noria_Items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Noria_Item extends Item {

	public Noria_Item(Noria_Items noriaItem)
	{
		super();
		this.setRegistryName(noriaItem.name);
		this.setUnlocalizedName(noriaItem.nameUnlocalized);
		this.setCreativeTab(noriaItem.creativeTabs);
		this.setHasSubtypes(noriaItem.hasSubtypes);
        this.maxStackSize = noriaItem.maxStackSize;
	}
	
	@Override
	public String getUnlocalizedName()
	{
		return String.format("item.%s%s", Reference_Static.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	@Override
	public String getUnlocalizedName(ItemStack itemstack)
	{
		return String.format("item.%s%s", Reference_Static.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	protected String getUnwrappedUnlocalizedName(String unlocalizedName)
	{
		return unlocalizedName.substring(unlocalizedName.indexOf(".") +1);
	}
}