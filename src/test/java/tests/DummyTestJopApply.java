package tests;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.achajobs.pages.AdminJobPostDetailsPage;
import com.achajobs.pages.AdminLoginPage;
import com.achajobs.pages.AdminRegistrationPage;
import com.achajobs.pages.HomePage;
import com.achajobs.pages.SuperAdminDashBoard;
import com.achajobs.pages.SuperAdminLogin;
import com.achajobs.pages.UserLoginPage;
import com.achajobs.pages.UserRegistrationPage;

import testBase.BaseClass;
import utilities.GenericMethods;

public class DummyTestJopApply extends BaseClass {
	@Test(priority = 1)
	public void readData() throws InterruptedException, AWTException {
		UserRegistrationPage ur=new UserRegistrationPage(driver);
		driver.navigate().to("https://www.acchajobs.com/apply-job/1");
		Thread.sleep(2000);
		ur.fillname("Sanjay");
		Thread.sleep(2000);
		ur.filllastName("Katre");
		Thread.sleep(2000);
		ur.fillemail("xyz@gmail.com");
		Thread.sleep(2000);
		ur.fillcountry("India");
		Thread.sleep(2000);
		ur.fillmobileNumber("9876543210");
		Thread.sleep(2000);
		ur.filllocation("pune");
		Thread.sleep(2000);
		ur.clickOnUploadResume();
		Thread.sleep(2000);
		ur.clickOnsubmitApplication();
		Thread.sleep(30000);
	
	}
	

}
