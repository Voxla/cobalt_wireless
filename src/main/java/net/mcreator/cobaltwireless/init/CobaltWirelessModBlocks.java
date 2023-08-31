
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cobaltwireless.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.cobaltwireless.block.CobaltoreBlock;
import net.mcreator.cobaltwireless.block.CobaltdustblockBlock;
import net.mcreator.cobaltwireless.block.CobaltdeepslateoreBlock;
import net.mcreator.cobaltwireless.block.CobaltblockwirelessonBlock;
import net.mcreator.cobaltwireless.block.CobaltblockwirelessoffBlock;
import net.mcreator.cobaltwireless.block.CobaltblocksignalBlock;
import net.mcreator.cobaltwireless.block.CobaltblockBlock;
import net.mcreator.cobaltwireless.CobaltWirelessMod;

public class CobaltWirelessModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CobaltWirelessMod.MODID);
	public static final RegistryObject<Block> COBALTBLOCKWIRELESSOFF = REGISTRY.register("cobaltblockwirelessoff", () -> new CobaltblockwirelessoffBlock());
	public static final RegistryObject<Block> COBALTBLOCKSIGNAL = REGISTRY.register("cobaltblocksignal", () -> new CobaltblocksignalBlock());
	public static final RegistryObject<Block> COBALTBLOCKWIRELESSON = REGISTRY.register("cobaltblockwirelesson", () -> new CobaltblockwirelessonBlock());
	public static final RegistryObject<Block> COBALTBLOCK = REGISTRY.register("cobaltblock", () -> new CobaltblockBlock());
	public static final RegistryObject<Block> COBALTORE = REGISTRY.register("cobaltore", () -> new CobaltoreBlock());
	public static final RegistryObject<Block> COBALTDEEPSLATEORE = REGISTRY.register("cobaltdeepslateore", () -> new CobaltdeepslateoreBlock());
	public static final RegistryObject<Block> COBALTDUSTBLOCK = REGISTRY.register("cobaltdustblock", () -> new CobaltdustblockBlock());
}
