package abstractclass;

public class Test {
	public static void main(String[] args) {
		//new Webdriver(); u get error when u uncomment as this is abstract class and can't be instantiated
		//Webdriver c = new ChildFirefox();
		ChildFirefox c = new ChildFirefox();
		c.getScreenshot();
		//c.click(); we can all all abstract mehotds
		c.childMethod(); //u can not call child mehtods which are not overridden with Webdriver reference
	}
}
