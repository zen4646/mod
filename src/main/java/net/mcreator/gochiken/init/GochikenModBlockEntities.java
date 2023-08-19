
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gochiken.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.gochiken.block.entity.Layer1BlockEntity;
import net.mcreator.gochiken.block.entity.GorwerLv1BlockEntity;
import net.mcreator.gochiken.GochikenMod;

public class GochikenModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, GochikenMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> ROOT = register("root", GochikenModBlocks.ROOT, RootBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GORWER_LV_1 = register("gorwer_lv_1", GochikenModBlocks.GORWER_LV_1, GorwerLv1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> LAYER_1 = register("layer_1", GochikenModBlocks.LAYER_1, Layer1BlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
