package com.ayc.noria.API;

import javax.annotation.Nullable;

import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;

/**Interface used to trigger right click behaviour from TE*/
public interface ICanBeRightClicked {

	public boolean onBlockActivated (@Nullable ItemStack heldItem, EnumFacing side); 
	
}