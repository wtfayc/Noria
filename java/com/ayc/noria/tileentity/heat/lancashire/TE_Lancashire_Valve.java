package com.ayc.noria.tileentity.heat.lancashire;

import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.fluids.capability.IFluidHandler;

public class TE_Lancashire_Valve extends TE_Lancashire {


	@Override
	public void setPart (int part) //TODO this is a temp fix
	{
		TileEntity tileEntity = worldObj.getTileEntity(pos.up());
		if (tileEntity != null) if (tileEntity instanceof IFluidHandler) part = 0;
		this.part = part;
	}
	
}