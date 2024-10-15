package com.brynnexvii.gemcraft.item;

import com.brynnexvii.gemcraft.utility.GCTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class GCToolTiers {
    public static final Tier ENDIREN = new SimpleTier(GCTags.Blocks.INCORRECT_FOR_ENDIREN_TOOL,3000, 12F, 5.0F, 22, () -> Ingredient.of(GCItems.ENDIREN_INGOT.get()));

}
