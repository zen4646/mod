
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gochiken.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.gochiken.world.inventory.RootGUIMenu;
import net.mcreator.gochiken.world.inventory.Layerlv1GUIMenu;
import net.mcreator.gochiken.world.inventory.Growerlv1Menu;
import net.mcreator.gochiken.world.inventory.BreederGUIMenu;
import net.mcreator.gochiken.GochikenMod;

public class GochikenModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, GochikenMod.MODID);
	public static final RegistryObject<MenuType<Growerlv1Menu>> GROWERLV_1 = REGISTRY.register("growerlv_1", () -> IForgeMenuType.create(Growerlv1Menu::new));
	public static final RegistryObject<MenuType<RootGUIMenu>> ROOT_GUI = REGISTRY.register("root_gui", () -> IForgeMenuType.create(RootGUIMenu::new));
	public static final RegistryObject<MenuType<Layerlv1GUIMenu>> LAYERLV_1_GUI = REGISTRY.register("layerlv_1_gui", () -> IForgeMenuType.create(Layerlv1GUIMenu::new));
	public static final RegistryObject<MenuType<BreederGUIMenu>> BREEDER_GUI = REGISTRY.register("breeder_gui", () -> IForgeMenuType.create(BreederGUIMenu::new));
}
