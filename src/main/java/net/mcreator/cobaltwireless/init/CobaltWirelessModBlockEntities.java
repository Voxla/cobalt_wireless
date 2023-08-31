
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cobaltwireless.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.cobaltwireless.block.entity.CobaltblocksignalBlockEntity;
import net.mcreator.cobaltwireless.CobaltWirelessMod;

public class CobaltWirelessModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, CobaltWirelessMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> COBALTBLOCKSIGNAL = register("cobaltblocksignal", CobaltWirelessModBlocks.COBALTBLOCKSIGNAL, CobaltblocksignalBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
