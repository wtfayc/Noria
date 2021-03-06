package com.ayc.noria.block.heat;

import java.util.List;

import javax.annotation.Nullable;

import com.ayc.noria.block.Noria_Block;
import com.ayc.noria.tileentity.heat.TE_SafetyValve;
import com.ayc.noria.utility.list.Noria_Blocks;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Block_Steampipes extends Noria_Block implements ITileEntityProvider {

	public static final PropertyInteger META = PropertyInteger.create("meta", 0, 1);
	
	public Block_Steampipes() 
	{
		super(Noria_Blocks.STEAMPIPES);
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
    
    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item itemIn, CreativeTabs tab, List list)
    {
    	for (int i = 0; i < 2; i++) list.add(new ItemStack(itemIn, 1, i));
    }
	
    //---Render---
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return new AxisAlignedBB(0.1875D, 0.0D, 0.1875D, 0.8125D, 1.0D, 0.8125D);
    }

    @Nullable
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, World worldIn, BlockPos pos)
    {
    	return new AxisAlignedBB(0.1875D, 0.0D, 0.1875D, 0.8125D, 1.0D, 0.8125D);
    }
    
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
	public TileEntity createNewTileEntity(World worldIn, int meta)  //TODO
	{
		switch (meta)
		{
			default:	return null;
			case 0:		return new TE_SafetyValve();
		}
	}
}