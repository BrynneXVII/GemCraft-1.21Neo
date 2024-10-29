package com.brynnexvii.gemcraft.worldgen;

import com.brynnexvii.gemcraft.GemCraft;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class GCPlacedFeatures {
    //Structures
    public static final ResourceKey<PlacedFeature> LITTLE_BROWN_MUSHROOM_PLACED_KEY = registerKey("little_brown_mushroom_placed");
    public static final ResourceKey<PlacedFeature> LITTLE_RED_MUSHROOM_PLACED_KEY = registerKey("little_red_mushroom_placed");

    //Ores
    public static final ResourceKey<PlacedFeature> OVERWORLD_IGNIS_GEM_ORE_PLACED_KEY = registerKey("ignis_gem_ore_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_ZEPHYR_GEM_ORE_PLACED_KEY = registerKey("zephyr_gem_ore_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_TERRA_GEM_ORE_PLACED_KEY = registerKey("terra_gem_ore_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_MIZU_GEM_ORE_PLACED_KEY = registerKey("mizu_gem_ore_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_AETHER_GEM_ORE_PLACED_KEY = registerKey("aether_gem_ore_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_LYS_GEM_ORE_PLACED_KEY = registerKey("lys_gem_ore_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_INANIS_GEM_ORE_PLACED_KEY = registerKey("inanis_gem_ore_placed");

    public static final ResourceKey<PlacedFeature> NETHER_IGNIS_GEM_ORE_PLACED_KEY = registerKey("nether_ignis_gem_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_ZEPHYR_GEM_ORE_PLACED_KEY = registerKey("nether_zephyr_gem_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_TERRA_GEM_ORE_PLACED_KEY = registerKey("nether_terra_gem_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_MIZU_GEM_ORE_PLACED_KEY = registerKey("nether_mizu_gem_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_AETHER_GEM_ORE_PLACED_KEY = registerKey("nether_aether_gem_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_LYS_GEM_ORE_PLACED_KEY = registerKey("nether_lys_gem_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_INANIS_GEM_ORE_PLACED_KEY = registerKey("nether_inanis_gem_ore_placed");

    public static final ResourceKey<PlacedFeature> END_IGNIS_GEM_ORE_PLACED_KEY = registerKey("end_ignis_gem_ore_placed");
    public static final ResourceKey<PlacedFeature> END_ZEPHYR_GEM_ORE_PLACED_KEY = registerKey("end_zephyr_gem_ore_placed");
    public static final ResourceKey<PlacedFeature> END_TERRA_GEM_ORE_PLACED_KEY = registerKey("end_terra_gem_ore_placed");
    public static final ResourceKey<PlacedFeature> END_MIZU_GEM_ORE_PLACED_KEY = registerKey("end_mizu_gem_ore_placed");
    public static final ResourceKey<PlacedFeature> END_AETHER_GEM_ORE_PLACED_KEY = registerKey("end_aether_gem_ore_placed");
    public static final ResourceKey<PlacedFeature> END_LYS_GEM_ORE_PLACED_KEY = registerKey("end_lys_gem_ore_placed");
    public static final ResourceKey<PlacedFeature> END_INANIS_GEM_ORE_PLACED_KEY = registerKey("end_inanis_gem_ore_placed");
    public static final ResourceKey<PlacedFeature> ARCHAIC_REMNANT_PLACED_KEY = registerKey("archic_remnant_placed");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE); //go find the ConfigFeats
        //Structures
        register(context, LITTLE_BROWN_MUSHROOM_PLACED_KEY, configuredFeatures.getOrThrow(GCConfiguredFeatures.LITTLE_BROWN_MUSHROOM_KEY), List.of(
                RarityFilter.onAverageOnceEvery(16),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP,
                BiomeFilter.biome()));
        register(context, LITTLE_RED_MUSHROOM_PLACED_KEY, configuredFeatures.getOrThrow(GCConfiguredFeatures.LITTLE_RED_MUSHROOM_KEY), List.of(
                RarityFilter.onAverageOnceEvery(32),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP,
                BiomeFilter.biome()));

        //Ores
        //general base distr of ores, will almost certainly have to duplicate some things to add more of certain types to appropriate biomes etc (if I still want to do that)
        //int is count per chunk
        register(context, OVERWORLD_IGNIS_GEM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(GCConfiguredFeatures.OVERWORLD_IGNIS_GEM_ORE_KEY),
                GCOrePlacements.commonOrePlacement(12,
                        HeightRangePlacement.triangle(VerticalAnchor.BOTTOM, VerticalAnchor.absolute(70))));
        register(context, OVERWORLD_ZEPHYR_GEM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(GCConfiguredFeatures.OVERWORLD_ZEPHYR_GEM_ORE_KEY),
                GCOrePlacements.commonOrePlacement(12,
                        HeightRangePlacement.triangle(VerticalAnchor.BOTTOM, VerticalAnchor.absolute(70))));
        register(context, OVERWORLD_TERRA_GEM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(GCConfiguredFeatures.OVERWORLD_TERRA_GEM_ORE_KEY),
                GCOrePlacements.commonOrePlacement(12,
                        HeightRangePlacement.triangle(VerticalAnchor.BOTTOM, VerticalAnchor.absolute(70))));
        register(context, OVERWORLD_MIZU_GEM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(GCConfiguredFeatures.OVERWORLD_MIZU_GEM_ORE_KEY),
                GCOrePlacements.commonOrePlacement(12,
                        HeightRangePlacement.triangle(VerticalAnchor.BOTTOM, VerticalAnchor.absolute(70))));
        register(context, OVERWORLD_AETHER_GEM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(GCConfiguredFeatures.OVERWORLD_AETHER_GEM_ORE_KEY),
                GCOrePlacements.commonOrePlacement(12,
                        HeightRangePlacement.triangle(VerticalAnchor.BOTTOM, VerticalAnchor.absolute(70))));
        register(context, OVERWORLD_LYS_GEM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(GCConfiguredFeatures.OVERWORLD_LYS_GEM_ORE_KEY),
                GCOrePlacements.commonOrePlacement(12,
                        HeightRangePlacement.triangle(VerticalAnchor.BOTTOM, VerticalAnchor.absolute(70))));
        register(context, OVERWORLD_INANIS_GEM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(GCConfiguredFeatures.OVERWORLD_INANIS_GEM_ORE_KEY),
                GCOrePlacements.commonOrePlacement(12,
                        HeightRangePlacement.triangle(VerticalAnchor.BOTTOM, VerticalAnchor.absolute(70))));

        register(context, NETHER_IGNIS_GEM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(GCConfiguredFeatures.NETHER_IGNIS_GEM_ORE_KEY),
                GCOrePlacements.commonOrePlacement(12,
                        HeightRangePlacement.triangle(VerticalAnchor.BOTTOM, VerticalAnchor.absolute(70))));
        register(context, NETHER_ZEPHYR_GEM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(GCConfiguredFeatures.NETHER_ZEPHYR_GEM_ORE_KEY),
                GCOrePlacements.commonOrePlacement(12,
                        HeightRangePlacement.triangle(VerticalAnchor.BOTTOM, VerticalAnchor.absolute(70))));
        register(context, NETHER_TERRA_GEM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(GCConfiguredFeatures.NETHER_TERRA_GEM_ORE_KEY),
                GCOrePlacements.commonOrePlacement(12,
                        HeightRangePlacement.triangle(VerticalAnchor.BOTTOM, VerticalAnchor.absolute(70))));
        register(context, NETHER_MIZU_GEM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(GCConfiguredFeatures.NETHER_MIZU_GEM_ORE_KEY),
                GCOrePlacements.commonOrePlacement(12,
                        HeightRangePlacement.triangle(VerticalAnchor.BOTTOM, VerticalAnchor.absolute(70))));
        register(context, NETHER_AETHER_GEM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(GCConfiguredFeatures.NETHER_AETHER_GEM_ORE_KEY),
                GCOrePlacements.commonOrePlacement(12,
                        HeightRangePlacement.triangle(VerticalAnchor.BOTTOM, VerticalAnchor.absolute(70))));
        register(context, NETHER_LYS_GEM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(GCConfiguredFeatures.NETHER_LYS_GEM_ORE_KEY),
                GCOrePlacements.commonOrePlacement(12,
                        HeightRangePlacement.triangle(VerticalAnchor.BOTTOM, VerticalAnchor.absolute(70))));
        register(context, NETHER_INANIS_GEM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(GCConfiguredFeatures.NETHER_INANIS_GEM_ORE_KEY),
                GCOrePlacements.commonOrePlacement(12,
                        HeightRangePlacement.triangle(VerticalAnchor.BOTTOM, VerticalAnchor.absolute(70))));

        register(context, END_IGNIS_GEM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(GCConfiguredFeatures.END_IGNIS_GEM_ORE_KEY),
                GCOrePlacements.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.TOP)));
        register(context, END_ZEPHYR_GEM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(GCConfiguredFeatures.END_ZEPHYR_GEM_ORE_KEY),
                GCOrePlacements.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.TOP)));
        register(context, END_TERRA_GEM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(GCConfiguredFeatures.END_TERRA_GEM_ORE_KEY),
                GCOrePlacements.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.TOP)));
        register(context, END_MIZU_GEM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(GCConfiguredFeatures.END_MIZU_GEM_ORE_KEY),
                GCOrePlacements.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.TOP)));
        register(context, END_AETHER_GEM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(GCConfiguredFeatures.END_AETHER_GEM_ORE_KEY),
                GCOrePlacements.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.TOP)));
        register(context, END_LYS_GEM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(GCConfiguredFeatures.END_LYS_GEM_ORE_KEY),
                GCOrePlacements.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.TOP)));
        register(context, END_INANIS_GEM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(GCConfiguredFeatures.END_INANIS_GEM_ORE_KEY),
                GCOrePlacements.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.TOP)));
        register(context, ARCHAIC_REMNANT_PLACED_KEY, configuredFeatures.getOrThrow(GCConfiguredFeatures.ARCHAIC_REMNANT_KEY),
                GCOrePlacements.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.TOP)));

    }

    //Helper Methods
    public static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(GemCraft.MOD_ID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
