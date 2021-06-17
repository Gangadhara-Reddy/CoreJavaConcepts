package overriding;

public class Base {
	public Webdriver getBrowserInstance(String browserName ) {
		if(browserName.equals("firefox")){
			return new FirefoxDriver();
		}else if (browserName.equals("Chrome")) {
			return new Chromedriver();
		}else if (browserName.equals("IE")) {
			return new InternetExplorerDriver();
		}else {
			return new FirefoxDriver();
		}
	}
}
