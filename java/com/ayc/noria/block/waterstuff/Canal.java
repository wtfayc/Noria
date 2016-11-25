package com.ayc.noria.block.waterstuff;

import net.minecraft.block.Block;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import com.ayc.noria.block.Noria_Block;
import com.ayc.noria.utility.list.Noria_Blocks;

public class Canal extends Noria_Block{

	public static final PropertyBool NORTH = PropertyBool.create("north");
    public static final PropertyBool EAST = PropertyBool.create("east");
    public static final PropertyBool SOUTH = PropertyBool.create("south");
    public static final PropertyBool WEST = PropertyBool.create("west");
	
	public Canal() 
	{
		super(Noria_Blocks.CANAL);
	}
	
	//---Blockstate---	
	public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos)
    {
        return state
        		.withProperty(NORTH, Boolean.valueOf(this.canConnectTo(worldIn, pos.north())))
        		.withProperty(EAST, Boolean.valueOf(this.canConnectTo(worldIn, pos.east())))
        		.withProperty(SOUTH, Boolean.valueOf(this.canConnectTo(worldIn, pos.south())))
        		.withProperty(WEST, Boolean.valueOf(this.canConnectTo(worldIn, pos.west())));
    }
	
	public boolean canConnectTo (IBlockAccess worldIn, BlockPos pos)
	{
		IBlockState iblockstate = worldIn.getBlockState(pos);
        Block block = iblockstate.getBlock();
        return (block instanceof Canal);
	}
	
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {NORTH, EAST, WEST, SOUTH});
    }
    
    public int getMetaFromState(IBlockState state)
    {
        return 0;
    }
    
    //---Render---
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }

    public boolean isFullCube(IBlockState state)
    {
        return false;
    }

    public boolean isPassable(IBlockAccess worldIn, BlockPos pos)
    {
        return false;
    }
}