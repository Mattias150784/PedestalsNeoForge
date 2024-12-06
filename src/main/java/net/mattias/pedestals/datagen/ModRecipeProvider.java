package net.mattias.pedestals.datagen;

import net.mattias.pedestals.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import java.util.concurrent.CompletableFuture;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        createBasicPedestalRecipe(recipeOutput, ModBlocks.PEDESTAL.get(), Blocks.CHISELED_STONE_BRICKS);
        createBasicPedestalRecipe(recipeOutput, ModBlocks.OAK_LOG_PEDESTAL.get(), Blocks.OAK_LOG);
        createBasicPedestalRecipe(recipeOutput, ModBlocks.BIRCH_LOG_PEDESTAL.get(), Blocks.BIRCH_LOG);
        createBasicPedestalRecipe(recipeOutput, ModBlocks.DARK_OAK_LOG_PEDESTAL.get(), Blocks.DARK_OAK_LOG);
        createBasicPedestalRecipe(recipeOutput, ModBlocks.SPRUCE_LOG_PEDESTAL.get(), Blocks.SPRUCE_LOG);
        createBasicPedestalRecipe(recipeOutput, ModBlocks.JUNGLE_LOG_PEDESTAL.get(), Blocks.JUNGLE_LOG);
        createBasicPedestalRecipe(recipeOutput, ModBlocks.ACACIA_LOG_PEDESTAL.get(), Blocks.ACACIA_LOG);
        createBasicPedestalRecipe(recipeOutput, ModBlocks.MANGROVE_LOG_PEDESTAL.get(), Blocks.MANGROVE_LOG);
        createBasicPedestalRecipe(recipeOutput, ModBlocks.CHERRY_LOG_PEDESTAL.get(), Blocks.CHERRY_LOG);
        createBasicPedestalRecipe(recipeOutput, ModBlocks.COBBLESTONE_PEDESTAL.get(), Blocks.COBBLESTONE);
        createBasicPedestalRecipe(recipeOutput, ModBlocks.STONE_PEDESTAL.get(), Blocks.STONE);
        createBasicPedestalRecipe(recipeOutput, ModBlocks.STONE_BRICKS_PEDESTAL.get(), Blocks.STONE_BRICKS);
        createBasicPedestalRecipe(recipeOutput, ModBlocks.SMOOTH_STONE_PEDESTAL.get(), Blocks.SMOOTH_STONE);
        createBasicPedestalRecipe(recipeOutput, ModBlocks.POLISHED_TUFF_PEDESTAL.get(), Blocks.POLISHED_TUFF);
        createBasicPedestalRecipe(recipeOutput, ModBlocks.POLISHED_DEEPSLATE_PEDESTAL.get(), Blocks.POLISHED_DEEPSLATE);
        createBasicPedestalRecipe(recipeOutput, ModBlocks.POLISHED_ANDESITE_PEDESTAL.get(), Blocks.POLISHED_ANDESITE);
        createBasicPedestalRecipe(recipeOutput, ModBlocks.POLISHED_GRANITE_PEDESTAL.get(), Blocks.POLISHED_GRANITE);
        createBasicPedestalRecipe(recipeOutput, ModBlocks.POLISHED_DIORITE_PEDESTAL.get(), Blocks.POLISHED_DIORITE);
        createBasicPedestalRecipe(recipeOutput, ModBlocks.GRANITE_PEDESTAL.get(), Blocks.GRANITE);
        createBasicPedestalRecipe(recipeOutput, ModBlocks.ANDESITE_PEDESTAL.get(), Blocks.ANDESITE);
        createBasicPedestalRecipe(recipeOutput, ModBlocks.DIORITE_PEDESTAL.get(), Blocks.DIORITE);
        createBasicPedestalRecipe(recipeOutput, ModBlocks.BRICKS_PEDESTAL.get(), Blocks.BRICKS);
        createBasicPedestalRecipe(recipeOutput, ModBlocks.MOSSY_COBBLESTONE_PEDESTAL.get(), Blocks.MOSSY_COBBLESTONE);
        createBasicPedestalRecipe(recipeOutput, ModBlocks.MOSSY_STONE_BRICKS_PEDESTAL.get(), Blocks.MOSSY_STONE_BRICKS);
        createBasicPedestalRecipe(recipeOutput, ModBlocks.QUARTZ_PEDESTAL.get(), Blocks.QUARTZ_BLOCK);
        createBasicPedestalRecipe(recipeOutput, ModBlocks.QUARTZ_PILLAR_PEDESTAL.get(), Blocks.QUARTZ_PILLAR);
        createBasicPedestalRecipe(recipeOutput, ModBlocks.SANDSTONE_PEDESTAL.get(), Blocks.SANDSTONE);
        createBasicPedestalRecipe(recipeOutput, ModBlocks.RED_SANDSTONE_PEDESTAL.get(), Blocks.RED_SANDSTONE);
        createBasicPedestalRecipe(recipeOutput, ModBlocks.BLACK_CONCRETE_PEDESTAL.get(), Blocks.BLACK_CONCRETE);
        createBasicPedestalRecipe(recipeOutput, ModBlocks.BLUE_CONCRETE_PEDESTAL.get(), Blocks.BLUE_CONCRETE);
        createBasicPedestalRecipe(recipeOutput, ModBlocks.BROWN_CONCRETE_PEDESTAL.get(), Blocks.BROWN_CONCRETE);
        createBasicPedestalRecipe(recipeOutput, ModBlocks.CYAN_CONCRETE_PEDESTAL.get(), Blocks.CYAN_CONCRETE);
        createBasicPedestalRecipe(recipeOutput, ModBlocks.GRAY_CONCRETE_PEDESTAL.get(), Blocks.GRAY_CONCRETE);
        createBasicPedestalRecipe(recipeOutput, ModBlocks.GREEN_CONCRETE_PEDESTAL.get(), Blocks.GREEN_CONCRETE);
        createBasicPedestalRecipe(recipeOutput, ModBlocks.LIGHT_BLUE_CONCRETE_PEDESTAL.get(), Blocks.LIGHT_BLUE_CONCRETE);
        createBasicPedestalRecipe(recipeOutput, ModBlocks.LIGHT_GRAY_CONCRETE_PEDESTAL.get(), Blocks.LIGHT_GRAY_CONCRETE);
        createBasicPedestalRecipe(recipeOutput, ModBlocks.LIME_CONCRETE_PEDESTAL.get(), Blocks.LIME_CONCRETE);
        createBasicPedestalRecipe(recipeOutput, ModBlocks.MAGENTA_CONCRETE_PEDESTAL.get(), Blocks.MAGENTA_CONCRETE);
        createBasicPedestalRecipe(recipeOutput, ModBlocks.ORANGE_CONCRETE_PEDESTAL.get(), Blocks.ORANGE_CONCRETE);
        createBasicPedestalRecipe(recipeOutput, ModBlocks.PINK_CONCRETE_PEDESTAL.get(), Blocks.PINK_CONCRETE);
        createBasicPedestalRecipe(recipeOutput, ModBlocks.PURPLE_CONCRETE_PEDESTAL.get(), Blocks.PURPLE_CONCRETE);
        createBasicPedestalRecipe(recipeOutput, ModBlocks.RED_CONCRETE_PEDESTAL.get(), Blocks.RED_CONCRETE);
        createBasicPedestalRecipe(recipeOutput, ModBlocks.WHITE_CONCRETE_PEDESTAL.get(), Blocks.WHITE_CONCRETE);
        createBasicPedestalRecipe(recipeOutput, ModBlocks.YELLOW_CONCRETE_PEDESTAL.get(), Blocks.YELLOW_CONCRETE);


        createPlanksPedestalRecipe(recipeOutput, ModBlocks.OAK_PLANKS_PEDESTAL.get(), Blocks.OAK_PLANKS);
        createPlanksPedestalRecipe(recipeOutput, ModBlocks.BIRCH_PLANKS_PEDESTAL.get(), Blocks.BIRCH_PLANKS);
        createPlanksPedestalRecipe(recipeOutput, ModBlocks.DARK_OAK_PLANKS_PEDESTAL.get(), Blocks.DARK_OAK_PLANKS);
        createPlanksPedestalRecipe(recipeOutput, ModBlocks.ACACIA_PLANKS_PEDESTAL.get(), Blocks.ACACIA_PLANKS);
        createPlanksPedestalRecipe(recipeOutput, ModBlocks.SPRUCE_PLANKS_PEDESTAL.get(), Blocks.SPRUCE_PLANKS);
        createPlanksPedestalRecipe(recipeOutput, ModBlocks.JUNGLE_PLANKS_PEDESTAL.get(), Blocks.JUNGLE_PLANKS);
        createPlanksPedestalRecipe(recipeOutput, ModBlocks.MANGROVE_PLANKS_PEDESTAL.get(), Blocks.MANGROVE_PLANKS);
        createPlanksPedestalRecipe(recipeOutput, ModBlocks.CHERRY_PLANKS_PEDESTAL.get(), Blocks.CHERRY_PLANKS);
        createPlanksPedestalRecipe(recipeOutput, ModBlocks.BAMBOO_PLANKS_PEDESTAL.get(), Blocks.BAMBOO);



    }












    /**
     * Creates a basic pedestal recipe using the given material.
     *
     * @param recipeOutput  Recipe output object
     * @param pedestalBlock The block to be crafted
     * @param material      The material used in the recipe
     */
    private void createBasicPedestalRecipe(RecipeOutput recipeOutput, ItemLike pedestalBlock, ItemLike material) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pedestalBlock)
                .pattern("   ")
                .pattern(" M ")
                .pattern(" M ")
                .define('M', material)
                .unlockedBy("has_" + material.asItem().getDescriptionId(), has(material))
                .save(recipeOutput);
    }

    /**
     * Creates a pedestal recipe with planks and an additional layer on top.
     *
     * @param recipeOutput  Recipe output object
     * @param pedestalBlock The block to be crafted
     * @param material      The material used in the recipe
     */
    private void createPlanksPedestalRecipe(RecipeOutput recipeOutput, ItemLike pedestalBlock, ItemLike material) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pedestalBlock)
                .pattern(" M ")
                .pattern(" M ")
                .pattern(" M ")
                .define('M', material)
                .unlockedBy("has_" + material.asItem().getDescriptionId(), has(material))
                .save(recipeOutput);
    }
}
