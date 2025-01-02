package com.achajobs.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserRegistrationPage extends BasePage{

	public UserRegistrationPage(WebDriver driver) {
		super(driver);
	}

	
	@FindBy(id="firstName") 
    public WebElement txtname;
	
	@FindBy(id="lastName") 
    WebElement txtlastName;
	
	@FindBy(id="email") 
    WebElement txtemail;
	
	@FindBy(id="country") 
    WebElement txtcountry;
	
	@FindBy(id="mobileNumber") 
    WebElement txtmobileNumber;
	
	@FindBy(id="location") 
    WebElement txtlocation;
	
	@FindBy(id="cv") 
    WebElement txtuploadcv;

	@FindBy(xpath="//button[text()=' Submit Application ']") 
    WebElement btnsubmitApplication;
	
	public void fillname(String name)
    {
		txtname.sendKeys(name);
    }
	
	public void filllastName(String lastName)
    {
		txtlastName.sendKeys(lastName);
    }
	
	public void fillemail(String email)
    {
		txtemail.sendKeys(email);
    }
	
	public void fillcountry(String country)
    {
		txtcountry.sendKeys(country);
    }
	public void fillmobileNumber(String mobileNumber)
    {
		txtmobileNumber.sendKeys(mobileNumber);
    }
	
	public void filllocation(String location)
    {
		txtlocation.sendKeys(location);
    }
	
	
	
	public void clickOnUploadResume() throws InterruptedException, AWTException  {
//	    js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,450)", "");
//		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.elementToBeClickable(txtuploadcv));
		
		// It will return the parent window name as a String
		String parent=driver.getWindowHandle();
		Set<String>s=driver.getWindowHandles();
		
		act.moveToElement(txtuploadcv).click().build().perform();
		Thread.sleep(15000);
		System.out.println("Uploading Resume Now ....");
		Robot rb = new Robot();
		
	    StringSelection str = new StringSelection("D:\\OpenTech\\AchaJobsWebSites\\sampleresume.docx");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	 
	     rb.keyPress(KeyEvent.VK_CONTROL);
	     rb.keyPress(KeyEvent.VK_V);
	     Thread.sleep(3000);
	   
	    rb.keyRelease(KeyEvent.VK_CONTROL);
	    rb.keyRelease(KeyEvent.VK_V);
	    Thread.sleep(3000);
	  
	    rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER);
	    
	    Thread.sleep(6000);
	    
		
//	    js = (JavascriptExecutor) driver;
//	    js.executeScript("window.scrollBy(0,-450)", "");
//	    Thread.sleep(5000);
		 


	}

	
	
	
	
	
	
	
	public void clickOnsubmitApplication()
    {
		btnsubmitApplication.click();
    }
}
