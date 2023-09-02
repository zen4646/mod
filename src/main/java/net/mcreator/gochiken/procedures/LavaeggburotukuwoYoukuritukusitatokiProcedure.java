package net.mcreator.gochiken.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

public class LavaeggburotukuwoYoukuritukusitatokiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.AIR) {
			world.setBlock(new BlockPos(x, y + 1, z), Blocks.LAVA.defaultBlockState(), 3);
			(itemstack).shrink(1);
		}
	}
}
