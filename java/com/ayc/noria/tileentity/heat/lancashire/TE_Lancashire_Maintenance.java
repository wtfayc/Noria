package com.ayc.noria.tileentity.heat.lancashire;

import javax.annotation.Nullable;

import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;

public class TE_Lancashire_Maintenance extends TE_Lancashire {

	
	public boolean onBlockActivated (@Nullable ItemStack heldItem, EnumFacing side)
	{
		if (this.part == 3)
		{
			setPart(4);
			markDirty();
			return true;
		}
		if (this.part == 4)
		{
			setPart(3);
			markDirty();
			return true;
		}
		return false;
	}
	
	
	
}