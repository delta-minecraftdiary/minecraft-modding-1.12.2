package delta.harrytalks;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(
		modid = TutorialMod.MOD_ID,
		name = TutorialMod.MOD_NAME,
		version = TutorialMod.VERSION
)
public class TutorialMod {

	public static final String MOD_ID = "HarryTalks";
	public static final String MOD_NAME = "TutorialMod";
	public static final String VERSION = "1.0";

	@Mod.Instance(MOD_ID)
	public static TutorialMod INSTANCE;

	@Mod.EventHandler
	public void preinit(FMLPreInitializationEvent event) {

	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {

	}

	@Mod.EventHandler
	public void postinit(FMLPostInitializationEvent event) {

	}

	@GameRegistry.ObjectHolder(MOD_ID)
	public static class Blocks {

	}

	@GameRegistry.ObjectHolder(MOD_ID)
	public static class Items {

	}

	@Mod.EventBusSubscriber
	public static class ObjectRegistryHandler {
		@SubscribeEvent
		public static void addItems(RegistryEvent.Register<Item> event) {

		}

		@SubscribeEvent
		public static void addBlocks(RegistryEvent.Register<Block> event) {

		}
	}
}
