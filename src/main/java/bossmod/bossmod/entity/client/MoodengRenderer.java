package bossmod.bossmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import bossmod.bossmod.Bossmod;
import bossmod.bossmod.entity.custom.MoodengEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;


public class MoodengRenderer extends MobRenderer<MoodengEntity, MoodengModel<MoodengEntity>> {
    public MoodengRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new MoodengModel<>(pContext.bakeLayer(ModModelLayers.MOO_DENG_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(MoodengEntity pEntity) {
        return new ResourceLocation(Bossmod.MODID, "textures/entity/moodeng.png");
    }

    @Override
    public void render(MoodengEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()) {
            pMatrixStack.scale(0.5f, 0.5f, 0.5f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
