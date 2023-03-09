package testNGExample;

import org.testng.annotations.Test;

public class Test1 {
	
	@Test(priority=1)
	public void startTheCar() {
		System.out.println("StartThe Car");
	}
	
	//Skip the Test Case
	@Test(priority=2,enabled=false)
	public void music() {
		System.out.println("Star the Music");
	}
	
	@Test(priority=3)
	public void firstGear() {
		System.out.println("firstGear");
	}
	
	@Test(priority=4)
	public void secondGear() {
		System.out.println("secondGear");
	}
	
	@Test(priority=5)
	public void thirdGear() {
		System.out.println("thirdGear");
	}
	
}
