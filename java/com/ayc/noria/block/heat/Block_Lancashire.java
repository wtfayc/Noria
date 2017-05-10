package com.ayc.noria.block.heat;

import java.util.List;

import javax.annotation.Nullable;

import com.ayc.noria.block.Noria_Block;
import com.ayc.noria.tileentity.heat.TE_Lancashire;
import com.ayc.noria.tileentity.heat.TE_Lancashire_Ctrl;
import com.ayc.noria.utility.list.Noria_Blocks;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Block_Lancashire extends Noria_Block implements ITileEntityProvider{

	public static final PropertyInteger META = PropertyInteger.create("meta", 0, 6);
	public static final PropertyInteger STATE = PropertyInteger.create("state", 0, 14);
	public static final PropertyInteger PART = PropertyInteger.create("part", 0, 6);
	
	public Block_Lancashire() 
	{
		super(Noria_Blocks.LANCASHIRE);
	}

	@Override
	public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos)
    {
        return state.withProperty(STATE, getState(worldIn, pos)).withProperty(PART, getPart (worldIn, pos));
    }
	
	private int getState (IBlockAccess worldIn, BlockPos pos)
	{
		TileEntity tileEntity = worldIn.getTileEntity(pos);
		if (tileEntity instanceof TE_Lancashire) return ((TE_Lancashire) tileEntity).getState();
		return 0;
	}
	
	private int getPart (IBlockAccess worldIn, BlockPos pos)
	{
		return 0;
	}
	
	@Override
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {META, STATE, PART});
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
    public void getSubBlocks(Item itemIn, CreativeTabs tab, List<ItemStack> list)
    {
    	for (int i = 0; i < 7; i++) list.add(new ItemStack(itemIn, 1, i));
    }
	
    //---Render---
    @Override
    public boolean isOpaqueCube(IBlockState state) //TODO
    {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) //TODO
    {
        return false;
    }

    @Override
    public boolean isPassable(IBlockAccess worldIn, BlockPos pos)
    {
        return false;
    }
    
    
    //---Work---
    
    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, @Nullable ItemStack heldItem, 
    		EnumFacing side, float hitX, float hitY, float hitZ)
    {
        int meta = state.getValue(META);
        TileEntity tileEntity = worldIn.getTileEntity(pos);
        if (tileEntity == null) return false;
        if (meta == 6) if (tileEntity instanceof TE_Lancashire_Ctrl) return ((TE_Lancashire_Ctrl) tileEntity).onBlockActivated(heldItem, side);
    	    	
    	return false;
    }
    
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta)  //TODO
	{
		switch (meta)
		{
			default:	return new TE_Lancashire();
			case 6:		return new TE_Lancashire_Ctrl();
		}
	}
}