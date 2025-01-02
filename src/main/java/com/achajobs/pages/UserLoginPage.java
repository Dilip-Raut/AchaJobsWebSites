package com.achajobs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserLoginPage extends BasePage {

	public UserLoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(id="username") 
    WebElement txtUsername;
	
	@FindBy(id="password") 
    WebElement txtPassword;
	
	@FindBy(xpath="//button[text()='Login']") 
    WebElement btnLogin;
	
	@FindBy(xpath="//button[text()='Admin Login?']") 
    public  WebElement lnkadminLoginFirst;
	
	
	public void fillUsername(String user)
    {
		txtUsername.sendKeys(user);
    }
	
	public void fillpassword(String pass)
    {
		txtPassword.sendKeys(pass);
    }
	
	public void clickOnLogin()
    {
		btnLogin.click();
    }
	
	public void clickOnadminLoginFirst()
    {
		lnkadminLoginFirst.click();
    }
	
	
}
