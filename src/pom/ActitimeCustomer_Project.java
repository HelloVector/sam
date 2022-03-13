package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeCustomer_Project 
{
	@FindBy(xpath="//div[@class='addNewButton']")
	private WebElement addnewDropdown;
	
	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement newcustomerLink;
	
	@FindBy(xpath="//div[@class='item createNewProject']")
	private WebElement newprojectLink;
	
	@FindBy(xpath="//div[@class='item createNewTasks']")
	private WebElement newtaskLink;
	
	@FindBy(xpath="//div[@class='item importTasks']")
	private WebElement importanttaskLink;
	
	public ActitimeCustomer_Project(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void Addbutton()
	{
		addnewDropdown.click();
	}
	public void Newcutomer()
	{
		newcustomerLink.click();
	}
	public void Newproject()
	{
		newprojectLink.click();
	}
	public void NewTask()
	{
		newtaskLink.click();
	}
	public void Importanttask()
	{
		importanttaskLink.click();
	}
	
}
