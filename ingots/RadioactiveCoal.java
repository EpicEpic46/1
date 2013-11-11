package mod.ingots;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class RadioactiveCoal extends Item{

	public RadioactiveCoal(int par1) {
		super(par1);
	this.setCreativeTab(CreativeTabs.tabMaterials);
	this.setMaxStackSize(64);
	this.setUnlocalizedName("radioactiveCoal");
	}
	@Override
	public void registerIcons(IconRegister reg) {
		this.itemIcon = reg.registerIcon("More:radioactiveCoal");
	}

}
