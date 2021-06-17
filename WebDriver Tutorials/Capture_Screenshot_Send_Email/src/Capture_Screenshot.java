import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_Screenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://gmail.com");
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile,new File("E:\\Selenium\\My Prepared Selenium Docs with Videos\\Screenshots\\capturescreen.jpg"));
		
		/*
		 * Screenshot in case of error
		 */
		
		
		try {
			driver.findElement(By.xpath("//@id='dddd']"));
		}catch(Throwable t) {
			FileUtils.copyFile(srcFile,new File("E:\\Selenium\\My Prepared Selenium Docs with Videos\\Screenshots\\errorscreenshot.jpg"));
		}
		
	}

}
