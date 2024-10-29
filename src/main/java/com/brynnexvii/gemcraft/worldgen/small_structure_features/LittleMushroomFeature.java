package com.brynnexvii.gemcraft.worldgen.small_structure_features;

import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.PipeBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.predicate.BlockStatePredicate;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

public class LittleMushroomFeature extends Feature<NoneFeatureConfiguration> {
    private static final BlockStatePredicate IS_GRASS = BlockStatePredicate.forBlock(Blocks.GRASS_BLOCK);
    private static final BlockStatePredicate IS_MYCELIUM = BlockStatePredicate.forBlock(Blocks.MYCELIUM);
    private final BlockState END_ROD_FOR_STEM = Blocks.END_ROD.defaultBlockState();
    private final BlockState MUSHROOM_TOP;

    public LittleMushroomFeature(Codec<NoneFeatureConfiguration> codec, Block block) {
        super(codec);
        this.MUSHROOM_TOP = block.defaultBlockState().setValue(PipeBlock.DOWN, Boolean.valueOf(false));
    }

    /**
     * Places the given feature at the given location.
     * During world generation, features are provided with a 3x3 region of chunks, centered on the chunk being generated, that they can safely generate into.
     *
     * @param context A context object with a reference to the level and the position
     *                the feature is being placed at
     */
    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
        WorldGenLevel worldgenlevel = context.level();
        BlockPos blockpos = context.origin();
        blockpos = blockpos.above();

        while (worldgenlevel.isEmptyBlock(blockpos) && blockpos.getY() > worldgenlevel.getMinBuildHeight() + 2) {
            blockpos = blockpos.below();
        }

        if (!IS_GRASS.test(worldgenlevel.getBlockState(blockpos)) && !IS_MYCELIUM.test(worldgenlevel.getBlockState(blockpos))) {
            return false;
        } else {
            //Do I need any other checks here?
            worldgenlevel.setBlock(blockpos.offset(0, 1, 0), this.END_ROD_FOR_STEM, 2);
            worldgenlevel.setBlock(blockpos.offset(0, 2, 0), this.MUSHROOM_TOP, 2);
            return true;
        }
    }
}
