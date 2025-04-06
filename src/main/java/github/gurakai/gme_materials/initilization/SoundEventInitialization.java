package github.gurakai.gme_materials.initilization;

import github.gurakai.gme_materials.gme_materials;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SoundEventInitialization {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, gme_materials.MODID);

    public static final RegistryObject<SoundEvent> bar_brawl = registerSoundEvents("bar_brawl");

    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(gme_materials.MODID, name)));
    }

}