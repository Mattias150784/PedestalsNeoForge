package net.mattias.pedestals.item;

import net.mattias.pedestals.Pedestals;
import net.mattias.pedestals.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Pedestals.MOD_ID);



    public static final Supplier<CreativeModeTab> PEDESTALS_TAB =
            CREATIVE_MODE_TABS.register("pedestals_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.pedestals.pedestals_tab"))
                    .icon(() -> new ItemStack(ModBlocks.PEDESTAL))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.PEDESTAL.get());
                        pOutput.accept(ModBlocks.OAK_LOG_PEDESTAL.get());
                        pOutput.accept(ModBlocks.BIRCH_LOG_PEDESTAL.get());
                        pOutput.accept(ModBlocks.DARK_OAK_LOG_PEDESTAL.get());
                        pOutput.accept(ModBlocks.SPRUCE_LOG_PEDESTAL.get());
                        pOutput.accept(ModBlocks.ACACIA_LOG_PEDESTAL.get());
                        pOutput.accept(ModBlocks.JUNGLE_LOG_PEDESTAL.get());
                        pOutput.accept(ModBlocks.MANGROVE_LOG_PEDESTAL.get());
                        pOutput.accept(ModBlocks.CHERRY_LOG_PEDESTAL.get());

                        pOutput.accept(ModBlocks.OAK_PLANKS_PEDESTAL.get());
                        pOutput.accept(ModBlocks.BIRCH_PLANKS_PEDESTAL.get());
                        pOutput.accept(ModBlocks.DARK_OAK_PLANKS_PEDESTAL.get());
                        pOutput.accept(ModBlocks.SPRUCE_PLANKS_PEDESTAL.get());
                        pOutput.accept(ModBlocks.ACACIA_PLANKS_PEDESTAL.get());
                        pOutput.accept(ModBlocks.JUNGLE_PLANKS_PEDESTAL.get());
                        pOutput.accept(ModBlocks.MANGROVE_PLANKS_PEDESTAL.get());
                        pOutput.accept(ModBlocks.CHERRY_PLANKS_PEDESTAL.get());
                        pOutput.accept(ModBlocks.BAMBOO_PLANKS_PEDESTAL.get());

                        pOutput.accept(ModBlocks.COBBLESTONE_PEDESTAL.get());
                        pOutput.accept(ModBlocks.STONE_PEDESTAL.get());
                        pOutput.accept(ModBlocks.STONE_BRICKS_PEDESTAL.get());
                        pOutput.accept(ModBlocks.SMOOTH_STONE_PEDESTAL.get());

                        pOutput.accept(ModBlocks.ANDESITE_PEDESTAL.get());
                        pOutput.accept(ModBlocks.GRANITE_PEDESTAL.get());
                        pOutput.accept(ModBlocks.DIORITE_PEDESTAL.get());
                        pOutput.accept(ModBlocks.POLISHED_ANDESITE_PEDESTAL.get());
                        pOutput.accept(ModBlocks.POLISHED_GRANITE_PEDESTAL.get());
                        pOutput.accept(ModBlocks.POLISHED_DIORITE_PEDESTAL.get());
                        pOutput.accept(ModBlocks.POLISHED_TUFF_PEDESTAL.get());
                        pOutput.accept(ModBlocks.POLISHED_DEEPSLATE_PEDESTAL.get());

                        pOutput.accept(ModBlocks.BRICKS_PEDESTAL.get());
                        pOutput.accept(ModBlocks.MOSSY_COBBLESTONE_PEDESTAL.get());
                        pOutput.accept(ModBlocks.MOSSY_STONE_BRICKS_PEDESTAL.get());
                        pOutput.accept(ModBlocks.QUARTZ_PEDESTAL.get());
                        pOutput.accept(ModBlocks.QUARTZ_PILLAR_PEDESTAL.get());
                        pOutput.accept(ModBlocks.RED_SANDSTONE_PEDESTAL.get());
                        pOutput.accept(ModBlocks.SANDSTONE_PEDESTAL.get());
                    }).build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}