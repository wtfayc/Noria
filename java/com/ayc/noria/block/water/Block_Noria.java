package com.ayc.noria.block.water;

import java.util.List;

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

import com.ayc.noria.block.Noria_Block;
import com.ayc.noria.tileentity.water.TE_Noria;
import com.ayc.noria.tileentity.water.TE_Undershot;
import com.ayc.noria.utility.list.Noria_Blocks;

public class Block_Noria extends Noria_Block implements ITileEntityProvider{

	public static final PropertyInteger META = PropertyInteger.create("meta", 0, 1);
	
	public Block_Noria() 
	{
		super(Noria_Blocks.NORIA);
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
		default : return new TE_Noria();
		case 1: return new TE_Undershot();
		}		
	}
	
	
}