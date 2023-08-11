package net.mcreator.gochiken.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.gochiken.init.GochikenModItems;

public class NetutoYoukuritukusitatokiProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		String net = "";
		String natName = "";
		natName = itemstack.getDisplayName().getString();
		if (!(natName).equals(new ItemStack(GochikenModItems.NETUTO.get()).getDisplayName().getString())) {
			net = itemstack.getOrCreateTag().getString("tagName");
			net = "summon " + net;
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), net);
				}
			}
			net = new ItemStack(GochikenModItems.NETUTO.get()).getDisplayName().getString();
			net = net.substring(1);
			net = net.substring(0, net.length() - 1);
			(itemstack).setHoverName(Component.literal(net));
		}
	}
}
