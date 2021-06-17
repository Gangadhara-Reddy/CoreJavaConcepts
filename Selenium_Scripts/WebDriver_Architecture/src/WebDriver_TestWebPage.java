
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriver_TestWebPage {
	public static String browser = "Chrome";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//InternetExplorerDriver IDEDriver = new InternetExplorerDriver();
		
		
		If(browser.equals("Chrome")){
			ChromeDriver driver = new ChromeDriver();

			//driver.get("https://gmail.com");
			//System.out.println(driver.getTitle());
		}
		ElseIf(browser.equals("ie")){
			InterExplorerDriver driver = new InterExplorerDriver();
		}
		Elseif(browser.equals("Mozilla")){
			FirefoxDriver driver = new FirefoxDriver();
		}
		driver.get("https://gmail.com");
		System.out.println(driver.getTitle());
		
		}
			
	}

}






