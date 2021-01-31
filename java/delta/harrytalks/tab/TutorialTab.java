package delta.harrytalks.tab;

import delta.harrytalks.init.BlockInit;
import delta.harrytalks.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TutorialTab extends CreativeTabs {
	public TutorialTab(String label) {
		super("tutorialtab");
	}

	@Override
	public ItemStack createIcon() {
		//return new ItemStack(Item.getItemFromBlock(BlockInit.COPPER_BLOCK));
		return new ItemStack(ItemInit.COPPER_INGOT);
	}
}
