package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeHomePage 
{
	@FindBy(id="container_tasks")
	private WebElement taskpageLink;
	
	@FindBy(id="container_tt")
	private WebElement timetrackpageLink;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[2]")
	private WebElement settingsDropdown;
	
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	
	public ActitimeHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void TimetrackPage()
	{
		timetrackpageLink.click();
	}
	public void Taskpage()
	{
		taskpageLink.click();
	}
	public void SettingsPage()
	{
		settingsDropdown.click();
	}
	public void Logout()
	{
		logoutLink.click();
	}
	
}
