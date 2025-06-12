package sew.skateboard.entity.client;

import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import sew.skateboard.SkateboardMod;

public class ModModelLayers {
    public static final EntityModelLayer SKATEBOARD =
            new EntityModelLayer(new Identifier(SkateboardMod.MOD_ID, "skateboard"), "main");
}
