package testNGExample;

import org.testng.annotations.Test;

public class GroupingExample {

	@Test(groups= {"smoke"})
	public void one() {
		System.out.println("One");
	}
	
	@Test(groups= {"smoke"})
	public void two() {
		System.out.println("two");
	}
	
	@Test(groups= {"regression"})
	public void three() {
		System.out.println("three");
	}
	
	@Test(groups= {"regression"})
	public void four() {
		System.out.println("four");
	}
	
}
