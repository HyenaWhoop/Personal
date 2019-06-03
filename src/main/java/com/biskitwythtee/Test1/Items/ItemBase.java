package com.biskitwythtee.Test1.Items;

import com.biskitwythtee.Test1.Main;
import com.biskitwythtee.Test1.init.ModItems;
import com.biskitwythtee.Test1.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.REDSTONE);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(this, 0, "Inventory");
	}

}
