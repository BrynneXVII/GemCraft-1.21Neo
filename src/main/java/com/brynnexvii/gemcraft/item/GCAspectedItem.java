package com.brynnexvii.gemcraft.item;

import com.brynnexvii.gemcraft.utility.enums.GCAspect;
import com.brynnexvii.gemcraft.utility.enums.GCRarity;
import net.minecraft.world.item.Item;

public class GCAspectedItem extends Item {
    private final GCRarity rarity;
    private final GCAspect aspect;

    public GCAspectedItem(Properties properties, GCRarity rarity, GCAspect aspect) {
        super(properties);
        this.rarity = rarity;
        this.aspect = aspect;
    }

    /* COPIED FROM FORGE VERSION - DistExecutor is not a thing anymore
    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        Component baseTooltip = Component.translatable("item." + (pStack.getDescriptionId()).split("[.]", 2)[1] + ".tooltip");
        Component expandedTooltip = Component.translatable("item." + (pStack.getDescriptionId()).split("[.]", 2)[1] + ".expanded_tooltip");
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> GCClientAccess.expandedItemTooltip(pLevel, pTooltipComponents, baseTooltip, expandedTooltip, this.aspect));
        //super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }*/
}
