package com.ayc.noria.tileentity.heat;

import com.ayc.noria.tileentity.Noria_TileEntity;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TE_Lancashire extends Noria_TileEntity implements ITickable {

	private int tick = 0;
	private int state = 0;
	
	@Override
	public void update() 
	{
		tick++;
		if (tick > 0 && tick % 20 == 0) changeState();
		if (tick >= 100) tick = 0;
	}
	
	private void changeState ()
	{
		state++;
		if (state > 8) state = 0;
		markDirty();
		return;
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