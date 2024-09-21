package bossmod.bossmod.event;

import bossmod.bossmod.Bossmod;
import bossmod.bossmod.entity.ModEntities;
import bossmod.bossmod.entity.custom.MoodengEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(modid = Bossmod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.MOODENG.get(), MoodengEntity.createAttributes().build());
    }
}