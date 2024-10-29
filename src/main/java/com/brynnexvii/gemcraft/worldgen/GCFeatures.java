package com.brynnexvii.gemcraft.worldgen;

import com.brynnexvii.gemcraft.GemCraft;
import com.brynnexvii.gemcraft.worldgen.small_structure_features.LittleMushroomFeature;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.function.Supplier;

public class GCFeatures {

    public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(BuiltInRegistries.FEATURE, GemCraft.MOD_ID);

    //Features
    public static final DeferredHolder<Feature<?>, LittleMushroomFeature> LITTLE_BROWN_MUSHROOM = FEATURES.register("little_brown_mushroom", () -> new LittleMushroomFeature(NoneFeatureConfiguration.CODEC, Blocks.BROWN_MUSHROOM_BLOCK));
    public static final DeferredHolder<Feature<?>, LittleMushroomFeature> LITTLE_RED_MUSHROOM = FEATURES.register("little_red_mushroom", () -> new LittleMushroomFeature(NoneFeatureConfiguration.CODEC, Blocks.RED_MUSHROOM_BLOCK));

    //Helper Methods
    public static void register(IEventBus eventBus){
        FEATURES.register(eventBus);
    }
}
