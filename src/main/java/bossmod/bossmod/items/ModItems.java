package bossmod.bossmod.items;

import bossmod.bossmod.Bossmod;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Bossmod.MODID);

    public static final RegistryObject<Item> PAISSA_ITEM = ITEMS.register("paissa", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().alwaysEat().nutrition(1).saturationMod(2f).build())));
    public static final RegistryObject<Item> CHUN_ITEM = ITEMS.register("chun", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().alwaysEat().nutrition(1).saturationMod(2f).build())));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
