package com.biskitwythtee.Test1.init;

import java.util.ArrayList;
import java.util.List;

import com.biskitwythtee.Test1.Items.ItemBase;
import com.biskitwythtee.Test1.Items.armor.ArmorBase;
import com.biskitwythtee.Test1.Items.tools.ToolAxe;
import com.biskitwythtee.Test1.Items.tools.ToolHoe;
import com.biskitwythtee.Test1.Items.tools.ToolPickaxe;
import com.biskitwythtee.Test1.Items.tools.ToolSpade;
import com.biskitwythtee.Test1.Items.tools.ToolSword;
import com.biskitwythtee.Test1.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_REDSTONE_INGOT = EnumHelper.addToolMaterial("material_redstone_ingot", 2, 750, 7.0F, 2.5F, 12);
	public static final ArmorMaterial ARMOR_MATERIAL_REDSTONE_INGOT = EnumHelper.addArmorMaterial("armor_material_redstone_ingot", Reference.MOD_ID + ":redstone_ingot", 14, new int[] {2, 5, 7, 3}, 0, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);

	//Items
	public static final Item REDSTONE_INGOT = new ItemBase("redstone_ingot");
	public static final Item ACTIVATED_REDSTONE = new ItemBase("activated_redstone");
	
	//Tools
	public static final ItemSword REDSTONE_INGOT_SWORD = new ToolSword("redstone_ingot_sword", MATERIAL_REDSTONE_INGOT);
	public static final ItemSpade REDSTONE_INGOT_SHOVEL = new ToolSpade("redstone_ingot_shovel", MATERIAL_REDSTONE_INGOT);
	public static final ItemPickaxe REDSTONE_INGOT_PICKAXE = new ToolPickaxe("redstone_ingot_pickaxe", MATERIAL_REDSTONE_INGOT);
	public static final ItemAxe REDSTONE_INGOT_AXE = new ToolAxe("redstone_ingot_axe", MATERIAL_REDSTONE_INGOT);
	public static final ItemHoe REDSTONE_INGOT_HOE = new ToolHoe("redstone_ingot_hoe", MATERIAL_REDSTONE_INGOT);

	//Armor
	public static final Item REDSTONE_INGOT_HELMET = new ArmorBase("redstone_ingot_helmet", ARMOR_MATERIAL_REDSTONE_INGOT, 1, EntityEquipmentSlot.HEAD);
	public static final Item REDSTONE_INGOT_CHESTPLATE = new ArmorBase("redstone_ingot_chestplate", ARMOR_MATERIAL_REDSTONE_INGOT, 1, EntityEquipmentSlot.CHEST);
	public static final Item REDSTONE_INGOT_LEGGINGS = new ArmorBase("redstone_ingot_leggings", ARMOR_MATERIAL_REDSTONE_INGOT, 2, EntityEquipmentSlot.LEGS);
	public static final Item REDSTONE_INGOT_BOOTS = new ArmorBase("redstone_ingot_boots", ARMOR_MATERIAL_REDSTONE_INGOT, 1, EntityEquipmentSlot.FEET);

}
