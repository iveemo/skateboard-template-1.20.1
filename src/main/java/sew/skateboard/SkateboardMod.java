package sew.skateboard;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sew.skateboard.entity.ModEntities;
import sew.skateboard.entity.ModEntitiesProvider;
import sew.skateboard.entity.custom.SkateboardEntity;
import sew.skateboard.item.ModItemGroups;
import sew.skateboard.item.ModItems;
import net.minecraft.entity.EntityType;

public class SkateboardMod implements ModInitializer {
	public static final String MOD_ID = "skateboard";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static ModEntitiesProvider ENTITIES = new ModEntitiesProvider() {
		@Override
		public EntityType<SkateboardEntity> getSkateboardEntity() {
			return ModEntities.SKATEBOARD;
		}
	};

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		ModEntities.registerModEntities();
		FabricDefaultAttributeRegistry.register(ModEntities.SKATEBOARD, SkateboardEntity.createSkateboardAttributes());
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}