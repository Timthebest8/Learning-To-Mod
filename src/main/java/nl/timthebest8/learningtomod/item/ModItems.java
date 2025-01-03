package nl.timthebest8.learningtomod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import nl.timthebest8.learningtomod.LearningToMod;

public class ModItems {
    public static final Item BLUE_GEM = registerItem("blue_gem", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(LearningToMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        LearningToMod.LOGGER.info("Successfully registered item for " + LearningToMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(BLUE_GEM);
        });
    }
}
