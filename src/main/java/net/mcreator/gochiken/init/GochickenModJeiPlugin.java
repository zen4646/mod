
package net.mcreator.gochiken.init;

import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import net.mcreator.gochiken.jei_recipes.RecipeJEIRecipeCategory;
import net.mcreator.gochiken.jei_recipes.RecipeJEIRecipe;
import net.mcreator.gochiken.jei_recipes.CompressorGUIEJIRecipeCategory;
import net.mcreator.gochiken.jei_recipes.CompressorGUIEJIRecipe;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.Objects;
import java.util.List;

@JeiPlugin
public class GochickenModJeiPlugin implements IModPlugin {
	public static mezz.jei.api.recipe.RecipeType<RecipeJEIRecipe> RecipeJEI_Type = new mezz.jei.api.recipe.RecipeType<>(RecipeJEIRecipeCategory.UID, RecipeJEIRecipe.class);
	public static mezz.jei.api.recipe.RecipeType<CompressorGUIEJIRecipe> CompressorGUIEJI_Type = new mezz.jei.api.recipe.RecipeType<>(CompressorGUIEJIRecipeCategory.UID, CompressorGUIEJIRecipe.class);

	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation("gochicken:jei_plugin");
	}

	@Override
	public void registerCategories(IRecipeCategoryRegistration registration) {
		registration.addRecipeCategories(new RecipeJEIRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
		registration.addRecipeCategories(new CompressorGUIEJIRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		RecipeManager recipeManager = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
		List<RecipeJEIRecipe> RecipeJEIRecipes = recipeManager.getAllRecipesFor(RecipeJEIRecipe.Type.INSTANCE);
		registration.addRecipes(RecipeJEI_Type, RecipeJEIRecipes);
		List<CompressorGUIEJIRecipe> CompressorGUIEJIRecipes = recipeManager.getAllRecipesFor(CompressorGUIEJIRecipe.Type.INSTANCE);
		registration.addRecipes(CompressorGUIEJI_Type, CompressorGUIEJIRecipes);
	}

	@Override
	public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
		registration.addRecipeCatalyst(new ItemStack(GochickenModItems.BLUE_INGOT.get()), CompressorGUIEJI_Type);
	}
}
