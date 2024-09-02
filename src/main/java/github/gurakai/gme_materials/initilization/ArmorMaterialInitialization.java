package github.gurakai.gme_materials.initilization;

import github.gurakai.gme_materials.initilization.tiers.ModArmorMaterial;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.crafting.Ingredient;

public class ArmorMaterialInitialization {
    public static final ModArmorMaterial guralloy = new ModArmorMaterial(
            new int[] {505, 707, 660, 606},
            new int[] {6, 10, 8, 6},
            30,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            () -> Ingredient.of(ItemInitialization.ingot_guralloy::get),
            "guralloy",
            4.0f,
            0.2f
    );
}
