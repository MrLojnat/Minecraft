package bossmod.bossmod.sound;

import bossmod.bossmod.Bossmod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Bossmod.MODID);

    public static final RegistryObject<SoundEvent> RED_SUN_IN_THE_SKY = registerSoundEvents("red_sun_in_the_sky");
    public static final RegistryObject<SoundEvent> GONG = registerSoundEvents("gong");
    public static final RegistryObject<SoundEvent> DUN_DUN_DUN = registerSoundEvents("dun_dun_dun");

    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(Bossmod.MODID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
