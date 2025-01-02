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

public class JobPosting extends BaseClass {
	
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
			wait.until(ExpectedConditions.elementToBeClickable(sa.txtUsername));
			sa.fillUsername("admin");
			Thread.sleep(4000);
			sa.fillpassword("admin@123");
			Thread.sleep(4000);
			sa.clickOnSuperAdminLogin();
			Thread.sleep(4000);
			GenericMethods.acceptAlert(driver);
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(15000);
			ExtentReportManager.test.log(Status.INFO, "User Succeessfuly Login To Super Admin Module");
			WebElement tl=driver.findElement(By.xpath("(//table//tbody//tr)[last()]"));
			GenericMethods.scrollIntoView(driver, tl);
			Thread.sleep(20000);
			String name=driver.findElement(By.xpath("(//table//tbody//tr)[last()]/td[2]")).getText();
			System.out.println(name);
			if(name.equals("DineshKumar")) {
				System.out.println("Reading Name");
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//table//tbody//tr)[last()]/td[5]/button[1]")).click();
				System.out.println("Approave request");
				Thread.sleep(4000);
				GenericMethods.acceptAlert(driver);
				Thread.sleep(4000);
				ExtentReportManager.test.log(Status.INFO, "Super Admin Succeessfully Appraove The New Admin");
				driver.navigate().back();
				Thread.sleep(4000);
				driver.navigate().back();
				Thread.sleep(4000);
				
			}
			
		}
		
	}
		
		
		@Test(dependsOnMethods = {"adminCreationAndAppraoveTest"})
		public void adminJobPostingData() throws InterruptedException {
			
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
			Thread.sleep(2000);
			aj.filltitle("Tester");
			Thread.sleep(2000);
			aj.fillcategory("IT");
			Thread.sleep(2000);
			aj.fillLocation("Pune");
			Thread.sleep(2000);
			aj.fillemploymentType();
			Thread.sleep(2000);
			aj.fillworkModel();
			Thread.sleep(2000);
			aj.fillexperience("4");
			Thread.sleep(2000);
			aj.fillsalary("20000");
			Thread.sleep(2000);
			aj.fillstatus();
			Thread.sleep(2000);
			aj.filljobDescription("This is IT company");
			Thread.sleep(2000);
			aj.fillskills("java");
			Thread.sleep(2000);
			aj.fillcompany("DTCX");
			Thread.sleep(2000);
			aj.fillopeningStartDate("20-12-2024");
			Thread.sleep(2000);
			aj.filllastApplyDate("25-12-2024");
			Thread.sleep(2000);
			aj.fillnumberOfOpenings("5");
			GenericMethods.scrollIntoView(driver, aj.txtSaveJobs);
			Thread.sleep(2000);
			aj.fillperks("Nothing");
			Thread.sleep(2000);
			aj.fillcompanyDescription("Nothing");
			Thread.sleep(2000);	
			aj.clickOnSavejobs();
			ExtentReportManager.test.log(Status.INFO, "Admin Succeessfully Post The Job...waiting for SuperAdmin Approaval");
	
	}
	
		@Test(dependsOnMethods = {"adminJobPostingData"})
		public void adminJobsAppraovalAndPostTest() throws InterruptedException {
			AdminJobPostDetailsPage aj=new AdminJobPostDetailsPage(driver);
			Thread.sleep(3000);
			GenericMethods.acceptAlert(driver);
			Thread.sleep(3000);
			 String originalWindow = driver.getWindowHandle();

	            // Open a new window using JavaScript
	            ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("window.open();");

	            // Get all window handles
	            Set<String> allWindows = driver.getWindowHandles();
	            String newWindow = "";

	            // Identify the new window handle
	            for (String window : allWindows) {
	                if (!window.equals(originalWindow)) {
	                    newWindow = window;
	                    break;
	                }
	            }

	            // Switch to the new window
	            driver.switchTo().window(newWindow);
	            driver.get("https://www.acchajobs.com/superadminlogin"); // Load a new URL in the new window

	            SuperAdminLogin sa=new SuperAdminLogin(driver);
	            Thread.sleep(4000);
	    		sa.fillUsername("admin");
	    		Thread.sleep(4000);
	    		sa.fillpassword("admin@123");
	    		Thread.sleep(4000);
	    		sa.clickOnSuperAdminLogin();
	    		Thread.sleep(4000);
	    		GenericMethods.acceptAlert(driver);
	    		Thread.sleep(6000);

	    		SuperAdminDashBoard sd=new SuperAdminDashBoard(driver);
	    		sd.clickOnPostManagement();
	    		ExtentReportManager.test.log(Status.INFO, "User click on PostManagment menu in Super Admin Module to see Job Post");
	    		Thread.sleep(4000);
	    		GenericMethods.scrollIntoView(driver, sd.lnkapproaveJob);
	    		Thread.sleep(3000);
	    		sd.clickOnApproavePostRequest();
	    		String job=sd.lnkapproaveJob.getText();
	    		System.out.println("Clicked on Approave Job"+job);
	    		Thread.sleep(4000);
	    	    GenericMethods.acceptAlert(driver);
	    	    ExtentReportManager.test.log(Status.INFO, "Super Admin Approave the Job Post");
	            // Switch back to the original window
	    	    Thread.sleep(4000);
	            driver.switchTo().window(originalWindow);
	            System.out.println("Original window title: " + driver.getTitle());
	            driver.navigate().refresh();
	            Thread.sleep(4000);
	            driver.navigate().refresh();
	            Thread.sleep(5000);
	            GenericMethods.scrollToBottom(driver);
	            System.out.println("Title of the Job is ---> "+aj.txtjobTitle.getText());
	            Thread.sleep(8000);
	            ExtentReportManager.test.log(Status.INFO, "Admin now can see the Jobs in Saved Jobs Menu");
	            
	
	}
	
		
	

}
