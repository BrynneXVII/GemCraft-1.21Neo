package com.brynnexvii.gemcraft.item;

import com.brynnexvii.gemcraft.GemCraft;
import com.brynnexvii.gemcraft.block.GCBlocks;
import com.brynnexvii.gemcraft.utility.enums.GCAspect;
import com.brynnexvii.gemcraft.utility.enums.GCRarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
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




    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
