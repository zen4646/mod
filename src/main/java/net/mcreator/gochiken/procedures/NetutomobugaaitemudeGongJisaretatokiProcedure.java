package net.mcreator.gochiken.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.gochiken.init.GochikenModItems;

public class NetutomobugaaitemudeGongJisaretatokiProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		String net = "";
		net = itemstack.getDisplayName().getString();
		if ((net).equals(new ItemStack(GochikenModItems.NETUTO.get()).getDisplayName().getString())) {
			if (!entity.level.isClientSide())
				entity.discard();
			itemstack.getOrCreateTag().putString("tagName", (ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()));
			net = entity.getDisplayName().getString();
			net = "ネット【" + net + "】";
			(itemstack).setHoverName(Component.literal(net));
		}
	}
}
