package com.ayc.noria.block;

import java.util.List;

import com.ayc.noria.utility.list.Noria_Blocks;

import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Block_temp extends Noria_Block {

		public static final PropertyInteger META = PropertyInteger.create("meta", 0, 15);
		
		public Block_temp() 
		{
			super(Noria_Blocks.TEMP);
		}

		@Override
	    protected BlockStateContainer createBlockState()
	    {
	        return new BlockStateContainer(this, new IProperty[] {META});
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
	    
	    @SuppressWarnings("unchecked")
		@Override
	    @SideOnly(Side.CLIENT)
	    public void getSubBlocks(Item itemIn, CreativeTabs tab, @SuppressWarnings("rawtypes") List list)
	    {
	    	for (int i = 0; i < 16; i++) list.add(new ItemStack(itemIn, 1, i));
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