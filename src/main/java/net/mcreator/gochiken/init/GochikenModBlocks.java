
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gochiken.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.gochiken.block.RootBlock;
import net.mcreator.gochiken.GochikenMod;

public class GochikenModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, GochikenMod.MODID);
	public static final RegistryObject<Block> ROOT = REGISTRY.register("root", () -> new RootBlock());
}
