package github.gurakai.gme_materials.initilization;

import github.gurakai.gme_materials.gme_materials;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInitialization {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, gme_materials.MODID);

    public static final RegistryObject<Item> guralloy_apple = ITEMS.register("guralloy_apple",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationMod(0.2f)
                            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 2400, 3), 1f)
                            .build())
                    .rarity(Rarity.RARE)
            ));

    //ingots

    public static final RegistryObject<Item> ingot_guralloy = ITEMS.register("ingot_guralloy",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.RARE)
            ));

    public static final RegistryObject<Item> ingot_invar = ITEMS.register("ingot_invar",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.UNCOMMON)
            ));

    public static final RegistryObject<Item> ingot_nickel = ITEMS.register("ingot_nickel",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.COMMON)
            ));

    public static final RegistryObject<Item> ingot_red_silvarium = ITEMS.register("ingot_red_silvarium",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.UNCOMMON)
            ));

    public static final RegistryObject<Item> ingot_silver = ITEMS.register("ingot_silver",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.COMMON)
            ));

    //nuggets

    public static final RegistryObject<Item> nugget_guralloy = ITEMS.register("nugget_guralloy",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.RARE)
            ));

    public static final RegistryObject<Item> nugget_invar = ITEMS.register("nugget_invar",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.UNCOMMON)
            ));

    public static final RegistryObject<Item> nugget_nickel = ITEMS.register("nugget_nickel",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.COMMON)
            ));

    public static final RegistryObject<Item> nugget_red_silvarium = ITEMS.register("nugget_red_silvarium",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.UNCOMMON)
            ));

    public static final RegistryObject<Item> nugget_silver = ITEMS.register("nugget_silver",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.COMMON)
            ));

    //ingot blocks

    public static final RegistryObject<Item> ingot_block_guralloy = ITEMS.register("ingot_block_guralloy",
            () -> new BlockItem(BlockInitialization.ingot_block_guralloy.get(),
                    new Item.Properties()
                            .stacksTo(64)
                            .rarity(Rarity.RARE)
            ));
}
