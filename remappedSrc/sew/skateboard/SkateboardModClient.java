package sew.skateboard;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import sew.skateboard.entity.ModEntities;
import sew.skateboard.entity.client.ModModelLayers;
import sew.skateboard.entity.client.PorcupineModel;
import sew.skateboard.entity.client.SkateboardRender;

public class SkateboardModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(ModEntities.SKATEBOARD, SkateboardRender::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.SKATEBOARD, PorcupineModel::getTexturedModelData);
    }
}
