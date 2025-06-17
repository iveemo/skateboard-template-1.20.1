package sew.skateboard.entity.client;

import net.minecraft.entity.EntityType;
import sew.skateboard.entity.ModEntities;
import sew.skateboard.entity.ModEntitiesProvider;
import sew.skateboard.entity.custom.SkateboardEntity;

public class ClientModEntitiesProvider implements ModEntitiesProvider {
    @Override
    public EntityType<SkateboardEntity> getSkateboardEntity() {
        return ModEntities.SKATEBOARD;
    }
}