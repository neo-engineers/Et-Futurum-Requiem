package ganymedes01.etfuturum.blocks;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ganymedes01.etfuturum.EtFuturum;
import ganymedes01.etfuturum.configuration.configs.ConfigBlocksItems;
import ganymedes01.etfuturum.core.utils.Utils;
import ganymedes01.etfuturum.lib.GUIsID;
import ganymedes01.etfuturum.lib.RenderIDs;
import ganymedes01.etfuturum.tileentities.TileEntityBarrel;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockPistonBase;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Facing;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockBarrel extends BlockContainer implements IConfigurable {

	public BlockBarrel() {
		super(Material.wood);
		this.setStepSound(soundTypeWood);
		this.setHardness(2.5F);
		this.setHarvestLevel("axe", 0);
		this.setResistance(2.5F);
		this.setBlockName(Utils.getUnlocalisedName("barrel"));
		this.setBlockTextureName("barrel");
		this.useNeighborBrightness = true;
		this.setLightOpacity(500);
		this.setCreativeTab(isEnabled() ? EtFuturum.creativeTabBlocks : null);
	}
	@SideOnly(Side.CLIENT)
	private IIcon innerTopIcon;
	@SideOnly(Side.CLIENT)
	private IIcon bottomIcon;
	@SideOnly(Side.CLIENT)
	private IIcon topIcon;

	@Override
	public int getRenderType()
	{
		return RenderIDs.BARREL;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int p_149691_1_, int p_149691_2_)
	{
		int k = BlockPistonBase.getPistonOrientation(p_149691_2_);
		return (k) > 5 ? p_149691_2_ > 7 ? this.innerTopIcon : this.topIcon : (p_149691_1_ == k ? (p_149691_2_ > 7 ? this.innerTopIcon : this.topIcon) : (p_149691_1_ == Facing.oppositeSide[k] ? this.bottomIcon : this.blockIcon));
	}
	
	@Override
	public void onBlockPlacedBy(World p_149689_1_, int p_149689_2_, int p_149689_3_, int p_149689_4_, EntityLivingBase p_149689_5_, ItemStack p_149689_6_)
	{
		int l = BlockPistonBase.determineOrientation(p_149689_1_, p_149689_2_, p_149689_3_, p_149689_4_, p_149689_5_);
		p_149689_1_.setBlockMetadataWithNotify(p_149689_2_, p_149689_3_, p_149689_4_, l, 2);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister i)
	{
		this.blockIcon = i.registerIcon(getTextureName() + "_side");
		this.topIcon = i.registerIcon(getTextureName() + "_top");
		this.innerTopIcon = i.registerIcon(getTextureName() + "_top_open");
		this.bottomIcon = i.registerIcon(getTextureName() + "_bottom");
	}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
	{
		if (world.isRemote)
		{
			return true;
		}
		player.openGui(EtFuturum.instance, GUIsID.BARREL, world, x, y, z);
		return true;
	}

	public IInventory func_149951_m(World p_149951_1_, int p_149951_2_, int p_149951_3_, int p_149951_4_)
	{
		Object object = p_149951_1_.getTileEntity(p_149951_2_, p_149951_3_, p_149951_4_);

		if(object == null)
			return null;
		
		return (IInventory)object;
	}
	
	private final Random field_149955_b = new Random();
	@Override
	public void breakBlock(World world, int x, int y, int z, Block block, int meta) {
		TileEntityBarrel tileentitychest = (TileEntityBarrel)world.getTileEntity(x, y, z);

		if (tileentitychest != null)
		{
			for (int i1 = 0; i1 < tileentitychest.getSizeInventory(); ++i1)
			{
				ItemStack itemstack = tileentitychest.getStackInSlot(i1);

				if (itemstack != null)
				{
					float f = this.field_149955_b.nextFloat() * 0.8F + 0.1F;
					float f1 = this.field_149955_b.nextFloat() * 0.8F + 0.1F;
					EntityItem entityitem;

					for (float f2 = this.field_149955_b.nextFloat() * 0.8F + 0.1F; itemstack.stackSize > 0; world.spawnEntityInWorld(entityitem))
					{
						int j1 = this.field_149955_b.nextInt(21) + 10;

						if (j1 > itemstack.stackSize)
						{
							j1 = itemstack.stackSize;
						}

						itemstack.stackSize -= j1;
						entityitem = new EntityItem(world, x + f, y + f1, z + f2, new ItemStack(itemstack.getItem(), j1, itemstack.getItemDamage()));
						float f3 = 0.05F;
						entityitem.motionX = (float)this.field_149955_b.nextGaussian() * f3;
						entityitem.motionY = (float)this.field_149955_b.nextGaussian() * f3 + 0.2F;
						entityitem.motionZ = (float)this.field_149955_b.nextGaussian() * f3;

						if (itemstack.hasTagCompound())
						{
							entityitem.getEntityItem().setTagCompound((NBTTagCompound)itemstack.getTagCompound().copy());
						}
					}
				}
			}

			world.func_147453_f(x, y, z, block);
		}

		super.breakBlock(world, x, y, z, block, meta);
		
	}

	/**
	 * Returns a new instance of a block's tile entity class. Called on placing the block.
	 */
	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_)
	{
		return new TileEntityBarrel();
	}

	@Override
	public boolean isEnabled() {
		return ConfigBlocksItems.enableBarrel;
	}

}
