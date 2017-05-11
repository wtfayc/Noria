package com.ayc.noria.tileentity.heat.lancashire;

import javax.annotation.Nullable;

import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;

public class TE_Lancashire_Ctrl extends Helper_Lancashire {

	
	
	
	
	
	
	
	public boolean onBlockActivated (@Nullable ItemStack heldItem, EnumFacing side)
	{
		if (checkStructure()) return activateStructure();		
		return false;
	}
		

	
}