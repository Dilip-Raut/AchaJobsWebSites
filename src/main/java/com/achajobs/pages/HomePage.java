package com.achajobs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//button[text()=' Login ']") 
    public WebElement lnkLogin;
	
	@FindBy(xpath="//input[contains(@placeholder,'Enter skills')]") 
    public WebElement searchBox;
	
	@FindBy(xpath="//button[text()=' Search']") 
    public WebElement btnSearch;
	
	@FindBy(xpath="//button[@class='close-btn']") 
    public WebElement btnClose;
			
	@FindBy(xpath="(//a[text()='View More '])[1]") 
	WebElement linkViewMore;		
	
	
	
	public void clickOnLogin()
    {
    	lnkLogin.click();
    }
	public void typeOnSearchBox(String jobName)
    {
		searchBox.sendKeys(jobName);
    }
	
	public void clickOnSearchButton()
    {
		btnSearch.click();
    }
	
	public void clickOnCloseButton()
    {
		btnClose.click();
    }
	public void clickOnViewMore()
    {
    	linkViewMore.click();
    }
	
}