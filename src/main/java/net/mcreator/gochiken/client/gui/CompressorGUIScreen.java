package net.mcreator.gochiken.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.gochiken.world.inventory.CompressorGUIMenu;
import net.mcreator.gochiken.network.CompressorGUIButtonMessage;
import net.mcreator.gochiken.GochickenMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class CompressorGUIScreen extends AbstractContainerScreen<CompressorGUIMenu> {
	private final static HashMap<String, Object> guistate = CompressorGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_gomixiang;

	public CompressorGUIScreen(CompressorGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("gochicken:textures/screens/compressor_gui.png");

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

		guiGraphics.blit(new ResourceLocation("gochicken:textures/screens/legacysmithing.png"), this.leftPos + 0, this.topPos + 0, 0, 0, 256, 256, 256, 256);

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
		button_gomixiang = Button.builder(Component.translatable("gui.gochicken.compressor_gui.button_gomixiang"), e -> {
			if (true) {
				GochickenMod.PACKET_HANDLER.sendToServer(new CompressorGUIButtonMessage(0, x, y, z));
				CompressorGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 129, this.topPos + 6, 40, 20).build();
		guistate.put("button:button_gomixiang", button_gomixiang);
		this.addRenderableWidget(button_gomixiang);
	}
}
