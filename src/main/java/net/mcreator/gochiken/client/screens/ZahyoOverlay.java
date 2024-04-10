
package net.mcreator.gochiken.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.client.Minecraft;

import net.mcreator.gochiken.procedures.SuraimuProcedure;
import net.mcreator.gochiken.procedures.RebeProcedure;
import net.mcreator.gochiken.procedures.DeeProcedure;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class ZahyoOverlay {
	@SubscribeEvent(priority = EventPriority.HIGH)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		if (true) {
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					DeeProcedure.execute(entity), 0, 0, -1, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					SuraimuProcedure.execute(entity), 0, 8, -1, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					RebeProcedure.execute(entity), 0, 17, -1, false);
		}
	}
}
