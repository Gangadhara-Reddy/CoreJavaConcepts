package Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Base.UsefulMethods;

public class loginPage{
	public static Logger logger = LogManager.getLogger(loginPage.class);
	private static WebDriver driver;
	
	@FindBy(xpath="//a[@title='Close']")
	private WebElement simpleModel;
	
	@FindBy(xpath="//div[@class='access-loginform-submitwrapper2']/button/span[contains(text(),'Register for Online Banking')]")
	private WebElement registerForOnlineBanking;
	
	public loginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public firstTimeRegistrationPage_Step1 btnRegisterForOnlineBankingButton() throws InterruptedException{
		logger.info("Clicking on close button of simple modal pop up");
		if(UsefulMethods.isElementPresnt(simpleModel,driver,10)){
			UsefulMethods.safeActionsClick(simpleModel,driver,10);
			logger.info("User has closed the simple modal pop up");
		}
		logger.info("user waits for few seconds to oad the element");		
		Thread.sleep(5000);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", registerForOnlineBanking);
		logger.info("user clicks on register for online banking");
		return new firstTimeRegistrationPage_Step1(driver);
	}

}
