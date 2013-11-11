package mod.main;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class Fuels implements IFuelHandler{
	
	public int getBurnTime(ItemStack fuel) {
		// TODO Auto-generated method stub
		if (fuel.itemID == MoreMain.radioactiveCoal.itemID) {
			return 26000;
			//130blocks
		}
		return 0;
	}

}
