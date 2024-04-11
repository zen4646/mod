
package net.mcreator.gochiken.init;

import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import net.mcreator.gochiken.jei_recipes.CompressorGUIEJIRecipeCategory;
import net.mcreator.gochiken.jei_recipes.CompressorGUIEJIRecipe;
import net.mcreator.gochiken.jei_recipes.CombinationJEIRecipeCategory;
import net.mcreator.gochiken.jei_recipes.CombinationJEIRecipe;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.Objects;
import java.util.List;

@JeiPlugin
public class GochickenModJeiPlugin implements IModPlugin {
	public static mezz.jei.api.recipe.RecipeType<CompressorGUIEJIRecipe> CompressorGUIEJI_Type = new mezz.jei.api.recipe.RecipeType<>(CompressorGUIEJIRecipeCategory.UID, CompressorGUIEJIRecipe.class);
	public static mezz.jei.api.recipe.RecipeType<CombinationJEIRecipe> CombinationJEI_Type = new mezz.jei.api.recipe.RecipeType<>(CombinationJEIRecipeCategory.UID, CombinationJEIRecipe.class);

	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation("gochicken:jei_plugin");
	}

	@Override
	public void registerCategories(IRecipeCategoryRegistration registration) {
		registration.addRecipeCategories(new CompressorGUIEJIRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
		registration.addRecipeCategories(new CombinationJEIRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		RecipeManager recipeManager = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
		List<CompressorGUIEJIRecipe> CompressorGUIEJIRecipes = recipeManager.getAllRecipesFor(CompressorGUIEJIRecipe.Type.INSTANCE);
		registration.addRecipes(CompressorGUIEJI_Type, CompressorGUIEJIRecipes);
		List<CombinationJEIRecipe> CombinationJEIRecipes = recipeManager.getAllRecipesFor(CombinationJEIRecipe.Type.INSTANCE);
		registration.addRecipes(CombinationJEI_Type, CombinationJEIRecipes);
	}

	@Override
	public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
		registration.addRecipeCatalyst(new ItemStack(GochickenModItems.BLUE_INGOT.get()), CompressorGUIEJI_Type);
	}
}
