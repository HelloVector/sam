package TestNGextra;

import org.testng.annotations.Test;

public class DependsonMethod 
{
	@Test
	public void login()
	{
		System.out.println("login method");
	}
	@Test(dependsOnMethods = "login")
	public void creatework()
	{
		System.out.println("create work");
	}
	@Test(dependsOnMethods = "creatework")
	public void deletework()
	{
		System.out.println("delete work");
	}
}
