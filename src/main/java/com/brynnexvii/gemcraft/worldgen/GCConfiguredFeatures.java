package com.brynnexvii.gemcraft.worldgen;

import com.brynnexvii.gemcraft.GemCraft;
import com.brynnexvii.gemcraft.block.GCBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.Bootstrap;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class GCConfiguredFeatures {
    //start with ConfFeat (what does feat look like) -> then turn to PlacedFeat (how is it placed? How many, on ground, height) -> then describe placement in BiomeModifiers (in which biomes are they placed)
    //Notably, they are called in the reverse order so biome tries to gen, looks to what gets placed, which looks to what the config is

    //Structures
    public static final ResourceKey<ConfiguredFeature<?, ?>> LOG_DWELLING_KEY = registerKey("log_dwelling_key");

    //Ores
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_IGNIS_GEM_ORE_KEY = registerKey("ignis_gem_ore_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ZEPHYR_GEM_ORE_KEY = registerKey("zephyr_gem_ore_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_TERRA_GEM_ORE_KEY = registerKey("terra_gem_ore_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_MIZU_GEM_ORE_KEY = registerKey("mizu_gem_ore_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_AETHER_GEM_ORE_KEY = registerKey("aether_gem_ore_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_LYS_GEM_ORE_KEY = registerKey("lys_gem_ore_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_INANIS_GEM_ORE_KEY = registerKey("inanis_gem_ore_key");

    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_IGNIS_GEM_ORE_KEY = registerKey("nether_ignis_gem_ore_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_ZEPHYR_GEM_ORE_KEY = registerKey("nether_zephyr_gem_ore_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_TERRA_GEM_ORE_KEY = registerKey("nether_terra_gem_ore_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_MIZU_GEM_ORE_KEY = registerKey("nether_mizu_gem_ore_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_AETHER_GEM_ORE_KEY = registerKey("nether_aether_gem_ore_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_LYS_GEM_ORE_KEY = registerKey("nether_lys_gem_ore_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_INANIS_GEM_ORE_KEY = registerKey("nether_inanis_gem_ore_key");

    public static final ResourceKey<ConfiguredFeature<?, ?>> END_IGNIS_GEM_ORE_KEY = registerKey("end_ignis_gem_ore_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_ZEPHYR_GEM_ORE_KEY = registerKey("end_zephyr_gem_ore_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_TERRA_GEM_ORE_KEY = registerKey("end_terra_gem_ore_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_MIZU_GEM_ORE_KEY = registerKey("end_mizu_gem_ore_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_AETHER_GEM_ORE_KEY = registerKey("end_aether_gem_ore_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_LYS_GEM_ORE_KEY = registerKey("end_lys_gem_ore_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_INANIS_GEM_ORE_KEY = registerKey("end_inanis_gem_ore_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ARCHAIC_REMNANT_KEY = registerKey("archaic_remnant_key");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        //Structures
        //register(context, LOG_DWELLING_KEY, );

        //Ores
        RuleTest stoneReplacables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplacables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        List<OreConfiguration.TargetBlockState> ignisOverworldGemOres = List.of(
                OreConfiguration.target(stoneReplacables, GCBlocks.IGNIS_GEM_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplacables, GCBlocks.DEEPSLATE_IGNIS_GEM_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> zephyrOverworldGemOres = List.of(
                OreConfiguration.target(stoneReplacables, GCBlocks.ZEPHYR_GEM_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplacables, GCBlocks.DEEPSLATE_ZEPHYR_GEM_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> terraOverworldGemOres = List.of(
                OreConfiguration.target(stoneReplacables, GCBlocks.TERRA_GEM_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplacables, GCBlocks.DEEPSLATE_TERRA_GEM_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> mizuOverworldGemOres = List.of(
                OreConfiguration.target(stoneReplacables, GCBlocks.MIZU_GEM_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplacables, GCBlocks.DEEPSLATE_MIZU_GEM_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> aetherOverworldGemOres = List.of(
                OreConfiguration.target(stoneReplacables, GCBlocks.AETHER_GEM_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplacables, GCBlocks.DEEPSLATE_AETHER_GEM_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> lysOverworldGemOres = List.of(
                OreConfiguration.target(stoneReplacables, GCBlocks.LYS_GEM_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplacables, GCBlocks.DEEPSLATE_LYS_GEM_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> inanisOverworldGemOres = List.of(
                OreConfiguration.target(stoneReplacables, GCBlocks.INANIS_GEM_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplacables, GCBlocks.DEEPSLATE_INANIS_GEM_ORE.get().defaultBlockState()));
        RuleTest netherrackReplacables = new BlockMatchTest(Blocks.NETHERRACK); //no nether replacables tag atm... could make one if we want the ores to spawn in basalt etc
        RuleTest endstoneReplacables = new BlockMatchTest(Blocks.END_STONE);

        register(context, OVERWORLD_IGNIS_GEM_ORE_KEY, Feature.ORE, new OreConfiguration(ignisOverworldGemOres, 5)); //int at the end is the max vein size
        register(context, OVERWORLD_ZEPHYR_GEM_ORE_KEY, Feature.ORE, new OreConfiguration(zephyrOverworldGemOres, 5));
        register(context, OVERWORLD_TERRA_GEM_ORE_KEY, Feature.ORE, new OreConfiguration(terraOverworldGemOres, 5));
        register(context, OVERWORLD_MIZU_GEM_ORE_KEY, Feature.ORE, new OreConfiguration(mizuOverworldGemOres, 5));
        register(context, OVERWORLD_AETHER_GEM_ORE_KEY, Feature.ORE, new OreConfiguration(aetherOverworldGemOres, 5));
        register(context, OVERWORLD_LYS_GEM_ORE_KEY, Feature.ORE, new OreConfiguration(lysOverworldGemOres, 5));
        register(context, OVERWORLD_INANIS_GEM_ORE_KEY, Feature.ORE, new OreConfiguration(inanisOverworldGemOres, 5));
        register(context, NETHER_IGNIS_GEM_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplacables, GCBlocks.NETHER_IGNIS_GEM_ORE.get().defaultBlockState(), 4)); //singular replacables version
        register(context, NETHER_ZEPHYR_GEM_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplacables, GCBlocks.NETHER_ZEPHYR_GEM_ORE.get().defaultBlockState(), 4));
        register(context, NETHER_TERRA_GEM_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplacables, GCBlocks.NETHER_TERRA_GEM_ORE.get().defaultBlockState(), 4));
        register(context, NETHER_MIZU_GEM_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplacables, GCBlocks.NETHER_MIZU_GEM_ORE.get().defaultBlockState(), 4));
        register(context, NETHER_AETHER_GEM_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplacables, GCBlocks.NETHER_AETHER_GEM_ORE.get().defaultBlockState(), 4));
        register(context, NETHER_LYS_GEM_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplacables, GCBlocks.NETHER_LYS_GEM_ORE.get().defaultBlockState(), 4));
        register(context, NETHER_INANIS_GEM_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplacables, GCBlocks.NETHER_INANIS_GEM_ORE.get().defaultBlockState(), 4));
        register(context, END_IGNIS_GEM_ORE_KEY, Feature.ORE, new OreConfiguration(endstoneReplacables, GCBlocks.END_STONE_IGNIS_GEM_ORE.get().defaultBlockState(), 3));
        register(context, END_ZEPHYR_GEM_ORE_KEY, Feature.ORE, new OreConfiguration(endstoneReplacables, GCBlocks.END_STONE_ZEPHYR_GEM_ORE.get().defaultBlockState(), 3));
        register(context, END_TERRA_GEM_ORE_KEY, Feature.ORE, new OreConfiguration(endstoneReplacables, GCBlocks.END_STONE_TERRA_GEM_ORE.get().defaultBlockState(), 3));
        register(context, END_MIZU_GEM_ORE_KEY, Feature.ORE, new OreConfiguration(endstoneReplacables, GCBlocks.END_STONE_MIZU_GEM_ORE.get().defaultBlockState(), 3));
        register(context, END_AETHER_GEM_ORE_KEY, Feature.ORE, new OreConfiguration(endstoneReplacables, GCBlocks.END_STONE_AETHER_GEM_ORE.get().defaultBlockState(), 3));
        register(context, END_LYS_GEM_ORE_KEY, Feature.ORE, new OreConfiguration(endstoneReplacables, GCBlocks.END_STONE_LYS_GEM_ORE.get().defaultBlockState(), 3));
        register(context, END_INANIS_GEM_ORE_KEY, Feature.ORE, new OreConfiguration(endstoneReplacables, GCBlocks.END_STONE_INANIS_GEM_ORE.get().defaultBlockState(), 3));
        register(context, ARCHAIC_REMNANT_KEY, Feature.ORE, new OreConfiguration(endstoneReplacables, GCBlocks.ARCHAIC_REMNANT.get().defaultBlockState(), 2));

    }

    //Helper Methods
    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(GemCraft.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
