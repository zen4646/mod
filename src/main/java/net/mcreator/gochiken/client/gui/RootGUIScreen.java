package net.mcreator.gochiken.client.gui;

public class RootGUIScreen extends AbstractContainerScreen<RootGUIMenu> {

	private final static HashMap<String, Object> guistate = RootGUIMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public RootGUIScreen(RootGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("gochicken:textures/screens/root_gui.png");

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

		guiGraphics.blit(new ResourceLocation("gochicken:textures/screens/you_shi_yin_.png"), this.leftPos + 33, this.topPos + 7, 0, 0, 36, 18, 36, 18);

		guiGraphics.blit(new ResourceLocation("gochicken:textures/screens/you_shi_yin_.png"), this.leftPos + 33, this.topPos + 34, 0, 0, 36, 18, 36, 18);

		guiGraphics.blit(new ResourceLocation("gochicken:textures/screens/you_shi_yin_.png"), this.leftPos + 33, this.topPos + 61, 0, 0, 36, 18, 36, 18);

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

	}

}
