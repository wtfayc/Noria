package com.ayc.noria.utility;

import net.minecraft.block.Block;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class Helper_Machine {

	/**Counts how many true in booleans */
	public int getBooleanCount (boolean... bools)
	{
		int count = 0;
		for (boolean bool : bools) count += (bool ? 1 : 0);
		return count;			
	}
	
	/**Check block in world at pos for block and meta*/
	public static boolean isBlockMeta(IBlockAccess worldIn, BlockPos pos, Block block, int meta)
	{
		if (block != null) if (worldIn.getBlockState(pos).getBlock().getMetaFromState(worldIn.getBlockState(pos)) == meta && worldIn.getBlockState(pos).getBlock() == block) return true;
		return false;
	}
	
	/**Rotate xyz translation by degree*/
	public static BlockPos rotateBlockPos (BlockPos pos, EnumFacing side)
	{
		return pos;
	}
	
	/**Translate pitch to EnumFacing above or below angle else NORTH*/
	public static EnumFacing getEnumFacingFromPitch (int angle, float pitch)
	{
		if (pitch <= -angle) return EnumFacing.UP;
		if (pitch >= angle) return EnumFacing.DOWN;
		return EnumFacing.NORTH;
	}
}