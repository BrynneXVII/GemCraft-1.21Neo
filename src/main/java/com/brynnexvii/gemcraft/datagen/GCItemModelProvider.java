package com.brynnexvii.gemcraft.datagen;

import com.brynnexvii.gemcraft.GemCraft;
import com.brynnexvii.gemcraft.item.GCItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.LinkedHashMap;

public class GCItemModelProvider extends ItemModelProvider {
    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }

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
        trimmableArmorItem(GCItems.ENDIREN_BOOTS);
        trimmableArmorItem(GCItems.ENDIREN_LEGGINGS);
        trimmableArmorItem(GCItems.ENDIREN_CHESTPLATE);
        trimmableArmorItem(GCItems.ENDIREN_HELMET);
        basicItem(GCItems.ENDIREN_HORSE_ARMOR.get());

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

    private void trimmableArmorItem(DeferredItem<Item> deferredItem) {
        if(deferredItem.get() instanceof ArmorItem armorItem) {
            trimMaterials.forEach((trimMaterial, value) -> {
                float trimValue = value;
                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = armorItem.toString();
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = ResourceLocation.parse(armorItemPath);
                ResourceLocation trimResLoc = ResourceLocation.parse(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = ResourceLocation.parse(currentTrimName);

                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                // Trimmed armorItem files
                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc.getNamespace() + ":item/" + armorItemResLoc.getPath())
                        .texture("layer1", trimResLoc);

                // Non-trimmed armorItem file (normal variant)
                this.withExistingParent(deferredItem.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc.getNamespace()  + ":item/" + trimNameResLoc.getPath()))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                ResourceLocation.fromNamespaceAndPath(GemCraft.MOD_ID,
                                        "item/" + deferredItem.getId().getPath()));
            });
        }
    }
}
