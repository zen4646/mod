
package net.mcreator.gochiken.jei_recipes;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import net.mcreator.gochiken.init.GochickenModJeiPlugin;
import net.mcreator.gochiken.init.GochickenModBlocks;

import mezz.jei.api.recipe.category.IRecipeCategory;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.constants.VanillaTypes;

public class CombinationJEIRecipeCategory implements IRecipeCategory<CombinationJEIRecipe> {
	public final static ResourceLocation UID = new ResourceLocation("gochicken", "combination_jei");
	public final static ResourceLocation TEXTURE = new ResourceLocation("gochicken", "textures/screens/combinationjei.png");
	private final IDrawable background;
	private final IDrawable icon;

	public CombinationJEIRecipeCategory(IGuiHelper helper) {
		this.background = helper.createDrawable(TEXTURE, 0, 0, 175, 85);
		this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(GochickenModBlocks.PEI_HE_JI.get().asItem()));
	}

	@Override
	public mezz.jei.api.recipe.RecipeType<CombinationJEIRecipe> getRecipeType() {
		return GochickenModJeiPlugin.CombinationJEI_Type;
	}

	@Override
	public Component getTitle() {
		return Component.literal("配合機");
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
	public void setRecipe(IRecipeLayoutBuilder builder, CombinationJEIRecipe recipe, IFocusGroup focuses) {
		builder.addSlot(RecipeIngredientRole.INPUT, 25, 35).addIngredients(recipe.getIngredients().get(0));
		builder.addSlot(RecipeIngredientRole.INPUT, 79, 35).addIngredients(recipe.getIngredients().get(1));
		builder.addSlot(RecipeIngredientRole.OUTPUT, 133, 35).addItemStack(recipe.getResultItem(null));
	}
}
