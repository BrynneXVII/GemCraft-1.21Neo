package com.brynnexvii.gemcraft.worldgen;

import com.brynnexvii.gemcraft.GemCraft;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class GCBiomeModifiers {

    //Structures
    public static final ResourceKey<BiomeModifier> ADD_LITTLE_BROWN_MUSHROOM = registerKey("add_little_brown_mushroom");
    public static final ResourceKey<BiomeModifier> ADD_LITTLE_RED_MUSHROOM = registerKey("add_little_red_mushroom");

    //Ores
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_IGNIS_GEM_ORES = registerKey("add_ignis_gem_ores");
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_ZEPHYR_GEM_ORES = registerKey("add_zephyr_gem_ores");
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_TERRA_GEM_ORES = registerKey("add_terra_gem_ores");
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_MIZU_GEM_ORES = registerKey("add_mizu_gem_ores");
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_AETHER_GEM_ORES = registerKey("add_aether_gem_ores");
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_LYS_GEM_ORES = registerKey("add_lys_gem_ores");
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_INANIS_GEM_ORES = registerKey("add_inanis_gem_ores");

    public static final ResourceKey<BiomeModifier> ADD_NETHER_IGNIS_GEM_ORE = registerKey("add_nether_ignis_gem_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_ZEPHYR_GEM_ORE = registerKey("add_nether_zephyr_gem_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_TERRA_GEM_ORE = registerKey("add_nether_terra_gem_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_MIZU_GEM_ORE = registerKey("add_nether_mizu_gem_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_AETHER_GEM_ORE = registerKey("add_nether_aether_gem_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_LYS_GEM_ORE = registerKey("add_nether_lys_gem_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_INANIS_GEM_ORE = registerKey("add_nether_inanis_gem_ore");

    public static final ResourceKey<BiomeModifier> ADD_END_IGNIS_GEM_ORE = registerKey("add_end_ignis_gem_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_ZEPHYR_GEM_ORE = registerKey("add_end_zephyr_gem_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_TERRA_GEM_ORE = registerKey("add_end_terra_gem_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_MIZU_GEM_ORE = registerKey("add_end_mizu_gem_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_AETHER_GEM_ORE = registerKey("add_end_aether_gem_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_LYS_GEM_ORE = registerKey("add_end_lys_gem_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_INANIS_GEM_ORE = registerKey("add_end_inanis_gem_ore");
    public static final ResourceKey<BiomeModifier> ADD_ARCHAIC_REMNANT = registerKey("add_archaic_remnant");

    public static void bootstrap(BootstrapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        //Structures
        context.register(ADD_LITTLE_BROWN_MUSHROOM, new BiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.DARK_FOREST), biomes.getOrThrow(Biomes.MUSHROOM_FIELDS)),
                HolderSet.direct(placedFeatures.getOrThrow(GCPlacedFeatures.LITTLE_BROWN_MUSHROOM_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_LITTLE_RED_MUSHROOM, new BiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.DARK_FOREST), biomes.getOrThrow(Biomes.MUSHROOM_FIELDS)),
                HolderSet.direct(placedFeatures.getOrThrow(GCPlacedFeatures.LITTLE_RED_MUSHROOM_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        //Ores
        //for a single biome or list of biomes HolderSet.direct(biomes.getOrThrow(Biomes.XXX), ..., biomes.getOrThrow(Biomes.XXX))
        context.register(ADD_OVERWORLD_IGNIS_GEM_ORES, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(GCPlacedFeatures.OVERWORLD_IGNIS_GEM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_OVERWORLD_ZEPHYR_GEM_ORES, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(GCPlacedFeatures.OVERWORLD_ZEPHYR_GEM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_OVERWORLD_TERRA_GEM_ORES, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(GCPlacedFeatures.OVERWORLD_TERRA_GEM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_OVERWORLD_MIZU_GEM_ORES, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(GCPlacedFeatures.OVERWORLD_MIZU_GEM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_OVERWORLD_AETHER_GEM_ORES, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(GCPlacedFeatures.OVERWORLD_AETHER_GEM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_OVERWORLD_LYS_GEM_ORES, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(GCPlacedFeatures.OVERWORLD_LYS_GEM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_OVERWORLD_INANIS_GEM_ORES, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(GCPlacedFeatures.OVERWORLD_INANIS_GEM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_NETHER_IGNIS_GEM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(GCPlacedFeatures.NETHER_IGNIS_GEM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_NETHER_ZEPHYR_GEM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(GCPlacedFeatures.NETHER_ZEPHYR_GEM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_NETHER_TERRA_GEM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(GCPlacedFeatures.NETHER_TERRA_GEM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_NETHER_MIZU_GEM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(GCPlacedFeatures.NETHER_MIZU_GEM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_NETHER_AETHER_GEM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(GCPlacedFeatures.NETHER_AETHER_GEM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_NETHER_LYS_GEM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(GCPlacedFeatures.NETHER_LYS_GEM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_NETHER_INANIS_GEM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(GCPlacedFeatures.NETHER_INANIS_GEM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_END_IGNIS_GEM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(GCPlacedFeatures.END_IGNIS_GEM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_END_ZEPHYR_GEM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(GCPlacedFeatures.END_ZEPHYR_GEM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_END_TERRA_GEM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(GCPlacedFeatures.END_TERRA_GEM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_END_MIZU_GEM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(GCPlacedFeatures.END_MIZU_GEM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_END_AETHER_GEM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(GCPlacedFeatures.END_AETHER_GEM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_END_LYS_GEM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(GCPlacedFeatures.END_LYS_GEM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_END_INANIS_GEM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(GCPlacedFeatures.END_INANIS_GEM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_ARCHAIC_REMNANT, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(GCPlacedFeatures.ARCHAIC_REMNANT_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

    }

    //Helper Method
    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(GemCraft.MOD_ID, name));
    }
}
