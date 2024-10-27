package com.brynnexvii.gemcraft.datagen;

import com.brynnexvii.gemcraft.block.GCBlocks;
import com.brynnexvii.gemcraft.block.GCHerbBushBlock;
import com.brynnexvii.gemcraft.item.GCItems;
import com.brynnexvii.gemcraft.utility.enums.GCMiningStoneType;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.ApplyExplosionDecay;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

import java.util.Set;

public class GCBlockLootTableProvider extends BlockLootSubProvider {
    protected GCBlockLootTableProvider(HolderLookup.Provider provider) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), provider);
    }

    @Override
    protected void generate() {
        //Conditions
        LootItemCondition.Builder MintLootItemConditionBuilder = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(GCBlocks.MINT_HERB_BUSH.get()).setProperties(StatePropertiesPredicate.Builder.properties()
                        .hasProperty(GCHerbBushBlock.AGE, 2));

        //Loot Tables
        dropSelf(GCBlocks.ARCHAIC_REMNANT.get());
        dropSelf(GCBlocks.ENDIREN_BLOCK.get());
        this.add(GCBlocks.MINT_HERB_BUSH.get(), createCropDrops(GCBlocks.MINT_HERB_BUSH.get(), GCItems.MINT_LEAVES.get(), GCItems.MINT_SEEDS.get(), MintLootItemConditionBuilder)); //may not be the right loot table that I want for the herb bushes... this is not the berry bush loot table, but mint has needs not just fruit

        oreWithRarityDrops(GCBlocks.IGNIS_GEM_ORE.get(), GCItems.RAW_GARNET.get(), GCItems.RAW_SPHALERITE.get(), GCItems.RAW_RUBY.get(), GCMiningStoneType.STONE);
        oreWithRarityDrops(GCBlocks.DEEPSLATE_IGNIS_GEM_ORE.get(), GCItems.RAW_GARNET.get(), GCItems.RAW_SPHALERITE.get(), GCItems.RAW_RUBY.get(), GCMiningStoneType.DEEPSLATE);
        oreWithRarityDrops(GCBlocks.NETHER_IGNIS_GEM_ORE.get(), GCItems.RAW_GARNET.get(), GCItems.RAW_SPHALERITE.get(), GCItems.RAW_RUBY.get(), GCMiningStoneType.NETHER);
        oreWithRarityDrops(GCBlocks.END_STONE_IGNIS_GEM_ORE.get(), GCItems.RAW_GARNET.get(), GCItems.RAW_SPHALERITE.get(), GCItems.RAW_RUBY.get(), GCMiningStoneType.END_STONE);
        oreWithRarityDrops(GCBlocks.ZEPHYR_GEM_ORE.get(), GCItems.RAW_GOLDEN_BERYL.get(), GCItems.RAW_CITRINE.get(), GCItems.RAW_TOPAZ.get(), GCMiningStoneType.STONE);
        oreWithRarityDrops(GCBlocks.DEEPSLATE_ZEPHYR_GEM_ORE.get(), GCItems.RAW_GOLDEN_BERYL.get(), GCItems.RAW_CITRINE.get(), GCItems.RAW_TOPAZ.get(), GCMiningStoneType.DEEPSLATE);
        oreWithRarityDrops(GCBlocks.NETHER_ZEPHYR_GEM_ORE.get(), GCItems.RAW_GOLDEN_BERYL.get(), GCItems.RAW_CITRINE.get(), GCItems.RAW_TOPAZ.get(), GCMiningStoneType.NETHER);
        oreWithRarityDrops(GCBlocks.END_STONE_ZEPHYR_GEM_ORE.get(), GCItems.RAW_GOLDEN_BERYL.get(), GCItems.RAW_CITRINE.get(), GCItems.RAW_TOPAZ.get(), GCMiningStoneType.END_STONE);
        oreWithRarityDrops(GCBlocks.TERRA_GEM_ORE.get(), GCItems.RAW_JADE.get(), GCItems.RAW_PERIDOT.get(), GCItems.RAW_EMERALD.get(), GCMiningStoneType.STONE);
        oreWithRarityDrops(GCBlocks.DEEPSLATE_TERRA_GEM_ORE.get(), GCItems.RAW_JADE.get(), GCItems.RAW_PERIDOT.get(), GCItems.RAW_EMERALD.get(), GCMiningStoneType.DEEPSLATE);
        oreWithRarityDrops(GCBlocks.NETHER_TERRA_GEM_ORE.get(), GCItems.RAW_JADE.get(), GCItems.RAW_PERIDOT.get(), GCItems.RAW_EMERALD.get(), GCMiningStoneType.NETHER);
        oreWithRarityDrops(GCBlocks.END_STONE_TERRA_GEM_ORE.get(), GCItems.RAW_JADE.get(), GCItems.RAW_PERIDOT.get(), GCItems.RAW_EMERALD.get(), GCMiningStoneType.END_STONE);
        oreWithRarityDrops(GCBlocks.MIZU_GEM_ORE.get(), GCItems.RAW_AQUAMARINE.get(), GCItems.RAW_IOLITE.get(), GCItems.RAW_SAPPHIRE.get(), GCMiningStoneType.STONE);
        oreWithRarityDrops(GCBlocks.DEEPSLATE_MIZU_GEM_ORE.get(), GCItems.RAW_AQUAMARINE.get(), GCItems.RAW_IOLITE.get(), GCItems.RAW_SAPPHIRE.get(), GCMiningStoneType.DEEPSLATE);
        oreWithRarityDrops(GCBlocks.NETHER_MIZU_GEM_ORE.get(), GCItems.RAW_AQUAMARINE.get(), GCItems.RAW_IOLITE.get(), GCItems.RAW_SAPPHIRE.get(), GCMiningStoneType.NETHER);
        oreWithRarityDrops(GCBlocks.END_STONE_MIZU_GEM_ORE.get(), GCItems.RAW_AQUAMARINE.get(), GCItems.RAW_IOLITE.get(), GCItems.RAW_SAPPHIRE.get(), GCMiningStoneType.END_STONE);
        oreWithRarityDrops(GCBlocks.AETHER_GEM_ORE.get(), GCItems.RAW_AMETHYST.get(), GCItems.RAW_CHAROITE.get(), GCItems.RAW_TANZANITE.get(), GCMiningStoneType.STONE);
        oreWithRarityDrops(GCBlocks.DEEPSLATE_AETHER_GEM_ORE.get(), GCItems.RAW_AMETHYST.get(), GCItems.RAW_CHAROITE.get(), GCItems.RAW_TANZANITE.get(), GCMiningStoneType.DEEPSLATE);
        oreWithRarityDrops(GCBlocks.NETHER_AETHER_GEM_ORE.get(), GCItems.RAW_AMETHYST.get(), GCItems.RAW_CHAROITE.get(), GCItems.RAW_TANZANITE.get(), GCMiningStoneType.NETHER);
        oreWithRarityDrops(GCBlocks.END_STONE_AETHER_GEM_ORE.get(), GCItems.RAW_AMETHYST.get(), GCItems.RAW_CHAROITE.get(), GCItems.RAW_TANZANITE.get(), GCMiningStoneType.END_STONE);
        oreWithRarityDrops(GCBlocks.LYS_GEM_ORE.get(), GCItems.RAW_ALBITE.get(), GCItems.RAW_DENDRITIC_OPAL.get(), GCItems.RAW_DIAMOND.get(), GCMiningStoneType.STONE);
        oreWithRarityDrops(GCBlocks.DEEPSLATE_LYS_GEM_ORE.get(), GCItems.RAW_ALBITE.get(), GCItems.RAW_DENDRITIC_OPAL.get(), GCItems.RAW_DIAMOND.get(), GCMiningStoneType.DEEPSLATE);
        oreWithRarityDrops(GCBlocks.NETHER_LYS_GEM_ORE.get(), GCItems.RAW_ALBITE.get(), GCItems.RAW_DENDRITIC_OPAL.get(), GCItems.RAW_DIAMOND.get(), GCMiningStoneType.NETHER);
        oreWithRarityDrops(GCBlocks.END_STONE_LYS_GEM_ORE.get(), GCItems.RAW_ALBITE.get(), GCItems.RAW_DENDRITIC_OPAL.get(), GCItems.RAW_DIAMOND.get(), GCMiningStoneType.END_STONE);
        oreWithRarityDrops(GCBlocks.INANIS_GEM_ORE.get(), GCItems.RAW_SMOKY_QUARTZ.get(), GCItems.RAW_FERBERITE.get(), GCItems.RAW_ONYX.get(), GCMiningStoneType.STONE);
        oreWithRarityDrops(GCBlocks.DEEPSLATE_INANIS_GEM_ORE.get(), GCItems.RAW_SMOKY_QUARTZ.get(), GCItems.RAW_FERBERITE.get(), GCItems.RAW_ONYX.get(), GCMiningStoneType.DEEPSLATE);
        oreWithRarityDrops(GCBlocks.NETHER_INANIS_GEM_ORE.get(), GCItems.RAW_SMOKY_QUARTZ.get(), GCItems.RAW_FERBERITE.get(), GCItems.RAW_ONYX.get(), GCMiningStoneType.NETHER);
        oreWithRarityDrops(GCBlocks.END_STONE_INANIS_GEM_ORE.get(), GCItems.RAW_SMOKY_QUARTZ.get(), GCItems.RAW_FERBERITE.get(), GCItems.RAW_ONYX.get(), GCMiningStoneType.END_STONE);
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return GCBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }

    //Helper Methods (no basic method for what you want, so they are adapted)
    protected void oreWithRarityDrops(Block block, Item common, Item uncommon, Item rare, GCMiningStoneType miningType){
        HolderLookup.RegistryLookup<Enchantment> registryLookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        switch (miningType){
            case STONE:
                this.add(block, LootTable.lootTable()
                        .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0f))
                                .add(LootItem.lootTableItem(block.asItem())
                                        .when(this.hasSilkTouch())
                                )
                        )
                        .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0f))
                                .when(this.doesNotHaveSilkTouch())
                                .add(LootItem.lootTableItem(common).setWeight(80))
                                .add(LootItem.lootTableItem(uncommon).setWeight(18))
                                .add(LootItem.lootTableItem(rare).setWeight(2))
                                .apply(ApplyBonusCount.addOreBonusCount(registryLookup.getOrThrow(Enchantments.FORTUNE)))
                                .apply(ApplyExplosionDecay.explosionDecay())
                        )
                );
                break;

            case DEEPSLATE:
                this.add(block, LootTable.lootTable()
                        .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0f))
                                .add(LootItem.lootTableItem(block.asItem())
                                        .when(this.hasSilkTouch())
                                )
                        )
                        .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0f))
                                .when(this.doesNotHaveSilkTouch())
                                .add(LootItem.lootTableItem(common).setWeight(76))
                                .add(LootItem.lootTableItem(uncommon).setWeight(20))
                                .add(LootItem.lootTableItem(rare).setWeight(4))
                                .apply(ApplyBonusCount.addOreBonusCount(registryLookup.getOrThrow(Enchantments.FORTUNE)))
                                .apply(ApplyExplosionDecay.explosionDecay())
                        )
                );
                break;

            case NETHER:
                this.add(block, LootTable.lootTable()
                        .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0f))
                                .add(LootItem.lootTableItem(block.asItem())
                                        .when(this.hasSilkTouch())
                                )
                        )
                        .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0f))
                                .when(this.doesNotHaveSilkTouch())
                                .add(LootItem.lootTableItem(common).setWeight(70))
                                .add(LootItem.lootTableItem(uncommon).setWeight(22))
                                .add(LootItem.lootTableItem(rare).setWeight(8))
                                .apply(ApplyBonusCount.addOreBonusCount(registryLookup.getOrThrow(Enchantments.FORTUNE)))
                                .apply(ApplyExplosionDecay.explosionDecay())
                        )
                );
                break;

            case END_STONE:
                this.add(block, LootTable.lootTable()
                        .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0f))
                                .add(LootItem.lootTableItem(block.asItem())
                                        .when(this.hasSilkTouch())
                                )
                        )
                        .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0f))
                                .when(this.doesNotHaveSilkTouch())
                                .add(LootItem.lootTableItem(common).setWeight(55))
                                .add(LootItem.lootTableItem(uncommon).setWeight(29))
                                .add(LootItem.lootTableItem(rare).setWeight(16))
                                .apply(ApplyBonusCount.addOreBonusCount(registryLookup.getOrThrow(Enchantments.FORTUNE)))
                                .apply(ApplyExplosionDecay.explosionDecay())
                        )
                );
                break;

            default:
                dropSelf(block);
        }

    }
}
