package net.mattias.pedestals.core.registry;


import net.neoforged.bus.api.IEventBus;

public class ObjectRegistry {

    public static void register(IEventBus modEventBus) {
        ModBlocks.register(modEventBus);
        ModBlockEntities.register(modEventBus);
        ModItems.register(modEventBus);
        ModTabs.register(modEventBus);
        ModMenus.register(modEventBus);
    }
}