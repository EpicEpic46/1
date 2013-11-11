package mod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class ChromiumBlock extends Block{

	public ChromiumBlock(int par1, Material par2Material) {
		super(par1, par2Material);
		// TODO Auto-generated constructor stub
	this.setCreativeTab(CreativeTabs.tabBlock);
	this.setHardness(3.0F);
	this.setStepSound(soundMetalFootstep);
	this.setUnlocalizedName("chromiumBlock");
	}
	@Override
	public void registerIcons(IconRegister reg) {
		this.blockIcon = reg.registerIcon("More:ChromiumBlock");
	}
}
