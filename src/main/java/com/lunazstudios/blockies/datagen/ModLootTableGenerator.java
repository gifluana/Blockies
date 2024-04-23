package com.lunazstudios.blockies.datagen;

import com.lunazstudios.blockies.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.ARCANE_INFUSED_STONE_CTM);
        addDrop(ModBlocks.ARCANE_INFUSED_STONE);
    }
}
