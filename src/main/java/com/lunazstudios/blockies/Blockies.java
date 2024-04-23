package com.lunazstudios.blockies;

import com.lunazstudios.blockies.registry.ModRegistries;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Blockies implements ModInitializer {
	public static final String MOD_ID = "blockies";
	public static final String MOD_NAME = "Blockies!";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Blockies!");

		ModRegistries.registerModStuff();
	}
}