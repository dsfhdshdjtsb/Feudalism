package com.github.dsfhdshdjtsb.feudalism.world.biome;

import com.mojang.datafixers.util.Pair;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.biome.BiomeParticleConfig;
import net.minecraft.world.biome.OverworldBiomeCreator;
import net.minecraft.world.biome.source.util.MultiNoiseUtil;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;
import terrablender.api.BiomeProvider;
import terrablender.api.ParameterUtils;
import terrablender.worldgen.TBClimate;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class FeudalismBiomeProvider extends BiomeProvider {

    public FeudalismBiomeProvider(Identifier name, int overworldWeight) {
        super(name, overworldWeight);
    }

    @Override
    public void addOverworldBiomes(Registry<Biome> registry, Consumer<Pair<TBClimate.ParameterPoint, RegistryKey<Biome>>> mapper) {
        this.addBiomeSimilar(mapper, BiomeKeys.PLAINS, FeudalismBiomes.SAKURA_FOREST);
    }
    @Override
    public Optional<MaterialRules.MaterialRule> getOverworldSurfaceRules()
    {
        return Optional.of(SurfaceRule.makeRules());
    }
}
