package overriding;

public class TetCase1 extends Base{
	String browserName = "Chrome";
	public static void main(String[] args) {
		TetCase1 tc = new TetCase1();
		tc.initBrowser();
		
	}
	
	public void initBrowser() {
		Webdriver driver = getBrowserInstance(browserName);
		driver.click();
		driver.sendKeys();
		driver.getTitle();
	}

}
