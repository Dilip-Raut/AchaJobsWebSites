package com.achajobs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminLoginPage extends BasePage {

	public AdminLoginPage(WebDriver driver) {
		super(driver);
	}

	
	@FindBy(id="username") 
    WebElement txtUsername;
	
	@FindBy(id="password") 
    WebElement txtPassword;
	
	@FindBy(xpath="//button[text()='Login']") 
    WebElement btnAdminLogin;
	
	@FindBy(xpath="//a[text()='Register Now?']") 
    public WebElement lnkadminRegisterNow;
	
	@FindBy(xpath="//a[text()='Super Admin login']") 
    WebElement btnSuperAdminLogin;
	
	@FindBy(xpath="//h2[text()='Admin Login']") 
    public WebElement txtAdminLogin;
	
	public void fillUsername(String user)
    {
		txtUsername.sendKeys(user);
    }
	
	public void fillpassword(String pass)
    {
		txtPassword.sendKeys(pass);
    }
	
	public void clickOnAdminLogin()
    {
		btnAdminLogin.click();
    }
	
	public void clickOnadminRegisterNow()
    {
		lnkadminRegisterNow.click();
    }
	
	public void clickOnSuperAdminLogin()
    {
		btnSuperAdminLogin.click();
    }
	
}
