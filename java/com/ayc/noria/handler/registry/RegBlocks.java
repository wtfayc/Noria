package com.ayc.noria.handler.registry;

import com.ayc.noria.block.test_block;
import com.ayc.noria.block.test_block2;
import com.ayc.noria.block.nature.Block_CeramicJar;
import com.ayc.noria.block.nature.Block_ScorchedWood;
import com.ayc.noria.block.nature.Block_Treetap;
import com.ayc.noria.block.water.Block_Canal;
import com.ayc.noria.item.Noria_ItemBlock;
import com.ayc.noria.utility.list.Noria_Blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RegBlocks {

	public static final Block block_test = new test_block();
	public static final ItemBlock iblock_test = new Noria_ItemBlock(block_test);
	public static final Block block_test2 = new test_block2();
	public static final ItemBlock iblock_test2 = new Noria_ItemBlock(block_test2);
	public static final Block block_canal = new Block_Canal();
	public static final ItemBlock iblock_canal = new Noria_ItemBlock(block_canal);
	public static final Block block_ceramicjar = new Block_CeramicJar();
	public static final ItemBlock iblock_ceramicjar = new Noria_ItemBlock(block_ceramicjar);
	public static final Block block_scorchedwood = new Block_ScorchedWood();
	public static final ItemBlock iblock_scorchedwood = new Noria_ItemBlock(block_scorchedwood);
	public static final Block block_treetap = new Block_Treetap();
	public static final ItemBlock iblock_treetap = new Noria_ItemBlock(block_treetap);
	
	public static void preInit()
	{
		GameRegistry.register(block_test);
		GameRegistry.register(iblock_test.setRegistryName(Noria_Blocks.TEST.nameItemBlock));
		GameRegistry.register(block_test2);
		GameRegistry.register(iblock_test2.setRegistryName(Noria_Blocks.TEST2.nameItemBlock));
		GameRegistry.register(block_canal);
		GameRegistry.register(iblock_canal.setRegistryName(Noria_Blocks.CANAL.nameItemBlock));
		GameRegistry.register(block_ceramicjar);
		GameRegistry.register(iblock_ceramicjar.setRegistryName(Noria_Blocks.CERAMICJAR.nameItemBlock));
		GameRegistry.register(block_scorchedwood);
		GameRegistry.register(iblock_scorchedwood.setRegistryName(Noria_Blocks.SCORCHEDWOOD.nameItemBlock));
		GameRegistry.register(block_treetap);
		GameRegistry.register(iblock_treetap.setRegistryName(Noria_Blocks.TREETAP.nameItemBlock));
	}
	
}