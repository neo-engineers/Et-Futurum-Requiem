package ganymedes01.etfuturum.client.renderer.entity.elytra;

import ganymedes01.etfuturum.api.elytra.IClientElytraPlayer;
import ganymedes01.etfuturum.api.elytra.IElytraPlayer;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.Vec3;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelElytra extends ModelBase {
	private ModelRenderer rightWing;
	private ModelRenderer leftWing = new ModelRenderer(this, 22, 0);

	public ModelElytra() {
		this.leftWing.addBox(-10.0F, 0.0F, 0.0F, 10, 20, 2, 1.0F);
		this.rightWing = new ModelRenderer(this, 22, 0);
		this.rightWing.mirror = true;
		this.rightWing.addBox(0.0F, 0.0F, 0.0F, 10, 20, 2, 1.0F);
	}

	/**
	 * Sets the models various rotation angles then renders the model.
	 */
	@Override
	public void render(Entity entityIn, float p_78088_2_, float limbSwing, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		GL11.glDisable(GL12.GL_RESCALE_NORMAL);
		GL11.glDisable(GL11.GL_CULL_FACE);
		this.leftWing.render(scale);
		this.rightWing.render(scale);
	}

	/**
	 * Sets the model's various rotation angles. For bipeds, par1 and par2 are
	 * used for animating the movement of arms and legs, where par1 represents
	 * the time(so that arms and legs swing back and forth) and par2 represents
	 * how "far" arms and legs can swing at most.
	 */
	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
		super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityIn);
		float f = 0.2617994F;
		float f1 = -0.2617994F;
		float f2 = 0.0F;
		float f3 = 0.0F;

		if (entityIn instanceof IElytraPlayer && ((IElytraPlayer)entityIn).etfu$isElytraFlying()) {
			float f4 = 1.0F;

			if (entityIn.motionY < 0.0D) {
				Vec3 vec3d = (Vec3.createVectorHelper(entityIn.motionX, entityIn.motionY, entityIn.motionZ)).normalize();
				f4 = 1.0F - (float) Math.pow(-vec3d.yCoord, 1.5D);
			}

			f = f4 * 0.34906584F + (1.0F - f4) * f;
			f1 = f4 * -((float) Math.PI / 2F) + (1.0F - f4) * f1;
		} else if (entityIn.isSneaking()) {
			f = ((float) Math.PI * 2F / 9F);
			f1 = -((float) Math.PI / 4F);
			f2 = 3.0F;
			f3 = 0.08726646F;
		}

		this.leftWing.rotationPointX = 5.0F;
		this.leftWing.rotationPointY = f2;

		if (entityIn instanceof IClientElytraPlayer) {
			IClientElytraPlayer cep = (IClientElytraPlayer) entityIn;
			cep.setRotateElytraX((float)(cep.getRotateElytraX() + (f - cep.getRotateElytraX()) * 0.1D));
			cep.setRotateElytraY((float)(cep.getRotateElytraY() + (f3 - cep.getRotateElytraY()) * 0.1D));
			cep.setRotateElytraZ((float)(cep.getRotateElytraZ() + (f1 - cep.getRotateElytraZ()) * 0.1D));
			this.leftWing.rotateAngleX = cep.getRotateElytraX();
			this.leftWing.rotateAngleY = cep.getRotateElytraY();
			this.leftWing.rotateAngleZ = cep.getRotateElytraZ();
		} else {
			this.leftWing.rotateAngleX = f;
			this.leftWing.rotateAngleZ = f1;
			this.leftWing.rotateAngleY = f3;
		}

		this.rightWing.rotationPointX = -this.leftWing.rotationPointX;
		this.rightWing.rotateAngleY = -this.leftWing.rotateAngleY;
		this.rightWing.rotationPointY = this.leftWing.rotationPointY;
		this.rightWing.rotateAngleX = this.leftWing.rotateAngleX;
		this.rightWing.rotateAngleZ = -this.leftWing.rotateAngleZ;
	}

	/**
	 * Used for easily adding entity-dependent animations. The second and third
	 * float params here are the same second and third as in the
	 * setRotationAngles method.
	 */
	@Override
	public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float p_78086_2_, float p_78086_3_, float partialTickTime) {
		super.setLivingAnimations(entitylivingbaseIn, p_78086_2_, p_78086_3_, partialTickTime);
	}
}