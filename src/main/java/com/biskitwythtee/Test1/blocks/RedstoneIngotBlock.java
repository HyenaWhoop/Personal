package com.biskitwythtee.Test1.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class RedstoneIngotBlock extends BlockBase {

	public RedstoneIngotBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(9.0F);
		setLightOpacity(0);
		//setBlockUnbreakable();
	}

}
