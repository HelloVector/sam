package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.ActitimeHomePage;
import pom.ActitimeLoginPage;

public class ActitimeLoginLogout 
{
	@Test
	public void login()
	{

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		ActitimeLoginPage login = new ActitimeLoginPage(driver);
		login.LoginMethod();
		
		ActitimeHomePage home = new ActitimeHomePage(driver);
		home.Logout();
		
	}

}
