package com.brynnexvii.gemcraft.item;

import com.brynnexvii.gemcraft.GemCraft;
import com.brynnexvii.gemcraft.block.GCBlocks;
import com.brynnexvii.gemcraft.utility.enums.GCAspect;
import com.brynnexvii.gemcraft.utility.enums.GCRarity;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class GCItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(GemCraft.MOD_ID);

    //Items
    //------------ raw gems
    // Ignis
    public static final DeferredItem<Item>  RAW_GARNET = ITEMS.register("raw_garnet", () -> new GCAspectedItem(new Item.Properties(), GCRarity.COMMON, GCAspect.IGNIS));
    public static final DeferredItem<Item>  RAW_SPHALERITE = ITEMS.register("raw_sphalerite", () -> new GCAspectedItem(new Item.Properties(), GCRarity.UNCOMMON, GCAspect.IGNIS));
    public static final DeferredItem<Item>  RAW_RUBY = ITEMS.register("raw_ruby", () -> new GCAspectedItem(new Item.Properties(), GCRarity.RARE, GCAspect.IGNIS));

    // Zephyr
    public static final DeferredItem<Item>  RAW_GOLDEN_BERYL = ITEMS.register("raw_golden_beryl", () -> new GCAspectedItem(new Item.Properties(), GCRarity.COMMON, GCAspect.ZEPHYR));
    public static final DeferredItem<Item>  RAW_CITRINE = ITEMS.register("raw_citrine", () -> new GCAspectedItem(new Item.Properties(), GCRarity.UNCOMMON, GCAspect.ZEPHYR));
    public static final DeferredItem<Item>  RAW_TOPAZ = ITEMS.register("raw_topaz", () -> new GCAspectedItem(new Item.Properties(), GCRarity.RARE, GCAspect.ZEPHYR));

    // Terra
    public static final DeferredItem<Item>  RAW_JADE = ITEMS.register("raw_jade", () -> new GCAspectedItem(new Item.Properties(), GCRarity.COMMON, GCAspect.TERRA));
    public static final DeferredItem<Item>  RAW_PERIDOT = ITEMS.register("raw_peridot", () -> new GCAspectedItem(new Item.Properties(), GCRarity.UNCOMMON, GCAspect.TERRA));
    public static final DeferredItem<Item>  RAW_EMERALD = ITEMS.register("raw_emerald", () -> new GCAspectedItem(new Item.Properties(), GCRarity.RARE, GCAspect.TERRA));

    // Mizu
    public static final DeferredItem<Item>  RAW_AQUAMARINE = ITEMS.register("raw_aquamarine", () -> new GCAspectedItem(new Item.Properties(), GCRarity.COMMON, GCAspect.MIZU));
    public static final DeferredItem<Item>  RAW_IOLITE = ITEMS.register("raw_iolite", () -> new GCAspectedItem(new Item.Properties(), GCRarity.UNCOMMON, GCAspect.MIZU));
    public static final DeferredItem<Item>  RAW_SAPPHIRE = ITEMS.register("raw_sapphire", () -> new GCAspectedItem(new Item.Properties(), GCRarity.RARE, GCAspect.MIZU));

    // Aether
    public static final DeferredItem<Item>  RAW_AMETHYST = ITEMS.register("raw_amethyst", () -> new GCAspectedItem(new Item.Properties(), GCRarity.COMMON, GCAspect.AETHER));
    public static final DeferredItem<Item>  RAW_CHAROITE = ITEMS.register("raw_charoite", () -> new GCAspectedItem(new Item.Properties(), GCRarity.UNCOMMON, GCAspect.AETHER));
    public static final DeferredItem<Item>  RAW_TANZANITE = ITEMS.register("raw_tanzanite", () -> new GCAspectedItem(new Item.Properties(), GCRarity.RARE, GCAspect.AETHER));

    // Lys
    public static final DeferredItem<Item>  RAW_ALBITE = ITEMS.register("raw_albite", () -> new GCAspectedItem(new Item.Properties(), GCRarity.COMMON, GCAspect.LYS));
    public static final DeferredItem<Item>  RAW_DENDRITIC_OPAL = ITEMS.register("raw_dendritic_opal", () -> new GCAspectedItem(new Item.Properties(), GCRarity.UNCOMMON, GCAspect.LYS));
    public static final DeferredItem<Item>  RAW_DIAMOND = ITEMS.register("raw_diamond", () -> new GCAspectedItem(new Item.Properties(), GCRarity.RARE, GCAspect.LYS));

    // Inanis
    public static final DeferredItem<Item>  RAW_SMOKY_QUARTZ = ITEMS.register("raw_smoky_quartz", () -> new GCAspectedItem(new Item.Properties(), GCRarity.COMMON, GCAspect.INANIS));
    public static final DeferredItem<Item>  RAW_FERBERITE = ITEMS.register("raw_ferberite", () -> new GCAspectedItem(new Item.Properties(), GCRarity.UNCOMMON, GCAspect.INANIS));
    public static final DeferredItem<Item>  RAW_ONYX = ITEMS.register("raw_onyx", () -> new GCAspectedItem(new Item.Properties(), GCRarity.RARE, GCAspect.INANIS));

    //Herbs
    public static final DeferredItem<Item> MINT_LEAVES = ITEMS.register("mint_leaves", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MINT_SEEDS = ITEMS.register("mint_seeds", () -> new ItemNameBlockItem(GCBlocks.MINT_HERB_BUSH.get(), new Item.Properties()));

    //Metals
    public static final DeferredItem<Item> ENDIREN_FRAGMENT = ITEMS.register("endiren_fragment", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ENDIREN_INGOT = ITEMS.register("endiren_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ENDIREN_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("endiren_upgrade_smithing_template", GCSmithingTemplateItem::createEndirenUpgradeTemplate);

    //Armor Stuff
    public static final DeferredItem<Item> ENDIREN_BOOTS = ITEMS.register("endiren_boots", () -> new ArmorItem(GCArmorMaterials.ENDIREN, ArmorItem.Type.BOOTS,
            new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(45))));
    public static final DeferredItem<Item> ENDIREN_LEGGINGS = ITEMS.register("endiren_leggings", () -> new ArmorItem(GCArmorMaterials.ENDIREN, ArmorItem.Type.LEGGINGS,
            new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(45))));
    public static final DeferredItem<Item> ENDIREN_CHESTPLATE = ITEMS.register("endiren_chestplate", () -> new GCArmorItem(GCArmorMaterials.ENDIREN, ArmorItem.Type.CHESTPLATE, //only 1 needs to be the mod armor Item type to get the bonus, only doing it on the one will reduce the ticking method calls
            new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(45))));
    public static final DeferredItem<Item> ENDIREN_HELMET = ITEMS.register("endiren_helmet", () -> new ArmorItem(GCArmorMaterials.ENDIREN, ArmorItem.Type.HELMET,
            new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(45))));

    public static final DeferredItem<Item> ENDIREN_HORSE_ARMOR = ITEMS.register("endiren_horse_armor", () -> new AnimalArmorItem(GCArmorMaterials.ENDIREN, AnimalArmorItem.BodyType.EQUESTRIAN, false, new Item.Properties().stacksTo(16))); //yes horse armor only stacks to one but that sucks so....

    //Tools
    public static final  DeferredItem<Item> ENDIREN_SWORD = ITEMS.register("endiren_sword", () -> new SwordItem(GCToolTiers.ENDIREN, new Item.Properties().attributes(SwordItem.createAttributes(GCToolTiers.ENDIREN, 3F, -2.4F))));
    public static final  DeferredItem<Item> ENDIREN_PICKAXE = ITEMS.register("endiren_pickaxe", () -> new PickaxeItem(GCToolTiers.ENDIREN, new Item.Properties().attributes(PickaxeItem.createAttributes(GCToolTiers.ENDIREN, 1F, -2.8F))));
    public static final  DeferredItem<Item> ENDIREN_AXE = ITEMS.register("endiren_axe", () -> new AxeItem(GCToolTiers.ENDIREN, new Item.Properties().attributes(AxeItem.createAttributes(GCToolTiers.ENDIREN, 6F, -3.0F))));
    public static final  DeferredItem<Item> ENDIREN_SHOVEL = ITEMS.register("endiren_shovel", () -> new ShovelItem(GCToolTiers.ENDIREN, new Item.Properties().attributes(ShovelItem.createAttributes(GCToolTiers.ENDIREN, 1.5F, -3F))));
    public static final  DeferredItem<Item> ENDIREN_HOE = ITEMS.register("endiren_hoe", () -> new HoeItem(GCToolTiers.ENDIREN, new Item.Properties().attributes(HoeItem.createAttributes(GCToolTiers.ENDIREN, -4F, 0F))));




    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
