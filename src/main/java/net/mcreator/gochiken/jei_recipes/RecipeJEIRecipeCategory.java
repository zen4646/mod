
package net.mcreator.gochiken.jei_recipes;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import net.mcreator.gochiken.init.GochickenModJeiPlugin;
import net.mcreator.gochiken.init.GochickenModItems;

import mezz.jei.api.recipe.category.IRecipeCategory;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.constants.VanillaTypes;

public class RecipeJEIRecipeCategory implements IRecipeCategory<RecipeJEIRecipe> {
	public final static ResourceLocation UID = new ResourceLocation("gochicken", "recipe_jei");
	public final static ResourceLocation TEXTURE = new ResourceLocation("gochicken", "textures/screens/test.png");
	private final IDrawable background;
	private final IDrawable icon;

	public RecipeJEIRecipeCategory(IGuiHelper helper) {
		this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 81);
		this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(GochickenModItems.GO.get()));
	}

	@Override
	public mezz.jei.api.recipe.RecipeType<RecipeJEIRecipe> getRecipeType() {
		return GochickenModJeiPlugin.RecipeJEI_Type;
	}

	@Override
	public Component getTitle() {
		return Component.literal("Recipe JEI");
	}

	@Override
	public IDrawable getBackground() {
		return this.background;
	}

	@Override
	public IDrawable getIcon() {
		return this.icon;
	}

	@Override
	public void setRecipe(IRecipeLayoutBuilder builder, RecipeJEIRecipe recipe, IFocusGroup focuses) {
		builder.addSlot(RecipeIngredientRole.INPUT, 42, 35).addIngredients(recipe.getIngredients().get(0));
		builder.addSlot(RecipeIngredientRole.OUTPUT, 150, 35).addItemStack(recipe.getResultItem(null));
		builder.addSlot(RecipeIngredientRole.INPUT, 60, 35).addIngredients(recipe.getIngredients().get(1));
	}
}
