package com.ayc.noria.tileentity.heat.lancashire;

import com.ayc.noria.handler.registry.RegBlocks;
import com.ayc.noria.utility.Helper_Machine;

import net.minecraft.block.Block;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;

public enum Lancashire {

	//round -2
	BLOCK0			(-2, -2, 0, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BOTLEFT),
	BLOCK1			(-1, -2, 0, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BOT),
	BLOCK2			(0, -2, 0, RegBlocks.block_lancashire, 2, LANCASHIRE_MSP.VALVE_MUD_CLOSED),
	BLOCK3			(1, -2, 0, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BOT),
	BLOCK4			(2, -2, 0, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BOTRIGHT),
	BLOCK5			(-2, -2, -1, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK6			(-1, -2, -1, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK7			(0, -2, -1, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK8			(1, -2, -1, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK9			(2, -2, -1, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK10			(-2, -2, -2, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK11			(-1, -2, -2, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK12			(0, -2, -2, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK13			(1, -2, -2, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK14			(2, -2, -2, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK15			(-2, -2, -3, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK16			(-1, -2, -3, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK17			(0, -2, -3, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK18			(1, -2, -3, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK19			(2, -2, -3, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK20			(-2, -2, -4, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK21			(-1, -2, -4, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK22			(0, -2, -4, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK23			(1, -2, -4, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK24			(2, -2, -4, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK25			(-2, -2, -5, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK26			(-1, -2, -5, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK27			(0, -2, -5, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK28			(1, -2, -5, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK29			(2, -2, -5, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK30			(-2, -2, -6, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK31			(-1, -2, -6, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK32			(0, -2, -6, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK33			(1, -2, -6, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK34			(2, -2, -6, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK35			(-2, -2, -7, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK36			(-1, -2, -7, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK37			(0, -2, -7, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK38			(1, -2, -7, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK39			(2, -2, -7, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK40			(-2, -2, -8, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK41			(-1, -2, -8, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK42			(0, -2, -8, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK43			(1, -2, -8, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK44			(2, -2, -8, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK45			(-2, -2, -9, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK46			(-1, -2, -9, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK47			(0, -2, -9, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK48			(1, -2, -9, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK49			(2, -2, -9, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	//round -1
	BLOCK50			(-2, -1, 0, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_LEFT),
	BLOCK51			(-1, -1, 0, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_BOTLEFT),
	BLOCK52			(0, -1, 0, RegBlocks.block_lancashire, 5, LANCASHIRE_MSP.ASH_CLOSED),
	BLOCK53			(1, -1, 0, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_BOTRIGHT),
	BLOCK54			(2, -1, 0, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_RIGHT),
	BLOCK55			(-2, -1, -1, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK56			(-1, -1, -1, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_BLOCK),
	BLOCK57			(0, -1, -1, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_BLOCK),
	BLOCK58			(1, -1, -1, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_BLOCK),
	BLOCK59			(2, -1, -1, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK60			(-2, -1, -2, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK61			(-1, -1, -2, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_BLOCK),
	BLOCK62			(0, -1, -2, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_BLOCK),
	BLOCK63			(1, -1, -2, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_BLOCK),
	BLOCK64			(2, -1, -2, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK65			(-2, -1, -3, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK66			(-1, -1, -3, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_BLOCK),
	BLOCK67			(0, -1, -3, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_BLOCK),
	BLOCK68			(1, -1, -3, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_BLOCK),
	BLOCK69			(2, -1, -3, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK70			(-2, -1, -4, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK71			(-1, -1, -4, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_BLOCK),
	BLOCK72			(0, -1, -4, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_BLOCK),
	BLOCK73			(1, -1, -4, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_BLOCK),
	BLOCK74			(2, -1, -4, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK75			(-2, -1, -5, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK76			(-1, -1, -5, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_BLOCK),
	BLOCK77			(0, -1, -5, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_BLOCK),
	BLOCK78			(1, -1, -5, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_BLOCK),
	BLOCK79			(2, -1, -5, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK80			(-2, -1, -6, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK81			(-1, -1, -6, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_BLOCK),
	BLOCK82			(0, -1, -6, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_BLOCK),
	BLOCK83			(1, -1, -6, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_BLOCK),
	BLOCK84			(2, -1, -6, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK85			(-2, -1, -7, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK86			(-1, -1, -7, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_BLOCK),
	BLOCK87			(0, -1, -7, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_BLOCK),
	BLOCK88			(1, -1, -7, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_BLOCK),
	BLOCK89			(2, -1, -7, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK90			(-2, -1, -8, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK91			(-1, -1, -8, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_BLOCK),
	BLOCK92			(0, -1, -8, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_BLOCK),
	BLOCK93			(1, -1, -8, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_BLOCK),
	BLOCK94			(2, -1, -8, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK95			(-2, -1, -9, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK96			(-1, -1, -9, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK97			(0, -1, -9, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK98			(1, -1, -9, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK99			(2, -1, -9, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	//round 0
	BLOCK100		(-2, 0, 0, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_LEFT),
	BLOCK101		(-1, 0, 0, RegBlocks.block_firebox, 2, LANCASHIRE_MSP.FIREBOX_CLOSED),
	BLOCK102		(0, 0, 0, RegBlocks.block_lancashire, 6, LANCASHIRE_MSP.CENTRAL_FULLCLOSED),
	BLOCK103		(1, 0, 0, RegBlocks.block_firebox, 2, LANCASHIRE_MSP.FIREBOX_CLOSED),
	BLOCK104		(2, 0, 0, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_RIGHT),
	BLOCK105		(-2, 0, -1, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK106		(-1, 0, -1, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_BLOCK),
	BLOCK107		(0, 0, -1, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_BLOCK),
	BLOCK108		(1, 0, -1, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_BLOCK),
	BLOCK109		(2, 0, -1, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK110		(-2, 0, -2, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK111		(-1, 0, -2, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_BLOCK),
	BLOCK112		(0, 0, -2, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_BLOCK),
	BLOCK113		(1, 0, -2, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_BLOCK),
	BLOCK114		(2, 0, -2, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK115		(-2, 0, -3, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK116		(-1, 0, -3, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_BLOCK),
	BLOCK117		(0, 0, -3, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_BLOCK),
	BLOCK118		(1, 0, -3, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_BLOCK),
	BLOCK119		(2, 0, -3, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK120		(-2, 0, -4, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK121		(-1, 0, -4, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_BLOCK),
	BLOCK122		(0, 0, -4, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_BLOCK),
	BLOCK123		(1, 0, -4, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_BLOCK),
	BLOCK124		(2, 0, -4, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK125		(-2, 0, -5, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK126		(-1, 0, -5, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_BLOCK),
	BLOCK127		(0, 0, -5, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_BLOCK),
	BLOCK128		(1, 0, -5, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_BLOCK),
	BLOCK129		(2, 0, -5, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK130		(-2, 0, -6, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK131		(-1, 0, -6, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_BLOCK),
	BLOCK132		(0, 0, -6, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_BLOCK),
	BLOCK133		(1, 0, -6, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_BLOCK),
	BLOCK134		(2, 0, -6, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK135		(-2, 0, -7, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK136		(-1, 0, -7, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_BLOCK),
	BLOCK137		(0, 0, -7, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_BLOCK),
	BLOCK138		(1, 0, -7, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_BLOCK),
	BLOCK139		(2, 0, -7, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK140		(-2, 0, -8, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK141		(-1, 0, -8, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_BLOCK),
	BLOCK142		(0, 0, -8, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_BLOCK),
	BLOCK143		(1, 0, -8, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_BLOCK),
	BLOCK144		(2, 0, -8, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK145		(-2, 0, -9, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK146		(-1, 0, -9, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK147		(0, 0, -9, RegBlocks.block_lancashire, 3, LANCASHIRE_MSP.CHIMNEY),
	BLOCK148		(1, 0, -9, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	BLOCK149		(2, 0, -9, RegBlocks.block_lancashire, 0, LANCASHIRE_MSP.BRICK_BLOCK),
	//round 1
	BLOCK150		(-1, 1, 0, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_TOPLEFT),
	BLOCK151		(0, 1, 0, RegBlocks.block_lancashire, 2, LANCASHIRE_MSP.VALVE_WATER_CLOSED),
	BLOCK152		(1, 1, 0, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_TOPRIGHT),
	BLOCK153		(-1, 1, -1, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_TOPLEFT),
	BLOCK154		(0, 1, -1, RegBlocks.block_lancashire, 2, LANCASHIRE_MSP.VALVE_STEAM_CLOSED),
	BLOCK155		(1, 1, -1, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_TOPRIGHT),
	BLOCK156		(-1, 1, -2, RegBlocks.block_lancashire, 4, LANCASHIRE_MSP.MAINTENANCE_CLOSED),
	BLOCK157		(0, 1, -2, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_BLOCK),
	BLOCK158		(1, 1, -2, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_TOPRIGHT),
	BLOCK159		(-1, 1, -3, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_TOPLEFT),
	BLOCK160		(0, 1, -3, RegBlocks.block_lancashire, 2, LANCASHIRE_MSP.VALVE_STEAM_CLOSED),
	BLOCK161		(1, 1, -3, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_TOPRIGHT),
	BLOCK162		(-1, 1, -4, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_TOPLEFT),
	BLOCK163		(0, 1, -4, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_BLOCK),
	BLOCK164		(1, 1, -4, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_TOPRIGHT),
	BLOCK165		(-1, 1, -5, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_TOPLEFT),
	BLOCK166		(0, 1, -5, RegBlocks.block_lancashire, 2, LANCASHIRE_MSP.VALVE_STEAM_CLOSED),
	BLOCK167		(1, 1, -5, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_TOPRIGHT),
	BLOCK168		(-1, 1, -6, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_TOPLEFT),
	BLOCK169		(0, 1, -6, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_BLOCK),
	BLOCK170		(1, 1, -6, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_TOPRIGHT),
	BLOCK171		(-1, 1, -7, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_TOPLEFT),
	BLOCK172		(0, 1, -7, RegBlocks.block_lancashire, 2, LANCASHIRE_MSP.VALVE_STEAM_CLOSED),
	BLOCK173		(1, 1, -7, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_TOPRIGHT),
	BLOCK174		(-1, 1, -8, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_TOPLEFT),
	BLOCK175		(0, 1, -8, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_BLOCK),
	BLOCK176		(1, 1, -8, RegBlocks.block_lancashire, 1, LANCASHIRE_MSP.STEEL_TOPRIGHT),
	;
	int xCoord;
	int yCoord;
	int zCoord;
	Block block;
	int meta;
	LANCASHIRE_MSP lancaMSP;
	
	private Lancashire (int xCoord, int yCoord, int zCoord, Block block, int meta, LANCASHIRE_MSP lancaMSP)
	{
		this.xCoord = xCoord;
		this.yCoord = yCoord;
		this.zCoord = zCoord;
		this.block = block;
		this.meta = meta;
		this.lancaMSP = lancaMSP;		
	}
	
	public static BlockPos giveRotatedPos (BlockPos pos, Lancashire lancashireEnum, EnumFacing facing)
	{
		BlockPos posRotated = Helper_Machine.rotateBlockPos(pos.add(lancashireEnum.xCoord, lancashireEnum.yCoord, lancashireEnum.zCoord), facing); 
		return posRotated;
	}
	
	public enum LANCASHIRE_MSP
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
		CENTRAL				(6, 0, 0),
		CENTRAL_FULLCLOSED	(6, 15, 7),
		FIREBOX				(2, 0, 2),
		FIREBOX_CLOSED		(2, 0, 1)
				
		;
		int meta;
		int state;
		int part;
		
		private LANCASHIRE_MSP (int meta, int state, int part)
		{
			this.meta = meta;
			this.state = state;
			this.part = part;			
		}
	}
}