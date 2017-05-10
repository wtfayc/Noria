package com.ayc.noria.utility;

import net.minecraft.block.Block;
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
	
}