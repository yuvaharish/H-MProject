package testNGExample;

import org.testng.annotations.Test;

public class Groups2 {

	@Test(groups= {"smoke"})
	public void one() {
		System.out.println("Groups 2 One");
	}
	
	@Test(groups= {"smoke"})
	public void two() {
		System.out.println("Groups 2 two");
	}
	
	@Test(groups= {"regression"})
	public void three() {
		System.out.println("Groups 2 three");
	}
	
	@Test(groups= {"regression"})
	public void four() {
		System.out.println("Groups 2 four");
	}
	
}
