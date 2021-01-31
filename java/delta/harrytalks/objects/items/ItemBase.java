package delta.harrytalks.objects.items;

import delta.harrytalks.TutorialMod;
import delta.harrytalks.init.ItemInit;
import delta.harrytalks.proxy.ClientProxy;
import delta.harrytalks.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
	public ItemBase(String name) {
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
