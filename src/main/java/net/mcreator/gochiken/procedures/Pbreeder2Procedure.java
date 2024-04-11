package net.mcreator.gochiken.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.mcreator.gochiken.init.GochickenModItems;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

public class Pbreeder2Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double flg = 0;
		double num1 = 0;
		double n = 0;
		double num2 = 0;
		flg = 0;
		if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), 0)).getItem() == Items.WHEAT_SEEDS && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, BlockPos.containing(x, y, z), 0) >= 2 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, BlockPos.containing(x, y, z), 1) != 0 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, BlockPos.containing(x, y, z), 2) != 0) {
			num1 = 1;
			num2 = 2;
			if (new Object() {
				public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
					return _retval.get();
				}
			}.getAmount(world, BlockPos.containing(x, y, z), 3) == 0 && new Object() {
				public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
					return _retval.get();
				}
			}.getAmount(world, BlockPos.containing(x, y, z), 4) == 0 && new Object() {
				public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
					return _retval.get();
				}
			}.getAmount(world, BlockPos.containing(x, y, z), 5) == 0) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putString("ID1", ((new Object() {
							public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								BlockEntity _ent = world.getBlockEntity(pos);
								if (_ent != null)
									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
								return _retval.get();
							}
						}.getItemStack(world, BlockPos.containing(x, y, z), 1)).getDisplayName().getString()));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putString("ID2", ((new Object() {
							public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								BlockEntity _ent = world.getBlockEntity(pos);
								if (_ent != null)
									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
								return _retval.get();
							}
						}.getItemStack(world, BlockPos.containing(x, y, z), 2)).getDisplayName().getString()));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			}
			if ((new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getString(tag);
					return "";
				}
			}.getValue(world, BlockPos.containing(x, y, z), "ID1")).equals((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
					return _retval.get();
				}
			}.getItemStack(world, BlockPos.containing(x, y, z), 1)).getDisplayName().getString()) && (new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getString(tag);
					return "";
				}
			}.getValue(world, BlockPos.containing(x, y, z), "ID2")).equals((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
					return _retval.get();
				}
			}.getItemStack(world, BlockPos.containing(x, y, z), 2)).getDisplayName().getString())) {
				flg = 1;
			}
			n = Mth.nextInt(RandomSource.create(), 1, 3);
			if (flg == 1) {
				if (n == 1) {
					if (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
							return _retval.get();
						}
					}.getAmount(world, BlockPos.containing(x, y, z), 3) != 64) {
						{
							BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
							if (_ent != null) {
								final int _slotid = 3;
								final ItemStack _setstack = (new Object() {
									public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
										AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
										BlockEntity _ent = world.getBlockEntity(pos);
										if (_ent != null)
											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
										return _retval.get();
									}
								}.getItemStack(world, BlockPos.containing(x, y, z), 1));
								_setstack.setCount((int) (new Object() {
									public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
										AtomicInteger _retval = new AtomicInteger(0);
										BlockEntity _ent = world.getBlockEntity(pos);
										if (_ent != null)
											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
										return _retval.get();
									}
								}.getAmount(world, BlockPos.containing(x, y, z), 3) + 1));
								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable)
										((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
								});
							}
						}
						{
							BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
							if (_ent != null) {
								final int _slotid = 0;
								final int _amount = 2;
								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable) {
										ItemStack _stk = capability.getStackInSlot(_slotid).copy();
										_stk.shrink(_amount);
										((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
									}
								});
							}
						}
					}
				} else {
					if (n == 2) {
						if (new Object() {
							public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
								AtomicInteger _retval = new AtomicInteger(0);
								BlockEntity _ent = world.getBlockEntity(pos);
								if (_ent != null)
									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
								return _retval.get();
							}
						}.getAmount(world, BlockPos.containing(x, y, z), 4) != 64) {
							{
								BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
								if (_ent != null) {
									final int _slotid = 4;
									final ItemStack _setstack = (new Object() {
										public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
											AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
											BlockEntity _ent = world.getBlockEntity(pos);
											if (_ent != null)
												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
											return _retval.get();
										}
									}.getItemStack(world, BlockPos.containing(x, y, z), 2));
									_setstack.setCount((int) (new Object() {
										public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
											AtomicInteger _retval = new AtomicInteger(0);
											BlockEntity _ent = world.getBlockEntity(pos);
											if (_ent != null)
												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
											return _retval.get();
										}
									}.getAmount(world, BlockPos.containing(x, y, z), 4) + 1));
									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
										if (capability instanceof IItemHandlerModifiable)
											((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
									});
								}
							}
							{
								BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
								if (_ent != null) {
									final int _slotid = 0;
									final int _amount = 2;
									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
										if (capability instanceof IItemHandlerModifiable) {
											ItemStack _stk = capability.getStackInSlot(_slotid).copy();
											_stk.shrink(_amount);
											((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
										}
									});
								}
							}
						}
					} else {
						if (n == 3) {
							if (new Object() {
								public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicInteger _retval = new AtomicInteger(0);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
									return _retval.get();
								}
							}.getAmount(world, BlockPos.containing(x, y, z), 5) == 0) {
								for (int index0 = 0; index0 < 2; index0++) {
									if ((new Object() {
										public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
											AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
											BlockEntity _ent = world.getBlockEntity(pos);
											if (_ent != null)
												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
											return _retval.get();
										}
									}.getItemStack(world, BlockPos.containing(x, y, z), (int) num1)).getItem() == GochickenModItems.FLINT_CHOKEN.get() && (new Object() {
										public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
											AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
											BlockEntity _ent = world.getBlockEntity(pos);
											if (_ent != null)
												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
											return _retval.get();
										}
									}.getItemStack(world, BlockPos.containing(x, y, z), (int) num2)).getItem() == GochickenModItems.BONE_CHIKEN.get()) {
										{
											BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
											if (_ent != null) {
												final int _slotid = 5;
												final ItemStack _setstack = new ItemStack(GochickenModItems.IRON_CHICKEN_SEED.get());
												_setstack.setCount(1);
												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
													if (capability instanceof IItemHandlerModifiable)
														((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
												});
											}
										}
										break;
									} else {
										if ((new Object() {
											public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
												AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
												BlockEntity _ent = world.getBlockEntity(pos);
												if (_ent != null)
													_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
												return _retval.get();
											}
										}.getItemStack(world, BlockPos.containing(x, y, z), (int) num1)).getItem() == GochickenModItems.SAND_CHOKEN.get() && (new Object() {
											public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
												AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
												BlockEntity _ent = world.getBlockEntity(pos);
												if (_ent != null)
													_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
												return _retval.get();
											}
										}.getItemStack(world, BlockPos.containing(x, y, z), (int) num2)).getItem() == GochickenModItems.RED_CHIKEN.get()) {
											{
												BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
												if (_ent != null) {
													final int _slotid = 5;
													final ItemStack _setstack = new ItemStack(GochickenModItems.RED_STONE_CHICKEN_SEED.get());
													_setstack.setCount(1);
													_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
														if (capability instanceof IItemHandlerModifiable)
															((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
													});
												}
											}
											break;
										} else {
											if ((new Object() {
												public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
													AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
													BlockEntity _ent = world.getBlockEntity(pos);
													if (_ent != null)
														_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
													return _retval.get();
												}
											}.getItemStack(world, BlockPos.containing(x, y, z), (int) num1)).getItem() == GochickenModItems.YELLOW_CHIKEN.get() && (new Object() {
												public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
													AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
													BlockEntity _ent = world.getBlockEntity(pos);
													if (_ent != null)
														_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
													return _retval.get();
												}
											}.getItemStack(world, BlockPos.containing(x, y, z), (int) num2)).getItem() == GochickenModItems.IRON_CHIKEN.get()) {
												{
													BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
													if (_ent != null) {
														final int _slotid = 5;
														final ItemStack _setstack = new ItemStack(GochickenModItems.GOLD_CHICKEN_SEED.get());
														_setstack.setCount(1);
														_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
															if (capability instanceof IItemHandlerModifiable)
																((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
														});
													}
												}
												break;
											} else {
												if ((new Object() {
													public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
														AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
														BlockEntity _ent = world.getBlockEntity(pos);
														if (_ent != null)
															_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
														return _retval.get();
													}
												}.getItemStack(world, BlockPos.containing(x, y, z), (int) num1)).getItem() == GochickenModItems.REDSTONE_CHIKEN.get() && (new Object() {
													public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
														AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
														BlockEntity _ent = world.getBlockEntity(pos);
														if (_ent != null)
															_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
														return _retval.get();
													}
												}.getItemStack(world, BlockPos.containing(x, y, z), (int) num2)).getItem() == GochickenModItems.QUARTZ_CHIKEN.get()) {
													{
														BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
														if (_ent != null) {
															final int _slotid = 5;
															final ItemStack _setstack = new ItemStack(GochickenModItems.GLASS_CHICKEN_SEED.get());
															_setstack.setCount(1);
															_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																if (capability instanceof IItemHandlerModifiable)
																	((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
															});
														}
													}
													break;
												} else {
													if ((new Object() {
														public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
															AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
															BlockEntity _ent = world.getBlockEntity(pos);
															if (_ent != null)
																_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
															return _retval.get();
														}
													}.getItemStack(world, BlockPos.containing(x, y, z), (int) num1)).getItem() == GochickenModItems.GOLD_CHIKEN.get() && (new Object() {
														public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
															AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
															BlockEntity _ent = world.getBlockEntity(pos);
															if (_ent != null)
																_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
															return _retval.get();
														}
													}.getItemStack(world, BlockPos.containing(x, y, z), (int) num2)).getItem() == GochickenModItems.GLASS_CHIKEN.get()) {
														{
															BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
															if (_ent != null) {
																final int _slotid = 5;
																final ItemStack _setstack = new ItemStack(GochickenModItems.DIAMOND_CHICKEN_SEED.get());
																_setstack.setCount(1);
																_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																	if (capability instanceof IItemHandlerModifiable)
																		((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																});
															}
														}
														break;
													} else {
														if ((new Object() {
															public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																BlockEntity _ent = world.getBlockEntity(pos);
																if (_ent != null)
																	_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																return _retval.get();
															}
														}.getItemStack(world, BlockPos.containing(x, y, z), (int) num1)).getItem() == GochickenModItems.QUARTZ_CHIKEN.get() && (new Object() {
															public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																BlockEntity _ent = world.getBlockEntity(pos);
																if (_ent != null)
																	_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																return _retval.get();
															}
														}.getItemStack(world, BlockPos.containing(x, y, z), (int) num2)).getItem() == GochickenModItems.YELLOW_CHIKEN.get()) {
															{
																BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																if (_ent != null) {
																	final int _slotid = 5;
																	final ItemStack _setstack = new ItemStack(GochickenModItems.GLOESTNOE_CHICKEN_SEED.get());
																	_setstack.setCount(1);
																	_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																		if (capability instanceof IItemHandlerModifiable)
																			((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																	});
																}
															}
															break;
														} else {
															if ((new Object() {
																public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																	AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																	BlockEntity _ent = world.getBlockEntity(pos);
																	if (_ent != null)
																		_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																	return _retval.get();
																}
															}.getItemStack(world, BlockPos.containing(x, y, z), (int) num1)).getItem() == GochickenModItems.CACTUS_CHIKEN.get() && (new Object() {
																public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																	AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																	BlockEntity _ent = world.getBlockEntity(pos);
																	if (_ent != null)
																		_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																	return _retval.get();
																}
															}.getItemStack(world, BlockPos.containing(x, y, z), (int) num2)).getItem() == GochickenModItems.RED_CHIKEN.get()) {
																{
																	BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																	if (_ent != null) {
																		final int _slotid = 5;
																		final ItemStack _setstack = new ItemStack(GochickenModItems.BROWN_CHIKEN.get());
																		_setstack.setCount(1);
																		_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																			if (capability instanceof IItemHandlerModifiable)
																				((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																		});
																	}
																}
																break;
															} else {
																if ((new Object() {
																	public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																		AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																		BlockEntity _ent = world.getBlockEntity(pos);
																		if (_ent != null)
																			_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																		return _retval.get();
																	}
																}.getItemStack(world, BlockPos.containing(x, y, z), (int) num1)).getItem() == GochickenModItems.GLOWSTONE_CHIKEN.get() && (new Object() {
																	public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																		AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																		BlockEntity _ent = world.getBlockEntity(pos);
																		if (_ent != null)
																			_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																		return _retval.get();
																	}
																}.getItemStack(world, BlockPos.containing(x, y, z), (int) num2)).getItem() == GochickenModItems.BROWN_CHIKEN.get()) {
																	{
																		BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																		if (_ent != null) {
																			final int _slotid = 5;
																			final ItemStack _setstack = new ItemStack(GochickenModItems.NETHER_WART_CHICKEN_SEED.get());
																			_setstack.setCount(1);
																			_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																				if (capability instanceof IItemHandlerModifiable)
																					((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																			});
																		}
																	}
																	break;
																} else {
																	if ((new Object() {
																		public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																			AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																			BlockEntity _ent = world.getBlockEntity(pos);
																			if (_ent != null)
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																			return _retval.get();
																		}
																	}.getItemStack(world, BlockPos.containing(x, y, z), (int) num1)).getItem() == GochickenModItems.DIAMOND_CHIKEN.get() && (new Object() {
																		public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																			AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																			BlockEntity _ent = world.getBlockEntity(pos);
																			if (_ent != null)
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																			return _retval.get();
																		}
																	}.getItemStack(world, BlockPos.containing(x, y, z), (int) num2)).getItem() == GochickenModItems.NETHERWART_CHIKEN.get()) {
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 5;
																				final ItemStack _setstack = new ItemStack(GochickenModItems.ENDER_CHICKEN_SEED.get());
																				_setstack.setCount(1);
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable)
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																				});
																			}
																		}
																		break;
																	} else {
																		if ((new Object() {
																			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																				BlockEntity _ent = world.getBlockEntity(pos);
																				if (_ent != null)
																					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																				return _retval.get();
																			}
																		}.getItemStack(world, BlockPos.containing(x, y, z), (int) num1)).getItem() == GochickenModItems.LAPIS_CHIKEN.get() && (new Object() {
																			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																				BlockEntity _ent = world.getBlockEntity(pos);
																				if (_ent != null)
																					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																				return _retval.get();
																			}
																		}.getItemStack(world, BlockPos.containing(x, y, z), (int) num2)).getItem() == GochickenModItems.LOG_CHIKEN.get()) {
																			{
																				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																				if (_ent != null) {
																					final int _slotid = 5;
																					final ItemStack _setstack = new ItemStack(GochickenModItems.SNOWBAKK_CHICKEN_SEED.get());
																					_setstack.setCount(1);
																					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																						if (capability instanceof IItemHandlerModifiable)
																							((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																					});
																				}
																			}
																			break;
																		} else {
																			if ((new Object() {
																				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																					BlockEntity _ent = world.getBlockEntity(pos);
																					if (_ent != null)
																						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																					return _retval.get();
																				}
																			}.getItemStack(world, BlockPos.containing(x, y, z), (int) num1)).getItem() == GochickenModItems.SAND_CHOKEN.get() && (new Object() {
																				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																					BlockEntity _ent = world.getBlockEntity(pos);
																					if (_ent != null)
																						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																					return _retval.get();
																				}
																			}.getItemStack(world, BlockPos.containing(x, y, z), (int) num2)).getItem() == GochickenModItems.SNOWBALL.get()) {
																				{
																					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																					if (_ent != null) {
																						final int _slotid = 5;
																						final ItemStack _setstack = new ItemStack(GochickenModItems.CLAY_CHICKEN_SEED.get());
																						_setstack.setCount(1);
																						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																							if (capability instanceof IItemHandlerModifiable)
																								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																						});
																					}
																				}
																				break;
																			} else {
																				if ((new Object() {
																					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																						BlockEntity _ent = world.getBlockEntity(pos);
																						if (_ent != null)
																							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																						return _retval.get();
																					}
																				}.getItemStack(world, BlockPos.containing(x, y, z), (int) num1)).getItem() == GochickenModItems.CLAY_CHIKEN.get() && (new Object() {
																					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																						BlockEntity _ent = world.getBlockEntity(pos);
																						if (_ent != null)
																							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																						return _retval.get();
																					}
																				}.getItemStack(world, BlockPos.containing(x, y, z), (int) num2)).getItem() == GochickenModItems.CACTUS_CHIKEN.get()) {
																					{
																						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																						if (_ent != null) {
																							final int _slotid = 5;
																							final ItemStack _setstack = new ItemStack(GochickenModItems.SLIME_CHICKEN_SEED.get());
																							_setstack.setCount(1);
																							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																								if (capability instanceof IItemHandlerModifiable)
																									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																							});
																						}
																					}
																					break;
																				} else {
																					if ((new Object() {
																						public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																							BlockEntity _ent = world.getBlockEntity(pos);
																							if (_ent != null)
																								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																							return _retval.get();
																						}
																					}.getItemStack(world, BlockPos.containing(x, y, z), (int) num1)).getItem() == GochickenModItems.FLINT_CHOKEN.get() && (new Object() {
																						public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																							BlockEntity _ent = world.getBlockEntity(pos);
																							if (_ent != null)
																								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																							return _retval.get();
																						}
																					}.getItemStack(world, BlockPos.containing(x, y, z), (int) num2)).getItem() == GochickenModItems.LOG_CHIKEN.get()) {
																						{
																							BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																							if (_ent != null) {
																								final int _slotid = 5;
																								final ItemStack _setstack = new ItemStack(GochickenModItems.COLA_CHICKEN_SEED.get());
																								_setstack.setCount(1);
																								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																									if (capability instanceof IItemHandlerModifiable)
																										((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																								});
																							}
																						}
																						break;
																					} else {
																						if ((new Object() {
																							public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																								BlockEntity _ent = world.getBlockEntity(pos);
																								if (_ent != null)
																									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																								return _retval.get();
																							}
																						}.getItemStack(world, BlockPos.containing(x, y, z), (int) num1)).getItem() == GochickenModItems.COAL_CHIKEN.get() && (new Object() {
																							public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																								BlockEntity _ent = world.getBlockEntity(pos);
																								if (_ent != null)
																									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																								return _retval.get();
																							}
																						}.getItemStack(world, BlockPos.containing(x, y, z), (int) num2)).getItem() == GochickenModItems.QUARTZ_CHIKEN.get()) {
																							{
																								BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																								if (_ent != null) {
																									final int _slotid = 5;
																									final ItemStack _setstack = new ItemStack(GochickenModItems.LAVA_CHICKEN_SEED.get());
																									_setstack.setCount(1);
																									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																										if (capability instanceof IItemHandlerModifiable)
																											((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																									});
																								}
																							}
																							break;
																						} else {
																							if ((new Object() {
																								public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																									BlockEntity _ent = world.getBlockEntity(pos);
																									if (_ent != null)
																										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																									return _retval.get();
																								}
																							}.getItemStack(world, BlockPos.containing(x, y, z), (int) num1)).getItem() == GochickenModItems.FLINT_CHOKEN.get() && (new Object() {
																								public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																									BlockEntity _ent = world.getBlockEntity(pos);
																									if (_ent != null)
																										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																									return _retval.get();
																								}
																							}.getItemStack(world, BlockPos.containing(x, y, z), (int) num2)).getItem() == GochickenModItems.SAND_CHOKEN.get()) {
																								{
																									BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																									if (_ent != null) {
																										final int _slotid = 5;
																										final ItemStack _setstack = new ItemStack(GochickenModItems.GUNPOWDER_CHICKEN_SEED.get());
																										_setstack.setCount(1);
																										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																											if (capability instanceof IItemHandlerModifiable)
																												((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																										});
																									}
																								}
																								break;
																							} else {
																								if ((new Object() {
																									public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																										AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																										BlockEntity _ent = world.getBlockEntity(pos);
																										if (_ent != null)
																											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																										return _retval.get();
																									}
																								}.getItemStack(world, BlockPos.containing(x, y, z), (int) num1)).getItem() == GochickenModItems.LOG_CHIKEN.get() && (new Object() {
																									public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																										AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																										BlockEntity _ent = world.getBlockEntity(pos);
																										if (_ent != null)
																											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																										return _retval.get();
																									}
																								}.getItemStack(world, BlockPos.containing(x, y, z), (int) num2)).getItem() == GochickenModItems.INK_CHIKEN.get()) {
																									{
																										BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																										if (_ent != null) {
																											final int _slotid = 5;
																											final ItemStack _setstack = new ItemStack(GochickenModItems.STRING_CHICKEN_SEED.get());
																											_setstack.setCount(1);
																											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																												if (capability instanceof IItemHandlerModifiable)
																													((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																											});
																										}
																									}
																									break;
																								} else {
																									if ((new Object() {
																										public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																											AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																											BlockEntity _ent = world.getBlockEntity(pos);
																											if (_ent != null)
																												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																											return _retval.get();
																										}
																									}.getItemStack(world, BlockPos.containing(x, y, z), (int) num1)).getItem() == GochickenModItems.STRING_CHICKEN.get() && (new Object() {
																										public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																											AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																											BlockEntity _ent = world.getBlockEntity(pos);
																											if (_ent != null)
																												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																											return _retval.get();
																										}
																									}.getItemStack(world, BlockPos.containing(x, y, z), (int) num2)).getItem() == GochickenModItems.BROWN_CHIKEN.get()) {
																										{
																											BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																											if (_ent != null) {
																												final int _slotid = 5;
																												final ItemStack _setstack = new ItemStack(GochickenModItems.LEATHER_CHICKEN_SEED.get());
																												_setstack.setCount(1);
																												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																													if (capability instanceof IItemHandlerModifiable)
																														((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																												});
																											}
																										}
																										break;
																									} else {
																										if ((new Object() {
																											public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																												AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																												BlockEntity _ent = world.getBlockEntity(pos);
																												if (_ent != null)
																													_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																															.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																												return _retval.get();
																											}
																										}.getItemStack(world, BlockPos.containing(x, y, z), (int) num1)).getItem() == GochickenModItems.BROWN_CHIKEN.get() && (new Object() {
																											public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																												AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																												BlockEntity _ent = world.getBlockEntity(pos);
																												if (_ent != null)
																													_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																															.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																												return _retval.get();
																											}
																										}.getItemStack(world, BlockPos.containing(x, y, z), (int) num2)).getItem() == GochickenModItems.YELLOW_CHIKEN.get()) {
																											{
																												BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																												if (_ent != null) {
																													final int _slotid = 5;
																													final ItemStack _setstack = new ItemStack(GochickenModItems.COOPER_CHICKEN_SEED.get());
																													_setstack.setCount(1);
																													_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																														if (capability instanceof IItemHandlerModifiable)
																															((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																													});
																												}
																											}
																											break;
																										} else {
																											if ((new Object() {
																												public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																													AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																													BlockEntity _ent = world.getBlockEntity(pos);
																													if (_ent != null)
																														_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																													return _retval.get();
																												}
																											}.getItemStack(world, BlockPos.containing(x, y, z), (int) num1)).getItem() == GochickenModItems.CLAY_CHIKEN.get() && (new Object() {
																												public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																													AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																													BlockEntity _ent = world.getBlockEntity(pos);
																													if (_ent != null)
																														_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																													return _retval.get();
																												}
																											}.getItemStack(world, BlockPos.containing(x, y, z), (int) num2)).getItem() == GochickenModItems.GUNPOWDER_CHICKEN.get()) {
																												{
																													BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																													if (_ent != null) {
																														final int _slotid = 5;
																														final ItemStack _setstack = new ItemStack(GochickenModItems.NETHRRACK_CHIECKEN_SEED.get());
																														_setstack.setCount(1);
																														_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																															if (capability instanceof IItemHandlerModifiable)
																																((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																														});
																													}
																												}
																												break;
																											} else {
																												if ((new Object() {
																													public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																														AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																														BlockEntity _ent = world.getBlockEntity(pos);
																														if (_ent != null)
																															_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																	.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																														return _retval.get();
																													}
																												}.getItemStack(world, BlockPos.containing(x, y, z), (int) num1)).getItem() == GochickenModItems.LAVA_CHIKEN.get() && (new Object() {
																													public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																														AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																														BlockEntity _ent = world.getBlockEntity(pos);
																														if (_ent != null)
																															_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																	.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																														return _retval.get();
																													}
																												}.getItemStack(world, BlockPos.containing(x, y, z), (int) num2)).getItem() == GochickenModItems.GOLD_CHIKEN.get()) {
																													{
																														BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																														if (_ent != null) {
																															final int _slotid = 5;
																															final ItemStack _setstack = new ItemStack(GochickenModItems.BLAZE_CHICKEN_SEED.get());
																															_setstack.setCount(1);
																															_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																																if (capability instanceof IItemHandlerModifiable)
																																	((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																															});
																														}
																													}
																													break;
																												} else {
																													if ((new Object() {
																														public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																															AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																															BlockEntity _ent = world.getBlockEntity(pos);
																															if (_ent != null)
																																_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																		.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																															return _retval.get();
																														}
																													}.getItemStack(world, BlockPos.containing(x, y, z), (int) num1)).getItem() == GochickenModItems.SILME_CHIKEN.get() && (new Object() {
																														public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																															AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																															BlockEntity _ent = world.getBlockEntity(pos);
																															if (_ent != null)
																																_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																		.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																															return _retval.get();
																														}
																													}.getItemStack(world, BlockPos.containing(x, y, z), (int) num2)).getItem() == GochickenModItems.BLAZECHICKEN.get()) {
																														{
																															BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																															if (_ent != null) {
																																final int _slotid = 5;
																																final ItemStack _setstack = new ItemStack(GochickenModItems.MAGMA_CREAM_CHICKEN_SEED.get());
																																_setstack.setCount(1);
																																_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																																	if (capability instanceof IItemHandlerModifiable)
																																		((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																																});
																															}
																														}
																														break;
																													} else {
																														if ((new Object() {
																															public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																																AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																																BlockEntity _ent = world.getBlockEntity(pos);
																																if (_ent != null)
																																	_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																			.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																																return _retval.get();
																															}
																														}.getItemStack(world, BlockPos.containing(x, y, z), (int) num1)).getItem() == GochickenModItems.GLASS_CHIKEN.get()
																																&& (new Object() {
																																	public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																																		AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																																		BlockEntity _ent = world.getBlockEntity(pos);
																																		if (_ent != null)
																																			_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																					.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																																		return _retval.get();
																																	}
																																}.getItemStack(world, BlockPos.containing(x, y, z), (int) num2)).getItem() == GochickenModItems.DIAMOND_CHICKEN.get()) {
																															{
																																BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																																if (_ent != null) {
																																	final int _slotid = 5;
																																	final ItemStack _setstack = new ItemStack(GochickenModItems.DIAMOND_CHICKEN_SEED.get());
																																	_setstack.setCount(1);
																																	_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																																		if (capability instanceof IItemHandlerModifiable)
																																			((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																																	});
																																}
																															}
																															break;
																														} else {
																															if ((new Object() {
																																public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																																	AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																																	BlockEntity _ent = world.getBlockEntity(pos);
																																	if (_ent != null)
																																		_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																				.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																																	return _retval.get();
																																}
																															}.getItemStack(world, BlockPos.containing(x, y, z), (int) num1)).getItem() == GochickenModItems.BONE_CHIKEN.get()
																																	&& (new Object() {
																																		public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																																			AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																																			BlockEntity _ent = world.getBlockEntity(pos);
																																			if (_ent != null)
																																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																						.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																																			return _retval.get();
																																		}
																																	}.getItemStack(world, BlockPos.containing(x, y, z), (int) num2)).getItem() == GochickenModItems.CLAY_CHIKEN.get()) {
																																{
																																	BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																																	if (_ent != null) {
																																		final int _slotid = 5;
																																		final ItemStack _setstack = new ItemStack(GochickenModItems.ZNIC_CHICKEN_SEED.get());
																																		_setstack.setCount(1);
																																		_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																																			if (capability instanceof IItemHandlerModifiable)
																																				((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																																		});
																																	}
																																}
																																break;
																															} else {
																																if ((new Object() {
																																	public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																																		AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																																		BlockEntity _ent = world.getBlockEntity(pos);
																																		if (_ent != null)
																																			_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																					.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																																		return _retval.get();
																																	}
																																}.getItemStack(world, BlockPos.containing(x, y, z), (int) num1)).getItem() == GochickenModItems.CACTUS_CHIKEN.get()
																																		&& (new Object() {
																																			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																																				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																																				BlockEntity _ent = world.getBlockEntity(pos);
																																				if (_ent != null)
																																					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																																				return _retval.get();
																																			}
																																		}.getItemStack(world, BlockPos.containing(x, y, z), (int) num2)).getItem() == GochickenModItems.DIAMOND_CHIKEN
																																				.get()) {
																																	{
																																		BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																																		if (_ent != null) {
																																			final int _slotid = 5;
																																			final ItemStack _setstack = new ItemStack(GochickenModItems.EMERALD_CHICKEN_SEED.get());
																																			_setstack.setCount(1);
																																			_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																																				if (capability instanceof IItemHandlerModifiable)
																																					((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																																			});
																																		}
																																	}
																																	break;
																																} else {
																																	if ((new Object() {
																																		public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																																			AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																																			BlockEntity _ent = world.getBlockEntity(pos);
																																			if (_ent != null)
																																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																						.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																																			return _retval.get();
																																		}
																																	}.getItemStack(world, BlockPos.containing(x, y, z), (int) num1)).getItem() == GochickenModItems.CACTUS_CHIKEN.get()
																																			&& (new Object() {
																																				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																																					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																																					BlockEntity _ent = world.getBlockEntity(pos);
																																					if (_ent != null)
																																						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																								.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																																					return _retval.get();
																																				}
																																			}.getItemStack(world, BlockPos.containing(x, y, z), (int) num2))
																																					.getItem() == GochickenModItems.EMERALD_CHICKEN.get()) {
																																		{
																																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																																			if (_ent != null) {
																																				final int _slotid = 5;
																																				final ItemStack _setstack = new ItemStack(GochickenModItems.XP_CHICKEN_SEED.get());
																																				_setstack.setCount(1);
																																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																																					if (capability instanceof IItemHandlerModifiable)
																																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																																				});
																																			}
																																		}
																																		break;
																																	} else {
																																		if ((new Object() {
																																			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																																				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																																				BlockEntity _ent = world.getBlockEntity(pos);
																																				if (_ent != null)
																																					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																																				return _retval.get();
																																			}
																																		}.getItemStack(world, BlockPos.containing(x, y, z), (int) num1)).getItem() == GochickenModItems.SNOWBALL.get()
																																				&& (new Object() {
																																					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																																						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																																						BlockEntity _ent = world.getBlockEntity(pos);
																																						if (_ent != null)
																																							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																									.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																																						return _retval.get();
																																					}
																																				}.getItemStack(world, BlockPos.containing(x, y, z), (int) num2))
																																						.getItem() == GochickenModItems.GUNPOWDER_CHICKEN.get()) {
																																			{
																																				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																																				if (_ent != null) {
																																					final int _slotid = 5;
																																					final ItemStack _setstack = new ItemStack(GochickenModItems.WATER_CHICKEN_SEED.get());
																																					_setstack.setCount(1);
																																					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																																						if (capability instanceof IItemHandlerModifiable)
																																							((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																																					});
																																				}
																																			}
																																			break;
																																		} else {
																																			if ((new Object() {
																																				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																																					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																																					BlockEntity _ent = world.getBlockEntity(pos);
																																					if (_ent != null)
																																						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																								.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																																					return _retval.get();
																																				}
																																			}.getItemStack(world, BlockPos.containing(x, y, z), (int) num1)).getItem() == GochickenModItems.WATER_CHICKEN
																																					.get() && (new Object() {
																																						public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																																							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																																							BlockEntity _ent = world.getBlockEntity(pos);
																																							if (_ent != null)
																																								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																										.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																																							return _retval.get();
																																						}
																																					}.getItemStack(world, BlockPos.containing(x, y, z), (int) num2))
																																							.getItem() == GochickenModItems.LAVA_CHIKEN.get()) {
																																				{
																																					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																																					if (_ent != null) {
																																						final int _slotid = 5;
																																						final ItemStack _setstack = new ItemStack(GochickenModItems.OBSIDIAN_CHICKEN_SEED.get());
																																						_setstack.setCount(1);
																																						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																																							if (capability instanceof IItemHandlerModifiable)
																																								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																																						});
																																					}
																																				}
																																				break;
																																			} else {
																																				if ((new Object() {
																																					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																																						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																																						BlockEntity _ent = world.getBlockEntity(pos);
																																						if (_ent != null)
																																							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																									.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																																						return _retval.get();
																																					}
																																				}.getItemStack(world, BlockPos.containing(x, y, z), (int) num1))
																																						.getItem() == GochickenModItems.BLAZECHICKEN.get() && (new Object() {
																																							public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																																								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																																								BlockEntity _ent = world.getBlockEntity(pos);
																																								if (_ent != null)
																																									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(
																																											capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																																								return _retval.get();
																																							}
																																						}.getItemStack(world, BlockPos.containing(x, y, z), (int) num2))
																																								.getItem() == GochickenModItems.BONE_CHIKEN.get()) {
																																					{
																																						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																																						if (_ent != null) {
																																							final int _slotid = 5;
																																							final ItemStack _setstack = new ItemStack(GochickenModItems.GHAST_CHICKEN_SEED.get());
																																							_setstack.setCount(1);
																																							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																																								if (capability instanceof IItemHandlerModifiable)
																																									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																																							});
																																						}
																																					}
																																					break;
																																				} else {
																																					if ((new Object() {
																																						public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																																							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																																							BlockEntity _ent = world.getBlockEntity(pos);
																																							if (_ent != null)
																																								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																										.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																																							return _retval.get();
																																						}
																																					}.getItemStack(world, BlockPos.containing(x, y, z), (int) num1))
																																							.getItem() == GochickenModItems.WATER_CHICKEN.get() && (new Object() {
																																								public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																																									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																																									BlockEntity _ent = world.getBlockEntity(pos);
																																									if (_ent != null)
																																										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(
																																												capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																																									return _retval.get();
																																								}
																																							}.getItemStack(world, BlockPos.containing(x, y, z), (int) num2))
																																									.getItem() == GochickenModItems.LAPIS_CHIKEN.get()) {
																																						{
																																							BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																																							if (_ent != null) {
																																								final int _slotid = 5;
																																								final ItemStack _setstack = new ItemStack(
																																										GochickenModItems.SEALANTERN_CHICKEN_SEED.get());
																																								_setstack.setCount(1);
																																								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																																									if (capability instanceof IItemHandlerModifiable)
																																										((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																																								});
																																							}
																																						}
																																						break;
																																					} else {
																																						num1 = 2;
																																						num2 = 1;
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							} else {
								if (new Object() {
									public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
										AtomicInteger _retval = new AtomicInteger(0);
										BlockEntity _ent = world.getBlockEntity(pos);
										if (_ent != null)
											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
										return _retval.get();
									}
								}.getAmount(world, BlockPos.containing(x, y, z), 5) != 64) {
									{
										BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
										if (_ent != null) {
											final int _slotid = 5;
											final ItemStack _setstack = (new Object() {
												public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
													AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
													BlockEntity _ent = world.getBlockEntity(pos);
													if (_ent != null)
														_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
													return _retval.get();
												}
											}.getItemStack(world, BlockPos.containing(x, y, z), 5));
											_setstack.setCount((int) (new Object() {
												public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
													AtomicInteger _retval = new AtomicInteger(0);
													BlockEntity _ent = world.getBlockEntity(pos);
													if (_ent != null)
														_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
													return _retval.get();
												}
											}.getAmount(world, BlockPos.containing(x, y, z), 5) + 1));
											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
												if (capability instanceof IItemHandlerModifiable)
													((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
											});
										}
									}
								}
							}
							if (new Object() {
								public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicInteger _retval = new AtomicInteger(0);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
									return _retval.get();
								}
							}.getAmount(world, BlockPos.containing(x, y, z), 5) != 0) {
								{
									BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
									if (_ent != null) {
										final int _slotid = 0;
										final int _amount = 2;
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
											if (capability instanceof IItemHandlerModifiable) {
												ItemStack _stk = capability.getStackInSlot(_slotid).copy();
												_stk.shrink(_amount);
												((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
											}
										});
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
