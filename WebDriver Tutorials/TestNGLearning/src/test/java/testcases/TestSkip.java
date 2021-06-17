package testcases;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestSkip {
	@Test
	public void isskip() {
		throw new SkipException("Skiping the testcase as the condition is not met");
	}
}
