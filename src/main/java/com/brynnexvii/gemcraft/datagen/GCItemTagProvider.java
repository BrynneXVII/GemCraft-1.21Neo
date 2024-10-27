package com.brynnexvii.gemcraft.datagen;

import com.brynnexvii.gemcraft.GemCraft;
import com.brynnexvii.gemcraft.item.GCItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class GCItemTagProvider extends ItemTagsProvider {

    public GCItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, GemCraft.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(GCItems.ENDIREN_HELMET.get())
                .add(GCItems.ENDIREN_CHESTPLATE.get())
                .add(GCItems.ENDIREN_LEGGINGS.get())
                .add(GCItems.ENDIREN_BOOTS.get());

        this.tag(ItemTags.TRIM_MATERIALS)
                .add(GCItems.ENDIREN_INGOT.get());

        this.tag(ItemTags.TRIM_TEMPLATES) //does not need upgrade templates
                .add(GCItems.ARCHAIC_SMITHING_TEMPLATE.get());
    }
}
