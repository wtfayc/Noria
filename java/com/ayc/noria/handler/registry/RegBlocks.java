package com.ayc.noria.handler.registry;

import com.ayc.noria.block.test_block;
import com.ayc.noria.block.test_block2;
import com.ayc.noria.block.waterstuff.Block_Canal;
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
	
	public static void preInit()
	{
		GameRegistry.register(block_test);
		GameRegistry.register(iblock_test.setRegistryName(Noria_Blocks.TEST.nameItemBlock));
		GameRegistry.register(block_test2);
		GameRegistry.register(iblock_test2.setRegistryName(Noria_Blocks.TEST2.nameItemBlock));
		GameRegistry.register(block_canal);
		GameRegistry.register(iblock_canal.setRegistryName(Noria_Blocks.CANAL.nameItemBlock));
	}
	
}