package com.ayc.noria.tileentity.rotary;

import com.ayc.noria.API.IRotationHandler;
import com.ayc.noria.tileentity.Noria_TileEntity;

public class TE_RotaryShaft extends Noria_TileEntity implements IRotationHandler{

	int facing;
	
	@Override
	public void setWorldFacing(int worldFacing) 
	{
		this.facing = worldFacing;
		markDirty();
	}

	@Override
	public void rotateModel() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getFacing() 
	{
		return facing;
	}

	
	
}