package testNg;

import org.testng.annotations.Test;

public class DependenciesManagement {
	
	//problem:1you have to admit a student in enineerin//
	//problem 2:you have to admit a student to Higner secondary//
	@Test(priority=0)
	
	public void highSchool()
	{
		System.out.println("High School");
	}
	@Test(priority=1)
	public void higherSecondar()
	{
		System.out.println("Higher Secondar");
	}
	@Test(priority=2)
	public void engineering()
	{
		System.out.println("Engineering");
	}
	
	
}
