package delta.harrytalks.objects.blocks;

import delta.harrytalks.TutorialMod;
import delta.harrytalks.init.BlockInit;
import delta.harrytalks.init.ItemInit;
import delta.harrytalks.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {
	public BlockBase(String name, Material material) {
		super(material);
		setTranslationKey(name);
		setRegistryName(name);
		setCreativeTab(TutorialMod.TutorialTab);

		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void RegisterModels() {
		TutorialMod.proxy.RegisterItemRederer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
