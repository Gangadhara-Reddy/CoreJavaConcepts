package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testcase3 extends BaseTest{
	@Test(priority=1,groups= {"funcitonal","Smoke"})
	public void doUserReg() {
		System.out.println("Executing User Reg test");
		Assert.fail("User not registered successfully");
	}
	
	
	@Test(priority=2, dependsOnMethods  = "doUserReg",groups= {"functional","Smoke"})
	public void doLogin() {
		System.out.println("Executing login test");
	}
	
	@Test(priority=3, dependsOnMethods  = "doUserReg",alwaysRun=true,groups= {"functional","Smoke"})
	public void thirdTest() {
		System.out.println("Executing third test");
	}
	
	@Test(priority=4, groups ="bvt")
	public void fourth() {
		System.out.println("Executing fourth test");
	}
	
}
