import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class web_windows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.onlinesbi.com/");
		
		Set<String> winids = driver.getWindowHandles();
		Iterator<String> iterate = winids.iterator();
		System.out.println(iterate.next());
		
		driver.findElement(By.xpath("//a[@class='how']")).click();
		
		System.out.println("After the new tab is opened");
		
		//below 2 lines are same lines with out mentioning data type
		//as i am using same varibale names
		winids = driver.getWindowHandles();
		iterate = winids.iterator();
		
		//now when i say iterator varibale.next--it takes 1st 
		//and if i say again next---takes 2nd
		String first_window = iterate.next();
		String tab_window = iterate.next();
		System.out.println(first_window); //printing first window id
		System.out.println(tab_window);// printing tabwindow id
		
		driver.switchTo().window(first_window);
		Thread.sleep(3000L);
		driver.close();
		Thread.sleep(3000L);
		driver.switchTo().window(tab_window);
		Thread.sleep(3000L);
		driver.close();
		
	}

}
