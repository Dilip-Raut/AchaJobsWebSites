package com.achajobs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminRegistrationPage extends BasePage{

	public AdminRegistrationPage(WebDriver driver) {
		super(driver);
	}

	
	@FindBy(id="name") 
    public WebElement txtname;
	
	@FindBy(id="mobileNo") 
    WebElement txtmobileNo;
	
	@FindBy(id="username") 
    WebElement txtusername;
	
	@FindBy(id="password") 
    WebElement txtpassword;
	
	@FindBy(id="email") 
    WebElement txtemail;

	@FindBy(xpath="//button[text()='Register']") 
    WebElement btnRegister;
	
	public void fillname(String name)
    {
		txtname.sendKeys(name);
    }
	
	public void fillmobileNo(String mobileNo)
    {
		txtmobileNo.sendKeys(mobileNo);
    }
	
	public void fillusername(String username)
    {
		txtusername.sendKeys(username);
    }
	
	public void fillpassword(String password)
    {
		txtpassword.sendKeys(password);
    }
	
	public void fillemail(String email)
    {
		txtemail.sendKeys(email);
    }
	
	
	public void clickOnRegister()
    {
		btnRegister.click();
    }
}
