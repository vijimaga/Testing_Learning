package testNg;

import org.testng.annotations.Test;

public class SkipATestCase {
	@Test(priority=0)
	public void startTheCar()
	{
		System.out.println("start the car");
	}
	@Test(priority=5, enabled=false)
	public void turnTheMusicon()
	{
		System.out.println("Music Turned on");
	}
	@Test(priority=1)
	public void putFirstGear()
	{
		System.out.println("First Gear");
	}
	@Test(priority=2)
	public void putSecondGear()
	{
		System.out.println("Second Gear");
	}
	@Test(priority=3)
	public void putThirdGear()
	{
		System.out.println("Third Gear");
	}
	@Test(priority=4)
	public void putFourthGear()
	{
		System.out.println("Fourth Gear");
	}
	

}
