package testWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class web_radio {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.quackit.com/html/codes/html_radio_button.cfm");
		
		WebElement element = driver.findElement(By.xpath("//form[@action='/html/codes/html_form_handler.cfm']"));
		List<WebElement> radio_button = element.findElements(By.name("preferred_color"));
		//System.out.println(radio_button.get(0));
		System.out.println(radio_button.size());
		//System.out.println(radio_button.get(0).getAttribute("value"));
		
		

	}

}
