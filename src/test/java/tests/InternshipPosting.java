package tests;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.achajobs.pages.AdminJobPostDetailsPage;
import com.achajobs.pages.AdminLoginPage;
import com.achajobs.pages.HomePage;
import com.achajobs.pages.SuperAdminDashBoard;
import com.achajobs.pages.SuperAdminLogin;
import com.achajobs.pages.UserLoginPage;
import com.aventstack.extentreports.Status;

import testBase.BaseClass;
import utilities.ExtentReportManager;
import utilities.GenericMethods;

public class InternshipPosting extends BaseClass {
	
//	SuperAdminLogin sa=new SuperAdminLogin(driver);
//	SuperAdminDashBoard sd=new SuperAdminDashBoard(driver);
//	AdminJobPostDetailsPage aj=new AdminJobPostDetailsPage(driver);
	@Test
	public void adminCreationAndAppraoveTest() throws InterruptedException {
		logger.info("**** Starting doLoginTest  ****");
		logger.debug("capturing application debug logs....");
		//EndToEndTest et=new EndToEndTest();
		// Home page
		EndToEndTest.doLogin();
		ExtentReportManager.test.log(Status.INFO, "New Admin is Created");
		HomePage hp = new HomePage(driver);
		UserLoginPage up=new UserLoginPage(driver);
		AdminLoginPage ap=new AdminLoginPage(driver);
		SuperAdminLogin sa=new SuperAdminLogin(driver);
		Thread.sleep(5000);
		if((ap.txtAdminLogin).getText().equalsIgnoreCase("Admin Login")) {
			ap.clickOnSuperAdminLogin();
			Thread.sleep(4000);
			sa.fillUsername("admin");
			Thread.sleep(4000);
			sa.fillpassword("admin@123");
			Thread.sleep(4000);
			sa.clickOnSuperAdminLogin();
			Thread.sleep(4000);
			GenericMethods.acceptAlert(driver);
			Thread.sleep(4000);
			ExtentReportManager.test.log(Status.INFO, "User Succeessfuly Login To Super Admin Module");
			WebElement tl=driver.findElement(By.xpath("(//table//tbody//tr)[last()]"));
			GenericMethods.scrollIntoView(driver, tl);
			Thread.sleep(20000);
			String name=driver.findElement(By.xpath("(//table//tbody//tr)[last()]/td[2]")).getText();
			System.out.println(name);
			if(name.equals("DineshKumar")) {
				System.out.println("Reading Name");
				Thread.sleep(4000);
				String value = driver.findElement(By.xpath("(//table//tbody//tr)[last()]/td[4]")).getText();
				System.out.println("Admin status is - "+value);
				if(value.equalsIgnoreCase("Disabled")) {
					driver.findElement(By.xpath("(//table//tbody//tr)[last()]/td[5]/button[1]")).click();
					System.out.println("Approave request");
					Thread.sleep(4000);
					GenericMethods.acceptAlert(driver);
					Thread.sleep(4000);
					
				}
				System.out.println("Already Approaved Admin");
				ExtentReportManager.test.log(Status.INFO, "Super Admin Succeessfully Appraove The New Admin");
				driver.navigate().back();
				Thread.sleep(4000);
				driver.navigate().back();
				Thread.sleep(4000);
				
			}
			
		}
		
	}
		
		
		@Test(dependsOnMethods = {"adminCreationAndAppraoveTest"})
		public void adminInternshipPostingData() throws InterruptedException {
			
			AdminLoginPage aps=new AdminLoginPage(driver);
			Thread.sleep(2000);
			aps.fillUsername("DineshKumar");
			Thread.sleep(2000);
			aps.fillpassword("DineshKumar@123");
			Thread.sleep(2000);
			aps.clickOnAdminLogin();
			Thread.sleep(2000);
			GenericMethods.acceptAlert(driver);
			ExtentReportManager.test.log(Status.INFO, "User is on Admin Module To Post The Jobs");
			
			AdminJobPostDetailsPage aj=new AdminJobPostDetailsPage(driver);
			Thread.sleep(3000);
			aj.clicklinkInternships();
			ExtentReportManager.test.log(Status.INFO, "User is on Internship Module and filling the form To Post The Internship");
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
			Thread.sleep(3000);
			GenericMethods.scrollIntoView(driver,aj.formbtncreate);
			wait.until(ExpectedConditions.elementToBeClickable(aj.formbtncreate));
			aj.clickOnCreateBtn();
			ExtentReportManager.test.log(Status.INFO, "Admin Succeessfully Post The Internships...waiting for SuperAdmin Approaval");
			Thread.sleep(3000);
			GenericMethods.acceptAlert(driver);
			Thread.sleep(3000);
	
	}
	
		@Test(dependsOnMethods = {"adminInternshipPostingData"})
		public void adminInternshipAppraovalAndPostTest() throws InterruptedException {
			/*
			 * AdminJobPostDetailsPage aj=new AdminJobPostDetailsPage(driver);
			 * Thread.sleep(3000); GenericMethods.acceptAlert(driver); Thread.sleep(3000);
			 */
			 	            
	
	}
	
		
	

}
