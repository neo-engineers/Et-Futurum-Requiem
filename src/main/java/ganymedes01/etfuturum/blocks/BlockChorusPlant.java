package ganymedes01.etfuturum.blocks;

import java.util.Random;

import ganymedes01.etfuturum.EtFuturum;
import ganymedes01.etfuturum.ModBlocks;
import ganymedes01.etfuturum.ModItems;
import ganymedes01.etfuturum.configuration.configs.ConfigBlocksItems;
import ganymedes01.etfuturum.core.utils.Utils;
import ganymedes01.etfuturum.lib.RenderIDs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockChorusPlant extends Block implements IConfigurable {

	public BlockChorusPlant() {
		super(Material.plants);
		setHardness(0.5F);
		setStepSound(soundTypeWood);
		setBlockTextureName("chorus_plant");
		setBlockName(Utils.getUnlocalisedName("chorus_plant"));
		setCreativeTab(isEnabled() ? EtFuturum.creativeTabBlocks : null);
	}

	//Come back to: Make it so the dragon can destroy the fruits if the new end is on
	@Override
	public boolean canEntityDestroy(IBlockAccess world, int x, int y, int z, Entity entity) {
		return !(entity instanceof EntityDragon);
	}

	public void setBlockBoundsBasedOnState(IBlockAccess world, int x, int y, int z)
	{
		float down = canConnectTo(world, x, y-1, z) ? 0.0F : 0.1875F;
		float up = canConnectTo(world, x, y+1, z) ? 1.0F : 0.8125F;
		float west = canConnectTo(world, x-1, y, z) ? 0.0F : 0.1875F;
		float east = canConnectTo(world, x+1, y, z) ? 1.0F : 0.8125F;
		float north = canConnectTo(world, x, y, z-1) ? 0.0F : 0.1875F;
		float south = canConnectTo(world, x, y, z+1) ? 1.0F : 0.8125F;
		setBlockBounds(west, down, north, east, up, south);
	}
	
	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z)
	{
		float down = canConnectTo(world, x, y-1, z) ? 0.0F : 0.1875F;
		float up = canConnectTo(world, x, y+1, z) ? 1.0F : 0.8125F;
		float west = canConnectTo(world, x-1, y, z) ? 0.0F : 0.1875F;
		float east = canConnectTo(world, x+1, y, z) ? 1.0F : 0.8125F;
		float north = canConnectTo(world, x, y, z-1) ? 0.0F : 0.1875F;
		float south = canConnectTo(world, x, y, z+1) ? 1.0F : 0.8125F;
		return AxisAlignedBB.getBoundingBox(x+west, y+down, z+north, x+east, y+up, z+south);
	}
	
	@Override
	public AxisAlignedBB getSelectedBoundingBoxFromPool(World world, int x, int y, int z) {
		return this.getCollisionBoundingBoxFromPool(world, x, y, z);
	}
	
	public boolean canConnectTo(IBlockAccess world, int x, int y, int z) {
		Block block = world.getBlock(x, y, z);
		return block == this || block == ModBlocks.chorus_flower || canPlaceOn(block);
	}

	@Override
	public boolean canPlaceBlockAt(World world, int x, int y, int z)
	{
		return super.canPlaceBlockAt(world, x, y, z) || this.canSurviveAt(world, x, y, z);
	}

	@Override
	public void updateTick(World world, int x, int y, int z, Random random)
	{
		if (!this.canSurviveAt(world, x, y, z))
		{
			world.func_147480_a(x, y, z, true);
		}
	}

	@Override
	public void onNeighborBlockChange(World world, int x, int y, int z, Block p_149695_5_)
	{
		if (!this.canSurviveAt(world, x, y, z))
		{
			world.scheduleBlockUpdate(x, y, z, this, 1);
		}
	}

	public boolean canSurviveAt(World world, int x, int y, int z)
	{
		boolean flag = world.isAirBlock(x, y+1, z);
		boolean flag1 = world.isAirBlock(x, y-1, z);

		for (EnumFacing enumfacing : EnumFacing.values())
		{
			if(enumfacing.getFrontOffsetY() != 0) continue;
			
			Block block = world.getBlock(x+enumfacing.getFrontOffsetX(), y, z+enumfacing.getFrontOffsetZ());

			if (block == this)
			{
				if (!flag && !flag1)
				{
					return false;
				}

				Block block1 = world.getBlock(x+enumfacing.getFrontOffsetX(), y-1, z+enumfacing.getFrontOffsetZ());

				if (block1 == this || canPlaceOn(block1))
				{
					return true;
				}
			}
		}

		Block block2 = world.getBlock(x, y-1, z);
		return block2 == this || canPlaceOn(block2);
	}
	
	public static boolean canPlaceOn(Block block) {
		return block == Blocks.end_stone || block == ExternalContent.enderlicious_end_rock || block == ExternalContent.hee_end_stone;
	}

	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	protected boolean canSilkHarvest() {
		return false;
	}

	@Override
	public int getRenderType() {
		return RenderIDs.CHORUS_PLANT;
	}

	@Override
	public Item getItemDropped(int meta, Random rand, int fortune) {
		return ModItems.chorus_fruit;
	}

	@Override
	public boolean isEnabled() {
		return ConfigBlocksItems.enableChorusFruit;
	}
}