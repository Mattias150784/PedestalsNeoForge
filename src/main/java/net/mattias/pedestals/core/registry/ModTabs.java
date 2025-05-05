package net.mattias.pedestals.core.registry;

import net.mattias.pedestals.core.Constants;
import net.mattias.pedestals.core.util.PedestalVariants;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;


import java.util.function.Supplier;

public class ModTabs {

    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Constants.MOD_ID);

    public static final Supplier<CreativeModeTab> TAB = TABS.register("pedestals_tab", () ->
            CreativeModeTab.builder()
                    .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
                    .icon(() -> new ItemStack(ModBlocks.PEDESTAL.get()))
                    .title(Component.translatable("itemGroup.pedestals"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.PEDESTAL.get());
                        PedestalVariants.VARIANTS.forEach(variant -> {
                            // pOutput.accept(ModBlocks.REGISTERED_VARIANT_MAP.get(variant).get());
                            if (ModBlocks.REGISTERED_VARIANT_MAP.get(variant) != null) pOutput.accept(ModBlocks.REGISTERED_VARIANT_MAP.get(variant).get());
                        });
                    })
                    .build());

    public static void register(IEventBus modEventBus) {
        TABS.register(modEventBus);
    }
}