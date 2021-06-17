
public class Singleton_Test {
	
	private static Singleton_Test instance = new Singleton_Test();
	private Singleton_Test() {
		System.out.println("Creating Object");
	}
	
	public static Singleton_Test getinstance() {
		return instance;
		
	}

}
