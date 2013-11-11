package mod.ores;

import java.util.Random;

import mod.main.MoreMain;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.World;

public class SulfurOre extends BlockOre{

	public SulfurOre(int par1, Material par2Material) {
		super(par1);
		// TODO Auto-generated constructor stub
		this.setHardness(2.0F);
		this.setStepSound(Block.soundStoneFootstep);
		this.setUnlocalizedName("SulfurOre");
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
	@Override
	public void registerIcons(IconRegister reg) {
		this.blockIcon = reg.registerIcon("More:SulfurOre");
	
	}
	public int idDropped(int par1, Random par2Random, int par3){
		return MoreMain.sulfurPowder.itemID;
	}
	public int quantityDropped(int par1, Random par2Random, int par3) {
		return 1;
		
	}	

}
