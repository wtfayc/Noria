package com.ayc.noria.API;

import net.minecraft.util.math.BlockPos;

public interface INoriaMultiblock {

	public void onBlockDestroyed ();
	
	public void informMaster (BlockPos masterPos, int event);
	
	public void setMaster (BlockPos masterPos);
	
	public void setMultiblockState (boolean state);
	
	public boolean getMultiblockState ();
}