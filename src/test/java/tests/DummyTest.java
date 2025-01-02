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

public class DummyTest extends BaseClass {
	@Test(priority = 1)
	public void readData() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		UserLoginPage up=new UserLoginPage(driver);
		AdminLoginPage ap=new AdminLoginPage(driver);
		AdminRegistrationPage arp=new AdminRegistrationPage(driver);
		SuperAdminLogin sa=new SuperAdminLogin(driver);
		Thread.sleep(7000);
		hp.clickOnLogin();
		Thread.sleep(3000);
		up.clickOnadminLoginFirst();
		Thread.sleep(4000);
		ap.clickOnSuperAdminLogin();
		Thread.sleep(4000);
		sa.fillUsername("admin");
		Thread.sleep(4000);
		sa.fillpassword("admin@123");
		Thread.sleep(4000);
		sa.clickOnSuperAdminLogin();
		Thread.sleep(4000);
		GenericMethods.acceptAlert(driver);
		Thread.sleep(6000);
	
		WebElement tl=driver.findElement(By.xpath("(//table//tbody//tr)[last()]"));
		GenericMethods.scrollIntoView(driver, tl);
		Thread.sleep(4000);
		String name=driver.findElement(By.xpath("(//table//tbody//tr)[last()]/td[2]")).getText();
		System.out.println(name);
		if(name.equals("Diinneesshhaa")) {
			System.out.println("Reading Name");
			Thread.sleep(4000);
			/*
			 * driver.findElement(By.xpath("(//table//tbody//tr)[last()]/td[5]/button[1]")).
			 * click(); System.out.println("Approve request"); Thread.sleep(4000);
			 * GenericMethods.acceptAlert(driver);
			 */		Thread.sleep(4000);
			driver.navigate().back();
			Thread.sleep(4000);
			driver.navigate().back();
			Thread.sleep(4000);
		}
		
	}
		
		@Test(dependsOnMethods = {"readData"})
		public void readAdminData() throws InterruptedException {
			
			AdminLoginPage aps=new AdminLoginPage(driver);
			SuperAdminLogin sa=new SuperAdminLogin(driver);
			SuperAdminDashBoard sd=new SuperAdminDashBoard(driver);
			Thread.sleep(2000);
			aps.fillUsername("Diinneesshhaa");
			Thread.sleep(2000);
			aps.fillpassword("Diinneesshhaa@123");
			Thread.sleep(2000);
			aps.clickOnAdminLogin();
			Thread.sleep(2000);
			GenericMethods.acceptAlert(driver);
			
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
			aj.filljobDescription("Looking for a tester");
			Thread.sleep(2000);
			aj.fillskills("java");
			Thread.sleep(2000);
			aj.fillcompany("DTC");
			Thread.sleep(2000);
			aj.fillopeningStartDate("20-12-2024");
			Thread.sleep(2000);
			aj.filllastApplyDate("25-12-2024");
			Thread.sleep(2000);
			aj.fillnumberOfOpenings("5");
			Thread.sleep(2000);
			aj.fillperks("Nothing");
			Thread.sleep(2000);
			aj.fillcompanyDescription("Nothing");
			Thread.sleep(2000);
			aj.clickOnSavejobs();
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

	            Thread.sleep(4000);
	    		sa.fillUsername("admin");
	    		Thread.sleep(4000);
	    		sa.fillpassword("admin@123");
	    		Thread.sleep(4000);
	    		sa.clickOnSuperAdminLogin();
	    		Thread.sleep(4000);
	    		GenericMethods.acceptAlert(driver);
	    		Thread.sleep(6000);

	    		sd.clickOnPostManagement();
	    		Thread.sleep(4000);
	    		GenericMethods.scrollIntoView(driver, sd.lnkapproaveJob);
	    		Thread.sleep(3000);
	    		sd.clickOnApproavePostRequest();
	    		String job=sd.lnkapproaveJob.getText();
	    		System.out.println("Clicked on Approave Job"+job);
	    		Thread.sleep(4000);
	    	    GenericMethods.acceptAlert(driver);
	    	   
	            // Switch back to the original window
	            driver.switchTo().window(originalWindow);
	            System.out.println("Original window title: " + driver.getTitle());
	            driver.navigate().refresh();
	            Thread.sleep(4000);
	            GenericMethods.scrollIntoView(driver, aj.txtSavedJobs);
	            System.out.println("Getting Job Details"+aj.txtSavedJobs.getText());
	            Thread.sleep(8000);
	            
	
	}
	

}
