
package net.mcreator.gochiken.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.gochiken.procedures.LavaeggburotukuwoYoukuritukusitatokiProcedure;
import net.mcreator.gochiken.init.GochikenModTabs;

public class LavaeggItem extends Item {
	public LavaeggItem() {
		super(new Item.Properties().tab(GochikenModTabs.TAB_GO_CHIKEN).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		LavaeggburotukuwoYoukuritukusitatokiProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getItemInHand());
		return InteractionResult.SUCCESS;
	}
}
