package net.mattias.pedestals.core.registry;

import net.mattias.pedestals.core.Constants;
import net.mattias.pedestals.core.util.PedestalVariants;
import net.mattias.pedestals.core.world.block.entity.PedestalBlockEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;


import java.util.function.Supplier;
import java.util.stream.Stream;

public class ModBlockEntities {

    public static final Supplier<Block[]> VALID_PEDESTAL_BLOCKS = () ->
            Stream.concat(
                    Stream.of(ModBlocks.PEDESTAL.get()),
                    PedestalVariants.VARIANTS.stream().map(variant -> ModBlocks.getPedestalFromVariant(variant).get())
            ).toArray(Block[]::new);

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, Constants.MOD_ID);

    public static final Supplier<BlockEntityType<PedestalBlockEntity>> PEDESTAL = BLOCK_ENTITIES.register("pedestal", () -> BlockEntityType.Builder.<PedestalBlockEntity>of(PedestalBlockEntity::new, VALID_PEDESTAL_BLOCKS.get()).build(null));

    public static void register(IEventBus modEventBus) {
        BLOCK_ENTITIES.register(modEventBus);
    }
}