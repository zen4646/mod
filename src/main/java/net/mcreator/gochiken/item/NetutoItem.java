
package net.mcreator.gochiken.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.gochiken.procedures.NetutomobugaaitemudeGongJisaretatokiProcedure;
import net.mcreator.gochiken.procedures.NetutoYoukuritukusitatokiProcedure;
import net.mcreator.gochiken.init.GochikenModTabs;

public class NetutoItem extends Item {
	public NetutoItem() {
		super(new Item.Properties().tab(GochikenModTabs.TAB_GO_CHIKEN).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		NetutoYoukuritukusitatokiProcedure.execute(entity, itemstack);
		return ar;
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		NetutomobugaaitemudeGongJisaretatokiProcedure.execute(entity, itemstack);
		return retval;
	}
}
