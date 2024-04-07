package net.mcreator.gochiken.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.gochiken.init.GochickenModItems;

public class NetutoYoukuritukusitatokiProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		String net = "";
		String natName = "";
		if (!(itemstack.getDisplayName().getString()).equals(new ItemStack(GochickenModItems.NETUTO.get()).getDisplayName().getString())) {
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), ("summon " + itemstack.getOrCreateTag().getString("tagName")));
				}
			}
			itemstack.setHoverName(Component.literal("\u30CD\u30C3\u30C8\u3010\u7A7A\u3011"));
		}
	}
}
