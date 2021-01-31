package delta.harrytalks;

import delta.harrytalks.proxy.CommonProxy;
import delta.harrytalks.tab.TutorialTab;
import delta.harrytalks.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.Mod;

@Mod(
		modid = Reference.MOD_ID,
		name = Reference.MOD_NAME,
		version = Reference.VERSION
)
public class TutorialMod {

	@Mod.Instance(Reference.MOD_ID)
	public static TutorialMod INSTANCE;

	public static final CreativeTabs TutorialTab = new TutorialTab("tutorialtab");

	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
	public static CommonProxy proxy;

	@Mod.EventHandler
	public void preinit(FMLPreInitializationEvent event) {

	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {

	}

	@Mod.EventHandler
	public void postinit(FMLPostInitializationEvent event) {

	}
}
