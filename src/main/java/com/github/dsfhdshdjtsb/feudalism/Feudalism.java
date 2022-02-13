package com.github.dsfhdshdjtsb.feudalism;

import com.github.dsfhdshdjtsb.feudalism.world.biome.FeudalismBiomeProvider;
import com.github.dsfhdshdjtsb.feudalism.world.biome.FeudalismBiomes;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import terrablender.api.BiomeProviders;
import terrablender.api.TerraBlenderApi;

public class Feudalism implements ModInitializer, TerraBlenderApi {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "feudalism";
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		FeudalismBiomes.registerBiomes();
	}
	@Override
	public void onTerraBlenderInitialized()
	{
		// Given we only add two biomes, we should keep our weight relatively low.
		BiomeProviders.register(new FeudalismBiomeProvider(new Identifier(MOD_ID, "biome_provider"), 1));
	}
}
