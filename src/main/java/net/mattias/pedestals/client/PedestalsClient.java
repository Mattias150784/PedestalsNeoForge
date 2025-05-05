package net.mattias.pedestals.client;

import net.mattias.pedestals.core.Constants;
import net.mattias.pedestals.core.registry.ModBlockEntities;
import net.mattias.pedestals.core.registry.ModMenus;
import net.mattias.pedestals.client.gui.screens.inventory.PedestalScreen;
import net.mattias.pedestals.client.renderer.blockentity.PedestalRenderer;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.EventBusSubscriber.Bus;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

@EventBusSubscriber(
        modid = Constants.MOD_ID,
        bus   = Bus.MOD,
        value = Dist.CLIENT
)
public class PedestalsClient {

    @SubscribeEvent
    public static void onRegisterScreens(RegisterMenuScreensEvent event) {
        event.register(ModMenus.PEDESTAL.get(), PedestalScreen::new);
    }

    @SubscribeEvent
    public static void onRegisterRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(ModBlockEntities.PEDESTAL.get(), PedestalRenderer::new);
    }
}
