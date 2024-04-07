package net.mcreator.gochiken.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.gochiken.network.GochickenModVariables;

public class DeeProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		Entity rio1339 = null;
		String rio133 = "";
		if ((entity.getDisplayName().getString()).equals("rio1339")) {
			rio1339 = entity;
			{
				String _setval = "Dee "
						+ ("X:" + (new java.text.DecimalFormat("#####").format(entity.getX()) + "" + (" Y:" + (new java.text.DecimalFormat("#####").format(entity.getY()) + "" + (" Z:" + new java.text.DecimalFormat("#####").format(entity.getZ()))))));
				entity.getCapability(GochickenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.rio1339 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		return (entity.getCapability(GochickenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GochickenModVariables.PlayerVariables())).rio1339;
	}
}
