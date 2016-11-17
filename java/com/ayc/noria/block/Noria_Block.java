package com.ayc.noria.block;

import net.minecraft.block.Block;

import com.ayc.noria.utility.Reference_Static;
import com.ayc.noria.utility.list.Noria_Blocks;

public class Noria_Block extends Block
{
	public Noria_Block(Noria_Blocks noriablock)
	{
		super(noriablock.material);
		this.setRegistryName(noriablock.name);
		this.setUnlocalizedName(noriablock.nameUnlocalized);
		this.setHardness(noriablock.hardness);
		this.setResistance(noriablock.resistance);
		this.setCreativeTab(noriablock.creativeTabs);
        this.setSoundType(noriablock.soundType);
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