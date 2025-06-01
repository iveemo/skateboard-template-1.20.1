package sew.skateboard.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import sew.skateboard.Skateboard;

public class ModItemGroups {

    public static final ItemGroup SB_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Skateboard.MOD_ID, "skateboard"),
            FabricItemGroup.builder().displayName(Text.translatable("skateboard"))
                    .icon(() -> new ItemStack(ModItems.sb)).entries((displayContext, entries) -> {
                        entries.add(ModItems.ks);
                        entries.add(ModItems.hks);
                        entries.add(ModItems.cw);
                        entries.add(ModItems.sb);
                    }).build());

    public static void registerItemGroups(){

        Skateboard.LOGGER.info("Registering Item Groups for "+Skateboard.MOD_ID);
    }
}
