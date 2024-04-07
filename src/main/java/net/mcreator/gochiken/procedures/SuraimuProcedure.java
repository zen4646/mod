package net.mcreator.gochiken.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.gochiken.network.GochickenModVariables;

public class SuraimuProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		Entity suraimu0119 = null;
		String suraimu011 = "";
		if ((entity.getDisplayName().getString()).equals("suraimu0119")) {
			suraimu0119 = entity;
			{
				String _setval = "Goo" + (" " + ("X:" + (new java.text.DecimalFormat("#####").format(suraimu0119.getX()) + ""
						+ (" Y:" + (new java.text.DecimalFormat("#####").format(suraimu0119.getY()) + "" + (" Z:" + new java.text.DecimalFormat("#####").format(suraimu0119.getZ())))))));
				entity.getCapability(GochickenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.suraimu0119 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		return (entity.getCapability(GochickenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GochickenModVariables.PlayerVariables())).Rebecca1339;
	}
}
