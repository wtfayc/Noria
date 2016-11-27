package com.ayc.noria.tileentity.waterstuff;

import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import com.ayc.noria.API.ITransferWater;
import com.ayc.noria.block.water.Block_Canal;
import com.ayc.noria.tileentity.Noria_TileEntity;
import com.ayc.noria.utility.Helper_Log;
import com.ayc.noria.utility.Reference_Dynamic;

public class TE_Canal extends Noria_TileEntity implements ITickable, ITransferWater{

	//TODO Spilling
	//TODO ServerSide math and render packets
	
	private int velocity = 0;
	private boolean work = false;
	private int tick = 0;
	
	private boolean canNorth = true;
	private boolean canSouth = true;
	private boolean canEast = true;
	private boolean canWest = true;
	
	@Override
	public void update() 
	{
		if (getWork()) tick++;
		if (tick >= 20 && (tick % (20 + (pos.getX()*pos.getZ()) % 10)) == 0)
		{
			if (velocity == 0) setWork(false);
			transferVelocity();
		}
	}
	
	@Override
	public void addVelocity (int velocity, EnumFacing dir)
	{
		int newVelocity = this.velocity + velocity;
		if (newVelocity > Reference_Dynamic.maxCanalVelocity)
		{
			setVelocity(Reference_Dynamic.maxCanalVelocity);
			spill(newVelocity - Reference_Dynamic.maxCanalVelocity);
		}
		else setVelocity(newVelocity);
			
		setCanTransferWater(dir.getOpposite(), false);
		setWork(true);

		//DEBUG
		Helper_Log.info(pos + " + " + this.velocity + " + " + tick);
		
	}
	
	@Override
	public void transferVelocity()
	{
		Helper_Log.info(pos + " yo");
		int count = 0;
		for (EnumFacing facing : EnumFacing.values())
		{
			if (getCanTransferWater(facing))
			{
				TileEntity targetTE = worldObj.getTileEntity(pos.offset(facing));
				if (targetTE instanceof ITransferWater) if (((ITransferWater) targetTE).getCanAcceptWater(facing))
				{
					setCanTransferWater(facing, true);
					count++;
				}
				else setCanTransferWater(facing, false);
			}
		}
		
		if (count == 0)
		{
			setCanTransferWater (EnumFacing.NORTH, true);
			setCanTransferWater (EnumFacing.SOUTH, true);
			setCanTransferWater (EnumFacing.EAST, true);
			setCanTransferWater (EnumFacing.WEST, true);
			return;
		}
		
		for (EnumFacing facing : EnumFacing.values())
		{
			if (getCanTransferWater(facing))
			{
				TileEntity targetTE = worldObj.getTileEntity(pos.offset(facing));
				if (targetTE instanceof ITransferWater) if (((ITransferWater) targetTE).getCanAcceptWater(facing))
					((ITransferWater) targetTE).addVelocity((velocity / count), facing);
			}
		}
		setWork(false);
		setVelocity (0);
	}

	@Override
	public boolean getCanTransferWater (EnumFacing dir)
	{
		switch (dir)
		{
			case NORTH :return canNorth;
			case SOUTH :return canSouth;
			case EAST : return canEast;
			case WEST : return canWest;
			case UP : 	return false;
			case DOWN : return true;
			default : 	return false;
		}
	}
	
	@Override
	public void setCanTransferWater (EnumFacing dir, boolean bool)
	{
		switch (dir)
		{
			case NORTH :	canNorth = bool; return;
			case SOUTH :	canSouth = bool; return;
			case EAST : 	canEast = bool; return;
			case WEST : 	canWest = bool; return;
			default:		return;
		}
	}
	
	@Override
	public boolean getCanAcceptWater (EnumFacing dir)
	{
		if (dir == EnumFacing.UP) return false;
		return true;
	}
	
	@Override
	public void setCanAcceptWater (EnumFacing dir)
	{
		return;
	}
	
	@Override
	public int getVelocity() 
	{
		return this.velocity;
	}

	@Override
	public void setVelocity(int velocity)  //TODO less blockstate update
	{
		this.velocity = velocity;
		if (worldObj.getBlockState(pos).getBlock() instanceof Block_Canal) worldObj.setBlockState(pos, worldObj.getBlockState(pos).withProperty(Block_Canal.WATERLEVEL, velocity == 0 ? 0 : 1), 2);
		Helper_Log.info(pos + " + " + this.velocity);
	}
	
	private boolean getWork ()
	{
		return work;
	}
	
	private void setWork (boolean work)
	{
		if (!work) tick = 0;
		this.work = work;
	}

	private void spill (int excessVelocity) //TODO
	{
		Helper_Log.info("SPILLING OUT");
	}
	
	@Override
	public boolean shouldRefresh(World world, BlockPos pos, IBlockState oldState, IBlockState newState) 
	{
		return (oldState.getBlock() != newState.getBlock());
	}
	
}