package com.ayc.noria.block.nature;

import net.minecraft.block.Block;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import com.ayc.noria.block.Noria_Block;
import com.ayc.noria.block.water.Block_Canal;
import com.ayc.noria.utility.list.Noria_Blocks;

public class Block_Treetap extends Noria_Block{

	public static final PropertyInteger ORIENTATION = PropertyInteger.create("orientation", 0, 3);
	
	public Block_Treetap() 
	{
		super(Noria_Blocks.TREETAP);
	}
	
	//---Blockstate---
	@Override
	public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos)
    {
        return state.withProperty(ORIENTATION, canConnectTo(worldIn, pos));
    }
	
	public int canConnectTo (IBlockAccess worldIn, BlockPos pos)
	{
        if (worldIn.getBlockState(pos.east()).getBlock() instanceof Block_DebarkedWood && worldIn.getBlockState(pos.east()).getBlock().getMetaFromState(worldIn.getBlockState(pos.east())) % 4 == 1) return 1;
        if (worldIn.getBlockState(pos.south()).getBlock() instanceof Block_DebarkedWood && worldIn.getBlockState(pos.south()).getBlock().getMetaFromState(worldIn.getBlockState(pos.south())) % 4 == 2) return 2;
        if (worldIn.getBlockState(pos.west()).getBlock() instanceof Block_DebarkedWood && worldIn.getBlockState(pos.west()).getBlock().getMetaFromState(worldIn.getBlockState(pos.west())) % 4 == 3) return 3;
        return 0;
	}
	
	@Override
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {ORIENTATION});
    }
	
	@Override
    public int getMetaFromState(IBlockState state)
    {
        return 0;
    }
    
	@Override
    public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState();
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