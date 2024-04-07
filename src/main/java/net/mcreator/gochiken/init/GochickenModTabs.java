
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gochiken.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.gochiken.GochickenMod;

public class GochickenModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GochickenMod.MODID);
	public static final RegistryObject<CreativeModeTab> GO_CHIKEN = REGISTRY.register("go_chiken",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.gochicken.go_chiken")).icon(() -> new ItemStack(GochickenModItems.GO.get())).displayItems((parameters, tabData) -> {
				tabData.accept(GochickenModItems.GO.get());
				tabData.accept(GochickenModItems.NETUTO.get());
				tabData.accept(GochickenModItems.LOG_CHIKEN.get());
				tabData.accept(GochickenModItems.FLINT_CHOKEN.get());
				tabData.accept(GochickenModItems.SAND_CHOKEN.get());
				tabData.accept(GochickenModItems.BONE_CHIKEN.get());
				tabData.accept(GochickenModItems.COPPERCHICKEN.get());
				tabData.accept(GochickenModItems.COPPERCHICKENKID.get());
				tabData.accept(GochickenModBlocks.LAYER_1.get().asItem());
				tabData.accept(GochickenModBlocks.ROOST.get().asItem());
				tabData.accept(GochickenModItems.LAPIS_CHIKEN.get());
				tabData.accept(GochickenModItems.INK_CHIKEN.get());
				tabData.accept(GochickenModItems.MAGENTA_CHIKEN.get());
				tabData.accept(GochickenModItems.LIME_CHIKEN.get());
				tabData.accept(GochickenModItems.YELLOW_CHIKEN.get());
				tabData.accept(GochickenModItems.PUPLE_CHIKEN.get());
				tabData.accept(GochickenModItems.CACTUS_CHIKEN.get());
				tabData.accept(GochickenModItems.LIGHT_GRAY_CHIKEN.get());
				tabData.accept(GochickenModItems.LIGHT_BLUE_CHIKEN.get());
				tabData.accept(GochickenModItems.CYAN_CHIKEN.get());
				tabData.accept(GochickenModItems.RED_CHIKEN.get());
				tabData.accept(GochickenModItems.PINK_CHIKEN.get());
				tabData.accept(GochickenModItems.ORANGE_CHIKEN.get());
				tabData.accept(GochickenModItems.GRAY_CHIKEN.get());
				tabData.accept(GochickenModItems.BROWN_CHIKEN.get());
				tabData.accept(GochickenModBlocks.BREEDER.get().asItem());
				tabData.accept(GochickenModItems.IRON_CHIKEN.get());
				tabData.accept(GochickenModItems.REDSTONE_CHIKEN.get());
				tabData.accept(GochickenModItems.GOLD_CHIKEN.get());
				tabData.accept(GochickenModItems.QUARTZ_CHIKEN.get());
				tabData.accept(GochickenModItems.GLASS_CHIKEN.get());
				tabData.accept(GochickenModItems.DIAMOND_CHIKEN.get());
				tabData.accept(GochickenModItems.GLOWSTONE_CHIKEN.get());
				tabData.accept(GochickenModItems.NETHERWART_CHIKEN.get());
				tabData.accept(GochickenModItems.ENDER_CHIKEN.get());
				tabData.accept(GochickenModItems.SNOWBALL.get());
				tabData.accept(GochickenModItems.CLAY_CHIKEN.get());
				tabData.accept(GochickenModItems.SILME_CHIKEN.get());
				tabData.accept(GochickenModItems.COAL_CHIKEN.get());
				tabData.accept(GochickenModItems.LAVA_CHIKEN.get());
				tabData.accept(GochickenModItems.LAVAEGG.get());
				tabData.accept(GochickenModItems.NIWATORINO_BEN.get());
				tabData.accept(GochickenModBlocks.PEI_HE_JI.get().asItem());
				tabData.accept(GochickenModItems.R_LOG_CHICKEN_SEED.get());
				tabData.accept(GochickenModItems.CHI_CKEN_SEED_1.get());
				tabData.accept(GochickenModItems.SAND_CHICKEN_SEED.get());
				tabData.accept(GochickenModItems.FLINT_CHICKENSEED.get());
				tabData.accept(GochickenModItems.WHITE_CHICKEN_SEED.get());
				tabData.accept(GochickenModItems.COLA_CHICKEN_SEED.get());
				tabData.accept(GochickenModItems.CHICKEN_SEED_LV_2.get());
				tabData.accept(GochickenModItems.CLAY_CHICKEN_SEED.get());
				tabData.accept(GochickenModItems.IRON_CHICKEN_SEED.get());
				tabData.accept(GochickenModItems.CHICKEN_SEED_3.get());
				tabData.accept(GochickenModItems.DIRT_CHICKEN.get());
				tabData.accept(GochickenModItems.DORT_CHICKEN_SEED.get());
				tabData.accept(GochickenModItems.GUNPOWDER_CHICKEN.get());
				tabData.accept(GochickenModItems.GUNPOWDER_CHICKEN_SEED.get());
				tabData.accept(GochickenModItems.SLIME_CHICKEN_SEED.get());
				tabData.accept(GochickenModItems.RED_STONE_CHICKEN_SEED.get());
				tabData.accept(GochickenModItems.STRING_CHICKEN.get());
				tabData.accept(GochickenModItems.STRING_CHICKEN_SEED.get());
				tabData.accept(GochickenModItems.LEATHER_CHICKEN.get());
				tabData.accept(GochickenModItems.LEATHER_CHICKEN_SEED.get());
				tabData.accept(GochickenModItems.COOPER_CHICKEN.get());
				tabData.accept(GochickenModItems.COOPER_CHICKEN_SEED.get());
				tabData.accept(GochickenModItems.QUARTZ_CHICKEN_SEED.get());
				tabData.accept(GochickenModItems.GLASS_CHICKEN_SEED.get());
				tabData.accept(GochickenModItems.GLOESTNOE_CHICKEN_SEED.get());
				tabData.accept(GochickenModItems.NETHER_WART_CHICKEN_SEED.get());
				tabData.accept(GochickenModItems.GOLD_CHICKEN_SEED.get());
				tabData.accept(GochickenModItems.CHIEKN_SEED_4.get());
				tabData.accept(GochickenModItems.SNOWBAKK_CHICKEN_SEED.get());
				tabData.accept(GochickenModItems.NETHRRACK_CHIECKEN.get());
				tabData.accept(GochickenModItems.NETHRRACK_CHIECKEN_SEED.get());
				tabData.accept(GochickenModItems.LAVA_CHICKEN_SEED.get());
				tabData.accept(GochickenModItems.BLAZECHICKEN.get());
				tabData.accept(GochickenModItems.BLAZE_CHICKEN_SEED.get());
				tabData.accept(GochickenModItems.MAGMA_CREAM_CHICKEN.get());
				tabData.accept(GochickenModItems.MAGMA_CREAM_CHICKEN_SEED.get());
				tabData.accept(GochickenModItems.DIAMOND_CHICKEN.get());
				tabData.accept(GochickenModItems.DIAMOND_CHICKEN_SEED.get());
				tabData.accept(GochickenModItems.CHICKEN_SEED_5.get());
				tabData.accept(GochickenModItems.GLOING.get());
				tabData.accept(GochickenModItems.ZNIC_CHICKEN.get());
				tabData.accept(GochickenModItems.ZNIC_CHICKEN_SEED.get());
				tabData.accept(GochickenModItems.ZNIC_INGOT.get());
				tabData.accept(GochickenModItems.ENDER_CHICKEN_SEED.get());
				tabData.accept(GochickenModItems.EGG_CHICKEN.get());
				tabData.accept(GochickenModItems.EGG_CHICKEN_SEED.get());
				tabData.accept(GochickenModItems.CHICKEN_SEED_6.get());
				tabData.accept(GochickenModItems.EMERALD_CHICKEN.get());
				tabData.accept(GochickenModItems.EMERALD_CHICKEN_SEED.get());
				tabData.accept(GochickenModItems.XP_CHICKEN.get());
				tabData.accept(GochickenModItems.XP_CHICKEN_SEED.get());
				tabData.accept(GochickenModItems.WATER_CHICKEN.get());
				tabData.accept(GochickenModItems.WATER_CHICKEN_SEED.get());
				tabData.accept(GochickenModItems.OBSIDIAN_CHICKEN.get());
				tabData.accept(GochickenModItems.OBSIDIAN_CHICKEN_SEED.get());
				tabData.accept(GochickenModItems.BONE_BAG.get());
				tabData.accept(GochickenModItems.ROTTEN_FLESH_BAG.get());
				tabData.accept(GochickenModItems.EGG_64.get());
				tabData.accept(GochickenModItems.GHAST_CHICKEN.get());
				tabData.accept(GochickenModItems.GHAST_CHICKEN_SEED.get());
				tabData.accept(GochickenModItems.SEALANTERN_CHICKEN.get());
				tabData.accept(GochickenModItems.SEALANTERN_CHICKEN_SEED.get());
				tabData.accept(GochickenModBlocks.SEED_MARKER.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> GO_ARMOR = REGISTRY.register("go_armor",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.gochicken.go_armor")).icon(() -> new ItemStack(GochickenModItems.BLUE_INGOT.get())).displayItems((parameters, tabData) -> {
				tabData.accept(GochickenModItems.BLUE_INGOT.get());
				tabData.accept(GochickenModBlocks.COMPRESSOR.get().asItem());
				tabData.accept(GochickenModItems.CUSHIONMATERIAL.get());
				tabData.accept(GochickenModItems.CUSHONMATERIAL_2.get());
				tabData.accept(GochickenModItems.PURPLE_DIAMOND.get());
				tabData.accept(GochickenModItems.PURPLE_DIAMOND_2.get());
			})

					.build());
}
