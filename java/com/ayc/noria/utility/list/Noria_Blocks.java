package com.ayc.noria.utility.list;

import com.ayc.noria.handler.Noria_CreativeTabs;
import com.ayc.noria.utility.Reference_Static;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public enum Noria_Blocks {

	CANAL (Material.ROCK, "canal", "canal", 2.0F, 10.0F, Noria_CreativeTabs.NORIA_BASE_TAB, SoundType.STONE), //TODO Values
	TEST (Material.WOOD, "test", "test", 2.0F, 10.0F, Noria_CreativeTabs.NORIA_BASE_TAB, SoundType.WOOD),
	TEST2 (Material.WOOD, "test2", "test2", 2.0F, 10.0F, Noria_CreativeTabs.NORIA_BASE_TAB, SoundType.WOOD),
	
	;
	public Material material;
	public String name;
	public String nameUnlocalized;
	public String nameRegistry;
	public float hardness;
	public float resistance;
	public CreativeTabs creativeTabs;
	public SoundType soundType;
	public String nameItemBlock;
	
	private Noria_Blocks (Material material, String name, String nameUnlocalized, float hardness, float resistance, CreativeTabs creativeTabs, SoundType soundType)
	{
		this.material = material;
		this.name = name;
		this.nameUnlocalized = nameUnlocalized;
		this.nameRegistry = Reference_Static.MOD_ID + ":" + name;
		this.hardness = hardness;
		this.resistance = resistance;
		this.creativeTabs = creativeTabs;
		this.soundType = soundType;
		this.nameItemBlock = "ItemBlock_" + this.name;	
	}
}