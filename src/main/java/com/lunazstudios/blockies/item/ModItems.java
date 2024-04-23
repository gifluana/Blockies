package com.lunazstudios.blockies.item;

import com.lunazstudios.blockies.Blockies;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Blockies.MOD_ID, name), item);
    }


    public static void registerModItems() {
        Blockies.LOGGER.info(Blockies.MOD_NAME + " - Registering Items.");
    }
}
