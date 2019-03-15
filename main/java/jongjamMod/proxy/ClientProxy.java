package jongjamMod.proxy;

import jongjamMod.init.ModItems;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		ModItems.registerRenders();
		
	}

}
