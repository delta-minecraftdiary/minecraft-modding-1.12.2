package delta.harrytalks.objects.armors;

import delta.harrytalks.TutorialMod;
import delta.harrytalks.init.ItemInit;
import delta.harrytalks.tab.TutorialTab;
import delta.harrytalks.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorBase extends ItemArmor implements IHasModel {
	public ArmorBase(String name, ItemArmor.ArmorMaterial material, int renderIndex,
					 EntityEquipmentSlot EquipmentSlot) {
		super(material, renderIndex, EquipmentSlot);
		setTranslationKey(name);
		setRegistryName(name);
		setCreativeTab(TutorialMod.TutorialTab);

		ItemInit.ITEMS.add(this);
	}

	@Override
	public void RegisterModels() {
		TutorialMod.proxy.RegisterItemRederer(this, 0, "inventory");
	}
}
