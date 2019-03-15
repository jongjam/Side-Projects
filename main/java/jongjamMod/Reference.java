package jongjamMod;

public class Reference {
	
	public static final String MOD_ID = "yam";
	public static final String NAME = "yam tutorial mod";
	public static final String VERSION = "1.0";
	public static final String ACCEPTED_VERSIONS = "[1.9.4]";
	
	public static final String CLIENT_PROXY_CLASS = "jongjamMod.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "jongjamMod.proxy.ServerProxy";
	
	public static enum TutorialItems {
		YAM("yam", "ItemYam"),
		OKYAM("okYam", "itemokyam");
		private String unlocalizedName;
		private String registryName;
		
		TutorialItems(String unlocalizedName, String registryName){
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
			
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
}
