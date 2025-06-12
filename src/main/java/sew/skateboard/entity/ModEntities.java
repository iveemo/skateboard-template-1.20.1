package sew.skateboard.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import sew.skateboard.SkateboardMod;
import sew.skateboard.entity.custom.SkateboardEntity;

public class ModEntities {
    public static final EntityType<SkateboardEntity> SKATEBOARD = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(SkateboardMod.MOD_ID, "skateboard"),
            FabricEntityTypeBuilder.create(SpawnGroup.MISC, SkateboardEntity::new)
                    .dimensions(EntityDimensions.fixed(1.0f, 0.25f)) //dimensions are hitboxes
                    .build()
    );

    public static void registerModEntities() {
        SkateboardMod.LOGGER.info("Registering Entities for " + SkateboardMod.MOD_ID);
    }

}