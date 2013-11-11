package mod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class SilverBlock extends Block{

public SilverBlock(int par1, Material par2Material) {
		super(par1, par2Material);
		// TODO Auto-generated constructor stub
		this.setHardness(3.0F);
		this.setStepSound(Block.soundMetalFootstep);
		this.setUnlocalizedName("silverBlock");
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
	@Override
	public void registerIcons(IconRegister reg) {
		this.blockIcon = reg.registerIcon("More:SilverBlock");
	}
}
