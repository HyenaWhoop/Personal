package com.biskitwythtee.Test1.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init() {
		
		GameRegistry.addSmelting(Items.REDSTONE, new ItemStack(ModItems.ACTIVATED_REDSTONE, 1), 1.5F);
	}
}
