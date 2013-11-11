package mod.ores;

import java.util.Random;

import mod.main.MoreMain;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class CobaltOre extends BlockOre{

	public CobaltOre(int par1, Material par2Material) {
		super(par1);
		// TODO Auto-generated constructor stub
		this.setHardness(3.0F);
		this.setStepSound(Block.soundStoneFootstep);
		this.setUnlocalizedName("CobaltOre");
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
	@Override
	public void registerIcons(IconRegister reg) {
		this.blockIcon = reg.registerIcon("More:CobaltOre");
	}
}