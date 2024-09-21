package bossmod.bossmod.event;

import bossmod.bossmod.Bossmod;
import bossmod.bossmod.entity.client.ModModelLayers;
import bossmod.bossmod.entity.client.MoodengModel;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Bossmod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {

    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.MOODENG_LAYER, MoodengModel::createBodyLayer);
    }
}
