package net.mcreator.gochiken.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.gochiken.network.GochickenModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class DeeProcedure {
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
		Entity rio1339 = null;
		String rio133 = "";
		if ((entity.getDisplayName().getString()).equals("rio1339")) {
			rio1339 = entity;
			GochickenModVariables.rio1339 = "Dee "
					+ ("X:" + (new java.text.DecimalFormat("#####").format(entity.getX()) + "" + (" Y:" + (new java.text.DecimalFormat("#####").format(entity.getY()) + "" + (" Z:" + new java.text.DecimalFormat("#####").format(entity.getZ()))))));
		}
		return GochickenModVariables.rio1339;
	}
}
