
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gochiken.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.gochiken.block.entity.SeedMarkerBlockEntity;
import net.mcreator.gochiken.block.entity.RoostBlockEntity;
import net.mcreator.gochiken.block.entity.PeiHeJiBlockEntity;
import net.mcreator.gochiken.block.entity.CompressorBlockEntity;
import net.mcreator.gochiken.block.entity.BreederBlockEntity;
import net.mcreator.gochiken.GochickenMod;

public class GochickenModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, GochickenMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> ROOST = register("roost", GochickenModBlocks.ROOST, RoostBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BREEDER = register("breeder", GochickenModBlocks.BREEDER, BreederBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PEI_HE_JI = register("pei_he_ji", GochickenModBlocks.PEI_HE_JI, PeiHeJiBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SEED_MARKER = register("seed_marker", GochickenModBlocks.SEED_MARKER, SeedMarkerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> COMPRESSOR = register("compressor", GochickenModBlocks.COMPRESSOR, CompressorBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
