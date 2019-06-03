package com.biskitwythtee.Test1.init;

import java.util.ArrayList;
import java.util.List;

import com.biskitwythtee.Test1.blocks.BlockBase;
import com.biskitwythtee.Test1.blocks.RedstoneIngotBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block REDSTONE_INGOT_BLOCK = new RedstoneIngotBlock("redstone_ingot_block", Material.IRON);
}
