package delta.harrytalks.objects.tools;

import delta.harrytalks.TutorialMod;
import delta.harrytalks.init.ItemInit;
import delta.harrytalks.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class ToolShovel extends ItemSpade implements IHasModel {
	public ToolShovel(String name, ToolMaterial material) {
		super(material);
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
