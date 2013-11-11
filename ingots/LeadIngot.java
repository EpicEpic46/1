package mod.ingots;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class LeadIngot extends Item{

	public LeadIngot(int par1) {
		super(par1);
		// TODO Auto-generated constructor stub
	this.setMaxStackSize(64);
	this.setCreativeTab(CreativeTabs.tabMaterials);
	this.setUnlocalizedName("leadIngot");
	
	}
	@Override
	public void registerIcons(IconRegister reg) {
		this.itemIcon = reg.registerIcon("More:LeadIngot");
	}
}
