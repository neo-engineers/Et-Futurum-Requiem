package ganymedes01.etfuturum.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ganymedes01.etfuturum.ModItems;
import ganymedes01.etfuturum.configuration.configs.ConfigBlocksItems;
import ganymedes01.etfuturum.core.utils.Utils;
import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

public class BlockBeetroot extends BlockCrops implements IConfigurable {

	@SideOnly(Side.CLIENT)
	private IIcon[] icons;

	public BlockBeetroot() {
		setCreativeTab(null);
		setBlockTextureName("beetroots");
		setBlockName(Utils.getUnlocalisedName("beetroots"));
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
		if (meta < 7) {
			if (meta == 6)
				meta = 5;
			return icons[meta >> 1];
		}
		return icons[3];
	}

	@Override
	protected Item func_149866_i() {
		return ModItems.beetroot_seeds;
	}

	@Override
	protected Item func_149865_P() {
		return ModItems.beetroot;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister reg) {
		icons = new IIcon[4];
		for (int i = 0; i < icons.length; i++)
			icons[i] = reg.registerIcon(getTextureName() + "_stage_" + i);
	}

	@Override
	public boolean isEnabled() {
		return ConfigBlocksItems.enableBeetroot;
	}
}