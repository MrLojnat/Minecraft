package bossmod.bossmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class MoodengModel<T extends Entity> extends HierarchicalModel<T> {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("bossmod", "moodeng"), "main");
    private final ModelPart mooDeng;
    private final ModelPart body;
    private final ModelPart torso;
    private final ModelPart head;
    private final ModelPart lArm;
    private final ModelPart rArm;
    private final ModelPart bodyLower;
    private final ModelPart lLeg;
    private final ModelPart rLeg;

    public MoodengModel(ModelPart root) {
        this.mooDeng = root.getChild("moo_deng");
        this.body = mooDeng.getChild("body");

        this.torso = body.getChild("torso");
        this.head = torso.getChild("head");
        this.lArm = torso.getChild("l_arm");
        this.rArm = torso.getChild("r_arm");

        this.bodyLower = body.getChild("body_lower");
        this.lLeg = bodyLower.getChild("l_leg");
        this.rLeg = bodyLower.getChild("r_leg");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition mooDeng = partdefinition.addOrReplaceChild("moo_deng", CubeListBuilder.create(), PartPose.offset(0.5F, 12.5F, -4.0F));

        PartDefinition body = mooDeng.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition torso = body.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(-9, 1).addBox(-3.5F, -12.5F, -7.0F, 7.0F, 18.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -24.0F, 4.0F));
        PartDefinition head = torso.addOrReplaceChild("head", CubeListBuilder.create().texOffs(-14, 1).addBox(-7.0F, 18.0F, -7.0F, 14.0F, 14.0F, 14.0F, new CubeDeformation(0.0F))
                .texOffs(-38, -17).addBox(-13.0F, 16.0F, -16.0F, 28.0F, 2.0F, 32.0F, new CubeDeformation(0.0F))
                .texOffs(-34, -13).addBox(-11.0F, 13.0F, -14.0F, 24.0F, 3.0F, 28.0F, new CubeDeformation(0.0F))
                .texOffs(-26, -5).addBox(-8.0F, 10.0F, -10.0F, 18.0F, 3.0F, 20.0F, new CubeDeformation(0.0F))
                .texOffs(-20, 1).addBox(-5.0F, 7.0F, -7.0F, 12.0F, 3.0F, 14.0F, new CubeDeformation(0.0F))
                .texOffs(-12, 9).addBox(-1.0F, 4.0F, -3.0F, 4.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, -44.5F, 0.0F));

        PartDefinition r_hat_string_r1 = head.addOrReplaceChild("r_hat_string_r1", CubeListBuilder.create().texOffs(-3, -1).addBox(6.0F, 6.0F, -9.0F, 1.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.0F, 20.0F, 5.0F, 1.0908F, 0.0F, 0.0F));
        PartDefinition l_hat_string_r1 = head.addOrReplaceChild("l_hat_string_r1", CubeListBuilder.create().texOffs(-3, -1).addBox(6.0F, 6.0F, -7.0F, 1.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.0F, 20.0F, -5.0F, -1.0908F, 0.0F, 0.0F));

        PartDefinition l_arm = torso.addOrReplaceChild("l_arm", CubeListBuilder.create(), PartPose.offset(-14.0F, -1.0F, -5.0F));
        PartDefinition l_hand_fingers_r1 = l_arm.addOrReplaceChild("l_hand_fingers_r1", CubeListBuilder.create().texOffs(3, 13).addBox(-3.5F, -5.5F, -1.0F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.0F, 3.0F, 0.0F, 0.0F, 0.0F));
        PartDefinition l_hand_palm_r1 = l_arm.addOrReplaceChild("l_hand_palm_r1", CubeListBuilder.create().texOffs(1, 11).addBox(-3.5F, -8.5F, 0.0F, 6.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));
        PartDefinition l_lowerarm_r1 = l_arm.addOrReplaceChild("l_lowerarm_r1", CubeListBuilder.create().texOffs(-1, 9).addBox(-3.5F, -11.5F, -3.0F, 7.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -3.0F, 1.0F, 1.0908F, 0.0F, 1.2217F));
        PartDefinition l_upperarm_r1 = l_arm.addOrReplaceChild("l_upperarm_r1", CubeListBuilder.create().texOffs(-1, 9).addBox(-3.5F, -11.5F, -3.0F, 7.0F, 17.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, -6.0F, -7.0F, -0.3491F, 0.0F, 1.3526F));

        PartDefinition r_arm = torso.addOrReplaceChild("r_arm", CubeListBuilder.create(), PartPose.offset(-7.0F, -7.0F, 12.0F));
        PartDefinition r_hand_fingers_r1 = r_arm.addOrReplaceChild("r_hand_fingers_r1", CubeListBuilder.create().texOffs(3, 13).addBox(-3.5F, -5.5F, -1.0F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(1, 11).addBox(-3.5F, -1.5F, -1.0F, 6.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0F, -1.0F, -10.0F, 0.0F, 0.0F, 0.0F));
        PartDefinition r_lowerarm_r1 = r_arm.addOrReplaceChild("r_lowerarm_r1", CubeListBuilder.create().texOffs(-1, 9).addBox(-3.5F, -11.5F, -3.0F, 7.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.0F, 3.0F, -8.0F, -1.0908F, 0.0F, 1.2217F));
        PartDefinition r_upperarm_r1 = r_arm.addOrReplaceChild("r_upperarm_r1", CubeListBuilder.create().texOffs(-1, 9).addBox(-3.5F, -11.5F, -3.0F, 7.0F, 17.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3491F, 0.0F, 1.3526F));

        PartDefinition body_lower = body.addOrReplaceChild("body_lower", CubeListBuilder.create().texOffs(-9, -1).addBox(-4.5F, -8.5F, -8.0F, 9.0F, 21.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -11.0F, 4.0F));
        PartDefinition l_leg = body_lower.addOrReplaceChild("l_leg", CubeListBuilder.create().texOffs(-1, 9).addBox(-3.5F, -18.5F, -3.0F, 7.0F, 30.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(6, 9).addBox(-8.5F, 8.5F, -3.0F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 11.0F, -4.0F));
        PartDefinition r_leg = body_lower.addOrReplaceChild("r_leg", CubeListBuilder.create().texOffs(4, 9).addBox(-3.5F, -18.5F, -3.0F, 7.0F, 30.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(6, 9).addBox(-8.5F, 8.5F, -3.0F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 11.0F, 4.0F));

        return LayerDefinition.create(meshdefinition, 16, 32);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        mooDeng.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    @Override
    public ModelPart root() {
        return mooDeng;
    }
}