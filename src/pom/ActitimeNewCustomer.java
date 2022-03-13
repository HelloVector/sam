package pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeNewCustomer 
{
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement customernameTextfield;
	
	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement createcustomerButton;
	
	@FindBy(xpath="//div[@class='greyButton cancelBtn']")
	private WebElement cancelButton;

	public ActitimeNewCustomer(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	public void CreateNewCustomer()
	{
		customernameTextfield.sendKeys("SKS");
		createcustomerButton.click();
	}
	public void Cancelcustomer()
	{
		customernameTextfield.sendKeys("Sambit");
		cancelButton.click();
	}
	public WebDriver driver;
	public void Popuphandle() throws InterruptedException
	{
		//Robot r = new Robot();
		//r.keyPress(KeyEvent.VK_ENTER);
		Alert al = driver.switchTo().alert();
		Thread.sleep(1000);
		al.accept();
	}
}
