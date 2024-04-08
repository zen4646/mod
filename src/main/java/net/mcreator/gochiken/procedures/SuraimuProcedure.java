package net.mcreator.gochiken.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.gochiken.network.GochickenModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SuraimuProcedure {
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
		Entity suraimu0119 = null;
		String suraimu011 = "";
		if ((entity.getDisplayName().getString()).equals("Dev")) {
			suraimu0119 = entity;
			GochickenModVariables.suraimu0119 = "Goo" + (" " + ("X:" + (new java.text.DecimalFormat("#####").format(suraimu0119.getX()) + ""
					+ (" Y:" + (new java.text.DecimalFormat("#####").format(suraimu0119.getY()) + "" + (" Z:" + new java.text.DecimalFormat("#####").format(suraimu0119.getZ())))))));
		}
		return GochickenModVariables.suraimu0119;
	}
}
