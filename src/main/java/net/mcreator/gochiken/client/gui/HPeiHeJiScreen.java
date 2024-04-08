package net.mcreator.gochiken.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.gochiken.world.inventory.HPeiHeJiMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class HPeiHeJiScreen extends AbstractContainerScreen<HPeiHeJiMenu> {
	private final static HashMap<String, Object> guistate = HPeiHeJiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_breeder;
	ImageButton imagebutton_you_shi_yin;

	public HPeiHeJiScreen(HPeiHeJiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("gochicken:textures/screens/h_pei_he_ji.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_breeder = new ImageButton(this.leftPos + 51, this.topPos + 34, 18, 18, 0, 0, 18, new ResourceLocation("gochicken:textures/screens/atlas/imagebutton_breeder.png"), 18, 36, e -> {
		});
		guistate.put("button:imagebutton_breeder", imagebutton_breeder);
		this.addRenderableWidget(imagebutton_breeder);
		imagebutton_you_shi_yin = new ImageButton(this.leftPos + 96, this.topPos + 34, 36, 18, 0, 0, 18, new ResourceLocation("gochicken:textures/screens/atlas/imagebutton_you_shi_yin.png"), 36, 36, e -> {
		});
		guistate.put("button:imagebutton_you_shi_yin", imagebutton_you_shi_yin);
		this.addRenderableWidget(imagebutton_you_shi_yin);
	}
}
