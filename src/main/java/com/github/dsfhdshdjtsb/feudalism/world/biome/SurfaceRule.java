package com.github.dsfhdshdjtsb.feudalism.world.biome;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.VanillaSurfaceRules;

public class SurfaceRule {
    private static final MaterialRules.MaterialRule DIRT = block(Blocks.DIRT);
    private static final MaterialRules.MaterialRule GRASS_BLOCK = block(Blocks.GRASS_BLOCK);
    private static final MaterialRules.MaterialRule RED_TERRACOTTA = block(Blocks.RED_TERRACOTTA);

    private static MaterialRules.MaterialRule block(Block block) {
        return MaterialRules.block(block.getDefaultState());
    }
    protected static MaterialRules.MaterialRule makeRules()
    {
        MaterialRules.MaterialCondition isAtOrAboveWaterLevel = MaterialRules.water(-1, 0);
        MaterialRules.MaterialRule grassSurface = MaterialRules.sequence(MaterialRules.condition(isAtOrAboveWaterLevel, GRASS_BLOCK), DIRT);

        return MaterialRules.sequence(
                MaterialRules.condition(MaterialRules.biome(FeudalismBiomes.SAKURA_FOREST), RED_TERRACOTTA),

                // Default to a grass and dirt surface
                MaterialRules.condition(MaterialRules.surface(), grassSurface)
        );
    }
}
