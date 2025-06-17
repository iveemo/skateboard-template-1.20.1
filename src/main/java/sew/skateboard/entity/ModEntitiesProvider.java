package sew.skateboard.entity;

import net.minecraft.entity.EntityType;
import sew.skateboard.entity.custom.SkateboardEntity;

public interface ModEntitiesProvider {
    EntityType<SkateboardEntity> getSkateboardEntity();
}