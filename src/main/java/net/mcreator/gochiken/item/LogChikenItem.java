
package net.mcreator.gochiken.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.gochiken.init.GochikenModTabs;

public class LogChikenItem extends Item {
	public LogChikenItem() {
		super(new Item.Properties().tab(GochikenModTabs.TAB_GO_CHIKEN).stacksTo(64).rarity(Rarity.COMMON));
	}
}
