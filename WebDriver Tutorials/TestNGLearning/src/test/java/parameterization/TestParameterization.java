package parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParameterization {
	
	@Test(dataProvider = "getData")
	public void doLogin(String username,String password) {
		
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		data[0][0] = "trainer@way2automation.com";
		data[0][1] = "addf";
		
		data[1][0] = "java@way2automation.com";
		data[1][1] = "fftge";
		
		data[2][0] = "corporate@way2automation.com";
		data[2][1] = "tyfsf";
		
		
		
		return data;
		
		
	}
}
