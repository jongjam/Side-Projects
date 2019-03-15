package jongjamMod.init;

import jongjamMod.Reference;
import jongjamMod.items.itemokyam;
import jongjamMod.items.ItemYam;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item yam;
	public static Item okyam;
	public static void init() {
		//initializes object
		yam = new ItemYam();
		okyam = new itemokyam();
	}
	
	public static void register() {
		//registers the item into the game
		GameRegistry.register(yam);
		GameRegistry.register(okyam);
	}
	
	public static void registerRenders() {
		//calls the render for each items
		registerRender(yam);
		registerRender(okyam);
	}
	
	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));

	}
}
