package com.brynnexvii.gemcraft.trim;

import com.brynnexvii.gemcraft.GemCraft;
import com.brynnexvii.gemcraft.item.GCItems;
import net.minecraft.Util;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimPattern;
import net.neoforged.neoforge.registries.DeferredItem;

public class GCTrimPatterns {
    public static final ResourceKey<TrimPattern> ARCHAIC = ResourceKey.create(Registries.TRIM_PATTERN, ResourceLocation.fromNamespaceAndPath(GemCraft.MOD_ID, "archaic"));

    public static void bootstrap(BootstrapContext<TrimPattern> context) {
        register(context, GCItems.ARCHAIC_SMITHING_TEMPLATE, ARCHAIC);
    }

    private static void register(BootstrapContext<TrimPattern> context, DeferredItem<Item> item, ResourceKey<TrimPattern> key) {
        TrimPattern trimPattern = new TrimPattern(key.location(), item.getDelegate(),
                Component.translatable(Util.makeDescriptionId("trim_pattern", key.location())), false);
        context.register(key, trimPattern);
    }
}
