package ru.tmpixel.kristalism;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block KRISTALISM_ORE = register(
            "kristalism_ore",
            new Block(Block.Settings.copy(Blocks.DIAMOND_ORE))
    );

    private static Block register(String name, Block block) {
        return Registry.register(
                Registries.BLOCK,
                Identifier.of(KristalismMod.MOD_ID, name),
                block
        );
    }

    public static void registerModBlocks() {
        System.out.println("Registering Kristalism blocks!");
    }
}
