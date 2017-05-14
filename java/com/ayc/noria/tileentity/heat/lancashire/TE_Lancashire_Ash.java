package com.ayc.noria.tileentity.heat.lancashire;

import javax.annotation.Nullable;

import com.ayc.noria.API.ICanBeRightClicked;

import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;

public class TE_Lancashire_Ash extends TE_Lancashire implements ICanBeRightClicked {

	public boolean onBlockActivated (@Nullable ItemStack heldItem, EnumFacing side)
	{
		if (this.part == 5)
		{
			setPart(6);
			markDirty();
			return true;
		}
		if (this.part == 6)
		{
			setPart(5);
			markDirty();
			return true;
		}
		return false;
	}
	
	
	
}