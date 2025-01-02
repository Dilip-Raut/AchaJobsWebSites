package com.achajobs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuperAdminDashBoard extends BasePage {

	public SuperAdminDashBoard(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//button[text()=' Post Management ']") 
    WebElement lnkPostmanagement;
	
	@FindBy(xpath="((//*[@class='row'])/descendant::div)[last()]/button[1]") 
    public WebElement lnkapproaveJob;
	
	//    ((//*[@class='row'])/descendant::div)[last()]/button[1]

	public void clickOnPostManagement()
    {
		lnkPostmanagement.click();
    }
	
	public void clickOnApproavePostRequest() {
		lnkapproaveJob.click();
	}
	
}
