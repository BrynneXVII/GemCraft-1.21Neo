package com.brynnexvii.gemcraft.datagen;

import com.brynnexvii.gemcraft.GemCraft;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = GemCraft.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class GCDataGenerator {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new GCRecipeProvider(packOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new LootTableProvider(packOutput, Collections.emptySet(),
                List.of(new LootTableProvider.SubProviderEntry(GCBlockLootTableProvider::new, LootContextParamSets.BLOCK)), lookupProvider));

        BlockTagsProvider blockTagsProvider = new GCBlockTagProvider(packOutput, lookupProvider, existingFileHelper);
        generator.addProvider(event.includeServer(), blockTagsProvider);
        generator.addProvider(event.includeServer(), new GCItemTagProvider(packOutput, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));

        generator.addProvider(event.includeClient(), new GCItemModelProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new GCBlockStateProvider(packOutput, existingFileHelper));

        generator.addProvider(event.includeServer(), new GCDatapackProvider(packOutput, lookupProvider));

        generator.addProvider(event.includeServer(), new GCWorldGenProvider(packOutput, lookupProvider));
    }
}
