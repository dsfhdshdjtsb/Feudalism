package com.github.dsfhdshdjtsb.feudalism.world.biome;

import net.minecraft.world.biome.*;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.sound.MusicSound;
import net.minecraft.sound.BiomeMoodSound;
import javax.annotation.Nullable;
import net.minecraft.util.math.MathHelper;

public class OverworldBiomes {
    private static void globalOverworldGeneration(GenerationSettings.Builder builder)
    {
    }
    @Nullable
    private static final MusicSound NORMAL_MUSIC = null;
    protected static int calculateSkyColor(float color)
    {
        float $$1 = color / 3.0F;
        $$1 = MathHelper.clamp($$1, -1.0F, 1.0F);
        return MathHelper.hsvToRgb(0.62222224F - $$1 * 0.05F, 0.5F + $$1 * 0.1F, 1.0F);
    }
    private static Biome biome(Biome.Precipitation precipitation, Biome.Category category, float temperature, float downfall, SpawnSettings.Builder spawnBuilder, GenerationSettings.Builder biomeBuilder, @Nullable MusicSound music)
    {
        return biome(precipitation, category, temperature, downfall, 4159204, 329011, spawnBuilder, biomeBuilder, music);
    }

    private static Biome biome(Biome.Precipitation precipitation, Biome.Category category, float temperature, float downfall, int waterColor, int waterFogColor, SpawnSettings.Builder spawnBuilder, GenerationSettings.Builder biomeBuilder, @Nullable MusicSound music)
    {
        return (new Biome.Builder()).precipitation(precipitation).category(category).temperature(temperature).downfall(downfall).effects((new BiomeEffects.Builder()).waterColor(waterColor).waterFogColor(waterFogColor).fogColor(12638463).skyColor(calculateSkyColor(temperature)).moodSound(BiomeMoodSound.CAVE).music(music).build()).spawnSettings(spawnBuilder.build()).generationSettings(biomeBuilder.build()).build();
    }
    private static void addBasicFeatures(GenerationSettings.Builder generationSettings) {
        DefaultBiomeFeatures.addLandCarvers(generationSettings);
        DefaultBiomeFeatures.addAmethystGeodes(generationSettings);
        DefaultBiomeFeatures.addDungeons(generationSettings);
        DefaultBiomeFeatures.addMineables(generationSettings);
        DefaultBiomeFeatures.addSprings(generationSettings);
        DefaultBiomeFeatures.addFrozenTopLayer(generationSettings);
    }

    public static Biome SakuraForest1()
    {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addMushroomMobs(builder);
        GenerationSettings.Builder builder2 = new GenerationSettings.Builder();
        addBasicFeatures(builder2);
        DefaultBiomeFeatures.addDefaultOres(builder2);
        DefaultBiomeFeatures.addDefaultDisks(builder2);
        DefaultBiomeFeatures.addMushroomFieldsFeatures(builder2);
        DefaultBiomeFeatures.addDefaultVegetation(builder2);
        return biome(Biome.Precipitation.RAIN, Biome.Category.MUSHROOM, 0.9f, 1.0f, builder, builder2, NORMAL_MUSIC);
    }
}
