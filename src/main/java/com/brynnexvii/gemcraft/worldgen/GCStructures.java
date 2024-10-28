package com.brynnexvii.gemcraft.worldgen;

import com.brynnexvii.gemcraft.GemCraft;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.pools.StructureTemplatePool;

public class GCStructures {
    // *** THIS IS JUST ADDED IN TO START SET-UP FOR LARGER STRUCTURES, NOT SURE WHAT IS CORRECT YET

    //Structures
    public static final ResourceKey<Structure> LOG_DWELLING_KEY = registerKey("log_dwelling_key");

    public static void bootstrap(BootstrapContext<Structure> context) {
        var biomes = context.lookup(Registries.BIOME);
        var template_pools = context.lookup(Registries.TEMPLATE_POOL);


    }

    //Helper Methods
    public static ResourceKey<Structure> registerKey(String name) {
        return ResourceKey.create(Registries.STRUCTURE, ResourceLocation.fromNamespaceAndPath(GemCraft.MOD_ID, name));
    }
}
