package com.ayc.noria.tileentity.heat;

import com.ayc.noria.tileentity.Noria_TileEntity;
import com.ayc.noria.utility.Helper_Log;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TE_Lancashire extends Noria_TileEntity{

	private int state = 0;
	
	public void setState (int state)
	{
		Helper_Log.info("setting state" + state);
		this.state = state;
	}
	
	public int getState ()
	{
		return state;
	}
	
	@Override
    public boolean shouldRefresh(World world, BlockPos pos, IBlockState oldState, IBlockState newSate)
    {
        return false;
    }
	
	private void notifyBlockUpdate() 
	{
		final IBlockState state = getWorld().getBlockState(getPos());
		getWorld().notifyBlockUpdate(getPos(), state, state, 3);
	}

	@Override
	public void markDirty() 
	{
		super.markDirty();
		notifyBlockUpdate();
	}
	
}