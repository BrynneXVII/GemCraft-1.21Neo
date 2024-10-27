package com.brynnexvii.gemcraft.item;

import com.brynnexvii.gemcraft.GemCraft;
import com.brynnexvii.gemcraft.block.GCBlocks;
import com.sun.jna.platform.unix.X11;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class GCCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GemCraft.MOD_ID);

    public static final Supplier<CreativeModeTab> GEMCRAFT_TAB = CREATIVE_MODE_TABS.register("gemcraft_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(GCItems.RAW_TANZANITE.get()))
                    .title(Component.translatable("creativetab.gemcraft.gemcraft_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(GCBlocks.IGNIS_GEM_ORE);
                        output.accept(GCBlocks.DEEPSLATE_IGNIS_GEM_ORE);
                        output.accept(GCBlocks.NETHER_IGNIS_GEM_ORE);
                        output.accept(GCBlocks.END_STONE_IGNIS_GEM_ORE);
                        output.accept(GCBlocks.ZEPHYR_GEM_ORE);
                        output.accept(GCBlocks.DEEPSLATE_ZEPHYR_GEM_ORE);
                        output.accept(GCBlocks.NETHER_ZEPHYR_GEM_ORE);
                        output.accept(GCBlocks.END_STONE_ZEPHYR_GEM_ORE);
                        output.accept(GCBlocks.TERRA_GEM_ORE);
                        output.accept(GCBlocks.DEEPSLATE_TERRA_GEM_ORE);
                        output.accept(GCBlocks.NETHER_TERRA_GEM_ORE);
                        output.accept(GCBlocks.END_STONE_TERRA_GEM_ORE);
                        output.accept(GCBlocks.MIZU_GEM_ORE);
                        output.accept(GCBlocks.DEEPSLATE_MIZU_GEM_ORE);
                        output.accept(GCBlocks.NETHER_MIZU_GEM_ORE);
                        output.accept(GCBlocks.END_STONE_MIZU_GEM_ORE);
                        output.accept(GCBlocks.AETHER_GEM_ORE);
                        output.accept(GCBlocks.DEEPSLATE_AETHER_GEM_ORE);
                        output.accept(GCBlocks.NETHER_AETHER_GEM_ORE);
                        output.accept(GCBlocks.END_STONE_AETHER_GEM_ORE);
                        output.accept(GCBlocks.LYS_GEM_ORE);
                        output.accept(GCBlocks.DEEPSLATE_LYS_GEM_ORE);
                        output.accept(GCBlocks.NETHER_LYS_GEM_ORE);
                        output.accept(GCBlocks.END_STONE_LYS_GEM_ORE);
                        output.accept(GCBlocks.INANIS_GEM_ORE);
                        output.accept(GCBlocks.DEEPSLATE_INANIS_GEM_ORE);
                        output.accept(GCBlocks.NETHER_INANIS_GEM_ORE);
                        output.accept(GCBlocks.END_STONE_INANIS_GEM_ORE);

                        output.accept(GCItems.RAW_GARNET);
                        output.accept(GCItems.RAW_SPHALERITE);
                        output.accept(GCItems.RAW_RUBY);
                        output.accept(GCItems.RAW_GOLDEN_BERYL);
                        output.accept(GCItems.RAW_CITRINE);
                        output.accept(GCItems.RAW_TOPAZ);
                        output.accept(GCItems.RAW_JADE);
                        output.accept(GCItems.RAW_PERIDOT);
                        output.accept(GCItems.RAW_EMERALD);
                        output.accept(GCItems.RAW_AQUAMARINE);
                        output.accept(GCItems.RAW_IOLITE);
                        output.accept(GCItems.RAW_SAPPHIRE);
                        output.accept(GCItems.RAW_AMETHYST);
                        output.accept(GCItems.RAW_CHAROITE);
                        output.accept(GCItems.RAW_TANZANITE);
                        output.accept(GCItems.RAW_ALBITE);
                        output.accept(GCItems.RAW_DENDRITIC_OPAL);
                        output.accept(GCItems.RAW_DIAMOND);
                        output.accept(GCItems.RAW_SMOKY_QUARTZ);
                        output.accept(GCItems.RAW_FERBERITE);
                        output.accept(GCItems.RAW_ONYX);

                        output.accept(GCBlocks.ARCHAIC_REMNANT);
                        output.accept(GCItems.ENDIREN_FRAGMENT);
                        output.accept(GCItems.ENDIREN_INGOT);
                        output.accept(GCBlocks.ENDIREN_BLOCK);
                        output.accept(GCItems.ENDIREN_UPGRADE_SMITHING_TEMPLATE);

                        output.accept(GCItems.ENDIREN_SWORD);
                        output.accept(GCItems.ENDIREN_PICKAXE);
                        output.accept(GCItems.ENDIREN_AXE);
                        output.accept(GCItems.ENDIREN_SHOVEL);
                        output.accept(GCItems.ENDIREN_HOE);

                        output.accept(GCItems.ENDIREN_HELMET);
                        output.accept(GCItems.ENDIREN_CHESTPLATE);
                        output.accept(GCItems.ENDIREN_LEGGINGS);
                        output.accept(GCItems.ENDIREN_BOOTS);
                        output.accept(GCItems.ENDIREN_HORSE_ARMOR);

                        output.accept(GCItems.MINT_LEAVES);
                        output.accept(GCItems.MINT_SEEDS);
                    }).build());

    public static final Supplier<CreativeModeTab> GEM_TAB = CREATIVE_MODE_TABS.register("gem_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(GCItems.RAW_GARNET.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(GemCraft.MOD_ID, "gemcraft_tab"))
                    .title(Component.translatable("creativetab.gemcraft.gem_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(GCItems.RAW_GARNET);
                        output.accept(GCItems.RAW_SPHALERITE);
                        output.accept(GCItems.RAW_RUBY);
                        output.accept(GCItems.RAW_GOLDEN_BERYL);
                        output.accept(GCItems.RAW_CITRINE);
                        output.accept(GCItems.RAW_TOPAZ);
                        output.accept(GCItems.RAW_JADE);
                        output.accept(GCItems.RAW_PERIDOT);
                        output.accept(GCItems.RAW_EMERALD);
                        output.accept(GCItems.RAW_AQUAMARINE);
                        output.accept(GCItems.RAW_IOLITE);
                        output.accept(GCItems.RAW_SAPPHIRE);
                        output.accept(GCItems.RAW_AMETHYST);
                        output.accept(GCItems.RAW_CHAROITE);
                        output.accept(GCItems.RAW_TANZANITE);
                        output.accept(GCItems.RAW_ALBITE);
                        output.accept(GCItems.RAW_DENDRITIC_OPAL);
                        output.accept(GCItems.RAW_DIAMOND);
                        output.accept(GCItems.RAW_SMOKY_QUARTZ);
                        output.accept(GCItems.RAW_FERBERITE);
                        output.accept(GCItems.RAW_ONYX);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
