package net.mattias.pedestals.client;

import net.mattias.pedestals.core.Constants;
import net.mattias.pedestals.core.registry.ModBlockEntities;
import net.mattias.pedestals.core.registry.ModBlocks;
import net.mattias.pedestals.core.registry.ModMenus;
import net.mattias.pedestals.core.util.PedestalVariant;
import net.mattias.pedestals.client.gui.screens.inventory.PedestalScreen;
import net.mattias.pedestals.client.renderer.blockentity.PedestalRenderer;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.EventBusSubscriber.Bus;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
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
    public static void onClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            for (PedestalVariant variant : ModBlocks.REGISTERED_VARIANT_MAP.keySet()) {
                String name = variant.registryName().toLowerCase();
                RenderType renderType = name.contains("stained_glass") || name.contains("glass")
                        ? RenderType.translucent()
                        : RenderType.solid();
                ItemBlockRenderTypes.setRenderLayer(
                        ModBlocks.REGISTERED_VARIANT_MAP.get(variant).get(),
                        renderType
                );
            }
        });
    }

    @SubscribeEvent
    public static void onRegisterScreens(RegisterMenuScreensEvent event) {
        event.register(ModMenus.PEDESTAL.get(), PedestalScreen::new);
    }

    @SubscribeEvent
    public static void onRegisterRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(ModBlockEntities.PEDESTAL.get(), PedestalRenderer::new);
    }

    @SubscribeEvent
    public static void registerBER(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(PedestalRenderer.PEDESTAL_LAYER, PedestalRenderer::createBodyLayer);
    }
}