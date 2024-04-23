package com.lunazstudios.blockies.datagen;

import com.lunazstudios.blockies.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(
                        ModBlocks.ARCANE_INFUSED_STONE_CTM,
                        ModBlocks.ARCANE_INFUSED_STONE
        );

//        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE).add(
//
//        );
//
//        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE).add(
//
//        );
//
//        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE).add(
//
//        );

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL).add(
                ModBlocks.ARCANE_INFUSED_STONE_CTM,
                ModBlocks.ARCANE_INFUSED_STONE
        );

//        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL).add(
//
//        );
//
//        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL).add(
//
//        );
    }
}
