package com.ayc.noria.block.rotary;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
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

import com.ayc.noria.block.Noria_Block;
import com.ayc.noria.block.water.Block_Canal;
import com.ayc.noria.handler.registry.RegBlocks;
import com.ayc.noria.tileentity.rotary.TE_MillstoneBot;
import com.ayc.noria.utility.list.Noria_Blocks;

public class Block_WoodPart extends Noria_Block {

	public static final PropertyInteger STATE = PropertyInteger.create("state", 0, 8);
	public static final PropertyInteger META = PropertyInteger.create("meta", 0, 6);
    
	public Block_WoodPart() 
	{
		super(Noria_Blocks.WOODPART);
	}
	
	//---Blockstate---
	@Override
	public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos)
    {
        return state.withProperty(STATE, getState(worldIn, pos));
    }
	
	private int getState (IBlockAccess worldIn, BlockPos pos)
	{
		if (worldIn.getTileEntity(pos.south()) instanceof TE_MillstoneBot) return 2;
		if (worldIn.getTileEntity(pos.north()) instanceof TE_MillstoneBot) return 6;
		if (worldIn.getTileEntity(pos.east()) instanceof TE_MillstoneBot) return 8;
		if (worldIn.getTileEntity(pos.west()) instanceof TE_MillstoneBot) return 4;
		if (worldIn.getTileEntity(pos.south().east()) instanceof TE_MillstoneBot) return 1;
		if (worldIn.getTileEntity(pos.south().west()) instanceof TE_MillstoneBot) return 3;
		if (worldIn.getTileEntity(pos.north().east()) instanceof TE_MillstoneBot) return 7;
		if (worldIn.getTileEntity(pos.north().west()) instanceof TE_MillstoneBot) return 5;
		return 0;
	}
	
	@Override
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {META, STATE});
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
    	for (int i = 0; i < 7; i++) list.add(new ItemStack(itemIn, 1, i));
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