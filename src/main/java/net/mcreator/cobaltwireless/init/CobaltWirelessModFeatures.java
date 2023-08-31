
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cobaltwireless.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.cobaltwireless.world.features.ores.CobaltoreFeature;
import net.mcreator.cobaltwireless.world.features.ores.CobaltdeepslateoreFeature;
import net.mcreator.cobaltwireless.CobaltWirelessMod;

@Mod.EventBusSubscriber
public class CobaltWirelessModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, CobaltWirelessMod.MODID);
	public static final RegistryObject<Feature<?>> COBALTORE = REGISTRY.register("cobaltore", CobaltoreFeature::new);
	public static final RegistryObject<Feature<?>> COBALTDEEPSLATEORE = REGISTRY.register("cobaltdeepslateore", CobaltdeepslateoreFeature::new);
}
