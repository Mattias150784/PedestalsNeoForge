package net.mattias.pedestals.block;

import net.mattias.pedestals.Pedestals;
import net.mattias.pedestals.block.custom.*;
import net.mattias.pedestals.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(Pedestals.MOD_ID);


    public static final DeferredBlock<Block> PEDESTAL = registerBlock("pedestal",
            () -> new PedestalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHISELED_STONE_BRICKS)));

    public static final DeferredBlock<Block> OAK_LOG_PEDESTAL = registerBlock("oak_log_pedestal",
            () -> new OakLogPedestalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));

    public static final DeferredBlock<Block> BIRCH_LOG_PEDESTAL = registerBlock("birch_log_pedestal",
            () -> new BirchLogPedestalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS)));

    public static final DeferredBlock<Block> DARK_OAK_LOG_PEDESTAL = registerBlock("dark_oak_log_pedestal",
            () -> new DarkOakLogPedestalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS)));

    public static final DeferredBlock<Block> SPRUCE_LOG_PEDESTAL = registerBlock("spruce_log_pedestal",
            () -> new SpruceLogPedestalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS)));

    public static final DeferredBlock<Block> JUNGLE_LOG_PEDESTAL = registerBlock("jungle_log_pedestal",
            () -> new JungleLogPedestalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS)));

    public static final DeferredBlock<Block> ACACIA_LOG_PEDESTAL = registerBlock("acacia_log_pedestal",
            () -> new AcaciaLogPedestalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS)));

    public static final DeferredBlock<Block> MANGROVE_LOG_PEDESTAL = registerBlock("mangrove_log_pedestal",
            () -> new MangroveLogPedestalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS)));

    public static final DeferredBlock<Block> CHERRY_LOG_PEDESTAL = registerBlock("cherry_log_pedestal",
            () -> new CherryLogPedestalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)));

    public static final DeferredBlock<Block> OAK_PLANKS_PEDESTAL = registerBlock("oak_planks_pedestal",
            () -> new OakPlanksPedestalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));

    public static final DeferredBlock<Block> BIRCH_PLANKS_PEDESTAL = registerBlock("birch_planks_pedestal",
            () -> new BirchPlanksPedestalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS)));

    public static final DeferredBlock<Block> DARK_OAK_PLANKS_PEDESTAL = registerBlock("dark_oak_planks_pedestal",
            () -> new DarkOakPlanksPedestalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS)));

    public static final DeferredBlock<Block> SPRUCE_PLANKS_PEDESTAL = registerBlock("spruce_planks_pedestal",
            () -> new SprucePlanksPedestalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS)));

    public static final DeferredBlock<Block> JUNGLE_PLANKS_PEDESTAL = registerBlock("jungle_planks_pedestal",
            () -> new JunglePlanksPedestalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS)));

    public static final DeferredBlock<Block> ACACIA_PLANKS_PEDESTAL = registerBlock("acacia_planks_pedestal",
            () -> new AcaciaPlanksPedestalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS)));

    public static final DeferredBlock<Block> MANGROVE_PLANKS_PEDESTAL = registerBlock("mangrove_planks_pedestal",
            () -> new MangrovePlanksPedestalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS)));

    public static final DeferredBlock<Block> CHERRY_PLANKS_PEDESTAL = registerBlock("cherry_planks_pedestal",
            () -> new CherryPlanksPedestalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)));

    public static final DeferredBlock<Block> BAMBOO_PLANKS_PEDESTAL = registerBlock("bamboo_planks_pedestal",
            () -> new BambooPlanksPedestalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_PLANKS)));

    public static final DeferredBlock<Block> COBBLESTONE_PEDESTAL = registerBlock("cobblestone_pedestal",
            () -> new CobblestonePedestalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE)));

    public static final DeferredBlock<Block> STONE_PEDESTAL = registerBlock("stone_pedestal",
            () -> new StonePedestalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

    public static final DeferredBlock<Block> STONE_BRICKS_PEDESTAL = registerBlock("stone_bricks_pedestal",
            () -> new StonebricksPedestalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)));

    public static final DeferredBlock<Block> SMOOTH_STONE_PEDESTAL = registerBlock("smooth_stone_pedestal",
            () -> new SmoothstonePedestalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE)));

    public static final DeferredBlock<Block> POLISHED_GRANITE_PEDESTAL = registerBlock("polished_granite_pedestal",
            () -> new PolishedGranitePedestalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE)));

    public static final DeferredBlock<Block> POLISHED_DIORITE_PEDESTAL = registerBlock("polished_diorite_pedestal",
            () -> new PolishedDioritePedestalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE)));

    public static final DeferredBlock<Block> POLISHED_ANDESITE_PEDESTAL = registerBlock("polished_andesite_pedestal",
            () -> new PolishedAndesitePedestalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE)));

    public static final DeferredBlock<Block> GRANITE_PEDESTAL = registerBlock("granite_pedestal",
            () -> new GranitePedestalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE)));

    public static final DeferredBlock<Block> DIORITE_PEDESTAL = registerBlock("diorite_pedestal",
            () -> new DioritePedestalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE)));

    public static final DeferredBlock<Block> ANDESITE_PEDESTAL = registerBlock("andesite_pedestal",
            () -> new AndesitePedestalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE)));

    public static final DeferredBlock<Block> POLISHED_TUFF_PEDESTAL = registerBlock("polished_tuff_pedestal",
            () -> new PolishedTuffPedestalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_TUFF)));

    public static final DeferredBlock<Block> POLISHED_DEEPSLATE_PEDESTAL = registerBlock("polished_deepslate_pedestal",
            () -> new PolishedDeepslatePedestalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DEEPSLATE)));

    public static final DeferredBlock<Block> BRICKS_PEDESTAL = registerBlock("bricks_pedestal",
            () -> new BricksPedestalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));

    public static final DeferredBlock<Block> MOSSY_COBBLESTONE_PEDESTAL = registerBlock("mossy_cobblestone_pedestal",
            () -> new MossyCobblestonePedestalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MOSSY_COBBLESTONE)));

    public static final DeferredBlock<Block> MOSSY_STONE_BRICKS_PEDESTAL = registerBlock("mossy_stone_bricks_pedestal",
            () -> new MossyStoneBricksPedestalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MOSSY_STONE_BRICKS)));

    public static final DeferredBlock<Block> QUARTZ_PEDESTAL = registerBlock("quartz_pedestal",
            () -> new QuartzPedestalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK)));

    public static final DeferredBlock<Block> QUARTZ_PILLAR_PEDESTAL = registerBlock("quartz_pillar_pedestal",
            () -> new QuartzPillarPedestalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_PILLAR)));

    public static final DeferredBlock<Block> SANDSTONE_PEDESTAL = registerBlock("sandstone_pedestal",
            () -> new SandstonePedestalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)));

    public static final DeferredBlock<Block> RED_SANDSTONE_PEDESTAL = registerBlock("red_sandstone_pedestal",
            () -> new RedSandstonePedestalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE)));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}