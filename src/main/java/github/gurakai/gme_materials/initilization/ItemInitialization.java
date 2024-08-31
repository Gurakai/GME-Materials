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

import static github.gurakai.gme_materials.initilization.CreativeTabInitialization.addToTab;

public class ItemInitialization {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, gme_materials.MODID);

    //food

    public static final RegistryObject<Item> guralloy_apple = addToTab(ITEMS.register("guralloy_apple",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationMod(0.2f)
                            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 2400, 3), 1f)
                            .build())
                    .rarity(Rarity.RARE)
            )));

    //ingots

    public static final RegistryObject<Item> ingot_guralloy = addToTab(ITEMS.register("ingot_guralloy",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.RARE)
            )));

    public static final RegistryObject<Item> ingot_invar = addToTab(ITEMS.register("ingot_invar",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.UNCOMMON)
            )));

    public static final RegistryObject<Item> ingot_nickel = addToTab(ITEMS.register("ingot_nickel",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.COMMON)
            )));

    public static final RegistryObject<Item> ingot_red_silvarium = addToTab(ITEMS.register("ingot_red_silvarium",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.UNCOMMON)
            )));

    public static final RegistryObject<Item> ingot_silver = addToTab(ITEMS.register("ingot_silver",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.COMMON)
            )));

    //nuggets

    public static final RegistryObject<Item> nugget_guralloy = addToTab(ITEMS.register("nugget_guralloy",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.RARE)
            )));

    public static final RegistryObject<Item> nugget_invar = addToTab(ITEMS.register("nugget_invar",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.UNCOMMON)
            )));

    public static final RegistryObject<Item> nugget_nickel = addToTab(ITEMS.register("nugget_nickel",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.COMMON)
            )));

    public static final RegistryObject<Item> nugget_red_silvarium = addToTab(ITEMS.register("nugget_red_silvarium",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.UNCOMMON)
            )));

    public static final RegistryObject<Item> nugget_silver = addToTab(ITEMS.register("nugget_silver",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.COMMON)
            )));

    //ingot blocks

    public static final RegistryObject<Item> ingot_block_guralloy = addToTab(ITEMS.register("ingot_block_guralloy",
            () -> new BlockItem(BlockInitialization.ingot_block_guralloy.get(),
                    new Item.Properties()
                            .stacksTo(64)
                            .rarity(Rarity.RARE)
            )));

    public static final RegistryObject<Item> ingot_block_invar = addToTab(ITEMS.register("ingot_block_invar",
            () -> new BlockItem(BlockInitialization.ingot_block_invar.get(),
                    new Item.Properties()
                            .stacksTo(64)
                            .rarity(Rarity.UNCOMMON)
            )));

    public static final RegistryObject<Item> ingot_block_nickel = addToTab(ITEMS.register("ingot_block_nickel",
            () -> new BlockItem(BlockInitialization.ingot_block_nickel.get(),
                    new Item.Properties()
                            .stacksTo(64)
                            .rarity(Rarity.RARE)
            )));

    public static final RegistryObject<Item> ingot_block_red_silvarium = addToTab(ITEMS.register("ingot_block_red_silvarium",
            () -> new BlockItem(BlockInitialization.ingot_block_red_silvarium.get(),
                    new Item.Properties()
                            .stacksTo(64)
                            .rarity(Rarity.RARE)
            )));
    public static final RegistryObject<Item> ingot_block_silver = addToTab(ITEMS.register("ingot_block_silver",
            () -> new BlockItem(BlockInitialization.ingot_block_silver.get(),
                    new Item.Properties()
                            .stacksTo(64)
                            .rarity(Rarity.RARE)
            )));

    //powders

    public static final RegistryObject<Item> amalgam_guralloy = addToTab(ITEMS.register("amalgam_guralloy",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.RARE)
            )));

    public static final RegistryObject<Item> pulverized_invar = addToTab(ITEMS.register("pulverized_invar",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.UNCOMMON)
            )));

    public static final RegistryObject<Item> pulverized_nickel = addToTab(ITEMS.register("pulverized_nickel",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.COMMON)
            )));

    public static final RegistryObject<Item> amalgam_red_silvarium = addToTab(ITEMS.register("amalgam_red_silvarium",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.UNCOMMON)
            )));

    public static final RegistryObject<Item> pulverized_silver = addToTab(ITEMS.register("pulverized_silver",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.COMMON)
            )));
}
