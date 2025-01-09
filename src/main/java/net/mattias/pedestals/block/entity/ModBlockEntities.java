package net.mattias.pedestals.block.entity;

import net.mattias.pedestals.Pedestals;
import net.mattias.pedestals.block.ModBlocks;
import net.mattias.pedestals.block.custom.SmoothstonePedestalBlock;
import net.mattias.pedestals.block.entity.custom.*;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, Pedestals.MOD_ID);

    public static final Supplier<BlockEntityType<PedestalBlockEntity>> PEDESTAL_BE =
            BLOCK_ENTITIES.register("pedestal_be", () -> BlockEntityType.Builder.of(
                    PedestalBlockEntity::new, ModBlocks.PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<OakLogPedestalBlockEntity>> OAK_LOG_PEDESTAL_BE =
            BLOCK_ENTITIES.register("oak_log_pedestal_be", () -> BlockEntityType.Builder.of(
                    OakLogPedestalBlockEntity::new, ModBlocks.OAK_LOG_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<BirchLogPedestalBlockEntity>> BIRCH_LOG_PEDESTAL_BE =
            BLOCK_ENTITIES.register("birch_log_pedestal_be", () -> BlockEntityType.Builder.of(
                    BirchLogPedestalBlockEntity::new, ModBlocks.BIRCH_LOG_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<DarkOakLogPedestalBlockEntity>> DARK_OAK_LOG_PEDESTAL_BE =
            BLOCK_ENTITIES.register("dark_oak_log_pedestal_be", () -> BlockEntityType.Builder.of(
                    DarkOakLogPedestalBlockEntity::new, ModBlocks.DARK_OAK_LOG_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<SpruceLogPedestalBlockEntity>> SPRUCE_LOG_PEDESTAL_BE =
            BLOCK_ENTITIES.register("spruce_log_pedestal_be", () -> BlockEntityType.Builder.of(
                    SpruceLogPedestalBlockEntity::new, ModBlocks.SPRUCE_LOG_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<AcaciaLogPedestalBlockEntity>> ACACIA_LOG_PEDESTAL_BE =
            BLOCK_ENTITIES.register("acacia_log_pedestal_be", () -> BlockEntityType.Builder.of(
                    AcaciaLogPedestalBlockEntity::new, ModBlocks.ACACIA_LOG_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<JungleLogPedestalBlockEntity>> JUNGLE_LOG_PEDESTAL_BE =
            BLOCK_ENTITIES.register("jungle_log_pedestal_be", () -> BlockEntityType.Builder.of(
                   JungleLogPedestalBlockEntity::new, ModBlocks.JUNGLE_LOG_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<CherryLogPedestalBlockEntity>> CHERRY_LOG_PEDESTAL_BE =
            BLOCK_ENTITIES.register("cherry_log_pedestal_be", () -> BlockEntityType.Builder.of(
                    CherryLogPedestalBlockEntity::new, ModBlocks.CHERRY_LOG_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<MangroveLogPedestalBlockEntity>> MANGROVE_LOG_PEDESTAL_BE =
            BLOCK_ENTITIES.register("mangrove_log_pedestal_be", () -> BlockEntityType.Builder.of(
                    MangroveLogPedestalBlockEntity::new, ModBlocks.MANGROVE_LOG_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<OakPlanksPedestalBlockEntity>> OAK_PLANKS_PEDESTAL_BE =
            BLOCK_ENTITIES.register("oak_planks_pedestal_be", () -> BlockEntityType.Builder.of(
                    OakPlanksPedestalBlockEntity::new, ModBlocks.OAK_PLANKS_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<BirchPlanksPedestalBlockEntity>> BIRCH_PLANKS_PEDESTAL_BE =
            BLOCK_ENTITIES.register("birch_planks_pedestal_be", () -> BlockEntityType.Builder.of(
                    BirchPlanksPedestalBlockEntity::new, ModBlocks.BIRCH_PLANKS_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<DarkOakPlanksPedestalBlockEntity>> DARK_OAK_PLANKS_PEDESTAL_BE =
            BLOCK_ENTITIES.register("dark_oak_planks_pedestal_be", () -> BlockEntityType.Builder.of(
                    DarkOakPlanksPedestalBlockEntity::new, ModBlocks.DARK_OAK_PLANKS_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<SprucePlanksPedestalBlockEntity>> SPRUCE_PLANKS_PEDESTAL_BE =
            BLOCK_ENTITIES.register("spruce_planks_pedestal_be", () -> BlockEntityType.Builder.of(
                    SprucePlanksPedestalBlockEntity::new, ModBlocks.SPRUCE_PLANKS_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<AcaciaPlanksPedestalBlockEntity>> ACACIA_PLANKS_PEDESTAL_BE =
            BLOCK_ENTITIES.register("acacia_planks_pedestal_be", () -> BlockEntityType.Builder.of(
                    AcaciaPlanksPedestalBlockEntity::new, ModBlocks.ACACIA_PLANKS_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<JunglePlanksPedestalBlockEntity>> JUNGLE_PLANKS_PEDESTAL_BE =
            BLOCK_ENTITIES.register("jungle_planks_pedestal_be", () -> BlockEntityType.Builder.of(
                    JunglePlanksPedestalBlockEntity::new, ModBlocks.JUNGLE_PLANKS_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<CherryPlanksPedestalBlockEntity>> CHERRY_PLANKS_PEDESTAL_BE =
            BLOCK_ENTITIES.register("cherry_planks_pedestal_be", () -> BlockEntityType.Builder.of(
                    CherryPlanksPedestalBlockEntity::new, ModBlocks.CHERRY_PLANKS_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<MangrovePlanksPedestalBlockEntity>> MANGROVE_PLANKS_PEDESTAL_BE =
            BLOCK_ENTITIES.register("mangrove_planks_pedestal_be", () -> BlockEntityType.Builder.of(
                    MangrovePlanksPedestalBlockEntity::new, ModBlocks.MANGROVE_PLANKS_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<CobblestonePedestalBlockEntity>> COBBLESTONE_PEDESTAL_BE =
            BLOCK_ENTITIES.register("cobble_pedestal_be", () -> BlockEntityType.Builder.of(
                    CobblestonePedestalBlockEntity::new, ModBlocks.COBBLESTONE_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<StonePedestalBlockEntity>> STONE_PEDESTAL_BE =
            BLOCK_ENTITIES.register("stone_pedestal_be", () -> BlockEntityType.Builder.of(
                    StonePedestalBlockEntity::new, ModBlocks.STONE_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<SmoothstonePedestalBlockEntity>> SMOOTH_STONE_PEDESTAL_BE =
            BLOCK_ENTITIES.register("smooth_stone_pedestal_be", () -> BlockEntityType.Builder.of(
                    SmoothstonePedestalBlockEntity::new, ModBlocks.SMOOTH_STONE_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<StonebricksPedestalBlockEntity>> STONE_BRICKS_PEDESTAL_BE =
            BLOCK_ENTITIES.register("stone_bricks_pedestal_be", () -> BlockEntityType.Builder.of(
                    StonebricksPedestalBlockEntity::new, ModBlocks.STONE_BRICKS_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<BambooPlanksPedestalBlockEntity>> BAMBOO_PLANKS_PEDESTAL_BE =
            BLOCK_ENTITIES.register("bamboo_planks_pedestal_be", () -> BlockEntityType.Builder.of(
                    BambooPlanksPedestalBlockEntity::new, ModBlocks.BAMBOO_PLANKS_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<PolishedAndesitePedestalBlockEntity>> POLISHED_ANDESITE_PEDESTAL_BE =
            BLOCK_ENTITIES.register("polished_andesite_pedestal", () -> BlockEntityType.Builder.of(
                    PolishedAndesitePedestalBlockEntity::new, ModBlocks.POLISHED_ANDESITE_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<PolishedDioritePedestalBlockEntity>> POLISHED_DIORITE_PEDESTAL_BE =
            BLOCK_ENTITIES.register("polished_diorite_pedestal", () -> BlockEntityType.Builder.of(
                    PolishedDioritePedestalBlockEntity::new, ModBlocks.POLISHED_DIORITE_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<PolishedGranitePedestalBlockEntity>> POLISHED_GRANITE_PEDESTAL_BE =
            BLOCK_ENTITIES.register("polished_granite_pedestal", () -> BlockEntityType.Builder.of(
                    PolishedGranitePedestalBlockEntity::new, ModBlocks.POLISHED_GRANITE_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<PolishedTuffPedestalBlockEntity>> POLISHED_TUFF_PEDESTAL_BE =
            BLOCK_ENTITIES.register("polished_tuff_pedestal", () -> BlockEntityType.Builder.of(
                    PolishedTuffPedestalBlockEntity::new, ModBlocks.POLISHED_TUFF_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<PolishedDeepslatePedestalBlockEntity>> POLISHED_DEEPSLATE_PEDESTAL_BE =
            BLOCK_ENTITIES.register("polished_deepslate_pedestal", () -> BlockEntityType.Builder.of(
                    PolishedDeepslatePedestalBlockEntity::new, ModBlocks.POLISHED_DEEPSLATE_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<AndesitePedestalBlockEntity>> ANDESITE_PEDESTAL_BE =
            BLOCK_ENTITIES.register("andesite_pedestal", () -> BlockEntityType.Builder.of(
                    AndesitePedestalBlockEntity::new, ModBlocks.ANDESITE_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<DioritePedestalBlockEntity>> DIORITE_PEDESTAL_BE =
            BLOCK_ENTITIES.register("diorite_pedestal", () -> BlockEntityType.Builder.of(
                    DioritePedestalBlockEntity::new, ModBlocks.DIORITE_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<GranitePedestalBlockEntity>> GRANITE_PEDESTAL_BE =
            BLOCK_ENTITIES.register("granite_pedestal", () -> BlockEntityType.Builder.of(
                    GranitePedestalBlockEntity::new, ModBlocks.GRANITE_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<BricksPedestalBlockEntity>> BRICKS_PEDESTAL_BE =
            BLOCK_ENTITIES.register("bricks_pedestal", () -> BlockEntityType.Builder.of(
                    BricksPedestalBlockEntity::new, ModBlocks.BRICKS_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<MossyCobblestonePedestalBlockEntity>> MOSSY_COBBLESTONE_PEDESTAL_BE =
            BLOCK_ENTITIES.register("mossy_cobblestone_pedestal", () -> BlockEntityType.Builder.of(
                    MossyCobblestonePedestalBlockEntity::new, ModBlocks.MOSSY_COBBLESTONE_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<MossyStoneBricksPedestalBlockEntity>> MOSSY_STONE_BRICKS_PEDESTAL_BE =
            BLOCK_ENTITIES.register("mossy_stone_bricks_pedestal", () -> BlockEntityType.Builder.of(
                    MossyStoneBricksPedestalBlockEntity::new, ModBlocks.MOSSY_STONE_BRICKS_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<SandstonePedestalBlockEntity>> SANDSTONE_PEDESTAL_BE =
            BLOCK_ENTITIES.register("sandstone_pedestal", () -> BlockEntityType.Builder.of(
                    SandstonePedestalBlockEntity::new, ModBlocks.SANDSTONE_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<RedSandstonePedestalBlockEntity>> RED_SANDSTONE_PEDESTAL_BE =
            BLOCK_ENTITIES.register("red_sandstone_pedestal", () -> BlockEntityType.Builder.of(
                    RedSandstonePedestalBlockEntity::new, ModBlocks.RED_SANDSTONE_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<QuartzPedestalBlockEntity>> QUARTZ_PEDESTAL_BE =
            BLOCK_ENTITIES.register("quartz_pedestal", () -> BlockEntityType.Builder.of(
                    QuartzPedestalBlockEntity::new, ModBlocks.QUARTZ_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<QuartzPillarPedestalBlockEntity>> QUARTZ_PILLAR_PEDESTAL_BE =
            BLOCK_ENTITIES.register("quartz_pillar_pedestal", () -> BlockEntityType.Builder.of(
                    QuartzPillarPedestalBlockEntity::new, ModBlocks.QUARTZ_PILLAR_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<BlackConcretePedestalBlockEntity>> BLACK_CONCRETE_PEDESTAL_BE =
            BLOCK_ENTITIES.register("black_concrete_pedestal", () -> BlockEntityType.Builder.of(
                    BlackConcretePedestalBlockEntity::new, ModBlocks.BLACK_CONCRETE_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<BlueConcretePedestalBlockEntity>> BLUE_CONCRETE_PEDESTAL_BE =
            BLOCK_ENTITIES.register("blue_concrete_pedestal", () -> BlockEntityType.Builder.of(
                    BlueConcretePedestalBlockEntity::new, ModBlocks.BLUE_CONCRETE_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<BrownConcretePedestalBlockEntity>> BROWN_CONCRETE_PEDESTAL_BE =
            BLOCK_ENTITIES.register("brown_concrete_pedestal", () -> BlockEntityType.Builder.of(
                    BrownConcretePedestalBlockEntity::new, ModBlocks.BROWN_CONCRETE_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<CyanConcretePedestalBlockEntity>> CYAN_CONCRETE_PEDESTAL_BE =
            BLOCK_ENTITIES.register("cyan_concrete_pedestal", () -> BlockEntityType.Builder.of(
                    CyanConcretePedestalBlockEntity::new, ModBlocks.CYAN_CONCRETE_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<GrayConcretePedestalBlockEntity>> GRAY_CONCRETE_PEDESTAL_BE =
            BLOCK_ENTITIES.register("gray_concrete_pedestal", () -> BlockEntityType.Builder.of(
                    GrayConcretePedestalBlockEntity::new, ModBlocks.GRAY_CONCRETE_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<GreenConcretePedestalBlockEntity>> GREEN_CONCRETE_PEDESTAL_BE =
            BLOCK_ENTITIES.register("green_concrete_pedestal", () -> BlockEntityType.Builder.of(
                    GreenConcretePedestalBlockEntity::new, ModBlocks.GREEN_CONCRETE_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<LightBlueConcretePedestalBlockEntity>> LIGHT_BLUE_CONCRETE_PEDESTAL_BE =
            BLOCK_ENTITIES.register("light_blue_concrete_pedestal", () -> BlockEntityType.Builder.of(
                    LightBlueConcretePedestalBlockEntity::new, ModBlocks.LIGHT_BLUE_CONCRETE_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<LightGrayConcretePedestalBlockEntity>> LIGHT_GRAY_CONCRETE_PEDESTAL_BE =
            BLOCK_ENTITIES.register("light_gray_concrete_pedestal", () -> BlockEntityType.Builder.of(
                    LightGrayConcretePedestalBlockEntity::new, ModBlocks.LIGHT_GRAY_CONCRETE_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<LimeConcretePedestalBlockEntity>> LIME_CONCRETE_PEDESTAL_BE =
            BLOCK_ENTITIES.register("lime_concrete_pedestal", () -> BlockEntityType.Builder.of(
                    LimeConcretePedestalBlockEntity::new, ModBlocks.LIME_CONCRETE_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<MagentaConcretePedestalBlockEntity>> MAGENTA_CONCRETE_PEDESTAL_BE =
            BLOCK_ENTITIES.register("magenta_concrete_pedestal", () -> BlockEntityType.Builder.of(
                    MagentaConcretePedestalBlockEntity::new, ModBlocks.MAGENTA_CONCRETE_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<OrangeConcretePedestalBlockEntity>> ORANGE_CONCRETE_PEDESTAL_BE =
            BLOCK_ENTITIES.register("orange_concrete_pedestal", () -> BlockEntityType.Builder.of(
                    OrangeConcretePedestalBlockEntity::new, ModBlocks.ORANGE_CONCRETE_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<PinkConcretePedestalBlockEntity>> PINK_CONCRETE_PEDESTAL_BE =
            BLOCK_ENTITIES.register("pink_concrete_pedestal", () -> BlockEntityType.Builder.of(
                    PinkConcretePedestalBlockEntity::new, ModBlocks.PINK_CONCRETE_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<PurpleConcretePedestalBlockEntity>> PURPLE_CONCRETE_PEDESTAL_BE =
            BLOCK_ENTITIES.register("purple_concrete_pedestal", () -> BlockEntityType.Builder.of(
                    PurpleConcretePedestalBlockEntity::new, ModBlocks.PURPLE_CONCRETE_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<RedConcretePedestalBlockEntity>> RED_CONCRETE_PEDESTAL_BE =
            BLOCK_ENTITIES.register("red_concrete_pedestal", () -> BlockEntityType.Builder.of(
                    RedConcretePedestalBlockEntity::new, ModBlocks.RED_CONCRETE_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<WhiteConcretePedestalBlockEntity>> WHITE_CONCRETE_PEDESTAL_BE =
            BLOCK_ENTITIES.register("white_concrete_pedestal", () -> BlockEntityType.Builder.of(
                    WhiteConcretePedestalBlockEntity::new, ModBlocks.WHITE_CONCRETE_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<YellowConcretePedestalBlockEntity>> YELLOW_CONCRETE_PEDESTAL_BE =
            BLOCK_ENTITIES.register("yellow_concrete_pedestal", () -> BlockEntityType.Builder.of(
                    YellowConcretePedestalBlockEntity::new, ModBlocks.YELLOW_CONCRETE_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<BlackstonePedestalBlockEntity>> BLACKSTONE_PEDESTAL =
            BLOCK_ENTITIES.register("blackstone_pedestal", () -> BlockEntityType.Builder.of(
                    BlackstonePedestalBlockEntity::new, ModBlocks.BLACKSTONE_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<CryingObsidianPedestalBlockEntity>> CRYING_OBSIDIAN_PEDESTAL =
            BLOCK_ENTITIES.register("crying_obsidian_pedestal", () -> BlockEntityType.Builder.of(
                    CryingObsidianPedestalBlockEntity::new, ModBlocks.CRYING_OBSIDIAN_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<ObsidianPedestalBlockEntity>> OBSIDIAN_PEDESTAL =
            BLOCK_ENTITIES.register("obsidian_pedestal", () -> BlockEntityType.Builder.of(
                    ObsidianPedestalBlockEntity::new, ModBlocks.OBSIDIAN_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<NetherrackPedestalBlockEntity>> NETHERRACK_PEDESTAL =
            BLOCK_ENTITIES.register("netherrack_pedestal", () -> BlockEntityType.Builder.of(
                    NetherrackPedestalBlockEntity::new, ModBlocks.NETHERRACK_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<SoulSandPedestalBlockEntity>> SOUL_SAND_PEDESTAL =
            BLOCK_ENTITIES.register("soul_sand_pedestal", () -> BlockEntityType.Builder.of(
                    SoulSandPedestalBlockEntity::new, ModBlocks.SOUL_SAND_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<NetherBricksPedestalBlockEntity>> NETHER_BRICKS_PEDESTAL =
            BLOCK_ENTITIES.register("nether_bricks_pedestal", () -> BlockEntityType.Builder.of(
                    NetherBricksPedestalBlockEntity::new, ModBlocks.NETHER_BRICKS_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<RedNetherBricksPedestalBlockEntity>> RED_NETHER_BRICKS_PEDESTAL =
            BLOCK_ENTITIES.register("red_nether_bricks_pedestal", () -> BlockEntityType.Builder.of(
                    RedNetherBricksPedestalBlockEntity::new, ModBlocks.RED_NETHER_BRICKS_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<SoulSoilPedestalBlockEntity>> SOUL_SOIL_PEDESTAL =
            BLOCK_ENTITIES.register("soul_soil_pedestal", () -> BlockEntityType.Builder.of(
                    SoulSoilPedestalBlockEntity::new, ModBlocks.SOUL_SOIL_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<EndStoneBricksPedestalBlockEntity>> END_STONE_BRICKS_PEDESTAL =
            BLOCK_ENTITIES.register("end_stone_bricks_pedestal", () -> BlockEntityType.Builder.of(
                    EndStoneBricksPedestalBlockEntity::new, ModBlocks.END_STONE_BRICKS_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<EndStonePedestalBlockEntity>> END_STONE_PEDESTAL =
            BLOCK_ENTITIES.register("end_stone_pedestal", () -> BlockEntityType.Builder.of(
                    EndStonePedestalBlockEntity::new, ModBlocks.END_STONE_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<PurpurBlockPedestalBlockEntity>> PURPUR_BLOCK_PEDESTAL =
            BLOCK_ENTITIES.register("purpur_block_pedestal", () -> BlockEntityType.Builder.of(
                    PurpurBlockPedestalBlockEntity::new, ModBlocks.PURPUR_BLOCK_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<PurpurPillarPedestalBlockEntity>> PURPUR_PILLAR_PEDESTAL =
            BLOCK_ENTITIES.register("purpur_pillar_pedestal", () -> BlockEntityType.Builder.of(
                    PurpurPillarPedestalBlockEntity::new, ModBlocks.PURPUR_PILLAR_PEDESTAL.get()).build(null));



    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}