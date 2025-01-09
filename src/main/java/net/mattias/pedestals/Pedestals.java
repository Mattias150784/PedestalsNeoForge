package net.mattias.pedestals;

import net.mattias.pedestals.block.ModBlocks;
import net.mattias.pedestals.block.entity.ModBlockEntities;
import net.mattias.pedestals.block.entity.renderer.*;
import net.mattias.pedestals.item.ModCreativeModeTabs;
import net.mattias.pedestals.item.ModItems;
import net.mattias.pedestals.screen.ModMenuTypes;
import net.mattias.pedestals.screen.custom.*;
import net.minecraft.client.gui.screens.MenuScreens;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(Pedestals.MOD_ID)
public class Pedestals
{
    public static final String MOD_ID = "pedestals";
    private static final Logger LOGGER = LogUtils.getLogger();



    public Pedestals(IEventBus modEventBus, ModContainer modContainer)
    {

        modEventBus.addListener(this::commonSetup);

        ModBlocks.register(modEventBus);
        ModCreativeModeTabs.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlockEntities.register(modEventBus);
        ModMenuTypes.register(modEventBus);

        NeoForge.EVENT_BUS.register(this);


    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }

        @SubscribeEvent
        public static void registerBER(EntityRenderersEvent.RegisterRenderers event) {
            event.registerBlockEntityRenderer(ModBlockEntities.PEDESTAL_BE.get(), PedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.OAK_LOG_PEDESTAL_BE.get(), OakLogPedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.BIRCH_LOG_PEDESTAL_BE.get(), BirchLogPedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.DARK_OAK_LOG_PEDESTAL_BE.get(), DarkOakLogPedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.SPRUCE_LOG_PEDESTAL_BE.get(), SpruceLogPedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.JUNGLE_LOG_PEDESTAL_BE.get(), JungleLogPedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.ACACIA_LOG_PEDESTAL_BE.get(), AcaciaLogPedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.CHERRY_LOG_PEDESTAL_BE.get(), CherryLogPedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.MANGROVE_LOG_PEDESTAL_BE.get(), MangroveLogPedestalBlockEntityRenderer::new);

            event.registerBlockEntityRenderer(ModBlockEntities.OAK_PLANKS_PEDESTAL_BE.get(), OakPlanksPedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.BIRCH_PLANKS_PEDESTAL_BE.get(), BirchPlanksPedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.DARK_OAK_PLANKS_PEDESTAL_BE.get(), DarkOakPlanksPedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.SPRUCE_PLANKS_PEDESTAL_BE.get(), SprucePlanksPedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.JUNGLE_PLANKS_PEDESTAL_BE.get(), JunglePlanksPedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.ACACIA_PLANKS_PEDESTAL_BE.get(), AcaciaPlanksPedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.CHERRY_PLANKS_PEDESTAL_BE.get(), CherryPlanksPedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.MANGROVE_PLANKS_PEDESTAL_BE.get(), MangrovePlanksPedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.BAMBOO_PLANKS_PEDESTAL_BE.get(), BambooPlanksPedestalBlockEntityRenderer::new);

            event.registerBlockEntityRenderer(ModBlockEntities.COBBLESTONE_PEDESTAL_BE.get(), CobblestonePedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.STONE_BRICKS_PEDESTAL_BE.get(), StonebricksPedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.STONE_PEDESTAL_BE.get(), StonePedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.SMOOTH_STONE_PEDESTAL_BE.get(), SmoothstonePedestalBlockEntityRenderer::new);

            event.registerBlockEntityRenderer(ModBlockEntities.POLISHED_ANDESITE_PEDESTAL_BE.get(), PolishedAndesitePedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.POLISHED_DIORITE_PEDESTAL_BE.get(), PolishedDioritePedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.POLISHED_GRANITE_PEDESTAL_BE.get(), PolishedGranitePedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.POLISHED_TUFF_PEDESTAL_BE.get(), PolishedTuffPedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.POLISHED_DEEPSLATE_PEDESTAL_BE.get(), PolishedDeepslatePedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.ANDESITE_PEDESTAL_BE.get(), AndesitePedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.DIORITE_PEDESTAL_BE.get(), DioritePedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.GRANITE_PEDESTAL_BE.get(), GranitePedestalBlockEntityRenderer::new);

            event.registerBlockEntityRenderer(ModBlockEntities.BRICKS_PEDESTAL_BE.get(), BricksPedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.MOSSY_COBBLESTONE_PEDESTAL_BE.get(), MossyCobblestonePedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.MOSSY_STONE_BRICKS_PEDESTAL_BE.get(), MossyStoneBricksPedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.QUARTZ_PEDESTAL_BE.get(), QuartzPedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.QUARTZ_PILLAR_PEDESTAL_BE.get(), QuartzPillarPedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.RED_SANDSTONE_PEDESTAL_BE.get(), RedSandstonePedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.SANDSTONE_PEDESTAL_BE.get(), SandstonePedestalBlockEntityRenderer::new);

            event.registerBlockEntityRenderer(ModBlockEntities.BLACK_CONCRETE_PEDESTAL_BE.get(), BlackConcretePedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.BLUE_CONCRETE_PEDESTAL_BE.get(), BlueConcretePedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.BROWN_CONCRETE_PEDESTAL_BE.get(), BrownConcretePedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.CYAN_CONCRETE_PEDESTAL_BE.get(), CyanConcretePedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.GRAY_CONCRETE_PEDESTAL_BE.get(), GrayConcretePedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.GREEN_CONCRETE_PEDESTAL_BE.get(), GreenConcretePedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_BLUE_CONCRETE_PEDESTAL_BE.get(), LightBlueConcretePedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_GRAY_CONCRETE_PEDESTAL_BE.get(), LightGrayConcretePedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.LIME_CONCRETE_PEDESTAL_BE.get(), LimeConcretePedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.MAGENTA_CONCRETE_PEDESTAL_BE.get(), MagentaConcretePedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.ORANGE_CONCRETE_PEDESTAL_BE.get(), OrangeConcretePedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.PINK_CONCRETE_PEDESTAL_BE.get(), PinkConcretePedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.PURPLE_CONCRETE_PEDESTAL_BE.get(), PurpleConcretePedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.RED_CONCRETE_PEDESTAL_BE.get(), RedConcretePedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.WHITE_CONCRETE_PEDESTAL_BE.get(), WhiteConcretePedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.YELLOW_CONCRETE_PEDESTAL_BE.get(), YellowConcretePedestalBlockEntityRenderer::new);

            event.registerBlockEntityRenderer(ModBlockEntities.BLACKSTONE_PEDESTAL.get(), BlackstonePedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.CRYING_OBSIDIAN_PEDESTAL.get(), CryingObsidianPedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.OBSIDIAN_PEDESTAL.get(), ObsidianPedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.NETHERRACK_PEDESTAL.get(), NetherrackPedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.NETHER_BRICKS_PEDESTAL.get(), NetherBricksPedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.RED_NETHER_BRICKS_PEDESTAL.get(), RedNetherBricksPedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.SOUL_SOIL_PEDESTAL.get(), SoulSoilPedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.SOUL_SAND_PEDESTAL.get(), SoulSandPedestalBlockEntityRenderer::new);

            event.registerBlockEntityRenderer(ModBlockEntities.END_STONE_BRICKS_PEDESTAL.get(), EndStoneBricksPedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.END_STONE_PEDESTAL.get(), EndStonePedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.PURPUR_BLOCK_PEDESTAL.get(), PurpurBlockPedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.PURPUR_PILLAR_PEDESTAL.get(), PurpurPillarPedestalBlockEntityRenderer::new);

        }

        @SubscribeEvent
        public static void registerScreens(RegisterMenuScreensEvent event) {
            event.register(ModMenuTypes.PEDESTAL_MENU.get(), PedestalScreen::new);
            event.register(ModMenuTypes.OAK_LOG_PEDESTAL_MENU.get(), OakLogPedestalScreen::new);
            event.register(ModMenuTypes.BIRCH_LOG_PEDESTAL_MENU.get(), BirchLogPedestalScreen::new);
            event.register(ModMenuTypes.DARK_OAK_LOG_PEDESTAL_MENU.get(), DarkOakLogPedestalScreen::new);
            event.register(ModMenuTypes.SPRUCE_LOG_PEDESTAL_MENU.get(), SpruceLogPedestalScreen::new);
            event.register(ModMenuTypes.JUNGLE_LOG_PEDESTAL_MENU.get(), JungleLogPedestalScreen::new);
            event.register(ModMenuTypes.ACACIA_LOG_PEDESTAL_MENU.get(), AcaciaLogPedestalScreen::new);
            event.register(ModMenuTypes.CHERRY_LOG_PEDESTAL_MENU.get(), CherryLogPedestalScreen::new);
            event.register(ModMenuTypes.MANGROVE_LOG_PEDESTAL_MENU.get(), MangroveLogPedestalScreen::new);

            event.register(ModMenuTypes.OAK_PLANKS_PEDESTAL_MENU.get(), OakPlanksPedestalScreen::new);
            event.register(ModMenuTypes.BIRCH_PLANKS_PEDESTAL_MENU.get(), BirchPlanksPedestalScreen::new);
            event.register(ModMenuTypes.DARK_OAK_PLANKS_PEDESTAL_MENU.get(), DarkOakPlanksPedestalScreen::new);
            event.register(ModMenuTypes.SPRUCE_PLANKS_PEDESTAL_MENU.get(), SprucePlanksPedestalScreen::new);
            event.register(ModMenuTypes.JUNGLE_PLANKS_PEDESTAL_MENU.get(), JunglePlanksPedestalScreen::new);
            event.register(ModMenuTypes.ACACIA_PLANKS_PEDESTAL_MENU.get(), AcaciaPlanksPedestalScreen::new);
            event.register(ModMenuTypes.CHERRY_PLANKS_PEDESTAL_MENU.get(), CherryPlanksPedestalScreen::new);
            event.register(ModMenuTypes.MANGROVE_PLANKS_PEDESTAL_MENU.get(), MangrovePlanksPedestalScreen::new);
            event.register(ModMenuTypes.BAMBOO_PLANKS_PEDESTAL_MENU.get(), BambooPlanksPedestalScreen::new);

            event.register(ModMenuTypes.COBBLESTONE_PEDESTAL_MENU.get(), CobblestonePedestalScreen::new);
            event.register(ModMenuTypes.STONE_PEDESTAL_MENU.get(), StonePedestalScreen::new);
            event.register(ModMenuTypes.STONE_BRICKS_PEDESTAL_MENU.get(), StonebricksPedestalScreen::new);
            event.register(ModMenuTypes.SMOOTH_STONE_PEDESTAL_MENU.get(), SmoothstonePedestalScreen::new);

            event.register(ModMenuTypes.POLISHED_ANDESITE_PEDESTAL_MENU.get(), PolishedAndesitePedestalScreen::new);
            event.register(ModMenuTypes.POLISHED_GRANITE_PEDESTAL_MENU.get(), PolishedGranitePedestalScreen::new);
            event.register(ModMenuTypes.POLISHED_DIORITE_PEDESTAL_MENU.get(), PolishedDioritePedestalScreen::new);
            event.register(ModMenuTypes.POLISHED_TUFF_PEDESTAL_MENU.get(), PolishedTuffPedestalScreen::new);
            event.register(ModMenuTypes.POLISHED_DEEPSLATE_PEDESTAL_MENU.get(), PolishedDeepslatePedestalScreen::new);
            event.register(ModMenuTypes.ANDESITE_PEDESTAL_MENU.get(), AndesitePedestalScreen::new);
            event.register(ModMenuTypes.GRANITE_PEDESTAL_MENU.get(), GranitePedestalScreen::new);
            event.register(ModMenuTypes.DIORITE_PEDESTAL_MENU.get(), DioritePedestalScreen::new);

            event.register(ModMenuTypes.BRICKS_PEDESTAL_MENU.get(), BricksPedestalScreen::new);
            event.register(ModMenuTypes.MOSSY_COBBLESTONE_PEDESTAL_MENU.get(), MossyCobblestonePedestalScreen::new);
            event.register(ModMenuTypes.MOSSY_STONE_BRICKS_PEDESTAL_MENU.get(), MossyStoneBricksPedestalScreen::new);
            event.register(ModMenuTypes.QUARTZ_PEDESTAL_MENU.get(), QuartzPedestalScreen::new);
            event.register(ModMenuTypes.QUARTZ_PILLAR_PEDESTAL_MENU.get(), QuartzPillarPedestalScreen::new);
            event.register(ModMenuTypes.SANDSTONE_PEDESTAL_MENU.get(), SandstonePedestalScreen::new);
            event.register(ModMenuTypes.RED_SANDSTONE_PEDESTAL_MENU.get(), RedSandstonePedestalScreen::new);

            event.register(ModMenuTypes.BLACK_CONCRETE_PEDESTAL_MENU.get(), BlackConcretePedestalScreen::new);
            event.register(ModMenuTypes.BLUE_CONCRETE_PEDESTAL_MENU.get(), BlueConcretePedestalScreen::new);
            event.register(ModMenuTypes.BROWN_CONCRETE_PEDESTAL_MENU.get(), BrownConcretePedestalScreen::new);
            event.register(ModMenuTypes.CYAN_CONCRETE_PEDESTAL_MENU.get(), CyanConcretePedestalScreen::new);
            event.register(ModMenuTypes.GRAY_CONCRETE_PEDESTAL_MENU.get(), GrayConcretePedestalScreen::new);
            event.register(ModMenuTypes.GREEN_CONCRETE_PEDESTAL_MENU.get(), GreenConcretePedestalScreen::new);
            event.register(ModMenuTypes.LIGHT_BLUE_CONCRETE_PEDESTAL_MENU.get(), LightBlueConcretePedestalScreen::new);
            event.register(ModMenuTypes.LIGHT_GRAY_CONCRETE_PEDESTAL_MENU.get(), LightGrayConcretePedestalScreen::new);
            event.register(ModMenuTypes.LIME_CONCRETE_PEDESTAL_MENU.get(), LimeConcretePedestalScreen::new);
            event.register(ModMenuTypes.MAGENTA_CONCRETE_PEDESTAL_MENU.get(), MagentaConcretePedestalScreen::new);
            event.register(ModMenuTypes.ORANGE_CONCRETE_PEDESTAL_MENU.get(), OrangeConcretePedestalScreen::new);
            event.register(ModMenuTypes.PINK_CONCRETE_PEDESTAL_MENU.get(), PinkConcretePedestalScreen::new);
            event.register(ModMenuTypes.PURPLE_CONCRETE_PEDESTAL_MENU.get(), PurpleConcretePedestalScreen::new);
            event.register(ModMenuTypes.RED_CONCRETE_PEDESTAL_MENU.get(), RedConcretePedestalScreen::new);
            event.register(ModMenuTypes.WHITE_CONCRETE_PEDESTAL_MENU.get(), WhiteConcretePedestalScreen::new);
            event.register(ModMenuTypes.YELLOW_CONCRETE_PEDESTAL_MENU.get(), YellowConcretePedestalScreen::new);

            event.register(ModMenuTypes.BLACKSTONE_PEDESTAL_MENU.get(), BlackstonePedestalScreen::new);
            event.register(ModMenuTypes.CRYING_OBSIDIAN_PEDESTAL_MENU.get(), CryingObsidianPedestalScreen::new);
            event.register(ModMenuTypes.OBSIDIAN_PEDESTAL_MENU.get(), ObsidianPedestalScreen::new);
            event.register(ModMenuTypes.NETHER_BRICKS_PEDESTAL_MENU.get(), NetherBricksPedestalScreen::new);
            event.register(ModMenuTypes.RED_NETHER_BRICKS_PEDESTAL_MENU.get(), RedNetherBricksPedestalScreen::new);
            event.register(ModMenuTypes.NETHERRACK_PEDESTAL_MENU.get(), NetherrackPedestalScreen::new);
            event.register(ModMenuTypes.SOUL_SAND_PEDESTAL_MENU.get(), SoulSandPedestalScreen::new);
            event.register(ModMenuTypes.SOUL_SOIL_PEDESTAL_MENU.get(), SoulSoilPedestalScreen::new);

            event.register(ModMenuTypes.END_STONE_BRICKS_PEDESTAL_MENU.get(), EndStoneBricksPedestalScreen::new);
            event.register(ModMenuTypes.END_STONE_PEDESTAL_MENU.get(), EndStonePedestalScreen::new);
            event.register(ModMenuTypes.PURPUR_BLOCK_PEDESTAL_MENU.get(), PurpurBlockPedestalScreen::new);
            event.register(ModMenuTypes.PURPUR_PILLAR_PEDESTAL_MENU.get(), PurpurPillarPedestalScreen::new);


        }
    }
}