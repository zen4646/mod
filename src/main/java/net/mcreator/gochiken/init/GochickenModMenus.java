
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gochiken.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.gochiken.world.inventory.SeedMakerGUIMenu;
import net.mcreator.gochiken.world.inventory.RootGUIMenu;
import net.mcreator.gochiken.world.inventory.HPeiHeJiMenu;
import net.mcreator.gochiken.world.inventory.CompressorGUIMenu;
import net.mcreator.gochiken.world.inventory.BreederGUIMenu;
import net.mcreator.gochiken.GochickenMod;

public class GochickenModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, GochickenMod.MODID);
	public static final RegistryObject<MenuType<Growerlv1Menu>> GROWERLV_1 = REGISTRY.register("growerlv_1", () -> IForgeMenuType.create(Growerlv1Menu::new));
	public static final RegistryObject<MenuType<RootGUIMenu>> ROOT_GUI = REGISTRY.register("root_gui", () -> IForgeMenuType.create(RootGUIMenu::new));
	public static final RegistryObject<MenuType<Layerlv1GUIMenu>> LAYERLV_1_GUI = REGISTRY.register("layerlv_1_gui", () -> IForgeMenuType.create(Layerlv1GUIMenu::new));
	public static final RegistryObject<MenuType<BreederGUIMenu>> BREEDER_GUI = REGISTRY.register("breeder_gui", () -> IForgeMenuType.create(BreederGUIMenu::new));
	public static final RegistryObject<MenuType<HPeiHeJiMenu>> H_PEI_HE_JI = REGISTRY.register("h_pei_he_ji", () -> IForgeMenuType.create(HPeiHeJiMenu::new));
	public static final RegistryObject<MenuType<CompressorGUIMenu>> COMPRESSOR_GUI = REGISTRY.register("compressor_gui", () -> IForgeMenuType.create(CompressorGUIMenu::new));
	public static final RegistryObject<MenuType<SeedMakerGUIMenu>> SEED_MAKER_GUI = REGISTRY.register("seed_maker_gui", () -> IForgeMenuType.create(SeedMakerGUIMenu::new));
}
