package github.gurakai.gme_materials;

import github.gurakai.gme_materials.initilization.BlockInitialization;
import github.gurakai.gme_materials.initilization.CreativeTabInitialization;
import github.gurakai.gme_materials.initilization.ItemInitialization;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(gme_materials.MODID)
public class gme_materials {
    public static final String MODID = "gme_materials";

    public gme_materials() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInitialization.ITEMS.register(bus);
        BlockInitialization.BLOCKS.register(bus);
        CreativeTabInitialization.TABS.register(bus);
    }
}
