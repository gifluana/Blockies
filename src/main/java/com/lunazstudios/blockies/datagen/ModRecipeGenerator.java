package com.lunazstudios.blockies.datagen;

import com.lunazstudios.blockies.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ARCANE_INFUSED_STONE)
                .input(ModBlocks.ARCANE_INFUSED_STONE_CTM)
                .criterion(hasItem(ModBlocks.ARCANE_INFUSED_STONE_CTM), conditionsFromItem(ModBlocks.ARCANE_INFUSED_STONE_CTM))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ARCANE_INFUSED_STONE_CTM) + "_to_non_ctm"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ARCANE_INFUSED_STONE_CTM)
                .input(ModBlocks.ARCANE_INFUSED_STONE)
                .criterion(hasItem(ModBlocks.ARCANE_INFUSED_STONE), conditionsFromItem(ModBlocks.ARCANE_INFUSED_STONE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ARCANE_INFUSED_STONE) + "_to_ctm"));
    }
}
