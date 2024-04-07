package net.mcreator.gochiken.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.gochiken.network.GochickenModVariables;

public class RebeProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		Entity Rebecca1339 = null;
		String Rebecca133 = "";
		if ((entity.getDisplayName().getString()).equals("Rebecca1339")) {
			Rebecca1339 = entity;
			{
				String _setval = "Dad" + (" " + ("X:" + (new java.text.DecimalFormat("#####").format(Rebecca1339.getX()) + ""
						+ (" Y:" + (new java.text.DecimalFormat("#####").format(Rebecca1339.getY()) + "" + (" Z:" + new java.text.DecimalFormat("#####").format(Rebecca1339.getZ())))))));
				entity.getCapability(GochickenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Rebecca1339 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		return (entity.getCapability(GochickenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GochickenModVariables.PlayerVariables())).Rebecca1339;
	}
}
