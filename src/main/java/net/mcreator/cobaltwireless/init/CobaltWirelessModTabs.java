
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cobaltwireless.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.cobaltwireless.CobaltWirelessMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CobaltWirelessModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CobaltWirelessMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(CobaltWirelessModBlocks.COBALTBLOCK.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
			tabData.accept(CobaltWirelessModBlocks.COBALTBLOCKWIRELESSOFF.get().asItem());
			tabData.accept(CobaltWirelessModBlocks.COBALTBLOCKSIGNAL.get().asItem());
			tabData.accept(CobaltWirelessModItems.COBALTWRENCH.get());
			tabData.accept(CobaltWirelessModBlocks.COBALTDUSTBLOCK.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(CobaltWirelessModItems.COBALTSWORD.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(CobaltWirelessModItems.COBALTSHARD.get());
			tabData.accept(CobaltWirelessModItems.COBALTDUST.get());
			tabData.accept(CobaltWirelessModItems.COBALTINGOT.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(CobaltWirelessModBlocks.COBALTORE.get().asItem());
			tabData.accept(CobaltWirelessModBlocks.COBALTDEEPSLATEORE.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(CobaltWirelessModItems.COBALTPICKAXE.get());
		}
	}
}
