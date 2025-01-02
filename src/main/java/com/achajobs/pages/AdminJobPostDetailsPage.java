package com.achajobs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AdminJobPostDetailsPage extends BasePage {

	public AdminJobPostDetailsPage(WebDriver driver) {
		super(driver);
	}

	// Job's Section Locators and Methods

	@FindBy(id = "title")
	WebElement txttitle;

	@FindBy(id = "category")
	WebElement txtcategory;

	@FindBy(id = "location")
	WebElement txtlocation;

	@FindBy(id = "employmentType")
	WebElement txtemploymentType;

	@FindBy(id = "workModel")
	WebElement txtworkModel;

	@FindBy(id = "experience")
	WebElement txtexperience;

	@FindBy(id = "salary")
	WebElement txtsalary;

	@FindBy(id = "status")
	WebElement txtstatus;

	@FindBy(id = "jobDescription")
	WebElement txtjobDescription;

	@FindBy(id = "skills")
	WebElement txtskills;

	@FindBy(id = "company")
	WebElement txtcompany;

	@FindBy(id = "openingStartDate")
	WebElement txtopeningStartDate;

	@FindBy(id = "lastApplyDate")
	WebElement txtlastApplyDate;

	@FindBy(id = "numberOfOpenings")
	WebElement txtnumberOfOpenings;

	@FindBy(id = "perks")
	WebElement txtperks;

	@FindBy(id = "companyDescription")
	WebElement txtcompanyDescription;

	@FindBy(xpath = "//button[text()='Save Job']")
	public WebElement txtSaveJobs;

	@FindBy(xpath = "//h3[text()='Saved Jobs']")
	public WebElement txtSavedJobs;
	
	@FindBy(xpath = "//tbody/tr//td[2]")
	public WebElement txtjobTitle;
	
	@FindBy(xpath = "//button[text()='Edit']")
	public WebElement txtEditbutton;

	public void filltitle(String title) {
		txttitle.sendKeys(title);
	}

	public void fillcategory(String category) {
		txtcategory.sendKeys(category);
	}

	public void fillLocation(String location) {
		txtlocation.sendKeys(location);
	}

	public void fillemploymentType() {
		Select s = new Select(txtemploymentType);
		s.selectByVisibleText("Full Time");
	}

	public void fillworkModel() {
		Select s = new Select(txtworkModel);
		s.selectByVisibleText("WFH (Work From Home)");
	}

	public void fillexperience(String experience) {
		txtexperience.sendKeys(experience);
	}

	public void fillsalary(String salary) {
		txtsalary.sendKeys(salary);
	}

	public void fillstatus() {
		Select s = new Select(txtstatus);
		s.selectByVisibleText("Deactive");
	}

	public void filljobDescription(String jobDescription) {
		txtjobDescription.sendKeys(jobDescription);
	}

	public void fillskills(String skills) {
		txtskills.sendKeys(skills);
	}

	public void fillcompany(String company) {
		txtcompany.sendKeys(company);
	}

	public void fillopeningStartDate(String openingStartDate) {
		txtopeningStartDate.sendKeys(openingStartDate);
	}

	public void filllastApplyDate(String lastApplyDate) {
		txtlastApplyDate.sendKeys(lastApplyDate);
	}

	public void fillnumberOfOpenings(String numberOfOpenings) {
		txtnumberOfOpenings.sendKeys(numberOfOpenings);
	}

	public void fillperks(String perks) {
		txtperks.sendKeys(perks);
	}

	public void fillcompanyDescription(String companyDescription) {
		txtcompanyDescription.sendKeys(companyDescription);
	}

	public void clickOnSavejobs() {
		txtSaveJobs.click();
	}

	// Internships Section Locators and Methods

	@FindBy(xpath = "//a[normalize-space()='Internship']")
	WebElement formlnkInternships;

	@FindBy(xpath = "//input[@formcontrolname='title']")
	WebElement formtitle;

	@FindBy(xpath = "//input[@formcontrolname='company']")
	WebElement formcompany;

	@FindBy(xpath = "//input[@formcontrolname='location']")
	WebElement formLocation;

	@FindBy(xpath = "//input[@formcontrolname='duration']")
	WebElement formduration;

	@FindBy(xpath = "//input[@formcontrolname='stipend']")
	WebElement formstipend;

	@FindBy(xpath = "//input[@formcontrolname='qualifications']")
	WebElement formqualifications;

	@FindBy(xpath = "//input[@formcontrolname='skills']")
	WebElement formskills;

	@FindBy(xpath = "//*[@formcontrolname='description']")
	WebElement formdescription;

	@FindBy(xpath = "//select[@formcontrolname='status']")
	WebElement formstatus;

	@FindBy(xpath = "//input[@formcontrolname='openingStartDate']")
	WebElement formopeningStartDate;

	@FindBy(xpath = "//input[@formcontrolname='lastApplyDate']")
	WebElement formlastApplyDate;

	@FindBy(xpath = "//input[@formcontrolname='numberOfOpenings']")
	WebElement formnumberOfOpenings;

	@FindBy(xpath = "//*[@formcontrolname='perks']")
	WebElement formperks;

	@FindBy(xpath = "//*[@formcontrolname='companyDescription']")
	WebElement formcompanyDescription;

	@FindBy(xpath = "//button[@type='submit']")
	public WebElement formbtncreate;

	@FindBy(xpath = "//h3[normalize-space()='Internships']")
	public WebElement txtInternships;

	public void fillformtitle(String title1) {
		formtitle.sendKeys(title1);
	}

	public void fillformcompany(String formcompany1) {
		formcompany.sendKeys(formcompany1);
	}

	public void fillformLocation(String formLocation1) {
		formLocation.sendKeys(formLocation1);
	}

	public void fillformduration(String formduration1) {
		formduration.sendKeys(formduration1);
	}

	public void fillformstipend(String formstipend1) {
		formstipend.sendKeys(formstipend1);
	}

	public void fillformqualifications(String formqualifications1) {
		formqualifications.sendKeys(formqualifications1);
	}

	public void fillformskills(String formskills1) {
		formskills.sendKeys(formskills1);
	}

	public void fillformdescription(String formdescription1) {
		formdescription.sendKeys(formdescription1);
	}

	public void fillformstatus() {
		Select s=new Select(formstatus);
		s.selectByVisibleText("Active");
	}

	public void fillformopeningStartDate(String formopeningStartDate1) {
		formopeningStartDate.sendKeys(formopeningStartDate1);
	}

	public void fillformlastApplyDatee(String formlastApplyDate1) {
		formlastApplyDate.sendKeys(formlastApplyDate1);
	}

	public void fillformnumberOfOpenings(String formnumberOfOpenings1) {
		formnumberOfOpenings.sendKeys(formnumberOfOpenings1);
	}

	public void fillformperks(String formperks1) {
		formperks.sendKeys(formperks1);
	}

	public void fillformcompanyDescription(String formcompanyDescription1) {
		formcompanyDescription.sendKeys(formcompanyDescription1);
	}

	public void clickOnCreateBtn() {
		formbtncreate.click();
	}
	
	public void clicklinkInternships() {
		formlnkInternships.click();
	}

}
