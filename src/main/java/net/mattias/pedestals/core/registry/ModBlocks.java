package net.mattias.pedestals.core.registry;

import net.mattias.pedestals.core.Constants;
import net.mattias.pedestals.core.util.PedestalVariant;
import net.mattias.pedestals.core.util.PedestalVariants;
import net.mattias.pedestals.core.world.block.PedestalBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;



import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, Constants.MOD_ID);
    public static final Supplier<Block> PEDESTAL = registerBlockWithBlockItem("pedestal", () -> new PedestalBlock(Block.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

    public static final Map<PedestalVariant, Supplier<Block>> REGISTERED_VARIANT_MAP = new HashMap<>();
    public static Supplier<Block> getPedestalFromVariant(PedestalVariant variant) {
        return REGISTERED_VARIANT_MAP.get(variant);
    }

    public static void register(IEventBus modEventBus) {

        PedestalVariants.VARIANTS.forEach(variant -> {
            Supplier<Block> registeredVariant = registerBlockWithBlockItem(variant.registryName(), () -> new PedestalBlock(variant.getProperties().dynamicShape().pushReaction(PushReaction.DESTROY)));
            REGISTERED_VARIANT_MAP.put(variant, registeredVariant);
        });

        BLOCKS.register(modEventBus);

        System.out.println("registered blocks for Pedestals");
    }

    public static Supplier<Block> registerBlockWithBlockItem(String name, Supplier<Block> blockSupplier) {
        Supplier<Block> returned = BLOCKS.register(name, blockSupplier);
        ModItems.ITEMS.register(name, () -> new BlockItem(returned.get(), new Item.Properties()));
        return returned;
    }
}