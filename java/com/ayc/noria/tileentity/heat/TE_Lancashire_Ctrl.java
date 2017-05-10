package com.ayc.noria.tileentity.heat;

import javax.annotation.Nullable;

import com.ayc.noria.handler.registry.RegBlocks;
import com.ayc.noria.utility.Helper_Log;
import com.ayc.noria.utility.Helper_Machine;

import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.BlockPos;

public class TE_Lancashire_Ctrl extends TE_Lancashire {

	
	
	
	
	
	
	
	public boolean onBlockActivated (@Nullable ItemStack heldItem, EnumFacing side)
	{
		if (checkStructure()) return activateStructure();		
		return false;
	}
	
	private boolean checkStructure ()
	{
		if (Helper_Machine.isBlockMeta(worldObj, pos.add(-1, -2, 0), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, pos.add(-2, -2, 0), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, pos.add(1, -2, 0), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, pos.add(2, -2, 0), RegBlocks.block_lancashire, 0))
		return true;


		
		
		
		
		
		
		
		return false;
	}
	
	private boolean activateStructure ()
	{
		if (transformBlock (pos.add(-1, -2, 0), LANCASHIRE_MetaStatePart.BRICK_BOT))
		if (transformBlock (pos.add(-2, -2, 0), LANCASHIRE_MetaStatePart.BRICK_BOTLEFT))
		if (transformBlock (pos.add(1, -2, 0), LANCASHIRE_MetaStatePart.BRICK_BOT))
		if (transformBlock (pos.add(2, -2, 0), LANCASHIRE_MetaStatePart.BRICK_BOTRIGHT))
		{
			markDirty();
			return true;
		}
		
		Helper_Log.error("Error assembling multiblock @ " + pos);
		return false;
	}
	
	private boolean transformBlock (BlockPos pos, LANCASHIRE_MetaStatePart msp)
	{
		TileEntity tileEntity = worldObj.getTileEntity(pos);
		if (tileEntity == null) return false; 
		if (tileEntity instanceof TE_Lancashire)
		{
			((TE_Lancashire) tileEntity).setState(msp.state);
			return true;
		}
		return false;
	}
	
	private enum LANCASHIRE_MetaStatePart
	{
		BRICK_BLOCK 		(0, 1, 0),
		BRICK_BOT 			(0, 2, 0),
		BRICK_BOTLEFT 		(0, 3, 0),
		BRICK_BOTRIGHT 		(0, 4, 0),
		BRICK_LEFT 			(0, 5, 0),
		BRICK_RIGHT 		(0, 6, 0),
		STEEL_BLOCK 		(1, 7, 0),
		STEEL_BOTLEFT 		(1, 8, 0),
		STEEL_BOTRIGHT		(1, 9, 0),
		STEEL_TOPLEFT 		(1, 10, 0),
		STEEL_TOPRIGHT 		(1, 11, 0),
		VALVE_MUD	 		(2, 12, 0),
		VALVE_MUD_CLOSED	(2, 12, 2),
		VALVE_STEAM	 		(2, 13, 0),
		VALVE_STEAM_CLOSED	(2, 13, 1),
		VALVE_WATER	 		(2, 14, 0),
		VALVE_WATER_CLOSED	(2, 14, 2),
		CHIMNEY				(3, 0, 0),
		MAINTENANCE			(4, 0, 4),
		MAINTENANCE_CLOSED	(4, 0, 3),
		ASH					(5, 0, 6),
		ASH_CLOSED			(5, 0, 5),
		CENTRAL				(6, 0, 0)
				
		;
		int meta;
		int state;
		int part;
		
		private LANCASHIRE_MetaStatePart (int meta, int state, int part)
		{
			this.meta = meta;
			this.state = state;
			this.part = part;			
		}
	}
	
}