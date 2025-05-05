package net.mattias.pedestals.datagen;

import net.mattias.pedestals.core.Constants;
import net.mattias.pedestals.core.registry.ModBlocks;
import net.mattias.pedestals.core.util.PedestalVariant;
import net.mattias.pedestals.core.util.PedestalVariants;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;
import net.minecraft.data.PackOutput;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {

    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Constants.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.PEDESTAL.get());

        this.tag(BlockTags.WOOL);

        for (PedestalVariant variant : PedestalVariants.VARIANTS) {
            Block block = ModBlocks.REGISTERED_VARIANT_MAP.get(variant).get();
            String name = variant.registryName();

            if (name.contains("wool")) {
                this.tag(BlockTags.WOOL).add(block);
            } else if (name.contains("soul")) {
                this.tag(BlockTags.MINEABLE_WITH_SHOVEL).add(block);
            } else if (name.contains("log") || name.contains("planks")) {
                this.tag(BlockTags.MINEABLE_WITH_AXE).add(block);
            } else {
                this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(block);
            }
        }


        this.tag(Tags.Blocks.NEEDS_WOOD_TOOL)
                .add(ModBlocks.PEDESTAL.get());
        for (PedestalVariant variant : PedestalVariants.VARIANTS) {
            this.tag(Tags.Blocks.NEEDS_WOOD_TOOL)
                    .add(ModBlocks.REGISTERED_VARIANT_MAP.get(variant).get());
        }





        // this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
        //        .add(ModBlocks.OBSIDIAN_PEDESTAL.get(), ModBlocks.CRYING_OBSIDIAN_PEDESTAL.get());
    }
}
