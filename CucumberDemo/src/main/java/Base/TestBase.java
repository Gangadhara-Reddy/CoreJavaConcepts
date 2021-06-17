package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utilities.browsers;

public class TestBase {

	public WebDriver driver=null;

	public WebDriver init(browsers browser,String url) {
		switch (browser) {
		case chrome:
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium installation Files\\Driver Executables\\Google Chrome\\chromedriver.exe");
			driver =new ChromeDriver();
			driver.get(url);
			break;
		case firefox:
			driver =new ChromeDriver();
			driver.get(url);
			break;
		default:
			break;
		}

		return driver;
	}


	public WebDriver getDriver() {
		return driver;
	}

}


