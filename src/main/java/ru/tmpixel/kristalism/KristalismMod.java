package ru.tmpixel.kristalism;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;

public class KristalismMod implements ModInitializer {

    public static final String MOD_ID = "kristalism";

    private static final RegistryKey<net.minecraft.world.gen.feature.PlacedFeature> KRISTALISM_ORE =
            RegistryKey.of(
                    RegistryKeys.PLACED_FEATURE,
                    Identifier.of(MOD_ID, "kristalism_ore")
            );

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();

        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                KRISTALISM_ORE
        );
    }
}
