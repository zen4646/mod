
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gochiken.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.gochiken.client.gui.RootGUIScreen;
import net.mcreator.gochiken.client.gui.Layerlv1GUIScreen;
import net.mcreator.gochiken.client.gui.Growerlv1Screen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class GochikenModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(GochikenModMenus.GROWERLV_1.get(), Growerlv1Screen::new);
			MenuScreens.register(GochikenModMenus.ROOT_GUI.get(), RootGUIScreen::new);
			MenuScreens.register(GochikenModMenus.LAYERLV_1_GUI.get(), Layerlv1GUIScreen::new);
		});
	}
}
