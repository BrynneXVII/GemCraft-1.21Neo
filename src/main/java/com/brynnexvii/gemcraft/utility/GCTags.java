package com.brynnexvii.gemcraft.utility;

import com.brynnexvii.gemcraft.GemCraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class GCTags {
    public static class Blocks {
        public static final TagKey<Block> INCORRECT_FOR_ENDIREN_TOOL = createTag("incorrect_for_endiren_tool");
        public static final TagKey<Block> NEEDS_ENDIREN_TOOL = createTag("needs_endiren_tool");

        public static final TagKey<Block> NEEDS_NETHERITE_TOOL = createTag("needs_netherite_tool");

        private static TagKey<Block> createTag(String name){
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(GemCraft.MOD_ID, name));
        }
    }

    public static class Items {


        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(GemCraft.MOD_ID, name));
        }
    }
}