package com.ayc.noria.tileentity.heat.lancashire;

import javax.annotation.Nullable;

import com.ayc.noria.API.ICanBeRightClicked;
import com.ayc.noria.API.IMSP;
import com.ayc.noria.API.INoriaMultiblock;
import com.ayc.noria.tileentity.heat.lancashire.Lancashire.LANCASHIRE_MSP;
import com.ayc.noria.utility.Helper_Machine;
import com.ayc.noria.utility.list.Noria_Subitems;

import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;

public class TE_Lancashire_Ctrl extends TE_Lancashire implements ICanBeRightClicked {

	EnumFacing facing = EnumFacing.NORTH;
	
	public boolean onBlockActivated (@Nullable ItemStack heldItem, EnumFacing side) //TODO itemstack
	{
		if (heldItem == null) return false;
		if (heldItem.getItem() == Noria_Subitems.TOOL_HAMMER.item && heldItem.getMetadata() == Noria_Subitems.TOOL_HAMMER.meta) if (checkStructure()) return activateStructure();
		if (heldItem.getItem() == Noria_Subitems.PART_BOILER_WATER_LEVEL.item && heldItem.getMetadata() == Noria_Subitems.PART_BOILER_WATER_LEVEL.meta)
		{
			if (this.state == 15)
			{
				setState(16);
				markDirty();
				return true;
			}
			if (this.state == 16)
			{
				setState(15);
				markDirty();
				return true;
			}
			return false;
		}
		if (heldItem.getItem() == Noria_Subitems.PART_BOILER_GAUGE.item && heldItem.getMetadata() == Noria_Subitems.PART_BOILER_GAUGE.meta)
		{
			if (this.part == 7)
			{
				setPart(8);
				markDirty();
				return true;
			}
			if (this.part >= 8 && this.part <= 11)
			{
				setPart(7);
				markDirty();
				return true;
			}
			return false;
		}
		return false;
	}

	private boolean checkStructure()
	{
		for (Lancashire lancashire : Lancashire.values())
		{
			if (!Helper_Machine.isBlockMeta(worldObj, Lancashire.giveRotatedPos(pos, lancashire, facing), lancashire.block, lancashire.meta)) return false;
		}
		return true;
	}
	
	private boolean activateStructure()
	{
		for (Lancashire lancashire : Lancashire.values())
		{
			if (!transformBlock(Lancashire.giveRotatedPos(pos, lancashire, facing), lancashire.lancaMSP)) return false;
		}
		markDirty();
		return true;	
	}
	
	private boolean transformBlock (BlockPos pos, LANCASHIRE_MSP lancaMSP)
	{
		TileEntity tileEntity = worldObj.getTileEntity(pos);
		if (tileEntity == null) return false; 
		if (tileEntity instanceof IMSP)
		{
			((IMSP) tileEntity).setState(lancaMSP.state);
			((IMSP) tileEntity).setPart(lancaMSP.part);
			if (tileEntity instanceof INoriaMultiblock) ((INoriaMultiblock) tileEntity).setMaster(this.pos);
			return true;
		}
		return false;
	}
	
	private void killMultiblock (BlockPos pos)
	{
		TileEntity tileEntity = worldObj.getTileEntity(pos);
		if (tileEntity == null) return; 
		if (tileEntity instanceof IMSP)
		{
			((IMSP) tileEntity).setState(0);
			((IMSP) tileEntity).setPart(0);
			if (tileEntity instanceof INoriaMultiblock) ((INoriaMultiblock) tileEntity).setMultiblockState(false);
		}
	}
	
	@Override
	public void informMaster (BlockPos masterPos, int event)
	{
		if (event == 0)
		{
			for (Lancashire lancashire : Lancashire.values())
			{
				killMultiblock (Lancashire.giveRotatedPos(pos, lancashire, facing));
			}
			markDirty();
		}
	}

}