package github.gurakai.gme_materials.initilization;

import github.gurakai.gme_materials.gme_materials;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInitialization {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, gme_materials.MODID);

    public static final RegistryObject<Item> electrum_apple = ITEMS.register("electrum_apple",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationMod(0.2f)
                            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 200, 2), 1f)
                            .build())
                    .rarity(Rarity.RARE)
            ));

    //ingots

    public static final RegistryObject<Item> ingot_electrum = ITEMS.register("ingot_electrum",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.RARE)
            ));

    public static final RegistryObject<Item> ingot_invar = ITEMS.register("ingot_invar",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.RARE)
            ));

    public static final RegistryObject<Item> ingot_nickel = ITEMS.register("ingot_nickel",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.RARE)
            ));

    public static final RegistryObject<Item> ingot_red_silverium = ITEMS.register("ingot_red_silverium",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.RARE)
            ));

    public static final RegistryObject<Item> ingot_silver = ITEMS.register("ingot_silver",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.RARE)
            ));

    //nuggets


}
