package com.ayc.noria.tileentity;

import net.minecraft.util.ITickable;

import com.ayc.noria.utility.Helper_Log;

public class test2 extends Noria_TileEntity implements ITickable{

	double tick = 0;
	
	@Override
	public void update()
 	{	
 		tick = tick + 0.25;
 		if (tick >= 360) tick = 0;
 	}
	
	public double getTick()
	{
		return tick;
	}

}