package regression;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class testcase2 {
	@Test
	public void validateTitles() {
		System.out.println("Begining");
		String expected_title = "Yahoo.com"; //from excel
		String actual_title = "Gmail.com"; //from selenium with driver.gettitle lets say
		
		/*if(expected_title.equals(actual_title)){
			System.out.println("Testcase passed");			
				
		}else {
			System.out.println("Testcase failed");
		}*/
		
		//Assert.assertEquals(expected_title, actual_title);  //1st way of reportin
		
		//2nd way
		//IsElementPresent("xpath")---method--returns--true [OR] false
		//Assert.assertTrue(IsElementPresent("xpath"));
		//Assert.assertTrue(false); // 1 method with out message parameter
		//Assert.assertTrue(false, "Element not found"); //2nd mehotd(overloaded with same name)
		//and it also has 2nd parametr message which can be reported in TestNG
		SoftAssert softAssert = new SoftAssert();
		System.out.println("Validaitng Title");
		softAssert.assertEquals(expected_title, actual_title); 
		System.out.println("validating image");
		softAssert.assertEquals(true, false,"image not present");
		
		System.out.println("validating textbox presense");
		softAssert.assertEquals(true, false,"textbox not present");
		//Assert.fail("Failing the test as the button was not found"); //If u want to forcefully fail a test
		System.out.println("Ending");
		softAssert.assertAll();
		
	}
}
