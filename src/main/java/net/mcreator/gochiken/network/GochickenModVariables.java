package net.mcreator.gochiken.network;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class GochickenModVariables {
	public static String suraimu0119 = "suraimu0119";
	public static String rio1339 = "rio1339";
	public static String Rebecca1339 = "Rebecca1339";
	public static double SeedMaker = 0;

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
	}
}
