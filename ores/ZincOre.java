package mod.ores;

import java.util.Random;

import mod.main.MoreMain;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.texture.IconRegister;

public class ZincOre extends BlockOre{

	public ZincOre(int par1, Material par2Material) {
		super(par1);
		// TODO Auto-generated constructor stub
		this.setHardness(2.25F);
		this.setStepSound(Block.soundStoneFootstep);
		this.setUnlocalizedName("ZincOre");
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
		@Override
		public void registerIcons(IconRegister reg) {
			this.blockIcon = reg.registerIcon("More:zincore");
		}
}
