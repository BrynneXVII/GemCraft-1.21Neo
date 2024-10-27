package com.brynnexvii.gemcraft.datagen;

import com.brynnexvii.gemcraft.GemCraft;
import com.brynnexvii.gemcraft.block.GCBlocks;
import com.brynnexvii.gemcraft.item.GCItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class GCRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public GCRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, GCBlocks.ENDIREN_BLOCK.get())
                .pattern("##")
                .pattern("##")
                .define('#', GCItems.ENDIREN_INGOT.get())
                .unlockedBy("has_endiren_ingot", has(GCItems.ENDIREN_INGOT.get())).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, GCItems.ENDIREN_INGOT, 4)
                .requires(GCBlocks.ENDIREN_BLOCK.get())
                .unlockedBy("has_endiren_block", has(GCBlocks.ENDIREN_BLOCK.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, GCItems.ENDIREN_INGOT.get())
                .pattern("EPE")
                .pattern("PDP")
                .pattern("EPE")
                .define('E', GCItems.ENDIREN_FRAGMENT.get())
                .define('P', Items.ENDER_PEARL)
                .define('D', Items.DIAMOND)
                .unlockedBy("has_endiren_fragment", has(GCItems.ENDIREN_FRAGMENT.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, GCItems.ENDIREN_UPGRADE_SMITHING_TEMPLATE.get())
                .pattern("#S#")
                .pattern("#C#")
                .pattern("###")
                .define('#', Items.DIAMOND)
                .define('C', Items.END_STONE)
                .define('S', GCItems.ENDIREN_UPGRADE_SMITHING_TEMPLATE.get())
                .unlockedBy("has_endiren_upgrade_smithing_template", has(GCItems.ENDIREN_UPGRADE_SMITHING_TEMPLATE.get())).save(pRecipeOutput);

        oreBlasting(pRecipeOutput, List.of(GCBlocks.ARCHAIC_REMNANT), RecipeCategory.MISC, GCItems.ENDIREN_FRAGMENT.get(), 4.0f, 200, "endiren_fragment");
    }

    //Helper Methods
    protected static void oreSmelting(RecipeOutput pRecipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pRecipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput pRecipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pRecipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput pRecipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pRecipeOutput, GemCraft.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}