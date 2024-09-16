package github.gurakai.gme_materials.initilization;

import github.gurakai.gme_materials.gme_materials;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
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

    //foodblocks

    public static final RegistryObject<BlockItem> block_the_rarest_steak = addToTab(ITEMS.register("block_the_rarest_steak",
            () -> new BlockItem(BlockInitialization.block_the_rarest_steak.get(),
                    new Item.Properties()
                            .stacksTo(64)
                            .rarity(Rarity.RARE)
                            .food(new FoodProperties.Builder()
                                    .nutrition(20)
                                    .saturationMod(10f)
                                    .meat()
                                    .effect(() -> new MobEffectInstance(MobEffects.CONFUSION,200, 0),0.2f)
                                    .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 100,2),0.05f)
                                    .build())
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

    //raw ore

    public static final  RegistryObject<Item> raw_nickel = addToTab(ITEMS.register("raw_nickel",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
            )));

    public static final  RegistryObject<Item> raw_silver = addToTab(ITEMS.register("raw_silver",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
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

    //powders - blends - amalgams

    public static final RegistryObject<Item> amalgam_guralloy = addToTab(ITEMS.register("amalgam_guralloy",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.RARE)
            )));

    public static final RegistryObject<Item> amalgam_invar = addToTab(ITEMS.register("amalgam_invar",
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

    //weapons

    public static final RegistryObject<SwordItem> sword_guralloy = addToTab(ITEMS.register("sword_guralloy",
            () -> new SwordItem(
                    TierInitialization.guralloy,
                    3,
                    -2.0f,
                    new Item.Properties()
            )));

    public static final RegistryObject<SwordItem> sword_the_rarest = addToTab(ITEMS.register("sword_the_rarest",
            () -> new SwordItem(
                    TierInitialization.guralloy,
                    -4,
                    -2.4f,
                    new Item.Properties()
                            .food(new FoodProperties.Builder()
                                    .alwaysEat()
                                    .effect(() -> new MobEffectInstance(MobEffects.SATURATION, 300, 0),1f)
                                    .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 40, 3),1f)
                                    .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 1200, 1), 1f)
                                    .build())
                            .rarity(Rarity.EPIC)
                            .durability(15)
                            .setNoRepair()
            )));

    //tools

    public static final RegistryObject<PickaxeItem> pickaxe_guralloy = addToTab(ITEMS.register("pickaxe_guralloy",
            () -> new PickaxeItem(
                    TierInitialization.guralloy,
                    1,
                    -2.4f,
                    new Item.Properties()
            )));

    public static final RegistryObject<AxeItem> axe_guralloy = addToTab(ITEMS.register("axe_guralloy",
            () -> new AxeItem(
                    TierInitialization.guralloy,
                    5,
                    -2.6f,
                    new Item.Properties()
            )));

    public static final RegistryObject<ShovelItem> shovel_guralloy = addToTab(ITEMS.register("shovel_guralloy",
            () -> new ShovelItem(
                    TierInitialization.guralloy,
                    1.5f,
                    -2.6f,
                    new Item.Properties()
            )));

    public static final RegistryObject<HoeItem> hoe_guralloy = addToTab(ITEMS.register("hoe_guralloy",
            () -> new HoeItem(
                    TierInitialization.guralloy,
                    -4,
                    0.4f,
                    new Item.Properties()
            )));

    public static final RegistryObject<FlintAndSteelItem> primitive_fire_starter = addToTab(ITEMS.register("primitive_fire_starter",
            () -> new FlintAndSteelItem(new Item.Properties()
                    .durability(1)
            )));

    public static final RegistryObject<FlintAndSteelItem> advanced_fire_starter = addToTab(ITEMS.register("advanced_fire_starter",
            () -> new FlintAndSteelItem(new Item.Properties()
                    .durability(2560)
            )));

    //armor

    public static final RegistryObject<Item> guralloy_template = addToTab(ITEMS.register("guralloy_template",
            () -> new Item(new Item.Properties()
                    .stacksTo(1)
            )));

    public static final RegistryObject<Item> wool_padding = addToTab(ITEMS.register("wool_padding",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
            )));

    public static final RegistryObject<ArmorItem> helmet_guralloy = addToTab(ITEMS.register("helmet_guralloy",
            () -> new ArmorItem(
                    ArmorMaterialInitialization.guralloy,
                    ArmorItem.Type.HELMET,
                    new Item.Properties()
            )));

    public static final RegistryObject<ArmorItem> chestplate_guralloy = addToTab(ITEMS.register("chestplate_guralloy",
            () -> new ArmorItem(
                    ArmorMaterialInitialization.guralloy,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()
            )));

    public static final RegistryObject<ArmorItem> leggings_guralloy = addToTab(ITEMS.register("leggings_guralloy",
            () -> new ArmorItem(
                    ArmorMaterialInitialization.guralloy,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties()
            )));

    public static final RegistryObject<ArmorItem> boots_guralloy = addToTab(ITEMS.register("boots_guralloy",
            () -> new ArmorItem(
                    ArmorMaterialInitialization.guralloy,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties()
            )));

    public static final RegistryObject<ArmorItem> helmet_padded_leather = addToTab(ITEMS.register("helmet_padded_leather",
            () -> new ArmorItem(
                    ArmorMaterialInitialization.padded_leather,
                    ArmorItem.Type.HELMET,
                    new Item.Properties()
            )));

    public static final RegistryObject<ArmorItem> chestplate_padded_leather = addToTab(ITEMS.register("chestplate_padded_leather",
            () -> new ArmorItem(
                    ArmorMaterialInitialization.padded_leather,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()
            )));

    public static final RegistryObject<ArmorItem> leggings_padded_leather = addToTab(ITEMS.register("leggings_padded_leather",
            () -> new ArmorItem(
                    ArmorMaterialInitialization.padded_leather,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties()
            )));

    public static final RegistryObject<ArmorItem> boots_padded_leather = addToTab(ITEMS.register("boots_padded_leather",
            () -> new ArmorItem(
                    ArmorMaterialInitialization.padded_leather,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties()
            )));

    //ore blocks

    public static final RegistryObject<BlockItem> ore_nickel = addToTab(ITEMS.register("ore_nickel",
            () -> new BlockItem(BlockInitialization.ore_nickel.get(),
                    new Item.Properties()
            )));

    public static final RegistryObject<BlockItem> ore_silver = addToTab(ITEMS.register("ore_silver",
            () -> new BlockItem(BlockInitialization.ore_silver.get(),
                    new Item.Properties()
            )));

    public static final RegistryObject<BlockItem> ore_deepslate_nickel = addToTab(ITEMS.register("ore_deepslate_nickel",
            () -> new BlockItem(BlockInitialization.ore_deepslate_nickel.get(),
                    new Item.Properties()
            )));

    public static final RegistryObject<BlockItem> ore_deepslate_silver = addToTab(ITEMS.register("ore_deepslate_silver",
            () -> new BlockItem(BlockInitialization.ore_deepslate_silver.get(),
                    new Item.Properties()
            )));

    //compressed blocks

    public static final RegistryObject<BlockItem> compressed_cobblestone_singularity = addToTab(ITEMS.register("compressed_cobblestone_singularity",
            () -> new BlockItem(BlockInitialization.compressed_cobblestone_singularity.get(),
                    new Item.Properties()
            )));

    public static final RegistryObject<BlockItem> compressed_cobblestone_9 = addToTab(ITEMS.register("compressed_cobblestone_9",
            () -> new BlockItem(BlockInitialization.compressed_cobblestone_9.get(),
                    new Item.Properties()
            )));

    public static final RegistryObject<BlockItem> compressed_cobblestone_8 = addToTab(ITEMS.register("compressed_cobblestone_8",
            () -> new BlockItem(BlockInitialization.compressed_cobblestone_8.get(),
                    new Item.Properties()
            )));

    public static final RegistryObject<BlockItem> compressed_cobblestone_7 = addToTab(ITEMS.register("compressed_cobblestone_7",
            () -> new BlockItem(BlockInitialization.compressed_cobblestone_7.get(),
                    new Item.Properties()
            )));

    public static final RegistryObject<BlockItem> compressed_cobblestone_6 = addToTab(ITEMS.register("compressed_cobblestone_6",
            () -> new BlockItem(BlockInitialization.compressed_cobblestone_6.get(),
                    new Item.Properties()
            )));

    public static final RegistryObject<BlockItem> compressed_cobblestone_5 = addToTab(ITEMS.register("compressed_cobblestone_5",
            () -> new BlockItem(BlockInitialization.compressed_cobblestone_5.get(),
                    new Item.Properties()
            )));

    public static final RegistryObject<BlockItem> compressed_cobblestone_4 = addToTab(ITEMS.register("compressed_cobblestone_4",
            () -> new BlockItem(BlockInitialization.compressed_cobblestone_4.get(),
                    new Item.Properties()
            )));

    public static final RegistryObject<BlockItem> compressed_cobblestone_3 = addToTab(ITEMS.register("compressed_cobblestone_3",
            () -> new BlockItem(BlockInitialization.compressed_cobblestone_3.get(),
                    new Item.Properties()
            )));

    public static final RegistryObject<BlockItem> compressed_cobblestone_2 = addToTab(ITEMS.register("compressed_cobblestone_2",
            () -> new BlockItem(BlockInitialization.compressed_cobblestone_2.get(),
                    new Item.Properties()
            )));

    public static final RegistryObject<BlockItem> compressed_cobblestone = addToTab(ITEMS.register("compressed_cobblestone",
            () -> new BlockItem(BlockInitialization.compressed_cobblestone.get(),
                    new Item.Properties()
            )));
}
