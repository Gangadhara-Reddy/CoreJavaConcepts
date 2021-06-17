package testWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testSample {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.gmail.com");
		
		System.out.println(driver.getTitle());
		
		WebElement element = driver.findElement(By.id("identifierId"));
		element.sendKeys("bgreddy1224@gmail.com");
		
		//element = driver.findElement(By.id("identifierId"));
		
		element = driver.findElement(By.xpath("//div[@role='button']"));
		
		element.click();
		
		//element = driver.findElement(By.xpath("//input[@type='password']"));//elmentnotvisible error
		
		//element = driver.findElement(By.xpath("//div[@id='password']"));//nosuchelemnterror
		
		element = driver.findElement(By.xpath("//input[@type='password'][@name='password']"));
		element.sendKeys("asdf");
		
		element = driver.findElement(By.xpath("//div[@role='button']"));
		
		element.click();
		
		
	}

}
