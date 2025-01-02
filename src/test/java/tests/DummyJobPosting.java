package tests;

import org.testng.annotations.Test;

import com.achajobs.pages.AdminJobPostDetailsPage;

import testBase.BaseClass;
import utilities.GenericMethods;

public class DummyJobPosting extends BaseClass {

	@Test
	public void jobs() throws InterruptedException {
		driver.navigate().to("https://www.acchajobs.com/save-job");
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
		Thread.sleep(3000);
		GenericMethods.acceptAlert(driver);
		System.out.println("Alert is Accepted");
		Thread.sleep(3000);
		driver.navigate().refresh();
        Thread.sleep(5000);
        GenericMethods.scrollToBottom(driver);
        System.out.println("Job Title is"+aj.txtjobTitle.getText());
        Thread.sleep(8000);


	}
}
