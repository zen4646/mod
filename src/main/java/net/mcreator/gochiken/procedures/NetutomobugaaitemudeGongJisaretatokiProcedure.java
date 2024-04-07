package net.mcreator.gochiken.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.gochiken.init.GochickenModItems;

public class NetutomobugaaitemudeGongJisaretatokiProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double flg = 0;
		String name = "";
		if ((itemstack.getDisplayName().getString()).equals(new ItemStack(GochickenModItems.NETUTO.get()).getDisplayName().getString())) {
			if (!entity.level().isClientSide())
				entity.discard();
			itemstack.getOrCreateTag().putString("tagName", (ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()));
			itemstack.setHoverName(Component.literal(("\u30CD\u30C3\u30C8\u3010" + (entity.getDisplayName().getString() + "\u3011"))));
		}
	}
}
