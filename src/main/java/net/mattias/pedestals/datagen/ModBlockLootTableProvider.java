package net.mattias.pedestals.datagen;

import net.mattias.pedestals.core.registry.ModBlocks;
import net.mattias.pedestals.core.util.PedestalVariant;
import net.mattias.pedestals.core.util.PedestalVariants;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    public ModBlockLootTableProvider(HolderLookup.Provider provider) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), provider);
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.PEDESTAL.get());
        for (PedestalVariant variant : PedestalVariants.VARIANTS) {
            this.dropSelf(ModBlocks.REGISTERED_VARIANT_MAP.get(variant).get());
        }
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return () -> ModBlocks.BLOCKS.getEntries().stream().map(Holder::value).iterator();
    }
}