package mod.ores;

import java.util.Random;

import mod.main.MoreMain;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class RadioactiveCoalOre extends BlockOre{

	public RadioactiveCoalOre(int par1, Material par2Material) {
		super(par1);
		// TODO Auto-generated constructor stub
		this.setHardness(2.75F);
		this.setStepSound(Block.soundStoneFootstep);
		this.setUnlocalizedName("RadioactiveCoalOre");
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
	@Override
	public void registerIcons(IconRegister reg) {
		this.blockIcon = reg.registerIcon("More:radioactivecoalore");
	}
	public int idDropped(int par1, Random par2Random, int par3){
		return MoreMain.radioactiveCoal.itemID;
	}
	public int quantityDropped(int par1, Random par2Random, int par3) {
		return 1;
		
	}	

}
