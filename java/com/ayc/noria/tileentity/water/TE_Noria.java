package com.ayc.noria.tileentity.water;

import net.minecraft.init.Biomes;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;

import com.ayc.noria.API.ITransferWater;
import com.ayc.noria.tileentity.Noria_TileEntity;

public class TE_Noria extends Noria_TileEntity implements ITickable {

	private int tick = 0;
	
	@Override
	public void update() 
	{
		if (getWork())
		{
			tick++;
			if (tick > 0 && tick % 20 == 0) giveVelocity();
			if (tick >= 100) tick = 0;
		}
	}

	private boolean getWork ()
	{
		if (worldObj.getBiomeForCoordsBody(pos) != null)
			if (worldObj.getBiomeForCoordsBody(pos) == Biomes.RIVER) return true;
		return true; //TODO
	}
	
	private void giveVelocity ()
	{
		for (int z = 0; z < 6; z++)
		{
			TileEntity targetTE1 = worldObj.getTileEntity(pos.add(2, 5, z - 2));
			if (targetTE1 != null)
				if (targetTE1 instanceof ITransferWater) ((ITransferWater) targetTE1).addVelocity(200, EnumFacing.DOWN);
			TileEntity targetTE2 = worldObj.getTileEntity(pos.add(-2, 5, z - 2));
			if (targetTE2 != null)
				if (targetTE2 instanceof ITransferWater) ((ITransferWater) targetTE2).addVelocity(200, EnumFacing.DOWN);
		}
		
		

	}
	
	
	
}