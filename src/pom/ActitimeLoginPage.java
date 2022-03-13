package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLoginPage 
{
	@FindBy(id="username")
	private WebElement usernameTextfield;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement passwordTextfield;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepmeloggedinCheckbox;
	
	@FindBy(id="loginButton")
	private WebElement loginLink;
	
	@FindBy(id="toPasswordRecoveryPageLink")
	private WebElement forgotpasswordLink;
	
	@FindBy(xpath="//a[.='actiTIME Inc.']")
	private WebElement actitimeincLink;

	public ActitimeLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void LoginMethod()
	{
		usernameTextfield.sendKeys("admin");
		passwordTextfield.sendKeys("manager");
		keepmeloggedinCheckbox.click();
		loginLink.click();
	}
	public void ForgotPassword()
	{
		forgotpasswordLink.click();
	}
	public void ActitimeInc()
	{
		actitimeincLink.click();
	}
	
}
