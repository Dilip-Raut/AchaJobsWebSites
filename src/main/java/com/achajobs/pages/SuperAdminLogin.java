package com.achajobs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuperAdminLogin extends BasePage {

	public SuperAdminLogin(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(id="username") 
    public WebElement txtUsername;
	
	@FindBy(id="password") 
    WebElement txtPassword;
	
	@FindBy(xpath="//button[text()='Submit']") 
    WebElement btnsubmit;
	
	public void fillUsername(String user)
    {
		txtUsername.sendKeys(user);
    }
	
	public void fillpassword(String pass)
    {
		txtPassword.sendKeys(pass);
    }
	
	public void clickOnSuperAdminLogin()
    {
		btnsubmit.click();
    }
	

}
