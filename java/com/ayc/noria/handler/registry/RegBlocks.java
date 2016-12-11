package com.ayc.noria.handler.registry;

import com.ayc.noria.block.nature.Block_CeramicJar;
import com.ayc.noria.block.nature.Block_DebarkedWood;
import com.ayc.noria.block.nature.Block_Treetap;
import com.ayc.noria.block.rotary.Block_RotaryMachine;
import com.ayc.noria.block.rotary.Block_StaticMachine;
import com.ayc.noria.block.rotary.Block_WoodPart;
import com.ayc.noria.block.water.Block_Canal;
import com.ayc.noria.block.water.Block_Noria;
import com.ayc.noria.item.Noria_ItemBlock;
import com.ayc.noria.utility.list.Noria_Blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RegBlocks {

	public static final Block block_noria = new Block_Noria();
	public static final ItemBlock iblock_noria = new Noria_ItemBlock(block_noria);
	public static final Block block_canal = new Block_Canal();
	public static final ItemBlock iblock_canal = new Noria_ItemBlock(block_canal);
	
	public static final Block block_rotarymachine = new Block_RotaryMachine();
	public static final ItemBlock iblock_rotarymachine = new Noria_ItemBlock(block_rotarymachine);
	public static final Block block_staticmachine = new Block_StaticMachine();
	public static final ItemBlock iblock_staticmachine = new Noria_ItemBlock(block_staticmachine);
	public static final Block block_woodpart = new Block_WoodPart();
	public static final ItemBlock iblock_woodpart = new Noria_ItemBlock(block_woodpart);
	
	public static final Block block_ceramicjar = new Block_CeramicJar();
	public static final ItemBlock iblock_ceramicjar = new Noria_ItemBlock(block_ceramicjar);
	public static final Block block_debarkedwood = new Block_DebarkedWood();
	public static final ItemBlock iblock_debarkedwood = new Noria_ItemBlock(block_debarkedwood);
	public static final Block block_treetap = new Block_Treetap();
	public static final ItemBlock iblock_treetap = new Noria_ItemBlock(block_treetap);
	
	public static void preInit()
	{
		GameRegistry.register(block_noria);
		GameRegistry.register(iblock_noria.setRegistryName(Noria_Blocks.NORIA.nameItemBlock));
		GameRegistry.register(block_canal);
		GameRegistry.register(iblock_canal.setRegistryName(Noria_Blocks.CANAL.nameItemBlock));
		
		GameRegistry.register(block_rotarymachine);
		GameRegistry.register(iblock_rotarymachine.setRegistryName(Noria_Blocks.ROTARYMACHINE.nameItemBlock));
		GameRegistry.register(block_staticmachine);
		GameRegistry.register(iblock_staticmachine.setRegistryName(Noria_Blocks.STATICMACHINE.nameItemBlock));
		GameRegistry.register(block_woodpart);
		GameRegistry.register(iblock_woodpart.setRegistryName(Noria_Blocks.WOODPART.nameItemBlock));
		
		GameRegistry.register(block_ceramicjar);
		GameRegistry.register(iblock_ceramicjar.setRegistryName(Noria_Blocks.CERAMICJAR.nameItemBlock));
		GameRegistry.register(block_debarkedwood);
		GameRegistry.register(iblock_debarkedwood.setRegistryName(Noria_Blocks.DEBARKEDWOOD.nameItemBlock));
		GameRegistry.register(block_treetap);
		GameRegistry.register(iblock_treetap.setRegistryName(Noria_Blocks.TREETAP.nameItemBlock));
	}
	
}