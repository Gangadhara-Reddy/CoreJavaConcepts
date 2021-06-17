package Pages;


import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.*;
import Base.UsefulMethods;
import junit.framework.Assert;

public class firstTimeRegistrationPage_Step2 {
	private WebDriver driver;
	public static Logger logger = LogManager.getLogger(firstTimeRegistrationPage_Step2.class);
	public String pcbNum;
	public String tempIDNum;
	public String idNum;

	@FindBy(xpath="//label[text()='Temporary ID']")
	private WebElement temporaryId;

	@FindBy(name="idFrmStep2:idCardNum")
	private WebElement principalCardNumber;

	@FindBy(id="idFrmStep2:idRegTmpId")
	private WebElement tmpID;

	@FindBy(id="idFrmStep2:idCustIdType_label")
	private WebElement ddIdType;

	@FindBy(xpath="//label[contains(text(),'ID Number')]/parent::td/following-sibling::td/span/input")
	private WebElement IdNumber;

	@FindBy(xpath="//div[@class='ui-selectonemenu-items-wrapper']/ul/li")
	List<WebElement> InNumList;

	@FindBy(xpath="//span[contains(text(),'Next')]")
	private WebElement nxtBttn; 


	@FindBy(xpath="//span[contains(text(),'Captcha is required')]")
	private WebElement captcha;

	@FindBy(xpath="//span[contains(text(),'Invalid Card Number format')]")
	private WebElement pcnErrMessage;

	@FindBy(xpath="//span[contains(text(),'Invalid Temporary ID format')]")
	private WebElement tempErrMessage;

	@FindBy(xpath="//span[contains(text(),'Invalid New IC Number format')]")
	private WebElement icNumErrMessage;

	@FindBy(id="idFrmStep2:idCaptcha")
	private WebElement captchaFld;
	
	@FindBy(xpath="//span[contains(text(),'Captcha code entered did not match.')]")
	private WebElement errorMessage;
	
	public firstTimeRegistrationPage_Step2(WebDriver driver) {           
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	public void selectVerificationID() throws InterruptedException{
		Thread.sleep(5000);
		logger.info("User selects temporary id");
		temporaryId.click();
	}

	public void enterPCBNum(String pcbNum){
		if(pcbNum!=null){
			logger.info("User has entered principal card number");
			principalCardNumber.sendKeys(pcbNum);
		}else{
			logger.info("Please enter pcb number");
		}
	}

	public void enterTempIDNum(String tempIDNum){
		if(tempIDNum!=null){
			logger.info("User has entered temporary Id number");
			tmpID.sendKeys(tempIDNum);
		}else{
			logger.info("Please enter tempIDNUmb");
		}
	}

	public void selectIdType(String idName){
		ddIdType.click();
		for(int i=0;i<InNumList.size();i++){
			if(InNumList.get(i).getText().equals(idName)){
				InNumList.get(i).click();
				logger.info("User clicked on "+ InNumList.get(i));
			}
		}

	}

	public void enterIdNum(String idNum){
		logger.info("user enters id number in id field");
		IdNumber.sendKeys(idNum);
	}

	public void enterCaptchAndClickNxtBttn(String captcha){
		logger.info("user enters captcha in captcha field");
		captchaFld.sendKeys(captcha);
		logger.info("User clicks on next button");
		nxtBttn.click();
		logger.info("User clicked on next button");
	}

	public void verfyCaptchErrMssg(){
		Assert.assertEquals(true, errorMessage.isDisplayed());
	}


	/**
	 *  this method is to check whether the value is string or not
	 * @return
	 */
	public boolean verifyFieldValues(String str){
		if(str.matches("^\\d+(\\.\\d+)?")) {
			return false;
		} else {
			return true;
		}
	}
	@SuppressWarnings("deprecation")
	public void verifyUsrFndlyMsgs(){
		Assert.assertEquals(true, pcnErrMessage.isDisplayed());
		Assert.assertEquals(true, tempErrMessage.isDisplayed());
	}

}
