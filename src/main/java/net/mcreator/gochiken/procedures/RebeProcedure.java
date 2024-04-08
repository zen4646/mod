package net.mcreator.gochiken.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.gochiken.network.GochickenModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RebeProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static String execute(Entity entity) {
		return execute(null, entity);
	}

	private static String execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return "";
		Entity Rebecca1339 = null;
		String Rebecca133 = "";
		if ((entity.getDisplayName().getString()).equals("Rebecca1339")) {
			Rebecca1339 = entity;
			GochickenModVariables.Rebecca1339 = "Dad" + (" " + ("X:" + (new java.text.DecimalFormat("#####").format(Rebecca1339.getX()) + ""
					+ (" Y:" + (new java.text.DecimalFormat("#####").format(Rebecca1339.getY()) + "" + (" Z:" + new java.text.DecimalFormat("#####").format(Rebecca1339.getZ())))))));
		}
		return GochickenModVariables.Rebecca1339;
	}
}
