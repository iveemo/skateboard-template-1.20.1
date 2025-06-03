package sew.skateboard.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import sew.skateboard.SkateboardMod;

public class ModItems {
    public static final Item p = registerItem("p", new Item(new FabricItemSettings()));
    public static final Item hp = registerItem("hp", new Item(new FabricItemSettings()));
    public static final Item cw = registerItem("cw", new Item(new FabricItemSettings()));
    public static final Item sb = registerItem("sb", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries){
        entries.add(p);
        entries.add(hp);
        entries.add(cw);
    }

    private static void addItemsToToolsTabItemGroup(FabricItemGroupEntries entries){
        entries.add(sb);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(SkateboardMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        SkateboardMod.LOGGER.info("Registering Mod Items for" + SkateboardMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToToolsTabItemGroup);
    }
}
