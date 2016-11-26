package com.ayc.noria.block.waterstuff;

import java.util.Iterator;
import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumDyeColor;
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

import com.ayc.noria.API.ITransferWater;
import com.ayc.noria.block.Noria_Block;
import com.ayc.noria.tileentity.waterstuff.TE_Canal;
import com.ayc.noria.utility.list.Noria_Blocks;

public class Block_Canal extends Noria_Block implements ITileEntityProvider{

	public static final PropertyBool NORTH = PropertyBool.create("north");
    public static final PropertyBool EAST = PropertyBool.create("east");
    public static final PropertyBool SOUTH = PropertyBool.create("south");
    public static final PropertyBool WEST = PropertyBool.create("west");
	public static final PropertyInteger META = PropertyInteger.create("meta", 0, 7);
    
	public Block_Canal() 
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
        return (block instanceof Block_Canal);
	}
	
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {NORTH, EAST, WEST, SOUTH, META});
    }
    
    public int getMetaFromState(IBlockState state)
    {
        return state.getValue(META);
    }
    
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
    	for (int i = 0; i < 8; i++) list.add(new ItemStack(itemIn, 1, i));
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
    
    //---TE---
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) 
	{
		return new TE_Canal();
	}
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, @Nullable ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ)
    {
		TileEntity tileEntity = worldIn.getTileEntity(pos);
		if (tileEntity == null) return false;
		if (tileEntity instanceof ITransferWater)
		{
			((ITransferWater) tileEntity).addVelocity(50, side);
			return true;
		}
		return false;
	}
}