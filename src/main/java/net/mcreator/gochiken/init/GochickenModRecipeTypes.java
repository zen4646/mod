package net.mcreator.gochiken.init;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraft.world.item.crafting.RecipeSerializer;

import net.mcreator.gochiken.jei_recipes.RecipeJEIRecipe;
import net.mcreator.gochiken.jei_recipes.CompressorGUIEJIRecipe;
import net.mcreator.gochiken.GochickenMod;

@Mod.EventBusSubscriber(modid = GochickenMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class GochickenModRecipeTypes {
	public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, "gochicken");

	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		event.enqueueWork(() -> {
			SERIALIZERS.register(bus);
			SERIALIZERS.register("recipe_jei", () -> RecipeJEIRecipe.Serializer.INSTANCE);
			SERIALIZERS.register("compressor_guieji", () -> CompressorGUIEJIRecipe.Serializer.INSTANCE);
		});
	}
}
