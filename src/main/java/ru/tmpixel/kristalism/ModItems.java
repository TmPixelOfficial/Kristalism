package ru.tmpixel.kristalism;

import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.ToolMaterials;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final ToolMaterial KRISTALISM_MATERIAL = new ToolMaterial() {

        @Override
        public int getDurability() {
            return 3000;
        }

        @Override
        public float getMiningSpeedMultiplier() {
            return 30.0F;
        }

        @Override
        public float getAttackDamage() {
            return 11.0F;
        }

        @Override
        public int getEnchantability() {
            return 25;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.ofItems(KRISTALISM);
        }

        @Override
        public net.minecraft.registry.tag.TagKey<net.minecraft.block.Block> getInverseTag() {
            return ToolMaterials.DIAMOND.getInverseTag();
        }
    };

    public static final Item KRISTALISM = register(
            "kristalism",
            new Item(new Item.Settings())
    );

    public static final Item KRISTALISM_SWORD = register(
            "kristalism_sword",
            new SwordItem(
                    KRISTALISM_MATERIAL,
                    new Item.Settings()
            )
    );

    public static final Item KRISTALISM_PICKAXE = register(
            "kristalism_pickaxe",
            new PickaxeItem(
                    KRISTALISM_MATERIAL,
                    new Item.Settings()
            )
    );

    private static Item register(String name, Item item) {
        return Registry.register(
                Registries.ITEM,
                Identifier.of(KristalismMod.MOD_ID, name),
                item
        );
    }

    public static void registerModItems() {
        System.out.println("Registering Kristalism items!");
    }
}
