package sew.skateboard.entity.client;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import sew.skateboard.SkateboardMod;
import sew.skateboard.entity.custom.SkateboardEntity;

public class SkateboardRender extends MobEntityRenderer<SkateboardEntity, PorcupineModel<SkateboardEntity> > {
    private static final Identifier TEXTURE = new Identifier(SkateboardMod.MOD_ID, "textures/entity/porcupine.png");

    public SkateboardRender(EntityRendererFactory.Context context) {
        super(context, new PorcupineModel<>(context.getPart(ModModelLayers.SKATEBOARD)), 0.6f);
    }

    @Override
    public Identifier getTexture(SkateboardEntity entity) {
        return null;
    }

    @Override
    public void render(SkateboardEntity mobEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
