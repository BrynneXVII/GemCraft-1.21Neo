package com.brynnexvii.gemcraft.trim;

import com.brynnexvii.gemcraft.GemCraft;
import com.brynnexvii.gemcraft.item.GCItems;
import net.minecraft.Util;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;

import java.util.Map;

public class GCTrimMaterials {
    public static final ResourceKey<TrimMaterial> ENDIREN = ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(GemCraft.MOD_ID, "endiren"));

    public static void bootstrap (BootstrapContext<TrimMaterial> context) {
        register(context, ENDIREN, GCItems.ENDIREN_INGOT.get(), Style.EMPTY.withColor(TextColor.parseColor("#031cfc").getOrThrow()), 0.7f); // first float is the color of the text, second float represents colour of trim in inventory, from 0.1-1.0, all already defined, choose approx unless you want to overhaul this
    }

    private static void register(BootstrapContext<TrimMaterial> context, ResourceKey<TrimMaterial> trimKey, Item item, Style style, float itemModelIndex) {
        TrimMaterial trimMaterial = TrimMaterial.create(trimKey.location().getPath(), item, itemModelIndex, Component.translatable(Util.makeDescriptionId("trim_material", trimKey.location())).withStyle(style), Map.of());
        context.register(trimKey, trimMaterial);
    }
}
