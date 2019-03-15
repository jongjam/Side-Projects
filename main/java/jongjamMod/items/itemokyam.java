package jongjamMod.items;

import jongjamMod.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class itemokyam extends ItemFood {
	
	public itemokyam() {
		super(20, 1.0F, true);
		setUnlocalizedName(Reference.TutorialItems.OKYAM.getUnlocalizedName());
		setRegistryName(Reference.TutorialItems.OKYAM.getRegistryName());
	}

}
