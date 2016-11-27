package com.ayc.noria.block.nature;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import com.ayc.noria.block.Noria_Block;
import com.ayc.noria.utility.list.Noria_Blocks;

public class Block_Treetap extends Noria_Block{

	public Block_Treetap() 
	{
		super(Noria_Blocks.TREETAP);
	}
	
	 //---Render---
    @Override
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state)
    {
        return false;
    }

    @Override
    public boolean isPassable(IBlockAccess worldIn, BlockPos pos)
    {
        return false;
    }
}