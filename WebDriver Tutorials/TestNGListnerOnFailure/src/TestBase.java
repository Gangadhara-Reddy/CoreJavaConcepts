import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestBase {
	public static WebDriver driver;
	public void setUP() {
		if(driver==null) {
			driver = new ChromeDriver();
			driver.get("http://gmail.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
			
		}
		
	}
	
	public void tearDown() {
		
	}

}
