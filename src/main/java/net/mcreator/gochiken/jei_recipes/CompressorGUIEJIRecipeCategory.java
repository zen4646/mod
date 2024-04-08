
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

public class CompressorGUIEJIRecipeCategory implements IRecipeCategory<CompressorGUIEJIRecipe> {
	public final static ResourceLocation UID = new ResourceLocation("gochicken", "compressor_guieji");
	public final static ResourceLocation TEXTURE = new ResourceLocation("gochicken", "textures/screens/compressor_gui.png");
	private final IDrawable background;
	private final IDrawable icon;

	public CompressorGUIEJIRecipeCategory(IGuiHelper helper) {
		this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 166);
		this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(GochickenModItems.BLUE_INGOT.get()));
	}

	@Override
	public mezz.jei.api.recipe.RecipeType<CompressorGUIEJIRecipe> getRecipeType() {
		return GochickenModJeiPlugin.CompressorGUIEJI_Type;
	}

	@Override
	public Component getTitle() {
		return Component.literal("Compressor GUIEJI");
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
	public void setRecipe(IRecipeLayoutBuilder builder, CompressorGUIEJIRecipe recipe, IFocusGroup focuses) {
		builder.addSlot(RecipeIngredientRole.INPUT, 106, 8).addIngredients(recipe.getIngredients().get(0));
		builder.addSlot(RecipeIngredientRole.INPUT, 80, 47).addIngredients(recipe.getIngredients().get(1));
		builder.addSlot(RecipeIngredientRole.OUTPUT, 106, 47).addItemStack(recipe.getResultItem(null));
	}
}
