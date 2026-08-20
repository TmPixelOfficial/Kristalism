package ru.tmpixel.kristalism;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item KRISTALISM = register(
            "kristalism",
            new Item(new FabricItemSettings())
    );

    public static final Item KRISTALISM_SWORD = register(
            "kristalism_sword",
            new Item(new FabricItemSettings())
    );

    public static final Item KRISTALISM_PICKAXE = register(
            "kristalism_pickaxe",
            new Item(new FabricItemSettings())
    );

    private static Item register(String name, Item item) {
        return Registry.register(
                Registries.ITEM,
                Identifier.of(KristalismMod.MOD_ID, name),
                item
        );
    }

    public static void registerModItems() {
        System.out.println("Registering Kristalism items...");
    }
}
