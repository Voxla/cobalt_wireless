
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cobaltwireless.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.cobaltwireless.item.CobaltwrenchItem;
import net.mcreator.cobaltwireless.item.CobaltswordItem;
import net.mcreator.cobaltwireless.item.CobaltshardItem;
import net.mcreator.cobaltwireless.item.CobaltpickaxeItem;
import net.mcreator.cobaltwireless.item.CobaltingotItem;
import net.mcreator.cobaltwireless.item.CobaltdustItem;
import net.mcreator.cobaltwireless.CobaltWirelessMod;

public class CobaltWirelessModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CobaltWirelessMod.MODID);
	public static final RegistryObject<Item> COBALTBLOCKWIRELESSOFF = block(CobaltWirelessModBlocks.COBALTBLOCKWIRELESSOFF);
	public static final RegistryObject<Item> COBALTBLOCKSIGNAL = block(CobaltWirelessModBlocks.COBALTBLOCKSIGNAL);
	public static final RegistryObject<Item> COBALTBLOCKWIRELESSON = block(CobaltWirelessModBlocks.COBALTBLOCKWIRELESSON);
	public static final RegistryObject<Item> COBALTWRENCH = REGISTRY.register("cobaltwrench", () -> new CobaltwrenchItem());
	public static final RegistryObject<Item> COBALTBLOCK = block(CobaltWirelessModBlocks.COBALTBLOCK);
	public static final RegistryObject<Item> COBALTORE = block(CobaltWirelessModBlocks.COBALTORE);
	public static final RegistryObject<Item> COBALTSHARD = REGISTRY.register("cobaltshard", () -> new CobaltshardItem());
	public static final RegistryObject<Item> COBALTDEEPSLATEORE = block(CobaltWirelessModBlocks.COBALTDEEPSLATEORE);
	public static final RegistryObject<Item> COBALTDUST = REGISTRY.register("cobaltdust", () -> new CobaltdustItem());
	public static final RegistryObject<Item> COBALTINGOT = REGISTRY.register("cobaltingot", () -> new CobaltingotItem());
	public static final RegistryObject<Item> COBALTDUSTBLOCK = block(CobaltWirelessModBlocks.COBALTDUSTBLOCK);
	public static final RegistryObject<Item> COBALTSWORD = REGISTRY.register("cobaltsword", () -> new CobaltswordItem());
	public static final RegistryObject<Item> COBALTPICKAXE = REGISTRY.register("cobaltpickaxe", () -> new CobaltpickaxeItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
