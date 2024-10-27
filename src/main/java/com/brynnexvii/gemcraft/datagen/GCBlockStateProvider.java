package com.brynnexvii.gemcraft.datagen;

import com.brynnexvii.gemcraft.GemCraft;
import com.brynnexvii.gemcraft.block.GCBlocks;
import com.brynnexvii.gemcraft.block.GCHerbBushBlock;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.util.function.Function;

public class GCBlockStateProvider extends BlockStateProvider {

    public GCBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, GemCraft.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        makeHerbBush((GCHerbBushBlock) GCBlocks.MINT_HERB_BUSH.get(), "mint_herb_bush_stage", "mint_herb_bush_stage");

        blockWithItem(GCBlocks.ARCHAIC_REMNANT);
        blockWithItem(GCBlocks.ENDIREN_BLOCK);

        blockWithItem(GCBlocks.IGNIS_GEM_ORE);
        blockWithItem(GCBlocks.DEEPSLATE_IGNIS_GEM_ORE);
        blockWithItem(GCBlocks.NETHER_IGNIS_GEM_ORE);
        blockWithItem(GCBlocks.END_STONE_IGNIS_GEM_ORE);
        blockWithItem(GCBlocks.ZEPHYR_GEM_ORE);
        blockWithItem(GCBlocks.DEEPSLATE_ZEPHYR_GEM_ORE);
        blockWithItem(GCBlocks.NETHER_ZEPHYR_GEM_ORE);
        blockWithItem(GCBlocks.END_STONE_ZEPHYR_GEM_ORE);
        blockWithItem(GCBlocks.TERRA_GEM_ORE);
        blockWithItem(GCBlocks.DEEPSLATE_TERRA_GEM_ORE);
        blockWithItem(GCBlocks.NETHER_TERRA_GEM_ORE);
        blockWithItem(GCBlocks.END_STONE_TERRA_GEM_ORE);
        blockWithItem(GCBlocks.MIZU_GEM_ORE);
        blockWithItem(GCBlocks.DEEPSLATE_MIZU_GEM_ORE);
        blockWithItem(GCBlocks.NETHER_MIZU_GEM_ORE);
        blockWithItem(GCBlocks.END_STONE_MIZU_GEM_ORE);
        blockWithItem(GCBlocks.AETHER_GEM_ORE);
        blockWithItem(GCBlocks.DEEPSLATE_AETHER_GEM_ORE);
        blockWithItem(GCBlocks.NETHER_AETHER_GEM_ORE);
        blockWithItem(GCBlocks.END_STONE_AETHER_GEM_ORE);
        blockWithItem(GCBlocks.LYS_GEM_ORE);
        blockWithItem(GCBlocks.DEEPSLATE_LYS_GEM_ORE);
        blockWithItem(GCBlocks.NETHER_LYS_GEM_ORE);
        blockWithItem(GCBlocks.END_STONE_LYS_GEM_ORE);
        blockWithItem(GCBlocks.INANIS_GEM_ORE);
        blockWithItem(GCBlocks.DEEPSLATE_INANIS_GEM_ORE);
        blockWithItem(GCBlocks.NETHER_INANIS_GEM_ORE);
        blockWithItem(GCBlocks.END_STONE_INANIS_GEM_ORE);
    }

    //Helper Methods
    private void blockWithItem(DeferredBlock<Block> deferredBlock){
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    public void makeHerbBush(GCHerbBushBlock block, String modelName, String textureName){
        Function<BlockState, ConfiguredModel[]> function = state -> states(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] states(BlockState state, GCHerbBushBlock block, String modelName, String textureName){
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().cross(
                modelName + state.getValue(block.getAge()),
                ResourceLocation.fromNamespaceAndPath(GemCraft.MOD_ID, "block/" + textureName + state.getValue(block.getAge())))
                .renderType("cutout"));
        return models;
    }
}
