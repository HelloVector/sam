package TestNGextra;

import org.testng.annotations.Test;

public class Priority 
{
	@Test(priority = -89)
	public void Subrat()
	{
		System.out.println("subrat");
	}
	@Test(priority = -80)
	public void Sonali()
	{
		System.out.println("sonali");
	}
	@Test(priority = -69)
	public void Jagadish()
	{
		System.out.println("jagadish");
	}
}
