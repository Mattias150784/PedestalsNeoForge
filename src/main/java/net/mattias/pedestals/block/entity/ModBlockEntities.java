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



    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}