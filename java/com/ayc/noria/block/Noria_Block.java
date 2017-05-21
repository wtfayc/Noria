package com.ayc.noria.block;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import com.ayc.noria.API.IRotationHandler;
import com.ayc.noria.utility.Helper_Machine;
import com.ayc.noria.utility.Reference_Static;
import com.ayc.noria.utility.list.Noria_Blocks;

public class Noria_Block extends Block
{
	public Noria_Block(Noria_Blocks noriaBlock)
	{
		super(noriaBlock.material);
		this.setRegistryName(noriaBlock.name);
		this.setUnlocalizedName(noriaBlock.nameUnlocalized);
		this.setHardness(noriaBlock.hardness);
		this.setResistance(noriaBlock.resistance);
		this.setCreativeTab(noriaBlock.creativeTabs);
        this.setSoundType(noriaBlock.soundType);
	}
		
	public String getUnlocalizedName()
	{
		return String.format("tile.%s%s", Reference_Static.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName)
	{
		return unlocalizedName.substring(unlocalizedName.indexOf(".") +1);
	}

	@Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack)
    {
		TileEntity tileEntity = worldIn.getTileEntity(pos);
		if (tileEntity == null)
		{
			super.onBlockPlacedBy(worldIn, pos, state, placer, stack);
			return;
		}
		if (tileEntity instanceof IRotationHandler)
		{
			EnumFacing enumFacing = Helper_Machine.getEnumFacingFromPitch(60, placer.rotationPitch);
			if (enumFacing == EnumFacing.NORTH) enumFacing = placer.getHorizontalFacing();
			((IRotationHandler) tileEntity).setWorldFacing(enumFacing.ordinal());
		}
		super.onBlockPlacedBy(worldIn, pos, state, placer, stack);
    }
}