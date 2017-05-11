package com.ayc.noria.tileentity.heat.lancashire;

import com.ayc.noria.handler.registry.RegBlocks;
import com.ayc.noria.utility.Helper_Log;
import com.ayc.noria.utility.Helper_Machine;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;

public abstract class Helper_Lancashire extends TE_Lancashire {

	EnumFacing facing = EnumFacing.NORTH;
	
	protected boolean checkStructure ()
	{
		//round -2
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-2, -2, 0), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-1, -2, 0), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(0, -2, 0), facing), RegBlocks.block_lancashire, 2))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(1, -2, 0), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(2, -2, 0), facing), RegBlocks.block_lancashire, 0))
		
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-2, -2, -1), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-1, -2, -1), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(0, -2, -1), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(1, -2, -1), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(2, -2, -1), facing), RegBlocks.block_lancashire, 0))
			
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-2, -2, -2), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-1, -2, -2), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(0, -2, -2), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(1, -2, -2), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(2, -2, -2), facing), RegBlocks.block_lancashire, 0))
						
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-2, -2, -3), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-1, -2, -3), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(0, -2, -3), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(1, -2, -3), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(2, -2, -3), facing), RegBlocks.block_lancashire, 0))
								
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-2, -2, -4), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-1, -2, -4), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(0, -2, -4), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(1, -2, -4), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(2, -2, -4), facing), RegBlocks.block_lancashire, 0))
											
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-2, -2, -5), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-1, -2, -5), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(0, -2, -5), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(1, -2, -5), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(2, -2, -5), facing), RegBlocks.block_lancashire, 0))
													
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-2, -2, -6), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-1, -2, -6), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(0, -2, -6), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(1, -2, -6), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(2, -2, -6), facing), RegBlocks.block_lancashire, 0))
															
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-2, -2, -7), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-1, -2, -7), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(0, -2, -7), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(1, -2, -7), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(2, -2, -7), facing), RegBlocks.block_lancashire, 0))
		
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-2, -2, -8), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-1, -2, -8), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(0, -2, -8), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(1, -2, -8), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(2, -2, -8), facing), RegBlocks.block_lancashire, 0))
					
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-2, -2, -9), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-1, -2, -9), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(0, -2, -9), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(1, -2, -9), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(2, -2, -9), facing), RegBlocks.block_lancashire, 0))
		
		//round -1
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-2, -1, 0), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-1, -1, 0), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(0, -1, 0), facing), RegBlocks.block_lancashire, 5))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(1, -1, 0), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(2, -1, 0), facing), RegBlocks.block_lancashire, 0))
				
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-2, -1, -1), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-1, -1, -1), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(0, -1, -1), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(1, -1, -1), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(2, -1, -1), facing), RegBlocks.block_lancashire, 0))
					
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-2, -1, -2), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-1, -1, -2), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(0, -1, -2), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(1, -1, -2), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(2, -1, -2), facing), RegBlocks.block_lancashire, 0))
								
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-2, -1, -3), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-1, -1, -3), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(0, -1, -3), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(1, -1, -3), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(2, -1, -3), facing), RegBlocks.block_lancashire, 0))
										
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-2, -1, -4), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-1, -1, -4), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(0, -1, -4), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(1, -1, -4), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(2, -1, -4), facing), RegBlocks.block_lancashire, 0))
													
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-2, -1, -5), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-1, -1, -5), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(0, -1, -5), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(1, -1, -5), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(2, -1, -5), facing), RegBlocks.block_lancashire, 0))
															
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-2, -1, -6), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-1, -1, -6), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(0, -1, -6), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(1, -1, -6), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(2, -1, -6), facing), RegBlocks.block_lancashire, 0))
																	
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-2, -1, -7), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-1, -1, -7), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(0, -1, -7), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(1, -1, -7), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(2, -1, -7), facing), RegBlocks.block_lancashire, 0))
				
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-2, -1, -8), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-1, -1, -8), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(0, -1, -8), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(1, -1, -8), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(2, -1, -8), facing), RegBlocks.block_lancashire, 0))
							
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-2, -1, -9), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-1, -1, -9), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(0, -1, -9), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(1, -1, -9), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(2, -1, -9), facing), RegBlocks.block_lancashire, 0))

		//round 0
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-2, 0, 0), facing), RegBlocks.block_lancashire, 0))
//		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-1, 0, 0), facing), RegBlocks.block_lancashire, 1))
//		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(1, 0, 0), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(2, 0, 0), facing), RegBlocks.block_lancashire, 0))
					
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-2, 0, -1), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-1, 0, -1), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(0, 0, -1), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(1, 0, -1), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(2, 0, -1), facing), RegBlocks.block_lancashire, 0))
		
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-2, 0, -2), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-1, 0, -2), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(0, 0, -2), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(1, 0, -2), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(2, 0, -2), facing), RegBlocks.block_lancashire, 0))
									
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-2, 0, -3), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-1, 0, -3), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(0, 0, -3), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(1, 0, -3), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(2, 0, -3), facing), RegBlocks.block_lancashire, 0))
											
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-2, 0, -4), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-1, 0, -4), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(0, 0, -4), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(1, 0, -4), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(2, 0, -4), facing), RegBlocks.block_lancashire, 0))
														
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-2, 0, -5), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-1, 0, -5), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(0, 0, -5), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(1, 0, -5), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(2, 0, -5), facing), RegBlocks.block_lancashire, 0))
																
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-2, 0, -6), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-1, 0, -6), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(0, 0, -6), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(1, 0, -6), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(2, 0, -6), facing), RegBlocks.block_lancashire, 0))
																		
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-2, 0, -7), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-1, 0, -7), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(0, 0, -7), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(1, 0, -7), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(2, 0, -7), facing), RegBlocks.block_lancashire, 0))
					
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-2, 0, -8), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-1, 0, -8), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(0, 0, -8), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(1, 0, -8), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(2, 0, -8), facing), RegBlocks.block_lancashire, 0))
								
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-2, 0, -9), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-1, 0, -9), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(0, 0, -9), facing), RegBlocks.block_lancashire, 3))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(1, 0, -9), facing), RegBlocks.block_lancashire, 0))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(2, 0, -9), facing), RegBlocks.block_lancashire, 0))	

		//round 1
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-1, 1, 0), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(0, 1, 0), facing), RegBlocks.block_lancashire, 2))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(1, 1, 0), facing), RegBlocks.block_lancashire, 1))

		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-1, 1, -1), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(0, 1, -1), facing), RegBlocks.block_lancashire, 2))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(1, 1, -1), facing), RegBlocks.block_lancashire, 1))

		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-1, 1, -2), facing), RegBlocks.block_lancashire, 4))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(0, 1, -2), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(1, 1, -2), facing), RegBlocks.block_lancashire, 1))

		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-1, 1, -3), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(0, 1, -3), facing), RegBlocks.block_lancashire, 2))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(1, 1, -3), facing), RegBlocks.block_lancashire, 1))

		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-1, 1, -4), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(0, 1, -4), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(1, 1, -4), facing), RegBlocks.block_lancashire, 1))

		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-1, 1, -5), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(0, 1, -5), facing), RegBlocks.block_lancashire, 2))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(1, 1, -5), facing), RegBlocks.block_lancashire, 1))

		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-1, 1, -6), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(0, 1, -6), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(1, 1, -6), facing), RegBlocks.block_lancashire, 1))

		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-1, 1, -7), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(0, 1, -7), facing), RegBlocks.block_lancashire, 2))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(1, 1, -7), facing), RegBlocks.block_lancashire, 1))

		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(-1, 1, -8), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(0, 1, -8), facing), RegBlocks.block_lancashire, 1))
		if (Helper_Machine.isBlockMeta(worldObj, Helper_Machine.rotateBlockPos(pos.add(1, 1, -8), facing), RegBlocks.block_lancashire, 1))
			
		return true;	
		return false;
	}
	
	protected boolean activateStructure ()
	{
		//round -2
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-2, -2, 0), facing), LANCASHIRE_MetaStatePart.BRICK_BOTLEFT))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-1, -2, 0), facing), LANCASHIRE_MetaStatePart.BRICK_BOT))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(0, -2, 0), facing), LANCASHIRE_MetaStatePart.VALVE_MUD_CLOSED))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(1, -2, 0), facing), LANCASHIRE_MetaStatePart.BRICK_BOT))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(2, -2, 0), facing), LANCASHIRE_MetaStatePart.BRICK_BOTRIGHT))

		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-2, -2, -1), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))	
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-1, -2, -1), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(0, -2, -1), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(1, -2, -1), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(2, -2, -1), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
			
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-2, -2, -2), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))	
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-1, -2, -2), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(0, -2, -2), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(1, -2, -2), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(2, -2, -2), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))	
		
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-2, -2, -3), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))	
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-1, -2, -3), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(0, -2, -3), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(1, -2, -3), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(2, -2, -3), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
							
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-2, -2, -4), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))	
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-1, -2, -4), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(0, -2, -4), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(1, -2, -4), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(2, -2, -4), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
									
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-2, -2, -5), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))	
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-1, -2, -5), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(0, -2, -5), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(1, -2, -5), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(2, -2, -5), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
											
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-2, -2, -6), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))	
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-1, -2, -6), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(0, -2, -6), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(1, -2, -6), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(2, -2, -6), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
											
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-2, -2, -7), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))	
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-1, -2, -7), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(0, -2, -7), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(1, -2, -7), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(2, -2, -7), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
															
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-2, -2, -8), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))	
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-1, -2, -8), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(0, -2, -8), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(1, -2, -8), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(2, -2, -8), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
																	
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-2, -2, -9), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))	
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-1, -2, -9), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(0, -2, -9), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(1, -2, -9), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(2, -2, -9), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
			
		//round -1
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-2, -1, 0), facing), LANCASHIRE_MetaStatePart.BRICK_LEFT))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-1, -1, 0), facing), LANCASHIRE_MetaStatePart.STEEL_BOTLEFT))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(0, -1, 0), facing), LANCASHIRE_MetaStatePart.ASH_CLOSED))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(1, -1, 0), facing), LANCASHIRE_MetaStatePart.STEEL_BOTRIGHT))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(2, -1, 0), facing), LANCASHIRE_MetaStatePart.BRICK_RIGHT))

		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-2, -1, -1), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))	
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-1, -1, -1), facing), LANCASHIRE_MetaStatePart.STEEL_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(0, -1, -1), facing), LANCASHIRE_MetaStatePart.STEEL_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(1, -1, -1), facing), LANCASHIRE_MetaStatePart.STEEL_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(2, -1, -1), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
					
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-2, -1, -2), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))	
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-1, -1, -2), facing), LANCASHIRE_MetaStatePart.STEEL_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(0, -1, -2), facing), LANCASHIRE_MetaStatePart.STEEL_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(1, -1, -2), facing), LANCASHIRE_MetaStatePart.STEEL_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(2, -1, -2), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))	
				
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-2, -1, -3), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))	
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-1, -1, -3), facing), LANCASHIRE_MetaStatePart.STEEL_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(0, -1, -3), facing), LANCASHIRE_MetaStatePart.STEEL_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(1, -1, -3), facing), LANCASHIRE_MetaStatePart.STEEL_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(2, -1, -3), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
									
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-2, -1, -4), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))	
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-1, -1, -4), facing), LANCASHIRE_MetaStatePart.STEEL_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(0, -1, -4), facing), LANCASHIRE_MetaStatePart.STEEL_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(1, -1, -4), facing), LANCASHIRE_MetaStatePart.STEEL_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(2, -1, -4), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
									
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-2, -1, -5), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))	
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-1, -1, -5), facing), LANCASHIRE_MetaStatePart.STEEL_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(0, -1, -5), facing), LANCASHIRE_MetaStatePart.STEEL_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(1, -1, -5), facing), LANCASHIRE_MetaStatePart.STEEL_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(2, -1, -5), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
													
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-2, -1, -6), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))	
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-1, -1, -6), facing), LANCASHIRE_MetaStatePart.STEEL_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(0, -1, -6), facing), LANCASHIRE_MetaStatePart.STEEL_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(1, -1, -6), facing), LANCASHIRE_MetaStatePart.STEEL_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(2, -1, -6), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
													
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-2, -1, -7), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))	
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-1, -1, -7), facing), LANCASHIRE_MetaStatePart.STEEL_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(0, -1, -7), facing), LANCASHIRE_MetaStatePart.STEEL_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(1, -1, -7), facing), LANCASHIRE_MetaStatePart.STEEL_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(2, -1, -7), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
															
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-2, -1, -8), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))	
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-1, -1, -8), facing), LANCASHIRE_MetaStatePart.STEEL_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(0, -1, -8), facing), LANCASHIRE_MetaStatePart.STEEL_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(1, -1, -8), facing), LANCASHIRE_MetaStatePart.STEEL_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(2, -1, -8), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
																			
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-2, -1, -9), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))	
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-1, -1, -9), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(0, -1, -9), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(1, -1, -9), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(2, -1, -9), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
				
		//round 0
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-2, 0, 0), facing), LANCASHIRE_MetaStatePart.BRICK_LEFT))
		//if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-1, 0, 0), facing), LANCASHIRE_MetaStatePart.))
		//if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(1, 0, 0), facing), LANCASHIRE_MetaStatePart.))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(2, 0, 0), facing), LANCASHIRE_MetaStatePart.BRICK_RIGHT))

		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-2, 0, -1), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))	
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-1, 0, -1), facing), LANCASHIRE_MetaStatePart.STEEL_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(0, 0, -1), facing), LANCASHIRE_MetaStatePart.STEEL_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(1, 0, -1), facing), LANCASHIRE_MetaStatePart.STEEL_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(2, 0, -1), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
						
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-2, 0, -2), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))	
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-1, 0, -2), facing), LANCASHIRE_MetaStatePart.STEEL_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(0, 0, -2), facing), LANCASHIRE_MetaStatePart.STEEL_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(1, 0, -2), facing), LANCASHIRE_MetaStatePart.STEEL_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(2, 0, -2), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))	
					
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-2, 0, -3), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))	
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-1, 0, -3), facing), LANCASHIRE_MetaStatePart.STEEL_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(0, 0, -3), facing), LANCASHIRE_MetaStatePart.STEEL_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(1, 0, -3), facing), LANCASHIRE_MetaStatePart.STEEL_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(2, 0, -3), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
										
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-2, 0, -4), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))	
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-1, 0, -4), facing), LANCASHIRE_MetaStatePart.STEEL_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(0, 0, -4), facing), LANCASHIRE_MetaStatePart.STEEL_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(1, 0, -4), facing), LANCASHIRE_MetaStatePart.STEEL_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(2, 0, -4), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
										
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-2, 0, -5), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))	
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-1, 0, -5), facing), LANCASHIRE_MetaStatePart.STEEL_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(0, 0, -5), facing), LANCASHIRE_MetaStatePart.STEEL_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(1, 0, -5), facing), LANCASHIRE_MetaStatePart.STEEL_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(2, 0, -5), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
														
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-2, 0, -6), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))	
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-1, 0, -6), facing), LANCASHIRE_MetaStatePart.STEEL_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(0, 0, -6), facing), LANCASHIRE_MetaStatePart.STEEL_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(1, 0, -6), facing), LANCASHIRE_MetaStatePart.STEEL_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(2, 0, -6), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
														
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-2, 0, -7), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))	
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-1, 0, -7), facing), LANCASHIRE_MetaStatePart.STEEL_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(0, 0, -7), facing), LANCASHIRE_MetaStatePart.STEEL_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(1, 0, -7), facing), LANCASHIRE_MetaStatePart.STEEL_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(2, 0, -7), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
																
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-2, 0, -8), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))	
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-1, 0, -8), facing), LANCASHIRE_MetaStatePart.STEEL_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(0, 0, -8), facing), LANCASHIRE_MetaStatePart.STEEL_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(1, 0, -8), facing), LANCASHIRE_MetaStatePart.STEEL_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(2, 0, -8), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
																				
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-2, 0, -9), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))	
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-1, 0, -9), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(0, 0, -9), facing), LANCASHIRE_MetaStatePart.CHIMNEY))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(1, 0, -9), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(2, 0, -9), facing), LANCASHIRE_MetaStatePart.BRICK_BLOCK))
			
		//round 1
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-1, 1, 0), facing), LANCASHIRE_MetaStatePart.STEEL_TOPLEFT))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(0, 1, 0), facing), LANCASHIRE_MetaStatePart.VALVE_WATER_CLOSED))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(1, 1, 0), facing), LANCASHIRE_MetaStatePart.STEEL_TOPRIGHT))

		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-1, 1, -1), facing), LANCASHIRE_MetaStatePart.STEEL_TOPLEFT))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(0, 1, -1), facing), LANCASHIRE_MetaStatePart.VALVE_STEAM_CLOSED))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(1, 1, -1), facing), LANCASHIRE_MetaStatePart.STEEL_TOPRIGHT))
	
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-1, 1, -2), facing), LANCASHIRE_MetaStatePart.MAINTENANCE_CLOSED))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(0, 1, -2), facing), LANCASHIRE_MetaStatePart.STEEL_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(1, 1, -2), facing), LANCASHIRE_MetaStatePart.STEEL_TOPRIGHT))

		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-1, 1, -3), facing), LANCASHIRE_MetaStatePart.STEEL_TOPLEFT))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(0, 1, -3), facing), LANCASHIRE_MetaStatePart.VALVE_STEAM_CLOSED))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(1, 1, -3), facing), LANCASHIRE_MetaStatePart.STEEL_TOPRIGHT))

		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-1, 1, -4), facing), LANCASHIRE_MetaStatePart.STEEL_TOPLEFT))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(0, 1, -4), facing), LANCASHIRE_MetaStatePart.STEEL_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(1, 1, -4), facing), LANCASHIRE_MetaStatePart.STEEL_TOPRIGHT))

		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-1, 1, -5), facing), LANCASHIRE_MetaStatePart.STEEL_TOPLEFT))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(0, 1, -5), facing), LANCASHIRE_MetaStatePart.VALVE_STEAM_CLOSED))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(1, 1, -5), facing), LANCASHIRE_MetaStatePart.STEEL_TOPRIGHT))

		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-1, 1, -6), facing), LANCASHIRE_MetaStatePart.STEEL_TOPLEFT))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(0, 1, -6), facing), LANCASHIRE_MetaStatePart.STEEL_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(1, 1, -6), facing), LANCASHIRE_MetaStatePart.STEEL_TOPRIGHT))

		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-1, 1, -7), facing), LANCASHIRE_MetaStatePart.STEEL_TOPLEFT))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(0, 1, -7), facing), LANCASHIRE_MetaStatePart.VALVE_STEAM_CLOSED))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(1, 1, -7), facing), LANCASHIRE_MetaStatePart.STEEL_TOPRIGHT))
															
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(-1, 1, -8), facing), LANCASHIRE_MetaStatePart.STEEL_TOPLEFT))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(0, 1, -8), facing), LANCASHIRE_MetaStatePart.STEEL_BLOCK))
		if (transformBlock (Helper_Machine.rotateBlockPos(pos.add(1, 1, -8), facing), LANCASHIRE_MetaStatePart.STEEL_TOPRIGHT))
																				
			
		{
			markDirty();
			return true;
		}
			

		
		Helper_Log.error("Error assembling multiblock @ " + pos + "please report to gitHub");
		return false;
	}
	
	protected boolean transformBlock (BlockPos pos, LANCASHIRE_MetaStatePart msp)
	{
		TileEntity tileEntity = worldObj.getTileEntity(pos);
		if (tileEntity == null) return false; 
		if (tileEntity instanceof TE_Lancashire)
		{
			((TE_Lancashire) tileEntity).setState(msp.state);
			((TE_Lancashire) tileEntity).setPart(msp.part);
			return true;
		}
		return false;
	}
	
	protected enum LANCASHIRE_MetaStatePart
	{
		BRICK_BLOCK 		(0, 1, 0),
		BRICK_BOT 			(0, 2, 0),
		BRICK_BOTLEFT 		(0, 3, 0),
		BRICK_BOTRIGHT 		(0, 4, 0),
		BRICK_LEFT 			(0, 5, 0),
		BRICK_RIGHT 		(0, 6, 0),
		STEEL_BLOCK 		(1, 7, 0),
		STEEL_BOTLEFT 		(1, 8, 0),
		STEEL_BOTRIGHT		(1, 9, 0),
		STEEL_TOPLEFT 		(1, 10, 0),
		STEEL_TOPRIGHT 		(1, 11, 0),
		VALVE_MUD	 		(2, 12, 0),
		VALVE_MUD_CLOSED	(2, 12, 2),
		VALVE_STEAM	 		(2, 13, 0),
		VALVE_STEAM_CLOSED	(2, 13, 1),
		VALVE_WATER	 		(2, 14, 0),
		VALVE_WATER_CLOSED	(2, 14, 1),
		CHIMNEY				(3, 0, 0),
		MAINTENANCE			(4, 0, 4),
		MAINTENANCE_CLOSED	(4, 0, 3),
		ASH					(5, 0, 6),
		ASH_CLOSED			(5, 0, 5),
		CENTRAL				(6, 0, 0)
				
		;
		int meta;
		int state;
		int part;
		
		private LANCASHIRE_MetaStatePart (int meta, int state, int part)
		{
			this.meta = meta;
			this.state = state;
			this.part = part;			
		}
	}
}