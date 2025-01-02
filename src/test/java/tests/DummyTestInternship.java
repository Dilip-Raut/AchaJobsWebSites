package tests;

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

import testBase.BaseClass;
import utilities.GenericMethods;

public class DummyTestInternship extends BaseClass {
	@Test(priority = 1)
	public void readData() throws InterruptedException {
		driver.navigate().to("https://www.acchajobs.com/internship");
		
		AdminJobPostDetailsPage aj=new AdminJobPostDetailsPage(driver);
		Thread.sleep(3000);
		aj.fillformtitle("Qa Openings");
		Thread.sleep(1000);
		aj.fillformcompany("DXTX");
		Thread.sleep(1000);
		aj.fillformLocation("Pune");
		Thread.sleep(1000);	
		aj.fillformduration("6 months");
		Thread.sleep(1000);
		aj.fillformstipend("5000");
		Thread.sleep(1000);
		aj.fillformqualifications("BE");
		Thread.sleep(1000);
		aj.fillformskills("Java");
		Thread.sleep(1000);
		aj.fillformdescription("Nothing");
		Thread.sleep(1000);
		GenericMethods.scrollIntoView(driver, aj.formbtncreate);
		aj.fillformstatus();
		Thread.sleep(1000);
		aj.fillformopeningStartDate("25-12-2024");
		Thread.sleep(1000);
		aj.fillformlastApplyDatee("01-01-2025");
		Thread.sleep(1000);
		aj.fillformnumberOfOpenings("4");
		Thread.sleep(1000);
		aj.fillformperks("NA");
		Thread.sleep(1000);
		aj.fillformcompanyDescription("Nothing");
		Thread.sleep(2000);
		aj.clickOnCreateBtn();
		Thread.sleep(3000);
		GenericMethods.acceptAlert(driver);
		System.out.println("alert is accepted");
		Thread.sleep(4000);
		
	
	}
	

}
