
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gochiken.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.gochiken.block.Layer1Block;
import net.mcreator.gochiken.block.GorwerLv1Block;
import net.mcreator.gochiken.GochikenMod;

public class GochikenModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, GochikenMod.MODID);
	public static final RegistryObject<Block> ROOT = REGISTRY.register("root", () -> new RootBlock());
	public static final RegistryObject<Block> GORWER_LV_1 = REGISTRY.register("gorwer_lv_1", () -> new GorwerLv1Block());
	public static final RegistryObject<Block> LAYER_1 = REGISTRY.register("layer_1", () -> new Layer1Block());
}
