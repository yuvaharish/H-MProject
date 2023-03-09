package testNGExample;

import org.testng.annotations.Test;

public class Test2 {
	
	@Test
	public void highSchool() {
		System.out.println("highSchool pass");
	}

	@Test(dependsOnMethods="highSchool")
	public void highSecondary() {
		System.out.println("highSecondary pass");
	}
	
	@Test(dependsOnMethods="highSecondary")
	public void college() {
		System.out.println("Engineering joined");
	}
}
