package net.mattias.pedestals.screen;

import net.mattias.pedestals.Pedestals;
import net.mattias.pedestals.screen.custom.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;
import net.neoforged.neoforge.network.IContainerFactory;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(Registries.MENU, Pedestals.MOD_ID);

    public static final DeferredHolder<MenuType<?>, MenuType<PedestalMenu>> PEDESTAL_MENU =
            registerMenuType("pedestal_menu", PedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<OakLogPedestalMenu>> OAK_LOG_PEDESTAL_MENU =
            registerMenuType("oak_log_pedestal_menu", OakLogPedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<BirchLogPedestalMenu>> BIRCH_LOG_PEDESTAL_MENU =
            registerMenuType("birch_log_pedestal_menu", BirchLogPedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<DarkOakLogPedestalMenu>> DARK_OAK_LOG_PEDESTAL_MENU =
            registerMenuType("dark_oak_log_pedestal_menu", DarkOakLogPedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<SpruceLogPedestalMenu>> SPRUCE_LOG_PEDESTAL_MENU =
            registerMenuType("spruce_log_pedestal_menu", SpruceLogPedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<AcaciaLogPedestalMenu>> ACACIA_LOG_PEDESTAL_MENU =
            registerMenuType("acacia_log_pedestal_menu", AcaciaLogPedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<JungleLogPedestalMenu>> JUNGLE_LOG_PEDESTAL_MENU =
            registerMenuType("jungle_log_pedestal_menu", JungleLogPedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<MangroveLogPedestalMenu>> MANGROVE_LOG_PEDESTAL_MENU =
            registerMenuType("mangrove_log_pedestal_menu", MangroveLogPedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<CherryLogPedestalMenu>> CHERRY_LOG_PEDESTAL_MENU =
            registerMenuType("cherry_log_pedestal_menu", CherryLogPedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<OakPlanksPedestalMenu>> OAK_PLANKS_PEDESTAL_MENU =
            registerMenuType("oak_planks_pedestal_menu", OakPlanksPedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<BirchPlanksPedestalMenu>> BIRCH_PLANKS_PEDESTAL_MENU =
            registerMenuType("birch_planks_pedestal_menu", BirchPlanksPedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<DarkOakPlanksPedestalMenu>> DARK_OAK_PLANKS_PEDESTAL_MENU =
            registerMenuType("dark_oak_planks_pedestal_menu", DarkOakPlanksPedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<SprucePlanksPedestalMenu>> SPRUCE_PLANKS_PEDESTAL_MENU =
            registerMenuType("spruce_planks_pedestal_menu", SprucePlanksPedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<AcaciaPlanksPedestalMenu>> ACACIA_PLANKS_PEDESTAL_MENU =
            registerMenuType("acacia_planks_pedestal_menu", AcaciaPlanksPedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<JunglePlanksPedestalMenu>> JUNGLE_PLANKS_PEDESTAL_MENU =
            registerMenuType("jungle_planks_pedestal_menu", JunglePlanksPedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<MangrovePlanksPedestalMenu>> MANGROVE_PLANKS_PEDESTAL_MENU =
            registerMenuType("mangrove_planks_pedestal_menu", MangrovePlanksPedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<CherryPlanksPedestalMenu>> CHERRY_PLANKS_PEDESTAL_MENU =
            registerMenuType("cherry_planks_pedestal_menu", CherryPlanksPedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<CobblestonePedestalMenu>> COBBLESTONE_PEDESTAL_MENU =
            registerMenuType("cobblestone_pedestal_menu", CobblestonePedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<StonePedestalMenu>> STONE_PEDESTAL_MENU =
            registerMenuType("stone_pedestal_menu", StonePedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<SmoothstonePedestalMenu>> SMOOTH_STONE_PEDESTAL_MENU =
            registerMenuType("smooth_stone_pedestal_menu", SmoothstonePedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<StonebricksPedestalMenu>> STONE_BRICKS_PEDESTAL_MENU =
            registerMenuType("stone_bricks_pedestal_menu", StonebricksPedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<BambooPlanksPedestalMenu>> BAMBOO_PLANKS_PEDESTAL_MENU =
            registerMenuType("bamboo_planks_pedestal_menu", BambooPlanksPedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<PolishedAndesitePedestalMenu>> POLISHED_ANDESITE_PEDESTAL_MENU =
            registerMenuType("polished_andesite_pedestal_menu", PolishedAndesitePedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<PolishedDioritePedestalMenu>> POLISHED_DIORITE_PEDESTAL_MENU =
            registerMenuType("polished_diorite_pedestal_menu", PolishedDioritePedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<PolishedGranitePedestalMenu>> POLISHED_GRANITE_PEDESTAL_MENU =
            registerMenuType("polished_granite_pedestal_menu", PolishedGranitePedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<PolishedTuffPedestalMenu>> POLISHED_TUFF_PEDESTAL_MENU =
            registerMenuType("polished_tuff_pedestal_menu", PolishedTuffPedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<PolishedDeepslatePedestalMenu>> POLISHED_DEEPSLATE_PEDESTAL_MENU =
            registerMenuType("polished_deepslate_pedestal_menu", PolishedDeepslatePedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<AndesitePedestalMenu>> ANDESITE_PEDESTAL_MENU =
            registerMenuType("andesite_pedestal_menu", AndesitePedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<DioritePedestalMenu>> DIORITE_PEDESTAL_MENU =
            registerMenuType("diorite_pedestal_menu", DioritePedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<GranitePedestalMenu>> GRANITE_PEDESTAL_MENU =
            registerMenuType("granite_pedestal_menu", GranitePedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<BricksPedestalMenu>> BRICKS_PEDESTAL_MENU =
            registerMenuType("bricks_pedestal_menu", BricksPedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<MossyCobblestonePedestalMenu>> MOSSY_COBBLESTONE_PEDESTAL_MENU =
            registerMenuType("mossy_cobblestone_pedestal_menu", MossyCobblestonePedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<MossyStoneBricksPedestalMenu>> MOSSY_STONE_BRICKS_PEDESTAL_MENU =
            registerMenuType("mossy_stone_bricks_pedestal_menu", MossyStoneBricksPedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<RedSandstonePedestalMenu>> RED_SANDSTONE_PEDESTAL_MENU =
            registerMenuType("red_sandstone_pedestal_menu", RedSandstonePedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<SandstonePedestalMenu>> SANDSTONE_PEDESTAL_MENU =
            registerMenuType("sandstone_pedestal_menu", SandstonePedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<QuartzPedestalMenu>> QUARTZ_PEDESTAL_MENU =
            registerMenuType("quartz_pedestal_menu", QuartzPedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<QuartzPillarPedestalMenu>> QUARTZ_PILLAR_PEDESTAL_MENU =
            registerMenuType("quartz_pillar_pedestal_menu", QuartzPillarPedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<BlackConcretePedestalMenu>> BLACK_CONCRETE_PEDESTAL_MENU =
            registerMenuType("black_concrete_pedestal_menu", BlackConcretePedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<BlueConcretePedestalMenu>> BLUE_CONCRETE_PEDESTAL_MENU =
            registerMenuType("blue_concrete_pedestal_menu", BlueConcretePedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<BrownConcretePedestalMenu>> BROWN_CONCRETE_PEDESTAL_MENU =
            registerMenuType("brown_concrete_pedestal_menu", BrownConcretePedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<CyanConcretePedestalMenu>> CYAN_CONCRETE_PEDESTAL_MENU =
            registerMenuType("cyan_concrete_pedestal_menu", CyanConcretePedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<GrayConcretePedestalMenu>> GRAY_CONCRETE_PEDESTAL_MENU =
            registerMenuType("gray_concrete_pedestal_menu", GrayConcretePedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<GreenConcretePedestalMenu>> GREEN_CONCRETE_PEDESTAL_MENU =
            registerMenuType("green_concrete_pedestal_menu", GreenConcretePedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<LightBlueConcretePedestalMenu>> LIGHT_BLUE_CONCRETE_PEDESTAL_MENU =
            registerMenuType("light_blue_concrete_pedestal_menu", LightBlueConcretePedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<LightGrayConcretePedestalMenu>> LIGHT_GRAY_CONCRETE_PEDESTAL_MENU =
            registerMenuType("light_gray_concrete_pedestal_menu", LightGrayConcretePedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<LimeConcretePedestalMenu>> LIME_CONCRETE_PEDESTAL_MENU =
            registerMenuType("lime_concrete_pedestal_menu", LimeConcretePedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<MagentaConcretePedestalMenu>> MAGENTA_CONCRETE_PEDESTAL_MENU =
            registerMenuType("magenta_concrete_pedestal_menu", MagentaConcretePedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<OrangeConcretePedestalMenu>> ORANGE_CONCRETE_PEDESTAL_MENU =
            registerMenuType("orange_concrete_pedestal_menu", OrangeConcretePedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<PinkConcretePedestalMenu>> PINK_CONCRETE_PEDESTAL_MENU =
            registerMenuType("pink_concrete_pedestal_menu", PinkConcretePedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<PurpleConcretePedestalMenu>> PURPLE_CONCRETE_PEDESTAL_MENU =
            registerMenuType("purple_concrete_pedestal_menu", PurpleConcretePedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<RedConcretePedestalMenu>> RED_CONCRETE_PEDESTAL_MENU =
            registerMenuType("red_concrete_pedestal_menu", RedConcretePedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<WhiteConcretePedestalMenu>> WHITE_CONCRETE_PEDESTAL_MENU =
            registerMenuType("white_concrete_pedestal_menu", WhiteConcretePedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<YellowConcretePedestalMenu>> YELLOW_CONCRETE_PEDESTAL_MENU =
            registerMenuType("yellow_concrete_pedestal_menu", YellowConcretePedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<BlackstonePedestalMenu>> BLACKSTONE_PEDESTAL_MENU =
            registerMenuType("blackstone_pedestal_menu", BlackstonePedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<NetherrackPedestalMenu>> NETHERRACK_PEDESTAL_MENU =
            registerMenuType("netherrack_pedestal_menu", NetherrackPedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<CryingObsidianPedestalMenu>> CRYING_OBSIDIAN_PEDESTAL_MENU =
            registerMenuType("crying_obsidian_pedestal_menu", CryingObsidianPedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<ObsidianPedestalMenu>> OBSIDIAN_PEDESTAL_MENU =
            registerMenuType("obsidian_pedestal_menu", ObsidianPedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<NetherBricksPedestalMenu>> NETHER_BRICKS_PEDESTAL_MENU =
            registerMenuType("nether_bricks_pedestal_menu", NetherBricksPedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<RedNetherBricksPedestalMenu>> RED_NETHER_BRICKS_PEDESTAL_MENU =
            registerMenuType("red_nether_bricks_pedestal_menu", RedNetherBricksPedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<SoulSandPedestalMenu>> SOUL_SAND_PEDESTAL_MENU =
            registerMenuType("soul_sand_pedestal_menu", SoulSandPedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<SoulSoilPedestalMenu>> SOUL_SOIL_PEDESTAL_MENU =
            registerMenuType("soul_soil_pedestal_menu", SoulSoilPedestalMenu::new);

    

    private static <T extends AbstractContainerMenu>DeferredHolder<MenuType<?>, MenuType<T>> registerMenuType(String name,
                                                                                                              IContainerFactory<T> factory) {
        return MENUS.register(name, () -> IMenuTypeExtension.create(factory));
    }

    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }
}