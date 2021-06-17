package testWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDropdowns {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.wikipedia.org");
		//driver.findElement(By.xpath("//*[@id='searchLanguage']")).sendKeys("Eesti");//selecting using sendkeys
		
		Select select = new Select(driver.findElement(By.xpath("//*[@id='searchLanguage']")));
		//select.selectByVisibleText("Eesti");  //using select class selectbyvisiblketext selecting
		
		select.selectByValue("hi");
		
		/*List<WebElement> options = select.getOptions();
		
		System.out.println(options.size());
		
		for(int i=0 ;i<options.size();i++ ) {
			System.out.println(options.get(i).getText());
		}*/
		
		System.out.println("-----------------printing all drop down values-----");
		
		WebElement dropdown = driver.findElement(By.xpath("//*[@id='searchLanguage']"));
		List<WebElement> options = dropdown.findElements(By.tagName("option"));
		System.out.println(options.size());
		
		for(int i=0 ;i<options.size();i++ ) {
			//System.out.println(options.get(i).getText());
			System.out.println(options.get(i).getAttribute("lang"));
		}
		
		System.out.println("-----------------printing all links ----");
		
		WebElement block = driver.findElement(By.xpath("//*[@id='www-wikipedia-org']/div[6]/div[3]"));
		
		List<WebElement> links = block.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(int i=0 ;i<links.size();i++ ) {
			//System.out.println(links.get(i).getText());
			//System.out.println(links.get(i).getAttribute("href"));
			System.out.println(links.get(i).getText());
		}
		
		System.out.println("Total links are: "+links.size());
		
	}

}
