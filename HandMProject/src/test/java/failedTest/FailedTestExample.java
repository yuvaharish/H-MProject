package failedTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedTestExample {
	
	
	//@Test(retryAnalyzer=RetryAna.class)
	
	//@Test(invocationCount=20)
	@Test
	public void test1() {
		Assert.assertTrue(true);
		System.out.println("Test1");
	}
	
	//@Test(retryAnalyzer=RetryAna.class)
	@Test
	public void test2() {
		Assert.assertTrue(false);
		System.out.println("Test2");
	}

}
