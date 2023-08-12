
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gochiken.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class GochikenModTabs {
	public static CreativeModeTab TAB_GO_CHIKEN;

	public static void load() {
		TAB_GO_CHIKEN = new CreativeModeTab("tabgo_chiken") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(GochikenModItems.GO.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
