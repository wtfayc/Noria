package com.ayc.noria.block.rotary;

import java.util.List;

import com.ayc.noria.API.IRotationHandler;
import com.ayc.noria.block.Noria_Block;
import com.ayc.noria.tileentity.rotary.TE_RotaryShaft;
import com.ayc.noria.utility.list.Noria_Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Block_RotaryShaft  extends Noria_Block implements ITileEntityProvider{

	public static final PropertyInteger UP = PropertyInteger.create("up", 0, 2);
	public static final PropertyInteger DOWN = PropertyInteger.create("down", 0, 2);
	public static final PropertyInteger NORTH = PropertyInteger.create("north", 0, 2);
    public static final PropertyInteger EAST = PropertyInteger.create("east", 0, 2);
    public static final PropertyInteger SOUTH = PropertyInteger.create("south", 0, 2);
    public static final PropertyInteger WEST = PropertyInteger.create("west", 0, 2);
	public static final PropertyInteger META = PropertyInteger.create("meta", 0, 1);
	
	public Block_RotaryShaft() 
	{
		super(Noria_Blocks.ROTARYSHAFT);
	}

	@Override
	public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos)
    {
        return state
        		.withProperty(UP, canConnectTo(worldIn, pos, EnumFacing.UP))
        		.withProperty(DOWN, canConnectTo(worldIn, pos, EnumFacing.DOWN))
        		.withProperty(NORTH, canConnectTo(worldIn, pos, EnumFacing.NORTH))
        		.withProperty(EAST, canConnectTo(worldIn, pos, EnumFacing.EAST))
        		.withProperty(SOUTH, canConnectTo(worldIn, pos, EnumFacing.SOUTH))
        		.withProperty(WEST, canConnectTo(worldIn, pos, EnumFacing.WEST));
    }
	
	public int canConnectTo (IBlockAccess worldIn, BlockPos pos, EnumFacing side)
	{
		IBlockState iblockstate = worldIn.getBlockState(pos.offset(side));
        Block block = iblockstate.getBlock();
        TileEntity tileEntity = worldIn.getTileEntity(pos);
        if (tileEntity == null) return 0;
		if (tileEntity instanceof IRotationHandler && block.isBlockSolid(worldIn, pos.offset(side), side.getOpposite()))
		{
			int facing = ((IRotationHandler) tileEntity).getFacing();
			if (facing == 0 || facing == 1)
			{
				if (side == EnumFacing.UP || side == EnumFacing.DOWN) return 0;
				return 1;
			}
			if (facing == 2 || facing == 3)
			{
				if (side == EnumFacing.UP || side == EnumFacing.DOWN) return 1;
				if (side == EnumFacing.WEST || side == EnumFacing.EAST) return 2;
				return 0;
			}
			if (facing == 4 || facing == 5)
			{
				if (side == EnumFacing.WEST || side == EnumFacing.EAST) return 0;
				return 2;
			}
		}
		return 0;
	}
	
	@Override
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {UP, DOWN, NORTH, EAST, WEST, SOUTH, META});
    }
    
	@Override
    public int getMetaFromState(IBlockState state)
    {
        return state.getValue(META);
    }
    
	@Override
    public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().withProperty(META, meta);
    }
    
    @Override
    public int damageDropped(IBlockState state)
    {
      return state.getValue(META);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item itemIn, CreativeTabs tab, List list)
    {
    	for (int i = 0; i < 2; i++) list.add(new ItemStack(itemIn, 1, i));
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
    
	@Override
	@SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }
	
	@Override
	public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face)
    {
        return false;
    }
	
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) 
	{
		switch (meta)
		{
			default : 	return new TE_RotaryShaft();
		}
	}
}