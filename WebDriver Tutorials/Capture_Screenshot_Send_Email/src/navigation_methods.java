import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation_methods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//driver.get("http://google.com");
		driver.navigate().to("http://google.com");
		Thread.sleep(3000L);
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(2000L);
		driver.navigate().back();
		Thread.sleep(2000L);
		driver.navigate().forward();
	}

}
