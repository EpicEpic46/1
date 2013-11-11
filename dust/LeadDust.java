package mod.dust;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class LeadDust extends Item{

	public LeadDust(int par1) {
		super(par1);
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setMaxStackSize(64);
		this.setUnlocalizedName("LeadDust");
	}
	@Override
	public void registerIcons(IconRegister reg) {
		this.itemIcon = reg.registerIcon("More:LeadDust");
	}
}
