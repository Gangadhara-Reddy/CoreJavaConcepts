package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import Helpers.Browsers;



public class TestBase {

	public static WebDriver driver=null;

	public static WebDriver init(Browsers browser,String url) {
		switch (browser) {
		case chrome:
			
			WebDriver driver = new ChromeDriver();
			driver.get(url);
			break;
		case firefox:
			driver =new FirefoxDriver();
			driver.get(url);
			break;
		case ie:
			driver =new InternetExplorerDriver();
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


