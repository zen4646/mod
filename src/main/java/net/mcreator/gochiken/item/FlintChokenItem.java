
package net.mcreator.gochiken.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.gochiken.init.GochikenModTabs;

public class FlintChokenItem extends Item {
	public FlintChokenItem() {
		super(new Item.Properties().tab(GochikenModTabs.TAB_GO_CHIKEN).stacksTo(16).rarity(Rarity.COMMON));
	}
}
