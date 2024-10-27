package com.brynnexvii.gemcraft.datagen;

import com.brynnexvii.gemcraft.GemCraft;
import com.brynnexvii.gemcraft.item.GCItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;

public class GCItemModelProvider extends ItemModelProvider {
    public GCItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, GemCraft.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(GCItems.RAW_GARNET.get());
        basicItem(GCItems.RAW_SPHALERITE.get());
        basicItem(GCItems.RAW_RUBY.get());
        basicItem(GCItems.RAW_GOLDEN_BERYL.get());
        basicItem(GCItems.RAW_CITRINE.get());
        basicItem(GCItems.RAW_TOPAZ.get());
        basicItem(GCItems.RAW_JADE.get());
        basicItem(GCItems.RAW_PERIDOT.get());
        basicItem(GCItems.RAW_EMERALD.get());
        basicItem(GCItems.RAW_AQUAMARINE.get());
        basicItem(GCItems.RAW_IOLITE.get());
        basicItem(GCItems.RAW_SAPPHIRE.get());
        basicItem(GCItems.RAW_AMETHYST.get());
        basicItem(GCItems.RAW_CHAROITE.get());
        basicItem(GCItems.RAW_TANZANITE.get());
        basicItem(GCItems.RAW_ALBITE.get());
        basicItem(GCItems.RAW_DENDRITIC_OPAL.get());
        basicItem(GCItems.RAW_DIAMOND.get());
        basicItem(GCItems.RAW_SMOKY_QUARTZ.get());
        basicItem(GCItems.RAW_FERBERITE.get());
        basicItem(GCItems.RAW_ONYX.get());

        basicItem(GCItems.MINT_SEEDS.get());
        basicItem(GCItems.MINT_LEAVES.get());

        basicItem(GCItems.ENDIREN_FRAGMENT.get());
        basicItem(GCItems.ENDIREN_INGOT.get());
        basicItem(GCItems.ENDIREN_UPGRADE_SMITHING_TEMPLATE.get());
        basicItem(GCItems.ENDIREN_BOOTS.get());
        basicItem(GCItems.ENDIREN_LEGGINGS.get());
        basicItem(GCItems.ENDIREN_CHESTPLATE.get());
        basicItem(GCItems.ENDIREN_HELMET.get());

        handheldItem(GCItems.ENDIREN_SWORD);
        handheldItem(GCItems.ENDIREN_PICKAXE);
        handheldItem(GCItems.ENDIREN_AXE);
        handheldItem(GCItems.ENDIREN_SHOVEL);
        handheldItem(GCItems.ENDIREN_HOE);
    }

    //Helper Methods
    private ItemModelBuilder handheldItem(DeferredItem<Item> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(GemCraft.MOD_ID,"item/" + item.getId().getPath()));
    }
}
