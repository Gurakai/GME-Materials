package github.gurakai.gme_materials.initilization;

import github.gurakai.gme_materials.initilization.tiers.ModArmorMaterial;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

public class ArmorMaterialInitialization {
    public static final ModArmorMaterial guralloy = new ModArmorMaterial(
            /*Armor Durability*/ new int[] {/*helmet*/ 462,/*chestplate*/ 672,/*leggings*/ 630,/*boots*/ 546},
            /*Armor Defense*/ new int[] {4, 9, 7, 4},
            30,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            () -> Ingredient.of(ItemInitialization.ingot_guralloy::get),
            "guralloy",
            4.0f,
            0.15f
    );

    public static final ModArmorMaterial padded_leather = new ModArmorMaterial(
            new int[] {110, 160, 150, 130},
            new int [] {1, 3, 4, 1},
            14,
            SoundEvents.ARMOR_EQUIP_LEATHER,
            () -> Ingredient.of(Items.LEATHER),
            "padded_leather",
            0f,
            0.05f
    );
}
