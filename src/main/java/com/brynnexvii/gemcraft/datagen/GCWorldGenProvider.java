package com.brynnexvii.gemcraft.datagen;

import com.brynnexvii.gemcraft.GemCraft;
import com.brynnexvii.gemcraft.worldgen.GCBiomeModifiers;
import com.brynnexvii.gemcraft.worldgen.GCConfiguredFeatures;
import com.brynnexvii.gemcraft.worldgen.GCPlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class GCWorldGenProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, GCConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, GCPlacedFeatures::bootstrap)
            .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, GCBiomeModifiers::bootstrap);



    public GCWorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER,Set.of(GemCraft.MOD_ID));
    }
}
