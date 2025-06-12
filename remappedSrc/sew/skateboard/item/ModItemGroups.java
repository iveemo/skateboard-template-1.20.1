package sew.skateboard.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import sew.skateboard.SkateboardMod;

public class ModItemGroups {

    public static final ItemGroup SB_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SkateboardMod.MOD_ID, "skateboard"),
            FabricItemGroup.builder().displayName(Text.translatable("Skateboard"))
                    .icon(() -> new ItemStack(ModItems.sb)).entries((displayContext, entries) -> {
                        entries.add(ModItems.p);
                        entries.add(ModItems.hp);
                        entries.add(ModItems.cw);
                        entries.add(ModItems.sb);
                    }).build());

    public static void registerItemGroups(){

        SkateboardMod.LOGGER.info("Registering Item Groups for "+ SkateboardMod.MOD_ID);
    }
}
