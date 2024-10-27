package com.brynnexvii.gemcraft.datagen;

import com.brynnexvii.gemcraft.GemCraft;
import com.brynnexvii.gemcraft.block.GCBlocks;
import com.brynnexvii.gemcraft.utility.GCTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class GCBlockTagProvider extends BlockTagsProvider {

    public GCBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, GemCraft.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(GCBlocks.ARCHAIC_REMNANT.get())
                .add(GCBlocks.ENDIREN_BLOCK.get())
                .add(GCBlocks.IGNIS_GEM_ORE.get())
                .add(GCBlocks.DEEPSLATE_IGNIS_GEM_ORE.get())
                .add(GCBlocks.NETHER_IGNIS_GEM_ORE.get())
                .add(GCBlocks.END_STONE_IGNIS_GEM_ORE.get())
                .add(GCBlocks.ZEPHYR_GEM_ORE.get())
                .add(GCBlocks.DEEPSLATE_ZEPHYR_GEM_ORE.get())
                .add(GCBlocks.NETHER_ZEPHYR_GEM_ORE.get())
                .add(GCBlocks.END_STONE_ZEPHYR_GEM_ORE.get())
                .add(GCBlocks.TERRA_GEM_ORE.get())
                .add(GCBlocks.DEEPSLATE_TERRA_GEM_ORE.get())
                .add(GCBlocks.NETHER_TERRA_GEM_ORE.get())
                .add(GCBlocks.END_STONE_TERRA_GEM_ORE.get())
                .add(GCBlocks.MIZU_GEM_ORE.get())
                .add(GCBlocks.DEEPSLATE_MIZU_GEM_ORE.get())
                .add(GCBlocks.NETHER_MIZU_GEM_ORE.get())
                .add(GCBlocks.END_STONE_MIZU_GEM_ORE.get())
                .add(GCBlocks.AETHER_GEM_ORE.get())
                .add(GCBlocks.DEEPSLATE_AETHER_GEM_ORE.get())
                .add(GCBlocks.NETHER_AETHER_GEM_ORE.get())
                .add(GCBlocks.END_STONE_AETHER_GEM_ORE.get())
                .add(GCBlocks.LYS_GEM_ORE.get())
                .add(GCBlocks.DEEPSLATE_LYS_GEM_ORE.get())
                .add(GCBlocks.NETHER_LYS_GEM_ORE.get())
                .add(GCBlocks.END_STONE_LYS_GEM_ORE.get())
                .add(GCBlocks.INANIS_GEM_ORE.get())
                .add(GCBlocks.DEEPSLATE_INANIS_GEM_ORE.get())
                .add(GCBlocks.NETHER_INANIS_GEM_ORE.get())
                .add(GCBlocks.END_STONE_INANIS_GEM_ORE.get());

        this.tag(BlockTags.INCORRECT_FOR_IRON_TOOL)
                .addTag(GCTags.Blocks.NEEDS_NETHERITE_TOOL)
                .addTag(GCTags.Blocks.NEEDS_ENDIREN_TOOL);

        this.tag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)
                .addTag(GCTags.Blocks.NEEDS_NETHERITE_TOOL)
                .addTag(GCTags.Blocks.NEEDS_ENDIREN_TOOL);

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(GCBlocks.IGNIS_GEM_ORE.get())
                .add(GCBlocks.DEEPSLATE_IGNIS_GEM_ORE.get())
                .add(GCBlocks.ZEPHYR_GEM_ORE.get())
                .add(GCBlocks.DEEPSLATE_ZEPHYR_GEM_ORE.get())
                .add(GCBlocks.TERRA_GEM_ORE.get())
                .add(GCBlocks.DEEPSLATE_TERRA_GEM_ORE.get())
                .add(GCBlocks.MIZU_GEM_ORE.get())
                .add(GCBlocks.DEEPSLATE_MIZU_GEM_ORE.get())
                .add(GCBlocks.AETHER_GEM_ORE.get())
                .add(GCBlocks.DEEPSLATE_AETHER_GEM_ORE.get())
                .add(GCBlocks.LYS_GEM_ORE.get())
                .add(GCBlocks.DEEPSLATE_LYS_GEM_ORE.get())
                .add(GCBlocks.INANIS_GEM_ORE.get())
                .add(GCBlocks.DEEPSLATE_INANIS_GEM_ORE.get());

        this.tag(BlockTags.INCORRECT_FOR_NETHERITE_TOOL)
                .remove(GCTags.Blocks.NEEDS_ENDIREN_TOOL)
                .addTag(GCTags.Blocks.NEEDS_NETHERITE_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);

        this.tag(GCTags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(GCBlocks.ARCHAIC_REMNANT.get())
                .add(GCBlocks.ENDIREN_BLOCK.get())
                .add(GCBlocks.NETHER_IGNIS_GEM_ORE.get())
                .add(GCBlocks.NETHER_ZEPHYR_GEM_ORE.get())
                .add(GCBlocks.NETHER_TERRA_GEM_ORE.get())
                .add(GCBlocks.NETHER_MIZU_GEM_ORE.get())
                .add(GCBlocks.NETHER_AETHER_GEM_ORE.get())
                .add(GCBlocks.NETHER_LYS_GEM_ORE.get())
                .add(GCBlocks.NETHER_INANIS_GEM_ORE.get());

        this.tag(GCTags.Blocks.INCORRECT_FOR_ENDIREN_TOOL)
                .remove(GCTags.Blocks.NEEDS_ENDIREN_TOOL);

        this.tag(GCTags.Blocks.NEEDS_ENDIREN_TOOL)
                .addTag(GCTags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(GCBlocks.END_STONE_IGNIS_GEM_ORE.get())
                .add(GCBlocks.END_STONE_ZEPHYR_GEM_ORE.get())
                .add(GCBlocks.END_STONE_TERRA_GEM_ORE.get())
                .add(GCBlocks.END_STONE_MIZU_GEM_ORE.get())
                .add(GCBlocks.END_STONE_AETHER_GEM_ORE.get())
                .add(GCBlocks.END_STONE_LYS_GEM_ORE.get())
                .add(GCBlocks.END_STONE_INANIS_GEM_ORE.get());
    }
}
