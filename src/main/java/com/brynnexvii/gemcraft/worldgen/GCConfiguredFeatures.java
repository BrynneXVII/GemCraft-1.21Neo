package com.brynnexvii.gemcraft.worldgen;

import com.brynnexvii.gemcraft.GemCraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.Bootstrap;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;

public class GCConfiguredFeatures {
    //start with ConfFeat (what does feat look like) -> then turn to PlacedFeat (how is it placed? How many, on ground, height) -> then describe placement in BiomeModifiers (in which biomes are they placed)
    //Notably, they are called in the reverse order so biome tries to gen, looks to what gets placed, which looks to what the config is
    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {

    }

    //Helper Methods
    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(GemCraft.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
