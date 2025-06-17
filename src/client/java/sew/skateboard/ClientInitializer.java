package sew.skateboard;

import net.fabricmc.api.ClientModInitializer;
import sew.skateboard.entity.client.ClientModEntitiesProvider;

public class ClientInitializer implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        SkateboardMod.ENTITIES = new ClientModEntitiesProvider();
    }
}