package com.lunazstudios.blockies.registry;

import com.lunazstudios.blockies.block.ModBlocks;
import com.lunazstudios.blockies.item.ModItemGroup;
import com.lunazstudios.blockies.item.ModItems;

public class ModRegistries {

    public static void registerModStuff() {
        ModBlocks.registerModBlocks();
        ModItems.registerModItems();
        ModItemGroup.registerItemGroups();
    }
}
