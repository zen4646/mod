
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gochiken.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.gochiken.item.YellowChikenItem;
import net.mcreator.gochiken.item.SnowballItem;
import net.mcreator.gochiken.item.SilmeChikenItem;
import net.mcreator.gochiken.item.SandChokenItem;
import net.mcreator.gochiken.item.RedstoneChikenItem;
import net.mcreator.gochiken.item.RedChikenItem;
import net.mcreator.gochiken.item.QuartzChikenItem;
import net.mcreator.gochiken.item.PupleChikenItem;
import net.mcreator.gochiken.item.PinkChikenItem;
import net.mcreator.gochiken.item.OrangeChikenItem;
import net.mcreator.gochiken.item.NetutoItem;
import net.mcreator.gochiken.item.NetherwartChikenItem;
import net.mcreator.gochiken.item.MagentaChikenItem;
import net.mcreator.gochiken.item.LogChikenItem;
import net.mcreator.gochiken.item.LimeChikenItem;
import net.mcreator.gochiken.item.LightGrayChikenItem;
import net.mcreator.gochiken.item.LightBlueChikenItem;
import net.mcreator.gochiken.item.LavaeggItem;
import net.mcreator.gochiken.item.LavaChikenItem;
import net.mcreator.gochiken.item.LapisChikenItem;
import net.mcreator.gochiken.item.IronChikenItem;
import net.mcreator.gochiken.item.InkChikenItem;
import net.mcreator.gochiken.item.GrayChikenItem;
import net.mcreator.gochiken.item.GoldChikenItem;
import net.mcreator.gochiken.item.GoItem;
import net.mcreator.gochiken.item.GlowstoneChikenItem;
import net.mcreator.gochiken.item.GlassChikenItem;
import net.mcreator.gochiken.item.FlintChokenItem;
import net.mcreator.gochiken.item.EnderChikenItem;
import net.mcreator.gochiken.item.DiamondChikenItem;
import net.mcreator.gochiken.item.CyanChikenItem;
import net.mcreator.gochiken.item.CopperchickenkidItem;
import net.mcreator.gochiken.item.CopperchickenItem;
import net.mcreator.gochiken.item.CoalChikenItem;
import net.mcreator.gochiken.item.ClayChikenItem;
import net.mcreator.gochiken.item.CactusChikenItem;
import net.mcreator.gochiken.item.BrownChikenItem;
import net.mcreator.gochiken.item.BoneChikenItem;
import net.mcreator.gochiken.GochikenMod;

public class GochikenModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, GochikenMod.MODID);
	public static final RegistryObject<Item> GO = REGISTRY.register("go", () -> new GoItem());
	public static final RegistryObject<Item> NETUTO = REGISTRY.register("netuto", () -> new NetutoItem());
	public static final RegistryObject<Item> LOG_CHIKEN = REGISTRY.register("log_chiken", () -> new LogChikenItem());
	public static final RegistryObject<Item> FLINT_CHOKEN = REGISTRY.register("flint_choken", () -> new FlintChokenItem());
	public static final RegistryObject<Item> SAND_CHOKEN = REGISTRY.register("sand_choken", () -> new SandChokenItem());
	public static final RegistryObject<Item> BONE_CHIKEN = REGISTRY.register("bone_chiken", () -> new BoneChikenItem());
	public static final RegistryObject<Item> COPPERCHICKEN = REGISTRY.register("copperchicken", () -> new CopperchickenItem());
	public static final RegistryObject<Item> COPPERCHICKENKID = REGISTRY.register("copperchickenkid", () -> new CopperchickenkidItem());
	public static final RegistryObject<Item> GORWER_LV_1 = block(GochikenModBlocks.GORWER_LV_1, GochikenModTabs.TAB_GO_CHIKEN);
	public static final RegistryObject<Item> LAYER_1 = block(GochikenModBlocks.LAYER_1, GochikenModTabs.TAB_GO_CHIKEN);
	public static final RegistryObject<Item> ROOST = block(GochikenModBlocks.ROOST, GochikenModTabs.TAB_GO_CHIKEN);
	public static final RegistryObject<Item> LAPIS_CHIKEN = REGISTRY.register("lapis_chiken", () -> new LapisChikenItem());
	public static final RegistryObject<Item> INK_CHIKEN = REGISTRY.register("ink_chiken", () -> new InkChikenItem());
	public static final RegistryObject<Item> MAGENTA_CHIKEN = REGISTRY.register("magenta_chiken", () -> new MagentaChikenItem());
	public static final RegistryObject<Item> LIME_CHIKEN = REGISTRY.register("lime_chiken", () -> new LimeChikenItem());
	public static final RegistryObject<Item> YELLOW_CHIKEN = REGISTRY.register("yellow_chiken", () -> new YellowChikenItem());
	public static final RegistryObject<Item> PUPLE_CHIKEN = REGISTRY.register("puple_chiken", () -> new PupleChikenItem());
	public static final RegistryObject<Item> CACTUS_CHIKEN = REGISTRY.register("cactus_chiken", () -> new CactusChikenItem());
	public static final RegistryObject<Item> LIGHT_GRAY_CHIKEN = REGISTRY.register("light_gray_chiken", () -> new LightGrayChikenItem());
	public static final RegistryObject<Item> LIGHT_BLUE_CHIKEN = REGISTRY.register("light_blue_chiken", () -> new LightBlueChikenItem());
	public static final RegistryObject<Item> CYAN_CHIKEN = REGISTRY.register("cyan_chiken", () -> new CyanChikenItem());
	public static final RegistryObject<Item> RED_CHIKEN = REGISTRY.register("red_chiken", () -> new RedChikenItem());
	public static final RegistryObject<Item> PINK_CHIKEN = REGISTRY.register("pink_chiken", () -> new PinkChikenItem());
	public static final RegistryObject<Item> ORANGE_CHIKEN = REGISTRY.register("orange_chiken", () -> new OrangeChikenItem());
	public static final RegistryObject<Item> GRAY_CHIKEN = REGISTRY.register("gray_chiken", () -> new GrayChikenItem());
	public static final RegistryObject<Item> BROWN_CHIKEN = REGISTRY.register("brown_chiken", () -> new BrownChikenItem());
	public static final RegistryObject<Item> BREEDER = block(GochikenModBlocks.BREEDER, GochikenModTabs.TAB_GO_CHIKEN);
	public static final RegistryObject<Item> IRON_CHIKEN = REGISTRY.register("iron_chiken", () -> new IronChikenItem());
	public static final RegistryObject<Item> REDSTONE_CHIKEN = REGISTRY.register("redstone_chiken", () -> new RedstoneChikenItem());
	public static final RegistryObject<Item> GOLD_CHIKEN = REGISTRY.register("gold_chiken", () -> new GoldChikenItem());
	public static final RegistryObject<Item> QUARTZ_CHIKEN = REGISTRY.register("quartz_chiken", () -> new QuartzChikenItem());
	public static final RegistryObject<Item> GLASS_CHIKEN = REGISTRY.register("glass_chiken", () -> new GlassChikenItem());
	public static final RegistryObject<Item> DIAMOND_CHIKEN = REGISTRY.register("diamond_chiken", () -> new DiamondChikenItem());
	public static final RegistryObject<Item> GLOWSTONE_CHIKEN = REGISTRY.register("glowstone_chiken", () -> new GlowstoneChikenItem());
	public static final RegistryObject<Item> NETHERWART_CHIKEN = REGISTRY.register("netherwart_chiken", () -> new NetherwartChikenItem());
	public static final RegistryObject<Item> ENDER_CHIKEN = REGISTRY.register("ender_chiken", () -> new EnderChikenItem());
	public static final RegistryObject<Item> SNOWBALL = REGISTRY.register("snowball", () -> new SnowballItem());
	public static final RegistryObject<Item> CLAY_CHIKEN = REGISTRY.register("clay_chiken", () -> new ClayChikenItem());
	public static final RegistryObject<Item> SILME_CHIKEN = REGISTRY.register("silme_chiken", () -> new SilmeChikenItem());
	public static final RegistryObject<Item> COAL_CHIKEN = REGISTRY.register("coal_chiken", () -> new CoalChikenItem());
	public static final RegistryObject<Item> LAVA_CHIKEN = REGISTRY.register("lava_chiken", () -> new LavaChikenItem());
	public static final RegistryObject<Item> LAVAEGG = REGISTRY.register("lavaegg", () -> new LavaeggItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
