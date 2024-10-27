package com.brynnexvii.gemcraft.item;

import com.brynnexvii.gemcraft.GemCraft;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.EnumMap;
import java.util.List;

public class GCArmorMaterials {
    public static final DeferredRegister<ArmorMaterial> ARMOR_MATERIALS = DeferredRegister.create(Registries.ARMOR_MATERIAL, GemCraft.MOD_ID);

    public static final Holder<ArmorMaterial> ENDIREN = ARMOR_MATERIALS.register("endiren", () -> new ArmorMaterial(
            Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 4);
                map.put(ArmorItem.Type.LEGGINGS, 7);
                map.put(ArmorItem.Type.CHESTPLATE, 9);
                map.put(ArmorItem.Type.HELMET, 4);
                map.put(ArmorItem.Type.BODY, 12);
            }), 20, SoundEvents.ARMOR_EQUIP_NETHERITE, () -> Ingredient.of(GCItems.ENDIREN_INGOT.get()),
            List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(GemCraft.MOD_ID, "endiren"))),
            4.0f,0.2f));

    public static void register(IEventBus eventBus){
        ARMOR_MATERIALS.register(eventBus);
    }
}
