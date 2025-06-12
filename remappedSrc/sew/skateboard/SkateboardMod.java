package sew.skateboard;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sew.skateboard.entity.custom.SkateboardEntity;
import sew.skateboard.item.ModItemGroups;
import sew.skateboard.item.ModItems;
import sew.skateboard.entity.ModEntities;

public class SkateboardMod implements ModInitializer {
	public static final String MOD_ID = "skateboard";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModEntities.registerModEntities();

		FabricDefaultAttributeRegistry.register(ModEntities.SKATEBOARD, SkateboardEntity.createSkateboardAttributes());
	}
}