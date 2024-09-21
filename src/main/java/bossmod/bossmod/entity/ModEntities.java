package bossmod.bossmod.entity;

import bossmod.bossmod.Bossmod;
import bossmod.bossmod.entity.custom.MoodengEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Bossmod.MODID);

    public static final RegistryObject<EntityType<MoodengEntity>> MOODENG =
            ENTITIY_TYPES.register("moodeng", () -> EntityType.Builder.of(MoodengEntity::new, MobCategory.CREATURE)
                    .sized(2.5f, 2.5f).build("moodeng"));

    public static void register(IEventBus eventBus) {
        ENTITIY_TYPES.register(eventBus);
    }
}
