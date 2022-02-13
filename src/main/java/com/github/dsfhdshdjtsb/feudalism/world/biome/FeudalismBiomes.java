package com.github.dsfhdshdjtsb.feudalism.world.biome;

import com.github.dsfhdshdjtsb.feudalism.Feudalism;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;

public class FeudalismBiomes {
    public static final RegistryKey<Biome> SAKURA_FOREST = RegistryKey.of(Registry.BIOME_KEY, (new Identifier(Feudalism.MOD_ID, "sakura_forest")));

    public static void registerBiomes()
    {
        register(SAKURA_FOREST, OverworldBiomes.SakuraForest1());

    }

    private static void register(RegistryKey<Biome> key, Biome biome)
    {
        Registry.register(BuiltinRegistries.BIOME, key, OverworldBiomes.SakuraForest1());
    }
}
