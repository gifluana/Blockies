package com.lunazstudios.blockies.item;

import com.lunazstudios.blockies.Blockies;
import com.lunazstudios.blockies.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup BLOCKIES_CTM_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Blockies.MOD_ID, "blockies_ctm_blocks_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.blockies_ctm_blocks_group"))
                    .icon(() -> new ItemStack(ModBlocks.ARCANE_INFUSED_STONE_CTM)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.ARCANE_INFUSED_STONE_CTM);
                    }).build());

    public static final ItemGroup BLOCKIES_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Blockies.MOD_ID, "blockies_blocks_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.blockies_blocks_group"))
                    .icon(() -> new ItemStack(ModBlocks.ARCANE_INFUSED_STONE_CTM)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.ARCANE_INFUSED_STONE);
                    }).build());

    public static void registerItemGroups() {}
}
