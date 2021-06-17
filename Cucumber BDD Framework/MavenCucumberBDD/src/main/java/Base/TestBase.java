package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Helpers.Browsers;



public class TestBase {

	public static WebDriver driver=null;

	public static WebDriver init(Browsers browser,String url) {
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


	public static WebDriver getDriver() {
		return driver;
	}

}


