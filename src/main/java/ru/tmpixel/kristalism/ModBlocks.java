package ru.tmpixel.kristalism;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block KRISTALISM_ORE = register(
            "kristalism_ore",
            new Block(Block.Settings.copy(Blocks.DIAMOND_ORE))
    );

    private static Block register(String name, Block block) {
        Identifier id = Identifier.of(KristalismMod.MOD_ID, name);

        Registry.register(Registries.BLOCK, id, block);
        Registry.register(
                Registries.ITEM,
                id,
                new BlockItem(block, new Item.Settings())
        );

        return block;
    }

    public static void registerModBlocks() {
        System.out.println("Registering Kristalism blocks!");
    }
}
