package delta.harrytalks.init;

import delta.harrytalks.objects.armors.ArmorBase;
import delta.harrytalks.objects.items.ItemBase;
import delta.harrytalks.objects.tools.*;
import delta.harrytalks.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {
	public static final List<Item> ITEMS = new ArrayList<Item>();

	// materials
	public static final Item.ToolMaterial COPPER_TOOL = EnumHelper.addToolMaterial("copper_tool",2, 100, 5.0F, 1.5F, 5);
	public static final ItemArmor.ArmorMaterial COPPER_ARMOR = EnumHelper.addArmorMaterial("copper_armor",
			Reference.MOD_ID + ":copper", 13,
			new int[]{2, 5, 5, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

	// items
	public static final Item COPPER_INGOT = new ItemBase("copper_ingot");

	// tools
	public static final Item COPPER_AXE = new ToolAxe("copper_axe", COPPER_TOOL);
	public static final Item COPPER_HOE = new ToolHoe("copper_hoe", COPPER_TOOL);
	public static final Item COPPER_PICKAXE = new ToolPickaxe("copper_pickaxe", COPPER_TOOL);
	public static final Item COPPER_SHOVEL = new ToolShovel("copper_shovel", COPPER_TOOL);
	public static final Item COPPER_SWORD = new ToolSword("copper_sword", COPPER_TOOL);

	// armors
	public static final Item COPPER_BOOTS = new ArmorBase("copper_boots", COPPER_ARMOR, 1, EntityEquipmentSlot.FEET);
	public static final Item COPPER_CEHSTPLATE = new ArmorBase("copper_chestplate", COPPER_ARMOR, 1, EntityEquipmentSlot.CHEST);
	public static final Item COPPER_HELMET = new ArmorBase("copper_helmet", COPPER_ARMOR, 1, EntityEquipmentSlot.HEAD);
	public static final Item COPPER_LEGGINGS = new ArmorBase("copper_leggings", COPPER_ARMOR, 2, EntityEquipmentSlot.LEGS);
}
