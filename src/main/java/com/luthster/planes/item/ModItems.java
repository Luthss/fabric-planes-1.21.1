package com.luthster.planes.item;

import com.luthster.planes.Planes;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SAIL = registerItem("sail", new Item(new Item.Settings()));
    public static final Item IRON_FRAME = registerItem("iron_frame", new Item(new Item.Settings()));
    
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Planes.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Planes.LOGGER.info("Register Mod Items for " + Planes.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(SAIL);
            fabricItemGroupEntries.add(IRON_FRAME);
        });
    }
}
