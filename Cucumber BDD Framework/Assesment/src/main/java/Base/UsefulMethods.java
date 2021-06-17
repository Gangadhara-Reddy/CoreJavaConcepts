package Base;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.loginPage;

public class UsefulMethods{
	public static Logger logger = LogManager.getLogger(UsefulMethods.class);
	/**
	 * This code will help you to find whether the element is present or not
	 * @param driver
	 * @param xpath
	 * @param time
	 * @return
	 */
	public static Boolean isElementPresnt(WebElement ele,WebDriver drver,int time)
	{
		for(int i=0;i<time;i++)
		{
			try{
				WebDriverWait wait = new WebDriverWait(drver,5000);
				wait.until(ExpectedConditions.elementToBeClickable(ele));
			}catch(Exception e){
				System.out.println("Waiting for element to appear on DOM");
			}	
		}
		return true;
	}
	public static void safeActionsClick(WebElement ele,WebDriver driver,int Time)
	{
		try
		{
			if(isElementPresnt(ele,driver,Time))
			{
				logger.debug(ele+" element found");
				WebDriverWait wait = new WebDriverWait(driver, 5000);
				wait.until(ExpectedConditions.elementToBeClickable(ele));
				System.out.println("driver found the element");
				ele.click();
			}
			else
			{     
				logger.debug(ele+" element not found");
			}
		}
		catch(StaleElementReferenceException e)
		{
			logger.error("Element with  - StaleElementReferenceException");
		}
		catch (NoSuchElementException e)
		{
			logger.error("Element was not found in DOM in time  - NoSuchElementException");
		}
		catch(Exception e)
		{
			logger.error("Element was not visible on the web page");
		}
	}
}