package net.mattias.pedestals.datagen;

import net.mattias.pedestals.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider provider) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), provider);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.PEDESTAL.get());
        dropSelf(ModBlocks.OAK_LOG_PEDESTAL.get());
        dropSelf(ModBlocks.BIRCH_LOG_PEDESTAL.get());
        dropSelf(ModBlocks.ACACIA_LOG_PEDESTAL.get());
        dropSelf(ModBlocks.DARK_OAK_LOG_PEDESTAL.get());
        dropSelf(ModBlocks.CHERRY_LOG_PEDESTAL.get());
        dropSelf(ModBlocks.JUNGLE_LOG_PEDESTAL.get());
        dropSelf(ModBlocks.SPRUCE_LOG_PEDESTAL.get());
        dropSelf(ModBlocks.MANGROVE_LOG_PEDESTAL.get());

        dropSelf(ModBlocks.OAK_PLANKS_PEDESTAL.get());
        dropSelf(ModBlocks.CHERRY_PLANKS_PEDESTAL.get());
        dropSelf(ModBlocks.BIRCH_PLANKS_PEDESTAL.get());
        dropSelf(ModBlocks.ACACIA_PLANKS_PEDESTAL.get());
        dropSelf(ModBlocks.BAMBOO_PLANKS_PEDESTAL.get());
        dropSelf(ModBlocks.MANGROVE_PLANKS_PEDESTAL.get());
        dropSelf(ModBlocks.SPRUCE_PLANKS_PEDESTAL.get());
        dropSelf(ModBlocks.JUNGLE_PLANKS_PEDESTAL.get());
        dropSelf(ModBlocks.DARK_OAK_PLANKS_PEDESTAL.get());

        dropSelf(ModBlocks.STONE_PEDESTAL.get());
        dropSelf(ModBlocks.COBBLESTONE_PEDESTAL.get());
        dropSelf(ModBlocks.STONE_BRICKS_PEDESTAL.get());
        dropSelf(ModBlocks.SMOOTH_STONE_PEDESTAL.get());
        dropSelf(ModBlocks.POLISHED_GRANITE_PEDESTAL.get());
        dropSelf(ModBlocks.POLISHED_TUFF_PEDESTAL.get());
        dropSelf(ModBlocks.POLISHED_DEEPSLATE_PEDESTAL.get());
        dropSelf(ModBlocks.POLISHED_DIORITE_PEDESTAL.get());
        dropSelf(ModBlocks.POLISHED_ANDESITE_PEDESTAL.get());
        dropSelf(ModBlocks.GRANITE_PEDESTAL.get());
        dropSelf(ModBlocks.ANDESITE_PEDESTAL.get());
        dropSelf(ModBlocks.DIORITE_PEDESTAL.get());
        dropSelf(ModBlocks.BRICKS_PEDESTAL.get());
        dropSelf(ModBlocks.MOSSY_STONE_BRICKS_PEDESTAL.get());
        dropSelf(ModBlocks.MOSSY_COBBLESTONE_PEDESTAL.get());
        dropSelf(ModBlocks.QUARTZ_PEDESTAL.get());
        dropSelf(ModBlocks.QUARTZ_PILLAR_PEDESTAL.get());
        dropSelf(ModBlocks.RED_SANDSTONE_PEDESTAL.get());
        dropSelf(ModBlocks.SANDSTONE_PEDESTAL.get());

        dropSelf(ModBlocks.BLACK_CONCRETE_PEDESTAL.get());
        dropSelf(ModBlocks.BLUE_CONCRETE_PEDESTAL.get());
        dropSelf(ModBlocks.BROWN_CONCRETE_PEDESTAL.get());
        dropSelf(ModBlocks.CYAN_CONCRETE_PEDESTAL.get());
        dropSelf(ModBlocks.GRAY_CONCRETE_PEDESTAL.get());
        dropSelf(ModBlocks.GREEN_CONCRETE_PEDESTAL.get());
        dropSelf(ModBlocks.LIGHT_GRAY_CONCRETE_PEDESTAL.get());
        dropSelf(ModBlocks.LIGHT_BLUE_CONCRETE_PEDESTAL.get());
        dropSelf(ModBlocks.LIME_CONCRETE_PEDESTAL.get());
        dropSelf(ModBlocks.MAGENTA_CONCRETE_PEDESTAL.get());
        dropSelf(ModBlocks.ORANGE_CONCRETE_PEDESTAL.get());
        dropSelf(ModBlocks.PINK_CONCRETE_PEDESTAL.get());
        dropSelf(ModBlocks.PURPLE_CONCRETE_PEDESTAL.get());
        dropSelf(ModBlocks.RED_CONCRETE_PEDESTAL.get());
        dropSelf(ModBlocks.WHITE_CONCRETE_PEDESTAL.get());
        dropSelf(ModBlocks.YELLOW_CONCRETE_PEDESTAL.get());
        dropSelf(ModBlocks.BLACKSTONE_PEDESTAL.get());
        dropSelf(ModBlocks.CRYING_OBSIDIAN_PEDESTAL.get());
        dropSelf(ModBlocks.OBSIDIAN_PEDESTAL.get());
        dropSelf(ModBlocks.NETHERRACK_PEDESTAL.get());
        dropSelf(ModBlocks.RED_NETHER_BRICKS_PEDESTAL.get());
        dropSelf(ModBlocks.NETHER_BRICKS_PEDESTAL.get());
        dropSelf(ModBlocks.SOUL_SAND_PEDESTAL.get());
        dropSelf(ModBlocks.SOUL_SOIL_PEDESTAL.get());
        dropSelf(ModBlocks.END_STONE_PEDESTAL.get());
        dropSelf(ModBlocks.END_STONE_BRICKS_PEDESTAL.get());
        dropSelf(ModBlocks.PURPUR_BLOCK_PEDESTAL.get());
        dropSelf(ModBlocks.PURPUR_PILLAR_PEDESTAL.get());

    }


    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}