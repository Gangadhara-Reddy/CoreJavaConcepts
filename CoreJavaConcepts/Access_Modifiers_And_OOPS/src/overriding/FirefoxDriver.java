package overriding;

public class FirefoxDriver extends Webdriver {

		public void click() {
			System.out.println("Clicking on Firefox");
		}
		
		public void sendKeys() {
			System.out.println("Typing in Firefox");
		}
}
