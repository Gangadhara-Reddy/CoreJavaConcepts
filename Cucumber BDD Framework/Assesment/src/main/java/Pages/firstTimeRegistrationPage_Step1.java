package Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class firstTimeRegistrationPage_Step1{
	public static Logger logger = LogManager.getLogger(firstTimeRegistrationPage_Step1.class);
	private WebDriver driver;

	@FindBy(xpath="//table[@class='tableform regoption']//td[2]//a")
	private WebElement credeitCard;

	@FindBy(id="idFrmStepAdditional:idBtnSubmit")
	private WebElement registerNowButton;

	public firstTimeRegistrationPage_Step1(WebDriver driver) {           
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	/***
	 * 
	 * This method is to click on register button on step 1 page
	 * 
	 * @return
	 * @throws InterruptedException 
	 */
	public firstTimeRegistrationPage_Step2 clickOnregisterButton() throws InterruptedException{
		Thread.sleep(3000);
		logger.info("User clicks on register now button");
		registerNowButton.click();
		return new firstTimeRegistrationPage_Step2(driver);
	}

	/***
	 * 
	 * This method is to credit card option on step 1 page
	 * 
	 * @return
	 * @throws InterruptedException 
	 */
	public void clickOnCreditCard() throws InterruptedException{
		Thread.sleep(5000);
		logger.info("user selects credit cards options");
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", credeitCard);
	}
}
