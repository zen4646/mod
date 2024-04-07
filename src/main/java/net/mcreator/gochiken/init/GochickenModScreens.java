
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gochiken.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.gochiken.client.gui.SeedMakerGUIScreen;
import net.mcreator.gochiken.client.gui.RootGUIScreen;
import net.mcreator.gochiken.client.gui.HPeiHeJiScreen;
import net.mcreator.gochiken.client.gui.CompressorGUIScreen;
import net.mcreator.gochiken.client.gui.BreederGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class GochickenModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(GochickenModMenus.ROOT_GUI.get(), RootGUIScreen::new);
			MenuScreens.register(GochickenModMenus.BREEDER_GUI.get(), BreederGUIScreen::new);
			MenuScreens.register(GochickenModMenus.H_PEI_HE_JI.get(), HPeiHeJiScreen::new);
			MenuScreens.register(GochickenModMenus.COMPRESSOR_GUI.get(), CompressorGUIScreen::new);
			MenuScreens.register(GochickenModMenus.SEED_MAKER_GUI.get(), SeedMakerGUIScreen::new);
		});
	}
}
