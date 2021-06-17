package overriding;

public class InternetExplorerDriver extends Webdriver{
	
		public void click() {
			System.out.println("Clicking on IE");
		}
		
		public void sendKeys() {
			System.out.println("Typing in IE");
		}
}
	
	

