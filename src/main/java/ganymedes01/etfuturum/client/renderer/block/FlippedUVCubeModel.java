package ganymedes01.etfuturum.client.renderer.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockGrass;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.IIcon;

public abstract class FlippedUVCubeModel extends BlockModelBase {

	protected boolean uvFlipTop;
	protected boolean uvFlipBottom;
	protected boolean uvFlipNorth;
	protected boolean uvFlipSouth;
	protected boolean uvFlipEast;
	protected boolean uvFlipWest;

	public boolean renderStandardBlockWithColorMultiplier(RenderBlocks renderer, Block p_147736_1_, int p_147736_2_, int p_147736_3_, int p_147736_4_, float p_147736_5_, float p_147736_6_, float p_147736_7_)
	{
		renderer.enableAO = false;
		Tessellator tessellator = Tessellator.instance;
		boolean flag = false;
		float f3 = 0.5F;
		float f4 = 1.0F;
		float f5 = 0.8F;
		float f6 = 0.6F;
		float f7 = f4 * p_147736_5_;
		float f8 = f4 * p_147736_6_;
		float f9 = f4 * p_147736_7_;
		float f10 = f3;
		float f11 = f5;
		float f12 = f6;
		float f13 = f3;
		float f14 = f5;
		float f15 = f6;
		float f16 = f3;
		float f17 = f5;
		float f18 = f6;
		f10 = f3 * p_147736_5_;
		f11 = f5 * p_147736_5_;
		f12 = f6 * p_147736_5_;
		f13 = f3 * p_147736_6_;
		f14 = f5 * p_147736_6_;
		f15 = f6 * p_147736_6_;
		f16 = f3 * p_147736_7_;
		f17 = f5 * p_147736_7_;
		f18 = f6 * p_147736_7_;

		int l = p_147736_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147736_2_, p_147736_3_, p_147736_4_);

		if (renderer.renderAllFaces || p_147736_1_.shouldSideBeRendered(renderer.blockAccess, p_147736_2_, p_147736_3_ - 1, p_147736_4_, 0))
		{
			
			tessellator.setBrightness(renderer.renderMinY > 0.0D ? l : p_147736_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147736_2_, p_147736_3_ - 1, p_147736_4_));
			tessellator.setColorOpaque_F(f10, f13, f16);
			renderFaceYNeg(renderer, p_147736_1_, p_147736_2_, p_147736_3_, p_147736_4_, renderer.getBlockIcon(p_147736_1_, renderer.blockAccess, p_147736_2_, p_147736_3_, p_147736_4_, 0));
			flag = true;
			
		}

		if (renderer.renderAllFaces || p_147736_1_.shouldSideBeRendered(renderer.blockAccess, p_147736_2_, p_147736_3_ + 1, p_147736_4_, 1))
		{
			tessellator.setBrightness(renderer.renderMaxY < 1.0D ? l : p_147736_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147736_2_, p_147736_3_ + 1, p_147736_4_));
			tessellator.setColorOpaque_F(f7, f8, f9);
			renderFaceYPos(renderer, p_147736_1_, p_147736_2_, p_147736_3_, p_147736_4_, renderer.getBlockIcon(p_147736_1_, renderer.blockAccess, p_147736_2_, p_147736_3_, p_147736_4_, 1));
			flag = true;
		}

		IIcon iicon;

		if (renderer.renderAllFaces || p_147736_1_.shouldSideBeRendered(renderer.blockAccess, p_147736_2_, p_147736_3_, p_147736_4_ - 1, 2))
		{
			tessellator.setBrightness(renderer.renderMinZ > 0.0D ? l : p_147736_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147736_2_, p_147736_3_, p_147736_4_ - 1));
			tessellator.setColorOpaque_F(f11, f14, f17);
			iicon = renderer.getBlockIcon(p_147736_1_, renderer.blockAccess, p_147736_2_, p_147736_3_, p_147736_4_, 2);
			renderFaceZNeg(renderer, p_147736_1_, p_147736_2_, p_147736_3_, p_147736_4_, iicon);

			flag = true;
		}

		if (renderer.renderAllFaces || p_147736_1_.shouldSideBeRendered(renderer.blockAccess, p_147736_2_, p_147736_3_, p_147736_4_ + 1, 3))
		{
			tessellator.setBrightness(renderer.renderMaxZ < 1.0D ? l : p_147736_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147736_2_, p_147736_3_, p_147736_4_ + 1));
			tessellator.setColorOpaque_F(f11, f14, f17);
			iicon = renderer.getBlockIcon(p_147736_1_, renderer.blockAccess, p_147736_2_, p_147736_3_, p_147736_4_, 3);
			renderFaceZPos(renderer, p_147736_1_, p_147736_2_, p_147736_3_, p_147736_4_, iicon);

			flag = true;
		}

		if (renderer.renderAllFaces || p_147736_1_.shouldSideBeRendered(renderer.blockAccess, p_147736_2_ - 1, p_147736_3_, p_147736_4_, 4))
		{
			tessellator.setBrightness(renderer.renderMinX > 0.0D ? l : p_147736_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147736_2_ - 1, p_147736_3_, p_147736_4_));
			tessellator.setColorOpaque_F(f12, f15, f18);
			iicon = renderer.getBlockIcon(p_147736_1_, renderer.blockAccess, p_147736_2_, p_147736_3_, p_147736_4_, 4);
			renderFaceXNeg(renderer, p_147736_1_, p_147736_2_, p_147736_3_, p_147736_4_, iicon);

			flag = true;
		}

		if (renderer.renderAllFaces || p_147736_1_.shouldSideBeRendered(renderer.blockAccess, p_147736_2_ + 1, p_147736_3_, p_147736_4_, 5))
		{
			tessellator.setBrightness(renderer.renderMaxX < 1.0D ? l : p_147736_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147736_2_ + 1, p_147736_3_, p_147736_4_));
			tessellator.setColorOpaque_F(f12, f15, f18);
			iicon = renderer.getBlockIcon(p_147736_1_, renderer.blockAccess, p_147736_2_, p_147736_3_, p_147736_4_, 5);
			renderFaceXPos(renderer, p_147736_1_, p_147736_2_, p_147736_3_, p_147736_4_, iicon);

			flag = true;
		}

		return flag;
	}
	
	public boolean renderStandardBlockWithAmbientOcclusion(RenderBlocks renderer, Block p_147751_1_, int p_147751_2_, int p_147751_3_, int p_147751_4_, float p_147751_5_, float p_147751_6_, float p_147751_7_)
	{
		renderer.enableAO = true;
		boolean flag = false;
		float f3 = 0.0F;
		float f4 = 0.0F;
		float f5 = 0.0F;
		float f6 = 0.0F;
		boolean flag1 = true;
		int l = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_, p_147751_3_, p_147751_4_);
		Tessellator tessellator = Tessellator.instance;
		tessellator.setBrightness(983055);

		if (renderer.getBlockIcon(p_147751_1_).getIconName().equals("grass_top"))
		{
			flag1 = false;
		}
		else if (renderer.hasOverrideBlockTexture())
		{
			flag1 = false;
		}

		boolean flag2;
		boolean flag3;
		boolean flag4;
		boolean flag5;
		int i1;
		float f7;

		if (renderer.renderAllFaces || p_147751_1_.shouldSideBeRendered(renderer.blockAccess, p_147751_2_, p_147751_3_ - 1, p_147751_4_, 0))
		{
			if (renderer.renderMinY <= 0.0D)
			{
				--p_147751_3_;
			}

			renderer.aoBrightnessXYNN = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_ - 1, p_147751_3_, p_147751_4_);
			renderer.aoBrightnessYZNN = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_, p_147751_3_, p_147751_4_ - 1);
			renderer.aoBrightnessYZNP = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_, p_147751_3_, p_147751_4_ + 1);
			renderer.aoBrightnessXYPN = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_ + 1, p_147751_3_, p_147751_4_);
			renderer.aoLightValueScratchXYNN = renderer.blockAccess.getBlock(p_147751_2_ - 1, p_147751_3_, p_147751_4_).getAmbientOcclusionLightValue();
			renderer.aoLightValueScratchYZNN = renderer.blockAccess.getBlock(p_147751_2_, p_147751_3_, p_147751_4_ - 1).getAmbientOcclusionLightValue();
			renderer.aoLightValueScratchYZNP = renderer.blockAccess.getBlock(p_147751_2_, p_147751_3_, p_147751_4_ + 1).getAmbientOcclusionLightValue();
			renderer.aoLightValueScratchXYPN = renderer.blockAccess.getBlock(p_147751_2_ + 1, p_147751_3_, p_147751_4_).getAmbientOcclusionLightValue();
			flag2 = renderer.blockAccess.getBlock(p_147751_2_ + 1, p_147751_3_ - 1, p_147751_4_).getCanBlockGrass();
			flag3 = renderer.blockAccess.getBlock(p_147751_2_ - 1, p_147751_3_ - 1, p_147751_4_).getCanBlockGrass();
			flag4 = renderer.blockAccess.getBlock(p_147751_2_, p_147751_3_ - 1, p_147751_4_ + 1).getCanBlockGrass();
			flag5 = renderer.blockAccess.getBlock(p_147751_2_, p_147751_3_ - 1, p_147751_4_ - 1).getCanBlockGrass();

			if (!flag5 && !flag3)
			{
				renderer.aoLightValueScratchXYZNNN = renderer.aoLightValueScratchXYNN;
				renderer.aoBrightnessXYZNNN = renderer.aoBrightnessXYNN;
			}
			else
			{
				renderer.aoLightValueScratchXYZNNN = renderer.blockAccess.getBlock(p_147751_2_ - 1, p_147751_3_, p_147751_4_ - 1).getAmbientOcclusionLightValue();
				renderer.aoBrightnessXYZNNN = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_ - 1, p_147751_3_, p_147751_4_ - 1);
			}

			if (!flag4 && !flag3)
			{
				renderer.aoLightValueScratchXYZNNP = renderer.aoLightValueScratchXYNN;
				renderer.aoBrightnessXYZNNP = renderer.aoBrightnessXYNN;
			}
			else
			{
				renderer.aoLightValueScratchXYZNNP = renderer.blockAccess.getBlock(p_147751_2_ - 1, p_147751_3_, p_147751_4_ + 1).getAmbientOcclusionLightValue();
				renderer.aoBrightnessXYZNNP = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_ - 1, p_147751_3_, p_147751_4_ + 1);
			}

			if (!flag5 && !flag2)
			{
				renderer.aoLightValueScratchXYZPNN = renderer.aoLightValueScratchXYPN;
				renderer.aoBrightnessXYZPNN = renderer.aoBrightnessXYPN;
			}
			else
			{
				renderer.aoLightValueScratchXYZPNN = renderer.blockAccess.getBlock(p_147751_2_ + 1, p_147751_3_, p_147751_4_ - 1).getAmbientOcclusionLightValue();
				renderer.aoBrightnessXYZPNN = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_ + 1, p_147751_3_, p_147751_4_ - 1);
			}

			if (!flag4 && !flag2)
			{
				renderer.aoLightValueScratchXYZPNP = renderer.aoLightValueScratchXYPN;
				renderer.aoBrightnessXYZPNP = renderer.aoBrightnessXYPN;
			}
			else
			{
				renderer.aoLightValueScratchXYZPNP = renderer.blockAccess.getBlock(p_147751_2_ + 1, p_147751_3_, p_147751_4_ + 1).getAmbientOcclusionLightValue();
				renderer.aoBrightnessXYZPNP = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_ + 1, p_147751_3_, p_147751_4_ + 1);
			}

			if (renderer.renderMinY <= 0.0D)
			{
				++p_147751_3_;
			}

			i1 = l;

			if (renderer.renderMinY <= 0.0D || !renderer.blockAccess.getBlock(p_147751_2_, p_147751_3_ - 1, p_147751_4_).isOpaqueCube())
			{
				i1 = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_, p_147751_3_ - 1, p_147751_4_);
			}

			f7 = renderer.blockAccess.getBlock(p_147751_2_, p_147751_3_ - 1, p_147751_4_).getAmbientOcclusionLightValue();
			f3 = (renderer.aoLightValueScratchXYZNNP + renderer.aoLightValueScratchXYNN + renderer.aoLightValueScratchYZNP + f7) / 4.0F;
			f6 = (renderer.aoLightValueScratchYZNP + f7 + renderer.aoLightValueScratchXYZPNP + renderer.aoLightValueScratchXYPN) / 4.0F;
			f5 = (f7 + renderer.aoLightValueScratchYZNN + renderer.aoLightValueScratchXYPN + renderer.aoLightValueScratchXYZPNN) / 4.0F;
			f4 = (renderer.aoLightValueScratchXYNN + renderer.aoLightValueScratchXYZNNN + f7 + renderer.aoLightValueScratchYZNN) / 4.0F;
			renderer.brightnessTopLeft = renderer.getAoBrightness(renderer.aoBrightnessXYZNNP, renderer.aoBrightnessXYNN, renderer.aoBrightnessYZNP, i1);
			renderer.brightnessTopRight = renderer.getAoBrightness(renderer.aoBrightnessYZNP, renderer.aoBrightnessXYZPNP, renderer.aoBrightnessXYPN, i1);
			renderer.brightnessBottomRight = renderer.getAoBrightness(renderer.aoBrightnessYZNN, renderer.aoBrightnessXYPN, renderer.aoBrightnessXYZPNN, i1);
			renderer.brightnessBottomLeft = renderer.getAoBrightness(renderer.aoBrightnessXYNN, renderer.aoBrightnessXYZNNN, renderer.aoBrightnessYZNN, i1);

			if (flag1)
			{
				renderer.colorRedTopLeft = renderer.colorRedBottomLeft = renderer.colorRedBottomRight = renderer.colorRedTopRight = p_147751_5_ * 0.5F;
				renderer.colorGreenTopLeft = renderer.colorGreenBottomLeft = renderer.colorGreenBottomRight = renderer.colorGreenTopRight = p_147751_6_ * 0.5F;
				renderer.colorBlueTopLeft = renderer.colorBlueBottomLeft = renderer.colorBlueBottomRight = renderer.colorBlueTopRight = p_147751_7_ * 0.5F;
			}
			else
			{
				renderer.colorRedTopLeft = renderer.colorRedBottomLeft = renderer.colorRedBottomRight = renderer.colorRedTopRight = 0.5F;
				renderer.colorGreenTopLeft = renderer.colorGreenBottomLeft = renderer.colorGreenBottomRight = renderer.colorGreenTopRight = 0.5F;
				renderer.colorBlueTopLeft = renderer.colorBlueBottomLeft = renderer.colorBlueBottomRight = renderer.colorBlueTopRight = 0.5F;
			}

			renderer.colorRedTopLeft *= f3;
			renderer.colorGreenTopLeft *= f3;
			renderer.colorBlueTopLeft *= f3;
			renderer.colorRedBottomLeft *= f4;
			renderer.colorGreenBottomLeft *= f4;
			renderer.colorBlueBottomLeft *= f4;
			renderer.colorRedBottomRight *= f5;
			renderer.colorGreenBottomRight *= f5;
			renderer.colorBlueBottomRight *= f5;
			renderer.colorRedTopRight *= f6;
			renderer.colorGreenTopRight *= f6;
			renderer.colorBlueTopRight *= f6;//Bottom, Side 0
			
			renderFaceYNeg(renderer, p_147751_1_, p_147751_2_, p_147751_3_, p_147751_4_, renderer.getBlockIcon(p_147751_1_, renderer.blockAccess, p_147751_2_, p_147751_3_, p_147751_4_, 0));
			
			flag = true;
		}

		if (renderer.renderAllFaces || p_147751_1_.shouldSideBeRendered(renderer.blockAccess, p_147751_2_, p_147751_3_ + 1, p_147751_4_, 1))
		{
			if (renderer.renderMaxY >= 1.0D)
			{
				++p_147751_3_;
			}

			renderer.aoBrightnessXYNP = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_ - 1, p_147751_3_, p_147751_4_);
			renderer.aoBrightnessXYPP = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_ + 1, p_147751_3_, p_147751_4_);
			renderer.aoBrightnessYZPN = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_, p_147751_3_, p_147751_4_ - 1);
			renderer.aoBrightnessYZPP = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_, p_147751_3_, p_147751_4_ + 1);
			renderer.aoLightValueScratchXYNP = renderer.blockAccess.getBlock(p_147751_2_ - 1, p_147751_3_, p_147751_4_).getAmbientOcclusionLightValue();
			renderer.aoLightValueScratchXYPP = renderer.blockAccess.getBlock(p_147751_2_ + 1, p_147751_3_, p_147751_4_).getAmbientOcclusionLightValue();
			renderer.aoLightValueScratchYZPN = renderer.blockAccess.getBlock(p_147751_2_, p_147751_3_, p_147751_4_ - 1).getAmbientOcclusionLightValue();
			renderer.aoLightValueScratchYZPP = renderer.blockAccess.getBlock(p_147751_2_, p_147751_3_, p_147751_4_ + 1).getAmbientOcclusionLightValue();
			flag2 = renderer.blockAccess.getBlock(p_147751_2_ + 1, p_147751_3_ + 1, p_147751_4_).getCanBlockGrass();
			flag3 = renderer.blockAccess.getBlock(p_147751_2_ - 1, p_147751_3_ + 1, p_147751_4_).getCanBlockGrass();
			flag4 = renderer.blockAccess.getBlock(p_147751_2_, p_147751_3_ + 1, p_147751_4_ + 1).getCanBlockGrass();
			flag5 = renderer.blockAccess.getBlock(p_147751_2_, p_147751_3_ + 1, p_147751_4_ - 1).getCanBlockGrass();

			if (!flag5 && !flag3)
			{
				renderer.aoLightValueScratchXYZNPN = renderer.aoLightValueScratchXYNP;
				renderer.aoBrightnessXYZNPN = renderer.aoBrightnessXYNP;
			}
			else
			{
				renderer.aoLightValueScratchXYZNPN = renderer.blockAccess.getBlock(p_147751_2_ - 1, p_147751_3_, p_147751_4_ - 1).getAmbientOcclusionLightValue();
				renderer.aoBrightnessXYZNPN = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_ - 1, p_147751_3_, p_147751_4_ - 1);
			}

			if (!flag5 && !flag2)
			{
				renderer.aoLightValueScratchXYZPPN = renderer.aoLightValueScratchXYPP;
				renderer.aoBrightnessXYZPPN = renderer.aoBrightnessXYPP;
			}
			else
			{
				renderer.aoLightValueScratchXYZPPN = renderer.blockAccess.getBlock(p_147751_2_ + 1, p_147751_3_, p_147751_4_ - 1).getAmbientOcclusionLightValue();
				renderer.aoBrightnessXYZPPN = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_ + 1, p_147751_3_, p_147751_4_ - 1);
			}

			if (!flag4 && !flag3)
			{
				renderer.aoLightValueScratchXYZNPP = renderer.aoLightValueScratchXYNP;
				renderer.aoBrightnessXYZNPP = renderer.aoBrightnessXYNP;
			}
			else
			{
				renderer.aoLightValueScratchXYZNPP = renderer.blockAccess.getBlock(p_147751_2_ - 1, p_147751_3_, p_147751_4_ + 1).getAmbientOcclusionLightValue();
				renderer.aoBrightnessXYZNPP = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_ - 1, p_147751_3_, p_147751_4_ + 1);
			}

			if (!flag4 && !flag2)
			{
				renderer.aoLightValueScratchXYZPPP = renderer.aoLightValueScratchXYPP;
				renderer.aoBrightnessXYZPPP = renderer.aoBrightnessXYPP;
			}
			else
			{
				renderer.aoLightValueScratchXYZPPP = renderer.blockAccess.getBlock(p_147751_2_ + 1, p_147751_3_, p_147751_4_ + 1).getAmbientOcclusionLightValue();
				renderer.aoBrightnessXYZPPP = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_ + 1, p_147751_3_, p_147751_4_ + 1);
			}

			if (renderer.renderMaxY >= 1.0D)
			{
				--p_147751_3_;
			}

			i1 = l;

			if (renderer.renderMaxY >= 1.0D || !renderer.blockAccess.getBlock(p_147751_2_, p_147751_3_ + 1, p_147751_4_).isOpaqueCube())
			{
				i1 = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_, p_147751_3_ + 1, p_147751_4_);
			}

			f7 = renderer.blockAccess.getBlock(p_147751_2_, p_147751_3_ + 1, p_147751_4_).getAmbientOcclusionLightValue();
			f6 = (renderer.aoLightValueScratchXYZNPP + renderer.aoLightValueScratchXYNP + renderer.aoLightValueScratchYZPP + f7) / 4.0F;
			f3 = (renderer.aoLightValueScratchYZPP + f7 + renderer.aoLightValueScratchXYZPPP + renderer.aoLightValueScratchXYPP) / 4.0F;
			f4 = (f7 + renderer.aoLightValueScratchYZPN + renderer.aoLightValueScratchXYPP + renderer.aoLightValueScratchXYZPPN) / 4.0F;
			f5 = (renderer.aoLightValueScratchXYNP + renderer.aoLightValueScratchXYZNPN + f7 + renderer.aoLightValueScratchYZPN) / 4.0F;
			renderer.brightnessTopRight = renderer.getAoBrightness(renderer.aoBrightnessXYZNPP, renderer.aoBrightnessXYNP, renderer.aoBrightnessYZPP, i1);
			renderer.brightnessTopLeft = renderer.getAoBrightness(renderer.aoBrightnessYZPP, renderer.aoBrightnessXYZPPP, renderer.aoBrightnessXYPP, i1);
			renderer.brightnessBottomLeft = renderer.getAoBrightness(renderer.aoBrightnessYZPN, renderer.aoBrightnessXYPP, renderer.aoBrightnessXYZPPN, i1);
			renderer.brightnessBottomRight = renderer.getAoBrightness(renderer.aoBrightnessXYNP, renderer.aoBrightnessXYZNPN, renderer.aoBrightnessYZPN, i1);
			renderer.colorRedTopLeft = renderer.colorRedBottomLeft = renderer.colorRedBottomRight = renderer.colorRedTopRight = p_147751_5_;
			renderer.colorGreenTopLeft = renderer.colorGreenBottomLeft = renderer.colorGreenBottomRight = renderer.colorGreenTopRight = p_147751_6_;
			renderer.colorBlueTopLeft = renderer.colorBlueBottomLeft = renderer.colorBlueBottomRight = renderer.colorBlueTopRight = p_147751_7_;
			renderer.colorRedTopLeft *= f3;
			renderer.colorGreenTopLeft *= f3;
			renderer.colorBlueTopLeft *= f3;
			renderer.colorRedBottomLeft *= f4;
			renderer.colorGreenBottomLeft *= f4;
			renderer.colorBlueBottomLeft *= f4;
			renderer.colorRedBottomRight *= f5;
			renderer.colorGreenBottomRight *= f5;
			renderer.colorBlueBottomRight *= f5;
			renderer.colorRedTopRight *= f6;
			renderer.colorGreenTopRight *= f6;
			renderer.colorBlueTopRight *= f6;
			renderFaceYPos(renderer, p_147751_1_, p_147751_2_, p_147751_3_, p_147751_4_, renderer.getBlockIcon(p_147751_1_, renderer.blockAccess, p_147751_2_, p_147751_3_, p_147751_4_, 1));
			flag = true;
		}

		IIcon iicon;

		if (renderer.renderAllFaces || p_147751_1_.shouldSideBeRendered(renderer.blockAccess, p_147751_2_, p_147751_3_, p_147751_4_ - 1, 2))
		{
			if (renderer.renderMinZ <= 0.0D)
			{
				--p_147751_4_;
			}

			renderer.aoLightValueScratchXZNN = renderer.blockAccess.getBlock(p_147751_2_ - 1, p_147751_3_, p_147751_4_).getAmbientOcclusionLightValue();
			renderer.aoLightValueScratchYZNN = renderer.blockAccess.getBlock(p_147751_2_, p_147751_3_ - 1, p_147751_4_).getAmbientOcclusionLightValue();
			renderer.aoLightValueScratchYZPN = renderer.blockAccess.getBlock(p_147751_2_, p_147751_3_ + 1, p_147751_4_).getAmbientOcclusionLightValue();
			renderer.aoLightValueScratchXZPN = renderer.blockAccess.getBlock(p_147751_2_ + 1, p_147751_3_, p_147751_4_).getAmbientOcclusionLightValue();
			renderer.aoBrightnessXZNN = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_ - 1, p_147751_3_, p_147751_4_);
			renderer.aoBrightnessYZNN = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_, p_147751_3_ - 1, p_147751_4_);
			renderer.aoBrightnessYZPN = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_, p_147751_3_ + 1, p_147751_4_);
			renderer.aoBrightnessXZPN = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_ + 1, p_147751_3_, p_147751_4_);
			flag2 = renderer.blockAccess.getBlock(p_147751_2_ + 1, p_147751_3_, p_147751_4_ - 1).getCanBlockGrass();
			flag3 = renderer.blockAccess.getBlock(p_147751_2_ - 1, p_147751_3_, p_147751_4_ - 1).getCanBlockGrass();
			flag4 = renderer.blockAccess.getBlock(p_147751_2_, p_147751_3_ + 1, p_147751_4_ - 1).getCanBlockGrass();
			flag5 = renderer.blockAccess.getBlock(p_147751_2_, p_147751_3_ - 1, p_147751_4_ - 1).getCanBlockGrass();

			if (!flag3 && !flag5)
			{
				renderer.aoLightValueScratchXYZNNN = renderer.aoLightValueScratchXZNN;
				renderer.aoBrightnessXYZNNN = renderer.aoBrightnessXZNN;
			}
			else
			{
				renderer.aoLightValueScratchXYZNNN = renderer.blockAccess.getBlock(p_147751_2_ - 1, p_147751_3_ - 1, p_147751_4_).getAmbientOcclusionLightValue();
				renderer.aoBrightnessXYZNNN = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_ - 1, p_147751_3_ - 1, p_147751_4_);
			}

			if (!flag3 && !flag4)
			{
				renderer.aoLightValueScratchXYZNPN = renderer.aoLightValueScratchXZNN;
				renderer.aoBrightnessXYZNPN = renderer.aoBrightnessXZNN;
			}
			else
			{
				renderer.aoLightValueScratchXYZNPN = renderer.blockAccess.getBlock(p_147751_2_ - 1, p_147751_3_ + 1, p_147751_4_).getAmbientOcclusionLightValue();
				renderer.aoBrightnessXYZNPN = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_ - 1, p_147751_3_ + 1, p_147751_4_);
			}

			if (!flag2 && !flag5)
			{
				renderer.aoLightValueScratchXYZPNN = renderer.aoLightValueScratchXZPN;
				renderer.aoBrightnessXYZPNN = renderer.aoBrightnessXZPN;
			}
			else
			{
				renderer.aoLightValueScratchXYZPNN = renderer.blockAccess.getBlock(p_147751_2_ + 1, p_147751_3_ - 1, p_147751_4_).getAmbientOcclusionLightValue();
				renderer.aoBrightnessXYZPNN = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_ + 1, p_147751_3_ - 1, p_147751_4_);
			}

			if (!flag2 && !flag4)
			{
				renderer.aoLightValueScratchXYZPPN = renderer.aoLightValueScratchXZPN;
				renderer.aoBrightnessXYZPPN = renderer.aoBrightnessXZPN;
			}
			else
			{
				renderer.aoLightValueScratchXYZPPN = renderer.blockAccess.getBlock(p_147751_2_ + 1, p_147751_3_ + 1, p_147751_4_).getAmbientOcclusionLightValue();
				renderer.aoBrightnessXYZPPN = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_ + 1, p_147751_3_ + 1, p_147751_4_);
			}

			if (renderer.renderMinZ <= 0.0D)
			{
				++p_147751_4_;
			}

			i1 = l;

			if (renderer.renderMinZ <= 0.0D || !renderer.blockAccess.getBlock(p_147751_2_, p_147751_3_, p_147751_4_ - 1).isOpaqueCube())
			{
				i1 = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_, p_147751_3_, p_147751_4_ - 1);
			}

			f7 = renderer.blockAccess.getBlock(p_147751_2_, p_147751_3_, p_147751_4_ - 1).getAmbientOcclusionLightValue();
			f3 = (renderer.aoLightValueScratchXZNN + renderer.aoLightValueScratchXYZNPN + f7 + renderer.aoLightValueScratchYZPN) / 4.0F;
			f4 = (f7 + renderer.aoLightValueScratchYZPN + renderer.aoLightValueScratchXZPN + renderer.aoLightValueScratchXYZPPN) / 4.0F;
			f5 = (renderer.aoLightValueScratchYZNN + f7 + renderer.aoLightValueScratchXYZPNN + renderer.aoLightValueScratchXZPN) / 4.0F;
			f6 = (renderer.aoLightValueScratchXYZNNN + renderer.aoLightValueScratchXZNN + renderer.aoLightValueScratchYZNN + f7) / 4.0F;
			renderer.brightnessTopLeft = renderer.getAoBrightness(renderer.aoBrightnessXZNN, renderer.aoBrightnessXYZNPN, renderer.aoBrightnessYZPN, i1);
			renderer.brightnessBottomLeft = renderer.getAoBrightness(renderer.aoBrightnessYZPN, renderer.aoBrightnessXZPN, renderer.aoBrightnessXYZPPN, i1);
			renderer.brightnessBottomRight = renderer.getAoBrightness(renderer.aoBrightnessYZNN, renderer.aoBrightnessXYZPNN, renderer.aoBrightnessXZPN, i1);
			renderer.brightnessTopRight = renderer.getAoBrightness(renderer.aoBrightnessXYZNNN, renderer.aoBrightnessXZNN, renderer.aoBrightnessYZNN, i1);

			if (flag1)
			{
				renderer.colorRedTopLeft = renderer.colorRedBottomLeft = renderer.colorRedBottomRight = renderer.colorRedTopRight = p_147751_5_ * 0.8F;
				renderer.colorGreenTopLeft = renderer.colorGreenBottomLeft = renderer.colorGreenBottomRight = renderer.colorGreenTopRight = p_147751_6_ * 0.8F;
				renderer.colorBlueTopLeft = renderer.colorBlueBottomLeft = renderer.colorBlueBottomRight = renderer.colorBlueTopRight = p_147751_7_ * 0.8F;
			}
			else
			{
				renderer.colorRedTopLeft = renderer.colorRedBottomLeft = renderer.colorRedBottomRight = renderer.colorRedTopRight = 0.8F;
				renderer.colorGreenTopLeft = renderer.colorGreenBottomLeft = renderer.colorGreenBottomRight = renderer.colorGreenTopRight = 0.8F;
				renderer.colorBlueTopLeft = renderer.colorBlueBottomLeft = renderer.colorBlueBottomRight = renderer.colorBlueTopRight = 0.8F;
			}

			renderer.colorRedTopLeft *= f3;
			renderer.colorGreenTopLeft *= f3;
			renderer.colorBlueTopLeft *= f3;
			renderer.colorRedBottomLeft *= f4;
			renderer.colorGreenBottomLeft *= f4;
			renderer.colorBlueBottomLeft *= f4;
			renderer.colorRedBottomRight *= f5;
			renderer.colorGreenBottomRight *= f5;
			renderer.colorBlueBottomRight *= f5;
			renderer.colorRedTopRight *= f6;
			renderer.colorGreenTopRight *= f6;
			renderer.colorBlueTopRight *= f6;
			iicon = renderer.getBlockIcon(p_147751_1_, renderer.blockAccess, p_147751_2_, p_147751_3_, p_147751_4_, 2);
			renderFaceZNeg(renderer, p_147751_1_, p_147751_2_, p_147751_3_, p_147751_4_, iicon);

			if (RenderBlocks.fancyGrass && iicon.getIconName().equals("grass_side") && !renderer.hasOverrideBlockTexture())
			{
				renderer.colorRedTopLeft *= p_147751_5_;
				renderer.colorRedBottomLeft *= p_147751_5_;
				renderer.colorRedBottomRight *= p_147751_5_;
				renderer.colorRedTopRight *= p_147751_5_;
				renderer.colorGreenTopLeft *= p_147751_6_;
				renderer.colorGreenBottomLeft *= p_147751_6_;
				renderer.colorGreenBottomRight *= p_147751_6_;
				renderer.colorGreenTopRight *= p_147751_6_;
				renderer.colorBlueTopLeft *= p_147751_7_;
				renderer.colorBlueBottomLeft *= p_147751_7_;
				renderer.colorBlueBottomRight *= p_147751_7_;
				renderer.colorBlueTopRight *= p_147751_7_;
				renderFaceZNeg(renderer, p_147751_1_, p_147751_2_, p_147751_3_, p_147751_4_, BlockGrass.getIconSideOverlay());
			}

			flag = true;
		}

		if (renderer.renderAllFaces || p_147751_1_.shouldSideBeRendered(renderer.blockAccess, p_147751_2_, p_147751_3_, p_147751_4_ + 1, 3))
		{
			if (renderer.renderMaxZ >= 1.0D)
			{
				++p_147751_4_;
			}

			renderer.aoLightValueScratchXZNP = renderer.blockAccess.getBlock(p_147751_2_ - 1, p_147751_3_, p_147751_4_).getAmbientOcclusionLightValue();
			renderer.aoLightValueScratchXZPP = renderer.blockAccess.getBlock(p_147751_2_ + 1, p_147751_3_, p_147751_4_).getAmbientOcclusionLightValue();
			renderer.aoLightValueScratchYZNP = renderer.blockAccess.getBlock(p_147751_2_, p_147751_3_ - 1, p_147751_4_).getAmbientOcclusionLightValue();
			renderer.aoLightValueScratchYZPP = renderer.blockAccess.getBlock(p_147751_2_, p_147751_3_ + 1, p_147751_4_).getAmbientOcclusionLightValue();
			renderer.aoBrightnessXZNP = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_ - 1, p_147751_3_, p_147751_4_);
			renderer.aoBrightnessXZPP = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_ + 1, p_147751_3_, p_147751_4_);
			renderer.aoBrightnessYZNP = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_, p_147751_3_ - 1, p_147751_4_);
			renderer.aoBrightnessYZPP = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_, p_147751_3_ + 1, p_147751_4_);
			flag2 = renderer.blockAccess.getBlock(p_147751_2_ + 1, p_147751_3_, p_147751_4_ + 1).getCanBlockGrass();
			flag3 = renderer.blockAccess.getBlock(p_147751_2_ - 1, p_147751_3_, p_147751_4_ + 1).getCanBlockGrass();
			flag4 = renderer.blockAccess.getBlock(p_147751_2_, p_147751_3_ + 1, p_147751_4_ + 1).getCanBlockGrass();
			flag5 = renderer.blockAccess.getBlock(p_147751_2_, p_147751_3_ - 1, p_147751_4_ + 1).getCanBlockGrass();

			if (!flag3 && !flag5)
			{
				renderer.aoLightValueScratchXYZNNP = renderer.aoLightValueScratchXZNP;
				renderer.aoBrightnessXYZNNP = renderer.aoBrightnessXZNP;
			}
			else
			{
				renderer.aoLightValueScratchXYZNNP = renderer.blockAccess.getBlock(p_147751_2_ - 1, p_147751_3_ - 1, p_147751_4_).getAmbientOcclusionLightValue();
				renderer.aoBrightnessXYZNNP = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_ - 1, p_147751_3_ - 1, p_147751_4_);
			}

			if (!flag3 && !flag4)
			{
				renderer.aoLightValueScratchXYZNPP = renderer.aoLightValueScratchXZNP;
				renderer.aoBrightnessXYZNPP = renderer.aoBrightnessXZNP;
			}
			else
			{
				renderer.aoLightValueScratchXYZNPP = renderer.blockAccess.getBlock(p_147751_2_ - 1, p_147751_3_ + 1, p_147751_4_).getAmbientOcclusionLightValue();
				renderer.aoBrightnessXYZNPP = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_ - 1, p_147751_3_ + 1, p_147751_4_);
			}

			if (!flag2 && !flag5)
			{
				renderer.aoLightValueScratchXYZPNP = renderer.aoLightValueScratchXZPP;
				renderer.aoBrightnessXYZPNP = renderer.aoBrightnessXZPP;
			}
			else
			{
				renderer.aoLightValueScratchXYZPNP = renderer.blockAccess.getBlock(p_147751_2_ + 1, p_147751_3_ - 1, p_147751_4_).getAmbientOcclusionLightValue();
				renderer.aoBrightnessXYZPNP = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_ + 1, p_147751_3_ - 1, p_147751_4_);
			}

			if (!flag2 && !flag4)
			{
				renderer.aoLightValueScratchXYZPPP = renderer.aoLightValueScratchXZPP;
				renderer.aoBrightnessXYZPPP = renderer.aoBrightnessXZPP;
			}
			else
			{
				renderer.aoLightValueScratchXYZPPP = renderer.blockAccess.getBlock(p_147751_2_ + 1, p_147751_3_ + 1, p_147751_4_).getAmbientOcclusionLightValue();
				renderer.aoBrightnessXYZPPP = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_ + 1, p_147751_3_ + 1, p_147751_4_);
			}

			if (renderer.renderMaxZ >= 1.0D)
			{
				--p_147751_4_;
			}

			i1 = l;

			if (renderer.renderMaxZ >= 1.0D || !renderer.blockAccess.getBlock(p_147751_2_, p_147751_3_, p_147751_4_ + 1).isOpaqueCube())
			{
				i1 = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_, p_147751_3_, p_147751_4_ + 1);
			}

			f7 = renderer.blockAccess.getBlock(p_147751_2_, p_147751_3_, p_147751_4_ + 1).getAmbientOcclusionLightValue();
			f3 = (renderer.aoLightValueScratchXZNP + renderer.aoLightValueScratchXYZNPP + f7 + renderer.aoLightValueScratchYZPP) / 4.0F;
			f6 = (f7 + renderer.aoLightValueScratchYZPP + renderer.aoLightValueScratchXZPP + renderer.aoLightValueScratchXYZPPP) / 4.0F;
			f5 = (renderer.aoLightValueScratchYZNP + f7 + renderer.aoLightValueScratchXYZPNP + renderer.aoLightValueScratchXZPP) / 4.0F;
			f4 = (renderer.aoLightValueScratchXYZNNP + renderer.aoLightValueScratchXZNP + renderer.aoLightValueScratchYZNP + f7) / 4.0F;
			renderer.brightnessTopLeft = renderer.getAoBrightness(renderer.aoBrightnessXZNP, renderer.aoBrightnessXYZNPP, renderer.aoBrightnessYZPP, i1);
			renderer.brightnessTopRight = renderer.getAoBrightness(renderer.aoBrightnessYZPP, renderer.aoBrightnessXZPP, renderer.aoBrightnessXYZPPP, i1);
			renderer.brightnessBottomRight = renderer.getAoBrightness(renderer.aoBrightnessYZNP, renderer.aoBrightnessXYZPNP, renderer.aoBrightnessXZPP, i1);
			renderer.brightnessBottomLeft = renderer.getAoBrightness(renderer.aoBrightnessXYZNNP, renderer.aoBrightnessXZNP, renderer.aoBrightnessYZNP, i1);

			if (flag1)
			{
				renderer.colorRedTopLeft = renderer.colorRedBottomLeft = renderer.colorRedBottomRight = renderer.colorRedTopRight = p_147751_5_ * 0.8F;
				renderer.colorGreenTopLeft = renderer.colorGreenBottomLeft = renderer.colorGreenBottomRight = renderer.colorGreenTopRight = p_147751_6_ * 0.8F;
				renderer.colorBlueTopLeft = renderer.colorBlueBottomLeft = renderer.colorBlueBottomRight = renderer.colorBlueTopRight = p_147751_7_ * 0.8F;
			}
			else
			{
				renderer.colorRedTopLeft = renderer.colorRedBottomLeft = renderer.colorRedBottomRight = renderer.colorRedTopRight = 0.8F;
				renderer.colorGreenTopLeft = renderer.colorGreenBottomLeft = renderer.colorGreenBottomRight = renderer.colorGreenTopRight = 0.8F;
				renderer.colorBlueTopLeft = renderer.colorBlueBottomLeft = renderer.colorBlueBottomRight = renderer.colorBlueTopRight = 0.8F;
			}

			renderer.colorRedTopLeft *= f3;
			renderer.colorGreenTopLeft *= f3;
			renderer.colorBlueTopLeft *= f3;
			renderer.colorRedBottomLeft *= f4;
			renderer.colorGreenBottomLeft *= f4;
			renderer.colorBlueBottomLeft *= f4;
			renderer.colorRedBottomRight *= f5;
			renderer.colorGreenBottomRight *= f5;
			renderer.colorBlueBottomRight *= f5;
			renderer.colorRedTopRight *= f6;
			renderer.colorGreenTopRight *= f6;
			renderer.colorBlueTopRight *= f6;
			iicon = renderer.getBlockIcon(p_147751_1_, renderer.blockAccess, p_147751_2_, p_147751_3_, p_147751_4_, 3);
			renderFaceZPos(renderer, p_147751_1_, p_147751_2_, p_147751_3_, p_147751_4_, renderer.getBlockIcon(p_147751_1_, renderer.blockAccess, p_147751_2_, p_147751_3_, p_147751_4_, 3));

			flag = true;
		}

		if (renderer.renderAllFaces || p_147751_1_.shouldSideBeRendered(renderer.blockAccess, p_147751_2_ - 1, p_147751_3_, p_147751_4_, 4))
		{
			if (renderer.renderMinX <= 0.0D)
			{
				--p_147751_2_;
			}

			renderer.aoLightValueScratchXYNN = renderer.blockAccess.getBlock(p_147751_2_, p_147751_3_ - 1, p_147751_4_).getAmbientOcclusionLightValue();
			renderer.aoLightValueScratchXZNN = renderer.blockAccess.getBlock(p_147751_2_, p_147751_3_, p_147751_4_ - 1).getAmbientOcclusionLightValue();
			renderer.aoLightValueScratchXZNP = renderer.blockAccess.getBlock(p_147751_2_, p_147751_3_, p_147751_4_ + 1).getAmbientOcclusionLightValue();
			renderer.aoLightValueScratchXYNP = renderer.blockAccess.getBlock(p_147751_2_, p_147751_3_ + 1, p_147751_4_).getAmbientOcclusionLightValue();
			renderer.aoBrightnessXYNN = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_, p_147751_3_ - 1, p_147751_4_);
			renderer.aoBrightnessXZNN = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_, p_147751_3_, p_147751_4_ - 1);
			renderer.aoBrightnessXZNP = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_, p_147751_3_, p_147751_4_ + 1);
			renderer.aoBrightnessXYNP = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_, p_147751_3_ + 1, p_147751_4_);
			flag2 = renderer.blockAccess.getBlock(p_147751_2_ - 1, p_147751_3_ + 1, p_147751_4_).getCanBlockGrass();
			flag3 = renderer.blockAccess.getBlock(p_147751_2_ - 1, p_147751_3_ - 1, p_147751_4_).getCanBlockGrass();
			flag4 = renderer.blockAccess.getBlock(p_147751_2_ - 1, p_147751_3_, p_147751_4_ - 1).getCanBlockGrass();
			flag5 = renderer.blockAccess.getBlock(p_147751_2_ - 1, p_147751_3_, p_147751_4_ + 1).getCanBlockGrass();

			if (!flag4 && !flag3)
			{
				renderer.aoLightValueScratchXYZNNN = renderer.aoLightValueScratchXZNN;
				renderer.aoBrightnessXYZNNN = renderer.aoBrightnessXZNN;
			}
			else
			{
				renderer.aoLightValueScratchXYZNNN = renderer.blockAccess.getBlock(p_147751_2_, p_147751_3_ - 1, p_147751_4_ - 1).getAmbientOcclusionLightValue();
				renderer.aoBrightnessXYZNNN = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_, p_147751_3_ - 1, p_147751_4_ - 1);
			}

			if (!flag5 && !flag3)
			{
				renderer.aoLightValueScratchXYZNNP = renderer.aoLightValueScratchXZNP;
				renderer.aoBrightnessXYZNNP = renderer.aoBrightnessXZNP;
			}
			else
			{
				renderer.aoLightValueScratchXYZNNP = renderer.blockAccess.getBlock(p_147751_2_, p_147751_3_ - 1, p_147751_4_ + 1).getAmbientOcclusionLightValue();
				renderer.aoBrightnessXYZNNP = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_, p_147751_3_ - 1, p_147751_4_ + 1);
			}

			if (!flag4 && !flag2)
			{
				renderer.aoLightValueScratchXYZNPN = renderer.aoLightValueScratchXZNN;
				renderer.aoBrightnessXYZNPN = renderer.aoBrightnessXZNN;
			}
			else
			{
				renderer.aoLightValueScratchXYZNPN = renderer.blockAccess.getBlock(p_147751_2_, p_147751_3_ + 1, p_147751_4_ - 1).getAmbientOcclusionLightValue();
				renderer.aoBrightnessXYZNPN = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_, p_147751_3_ + 1, p_147751_4_ - 1);
			}

			if (!flag5 && !flag2)
			{
				renderer.aoLightValueScratchXYZNPP = renderer.aoLightValueScratchXZNP;
				renderer.aoBrightnessXYZNPP = renderer.aoBrightnessXZNP;
			}
			else
			{
				renderer.aoLightValueScratchXYZNPP = renderer.blockAccess.getBlock(p_147751_2_, p_147751_3_ + 1, p_147751_4_ + 1).getAmbientOcclusionLightValue();
				renderer.aoBrightnessXYZNPP = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_, p_147751_3_ + 1, p_147751_4_ + 1);
			}

			if (renderer.renderMinX <= 0.0D)
			{
				++p_147751_2_;
			}

			i1 = l;

			if (renderer.renderMinX <= 0.0D || !renderer.blockAccess.getBlock(p_147751_2_ - 1, p_147751_3_, p_147751_4_).isOpaqueCube())
			{
				i1 = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_ - 1, p_147751_3_, p_147751_4_);
			}

			f7 = renderer.blockAccess.getBlock(p_147751_2_ - 1, p_147751_3_, p_147751_4_).getAmbientOcclusionLightValue();
			f6 = (renderer.aoLightValueScratchXYNN + renderer.aoLightValueScratchXYZNNP + f7 + renderer.aoLightValueScratchXZNP) / 4.0F;
			f3 = (f7 + renderer.aoLightValueScratchXZNP + renderer.aoLightValueScratchXYNP + renderer.aoLightValueScratchXYZNPP) / 4.0F;
			f4 = (renderer.aoLightValueScratchXZNN + f7 + renderer.aoLightValueScratchXYZNPN + renderer.aoLightValueScratchXYNP) / 4.0F;
			f5 = (renderer.aoLightValueScratchXYZNNN + renderer.aoLightValueScratchXYNN + renderer.aoLightValueScratchXZNN + f7) / 4.0F;
			renderer.brightnessTopRight = renderer.getAoBrightness(renderer.aoBrightnessXYNN, renderer.aoBrightnessXYZNNP, renderer.aoBrightnessXZNP, i1);
			renderer.brightnessTopLeft = renderer.getAoBrightness(renderer.aoBrightnessXZNP, renderer.aoBrightnessXYNP, renderer.aoBrightnessXYZNPP, i1);
			renderer.brightnessBottomLeft = renderer.getAoBrightness(renderer.aoBrightnessXZNN, renderer.aoBrightnessXYZNPN, renderer.aoBrightnessXYNP, i1);
			renderer.brightnessBottomRight = renderer.getAoBrightness(renderer.aoBrightnessXYZNNN, renderer.aoBrightnessXYNN, renderer.aoBrightnessXZNN, i1);

			if (flag1)
			{
				renderer.colorRedTopLeft = renderer.colorRedBottomLeft = renderer.colorRedBottomRight = renderer.colorRedTopRight = p_147751_5_ * 0.6F;
				renderer.colorGreenTopLeft = renderer.colorGreenBottomLeft = renderer.colorGreenBottomRight = renderer.colorGreenTopRight = p_147751_6_ * 0.6F;
				renderer.colorBlueTopLeft = renderer.colorBlueBottomLeft = renderer.colorBlueBottomRight = renderer.colorBlueTopRight = p_147751_7_ * 0.6F;
			}
			else
			{
				renderer.colorRedTopLeft = renderer.colorRedBottomLeft = renderer.colorRedBottomRight = renderer.colorRedTopRight = 0.6F;
				renderer.colorGreenTopLeft = renderer.colorGreenBottomLeft = renderer.colorGreenBottomRight = renderer.colorGreenTopRight = 0.6F;
				renderer.colorBlueTopLeft = renderer.colorBlueBottomLeft = renderer.colorBlueBottomRight = renderer.colorBlueTopRight = 0.6F;
			}

			renderer.colorRedTopLeft *= f3;
			renderer.colorGreenTopLeft *= f3;
			renderer.colorBlueTopLeft *= f3;
			renderer.colorRedBottomLeft *= f4;
			renderer.colorGreenBottomLeft *= f4;
			renderer.colorBlueBottomLeft *= f4;
			renderer.colorRedBottomRight *= f5;
			renderer.colorGreenBottomRight *= f5;
			renderer.colorBlueBottomRight *= f5;
			renderer.colorRedTopRight *= f6;
			renderer.colorGreenTopRight *= f6;
			renderer.colorBlueTopRight *= f6;
			iicon = renderer.getBlockIcon(p_147751_1_, renderer.blockAccess, p_147751_2_, p_147751_3_, p_147751_4_, 4);
			renderFaceXNeg(renderer, p_147751_1_, p_147751_2_, p_147751_3_, p_147751_4_, iicon);

			flag = true;
		}

		if (renderer.renderAllFaces || p_147751_1_.shouldSideBeRendered(renderer.blockAccess, p_147751_2_ + 1, p_147751_3_, p_147751_4_, 5))
		{
			if (renderer.renderMaxX >= 1.0D)
			{
				++p_147751_2_;
			}

			renderer.aoLightValueScratchXYPN = renderer.blockAccess.getBlock(p_147751_2_, p_147751_3_ - 1, p_147751_4_).getAmbientOcclusionLightValue();
			renderer.aoLightValueScratchXZPN = renderer.blockAccess.getBlock(p_147751_2_, p_147751_3_, p_147751_4_ - 1).getAmbientOcclusionLightValue();
			renderer.aoLightValueScratchXZPP = renderer.blockAccess.getBlock(p_147751_2_, p_147751_3_, p_147751_4_ + 1).getAmbientOcclusionLightValue();
			renderer.aoLightValueScratchXYPP = renderer.blockAccess.getBlock(p_147751_2_, p_147751_3_ + 1, p_147751_4_).getAmbientOcclusionLightValue();
			renderer.aoBrightnessXYPN = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_, p_147751_3_ - 1, p_147751_4_);
			renderer.aoBrightnessXZPN = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_, p_147751_3_, p_147751_4_ - 1);
			renderer.aoBrightnessXZPP = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_, p_147751_3_, p_147751_4_ + 1);
			renderer.aoBrightnessXYPP = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_, p_147751_3_ + 1, p_147751_4_);
			flag2 = renderer.blockAccess.getBlock(p_147751_2_ + 1, p_147751_3_ + 1, p_147751_4_).getCanBlockGrass();
			flag3 = renderer.blockAccess.getBlock(p_147751_2_ + 1, p_147751_3_ - 1, p_147751_4_).getCanBlockGrass();
			flag4 = renderer.blockAccess.getBlock(p_147751_2_ + 1, p_147751_3_, p_147751_4_ + 1).getCanBlockGrass();
			flag5 = renderer.blockAccess.getBlock(p_147751_2_ + 1, p_147751_3_, p_147751_4_ - 1).getCanBlockGrass();

			if (!flag3 && !flag5)
			{
				renderer.aoLightValueScratchXYZPNN = renderer.aoLightValueScratchXZPN;
				renderer.aoBrightnessXYZPNN = renderer.aoBrightnessXZPN;
			}
			else
			{
				renderer.aoLightValueScratchXYZPNN = renderer.blockAccess.getBlock(p_147751_2_, p_147751_3_ - 1, p_147751_4_ - 1).getAmbientOcclusionLightValue();
				renderer.aoBrightnessXYZPNN = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_, p_147751_3_ - 1, p_147751_4_ - 1);
			}

			if (!flag3 && !flag4)
			{
				renderer.aoLightValueScratchXYZPNP = renderer.aoLightValueScratchXZPP;
				renderer.aoBrightnessXYZPNP = renderer.aoBrightnessXZPP;
			}
			else
			{
				renderer.aoLightValueScratchXYZPNP = renderer.blockAccess.getBlock(p_147751_2_, p_147751_3_ - 1, p_147751_4_ + 1).getAmbientOcclusionLightValue();
				renderer.aoBrightnessXYZPNP = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_, p_147751_3_ - 1, p_147751_4_ + 1);
			}

			if (!flag2 && !flag5)
			{
				renderer.aoLightValueScratchXYZPPN = renderer.aoLightValueScratchXZPN;
				renderer.aoBrightnessXYZPPN = renderer.aoBrightnessXZPN;
			}
			else
			{
				renderer.aoLightValueScratchXYZPPN = renderer.blockAccess.getBlock(p_147751_2_, p_147751_3_ + 1, p_147751_4_ - 1).getAmbientOcclusionLightValue();
				renderer.aoBrightnessXYZPPN = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_, p_147751_3_ + 1, p_147751_4_ - 1);
			}

			if (!flag2 && !flag4)
			{
				renderer.aoLightValueScratchXYZPPP = renderer.aoLightValueScratchXZPP;
				renderer.aoBrightnessXYZPPP = renderer.aoBrightnessXZPP;
			}
			else
			{
				renderer.aoLightValueScratchXYZPPP = renderer.blockAccess.getBlock(p_147751_2_, p_147751_3_ + 1, p_147751_4_ + 1).getAmbientOcclusionLightValue();
				renderer.aoBrightnessXYZPPP = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_, p_147751_3_ + 1, p_147751_4_ + 1);
			}

			if (renderer.renderMaxX >= 1.0D)
			{
				--p_147751_2_;
			}

			i1 = l;

			if (renderer.renderMaxX >= 1.0D || !renderer.blockAccess.getBlock(p_147751_2_ + 1, p_147751_3_, p_147751_4_).isOpaqueCube())
			{
				i1 = p_147751_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147751_2_ + 1, p_147751_3_, p_147751_4_);
			}

			f7 = renderer.blockAccess.getBlock(p_147751_2_ + 1, p_147751_3_, p_147751_4_).getAmbientOcclusionLightValue();
			f3 = (renderer.aoLightValueScratchXYPN + renderer.aoLightValueScratchXYZPNP + f7 + renderer.aoLightValueScratchXZPP) / 4.0F;
			f4 = (renderer.aoLightValueScratchXYZPNN + renderer.aoLightValueScratchXYPN + renderer.aoLightValueScratchXZPN + f7) / 4.0F;
			f5 = (renderer.aoLightValueScratchXZPN + f7 + renderer.aoLightValueScratchXYZPPN + renderer.aoLightValueScratchXYPP) / 4.0F;
			f6 = (f7 + renderer.aoLightValueScratchXZPP + renderer.aoLightValueScratchXYPP + renderer.aoLightValueScratchXYZPPP) / 4.0F;
			renderer.brightnessTopLeft = renderer.getAoBrightness(renderer.aoBrightnessXYPN, renderer.aoBrightnessXYZPNP, renderer.aoBrightnessXZPP, i1);
			renderer.brightnessTopRight = renderer.getAoBrightness(renderer.aoBrightnessXZPP, renderer.aoBrightnessXYPP, renderer.aoBrightnessXYZPPP, i1);
			renderer.brightnessBottomRight = renderer.getAoBrightness(renderer.aoBrightnessXZPN, renderer.aoBrightnessXYZPPN, renderer.aoBrightnessXYPP, i1);
			renderer.brightnessBottomLeft = renderer.getAoBrightness(renderer.aoBrightnessXYZPNN, renderer.aoBrightnessXYPN, renderer.aoBrightnessXZPN, i1);

			if (flag1)
			{
				renderer.colorRedTopLeft = renderer.colorRedBottomLeft = renderer.colorRedBottomRight = renderer.colorRedTopRight = p_147751_5_ * 0.6F;
				renderer.colorGreenTopLeft = renderer.colorGreenBottomLeft = renderer.colorGreenBottomRight = renderer.colorGreenTopRight = p_147751_6_ * 0.6F;
				renderer.colorBlueTopLeft = renderer.colorBlueBottomLeft = renderer.colorBlueBottomRight = renderer.colorBlueTopRight = p_147751_7_ * 0.6F;
			}
			else
			{
				renderer.colorRedTopLeft = renderer.colorRedBottomLeft = renderer.colorRedBottomRight = renderer.colorRedTopRight = 0.6F;
				renderer.colorGreenTopLeft = renderer.colorGreenBottomLeft = renderer.colorGreenBottomRight = renderer.colorGreenTopRight = 0.6F;
				renderer.colorBlueTopLeft = renderer.colorBlueBottomLeft = renderer.colorBlueBottomRight = renderer.colorBlueTopRight = 0.6F;
			}

			renderer.colorRedTopLeft *= f3;
			renderer.colorGreenTopLeft *= f3;
			renderer.colorBlueTopLeft *= f3;
			renderer.colorRedBottomLeft *= f4;
			renderer.colorGreenBottomLeft *= f4;
			renderer.colorBlueBottomLeft *= f4;
			renderer.colorRedBottomRight *= f5;
			renderer.colorGreenBottomRight *= f5;
			renderer.colorBlueBottomRight *= f5;
			renderer.colorRedTopRight *= f6;
			renderer.colorGreenTopRight *= f6;
			renderer.colorBlueTopRight *= f6;
			iicon = renderer.getBlockIcon(p_147751_1_, renderer.blockAccess, p_147751_2_, p_147751_3_, p_147751_4_, 5);
			renderFaceXPos(renderer, p_147751_1_, p_147751_2_, p_147751_3_, p_147751_4_, iicon);

			flag = true;
		}

		renderer.enableAO = false;
		return flag;
	}

	/**
	 * Renders non-full-cube block with ambient occusion.  Args: block, x, y, z, red, green, blue (lighting)
	 */
	public boolean renderStandardBlockWithAmbientOcclusionPartial(RenderBlocks renderer, Block p_147808_1_, int p_147808_2_, int p_147808_3_, int p_147808_4_, float p_147808_5_, float p_147808_6_, float p_147808_7_)
	{
		renderer.enableAO = true;
		boolean flag = false;
		float f3 = 0.0F;
		float f4 = 0.0F;
		float f5 = 0.0F;
		float f6 = 0.0F;
		boolean flag1 = true;
		int l = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_, p_147808_3_, p_147808_4_);
		Tessellator tessellator = Tessellator.instance;
		tessellator.setBrightness(983055);

		if (renderer.getBlockIcon(p_147808_1_).getIconName().equals("grass_top"))
		{
			flag1 = false;
		}
		else if (renderer.hasOverrideBlockTexture())
		{
			flag1 = false;
		}

		boolean flag2;
		boolean flag3;
		boolean flag4;
		boolean flag5;
		int i1;
		float f7;

		if (renderer.renderAllFaces || p_147808_1_.shouldSideBeRendered(renderer.blockAccess, p_147808_2_, p_147808_3_ - 1, p_147808_4_, 0))
		{
			if (renderer.renderMinY <= 0.0D)
			{
				--p_147808_3_;
			}

			renderer.aoBrightnessXYNN = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_ - 1, p_147808_3_, p_147808_4_);
			renderer.aoBrightnessYZNN = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_, p_147808_3_, p_147808_4_ - 1);
			renderer.aoBrightnessYZNP = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_, p_147808_3_, p_147808_4_ + 1);
			renderer.aoBrightnessXYPN = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_ + 1, p_147808_3_, p_147808_4_);
			renderer.aoLightValueScratchXYNN = renderer.blockAccess.getBlock(p_147808_2_ - 1, p_147808_3_, p_147808_4_).getAmbientOcclusionLightValue();
			renderer.aoLightValueScratchYZNN = renderer.blockAccess.getBlock(p_147808_2_, p_147808_3_, p_147808_4_ - 1).getAmbientOcclusionLightValue();
			renderer.aoLightValueScratchYZNP = renderer.blockAccess.getBlock(p_147808_2_, p_147808_3_, p_147808_4_ + 1).getAmbientOcclusionLightValue();
			renderer.aoLightValueScratchXYPN = renderer.blockAccess.getBlock(p_147808_2_ + 1, p_147808_3_, p_147808_4_).getAmbientOcclusionLightValue();
			flag2 = renderer.blockAccess.getBlock(p_147808_2_ + 1, p_147808_3_ - 1, p_147808_4_).getCanBlockGrass();
			flag3 = renderer.blockAccess.getBlock(p_147808_2_ - 1, p_147808_3_ - 1, p_147808_4_).getCanBlockGrass();
			flag4 = renderer.blockAccess.getBlock(p_147808_2_, p_147808_3_ - 1, p_147808_4_ + 1).getCanBlockGrass();
			flag5 = renderer.blockAccess.getBlock(p_147808_2_, p_147808_3_ - 1, p_147808_4_ - 1).getCanBlockGrass();

			if (!flag5 && !flag3)
			{
				renderer.aoLightValueScratchXYZNNN = renderer.aoLightValueScratchXYNN;
				renderer.aoBrightnessXYZNNN = renderer.aoBrightnessXYNN;
			}
			else
			{
				renderer.aoLightValueScratchXYZNNN = renderer.blockAccess.getBlock(p_147808_2_ - 1, p_147808_3_, p_147808_4_ - 1).getAmbientOcclusionLightValue();
				renderer.aoBrightnessXYZNNN = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_ - 1, p_147808_3_, p_147808_4_ - 1);
			}

			if (!flag4 && !flag3)
			{
				renderer.aoLightValueScratchXYZNNP = renderer.aoLightValueScratchXYNN;
				renderer.aoBrightnessXYZNNP = renderer.aoBrightnessXYNN;
			}
			else
			{
				renderer.aoLightValueScratchXYZNNP = renderer.blockAccess.getBlock(p_147808_2_ - 1, p_147808_3_, p_147808_4_ + 1).getAmbientOcclusionLightValue();
				renderer.aoBrightnessXYZNNP = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_ - 1, p_147808_3_, p_147808_4_ + 1);
			}

			if (!flag5 && !flag2)
			{
				renderer.aoLightValueScratchXYZPNN = renderer.aoLightValueScratchXYPN;
				renderer.aoBrightnessXYZPNN = renderer.aoBrightnessXYPN;
			}
			else
			{
				renderer.aoLightValueScratchXYZPNN = renderer.blockAccess.getBlock(p_147808_2_ + 1, p_147808_3_, p_147808_4_ - 1).getAmbientOcclusionLightValue();
				renderer.aoBrightnessXYZPNN = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_ + 1, p_147808_3_, p_147808_4_ - 1);
			}

			if (!flag4 && !flag2)
			{
				renderer.aoLightValueScratchXYZPNP = renderer.aoLightValueScratchXYPN;
				renderer.aoBrightnessXYZPNP = renderer.aoBrightnessXYPN;
			}
			else
			{
				renderer.aoLightValueScratchXYZPNP = renderer.blockAccess.getBlock(p_147808_2_ + 1, p_147808_3_, p_147808_4_ + 1).getAmbientOcclusionLightValue();
				renderer.aoBrightnessXYZPNP = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_ + 1, p_147808_3_, p_147808_4_ + 1);
			}

			if (renderer.renderMinY <= 0.0D)
			{
				++p_147808_3_;
			}

			i1 = l;

			if (renderer.renderMinY <= 0.0D || !renderer.blockAccess.getBlock(p_147808_2_, p_147808_3_ - 1, p_147808_4_).isOpaqueCube())
			{
				i1 = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_, p_147808_3_ - 1, p_147808_4_);
			}

			f7 = renderer.blockAccess.getBlock(p_147808_2_, p_147808_3_ - 1, p_147808_4_).getAmbientOcclusionLightValue();
			f3 = (renderer.aoLightValueScratchXYZNNP + renderer.aoLightValueScratchXYNN + renderer.aoLightValueScratchYZNP + f7) / 4.0F;
			f6 = (renderer.aoLightValueScratchYZNP + f7 + renderer.aoLightValueScratchXYZPNP + renderer.aoLightValueScratchXYPN) / 4.0F;
			f5 = (f7 + renderer.aoLightValueScratchYZNN + renderer.aoLightValueScratchXYPN + renderer.aoLightValueScratchXYZPNN) / 4.0F;
			f4 = (renderer.aoLightValueScratchXYNN + renderer.aoLightValueScratchXYZNNN + f7 + renderer.aoLightValueScratchYZNN) / 4.0F;
			renderer.brightnessTopLeft = renderer.getAoBrightness(renderer.aoBrightnessXYZNNP, renderer.aoBrightnessXYNN, renderer.aoBrightnessYZNP, i1);
			renderer.brightnessTopRight = renderer.getAoBrightness(renderer.aoBrightnessYZNP, renderer.aoBrightnessXYZPNP, renderer.aoBrightnessXYPN, i1);
			renderer.brightnessBottomRight = renderer.getAoBrightness(renderer.aoBrightnessYZNN, renderer.aoBrightnessXYPN, renderer.aoBrightnessXYZPNN, i1);
			renderer.brightnessBottomLeft = renderer.getAoBrightness(renderer.aoBrightnessXYNN, renderer.aoBrightnessXYZNNN, renderer.aoBrightnessYZNN, i1);

			if (flag1)
			{
				renderer.colorRedTopLeft = renderer.colorRedBottomLeft = renderer.colorRedBottomRight = renderer.colorRedTopRight = p_147808_5_ * 0.5F;
				renderer.colorGreenTopLeft = renderer.colorGreenBottomLeft = renderer.colorGreenBottomRight = renderer.colorGreenTopRight = p_147808_6_ * 0.5F;
				renderer.colorBlueTopLeft = renderer.colorBlueBottomLeft = renderer.colorBlueBottomRight = renderer.colorBlueTopRight = p_147808_7_ * 0.5F;
			}
			else
			{
				renderer.colorRedTopLeft = renderer.colorRedBottomLeft = renderer.colorRedBottomRight = renderer.colorRedTopRight = 0.5F;
				renderer.colorGreenTopLeft = renderer.colorGreenBottomLeft = renderer.colorGreenBottomRight = renderer.colorGreenTopRight = 0.5F;
				renderer.colorBlueTopLeft = renderer.colorBlueBottomLeft = renderer.colorBlueBottomRight = renderer.colorBlueTopRight = 0.5F;
			}

			renderer.colorRedTopLeft *= f3;
			renderer.colorGreenTopLeft *= f3;
			renderer.colorBlueTopLeft *= f3;
			renderer.colorRedBottomLeft *= f4;
			renderer.colorGreenBottomLeft *= f4;
			renderer.colorBlueBottomLeft *= f4;
			renderer.colorRedBottomRight *= f5;
			renderer.colorGreenBottomRight *= f5;
			renderer.colorBlueBottomRight *= f5;
			renderer.colorRedTopRight *= f6;
			renderer.colorGreenTopRight *= f6;
			renderer.colorBlueTopRight *= f6;
			
			renderFaceYNeg(renderer, p_147808_1_, p_147808_2_, p_147808_3_, p_147808_4_, renderer.getBlockIcon(p_147808_1_, renderer.blockAccess, p_147808_2_, p_147808_3_, p_147808_4_, 0));
			
			flag = true;
		}

		if (renderer.renderAllFaces || p_147808_1_.shouldSideBeRendered(renderer.blockAccess, p_147808_2_, p_147808_3_ + 1, p_147808_4_, 1))
		{
			if (renderer.renderMaxY >= 1.0D)
			{
				++p_147808_3_;
			}

			renderer.aoBrightnessXYNP = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_ - 1, p_147808_3_, p_147808_4_);
			renderer.aoBrightnessXYPP = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_ + 1, p_147808_3_, p_147808_4_);
			renderer.aoBrightnessYZPN = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_, p_147808_3_, p_147808_4_ - 1);
			renderer.aoBrightnessYZPP = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_, p_147808_3_, p_147808_4_ + 1);
			renderer.aoLightValueScratchXYNP = renderer.blockAccess.getBlock(p_147808_2_ - 1, p_147808_3_, p_147808_4_).getAmbientOcclusionLightValue();
			renderer.aoLightValueScratchXYPP = renderer.blockAccess.getBlock(p_147808_2_ + 1, p_147808_3_, p_147808_4_).getAmbientOcclusionLightValue();
			renderer.aoLightValueScratchYZPN = renderer.blockAccess.getBlock(p_147808_2_, p_147808_3_, p_147808_4_ - 1).getAmbientOcclusionLightValue();
			renderer.aoLightValueScratchYZPP = renderer.blockAccess.getBlock(p_147808_2_, p_147808_3_, p_147808_4_ + 1).getAmbientOcclusionLightValue();
			flag2 = renderer.blockAccess.getBlock(p_147808_2_ + 1, p_147808_3_ + 1, p_147808_4_).getCanBlockGrass();
			flag3 = renderer.blockAccess.getBlock(p_147808_2_ - 1, p_147808_3_ + 1, p_147808_4_).getCanBlockGrass();
			flag4 = renderer.blockAccess.getBlock(p_147808_2_, p_147808_3_ + 1, p_147808_4_ + 1).getCanBlockGrass();
			flag5 = renderer.blockAccess.getBlock(p_147808_2_, p_147808_3_ + 1, p_147808_4_ - 1).getCanBlockGrass();

			if (!flag5 && !flag3)
			{
				renderer.aoLightValueScratchXYZNPN = renderer.aoLightValueScratchXYNP;
				renderer.aoBrightnessXYZNPN = renderer.aoBrightnessXYNP;
			}
			else
			{
				renderer.aoLightValueScratchXYZNPN = renderer.blockAccess.getBlock(p_147808_2_ - 1, p_147808_3_, p_147808_4_ - 1).getAmbientOcclusionLightValue();
				renderer.aoBrightnessXYZNPN = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_ - 1, p_147808_3_, p_147808_4_ - 1);
			}

			if (!flag5 && !flag2)
			{
				renderer.aoLightValueScratchXYZPPN = renderer.aoLightValueScratchXYPP;
				renderer.aoBrightnessXYZPPN = renderer.aoBrightnessXYPP;
			}
			else
			{
				renderer.aoLightValueScratchXYZPPN = renderer.blockAccess.getBlock(p_147808_2_ + 1, p_147808_3_, p_147808_4_ - 1).getAmbientOcclusionLightValue();
				renderer.aoBrightnessXYZPPN = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_ + 1, p_147808_3_, p_147808_4_ - 1);
			}

			if (!flag4 && !flag3)
			{
				renderer.aoLightValueScratchXYZNPP = renderer.aoLightValueScratchXYNP;
				renderer.aoBrightnessXYZNPP = renderer.aoBrightnessXYNP;
			}
			else
			{
				renderer.aoLightValueScratchXYZNPP = renderer.blockAccess.getBlock(p_147808_2_ - 1, p_147808_3_, p_147808_4_ + 1).getAmbientOcclusionLightValue();
				renderer.aoBrightnessXYZNPP = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_ - 1, p_147808_3_, p_147808_4_ + 1);
			}

			if (!flag4 && !flag2)
			{
				renderer.aoLightValueScratchXYZPPP = renderer.aoLightValueScratchXYPP;
				renderer.aoBrightnessXYZPPP = renderer.aoBrightnessXYPP;
			}
			else
			{
				renderer.aoLightValueScratchXYZPPP = renderer.blockAccess.getBlock(p_147808_2_ + 1, p_147808_3_, p_147808_4_ + 1).getAmbientOcclusionLightValue();
				renderer.aoBrightnessXYZPPP = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_ + 1, p_147808_3_, p_147808_4_ + 1);
			}

			if (renderer.renderMaxY >= 1.0D)
			{
				--p_147808_3_;
			}

			i1 = l;

			if (renderer.renderMaxY >= 1.0D || !renderer.blockAccess.getBlock(p_147808_2_, p_147808_3_ + 1, p_147808_4_).isOpaqueCube())
			{
				i1 = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_, p_147808_3_ + 1, p_147808_4_);
			}

			f7 = renderer.blockAccess.getBlock(p_147808_2_, p_147808_3_ + 1, p_147808_4_).getAmbientOcclusionLightValue();
			f6 = (renderer.aoLightValueScratchXYZNPP + renderer.aoLightValueScratchXYNP + renderer.aoLightValueScratchYZPP + f7) / 4.0F;
			f3 = (renderer.aoLightValueScratchYZPP + f7 + renderer.aoLightValueScratchXYZPPP + renderer.aoLightValueScratchXYPP) / 4.0F;
			f4 = (f7 + renderer.aoLightValueScratchYZPN + renderer.aoLightValueScratchXYPP + renderer.aoLightValueScratchXYZPPN) / 4.0F;
			f5 = (renderer.aoLightValueScratchXYNP + renderer.aoLightValueScratchXYZNPN + f7 + renderer.aoLightValueScratchYZPN) / 4.0F;
			renderer.brightnessTopRight = renderer.getAoBrightness(renderer.aoBrightnessXYZNPP, renderer.aoBrightnessXYNP, renderer.aoBrightnessYZPP, i1);
			renderer.brightnessTopLeft = renderer.getAoBrightness(renderer.aoBrightnessYZPP, renderer.aoBrightnessXYZPPP, renderer.aoBrightnessXYPP, i1);
			renderer.brightnessBottomLeft = renderer.getAoBrightness(renderer.aoBrightnessYZPN, renderer.aoBrightnessXYPP, renderer.aoBrightnessXYZPPN, i1);
			renderer.brightnessBottomRight = renderer.getAoBrightness(renderer.aoBrightnessXYNP, renderer.aoBrightnessXYZNPN, renderer.aoBrightnessYZPN, i1);
			renderer.colorRedTopLeft = renderer.colorRedBottomLeft = renderer.colorRedBottomRight = renderer.colorRedTopRight = p_147808_5_;
			renderer.colorGreenTopLeft = renderer.colorGreenBottomLeft = renderer.colorGreenBottomRight = renderer.colorGreenTopRight = p_147808_6_;
			renderer.colorBlueTopLeft = renderer.colorBlueBottomLeft = renderer.colorBlueBottomRight = renderer.colorBlueTopRight = p_147808_7_;
			renderer.colorRedTopLeft *= f3;
			renderer.colorGreenTopLeft *= f3;
			renderer.colorBlueTopLeft *= f3;
			renderer.colorRedBottomLeft *= f4;
			renderer.colorGreenBottomLeft *= f4;
			renderer.colorBlueBottomLeft *= f4;
			renderer.colorRedBottomRight *= f5;
			renderer.colorGreenBottomRight *= f5;
			renderer.colorBlueBottomRight *= f5;
			renderer.colorRedTopRight *= f6;
			renderer.colorGreenTopRight *= f6;
			renderer.colorBlueTopRight *= f6;
			renderFaceYPos(renderer, p_147808_1_, p_147808_2_, p_147808_3_, p_147808_4_, renderer.getBlockIcon(p_147808_1_, renderer.blockAccess, p_147808_2_, p_147808_3_, p_147808_4_, 1));
			flag = true;
		}

		float f8;
		float f9;
		float f10;
		float f11;
		int j1;
		int k1;
		int l1;
		int i2;
		IIcon iicon;

		if (renderer.renderAllFaces || p_147808_1_.shouldSideBeRendered(renderer.blockAccess, p_147808_2_, p_147808_3_, p_147808_4_ - 1, 2))
		{
			if (renderer.renderMinZ <= 0.0D)
			{
				--p_147808_4_;
			}

			renderer.aoLightValueScratchXZNN = renderer.blockAccess.getBlock(p_147808_2_ - 1, p_147808_3_, p_147808_4_).getAmbientOcclusionLightValue();
			renderer.aoLightValueScratchYZNN = renderer.blockAccess.getBlock(p_147808_2_, p_147808_3_ - 1, p_147808_4_).getAmbientOcclusionLightValue();
			renderer.aoLightValueScratchYZPN = renderer.blockAccess.getBlock(p_147808_2_, p_147808_3_ + 1, p_147808_4_).getAmbientOcclusionLightValue();
			renderer.aoLightValueScratchXZPN = renderer.blockAccess.getBlock(p_147808_2_ + 1, p_147808_3_, p_147808_4_).getAmbientOcclusionLightValue();
			renderer.aoBrightnessXZNN = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_ - 1, p_147808_3_, p_147808_4_);
			renderer.aoBrightnessYZNN = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_, p_147808_3_ - 1, p_147808_4_);
			renderer.aoBrightnessYZPN = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_, p_147808_3_ + 1, p_147808_4_);
			renderer.aoBrightnessXZPN = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_ + 1, p_147808_3_, p_147808_4_);
			flag2 = renderer.blockAccess.getBlock(p_147808_2_ + 1, p_147808_3_, p_147808_4_ - 1).getCanBlockGrass();
			flag3 = renderer.blockAccess.getBlock(p_147808_2_ - 1, p_147808_3_, p_147808_4_ - 1).getCanBlockGrass();
			flag4 = renderer.blockAccess.getBlock(p_147808_2_, p_147808_3_ + 1, p_147808_4_ - 1).getCanBlockGrass();
			flag5 = renderer.blockAccess.getBlock(p_147808_2_, p_147808_3_ - 1, p_147808_4_ - 1).getCanBlockGrass();

			if (!flag3 && !flag5)
			{
				renderer.aoLightValueScratchXYZNNN = renderer.aoLightValueScratchXZNN;
				renderer.aoBrightnessXYZNNN = renderer.aoBrightnessXZNN;
			}
			else
			{
				renderer.aoLightValueScratchXYZNNN = renderer.blockAccess.getBlock(p_147808_2_ - 1, p_147808_3_ - 1, p_147808_4_).getAmbientOcclusionLightValue();
				renderer.aoBrightnessXYZNNN = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_ - 1, p_147808_3_ - 1, p_147808_4_);
			}

			if (!flag3 && !flag4)
			{
				renderer.aoLightValueScratchXYZNPN = renderer.aoLightValueScratchXZNN;
				renderer.aoBrightnessXYZNPN = renderer.aoBrightnessXZNN;
			}
			else
			{
				renderer.aoLightValueScratchXYZNPN = renderer.blockAccess.getBlock(p_147808_2_ - 1, p_147808_3_ + 1, p_147808_4_).getAmbientOcclusionLightValue();
				renderer.aoBrightnessXYZNPN = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_ - 1, p_147808_3_ + 1, p_147808_4_);
			}

			if (!flag2 && !flag5)
			{
				renderer.aoLightValueScratchXYZPNN = renderer.aoLightValueScratchXZPN;
				renderer.aoBrightnessXYZPNN = renderer.aoBrightnessXZPN;
			}
			else
			{
				renderer.aoLightValueScratchXYZPNN = renderer.blockAccess.getBlock(p_147808_2_ + 1, p_147808_3_ - 1, p_147808_4_).getAmbientOcclusionLightValue();
				renderer.aoBrightnessXYZPNN = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_ + 1, p_147808_3_ - 1, p_147808_4_);
			}

			if (!flag2 && !flag4)
			{
				renderer.aoLightValueScratchXYZPPN = renderer.aoLightValueScratchXZPN;
				renderer.aoBrightnessXYZPPN = renderer.aoBrightnessXZPN;
			}
			else
			{
				renderer.aoLightValueScratchXYZPPN = renderer.blockAccess.getBlock(p_147808_2_ + 1, p_147808_3_ + 1, p_147808_4_).getAmbientOcclusionLightValue();
				renderer.aoBrightnessXYZPPN = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_ + 1, p_147808_3_ + 1, p_147808_4_);
			}

			if (renderer.renderMinZ <= 0.0D)
			{
				++p_147808_4_;
			}

			i1 = l;

			if (renderer.renderMinZ <= 0.0D || !renderer.blockAccess.getBlock(p_147808_2_, p_147808_3_, p_147808_4_ - 1).isOpaqueCube())
			{
				i1 = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_, p_147808_3_, p_147808_4_ - 1);
			}

			f7 = renderer.blockAccess.getBlock(p_147808_2_, p_147808_3_, p_147808_4_ - 1).getAmbientOcclusionLightValue();
			f8 = (renderer.aoLightValueScratchXZNN + renderer.aoLightValueScratchXYZNPN + f7 + renderer.aoLightValueScratchYZPN) / 4.0F;
			f9 = (f7 + renderer.aoLightValueScratchYZPN + renderer.aoLightValueScratchXZPN + renderer.aoLightValueScratchXYZPPN) / 4.0F;
			f10 = (renderer.aoLightValueScratchYZNN + f7 + renderer.aoLightValueScratchXYZPNN + renderer.aoLightValueScratchXZPN) / 4.0F;
			f11 = (renderer.aoLightValueScratchXYZNNN + renderer.aoLightValueScratchXZNN + renderer.aoLightValueScratchYZNN + f7) / 4.0F;
			f3 = (float)(f8 * renderer.renderMaxY * (1.0D - renderer.renderMinX) + f9 * renderer.renderMaxY * renderer.renderMinX + f10 * (1.0D - renderer.renderMaxY) * renderer.renderMinX + f11 * (1.0D - renderer.renderMaxY) * (1.0D - renderer.renderMinX));
			f4 = (float)(f8 * renderer.renderMaxY * (1.0D - renderer.renderMaxX) + f9 * renderer.renderMaxY * renderer.renderMaxX + f10 * (1.0D - renderer.renderMaxY) * renderer.renderMaxX + f11 * (1.0D - renderer.renderMaxY) * (1.0D - renderer.renderMaxX));
			f5 = (float)(f8 * renderer.renderMinY * (1.0D - renderer.renderMaxX) + f9 * renderer.renderMinY * renderer.renderMaxX + f10 * (1.0D - renderer.renderMinY) * renderer.renderMaxX + f11 * (1.0D - renderer.renderMinY) * (1.0D - renderer.renderMaxX));
			f6 = (float)(f8 * renderer.renderMinY * (1.0D - renderer.renderMinX) + f9 * renderer.renderMinY * renderer.renderMinX + f10 * (1.0D - renderer.renderMinY) * renderer.renderMinX + f11 * (1.0D - renderer.renderMinY) * (1.0D - renderer.renderMinX));
			j1 = renderer.getAoBrightness(renderer.aoBrightnessXZNN, renderer.aoBrightnessXYZNPN, renderer.aoBrightnessYZPN, i1);
			k1 = renderer.getAoBrightness(renderer.aoBrightnessYZPN, renderer.aoBrightnessXZPN, renderer.aoBrightnessXYZPPN, i1);
			l1 = renderer.getAoBrightness(renderer.aoBrightnessYZNN, renderer.aoBrightnessXYZPNN, renderer.aoBrightnessXZPN, i1);
			i2 = renderer.getAoBrightness(renderer.aoBrightnessXYZNNN, renderer.aoBrightnessXZNN, renderer.aoBrightnessYZNN, i1);
			renderer.brightnessTopLeft = renderer.mixAoBrightness(j1, k1, l1, i2, renderer.renderMaxY * (1.0D - renderer.renderMinX), renderer.renderMaxY * renderer.renderMinX, (1.0D - renderer.renderMaxY) * renderer.renderMinX, (1.0D - renderer.renderMaxY) * (1.0D - renderer.renderMinX));
			renderer.brightnessBottomLeft = renderer.mixAoBrightness(j1, k1, l1, i2, renderer.renderMaxY * (1.0D - renderer.renderMaxX), renderer.renderMaxY * renderer.renderMaxX, (1.0D - renderer.renderMaxY) * renderer.renderMaxX, (1.0D - renderer.renderMaxY) * (1.0D - renderer.renderMaxX));
			renderer.brightnessBottomRight = renderer.mixAoBrightness(j1, k1, l1, i2, renderer.renderMinY * (1.0D - renderer.renderMaxX), renderer.renderMinY * renderer.renderMaxX, (1.0D - renderer.renderMinY) * renderer.renderMaxX, (1.0D - renderer.renderMinY) * (1.0D - renderer.renderMaxX));
			renderer.brightnessTopRight = renderer.mixAoBrightness(j1, k1, l1, i2, renderer.renderMinY * (1.0D - renderer.renderMinX), renderer.renderMinY * renderer.renderMinX, (1.0D - renderer.renderMinY) * renderer.renderMinX, (1.0D - renderer.renderMinY) * (1.0D - renderer.renderMinX));

			if (flag1)
			{
				renderer.colorRedTopLeft = renderer.colorRedBottomLeft = renderer.colorRedBottomRight = renderer.colorRedTopRight = p_147808_5_ * 0.8F;
				renderer.colorGreenTopLeft = renderer.colorGreenBottomLeft = renderer.colorGreenBottomRight = renderer.colorGreenTopRight = p_147808_6_ * 0.8F;
				renderer.colorBlueTopLeft = renderer.colorBlueBottomLeft = renderer.colorBlueBottomRight = renderer.colorBlueTopRight = p_147808_7_ * 0.8F;
			}
			else
			{
				renderer.colorRedTopLeft = renderer.colorRedBottomLeft = renderer.colorRedBottomRight = renderer.colorRedTopRight = 0.8F;
				renderer.colorGreenTopLeft = renderer.colorGreenBottomLeft = renderer.colorGreenBottomRight = renderer.colorGreenTopRight = 0.8F;
				renderer.colorBlueTopLeft = renderer.colorBlueBottomLeft = renderer.colorBlueBottomRight = renderer.colorBlueTopRight = 0.8F;
			}

			renderer.colorRedTopLeft *= f3;
			renderer.colorGreenTopLeft *= f3;
			renderer.colorBlueTopLeft *= f3;
			renderer.colorRedBottomLeft *= f4;
			renderer.colorGreenBottomLeft *= f4;
			renderer.colorBlueBottomLeft *= f4;
			renderer.colorRedBottomRight *= f5;
			renderer.colorGreenBottomRight *= f5;
			renderer.colorBlueBottomRight *= f5;
			renderer.colorRedTopRight *= f6;
			renderer.colorGreenTopRight *= f6;
			renderer.colorBlueTopRight *= f6;
			iicon = renderer.getBlockIcon(p_147808_1_, renderer.blockAccess, p_147808_2_, p_147808_3_, p_147808_4_, 2);
			renderFaceZNeg(renderer, p_147808_1_, p_147808_2_, p_147808_3_, p_147808_4_, iicon);

			flag = true;
		}

		if (renderer.renderAllFaces || p_147808_1_.shouldSideBeRendered(renderer.blockAccess, p_147808_2_, p_147808_3_, p_147808_4_ + 1, 3))
		{
			if (renderer.renderMaxZ >= 1.0D)
			{
				++p_147808_4_;
			}

			renderer.aoLightValueScratchXZNP = renderer.blockAccess.getBlock(p_147808_2_ - 1, p_147808_3_, p_147808_4_).getAmbientOcclusionLightValue();
			renderer.aoLightValueScratchXZPP = renderer.blockAccess.getBlock(p_147808_2_ + 1, p_147808_3_, p_147808_4_).getAmbientOcclusionLightValue();
			renderer.aoLightValueScratchYZNP = renderer.blockAccess.getBlock(p_147808_2_, p_147808_3_ - 1, p_147808_4_).getAmbientOcclusionLightValue();
			renderer.aoLightValueScratchYZPP = renderer.blockAccess.getBlock(p_147808_2_, p_147808_3_ + 1, p_147808_4_).getAmbientOcclusionLightValue();
			renderer.aoBrightnessXZNP = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_ - 1, p_147808_3_, p_147808_4_);
			renderer.aoBrightnessXZPP = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_ + 1, p_147808_3_, p_147808_4_);
			renderer.aoBrightnessYZNP = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_, p_147808_3_ - 1, p_147808_4_);
			renderer.aoBrightnessYZPP = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_, p_147808_3_ + 1, p_147808_4_);
			flag2 = renderer.blockAccess.getBlock(p_147808_2_ + 1, p_147808_3_, p_147808_4_ + 1).getCanBlockGrass();
			flag3 = renderer.blockAccess.getBlock(p_147808_2_ - 1, p_147808_3_, p_147808_4_ + 1).getCanBlockGrass();
			flag4 = renderer.blockAccess.getBlock(p_147808_2_, p_147808_3_ + 1, p_147808_4_ + 1).getCanBlockGrass();
			flag5 = renderer.blockAccess.getBlock(p_147808_2_, p_147808_3_ - 1, p_147808_4_ + 1).getCanBlockGrass();

			if (!flag3 && !flag5)
			{
				renderer.aoLightValueScratchXYZNNP = renderer.aoLightValueScratchXZNP;
				renderer.aoBrightnessXYZNNP = renderer.aoBrightnessXZNP;
			}
			else
			{
				renderer.aoLightValueScratchXYZNNP = renderer.blockAccess.getBlock(p_147808_2_ - 1, p_147808_3_ - 1, p_147808_4_).getAmbientOcclusionLightValue();
				renderer.aoBrightnessXYZNNP = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_ - 1, p_147808_3_ - 1, p_147808_4_);
			}

			if (!flag3 && !flag4)
			{
				renderer.aoLightValueScratchXYZNPP = renderer.aoLightValueScratchXZNP;
				renderer.aoBrightnessXYZNPP = renderer.aoBrightnessXZNP;
			}
			else
			{
				renderer.aoLightValueScratchXYZNPP = renderer.blockAccess.getBlock(p_147808_2_ - 1, p_147808_3_ + 1, p_147808_4_).getAmbientOcclusionLightValue();
				renderer.aoBrightnessXYZNPP = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_ - 1, p_147808_3_ + 1, p_147808_4_);
			}

			if (!flag2 && !flag5)
			{
				renderer.aoLightValueScratchXYZPNP = renderer.aoLightValueScratchXZPP;
				renderer.aoBrightnessXYZPNP = renderer.aoBrightnessXZPP;
			}
			else
			{
				renderer.aoLightValueScratchXYZPNP = renderer.blockAccess.getBlock(p_147808_2_ + 1, p_147808_3_ - 1, p_147808_4_).getAmbientOcclusionLightValue();
				renderer.aoBrightnessXYZPNP = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_ + 1, p_147808_3_ - 1, p_147808_4_);
			}

			if (!flag2 && !flag4)
			{
				renderer.aoLightValueScratchXYZPPP = renderer.aoLightValueScratchXZPP;
				renderer.aoBrightnessXYZPPP = renderer.aoBrightnessXZPP;
			}
			else
			{
				renderer.aoLightValueScratchXYZPPP = renderer.blockAccess.getBlock(p_147808_2_ + 1, p_147808_3_ + 1, p_147808_4_).getAmbientOcclusionLightValue();
				renderer.aoBrightnessXYZPPP = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_ + 1, p_147808_3_ + 1, p_147808_4_);
			}

			if (renderer.renderMaxZ >= 1.0D)
			{
				--p_147808_4_;
			}

			i1 = l;

			if (renderer.renderMaxZ >= 1.0D || !renderer.blockAccess.getBlock(p_147808_2_, p_147808_3_, p_147808_4_ + 1).isOpaqueCube())
			{
				i1 = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_, p_147808_3_, p_147808_4_ + 1);
			}

			f7 = renderer.blockAccess.getBlock(p_147808_2_, p_147808_3_, p_147808_4_ + 1).getAmbientOcclusionLightValue();
			f8 = (renderer.aoLightValueScratchXZNP + renderer.aoLightValueScratchXYZNPP + f7 + renderer.aoLightValueScratchYZPP) / 4.0F;
			f9 = (f7 + renderer.aoLightValueScratchYZPP + renderer.aoLightValueScratchXZPP + renderer.aoLightValueScratchXYZPPP) / 4.0F;
			f10 = (renderer.aoLightValueScratchYZNP + f7 + renderer.aoLightValueScratchXYZPNP + renderer.aoLightValueScratchXZPP) / 4.0F;
			f11 = (renderer.aoLightValueScratchXYZNNP + renderer.aoLightValueScratchXZNP + renderer.aoLightValueScratchYZNP + f7) / 4.0F;
			f3 = (float)(f8 * renderer.renderMaxY * (1.0D - renderer.renderMinX) + f9 * renderer.renderMaxY * renderer.renderMinX + f10 * (1.0D - renderer.renderMaxY) * renderer.renderMinX + f11 * (1.0D - renderer.renderMaxY) * (1.0D - renderer.renderMinX));
			f4 = (float)(f8 * renderer.renderMinY * (1.0D - renderer.renderMinX) + f9 * renderer.renderMinY * renderer.renderMinX + f10 * (1.0D - renderer.renderMinY) * renderer.renderMinX + f11 * (1.0D - renderer.renderMinY) * (1.0D - renderer.renderMinX));
			f5 = (float)(f8 * renderer.renderMinY * (1.0D - renderer.renderMaxX) + f9 * renderer.renderMinY * renderer.renderMaxX + f10 * (1.0D - renderer.renderMinY) * renderer.renderMaxX + f11 * (1.0D - renderer.renderMinY) * (1.0D - renderer.renderMaxX));
			f6 = (float)(f8 * renderer.renderMaxY * (1.0D - renderer.renderMaxX) + f9 * renderer.renderMaxY * renderer.renderMaxX + f10 * (1.0D - renderer.renderMaxY) * renderer.renderMaxX + f11 * (1.0D - renderer.renderMaxY) * (1.0D - renderer.renderMaxX));
			j1 = renderer.getAoBrightness(renderer.aoBrightnessXZNP, renderer.aoBrightnessXYZNPP, renderer.aoBrightnessYZPP, i1);
			k1 = renderer.getAoBrightness(renderer.aoBrightnessYZPP, renderer.aoBrightnessXZPP, renderer.aoBrightnessXYZPPP, i1);
			l1 = renderer.getAoBrightness(renderer.aoBrightnessYZNP, renderer.aoBrightnessXYZPNP, renderer.aoBrightnessXZPP, i1);
			i2 = renderer.getAoBrightness(renderer.aoBrightnessXYZNNP, renderer.aoBrightnessXZNP, renderer.aoBrightnessYZNP, i1);
			renderer.brightnessTopLeft = renderer.mixAoBrightness(j1, i2, l1, k1, renderer.renderMaxY * (1.0D - renderer.renderMinX), (1.0D - renderer.renderMaxY) * (1.0D - renderer.renderMinX), (1.0D - renderer.renderMaxY) * renderer.renderMinX, renderer.renderMaxY * renderer.renderMinX);
			renderer.brightnessBottomLeft = renderer.mixAoBrightness(j1, i2, l1, k1, renderer.renderMinY * (1.0D - renderer.renderMinX), (1.0D - renderer.renderMinY) * (1.0D - renderer.renderMinX), (1.0D - renderer.renderMinY) * renderer.renderMinX, renderer.renderMinY * renderer.renderMinX);
			renderer.brightnessBottomRight = renderer.mixAoBrightness(j1, i2, l1, k1, renderer.renderMinY * (1.0D - renderer.renderMaxX), (1.0D - renderer.renderMinY) * (1.0D - renderer.renderMaxX), (1.0D - renderer.renderMinY) * renderer.renderMaxX, renderer.renderMinY * renderer.renderMaxX);
			renderer.brightnessTopRight = renderer.mixAoBrightness(j1, i2, l1, k1, renderer.renderMaxY * (1.0D - renderer.renderMaxX), (1.0D - renderer.renderMaxY) * (1.0D - renderer.renderMaxX), (1.0D - renderer.renderMaxY) * renderer.renderMaxX, renderer.renderMaxY * renderer.renderMaxX);

			if (flag1)
			{
				renderer.colorRedTopLeft = renderer.colorRedBottomLeft = renderer.colorRedBottomRight = renderer.colorRedTopRight = p_147808_5_ * 0.8F;
				renderer.colorGreenTopLeft = renderer.colorGreenBottomLeft = renderer.colorGreenBottomRight = renderer.colorGreenTopRight = p_147808_6_ * 0.8F;
				renderer.colorBlueTopLeft = renderer.colorBlueBottomLeft = renderer.colorBlueBottomRight = renderer.colorBlueTopRight = p_147808_7_ * 0.8F;
			}
			else
			{
				renderer.colorRedTopLeft = renderer.colorRedBottomLeft = renderer.colorRedBottomRight = renderer.colorRedTopRight = 0.8F;
				renderer.colorGreenTopLeft = renderer.colorGreenBottomLeft = renderer.colorGreenBottomRight = renderer.colorGreenTopRight = 0.8F;
				renderer.colorBlueTopLeft = renderer.colorBlueBottomLeft = renderer.colorBlueBottomRight = renderer.colorBlueTopRight = 0.8F;
			}

			renderer.colorRedTopLeft *= f3;
			renderer.colorGreenTopLeft *= f3;
			renderer.colorBlueTopLeft *= f3;
			renderer.colorRedBottomLeft *= f4;
			renderer.colorGreenBottomLeft *= f4;
			renderer.colorBlueBottomLeft *= f4;
			renderer.colorRedBottomRight *= f5;
			renderer.colorGreenBottomRight *= f5;
			renderer.colorBlueBottomRight *= f5;
			renderer.colorRedTopRight *= f6;
			renderer.colorGreenTopRight *= f6;
			renderer.colorBlueTopRight *= f6;
			iicon = renderer.getBlockIcon(p_147808_1_, renderer.blockAccess, p_147808_2_, p_147808_3_, p_147808_4_, 3);
			renderFaceZPos(renderer, p_147808_1_, p_147808_2_, p_147808_3_, p_147808_4_, iicon);
			
			flag = true;
		}

		if (renderer.renderAllFaces || p_147808_1_.shouldSideBeRendered(renderer.blockAccess, p_147808_2_ - 1, p_147808_3_, p_147808_4_, 4))
		{
			if (renderer.renderMinX <= 0.0D)
			{
				--p_147808_2_;
			}

			renderer.aoLightValueScratchXYNN = renderer.blockAccess.getBlock(p_147808_2_, p_147808_3_ - 1, p_147808_4_).getAmbientOcclusionLightValue();
			renderer.aoLightValueScratchXZNN = renderer.blockAccess.getBlock(p_147808_2_, p_147808_3_, p_147808_4_ - 1).getAmbientOcclusionLightValue();
			renderer.aoLightValueScratchXZNP = renderer.blockAccess.getBlock(p_147808_2_, p_147808_3_, p_147808_4_ + 1).getAmbientOcclusionLightValue();
			renderer.aoLightValueScratchXYNP = renderer.blockAccess.getBlock(p_147808_2_, p_147808_3_ + 1, p_147808_4_).getAmbientOcclusionLightValue();
			renderer.aoBrightnessXYNN = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_, p_147808_3_ - 1, p_147808_4_);
			renderer.aoBrightnessXZNN = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_, p_147808_3_, p_147808_4_ - 1);
			renderer.aoBrightnessXZNP = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_, p_147808_3_, p_147808_4_ + 1);
			renderer.aoBrightnessXYNP = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_, p_147808_3_ + 1, p_147808_4_);
			flag2 = renderer.blockAccess.getBlock(p_147808_2_ - 1, p_147808_3_ + 1, p_147808_4_).getCanBlockGrass();
			flag3 = renderer.blockAccess.getBlock(p_147808_2_ - 1, p_147808_3_ - 1, p_147808_4_).getCanBlockGrass();
			flag4 = renderer.blockAccess.getBlock(p_147808_2_ - 1, p_147808_3_, p_147808_4_ - 1).getCanBlockGrass();
			flag5 = renderer.blockAccess.getBlock(p_147808_2_ - 1, p_147808_3_, p_147808_4_ + 1).getCanBlockGrass();

			if (!flag4 && !flag3)
			{
				renderer.aoLightValueScratchXYZNNN = renderer.aoLightValueScratchXZNN;
				renderer.aoBrightnessXYZNNN = renderer.aoBrightnessXZNN;
			}
			else
			{
				renderer.aoLightValueScratchXYZNNN = renderer.blockAccess.getBlock(p_147808_2_, p_147808_3_ - 1, p_147808_4_ - 1).getAmbientOcclusionLightValue();
				renderer.aoBrightnessXYZNNN = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_, p_147808_3_ - 1, p_147808_4_ - 1);
			}

			if (!flag5 && !flag3)
			{
				renderer.aoLightValueScratchXYZNNP = renderer.aoLightValueScratchXZNP;
				renderer.aoBrightnessXYZNNP = renderer.aoBrightnessXZNP;
			}
			else
			{
				renderer.aoLightValueScratchXYZNNP = renderer.blockAccess.getBlock(p_147808_2_, p_147808_3_ - 1, p_147808_4_ + 1).getAmbientOcclusionLightValue();
				renderer.aoBrightnessXYZNNP = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_, p_147808_3_ - 1, p_147808_4_ + 1);
			}

			if (!flag4 && !flag2)
			{
				renderer.aoLightValueScratchXYZNPN = renderer.aoLightValueScratchXZNN;
				renderer.aoBrightnessXYZNPN = renderer.aoBrightnessXZNN;
			}
			else
			{
				renderer.aoLightValueScratchXYZNPN = renderer.blockAccess.getBlock(p_147808_2_, p_147808_3_ + 1, p_147808_4_ - 1).getAmbientOcclusionLightValue();
				renderer.aoBrightnessXYZNPN = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_, p_147808_3_ + 1, p_147808_4_ - 1);
			}

			if (!flag5 && !flag2)
			{
				renderer.aoLightValueScratchXYZNPP = renderer.aoLightValueScratchXZNP;
				renderer.aoBrightnessXYZNPP = renderer.aoBrightnessXZNP;
			}
			else
			{
				renderer.aoLightValueScratchXYZNPP = renderer.blockAccess.getBlock(p_147808_2_, p_147808_3_ + 1, p_147808_4_ + 1).getAmbientOcclusionLightValue();
				renderer.aoBrightnessXYZNPP = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_, p_147808_3_ + 1, p_147808_4_ + 1);
			}

			if (renderer.renderMinX <= 0.0D)
			{
				++p_147808_2_;
			}

			i1 = l;

			if (renderer.renderMinX <= 0.0D || !renderer.blockAccess.getBlock(p_147808_2_ - 1, p_147808_3_, p_147808_4_).isOpaqueCube())
			{
				i1 = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_ - 1, p_147808_3_, p_147808_4_);
			}

			f7 = renderer.blockAccess.getBlock(p_147808_2_ - 1, p_147808_3_, p_147808_4_).getAmbientOcclusionLightValue();
			f8 = (renderer.aoLightValueScratchXYNN + renderer.aoLightValueScratchXYZNNP + f7 + renderer.aoLightValueScratchXZNP) / 4.0F;
			f9 = (f7 + renderer.aoLightValueScratchXZNP + renderer.aoLightValueScratchXYNP + renderer.aoLightValueScratchXYZNPP) / 4.0F;
			f10 = (renderer.aoLightValueScratchXZNN + f7 + renderer.aoLightValueScratchXYZNPN + renderer.aoLightValueScratchXYNP) / 4.0F;
			f11 = (renderer.aoLightValueScratchXYZNNN + renderer.aoLightValueScratchXYNN + renderer.aoLightValueScratchXZNN + f7) / 4.0F;
			f3 = (float)(f9 * renderer.renderMaxY * renderer.renderMaxZ + f10 * renderer.renderMaxY * (1.0D - renderer.renderMaxZ) + f11 * (1.0D - renderer.renderMaxY) * (1.0D - renderer.renderMaxZ) + f8 * (1.0D - renderer.renderMaxY) * renderer.renderMaxZ);
			f4 = (float)(f9 * renderer.renderMaxY * renderer.renderMinZ + f10 * renderer.renderMaxY * (1.0D - renderer.renderMinZ) + f11 * (1.0D - renderer.renderMaxY) * (1.0D - renderer.renderMinZ) + f8 * (1.0D - renderer.renderMaxY) * renderer.renderMinZ);
			f5 = (float)(f9 * renderer.renderMinY * renderer.renderMinZ + f10 * renderer.renderMinY * (1.0D - renderer.renderMinZ) + f11 * (1.0D - renderer.renderMinY) * (1.0D - renderer.renderMinZ) + f8 * (1.0D - renderer.renderMinY) * renderer.renderMinZ);
			f6 = (float)(f9 * renderer.renderMinY * renderer.renderMaxZ + f10 * renderer.renderMinY * (1.0D - renderer.renderMaxZ) + f11 * (1.0D - renderer.renderMinY) * (1.0D - renderer.renderMaxZ) + f8 * (1.0D - renderer.renderMinY) * renderer.renderMaxZ);
			j1 = renderer.getAoBrightness(renderer.aoBrightnessXYNN, renderer.aoBrightnessXYZNNP, renderer.aoBrightnessXZNP, i1);
			k1 = renderer.getAoBrightness(renderer.aoBrightnessXZNP, renderer.aoBrightnessXYNP, renderer.aoBrightnessXYZNPP, i1);
			l1 = renderer.getAoBrightness(renderer.aoBrightnessXZNN, renderer.aoBrightnessXYZNPN, renderer.aoBrightnessXYNP, i1);
			i2 = renderer.getAoBrightness(renderer.aoBrightnessXYZNNN, renderer.aoBrightnessXYNN, renderer.aoBrightnessXZNN, i1);
			renderer.brightnessTopLeft = renderer.mixAoBrightness(k1, l1, i2, j1, renderer.renderMaxY * renderer.renderMaxZ, renderer.renderMaxY * (1.0D - renderer.renderMaxZ), (1.0D - renderer.renderMaxY) * (1.0D - renderer.renderMaxZ), (1.0D - renderer.renderMaxY) * renderer.renderMaxZ);
			renderer.brightnessBottomLeft = renderer.mixAoBrightness(k1, l1, i2, j1, renderer.renderMaxY * renderer.renderMinZ, renderer.renderMaxY * (1.0D - renderer.renderMinZ), (1.0D - renderer.renderMaxY) * (1.0D - renderer.renderMinZ), (1.0D - renderer.renderMaxY) * renderer.renderMinZ);
			renderer.brightnessBottomRight = renderer.mixAoBrightness(k1, l1, i2, j1, renderer.renderMinY * renderer.renderMinZ, renderer.renderMinY * (1.0D - renderer.renderMinZ), (1.0D - renderer.renderMinY) * (1.0D - renderer.renderMinZ), (1.0D - renderer.renderMinY) * renderer.renderMinZ);
			renderer.brightnessTopRight = renderer.mixAoBrightness(k1, l1, i2, j1, renderer.renderMinY * renderer.renderMaxZ, renderer.renderMinY * (1.0D - renderer.renderMaxZ), (1.0D - renderer.renderMinY) * (1.0D - renderer.renderMaxZ), (1.0D - renderer.renderMinY) * renderer.renderMaxZ);

			if (flag1)
			{
				renderer.colorRedTopLeft = renderer.colorRedBottomLeft = renderer.colorRedBottomRight = renderer.colorRedTopRight = p_147808_5_ * 0.6F;
				renderer.colorGreenTopLeft = renderer.colorGreenBottomLeft = renderer.colorGreenBottomRight = renderer.colorGreenTopRight = p_147808_6_ * 0.6F;
				renderer.colorBlueTopLeft = renderer.colorBlueBottomLeft = renderer.colorBlueBottomRight = renderer.colorBlueTopRight = p_147808_7_ * 0.6F;
			}
			else
			{
				renderer.colorRedTopLeft = renderer.colorRedBottomLeft = renderer.colorRedBottomRight = renderer.colorRedTopRight = 0.6F;
				renderer.colorGreenTopLeft = renderer.colorGreenBottomLeft = renderer.colorGreenBottomRight = renderer.colorGreenTopRight = 0.6F;
				renderer.colorBlueTopLeft = renderer.colorBlueBottomLeft = renderer.colorBlueBottomRight = renderer.colorBlueTopRight = 0.6F;
			}

			renderer.colorRedTopLeft *= f3;
			renderer.colorGreenTopLeft *= f3;
			renderer.colorBlueTopLeft *= f3;
			renderer.colorRedBottomLeft *= f4;
			renderer.colorGreenBottomLeft *= f4;
			renderer.colorBlueBottomLeft *= f4;
			renderer.colorRedBottomRight *= f5;
			renderer.colorGreenBottomRight *= f5;
			renderer.colorBlueBottomRight *= f5;
			renderer.colorRedTopRight *= f6;
			renderer.colorGreenTopRight *= f6;
			renderer.colorBlueTopRight *= f6;
			iicon = renderer.getBlockIcon(p_147808_1_, renderer.blockAccess, p_147808_2_, p_147808_3_, p_147808_4_, 4);
			renderFaceXNeg(renderer, p_147808_1_, p_147808_2_, p_147808_3_, p_147808_4_, iicon);

			flag = true;
		}

		if (renderer.renderAllFaces || p_147808_1_.shouldSideBeRendered(renderer.blockAccess, p_147808_2_ + 1, p_147808_3_, p_147808_4_, 5))
		{
			if (renderer.renderMaxX >= 1.0D)
			{
				++p_147808_2_;
			}

			renderer.aoLightValueScratchXYPN = renderer.blockAccess.getBlock(p_147808_2_, p_147808_3_ - 1, p_147808_4_).getAmbientOcclusionLightValue();
			renderer.aoLightValueScratchXZPN = renderer.blockAccess.getBlock(p_147808_2_, p_147808_3_, p_147808_4_ - 1).getAmbientOcclusionLightValue();
			renderer.aoLightValueScratchXZPP = renderer.blockAccess.getBlock(p_147808_2_, p_147808_3_, p_147808_4_ + 1).getAmbientOcclusionLightValue();
			renderer.aoLightValueScratchXYPP = renderer.blockAccess.getBlock(p_147808_2_, p_147808_3_ + 1, p_147808_4_).getAmbientOcclusionLightValue();
			renderer.aoBrightnessXYPN = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_, p_147808_3_ - 1, p_147808_4_);
			renderer.aoBrightnessXZPN = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_, p_147808_3_, p_147808_4_ - 1);
			renderer.aoBrightnessXZPP = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_, p_147808_3_, p_147808_4_ + 1);
			renderer.aoBrightnessXYPP = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_, p_147808_3_ + 1, p_147808_4_);
			flag2 = renderer.blockAccess.getBlock(p_147808_2_ + 1, p_147808_3_ + 1, p_147808_4_).getCanBlockGrass();
			flag3 = renderer.blockAccess.getBlock(p_147808_2_ + 1, p_147808_3_ - 1, p_147808_4_).getCanBlockGrass();
			flag4 = renderer.blockAccess.getBlock(p_147808_2_ + 1, p_147808_3_, p_147808_4_ + 1).getCanBlockGrass();
			flag5 = renderer.blockAccess.getBlock(p_147808_2_ + 1, p_147808_3_, p_147808_4_ - 1).getCanBlockGrass();

			if (!flag3 && !flag5)
			{
				renderer.aoLightValueScratchXYZPNN = renderer.aoLightValueScratchXZPN;
				renderer.aoBrightnessXYZPNN = renderer.aoBrightnessXZPN;
			}
			else
			{
				renderer.aoLightValueScratchXYZPNN = renderer.blockAccess.getBlock(p_147808_2_, p_147808_3_ - 1, p_147808_4_ - 1).getAmbientOcclusionLightValue();
				renderer.aoBrightnessXYZPNN = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_, p_147808_3_ - 1, p_147808_4_ - 1);
			}

			if (!flag3 && !flag4)
			{
				renderer.aoLightValueScratchXYZPNP = renderer.aoLightValueScratchXZPP;
				renderer.aoBrightnessXYZPNP = renderer.aoBrightnessXZPP;
			}
			else
			{
				renderer.aoLightValueScratchXYZPNP = renderer.blockAccess.getBlock(p_147808_2_, p_147808_3_ - 1, p_147808_4_ + 1).getAmbientOcclusionLightValue();
				renderer.aoBrightnessXYZPNP = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_, p_147808_3_ - 1, p_147808_4_ + 1);
			}

			if (!flag2 && !flag5)
			{
				renderer.aoLightValueScratchXYZPPN = renderer.aoLightValueScratchXZPN;
				renderer.aoBrightnessXYZPPN = renderer.aoBrightnessXZPN;
			}
			else
			{
				renderer.aoLightValueScratchXYZPPN = renderer.blockAccess.getBlock(p_147808_2_, p_147808_3_ + 1, p_147808_4_ - 1).getAmbientOcclusionLightValue();
				renderer.aoBrightnessXYZPPN = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_, p_147808_3_ + 1, p_147808_4_ - 1);
			}

			if (!flag2 && !flag4)
			{
				renderer.aoLightValueScratchXYZPPP = renderer.aoLightValueScratchXZPP;
				renderer.aoBrightnessXYZPPP = renderer.aoBrightnessXZPP;
			}
			else
			{
				renderer.aoLightValueScratchXYZPPP = renderer.blockAccess.getBlock(p_147808_2_, p_147808_3_ + 1, p_147808_4_ + 1).getAmbientOcclusionLightValue();
				renderer.aoBrightnessXYZPPP = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_, p_147808_3_ + 1, p_147808_4_ + 1);
			}

			if (renderer.renderMaxX >= 1.0D)
			{
				--p_147808_2_;
			}

			i1 = l;

			if (renderer.renderMaxX >= 1.0D || !renderer.blockAccess.getBlock(p_147808_2_ + 1, p_147808_3_, p_147808_4_).isOpaqueCube())
			{
				i1 = p_147808_1_.getMixedBrightnessForBlock(renderer.blockAccess, p_147808_2_ + 1, p_147808_3_, p_147808_4_);
			}

			f7 = renderer.blockAccess.getBlock(p_147808_2_ + 1, p_147808_3_, p_147808_4_).getAmbientOcclusionLightValue();
			f8 = (renderer.aoLightValueScratchXYPN + renderer.aoLightValueScratchXYZPNP + f7 + renderer.aoLightValueScratchXZPP) / 4.0F;
			f9 = (renderer.aoLightValueScratchXYZPNN + renderer.aoLightValueScratchXYPN + renderer.aoLightValueScratchXZPN + f7) / 4.0F;
			f10 = (renderer.aoLightValueScratchXZPN + f7 + renderer.aoLightValueScratchXYZPPN + renderer.aoLightValueScratchXYPP) / 4.0F;
			f11 = (f7 + renderer.aoLightValueScratchXZPP + renderer.aoLightValueScratchXYPP + renderer.aoLightValueScratchXYZPPP) / 4.0F;
			f3 = (float)(f8 * (1.0D - renderer.renderMinY) * renderer.renderMaxZ + f9 * (1.0D - renderer.renderMinY) * (1.0D - renderer.renderMaxZ) + f10 * renderer.renderMinY * (1.0D - renderer.renderMaxZ) + f11 * renderer.renderMinY * renderer.renderMaxZ);
			f4 = (float)(f8 * (1.0D - renderer.renderMinY) * renderer.renderMinZ + f9 * (1.0D - renderer.renderMinY) * (1.0D - renderer.renderMinZ) + f10 * renderer.renderMinY * (1.0D - renderer.renderMinZ) + f11 * renderer.renderMinY * renderer.renderMinZ);
			f5 = (float)(f8 * (1.0D - renderer.renderMaxY) * renderer.renderMinZ + f9 * (1.0D - renderer.renderMaxY) * (1.0D - renderer.renderMinZ) + f10 * renderer.renderMaxY * (1.0D - renderer.renderMinZ) + f11 * renderer.renderMaxY * renderer.renderMinZ);
			f6 = (float)(f8 * (1.0D - renderer.renderMaxY) * renderer.renderMaxZ + f9 * (1.0D - renderer.renderMaxY) * (1.0D - renderer.renderMaxZ) + f10 * renderer.renderMaxY * (1.0D - renderer.renderMaxZ) + f11 * renderer.renderMaxY * renderer.renderMaxZ);
			j1 = renderer.getAoBrightness(renderer.aoBrightnessXYPN, renderer.aoBrightnessXYZPNP, renderer.aoBrightnessXZPP, i1);
			k1 = renderer.getAoBrightness(renderer.aoBrightnessXZPP, renderer.aoBrightnessXYPP, renderer.aoBrightnessXYZPPP, i1);
			l1 = renderer.getAoBrightness(renderer.aoBrightnessXZPN, renderer.aoBrightnessXYZPPN, renderer.aoBrightnessXYPP, i1);
			i2 = renderer.getAoBrightness(renderer.aoBrightnessXYZPNN, renderer.aoBrightnessXYPN, renderer.aoBrightnessXZPN, i1);
			renderer.brightnessTopLeft = renderer.mixAoBrightness(j1, i2, l1, k1, (1.0D - renderer.renderMinY) * renderer.renderMaxZ, (1.0D - renderer.renderMinY) * (1.0D - renderer.renderMaxZ), renderer.renderMinY * (1.0D - renderer.renderMaxZ), renderer.renderMinY * renderer.renderMaxZ);
			renderer.brightnessBottomLeft = renderer.mixAoBrightness(j1, i2, l1, k1, (1.0D - renderer.renderMinY) * renderer.renderMinZ, (1.0D - renderer.renderMinY) * (1.0D - renderer.renderMinZ), renderer.renderMinY * (1.0D - renderer.renderMinZ), renderer.renderMinY * renderer.renderMinZ);
			renderer.brightnessBottomRight = renderer.mixAoBrightness(j1, i2, l1, k1, (1.0D - renderer.renderMaxY) * renderer.renderMinZ, (1.0D - renderer.renderMaxY) * (1.0D - renderer.renderMinZ), renderer.renderMaxY * (1.0D - renderer.renderMinZ), renderer.renderMaxY * renderer.renderMinZ);
			renderer.brightnessTopRight = renderer.mixAoBrightness(j1, i2, l1, k1, (1.0D - renderer.renderMaxY) * renderer.renderMaxZ, (1.0D - renderer.renderMaxY) * (1.0D - renderer.renderMaxZ), renderer.renderMaxY * (1.0D - renderer.renderMaxZ), renderer.renderMaxY * renderer.renderMaxZ);

			if (flag1)
			{
				renderer.colorRedTopLeft = renderer.colorRedBottomLeft = renderer.colorRedBottomRight = renderer.colorRedTopRight = p_147808_5_ * 0.6F;
				renderer.colorGreenTopLeft = renderer.colorGreenBottomLeft = renderer.colorGreenBottomRight = renderer.colorGreenTopRight = p_147808_6_ * 0.6F;
				renderer.colorBlueTopLeft = renderer.colorBlueBottomLeft = renderer.colorBlueBottomRight = renderer.colorBlueTopRight = p_147808_7_ * 0.6F;
			}
			else
			{
				renderer.colorRedTopLeft = renderer.colorRedBottomLeft = renderer.colorRedBottomRight = renderer.colorRedTopRight = 0.6F;
				renderer.colorGreenTopLeft = renderer.colorGreenBottomLeft = renderer.colorGreenBottomRight = renderer.colorGreenTopRight = 0.6F;
				renderer.colorBlueTopLeft = renderer.colorBlueBottomLeft = renderer.colorBlueBottomRight = renderer.colorBlueTopRight = 0.6F;
			}

			renderer.colorRedTopLeft *= f3;
			renderer.colorGreenTopLeft *= f3;
			renderer.colorBlueTopLeft *= f3;
			renderer.colorRedBottomLeft *= f4;
			renderer.colorGreenBottomLeft *= f4;
			renderer.colorBlueBottomLeft *= f4;
			renderer.colorRedBottomRight *= f5;
			renderer.colorGreenBottomRight *= f5;
			renderer.colorBlueBottomRight *= f5;
			renderer.colorRedTopRight *= f6;
			renderer.colorGreenTopRight *= f6;
			renderer.colorBlueTopRight *= f6;
			iicon = renderer.getBlockIcon(p_147808_1_, renderer.blockAccess, p_147808_2_, p_147808_3_, p_147808_4_, 5);
			renderFaceXPos(renderer, p_147808_1_, p_147808_2_, p_147808_3_, p_147808_4_, iicon);

			flag = true;
		}

		renderer.enableAO = false;
		return flag;
	}
	/**
	 * Renders the given texture to the bottom face of the block. Args: block, x, y, z, texture
	 */
	public void renderFaceYNeg(RenderBlocks renderer, Block p_147768_1_, double p_147768_2_, double p_147768_4_, double p_147768_6_, IIcon p_147768_8_)
	{
		Tessellator tessellator = Tessellator.instance;

		if (renderer.hasOverrideBlockTexture())
		{
			p_147768_8_ = renderer.overrideBlockTexture;
		}

		double d3 = p_147768_8_.getInterpolatedU(renderer.renderMinX * 16.0D);
		double d4 = p_147768_8_.getInterpolatedU(renderer.renderMaxX * 16.0D);
		double d5 = p_147768_8_.getInterpolatedV(renderer.renderMinZ * 16.0D);
		double d6 = p_147768_8_.getInterpolatedV(renderer.renderMaxZ * 16.0D);
		double d7;
		
		if (renderer.renderMinX < 0.0D || renderer.renderMaxX > 1.0D)
		{
			d3 = p_147768_8_.getMinU();
			d4 = p_147768_8_.getMaxU();
		}

		if (renderer.renderMinZ < 0.0D || renderer.renderMaxZ > 1.0D)
		{
			d5 = p_147768_8_.getMinV();
			d6 = p_147768_8_.getMaxV();
		}

		d7 = d4;
		double d8 = d3;
		double d9 = d5;
		double d10 = d6;

		if (renderer.uvRotateBottom == 2)
		{
			d3 = p_147768_8_.getInterpolatedU(renderer.renderMinZ * 16.0D);
			d5 = p_147768_8_.getInterpolatedV(16.0D - renderer.renderMaxX * 16.0D);
			d4 = p_147768_8_.getInterpolatedU(renderer.renderMaxZ * 16.0D);
			d6 = p_147768_8_.getInterpolatedV(16.0D - renderer.renderMinX * 16.0D);
			d9 = d5;
			d10 = d6;
			d7 = d3;
			d8 = d4;
			d5 = d6;
			d6 = d9;
		}
		else if (renderer.uvRotateBottom == 1)
		{
			d3 = p_147768_8_.getInterpolatedU(16.0D - renderer.renderMaxZ * 16.0D);
			d5 = p_147768_8_.getInterpolatedV(renderer.renderMinX * 16.0D);
			d4 = p_147768_8_.getInterpolatedU(16.0D - renderer.renderMinZ * 16.0D);
			d6 = p_147768_8_.getInterpolatedV(renderer.renderMaxX * 16.0D);
			d7 = d4;
			d8 = d3;
			d3 = d4;
			d4 = d8;
			d9 = d6;
			d10 = d5;
		}
		else if (renderer.uvRotateBottom == 3)
		{
			d3 = p_147768_8_.getInterpolatedU(16.0D - renderer.renderMinX * 16.0D);
			d4 = p_147768_8_.getInterpolatedU(16.0D - renderer.renderMaxX * 16.0D);
			d5 = p_147768_8_.getInterpolatedV(16.0D - renderer.renderMinZ * 16.0D);
			d6 = p_147768_8_.getInterpolatedV(16.0D - renderer.renderMaxZ * 16.0D);
			d7 = d4;
			d8 = d3;
			d9 = d5;
			d10 = d6;
		}

		double d11 = p_147768_2_ + renderer.renderMinX;
		double d12 = p_147768_2_ + renderer.renderMaxX;
		double d13 = p_147768_4_ + renderer.renderMinY;
		double d14 = p_147768_6_ + renderer.renderMinZ;
		double d15 = p_147768_6_ + renderer.renderMaxZ;

		if (renderer.renderFromInside)
		{
			d11 = p_147768_2_ + renderer.renderMaxX;
			d12 = p_147768_2_ + renderer.renderMinX;
		}

		if(uvFlipBottom) {
			double sw;
			
			if(renderer.uvRotateBottom == 1 || renderer.uvRotateBottom == 2) { // Side to side
				sw = d4;
				d4 = d7;
				d7 = sw;
				
				sw = d6;
				d6 = d9;
				d9 = sw;
				
				sw = d3;
				d3 = d8;
				d8 = sw;
				
				sw = d5;
				d5 = d10;
				d10 = sw;
			}

			if(renderer.uvRotateBottom != 1 && renderer.uvRotateBottom != 2) { // Bottom to top
				sw = d8;
				d8 = d4;
				d4 = sw;
				
				sw = d10;
				d10 = d6;
				d6 = sw;
				
				sw = d7;
				d7 = d3;
				d3 = sw;
				
				sw = d9;
				d9 = d5;
				d5 = sw;
			}
		}
		
		if (renderer.enableAO)
		{
			tessellator.setColorOpaque_F(renderer.colorRedTopLeft, renderer.colorGreenTopLeft, renderer.colorBlueTopLeft);
			tessellator.setBrightness(renderer.brightnessTopLeft);
			tessellator.addVertexWithUV(d11, d13, d15, d8, d10);
			tessellator.setColorOpaque_F(renderer.colorRedBottomLeft, renderer.colorGreenBottomLeft, renderer.colorBlueBottomLeft);
			tessellator.setBrightness(renderer.brightnessBottomLeft);
			tessellator.addVertexWithUV(d11, d13, d14, d3, d5);
			tessellator.setColorOpaque_F(renderer.colorRedBottomRight, renderer.colorGreenBottomRight, renderer.colorBlueBottomRight);
			tessellator.setBrightness(renderer.brightnessBottomRight);
			tessellator.addVertexWithUV(d12, d13, d14, d7, d9);
			tessellator.setColorOpaque_F(renderer.colorRedTopRight, renderer.colorGreenTopRight, renderer.colorBlueTopRight);
			tessellator.setBrightness(renderer.brightnessTopRight);
			tessellator.addVertexWithUV(d12, d13, d15, d4, d6);
		}
		else
		{
			tessellator.addVertexWithUV(d11, d13, d15, d8, d10);
			tessellator.addVertexWithUV(d11, d13, d14, d3, d5);
			tessellator.addVertexWithUV(d12, d13, d14, d7, d9);
			tessellator.addVertexWithUV(d12, d13, d15, d4, d6);
		}
	}

	/**
	 * Renders the given texture to the top face of the block. Args: block, x, y, z, texture
	 */
	public void renderFaceYPos(RenderBlocks renderer, Block p_147806_1_, double p_147806_2_, double p_147806_4_, double p_147806_6_, IIcon p_147806_8_)
	{
		Tessellator tessellator = Tessellator.instance;

		if (renderer.hasOverrideBlockTexture())
		{
			p_147806_8_ = renderer.overrideBlockTexture;
		}

		double d3 = p_147806_8_.getInterpolatedU(renderer.renderMinX * 16.0D);
		double d4 = p_147806_8_.getInterpolatedU(renderer.renderMaxX * 16.0D);
		double d5 = p_147806_8_.getInterpolatedV(renderer.renderMinZ * 16.0D);
		double d6 = p_147806_8_.getInterpolatedV(renderer.renderMaxZ * 16.0D);
		double d7;

		if (renderer.renderMinX < 0.0D || renderer.renderMaxX > 1.0D)
		{
			d3 = p_147806_8_.getMinU();
			d4 = p_147806_8_.getMaxU();
		}

		if (renderer.renderMinZ < 0.0D || renderer.renderMaxZ > 1.0D)
		{
			d5 = p_147806_8_.getMinV();
			d6 = p_147806_8_.getMaxV();
		}

		d7 = d4;
		double d8 = d3;
		double d9 = d5;
		double d10 = d6;

		if (renderer.uvRotateTop == 1)
		{
			d3 = p_147806_8_.getInterpolatedU(renderer.renderMinZ * 16.0D);
			d5 = p_147806_8_.getInterpolatedV(16.0D - renderer.renderMaxX * 16.0D);
			d4 = p_147806_8_.getInterpolatedU(renderer.renderMaxZ * 16.0D);
			d6 = p_147806_8_.getInterpolatedV(16.0D - renderer.renderMinX * 16.0D);
			d9 = d5;
			d10 = d6;
			d7 = d3;
			d8 = d4;
			d5 = d6;
			d6 = d9;
		}
		else if (renderer.uvRotateTop == 2)
		{
			d3 = p_147806_8_.getInterpolatedU(16.0D - renderer.renderMaxZ * 16.0D);
			d5 = p_147806_8_.getInterpolatedV(renderer.renderMinX * 16.0D);
			d4 = p_147806_8_.getInterpolatedU(16.0D - renderer.renderMinZ * 16.0D);
			d6 = p_147806_8_.getInterpolatedV(renderer.renderMaxX * 16.0D);
			d7 = d4;
			d8 = d3;
			d3 = d4;
			d4 = d8;
			d9 = d6;
			d10 = d5;
		}
		else if (renderer.uvRotateTop == 3)
		{
			d3 = p_147806_8_.getInterpolatedU(16.0D - renderer.renderMinX * 16.0D);
			d4 = p_147806_8_.getInterpolatedU(16.0D - renderer.renderMaxX * 16.0D);
			d5 = p_147806_8_.getInterpolatedV(16.0D - renderer.renderMinZ * 16.0D);
			d6 = p_147806_8_.getInterpolatedV(16.0D - renderer.renderMaxZ * 16.0D);
			d7 = d4;
			d8 = d3;
			d9 = d5;
			d10 = d6;
		}

		double d11 = p_147806_2_ + renderer.renderMinX;
		double d12 = p_147806_2_ + renderer.renderMaxX;
		double d13 = p_147806_4_ + renderer.renderMaxY;
		double d14 = p_147806_6_ + renderer.renderMinZ;
		double d15 = p_147806_6_ + renderer.renderMaxZ;

		if (renderer.renderFromInside)
		{
			d11 = p_147806_2_ + renderer.renderMaxX;
			d12 = p_147806_2_ + renderer.renderMinX;
		}

		if(uvFlipTop) {
			double sw;
			
			if(renderer.uvRotateTop == 1 || renderer.uvRotateTop == 2) { // Side to side
				sw = d4;
				d4 = d7;
				d7 = sw;
				
				sw = d6;
				d6 = d9;
				d9 = sw;
				
				sw = d3;
				d3 = d8;
				d8 = sw;
				
				sw = d5;
				d5 = d10;
				d10 = sw;
			}

			if(renderer.uvRotateTop != 1 && renderer.uvRotateTop != 2) { // Bottom to top
				sw = d8;
				d8 = d4;
				d4 = sw;
				
				sw = d10;
				d10 = d6;
				d6 = sw;
				
				sw = d7;
				d7 = d3;
				d3 = sw;
				
				sw = d9;
				d9 = d5;
				d5 = sw;
			}
		}
		
		if (renderer.enableAO)
		{
			tessellator.setColorOpaque_F(renderer.colorRedTopLeft, renderer.colorGreenTopLeft, renderer.colorBlueTopLeft);
			tessellator.setBrightness(renderer.brightnessTopLeft);
			tessellator.addVertexWithUV(d12, d13, d15, d4, d6);
			tessellator.setColorOpaque_F(renderer.colorRedBottomLeft, renderer.colorGreenBottomLeft, renderer.colorBlueBottomLeft);
			tessellator.setBrightness(renderer.brightnessBottomLeft);
			tessellator.addVertexWithUV(d12, d13, d14, d7, d9);
			tessellator.setColorOpaque_F(renderer.colorRedBottomRight, renderer.colorGreenBottomRight, renderer.colorBlueBottomRight);
			tessellator.setBrightness(renderer.brightnessBottomRight);
			tessellator.addVertexWithUV(d11, d13, d14, d3, d5);
			tessellator.setColorOpaque_F(renderer.colorRedTopRight, renderer.colorGreenTopRight, renderer.colorBlueTopRight);
			tessellator.setBrightness(renderer.brightnessTopRight);
			tessellator.addVertexWithUV(d11, d13, d15, d8, d10);
		}
		else
		{
			tessellator.addVertexWithUV(d12, d13, d15, d4, d6);
			tessellator.addVertexWithUV(d12, d13, d14, d7, d9);
			tessellator.addVertexWithUV(d11, d13, d14, d3, d5);
			tessellator.addVertexWithUV(d11, d13, d15, d8, d10);
		}
	}

	/**
	 * Renders the given texture to the north (z-negative) face of the block.  Args: block, x, y, z, texture
	 */
	public void renderFaceZNeg(RenderBlocks renderer, Block p_147761_1_, double p_147761_2_, double p_147761_4_, double p_147761_6_, IIcon p_147761_8_)
	{
		Tessellator tessellator = Tessellator.instance;

		if (renderer.hasOverrideBlockTexture())
		{
			p_147761_8_ = renderer.overrideBlockTexture;
		}

		double d3 = p_147761_8_.getInterpolatedU(renderer.renderMinX * 16.0D);
		double d4 = p_147761_8_.getInterpolatedU(renderer.renderMaxX * 16.0D);

		if (renderer.field_152631_f)
		{
			d4 = p_147761_8_.getInterpolatedU((1.0D - renderer.renderMinX) * 16.0D);
			d3 = p_147761_8_.getInterpolatedU((1.0D - renderer.renderMaxX) * 16.0D);
		}

		double d5 = p_147761_8_.getInterpolatedV(16.0D - renderer.renderMaxY * 16.0D);
		double d6 = p_147761_8_.getInterpolatedV(16.0D - renderer.renderMinY * 16.0D);
		double d7;

		if (renderer.renderMinX < 0.0D || renderer.renderMaxX > 1.0D)
		{
			d3 = p_147761_8_.getMinU();
			d4 = p_147761_8_.getMaxU();
		}

		if (renderer.renderMinY < 0.0D || renderer.renderMaxY > 1.0D)
		{
			d5 = p_147761_8_.getMinV();
			d6 = p_147761_8_.getMaxV();
		}

		d7 = d4;
		
		if (renderer.flipTexture)
		{
			d7 = d3;
			d3 = d4;
			d4 = d7;
		}
		
		double d8 = d3;
		double d9 = d5;
		double d10 = d6;

		if (renderer.uvRotateEast == 2)
		{
			d3 = p_147761_8_.getInterpolatedU(renderer.renderMinY * 16.0D);
			d4 = p_147761_8_.getInterpolatedU(renderer.renderMaxY * 16.0D);
			d5 = p_147761_8_.getInterpolatedV(16.0D - renderer.renderMinX * 16.0D);
			d6 = p_147761_8_.getInterpolatedV(16.0D - renderer.renderMaxX * 16.0D);
			d9 = d5;
			d10 = d6;
			d7 = d3;
			d8 = d4;
			d5 = d6;
			d6 = d9;
		}
		else if (renderer.uvRotateEast == 1)
		{
			d3 = p_147761_8_.getInterpolatedU(16.0D - renderer.renderMaxY * 16.0D);
			d4 = p_147761_8_.getInterpolatedU(16.0D - renderer.renderMinY * 16.0D);
			d5 = p_147761_8_.getInterpolatedV(renderer.renderMaxX * 16.0D);
			d6 = p_147761_8_.getInterpolatedV(renderer.renderMinX * 16.0D);
			d7 = d4;
			d8 = d3;
			d3 = d4;
			d4 = d8;
			d9 = d6;
			d10 = d5;
		}
		else if (renderer.uvRotateEast == 3)
		{
			d3 = p_147761_8_.getInterpolatedU(16.0D - renderer.renderMinX * 16.0D);
			d4 = p_147761_8_.getInterpolatedU(16.0D - renderer.renderMaxX * 16.0D);
			d5 = p_147761_8_.getInterpolatedV(renderer.renderMaxY * 16.0D);
			d6 = p_147761_8_.getInterpolatedV(renderer.renderMinY * 16.0D);
			d7 = d4;
			d8 = d3;
			d9 = d5;
			d10 = d6;
		}

		double d11 = p_147761_2_ + renderer.renderMinX;
		double d12 = p_147761_2_ + renderer.renderMaxX;
		double d13 = p_147761_4_ + renderer.renderMinY;
		double d14 = p_147761_4_ + renderer.renderMaxY;
		double d15 = p_147761_6_ + renderer.renderMinZ;

		if (renderer.renderFromInside)
		{
			d11 = p_147761_2_ + renderer.renderMaxX;
			d12 = p_147761_2_ + renderer.renderMinX;
		}

		if(uvFlipEast) {
			double sw;
			
			if(renderer.uvRotateEast == 0 || renderer.uvRotateEast == 3) { // Side to side
				sw = d8;
				d8 = d4;
				d4 = sw;
				
				sw = d10;
				d10 = d6;
				d6 = sw;
				
				sw = d7;
				d7 = d3;
				d3 = sw;
				
				sw = d9;
				d9 = d5;
				d5 = sw;
			}

			if(renderer.uvRotateEast != 0 && renderer.uvRotateEast != 3) { // Bottom to top
				sw = d4;
				d4 = d7;
				d7 = sw;
				
				sw = d6;
				d6 = d9;
				d9 = sw;
				
				sw = d3;
				d3 = d8;
				d8 = sw;
				
				sw = d5;
				d5 = d10;
				d10 = sw;
			}
		}

		if (renderer.enableAO)
		{
			tessellator.setColorOpaque_F(renderer.colorRedTopLeft, renderer.colorGreenTopLeft, renderer.colorBlueTopLeft);
			tessellator.setBrightness(renderer.brightnessTopLeft);
			tessellator.addVertexWithUV(d11, d14, d15, d7, d9);
			tessellator.setColorOpaque_F(renderer.colorRedBottomLeft, renderer.colorGreenBottomLeft, renderer.colorBlueBottomLeft);
			tessellator.setBrightness(renderer.brightnessBottomLeft);
			tessellator.addVertexWithUV(d12, d14, d15, d3, d5);
			tessellator.setColorOpaque_F(renderer.colorRedBottomRight, renderer.colorGreenBottomRight, renderer.colorBlueBottomRight);
			tessellator.setBrightness(renderer.brightnessBottomRight);
			tessellator.addVertexWithUV(d12, d13, d15, d8, d10);
			tessellator.setColorOpaque_F(renderer.colorRedTopRight, renderer.colorGreenTopRight, renderer.colorBlueTopRight);
			tessellator.setBrightness(renderer.brightnessTopRight);
			tessellator.addVertexWithUV(d11, d13, d15, d4, d6);
		}
		else
		{
			tessellator.addVertexWithUV(d11, d14, d15, d7, d9);
			tessellator.addVertexWithUV(d12, d14, d15, d3, d5);
			tessellator.addVertexWithUV(d12, d13, d15, d8, d10);
			tessellator.addVertexWithUV(d11, d13, d15, d4, d6);
		}
	}

	/**
	 * Renders the given texture to the south (z-positive) face of the block.  Args: block, x, y, z, texture
	 */
	public void renderFaceZPos(RenderBlocks renderer, Block p_147734_1_, double p_147734_2_, double p_147734_4_, double p_147734_6_, IIcon p_147734_8_)
	{
		Tessellator tessellator = Tessellator.instance;

		if (renderer.hasOverrideBlockTexture())
		{
			p_147734_8_ = renderer.overrideBlockTexture;
		}

		double d3 = p_147734_8_.getInterpolatedU(renderer.renderMinX * 16.0D);
		double d4 = p_147734_8_.getInterpolatedU(renderer.renderMaxX * 16.0D);
		double d5 = p_147734_8_.getInterpolatedV(16.0D - renderer.renderMaxY * 16.0D);
		double d6 = p_147734_8_.getInterpolatedV(16.0D - renderer.renderMinY * 16.0D);
		double d7;

		if (renderer.renderMinX < 0.0D || renderer.renderMaxX > 1.0D)
		{
			d3 = p_147734_8_.getMinU();
			d4 = p_147734_8_.getMaxU();
		}

		if (renderer.renderMinY < 0.0D || renderer.renderMaxY > 1.0D)
		{
			d5 = p_147734_8_.getMinV();
			d6 = p_147734_8_.getMaxV();
		}

		d7 = d4;
		
		if (renderer.flipTexture)
		{
			d7 = d3;
			d3 = d4;
			d4 = d7;
		}
		
		double d8 = d3;
		double d9 = d5;
		double d10 = d6;

		if (renderer.uvRotateWest == 1)
		{
			d3 = p_147734_8_.getInterpolatedU(renderer.renderMinY * 16.0D);
			d6 = p_147734_8_.getInterpolatedV(16.0D - renderer.renderMinX * 16.0D);
			d4 = p_147734_8_.getInterpolatedU(renderer.renderMaxY * 16.0D);
			d5 = p_147734_8_.getInterpolatedV(16.0D - renderer.renderMaxX * 16.0D);
			d9 = d5;
			d10 = d6;
			d7 = d3;
			d8 = d4;
			d5 = d6;
			d6 = d9;
		}
		else if (renderer.uvRotateWest == 2)
		{
			d3 = p_147734_8_.getInterpolatedU(16.0D - renderer.renderMaxY * 16.0D);
			d5 = p_147734_8_.getInterpolatedV(renderer.renderMinX * 16.0D);
			d4 = p_147734_8_.getInterpolatedU(16.0D - renderer.renderMinY * 16.0D);
			d6 = p_147734_8_.getInterpolatedV(renderer.renderMaxX * 16.0D);
			d7 = d4;
			d8 = d3;
			d3 = d4;
			d4 = d8;
			d9 = d6;
			d10 = d5;
		}
		else if (renderer.uvRotateWest == 3)
		{
			d3 = p_147734_8_.getInterpolatedU(16.0D - renderer.renderMinX * 16.0D);
			d4 = p_147734_8_.getInterpolatedU(16.0D - renderer.renderMaxX * 16.0D);
			d5 = p_147734_8_.getInterpolatedV(renderer.renderMaxY * 16.0D);
			d6 = p_147734_8_.getInterpolatedV(renderer.renderMinY * 16.0D);
			d7 = d4;
			d8 = d3;
			d9 = d5;
			d10 = d6;
		}

		double d11 = p_147734_2_ + renderer.renderMinX;
		double d12 = p_147734_2_ + renderer.renderMaxX;
		double d13 = p_147734_4_ + renderer.renderMinY;
		double d14 = p_147734_4_ + renderer.renderMaxY;
		double d15 = p_147734_6_ + renderer.renderMaxZ;

		if (renderer.renderFromInside)
		{
			d11 = p_147734_2_ + renderer.renderMaxX;
			d12 = p_147734_2_ + renderer.renderMinX;
		}

		if(uvFlipWest) {
			double sw;
			
			if(renderer.uvRotateWest == 1 || renderer.uvRotateWest == 2) { // Side to side
				sw = d4;
				d4 = d7;
				d7 = sw;
				
				sw = d6;
				d6 = d9;
				d9 = sw;
				
				sw = d3;
				d3 = d8;
				d8 = sw;
				
				sw = d5;
				d5 = d10;
				d10 = sw;
			}

			if(renderer.uvRotateBottom != 1 && renderer.uvRotateBottom != 2) { // Bottom to top
				sw = d8;
				d8 = d4;
				d4 = sw;
				
				sw = d10;
				d10 = d6;
				d6 = sw;
				
				sw = d7;
				d7 = d3;
				d3 = sw;
				
				sw = d9;
				d9 = d5;
				d5 = sw;
			}
		}

		if (renderer.enableAO)
		{
			tessellator.setColorOpaque_F(renderer.colorRedTopLeft, renderer.colorGreenTopLeft, renderer.colorBlueTopLeft);
			tessellator.setBrightness(renderer.brightnessTopLeft);
			tessellator.addVertexWithUV(d11, d14, d15, d3, d5);
			tessellator.setColorOpaque_F(renderer.colorRedBottomLeft, renderer.colorGreenBottomLeft, renderer.colorBlueBottomLeft);
			tessellator.setBrightness(renderer.brightnessBottomLeft);
			tessellator.addVertexWithUV(d11, d13, d15, d8, d10);
			tessellator.setColorOpaque_F(renderer.colorRedBottomRight, renderer.colorGreenBottomRight, renderer.colorBlueBottomRight);
			tessellator.setBrightness(renderer.brightnessBottomRight);
			tessellator.addVertexWithUV(d12, d13, d15, d4, d6);
			tessellator.setColorOpaque_F(renderer.colorRedTopRight, renderer.colorGreenTopRight, renderer.colorBlueTopRight);
			tessellator.setBrightness(renderer.brightnessTopRight);
			tessellator.addVertexWithUV(d12, d14, d15, d7, d9);
		}
		else
		{
			tessellator.addVertexWithUV(d11, d14, d15, d3, d5);
			tessellator.addVertexWithUV(d11, d13, d15, d8, d10);
			tessellator.addVertexWithUV(d12, d13, d15, d4, d6);
			tessellator.addVertexWithUV(d12, d14, d15, d7, d9);
		}
	}

	/**
	 * Renders the given texture to the west (x-negative) face of the block.  Args: block, x, y, z, texture
	 */
	public void renderFaceXNeg(RenderBlocks renderer, Block p_147798_1_, double p_147798_2_, double p_147798_4_, double p_147798_6_, IIcon p_147798_8_)
	{
		Tessellator tessellator = Tessellator.instance;

		if (renderer.hasOverrideBlockTexture())
		{
			p_147798_8_ = renderer.overrideBlockTexture;
		}

		double d3 = p_147798_8_.getInterpolatedU(renderer.renderMinZ * 16.0D);
		double d4 = p_147798_8_.getInterpolatedU(renderer.renderMaxZ * 16.0D);
		double d5 = p_147798_8_.getInterpolatedV(16.0D - renderer.renderMaxY * 16.0D);
		double d6 = p_147798_8_.getInterpolatedV(16.0D - renderer.renderMinY * 16.0D);
		double d7;

		if (renderer.renderMinZ < 0.0D || renderer.renderMaxZ > 1.0D)
		{
			d3 = p_147798_8_.getMinU();
			d4 = p_147798_8_.getMaxU();
		}

		if (renderer.renderMinY < 0.0D || renderer.renderMaxY > 1.0D)
		{
			d5 = p_147798_8_.getMinV();
			d6 = p_147798_8_.getMaxV();
		}

		d7 = d4;
		
		if (renderer.flipTexture)
		{
			d7 = d3;
			d3 = d4;
			d4 = d7;
		}
		
		double d8 = d3;
		double d9 = d5;
		double d10 = d6;

		if (renderer.uvRotateNorth == 1)
		{
			d3 = p_147798_8_.getInterpolatedU(renderer.renderMinY * 16.0D);
			d5 = p_147798_8_.getInterpolatedV(16.0D - renderer.renderMaxZ * 16.0D);
			d4 = p_147798_8_.getInterpolatedU(renderer.renderMaxY * 16.0D);
			d6 = p_147798_8_.getInterpolatedV(16.0D - renderer.renderMinZ * 16.0D);
			d9 = d5;
			d10 = d6;
			d7 = d3;
			d8 = d4;
			d5 = d6;
			d6 = d9;
		}
		else if (renderer.uvRotateNorth == 2)
		{
			d3 = p_147798_8_.getInterpolatedU(16.0D - renderer.renderMaxY * 16.0D);
			d5 = p_147798_8_.getInterpolatedV(renderer.renderMinZ * 16.0D);
			d4 = p_147798_8_.getInterpolatedU(16.0D - renderer.renderMinY * 16.0D);
			d6 = p_147798_8_.getInterpolatedV(renderer.renderMaxZ * 16.0D);
			d7 = d4;
			d8 = d3;
			d3 = d4;
			d4 = d8;
			d9 = d6;
			d10 = d5;
		}
		else if (renderer.uvRotateNorth == 3)
		{
			d3 = p_147798_8_.getInterpolatedU(16.0D - renderer.renderMinZ * 16.0D);
			d4 = p_147798_8_.getInterpolatedU(16.0D - renderer.renderMaxZ * 16.0D);
			d5 = p_147798_8_.getInterpolatedV(renderer.renderMaxY * 16.0D);
			d6 = p_147798_8_.getInterpolatedV(renderer.renderMinY * 16.0D);
			d7 = d4;
			d8 = d3;
			d9 = d5;
			d10 = d6;
		}

		double d11 = p_147798_2_ + renderer.renderMinX;
		double d12 = p_147798_4_ + renderer.renderMinY;
		double d13 = p_147798_4_ + renderer.renderMaxY;
		double d14 = p_147798_6_ + renderer.renderMinZ;
		double d15 = p_147798_6_ + renderer.renderMaxZ;

		if (renderer.renderFromInside)
		{
			d14 = p_147798_6_ + renderer.renderMaxZ;
			d15 = p_147798_6_ + renderer.renderMinZ;
		}

		if(uvFlipNorth) {
			double sw;
			
			if(renderer.uvRotateNorth == 0 || renderer.uvRotateNorth == 3) { // Side to side
				sw = d8;
				d8 = d4;
				d4 = sw;
				
				sw = d10;
				d10 = d6;
				d6 = sw;
				
				sw = d7;
				d7 = d3;
				d3 = sw;
				
				sw = d9;
				d9 = d5;
				d5 = sw;
			}

			if(renderer.uvRotateNorth != 0 && renderer.uvRotateNorth != 3) { // Bottom to top
				sw = d4;
				d4 = d7;
				d7 = sw;
				
				sw = d6;
				d6 = d9;
				d9 = sw;
				
				sw = d3;
				d3 = d8;
				d8 = sw;
				
				sw = d5;
				d5 = d10;
				d10 = sw;
			}
		}

		if (renderer.enableAO)
		{
			tessellator.setColorOpaque_F(renderer.colorRedTopLeft, renderer.colorGreenTopLeft, renderer.colorBlueTopLeft);
			tessellator.setBrightness(renderer.brightnessTopLeft);
			tessellator.addVertexWithUV(d11, d13, d15, d7, d9);
			tessellator.setColorOpaque_F(renderer.colorRedBottomLeft, renderer.colorGreenBottomLeft, renderer.colorBlueBottomLeft);
			tessellator.setBrightness(renderer.brightnessBottomLeft);
			tessellator.addVertexWithUV(d11, d13, d14, d3, d5);
			tessellator.setColorOpaque_F(renderer.colorRedBottomRight, renderer.colorGreenBottomRight, renderer.colorBlueBottomRight);
			tessellator.setBrightness(renderer.brightnessBottomRight);
			tessellator.addVertexWithUV(d11, d12, d14, d8, d10);
			tessellator.setColorOpaque_F(renderer.colorRedTopRight, renderer.colorGreenTopRight, renderer.colorBlueTopRight);
			tessellator.setBrightness(renderer.brightnessTopRight);
			tessellator.addVertexWithUV(d11, d12, d15, d4, d6);
		}
		else
		{
			tessellator.addVertexWithUV(d11, d13, d15, d7, d9);
			tessellator.addVertexWithUV(d11, d13, d14, d3, d5);
			tessellator.addVertexWithUV(d11, d12, d14, d8, d10);
			tessellator.addVertexWithUV(d11, d12, d15, d4, d6);
		}
	}

	/**
	 * Renders the given texture to the east (x-positive) face of the block.  Args: block, x, y, z, texture
	 */
	public void renderFaceXPos(RenderBlocks renderer, Block p_147764_1_, double p_147764_2_, double p_147764_4_, double p_147764_6_, IIcon p_147764_8_)
	{
		Tessellator tessellator = Tessellator.instance;

		if (renderer.hasOverrideBlockTexture())
		{
			p_147764_8_ = renderer.overrideBlockTexture;
		}

		double d3 = p_147764_8_.getInterpolatedU(renderer.renderMinZ * 16.0D);
		double d4 = p_147764_8_.getInterpolatedU(renderer.renderMaxZ * 16.0D);

		if (renderer.field_152631_f)
		{
			d4 = p_147764_8_.getInterpolatedU((1.0D - renderer.renderMinZ) * 16.0D);
			d3 = p_147764_8_.getInterpolatedU((1.0D - renderer.renderMaxZ) * 16.0D);
		}

		double d5 = p_147764_8_.getInterpolatedV(16.0D - renderer.renderMaxY * 16.0D);
		double d6 = p_147764_8_.getInterpolatedV(16.0D - renderer.renderMinY * 16.0D);
		double d7;

		if (renderer.renderMinZ < 0.0D || renderer.renderMaxZ > 1.0D)
		{
			d3 = p_147764_8_.getMinU();
			d4 = p_147764_8_.getMaxU();
		}

		if (renderer.renderMinY < 0.0D || renderer.renderMaxY > 1.0D)
		{
			d5 = p_147764_8_.getMinV();
			d6 = p_147764_8_.getMaxV();
		}

		d7 = d4;
		
		if (renderer.flipTexture)
		{
			d7 = d3;
			d3 = d4;
			d4 = d7;
		}
		
		double d8 = d3;
		double d9 = d5;
		double d10 = d6;

		if (renderer.uvRotateSouth == 2)
		{
			d3 = p_147764_8_.getInterpolatedU(renderer.renderMinY * 16.0D);
			d5 = p_147764_8_.getInterpolatedV(16.0D - renderer.renderMinZ * 16.0D);
			d4 = p_147764_8_.getInterpolatedU(renderer.renderMaxY * 16.0D);
			d6 = p_147764_8_.getInterpolatedV(16.0D - renderer.renderMaxZ * 16.0D);
			d9 = d5;
			d10 = d6;
			d7 = d3;
			d8 = d4;
			d5 = d6;
			d6 = d9;
		}
		else if (renderer.uvRotateSouth == 1)
		{
			d3 = p_147764_8_.getInterpolatedU(16.0D - renderer.renderMaxY * 16.0D);
			d5 = p_147764_8_.getInterpolatedV(renderer.renderMaxZ * 16.0D);
			d4 = p_147764_8_.getInterpolatedU(16.0D - renderer.renderMinY * 16.0D);
			d6 = p_147764_8_.getInterpolatedV(renderer.renderMinZ * 16.0D);
			d7 = d4;
			d8 = d3;
			d3 = d4;
			d4 = d8;
			d9 = d6;
			d10 = d5;
		}
		else if (renderer.uvRotateSouth == 3)
		{
			d3 = p_147764_8_.getInterpolatedU(16.0D - renderer.renderMinZ * 16.0D);
			d4 = p_147764_8_.getInterpolatedU(16.0D - renderer.renderMaxZ * 16.0D);
			d5 = p_147764_8_.getInterpolatedV(renderer.renderMaxY * 16.0D);
			d6 = p_147764_8_.getInterpolatedV(renderer.renderMinY * 16.0D);
			d7 = d4;
			d8 = d3;
			d9 = d5;
			d10 = d6;
		}

		double d11 = p_147764_2_ + renderer.renderMaxX;
		double d12 = p_147764_4_ + renderer.renderMinY;
		double d13 = p_147764_4_ + renderer.renderMaxY;
		double d14 = p_147764_6_ + renderer.renderMinZ;
		double d15 = p_147764_6_ + renderer.renderMaxZ;

		if (renderer.renderFromInside)
		{
			d14 = p_147764_6_ + renderer.renderMaxZ;
			d15 = p_147764_6_ + renderer.renderMinZ;
		}

		if(uvFlipSouth) {
			double sw;
			
			if(renderer.uvRotateSouth == 0 || renderer.uvRotateSouth == 3) { // Side to side
				sw = d8;
				d8 = d4;
				d4 = sw;
				
				sw = d10;
				d10 = d6;
				d6 = sw;
				
				sw = d7;
				d7 = d3;
				d3 = sw;
				
				sw = d9;
				d9 = d5;
				d5 = sw;
			}

			if(renderer.uvRotateSouth != 0 && renderer.uvRotateSouth != 3) { // Bottom to top
				sw = d4;
				d4 = d7;
				d7 = sw;
				
				sw = d6;
				d6 = d9;
				d9 = sw;
				
				sw = d3;
				d3 = d8;
				d8 = sw;
				
				sw = d5;
				d5 = d10;
				d10 = sw;
			}
		}

		if (renderer.enableAO)
		{
			tessellator.setColorOpaque_F(renderer.colorRedTopLeft, renderer.colorGreenTopLeft, renderer.colorBlueTopLeft);
			tessellator.setBrightness(renderer.brightnessTopLeft);
			tessellator.addVertexWithUV(d11, d12, d15, d8, d10);
			tessellator.setColorOpaque_F(renderer.colorRedBottomLeft, renderer.colorGreenBottomLeft, renderer.colorBlueBottomLeft);
			tessellator.setBrightness(renderer.brightnessBottomLeft);
			tessellator.addVertexWithUV(d11, d12, d14, d4, d6);
			tessellator.setColorOpaque_F(renderer.colorRedBottomRight, renderer.colorGreenBottomRight, renderer.colorBlueBottomRight);
			tessellator.setBrightness(renderer.brightnessBottomRight);
			tessellator.addVertexWithUV(d11, d13, d14, d7, d9);
			tessellator.setColorOpaque_F(renderer.colorRedTopRight, renderer.colorGreenTopRight, renderer.colorBlueTopRight);
			tessellator.setBrightness(renderer.brightnessTopRight);
			tessellator.addVertexWithUV(d11, d13, d15, d3, d5);
		}
		else
		{
			tessellator.addVertexWithUV(d11, d12, d15, d8, d10);
			tessellator.addVertexWithUV(d11, d12, d14, d4, d6);
			tessellator.addVertexWithUV(d11, d13, d14, d7, d9);
			tessellator.addVertexWithUV(d11, d13, d15, d3, d5);
		}
	}
}
