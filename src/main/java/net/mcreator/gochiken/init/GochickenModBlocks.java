
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gochiken.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.gochiken.block.SeedMarkerBlock;
import net.mcreator.gochiken.block.RoostBlock;
import net.mcreator.gochiken.block.PeiHeJiBlock;
import net.mcreator.gochiken.block.CompressorBlock;
import net.mcreator.gochiken.block.BreederBlock;
import net.mcreator.gochiken.GochickenMod;

public class GochickenModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, GochickenMod.MODID);
	public static final RegistryObject<Block> ROOST = REGISTRY.register("roost", () -> new RoostBlock());
	public static final RegistryObject<Block> BREEDER = REGISTRY.register("breeder", () -> new BreederBlock());
	public static final RegistryObject<Block> PEI_HE_JI = REGISTRY.register("pei_he_ji", () -> new PeiHeJiBlock());
	public static final RegistryObject<Block> SEED_MARKER = REGISTRY.register("seed_marker", () -> new SeedMarkerBlock());
	public static final RegistryObject<Block> COMPRESSOR = REGISTRY.register("compressor", () -> new CompressorBlock());
}
