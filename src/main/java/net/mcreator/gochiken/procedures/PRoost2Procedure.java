package net.mcreator.gochiken.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class PRoost2Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double flg = 0;
		double num = 0;
		ItemStack item = ItemStack.EMPTY;
		if (new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, BlockPos.containing(x, y, z), 0) >= 1 && new Object() {
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
		}.getAmount(world, BlockPos.containing(x, y, z), 6) == 0 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, BlockPos.containing(x, y, z), 9) == 0 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, BlockPos.containing(x, y, z), 12) == 0 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, BlockPos.containing(x, y, z), 15) == 0) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putString("ID0", ((new Object() {
						public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
							return _retval.get();
						}
					}.getItemStack(world, BlockPos.containing(x, y, z), 0)).getDisplayName().getString()));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
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
		}.getAmount(world, BlockPos.containing(x, y, z), 1) >= 1 && new Object() {
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
		}.getAmount(world, BlockPos.containing(x, y, z), 7) == 0 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, BlockPos.containing(x, y, z), 10) == 0 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, BlockPos.containing(x, y, z), 13) == 0 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, BlockPos.containing(x, y, z), 16) == 0) {
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
		}
		if (new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, BlockPos.containing(x, y, z), 2) >= 1 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, BlockPos.containing(x, y, z), 5) == 0 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, BlockPos.containing(x, y, z), 8) == 0 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, BlockPos.containing(x, y, z), 11) == 0 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, BlockPos.containing(x, y, z), 14) == 0 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, BlockPos.containing(x, y, z), 17) == 0) {
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
		num = 0;
		flg = 0;
		for (int index0 = 0; index0 < 3; index0++) {
			if (num == 0 && (new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getString(tag);
					return "";
				}
			}.getValue(world, BlockPos.containing(x, y, z), "ID0")).equals((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
					return _retval.get();
				}
			}.getItemStack(world, BlockPos.containing(x, y, z), 0)).getDisplayName().getString())) {
				flg = 1;
			}
			if (num == 1 && (new Object() {
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
			}.getItemStack(world, BlockPos.containing(x, y, z), 1)).getDisplayName().getString())) {
				flg = 1;
			}
			if (num == 2 && (new Object() {
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
			if (flg == 1) {
				item = (new Object() {
					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
						return _retval.get();
					}
				}.getItemStack(world, BlockPos.containing(x, y, z), (int) (num + 3)));
				if (new Object() {
					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicInteger _retval = new AtomicInteger(0);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
						return _retval.get();
					}
				}.getAmount(world, BlockPos.containing(x, y, z), (int) (num + 3)) != 64) {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						if (_ent != null) {
							final int _slotid = (int) (num + 3);
							final ItemStack _setstack = item;
							_setstack.setCount((int) (new Object() {
								public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicInteger _retval = new AtomicInteger(0);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
									return _retval.get();
								}
							}.getAmount(world, BlockPos.containing(x, y, z), (int) (num + 3)) + 1));
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
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
					}.getAmount(world, BlockPos.containing(x, y, z), (int) (num + 6)) != 64) {
						{
							BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
							if (_ent != null) {
								final int _slotid = (int) (num + 6);
								final ItemStack _setstack = item;
								_setstack.setCount((int) (new Object() {
									public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
										AtomicInteger _retval = new AtomicInteger(0);
										BlockEntity _ent = world.getBlockEntity(pos);
										if (_ent != null)
											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
										return _retval.get();
									}
								}.getAmount(world, BlockPos.containing(x, y, z), (int) (num + 6)) + 1));
								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable)
										((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
								});
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
						}.getAmount(world, BlockPos.containing(x, y, z), (int) (num + 9)) != 64) {
							{
								BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
								if (_ent != null) {
									final int _slotid = (int) (num + 9);
									final ItemStack _setstack = item;
									_setstack.setCount((int) (new Object() {
										public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
											AtomicInteger _retval = new AtomicInteger(0);
											BlockEntity _ent = world.getBlockEntity(pos);
											if (_ent != null)
												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
											return _retval.get();
										}
									}.getAmount(world, BlockPos.containing(x, y, z), (int) (num + 9)) + 1));
									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
										if (capability instanceof IItemHandlerModifiable)
											((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
									});
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
							}.getAmount(world, BlockPos.containing(x, y, z), (int) (num + 12)) != 64) {
								{
									BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
									if (_ent != null) {
										final int _slotid = (int) (num + 12);
										final ItemStack _setstack = item;
										_setstack.setCount((int) (new Object() {
											public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
												AtomicInteger _retval = new AtomicInteger(0);
												BlockEntity _ent = world.getBlockEntity(pos);
												if (_ent != null)
													_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
												return _retval.get();
											}
										}.getAmount(world, BlockPos.containing(x, y, z), (int) (num + 12)) + 1));
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
											if (capability instanceof IItemHandlerModifiable)
												((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
										});
									}
								}
							} else {
								{
									BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
									if (_ent != null) {
										final int _slotid = (int) (num + 15);
										final ItemStack _setstack = item;
										_setstack.setCount((int) (new Object() {
											public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
												AtomicInteger _retval = new AtomicInteger(0);
												BlockEntity _ent = world.getBlockEntity(pos);
												if (_ent != null)
													_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
												return _retval.get();
											}
										}.getAmount(world, BlockPos.containing(x, y, z), (int) (num + 15)) + 1));
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
											if (capability instanceof IItemHandlerModifiable)
												((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
										});
									}
								}
							}
						}
					}
				}
			}
			num = num + 1;
			flg = 0;
		}
		num = 0;
		for (int index1 = 0; index1 < 3; index1++) {
			if (new Object() {
				public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
					return _retval.get();
				}
			}.getAmount(world, BlockPos.containing(x, y, z), (int) (num + 3)) == 0) {
				if ((new Object() {
					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
						return _retval.get();
					}
				}.getItemStack(world, BlockPos.containing(x, y, z), (int) num)).getItem() == GochickenModItems.LOG_CHIKEN.get()) {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						if (_ent != null) {
							final int _slotid = (int) (num + 3);
							final ItemStack _setstack = new ItemStack(Blocks.OAK_LOG);
							_setstack.setCount(1);
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
						}
					}
				} else {
					if ((new Object() {
						public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
							return _retval.get();
						}
					}.getItemStack(world, BlockPos.containing(x, y, z), (int) num)).getItem() == GochickenModItems.SAND_CHOKEN.get()) {
						{
							BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
							if (_ent != null) {
								final int _slotid = (int) (num + 3);
								final ItemStack _setstack = new ItemStack(Blocks.SAND);
								_setstack.setCount(1);
								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable)
										((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
								});
							}
						}
					} else {
						if ((new Object() {
							public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								BlockEntity _ent = world.getBlockEntity(pos);
								if (_ent != null)
									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
								return _retval.get();
							}
						}.getItemStack(world, BlockPos.containing(x, y, z), (int) num)).getItem() == GochickenModItems.FLINT_CHOKEN.get()) {
							{
								BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
								if (_ent != null) {
									final int _slotid = (int) (num + 3);
									final ItemStack _setstack = new ItemStack(Blocks.GRAVEL);
									_setstack.setCount(1);
									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
										if (capability instanceof IItemHandlerModifiable)
											((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
									});
								}
							}
						} else {
							if ((new Object() {
								public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
									return _retval.get();
								}
							}.getItemStack(world, BlockPos.containing(x, y, z), (int) num)).getItem() == GochickenModItems.BONE_CHIKEN.get()) {
								{
									BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
									if (_ent != null) {
										final int _slotid = (int) (num + 3);
										final ItemStack _setstack = new ItemStack(Items.BONE);
										_setstack.setCount(1);
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
											if (capability instanceof IItemHandlerModifiable)
												((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
										});
									}
								}
							} else {
								if ((new Object() {
									public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
										AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
										BlockEntity _ent = world.getBlockEntity(pos);
										if (_ent != null)
											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
										return _retval.get();
									}
								}.getItemStack(world, BlockPos.containing(x, y, z), (int) num)).getItem() == GochickenModItems.LAPIS_CHIKEN.get()) {
									{
										BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
										if (_ent != null) {
											final int _slotid = (int) (num + 3);
											final ItemStack _setstack = new ItemStack(Items.LAPIS_LAZULI);
											_setstack.setCount(1);
											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
												if (capability instanceof IItemHandlerModifiable)
													((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
											});
										}
									}
								} else {
									if ((new Object() {
										public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
											AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
											BlockEntity _ent = world.getBlockEntity(pos);
											if (_ent != null)
												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
											return _retval.get();
										}
									}.getItemStack(world, BlockPos.containing(x, y, z), (int) num)).getItem() == GochickenModItems.INK_CHIKEN.get()) {
										{
											BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
											if (_ent != null) {
												final int _slotid = (int) (num + 3);
												final ItemStack _setstack = new ItemStack(Items.INK_SAC);
												_setstack.setCount(1);
												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
													if (capability instanceof IItemHandlerModifiable)
														((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
												});
											}
										}
									} else {
										if ((new Object() {
											public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
												AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
												BlockEntity _ent = world.getBlockEntity(pos);
												if (_ent != null)
													_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
												return _retval.get();
											}
										}.getItemStack(world, BlockPos.containing(x, y, z), (int) num)).getItem() == GochickenModItems.MAGENTA_CHIKEN.get()) {
											{
												BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
												if (_ent != null) {
													final int _slotid = (int) (num + 3);
													final ItemStack _setstack = new ItemStack(Items.MAGENTA_DYE);
													_setstack.setCount(1);
													_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
														if (capability instanceof IItemHandlerModifiable)
															((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
													});
												}
											}
										} else {
											if ((new Object() {
												public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
													AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
													BlockEntity _ent = world.getBlockEntity(pos);
													if (_ent != null)
														_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
													return _retval.get();
												}
											}.getItemStack(world, BlockPos.containing(x, y, z), (int) num)).getItem() == GochickenModItems.LIME_CHIKEN.get()) {
												{
													BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
													if (_ent != null) {
														final int _slotid = (int) (num + 3);
														final ItemStack _setstack = new ItemStack(Items.LIME_DYE);
														_setstack.setCount(1);
														_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
															if (capability instanceof IItemHandlerModifiable)
																((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
														});
													}
												}
											} else {
												if ((new Object() {
													public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
														AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
														BlockEntity _ent = world.getBlockEntity(pos);
														if (_ent != null)
															_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
														return _retval.get();
													}
												}.getItemStack(world, BlockPos.containing(x, y, z), (int) num)).getItem() == GochickenModItems.YELLOW_CHIKEN.get()) {
													{
														BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
														if (_ent != null) {
															final int _slotid = (int) (num + 3);
															final ItemStack _setstack = new ItemStack(Items.YELLOW_DYE);
															_setstack.setCount(1);
															_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																if (capability instanceof IItemHandlerModifiable)
																	((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
															});
														}
													}
												} else {
													if ((new Object() {
														public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
															AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
															BlockEntity _ent = world.getBlockEntity(pos);
															if (_ent != null)
																_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
															return _retval.get();
														}
													}.getItemStack(world, BlockPos.containing(x, y, z), (int) num)).getItem() == GochickenModItems.PUPLE_CHIKEN.get()) {
														{
															BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
															if (_ent != null) {
																final int _slotid = (int) (num + 3);
																final ItemStack _setstack = new ItemStack(Items.PURPLE_DYE);
																_setstack.setCount(1);
																_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																	if (capability instanceof IItemHandlerModifiable)
																		((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																});
															}
														}
													} else {
														if ((new Object() {
															public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																BlockEntity _ent = world.getBlockEntity(pos);
																if (_ent != null)
																	_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																return _retval.get();
															}
														}.getItemStack(world, BlockPos.containing(x, y, z), (int) num)).getItem() == GochickenModItems.CACTUS_CHIKEN.get()) {
															{
																BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																if (_ent != null) {
																	final int _slotid = (int) (num + 3);
																	final ItemStack _setstack = new ItemStack(Blocks.CACTUS);
																	_setstack.setCount(1);
																	_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																		if (capability instanceof IItemHandlerModifiable)
																			((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																	});
																}
															}
														} else {
															if ((new Object() {
																public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																	AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																	BlockEntity _ent = world.getBlockEntity(pos);
																	if (_ent != null)
																		_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																	return _retval.get();
																}
															}.getItemStack(world, BlockPos.containing(x, y, z), (int) num)).getItem() == GochickenModItems.LIGHT_GRAY_CHIKEN.get()) {
																{
																	BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																	if (_ent != null) {
																		final int _slotid = (int) (num + 3);
																		final ItemStack _setstack = new ItemStack(Items.LIGHT_GRAY_DYE);
																		_setstack.setCount(1);
																		_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																			if (capability instanceof IItemHandlerModifiable)
																				((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																		});
																	}
																}
															} else {
																if ((new Object() {
																	public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																		AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																		BlockEntity _ent = world.getBlockEntity(pos);
																		if (_ent != null)
																			_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																		return _retval.get();
																	}
																}.getItemStack(world, BlockPos.containing(x, y, z), (int) num)).getItem() == GochickenModItems.LIGHT_BLUE_CHIKEN.get()) {
																	{
																		BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																		if (_ent != null) {
																			final int _slotid = (int) (num + 3);
																			final ItemStack _setstack = new ItemStack(Items.LIGHT_BLUE_DYE);
																			_setstack.setCount(1);
																			_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																				if (capability instanceof IItemHandlerModifiable)
																					((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																			});
																		}
																	}
																} else {
																	if ((new Object() {
																		public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																			AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																			BlockEntity _ent = world.getBlockEntity(pos);
																			if (_ent != null)
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																			return _retval.get();
																		}
																	}.getItemStack(world, BlockPos.containing(x, y, z), (int) num)).getItem() == GochickenModItems.CYAN_CHIKEN.get()) {
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = (int) (num + 3);
																				final ItemStack _setstack = new ItemStack(Items.CYAN_DYE);
																				_setstack.setCount(1);
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable)
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																				});
																			}
																		}
																	} else {
																		if ((new Object() {
																			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																				BlockEntity _ent = world.getBlockEntity(pos);
																				if (_ent != null)
																					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																				return _retval.get();
																			}
																		}.getItemStack(world, BlockPos.containing(x, y, z), (int) num)).getItem() == GochickenModItems.RED_CHIKEN.get()) {
																			{
																				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																				if (_ent != null) {
																					final int _slotid = (int) (num + 3);
																					final ItemStack _setstack = new ItemStack(Items.RED_DYE);
																					_setstack.setCount(1);
																					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																						if (capability instanceof IItemHandlerModifiable)
																							((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																					});
																				}
																			}
																		} else {
																			if ((new Object() {
																				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																					BlockEntity _ent = world.getBlockEntity(pos);
																					if (_ent != null)
																						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																					return _retval.get();
																				}
																			}.getItemStack(world, BlockPos.containing(x, y, z), (int) num)).getItem() == GochickenModItems.PINK_CHIKEN.get()) {
																				{
																					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																					if (_ent != null) {
																						final int _slotid = (int) (num + 3);
																						final ItemStack _setstack = new ItemStack(Items.PINK_DYE);
																						_setstack.setCount(1);
																						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																							if (capability instanceof IItemHandlerModifiable)
																								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																						});
																					}
																				}
																			} else {
																				if ((new Object() {
																					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																						BlockEntity _ent = world.getBlockEntity(pos);
																						if (_ent != null)
																							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																						return _retval.get();
																					}
																				}.getItemStack(world, BlockPos.containing(x, y, z), (int) num)).getItem() == GochickenModItems.ORANGE_CHIKEN.get()) {
																					{
																						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																						if (_ent != null) {
																							final int _slotid = (int) (num + 3);
																							final ItemStack _setstack = new ItemStack(Items.ORANGE_DYE);
																							_setstack.setCount(1);
																							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																								if (capability instanceof IItemHandlerModifiable)
																									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																							});
																						}
																					}
																				} else {
																					if ((new Object() {
																						public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																							BlockEntity _ent = world.getBlockEntity(pos);
																							if (_ent != null)
																								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																							return _retval.get();
																						}
																					}.getItemStack(world, BlockPos.containing(x, y, z), (int) num)).getItem() == GochickenModItems.GRAY_CHIKEN.get()) {
																						{
																							BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																							if (_ent != null) {
																								final int _slotid = (int) (num + 3);
																								final ItemStack _setstack = new ItemStack(Items.GRAY_DYE);
																								_setstack.setCount(1);
																								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																									if (capability instanceof IItemHandlerModifiable)
																										((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																								});
																							}
																						}
																					} else {
																						if ((new Object() {
																							public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																								BlockEntity _ent = world.getBlockEntity(pos);
																								if (_ent != null)
																									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																								return _retval.get();
																							}
																						}.getItemStack(world, BlockPos.containing(x, y, z), (int) num)).getItem() == GochickenModItems.BROWN_CHIKEN.get()) {
																							{
																								BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																								if (_ent != null) {
																									final int _slotid = (int) (num + 3);
																									final ItemStack _setstack = new ItemStack(Items.COCOA_BEANS);
																									_setstack.setCount(1);
																									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																										if (capability instanceof IItemHandlerModifiable)
																											((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																									});
																								}
																							}
																						} else {
																							if ((new Object() {
																								public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																									BlockEntity _ent = world.getBlockEntity(pos);
																									if (_ent != null)
																										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																									return _retval.get();
																								}
																							}.getItemStack(world, BlockPos.containing(x, y, z), (int) num)).getItem() == GochickenModItems.IRON_CHIKEN.get()) {
																								{
																									BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																									if (_ent != null) {
																										final int _slotid = (int) (num + 3);
																										final ItemStack _setstack = new ItemStack(Items.IRON_INGOT);
																										_setstack.setCount(1);
																										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																											if (capability instanceof IItemHandlerModifiable)
																												((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																										});
																									}
																								}
																							} else {
																								if ((new Object() {
																									public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																										AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																										BlockEntity _ent = world.getBlockEntity(pos);
																										if (_ent != null)
																											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																										return _retval.get();
																									}
																								}.getItemStack(world, BlockPos.containing(x, y, z), (int) num)).getItem() == GochickenModItems.REDSTONE_CHIKEN.get()) {
																									{
																										BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																										if (_ent != null) {
																											final int _slotid = (int) (num + 3);
																											final ItemStack _setstack = new ItemStack(Items.REDSTONE);
																											_setstack.setCount(1);
																											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																												if (capability instanceof IItemHandlerModifiable)
																													((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																											});
																										}
																									}
																								} else {
																									if ((new Object() {
																										public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																											AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																											BlockEntity _ent = world.getBlockEntity(pos);
																											if (_ent != null)
																												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																											return _retval.get();
																										}
																									}.getItemStack(world, BlockPos.containing(x, y, z), (int) num)).getItem() == GochickenModItems.GOLD_CHIKEN.get()) {
																										{
																											BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																											if (_ent != null) {
																												final int _slotid = (int) (num + 3);
																												final ItemStack _setstack = new ItemStack(Items.GOLD_INGOT);
																												_setstack.setCount(1);
																												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																													if (capability instanceof IItemHandlerModifiable)
																														((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																												});
																											}
																										}
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
																										}.getItemStack(world, BlockPos.containing(x, y, z), (int) num)).getItem() == GochickenModItems.QUARTZ_CHIKEN.get()) {
																											{
																												BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																												if (_ent != null) {
																													final int _slotid = (int) (num + 3);
																													final ItemStack _setstack = new ItemStack(Items.QUARTZ);
																													_setstack.setCount(1);
																													_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																														if (capability instanceof IItemHandlerModifiable)
																															((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																													});
																												}
																											}
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
																											}.getItemStack(world, BlockPos.containing(x, y, z), (int) num)).getItem() == GochickenModItems.GLASS_CHIKEN.get()) {
																												{
																													BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																													if (_ent != null) {
																														final int _slotid = (int) (num + 3);
																														final ItemStack _setstack = new ItemStack(Blocks.GLASS);
																														_setstack.setCount(1);
																														_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																															if (capability instanceof IItemHandlerModifiable)
																																((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																														});
																													}
																												}
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
																												}.getItemStack(world, BlockPos.containing(x, y, z), (int) num)).getItem() == GochickenModItems.DIAMOND_CHIKEN.get()) {
																													{
																														BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																														if (_ent != null) {
																															final int _slotid = (int) (num + 3);
																															final ItemStack _setstack = new ItemStack(Items.DIAMOND);
																															_setstack.setCount(1);
																															_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																																if (capability instanceof IItemHandlerModifiable)
																																	((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																															});
																														}
																													}
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
																													}.getItemStack(world, BlockPos.containing(x, y, z), (int) num)).getItem() == GochickenModItems.GLOWSTONE_CHIKEN.get()) {
																														{
																															BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																															if (_ent != null) {
																																final int _slotid = (int) (num + 3);
																																final ItemStack _setstack = new ItemStack(Items.GLOWSTONE_DUST);
																																_setstack.setCount(1);
																																_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																																	if (capability instanceof IItemHandlerModifiable)
																																		((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																																});
																															}
																														}
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
																														}.getItemStack(world, BlockPos.containing(x, y, z), (int) num)).getItem() == GochickenModItems.NETHERWART_CHIKEN.get()) {
																															{
																																BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																																if (_ent != null) {
																																	final int _slotid = (int) (num + 3);
																																	final ItemStack _setstack = new ItemStack(Items.NETHER_WART);
																																	_setstack.setCount(1);
																																	_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																																		if (capability instanceof IItemHandlerModifiable)
																																			((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																																	});
																																}
																															}
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
																															}.getItemStack(world, BlockPos.containing(x, y, z), (int) num)).getItem() == GochickenModItems.ENDER_CHIKEN.get()) {
																																{
																																	BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																																	if (_ent != null) {
																																		final int _slotid = (int) (num + 3);
																																		final ItemStack _setstack = new ItemStack(Items.ENDER_PEARL);
																																		_setstack.setCount(1);
																																		_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																																			if (capability instanceof IItemHandlerModifiable)
																																				((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																																		});
																																	}
																																}
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
																																}.getItemStack(world, BlockPos.containing(x, y, z), (int) num)).getItem() == GochickenModItems.SNOWBALL.get()) {
																																	{
																																		BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																																		if (_ent != null) {
																																			final int _slotid = (int) (num + 3);
																																			final ItemStack _setstack = new ItemStack(Items.SNOWBALL);
																																			_setstack.setCount(1);
																																			_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																																				if (capability instanceof IItemHandlerModifiable)
																																					((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																																			});
																																		}
																																	}
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
																																	}.getItemStack(world, BlockPos.containing(x, y, z), (int) num)).getItem() == GochickenModItems.CLAY_CHIKEN.get()) {
																																		{
																																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																																			if (_ent != null) {
																																				final int _slotid = (int) (num + 3);
																																				final ItemStack _setstack = new ItemStack(Items.CLAY_BALL);
																																				_setstack.setCount(1);
																																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																																					if (capability instanceof IItemHandlerModifiable)
																																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																																				});
																																			}
																																		}
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
																																		}.getItemStack(world, BlockPos.containing(x, y, z), (int) num)).getItem() == GochickenModItems.SILME_CHIKEN
																																				.get()) {
																																			{
																																				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																																				if (_ent != null) {
																																					final int _slotid = (int) (num + 3);
																																					final ItemStack _setstack = new ItemStack(Items.SLIME_BALL);
																																					_setstack.setCount(1);
																																					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																																						if (capability instanceof IItemHandlerModifiable)
																																							((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																																					});
																																				}
																																			}
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
																																			}.getItemStack(world, BlockPos.containing(x, y, z), (int) num)).getItem() == GochickenModItems.COAL_CHIKEN
																																					.get()) {
																																				{
																																					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																																					if (_ent != null) {
																																						final int _slotid = (int) (num + 3);
																																						final ItemStack _setstack = new ItemStack(Items.COAL);
																																						_setstack.setCount(1);
																																						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																																							if (capability instanceof IItemHandlerModifiable)
																																								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																																						});
																																					}
																																				}
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
																																				}.getItemStack(world, BlockPos.containing(x, y, z), (int) num))
																																						.getItem() == GochickenModItems.DIRT_CHICKEN.get()) {
																																					{
																																						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																																						if (_ent != null) {
																																							final int _slotid = (int) (num + 3);
																																							final ItemStack _setstack = new ItemStack(Blocks.DIRT);
																																							_setstack.setCount(1);
																																							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																																								if (capability instanceof IItemHandlerModifiable)
																																									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																																							});
																																						}
																																					}
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
																																					}.getItemStack(world, BlockPos.containing(x, y, z), (int) num))
																																							.getItem() == GochickenModItems.GUNPOWDER_CHICKEN.get()) {
																																						{
																																							BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																																							if (_ent != null) {
																																								final int _slotid = (int) (num + 3);
																																								final ItemStack _setstack = new ItemStack(Items.GUNPOWDER);
																																								_setstack.setCount(1);
																																								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																																									if (capability instanceof IItemHandlerModifiable)
																																										((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																																								});
																																							}
																																						}
																																					} else {
																																						if ((new Object() {
																																							public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																																								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																																								BlockEntity _ent = world.getBlockEntity(pos);
																																								if (_ent != null)
																																									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(
																																											capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																																								return _retval.get();
																																							}
																																						}.getItemStack(world, BlockPos.containing(x, y, z), (int) num))
																																								.getItem() == GochickenModItems.STRING_CHICKEN.get()) {
																																							{
																																								BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																																								if (_ent != null) {
																																									final int _slotid = (int) (num + 3);
																																									final ItemStack _setstack = new ItemStack(Items.STRING);
																																									_setstack.setCount(1);
																																									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																																										if (capability instanceof IItemHandlerModifiable)
																																											((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																																									});
																																								}
																																							}
																																						} else {
																																							if ((new Object() {
																																								public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																																									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																																									BlockEntity _ent = world.getBlockEntity(pos);
																																									if (_ent != null)
																																										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(
																																												capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																																									return _retval.get();
																																								}
																																							}.getItemStack(world, BlockPos.containing(x, y, z), (int) num))
																																									.getItem() == GochickenModItems.LEATHER_CHICKEN.get()) {
																																								{
																																									BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																																									if (_ent != null) {
																																										final int _slotid = (int) (num + 3);
																																										final ItemStack _setstack = new ItemStack(Items.LEATHER);
																																										_setstack.setCount(1);
																																										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																																											if (capability instanceof IItemHandlerModifiable)
																																												((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																																										});
																																									}
																																								}
																																							} else {
																																								if ((new Object() {
																																									public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																																										AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																																										BlockEntity _ent = world.getBlockEntity(pos);
																																										if (_ent != null)
																																											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(
																																													capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																																										return _retval.get();
																																									}
																																								}.getItemStack(world, BlockPos.containing(x, y, z), (int) num))
																																										.getItem() == GochickenModItems.COOPER_CHICKEN.get()) {
																																									{
																																										BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																																										if (_ent != null) {
																																											final int _slotid = (int) (num + 3);
																																											final ItemStack _setstack = new ItemStack(Items.COPPER_INGOT);
																																											_setstack.setCount(1);
																																											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																													.ifPresent(capability -> {
																																														if (capability instanceof IItemHandlerModifiable)
																																															((IItemHandlerModifiable) capability).setStackInSlot(_slotid,
																																																	_setstack);
																																													});
																																										}
																																									}
																																								} else {
																																									if ((new Object() {
																																										public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																																											AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																																											BlockEntity _ent = world.getBlockEntity(pos);
																																											if (_ent != null)
																																												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																														.ifPresent(capability -> _retval
																																																.set(capability.getStackInSlot(slotid).copy()));
																																											return _retval.get();
																																										}
																																									}.getItemStack(world, BlockPos.containing(x, y, z), (int) num))
																																											.getItem() == GochickenModItems.NETHRRACK_CHIECKEN.get()) {
																																										{
																																											BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																																											if (_ent != null) {
																																												final int _slotid = (int) (num + 3);
																																												final ItemStack _setstack = new ItemStack(Blocks.NETHERRACK);
																																												_setstack.setCount(1);
																																												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																														.ifPresent(capability -> {
																																															if (capability instanceof IItemHandlerModifiable)
																																																((IItemHandlerModifiable) capability)
																																																		.setStackInSlot(_slotid, _setstack);
																																														});
																																											}
																																										}
																																									} else {
																																										if ((new Object() {
																																											public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																																												AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																														ItemStack.EMPTY);
																																												BlockEntity _ent = world.getBlockEntity(pos);
																																												if (_ent != null)
																																													_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																															.ifPresent(capability -> _retval
																																																	.set(capability.getStackInSlot(slotid).copy()));
																																												return _retval.get();
																																											}
																																										}.getItemStack(world, BlockPos.containing(x, y, z), (int) num))
																																												.getItem() == GochickenModItems.BLAZECHICKEN.get()) {
																																											{
																																												BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																																												if (_ent != null) {
																																													final int _slotid = (int) (num + 3);
																																													final ItemStack _setstack = new ItemStack(Items.BLAZE_ROD);
																																													_setstack.setCount(1);
																																													_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																															.ifPresent(capability -> {
																																																if (capability instanceof IItemHandlerModifiable)
																																																	((IItemHandlerModifiable) capability)
																																																			.setStackInSlot(_slotid, _setstack);
																																															});
																																												}
																																											}
																																										} else {
																																											if ((new Object() {
																																												public ItemStack getItemStack(LevelAccessor world, BlockPos pos,
																																														int slotid) {
																																													AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																															ItemStack.EMPTY);
																																													BlockEntity _ent = world.getBlockEntity(pos);
																																													if (_ent != null)
																																														_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																																.ifPresent(capability -> _retval
																																																		.set(capability.getStackInSlot(slotid).copy()));
																																													return _retval.get();
																																												}
																																											}.getItemStack(world, BlockPos.containing(x, y, z), (int) num))
																																													.getItem() == GochickenModItems.MAGMA_CREAM_CHICKEN.get()) {
																																												{
																																													BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																																													if (_ent != null) {
																																														final int _slotid = (int) (num + 3);
																																														final ItemStack _setstack = new ItemStack(Items.MAGMA_CREAM);
																																														_setstack.setCount(1);
																																														_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																																.ifPresent(capability -> {
																																																	if (capability instanceof IItemHandlerModifiable)
																																																		((IItemHandlerModifiable) capability)
																																																				.setStackInSlot(_slotid, _setstack);
																																																});
																																													}
																																												}
																																											} else {
																																												if ((new Object() {
																																													public ItemStack getItemStack(LevelAccessor world, BlockPos pos,
																																															int slotid) {
																																														AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																ItemStack.EMPTY);
																																														BlockEntity _ent = world.getBlockEntity(pos);
																																														if (_ent != null)
																																															_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																																	.ifPresent(capability -> _retval.set(
																																																			capability.getStackInSlot(slotid).copy()));
																																														return _retval.get();
																																													}
																																												}.getItemStack(world, BlockPos.containing(x, y, z), (int) num))
																																														.getItem() == GochickenModItems.ZNIC_CHICKEN.get()) {
																																													{
																																														BlockEntity _ent = world
																																																.getBlockEntity(BlockPos.containing(x, y, z));
																																														if (_ent != null) {
																																															final int _slotid = (int) (num + 3);
																																															final ItemStack _setstack = new ItemStack(
																																																	GochickenModItems.ZNIC_INGOT.get());
																																															_setstack.setCount(1);
																																															_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																																	.ifPresent(capability -> {
																																																		if (capability instanceof IItemHandlerModifiable)
																																																			((IItemHandlerModifiable) capability)
																																																					.setStackInSlot(_slotid, _setstack);
																																																	});
																																														}
																																													}
																																												} else {
																																													if ((new Object() {
																																														public ItemStack getItemStack(LevelAccessor world, BlockPos pos,
																																																int slotid) {
																																															AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																	ItemStack.EMPTY);
																																															BlockEntity _ent = world.getBlockEntity(pos);
																																															if (_ent != null)
																																																_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																																		.ifPresent(capability -> _retval.set(capability
																																																				.getStackInSlot(slotid).copy()));
																																															return _retval.get();
																																														}
																																													}.getItemStack(world, BlockPos.containing(x, y, z), (int) num))
																																															.getItem() == GochickenModItems.EGG_CHICKEN.get()) {
																																														{
																																															BlockEntity _ent = world
																																																	.getBlockEntity(BlockPos.containing(x, y, z));
																																															if (_ent != null) {
																																																final int _slotid = (int) (num + 3);
																																																final ItemStack _setstack = new ItemStack(Items.EGG);
																																																_setstack.setCount(1);
																																																_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																																		.ifPresent(capability -> {
																																																			if (capability instanceof IItemHandlerModifiable)
																																																				((IItemHandlerModifiable) capability)
																																																						.setStackInSlot(_slotid,
																																																								_setstack);
																																																		});
																																															}
																																														}
																																													} else {
																																														if ((new Object() {
																																															public ItemStack getItemStack(LevelAccessor world,
																																																	BlockPos pos, int slotid) {
																																																AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																		ItemStack.EMPTY);
																																																BlockEntity _ent = world.getBlockEntity(pos);
																																																if (_ent != null)
																																																	_ent.getCapability(ForgeCapabilities.ITEM_HANDLER,
																																																			null)
																																																			.ifPresent(capability -> _retval
																																																					.set(capability.getStackInSlot(slotid)
																																																							.copy()));
																																																return _retval.get();
																																															}
																																														}.getItemStack(world, BlockPos.containing(x, y, z), (int) num))
																																																.getItem() == GochickenModItems.EMERALD_CHICKEN.get()) {
																																															{
																																																BlockEntity _ent = world
																																																		.getBlockEntity(BlockPos.containing(x, y, z));
																																																if (_ent != null) {
																																																	final int _slotid = (int) (num + 3);
																																																	final ItemStack _setstack = new ItemStack(
																																																			Items.EMERALD);
																																																	_setstack.setCount(1);
																																																	_ent.getCapability(ForgeCapabilities.ITEM_HANDLER,
																																																			null).ifPresent(capability -> {
																																																				if (capability instanceof IItemHandlerModifiable)
																																																					((IItemHandlerModifiable) capability)
																																																							.setStackInSlot(_slotid,
																																																									_setstack);
																																																			});
																																																}
																																															}
																																														} else {
																																															if ((new Object() {
																																																public ItemStack getItemStack(LevelAccessor world,
																																																		BlockPos pos, int slotid) {
																																																	AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																			ItemStack.EMPTY);
																																																	BlockEntity _ent = world.getBlockEntity(pos);
																																																	if (_ent != null)
																																																		_ent.getCapability(ForgeCapabilities.ITEM_HANDLER,
																																																				null)
																																																				.ifPresent(capability -> _retval.set(
																																																						capability.getStackInSlot(slotid)
																																																								.copy()));
																																																	return _retval.get();
																																																}
																																															}.getItemStack(world, BlockPos.containing(x, y, z),
																																																	(int) num))
																																																	.getItem() == GochickenModItems.XP_CHICKEN.get()) {
																																																{
																																																	BlockEntity _ent = world
																																																			.getBlockEntity(BlockPos.containing(x, y, z));
																																																	if (_ent != null) {
																																																		final int _slotid = (int) (num + 3);
																																																		final ItemStack _setstack = new ItemStack(
																																																				Items.EXPERIENCE_BOTTLE);
																																																		_setstack.setCount(1);
																																																		_ent.getCapability(ForgeCapabilities.ITEM_HANDLER,
																																																				null).ifPresent(capability -> {
																																																					if (capability instanceof IItemHandlerModifiable)
																																																						((IItemHandlerModifiable) capability)
																																																								.setStackInSlot(_slotid,
																																																										_setstack);
																																																				});
																																																	}
																																																}
																																															} else {
																																																if ((new Object() {
																																																	public ItemStack getItemStack(LevelAccessor world,
																																																			BlockPos pos, int slotid) {
																																																		AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																				ItemStack.EMPTY);
																																																		BlockEntity _ent = world.getBlockEntity(pos);
																																																		if (_ent != null)
																																																			_ent.getCapability(
																																																					ForgeCapabilities.ITEM_HANDLER, null)
																																																					.ifPresent(capability -> _retval
																																																							.set(capability
																																																									.getStackInSlot(
																																																											slotid)
																																																									.copy()));
																																																		return _retval.get();
																																																	}
																																																}.getItemStack(world, BlockPos.containing(x, y, z),
																																																		(int) num))
																																																		.getItem() == GochickenModItems.OBSIDIAN_CHICKEN
																																																				.get()) {
																																																	{
																																																		BlockEntity _ent = world.getBlockEntity(
																																																				BlockPos.containing(x, y, z));
																																																		if (_ent != null) {
																																																			final int _slotid = (int) (num + 3);
																																																			final ItemStack _setstack = new ItemStack(
																																																					Blocks.OBSIDIAN);
																																																			_setstack.setCount(1);
																																																			_ent.getCapability(
																																																					ForgeCapabilities.ITEM_HANDLER, null)
																																																					.ifPresent(capability -> {
																																																						if (capability instanceof IItemHandlerModifiable)
																																																							((IItemHandlerModifiable) capability)
																																																									.setStackInSlot(
																																																											_slotid,
																																																											_setstack);
																																																					});
																																																		}
																																																	}
																																																} else {
																																																	if ((new Object() {
																																																		public ItemStack getItemStack(LevelAccessor world,
																																																				BlockPos pos, int slotid) {
																																																			AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																					ItemStack.EMPTY);
																																																			BlockEntity _ent = world.getBlockEntity(pos);
																																																			if (_ent != null)
																																																				_ent.getCapability(
																																																						ForgeCapabilities.ITEM_HANDLER,
																																																						null)
																																																						.ifPresent(capability -> _retval
																																																								.set(capability
																																																										.getStackInSlot(
																																																												slotid)
																																																										.copy()));
																																																			return _retval.get();
																																																		}
																																																	}.getItemStack(world, BlockPos.containing(x, y, z),
																																																			(int) num))
																																																			.getItem() == GochickenModItems.GHAST_CHICKEN
																																																					.get()) {
																																																		{
																																																			BlockEntity _ent = world.getBlockEntity(
																																																					BlockPos.containing(x, y, z));
																																																			if (_ent != null) {
																																																				final int _slotid = (int) (num + 3);
																																																				final ItemStack _setstack = new ItemStack(
																																																						Items.GHAST_TEAR);
																																																				_setstack.setCount(1);
																																																				_ent.getCapability(
																																																						ForgeCapabilities.ITEM_HANDLER,
																																																						null).ifPresent(capability -> {
																																																							if (capability instanceof IItemHandlerModifiable)
																																																								((IItemHandlerModifiable) capability)
																																																										.setStackInSlot(
																																																												_slotid,
																																																												_setstack);
																																																						});
																																																			}
																																																		}
																																																	} else {
																																																		if ((new Object() {
																																																			public ItemStack getItemStack(
																																																					LevelAccessor world, BlockPos pos,
																																																					int slotid) {
																																																				AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																						ItemStack.EMPTY);
																																																				BlockEntity _ent = world
																																																						.getBlockEntity(pos);
																																																				if (_ent != null)
																																																					_ent.getCapability(
																																																							ForgeCapabilities.ITEM_HANDLER,
																																																							null).ifPresent(
																																																									capability -> _retval
																																																											.set(capability
																																																													.getStackInSlot(
																																																															slotid)
																																																													.copy()));
																																																				return _retval.get();
																																																			}
																																																		}.getItemStack(world,
																																																				BlockPos.containing(x, y, z), (int) num))
																																																				.getItem() == GochickenModItems.SEALANTERN_CHICKEN
																																																						.get()) {
																																																			{
																																																				BlockEntity _ent = world.getBlockEntity(
																																																						BlockPos.containing(x, y, z));
																																																				if (_ent != null) {
																																																					final int _slotid = (int) (num + 3);
																																																					final ItemStack _setstack = new ItemStack(
																																																							Blocks.SEA_LANTERN);
																																																					_setstack.setCount(1);
																																																					_ent.getCapability(
																																																							ForgeCapabilities.ITEM_HANDLER,
																																																							null)
																																																							.ifPresent(capability -> {
																																																								if (capability instanceof IItemHandlerModifiable)
																																																									((IItemHandlerModifiable) capability)
																																																											.setStackInSlot(
																																																													_slotid,
																																																													_setstack);
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
			num = num + 1;
		}
	}
}
