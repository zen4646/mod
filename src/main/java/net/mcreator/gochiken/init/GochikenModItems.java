
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gochiken.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.gochiken.item.SandChokenItem;
import net.mcreator.gochiken.item.NetutoItem;
import net.mcreator.gochiken.item.LogChikenItem;
import net.mcreator.gochiken.item.GoItem;
import net.mcreator.gochiken.item.FlintChokenItem;
import net.mcreator.gochiken.item.CopperchickenkidItem;
import net.mcreator.gochiken.item.CopperchickenItem;
import net.mcreator.gochiken.item.BoneChikenItem;
import net.mcreator.gochiken.GochikenMod;

public class GochikenModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, GochikenMod.MODID);
	public static final RegistryObject<Item> GO = REGISTRY.register("go", () -> new GoItem());
	public static final RegistryObject<Item> NETUTO = REGISTRY.register("netuto", () -> new NetutoItem());
	public static final RegistryObject<Item> LOG_CHIKEN = REGISTRY.register("log_chiken", () -> new LogChikenItem());
	public static final RegistryObject<Item> FLINT_CHOKEN = REGISTRY.register("flint_choken", () -> new FlintChokenItem());
	public static final RegistryObject<Item> SAND_CHOKEN = REGISTRY.register("sand_choken", () -> new SandChokenItem());
	public static final RegistryObject<Item> BONE_CHIKEN = REGISTRY.register("bone_chiken", () -> new BoneChikenItem());
	public static final RegistryObject<Item> ROOT = block(GochikenModBlocks.ROOT, GochikenModTabs.TAB_GO_CHIKEN);
	public static final RegistryObject<Item> COPPERCHICKEN = REGISTRY.register("copperchicken", () -> new CopperchickenItem());
	public static final RegistryObject<Item> COPPERCHICKENKID = REGISTRY.register("copperchickenkid", () -> new CopperchickenkidItem());
	public static final RegistryObject<Item> GORWER_LV_1 = block(GochikenModBlocks.GORWER_LV_1, GochikenModTabs.TAB_GO_CHIKEN);
	public static final RegistryObject<Item> LAYER_1 = block(GochikenModBlocks.LAYER_1, GochikenModTabs.TAB_GO_CHIKEN);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
