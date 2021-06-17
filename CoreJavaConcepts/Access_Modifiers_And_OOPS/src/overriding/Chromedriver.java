package overriding;

public class Chromedriver extends Webdriver{
	public void click() {
		System.out.println("Clicking on Chrome");
	}
	
	public void sendKeys() {
		System.out.println("Typing in Chrome");
	}
	
}
