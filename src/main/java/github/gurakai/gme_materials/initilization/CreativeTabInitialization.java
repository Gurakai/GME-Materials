package github.gurakai.gme_materials.initilization;

import github.gurakai.gme_materials.gme_materials;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class CreativeTabInitialization {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, gme_materials.MODID);

    public static final List<Supplier<? extends ItemLike>> gme_materials_creativeTabEntries = new ArrayList<>();

    public static final RegistryObject<CreativeModeTab> gme_materials_creativetab = TABS.register("gme_materials_creativetab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.gme_materials_creativetab"))
                    .icon(ItemInitialization.guralloy_apple.get()::getDefaultInstance)
                    .displayItems(((itemDisplayParameters, output) ->
                            gme_materials_creativeTabEntries.forEach(itemLike -> output.accept(itemLike.get()))))
                    .build()
    );

    public static <T extends Item> RegistryObject<T> addToTab(RegistryObject<T> itemLike) {
        gme_materials_creativeTabEntries.add(itemLike);
        return itemLike;
    }
}
