package com.ayc.noria.tileentity.heat.firebox;

import javax.annotation.Nullable;

import com.ayc.noria.API.ICanBeRightClicked;
import com.ayc.noria.API.IMSP;
import com.ayc.noria.API.INoriaMultiblock;
import com.ayc.noria.tileentity.Noria_TileEntity;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TE_Firebox_Steel extends Noria_TileEntity implements IMSP, ICanBeRightClicked, INoriaMultiblock{

	protected int state = 0;
	protected int part = 0;
	protected int content = 0;
	protected BlockPos masterPos;
	protected boolean isMultiblock = false;
	
	public boolean onBlockActivated (@Nullable ItemStack heldItem, EnumFacing side)
	{
		if (this.part == 1)
		{
			setPart(2);
			markDirty();
			return true;
		}
		if (this.part == 2)
		{
			setPart(1);
			markDirty();
			return true;
		}
		return false;
	}
	
	public void setState (int state)
	{
		this.state = state;
	}
	
	public int getState ()
	{
		return state;
	}
	
	public void setPart (int part)
	{
		this.part = part;
	}
	
	public int getPart ()
	{
		return part;
	}
	
	public void setContent (int content)
	{
		this.content = content;
	}
	
	public int getContent ()
	{
		return content;
	}
	
	public void onBlockDestroyed ()
	{
		if (getMultiblockState()) informMaster(masterPos, 0);
	}
	
	public void setMaster (BlockPos masterPos)
	{
		this.masterPos = masterPos;
		setMultiblockState(true);
	}
	
	public void informMaster (BlockPos masterPos, int event)
	{
		TileEntity tileEntity = worldObj.getTileEntity(masterPos);
		if (tileEntity == null) return;
		if (tileEntity instanceof INoriaMultiblock) ((INoriaMultiblock) tileEntity).informMaster(masterPos, event);
	}
	
	public void setMultiblockState (boolean state)
	{
		this.isMultiblock = state;
	}
	
	public boolean getMultiblockState ()
	{
		return this.isMultiblock;
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