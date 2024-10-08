package com.brynnexvii.gemcraft.block;

import com.brynnexvii.gemcraft.GemCraft;
import com.brynnexvii.gemcraft.item.GCItems;
import com.mojang.serialization.MapCodec;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class GCBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(GemCraft.MOD_ID);

    //Blocks
    //------------------------------------------------------------------------------------------------------------------
    //<editor-fold desc="Ore Blocks">
    public static final DeferredBlock<Block> IGNIS_GEM_ORE = registerBlock("ignis_gem_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(3, 7),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.STONE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.STONE)
                            .strength(3.0F, 3.0F)
            ));
    public static final DeferredBlock<Block> DEEPSLATE_IGNIS_GEM_ORE = registerBlock("deepslate_ignis_gem_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(3, 7),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.DEEPSLATE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.DEEPSLATE)
                            .strength(4.5F, 3.0F)
            ));
    public static final DeferredBlock<Block> NETHER_IGNIS_GEM_ORE = registerBlock("nether_ignis_gem_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(3, 7),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.NETHER)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(3.0F, 3.0F)
                            .sound(SoundType.NETHER_ORE)
            ));
    public static final DeferredBlock<Block> END_STONE_IGNIS_GEM_ORE = registerBlock("end_stone_ignis_gem_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(4, 8),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.SAND)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(3.0F, 9.0F)
            ));

    public static final DeferredBlock<Block> ZEPHYR_GEM_ORE = registerBlock("zephyr_gem_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(3, 7),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.STONE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(3.0F, 3.0F)
            ));
    public static final DeferredBlock<Block> DEEPSLATE_ZEPHYR_GEM_ORE = registerBlock("deepslate_zephyr_gem_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(3, 7),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.DEEPSLATE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(4.5F, 3.0F)
            ));
    public static final DeferredBlock<Block> NETHER_ZEPHYR_GEM_ORE = registerBlock("nether_zephyr_gem_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(3, 7),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.NETHER)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(3.0F, 3.0F)
                            .sound(SoundType.NETHER_ORE)
            ));
    public static final DeferredBlock<Block> END_STONE_ZEPHYR_GEM_ORE = registerBlock("end_stone_zephyr_gem_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(4, 8),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.SAND)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(3.0F, 9.0F)
            ));

    public static final DeferredBlock<Block> TERRA_GEM_ORE = registerBlock("terra_gem_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(3, 7),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.STONE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(3.0F, 3.0F)
            ));
    public static final DeferredBlock<Block> DEEPSLATE_TERRA_GEM_ORE = registerBlock("deepslate_terra_gem_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(3, 7),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.DEEPSLATE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(4.5F, 3.0F)
            ));
    public static final DeferredBlock<Block> NETHER_TERRA_GEM_ORE = registerBlock("nether_terra_gem_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(3, 7),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.NETHER)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(3.0F, 3.0F)
                            .sound(SoundType.NETHER_ORE)
            ));
    public static final DeferredBlock<Block> END_STONE_TERRA_GEM_ORE = registerBlock("end_stone_terra_gem_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(4, 8),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.SAND)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(3.0F, 9.0F)
            ));

    public static final DeferredBlock<Block> MIZU_GEM_ORE = registerBlock("mizu_gem_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(3, 7),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.STONE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(3.0F, 3.0F)
            ));
    public static final DeferredBlock<Block> DEEPSLATE_MIZU_GEM_ORE = registerBlock("deepslate_mizu_gem_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(3, 7),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.DEEPSLATE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(4.5F, 3.0F)
            ));
    public static final DeferredBlock<Block> NETHER_MIZU_GEM_ORE = registerBlock("nether_mizu_gem_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(3, 7),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.NETHER)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(3.0F, 3.0F)
                            .sound(SoundType.NETHER_ORE)
            ));
    public static final DeferredBlock<Block> END_STONE_MIZU_GEM_ORE = registerBlock("end_stone_mizu_gem_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(4, 8),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.SAND)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(3.0F, 9.0F)
            ));

    public static final DeferredBlock<Block> AETHER_GEM_ORE = registerBlock("aether_gem_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(3, 7),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.STONE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(3.0F, 3.0F)
            ));
    public static final DeferredBlock<Block> DEEPSLATE_AETHER_GEM_ORE = registerBlock("deepslate_aether_gem_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(3, 7),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.DEEPSLATE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(4.5F, 3.0F)
            ));
    public static final DeferredBlock<Block> NETHER_AETHER_GEM_ORE = registerBlock("nether_aether_gem_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(3, 7),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.NETHER)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(3.0F, 3.0F)
                            .sound(SoundType.NETHER_ORE)
            ));
    public static final DeferredBlock<Block> END_STONE_AETHER_GEM_ORE = registerBlock("end_stone_aether_gem_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(4, 8),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.SAND)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(3.0F, 9.0F)
            ));

    public static final DeferredBlock<Block> LYS_GEM_ORE = registerBlock("lys_gem_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(3, 7),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.STONE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(3.0F, 3.0F)
            ));
    public static final DeferredBlock<Block> DEEPSLATE_LYS_GEM_ORE = registerBlock("deepslate_lys_gem_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(3, 7),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.DEEPSLATE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(4.5F, 3.0F)
            ));
    public static final DeferredBlock<Block> NETHER_LYS_GEM_ORE = registerBlock("nether_lys_gem_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(3, 7),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.NETHER)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(3.0F, 3.0F)
                            .sound(SoundType.NETHER_ORE)
            ));
    public static final DeferredBlock<Block> END_STONE_LYS_GEM_ORE = registerBlock("end_stone_lys_gem_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(4, 8),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.SAND)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(3.0F, 9.0F)
            ));

    public static final DeferredBlock<Block> INANIS_GEM_ORE = registerBlock("inanis_gem_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(3, 7),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.STONE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(3.0F, 3.0F)
            ));
    public static final DeferredBlock<Block> DEEPSLATE_INANIS_GEM_ORE = registerBlock("deepslate_inanis_gem_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(3, 7),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.DEEPSLATE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(4.5F, 3.0F)
            ));
    public static final DeferredBlock<Block> NETHER_INANIS_GEM_ORE = registerBlock("nether_inanis_gem_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(3, 7),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.NETHER)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(3.0F, 3.0F)
                            .sound(SoundType.NETHER_ORE)
            ));
    public static final DeferredBlock<Block> END_STONE_INANIS_GEM_ORE = registerBlock("end_stone_inanis_gem_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(4, 8),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.SAND)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(3.0F, 9.0F)
            ));
    //</editor-fold>

    //Herb Bushes
    public static final DeferredBlock<Block> MINT_HERB_BUSH = registerBlock("mint_herb_bush",
            () -> new GCHerbBushBlock(
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PLANT)
                            .randomTicks()
                            .noCollission()
                            .sound(SoundType.SWEET_BERRY_BUSH)
                            .pushReaction(PushReaction.DESTROY)
            ));



    //Helper Methods
    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block){
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block){
        GCItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
