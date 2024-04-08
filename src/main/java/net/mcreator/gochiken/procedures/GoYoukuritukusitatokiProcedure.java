package net.mcreator.gochiken.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class GoYoukuritukusitatokiProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double flg = 0;
		if (flg == 0) {
			entity.setCustomName(Component.literal("Dev"));
			flg = 1;
		}
		if (flg == 1) {
			entity.setCustomName(Component.literal("rio1339"));
			flg = 2;
		}
		if (flg == 2) {
			entity.setCustomName(Component.literal("Rebecca1339"));
			flg = 0;
		}
	}
}
