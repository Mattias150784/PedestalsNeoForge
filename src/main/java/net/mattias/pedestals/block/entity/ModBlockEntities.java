package net.mattias.pedestals.block.entity;

import net.mattias.pedestals.Pedestals;
import net.mattias.pedestals.block.ModBlocks;
import net.mattias.pedestals.block.entity.custom.PedestalBlockEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, Pedestals.MOD_ID);



    public static final Supplier<BlockEntityType<PedestalBlockEntity>> PEDESTAL_BE =
            BLOCK_ENTITIES.register("pedestal_be", () -> BlockEntityType.Builder.of(
                    PedestalBlockEntity::new,
                    Stream.concat(
                            Stream.of(ModBlocks.PEDESTAL.get()),
                            ModBlocks.PEDESTAL_BLOCKS.values().stream().map(Supplier::get)
                    ).toArray(Block[]::new)
            ).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
