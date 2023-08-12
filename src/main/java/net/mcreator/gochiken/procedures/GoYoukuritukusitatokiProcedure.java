package net.mcreator.gochiken.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class GoYoukuritukusitatokiProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		(itemstack).setHoverName(Component.literal((entity.getPersistentData().getString("tagName"))));
	}
}
