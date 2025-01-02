package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.achajobs.pages.AdminLoginPage;
import com.achajobs.pages.AdminRegistrationPage;
import com.achajobs.pages.HomePage;
import com.achajobs.pages.UserLoginPage;
import com.aventstack.extentreports.Status;

import testBase.BaseClass;
import utilities.ExtentReportManager;

public class EndToEndTest extends BaseClass {

	
	@Test(priority=1)
	public static void doLogin() throws InterruptedException {
		logger.info("**** Starting doLoginTest  ****");
		logger.debug("capturing application debug logs....");
		// Home page
		HomePage hp = new HomePage(driver);
		UserLoginPage up=new UserLoginPage(driver);
		AdminLoginPage ap=new AdminLoginPage(driver);
		AdminRegistrationPage arp=new AdminRegistrationPage(driver);
		wait.until(ExpectedConditions.elementToBeClickable(hp.btnClose));
		hp.clickOnCloseButton();
		wait.until(ExpectedConditions.elementToBeClickable(hp.lnkLogin));
		hp.clickOnLogin();
		ExtentReportManager.test.log(Status.INFO, "User Clicked On Login Button");
		wait.until(ExpectedConditions.elementToBeClickable(up.lnkadminLoginFirst));
		up.clickOnadminLoginFirst();
		ExtentReportManager.test.log(Status.INFO, "User Clicked On Admin Login Button");
		wait.until(ExpectedConditions.elementToBeClickable(ap.lnkadminRegisterNow));
		ap.clickOnadminRegisterNow();
		ExtentReportManager.test.log(Status.INFO, "User Clicked On Admin Registration Button and Filling Details");
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(arp.txtname));
		arp.txtname.click();
		arp.fillname("DineshKumar");
		Thread.sleep(1000);
		arp.fillmobileNo("9222322330");
		Thread.sleep(1000);
		arp.fillusername("DineshKumar");
		Thread.sleep(1000);
		arp.fillpassword("DineshKumar@123");
		Thread.sleep(1000);
		arp.fillemail("pibokix46011@gholar.com");
		Thread.sleep(1000);
		arp.clickOnRegister();
		Thread.sleep(10000);
		//ExtentReportManager.test.log(Status.INFO, "User Succesfully Created Admin Account waiting For Super Admin Approaval");
	try {	 // Switch to the alert
        Alert alert = driver.switchTo().alert();
        // Accept the alert
        System.out.println("Alert found: " + alert.getText());
        ExtentReportManager.test.log(Status.INFO, "User Waiting to Accept the Alert and Getting Message as - "+alert.getText());
        alert.accept();
        System.out.println("Alert accepted.");
        ExtentReportManager.test.log(Status.INFO, "User Successfully Accept the Alert");
        
    } catch (NoAlertPresentException e) {
        // No alert found
        System.out.println("No alert present.");
    }
		logger.info("clicked on Login link on the home page..");
		logger.info("**** Finished doLoginTest  ****");
	}
}
