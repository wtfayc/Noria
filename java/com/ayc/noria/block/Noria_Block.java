package com.ayc.noria.block;

import net.minecraft.block.Block;

import com.ayc.noria.utility.Reference_Static;
import com.ayc.noria.utility.list.Noria_Blocks;

public class Noria_Block extends Block
{
	public Noria_Block(Noria_Blocks noriaBlock)
	{
		super(noriaBlock.material);
		this.setRegistryName(noriaBlock.name);
		this.setUnlocalizedName(noriaBlock.nameUnlocalized);
		this.setHardness(noriaBlock.hardness);
		this.setResistance(noriaBlock.resistance);
		this.setCreativeTab(noriaBlock.creativeTabs);
        this.setSoundType(noriaBlock.soundType);
	}
		
	public String getUnlocalizedName()
	{
		return String.format("tile.%s%s", Reference_Static.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName)
	{
		return unlocalizedName.substring(unlocalizedName.indexOf(".") +1);
	}
}