package com.ayc.noria.block.heat;

import java.util.List;

import javax.annotation.Nullable;

import com.ayc.noria.API.ICanBeRightClicked;
import com.ayc.noria.API.IMSP;
import com.ayc.noria.API.INoriaMultiblock;
import com.ayc.noria.block.Noria_Block;
import com.ayc.noria.tileentity.heat.firebox.TE_Firebox_Steel;
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
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Block_Firebox extends Noria_Block implements ITileEntityProvider{

	public static final PropertyInteger META = PropertyInteger.create("meta", 0, 2);
	public static final PropertyInteger STATE = PropertyInteger.create("state", 0, 1);
	public static final PropertyInteger PART = PropertyInteger.create("part", 0, 2);
	public static final PropertyInteger CONTENT = PropertyInteger.create("content", 0, 6);
	
	public Block_Firebox() 
	{
		super(Noria_Blocks.FIREBOX);
	}

	@Override
	public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos)
    {
        return state.withProperty(STATE, getState(worldIn, pos)).withProperty(PART, getPart(worldIn, pos));
    }
	
	private int getState (IBlockAccess worldIn, BlockPos pos)
	{
		TileEntity tileEntity = worldIn.getTileEntity(pos);
		if (tileEntity instanceof IMSP) return ((IMSP) tileEntity).getState();
		return 0;
	}
	
	private int getPart (IBlockAccess worldIn, BlockPos pos)
	{
		TileEntity tileEntity = worldIn.getTileEntity(pos);
		if (tileEntity instanceof IMSP) return ((IMSP) tileEntity).getPart();
		return 0;
	}
	
	@Override
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {META, STATE, PART, CONTENT});
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
    	for (int i = 0; i < 3; i++) list.add(new ItemStack(itemIn, 1, i));
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
        return true;
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
        if (meta == 2) if (tileEntity instanceof ICanBeRightClicked) return ((ICanBeRightClicked) tileEntity).onBlockActivated(heldItem, side);
    	return false;
    }
    
    @Override
    public void onBlockDestroyedByPlayer(World worldIn, BlockPos pos, IBlockState state)
    {
    	TileEntity tileEntity = worldIn.getTileEntity(pos);
        if (tileEntity == null) return;
        if (tileEntity instanceof INoriaMultiblock) ((INoriaMultiblock) tileEntity).onBlockDestroyed();
     	return;
    }
    
    @Override
    public void onBlockDestroyedByExplosion(World worldIn, BlockPos pos, Explosion explosionIn)
    {
    	onBlockDestroyedByPlayer(worldIn, pos, worldIn.getBlockState(pos));
    }
    
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta)  //TODO
	{
		switch (meta)
		{
			default:	return null;
			case 2:		return new TE_Firebox_Steel();
		}
	}
}