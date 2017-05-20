package com.ayc.noria.block.rotary;

import java.util.List;

import com.ayc.noria.block.Noria_Block;
import com.ayc.noria.tileentity.rotary.TE_Panemone;
import com.ayc.noria.tileentity.rotary.TE_PanemoneShaft;
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
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Block_RotaryGenerator extends Noria_Block implements ITileEntityProvider{

	public static final PropertyInteger META = PropertyInteger.create("meta", 0, 1);
	
	public Block_RotaryGenerator() 
	{
		super(Noria_Blocks.ROTARYGENERATOR);
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
			default : 	return new TE_PanemoneShaft();
			case 1 : 	return new TE_Panemone();
		}
	}
}