package com.brynnexvii.gemcraft.item;

import com.brynnexvii.gemcraft.GemCraft;
import net.minecraft.ChatFormatting;
import net.minecraft.Util;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.flag.FeatureFlag;
import net.minecraft.world.item.SmithingTemplateItem;

import java.util.List;

public class GCSmithingTemplateItem extends SmithingTemplateItem {
    private static final ChatFormatting TITLE_FORMAT = ChatFormatting.GRAY;
    private static final ChatFormatting DESCRIPTION_FORMAT = ChatFormatting.BLUE;
    private static final Component ENDIREN_UPGRADE = Component.translatable(
                    Util.makeDescriptionId("upgrade", ResourceLocation.fromNamespaceAndPath(GemCraft.MOD_ID,"endiren_upgrade"))
            )
            .withStyle(TITLE_FORMAT);
    private static final Component ENDIREN_UPGRADE_APPLIES_TO = Component.translatable(
                    Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(GemCraft.MOD_ID,"smithing_template.endiren_upgrade.applies_to"))
            )
            .withStyle(DESCRIPTION_FORMAT);
    private static final Component ENDIREN_UPGRADE_INGREDIENTS = Component.translatable(
                    Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(GemCraft.MOD_ID,"smithing_template.endiren_upgrade.ingredients"))
            )
            .withStyle(DESCRIPTION_FORMAT);
    private static final Component ENDIREN_UPGRADE_BASE_SLOT_DESCRIPTION = Component.translatable(
            Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(GemCraft.MOD_ID,"smithing_template.endiren_upgrade.base_slot_description"))
    );
    private static final Component ENDIREN_UPGRADE_ADDITIONS_SLOT_DESCRIPTION = Component.translatable(
            Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(GemCraft.MOD_ID, "smithing_template.endiren_upgrade.additions_slot_description"))
    );
    private static final ResourceLocation EMPTY_SLOT_HELMET = ResourceLocation.withDefaultNamespace("item/empty_armor_slot_helmet");
    private static final ResourceLocation EMPTY_SLOT_CHESTPLATE = ResourceLocation.withDefaultNamespace("item/empty_armor_slot_chestplate");
    private static final ResourceLocation EMPTY_SLOT_LEGGINGS = ResourceLocation.withDefaultNamespace("item/empty_armor_slot_leggings");
    private static final ResourceLocation EMPTY_SLOT_BOOTS = ResourceLocation.withDefaultNamespace("item/empty_armor_slot_boots");
    private static final ResourceLocation EMPTY_SLOT_HOE = ResourceLocation.withDefaultNamespace("item/empty_slot_hoe");
    private static final ResourceLocation EMPTY_SLOT_AXE = ResourceLocation.withDefaultNamespace("item/empty_slot_axe");
    private static final ResourceLocation EMPTY_SLOT_SWORD = ResourceLocation.withDefaultNamespace("item/empty_slot_sword");
    private static final ResourceLocation EMPTY_SLOT_SHOVEL = ResourceLocation.withDefaultNamespace("item/empty_slot_shovel");
    private static final ResourceLocation EMPTY_SLOT_PICKAXE = ResourceLocation.withDefaultNamespace("item/empty_slot_pickaxe");
    private static final ResourceLocation EMPTY_SLOT_INGOT = ResourceLocation.withDefaultNamespace("item/empty_slot_ingot");

    public GCSmithingTemplateItem(Component appliesTo, Component ingredients, Component upgradeDescription, Component baseSlotDescription, Component additionsSlotDescription, List<ResourceLocation> baseSlotEmptyIcons, List<ResourceLocation> additionalSlotEmptyIcons, FeatureFlag... requiredFeatures) {
        super(appliesTo, ingredients, upgradeDescription, baseSlotDescription, additionsSlotDescription, baseSlotEmptyIcons, additionalSlotEmptyIcons, requiredFeatures);
    }

    public static SmithingTemplateItem createEndirenUpgradeTemplate() {
        return new SmithingTemplateItem(
                ENDIREN_UPGRADE_APPLIES_TO,
                ENDIREN_UPGRADE_INGREDIENTS,
                ENDIREN_UPGRADE,
                ENDIREN_UPGRADE_BASE_SLOT_DESCRIPTION,
                ENDIREN_UPGRADE_ADDITIONS_SLOT_DESCRIPTION,
                createEndirenUpgradeIconList(),
                createEndirenUpgradeMaterialList()
        );
    }

    private static List<ResourceLocation> createEndirenUpgradeMaterialList() {
        return List.of(EMPTY_SLOT_INGOT);
    }

    private static List<ResourceLocation> createEndirenUpgradeIconList() {
        return List.of(
                EMPTY_SLOT_HELMET,
                EMPTY_SLOT_SWORD,
                EMPTY_SLOT_CHESTPLATE,
                EMPTY_SLOT_PICKAXE,
                EMPTY_SLOT_LEGGINGS,
                EMPTY_SLOT_AXE,
                EMPTY_SLOT_BOOTS,
                EMPTY_SLOT_HOE,
                EMPTY_SLOT_SHOVEL
        );
    }
}
