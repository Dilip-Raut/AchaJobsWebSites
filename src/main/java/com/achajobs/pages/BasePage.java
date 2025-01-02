package com.achajobs.pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	WebDriver driver;
	Actions act;
	public static WebDriverWait wait;
	public static JavascriptExecutor js;
	
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
		act=new Actions(driver);
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		js = (JavascriptExecutor) driver;
		PageFactory.initElements(driver,this);
	}
}