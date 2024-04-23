package com.lunazstudios.blockies.block;

import com.lunazstudios.blockies.Blockies;
import com.lunazstudios.blockies.block.custom.TooltipBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block ARCANE_INFUSED_STONE_CTM = registerBlock("arcane_infused_stone_ctm",
            new TooltipBlock(FabricBlockSettings.copyOf(Blocks.STONE), "block.blockies.tooltip.arcane_infused_stone_ctm"));

    public static final Block ARCANE_INFUSED_STONE = registerBlock("arcane_infused_stone",
            new TooltipBlock(FabricBlockSettings.copyOf(Blocks.STONE), "block.blockies.tooltip.arcane_infused_stone"));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Blockies.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Blockies.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        Blockies.LOGGER.info(Blockies.MOD_NAME + " - Registering Blocks.");
    }
}
