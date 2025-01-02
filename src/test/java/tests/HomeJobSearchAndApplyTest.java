package tests;

import java.awt.AWTException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.achajobs.pages.AllJobsPage;
import com.achajobs.pages.HomePage;
import com.achajobs.pages.UserRegistrationPage;
import com.aventstack.extentreports.Status;

import testBase.BaseClass;
import utilities.ExtentReportManager;
import utilities.GenericMethods;

public class HomeJobSearchAndApplyTest extends BaseClass {
	@Test(priority=1)
	public void jobSearchTest() throws InterruptedException, AWTException {
		logger.info("**** Starting jobSearchTest  ****");
		logger.debug("capturing application debug logs....");
		// Home page
		HomePage hp = new HomePage(driver);
		AllJobsPage aj=new AllJobsPage(driver);
		wait.until(ExpectedConditions.elementToBeClickable(hp.searchBox));
		hp.clickOnCloseButton();
		hp.typeOnSearchBox("Automation Testing");
		ExtentReportManager.test.log(Status.INFO, "User Searching for \"Automation Testing\" jobs");
		wait.until(ExpectedConditions.elementToBeClickable(hp.btnSearch));
		hp.clickOnSearchButton();
		Thread.sleep(2000);
		aj.fillLocation("Pune");
		Thread.sleep(2000);
		aj.fillminSalary("31000");
		Thread.sleep(2000);
		aj.fillmaxSalary("199999");
		Thread.sleep(2000);
		aj.fillworkMode();
		Thread.sleep(2000);
		aj.fillexperience();
		Thread.sleep(2000);
		aj.clickOnApplyFilter();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(aj.txtapplyJobs));
		aj.clickOnApplyJobs();
		
		logger.info("clicked on Login link on the home page..");
		logger.info("**** Finished doLoginTest  ****");
		UserRegistrationPage ur=new UserRegistrationPage(driver);
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
		Thread.sleep(3000);
		GenericMethods.acceptAlert(driver);
		Thread.sleep(3000);;

	}
}
