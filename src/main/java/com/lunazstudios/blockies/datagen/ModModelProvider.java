package com.lunazstudios.blockies.datagen;

import com.lunazstudios.blockies.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockState) {
//        blockState.registerSimpleCubeAll(ModBlocks.ARCANE_INFUSED_STONE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModel) {

    }
}
