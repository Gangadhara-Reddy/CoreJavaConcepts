import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE_Automation_WithoutDriverCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.ie.driver", "E:\\Selenium\\eclipse-committers-oxygen-3a-win32-x86_64\\PreRequisites\\Driver Executables\\IEDriverServer.exe");
				InternetExplorerDriver IDEDriver = new InternetExplorerDriver();
				IDEDriver.get("https://gmail.com");
	}

}
