package utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.achajobs.pages.BasePage;

public class GenericMethods extends BasePage {

	public GenericMethods(WebDriver driver) {
		super(driver);
	}

	 public static void scrollIntoView(WebDriver driver, WebElement element) {
	        try {
	            JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	            jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
	          //  System.out.println("Scrolled into view: " + element.toString());
	        } catch (Exception e) {
	            System.out.println("Failed to scroll into view. " + e.getMessage());
	        }
	    }
	 
	 public static void scrollToBottom(WebDriver driver) {
		    try {
		        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		        jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		        // System.out.println("Scrolled to the bottom of the page.");
		    } catch (Exception e) {
		        System.out.println("Failed to scroll to the bottom. " + e.getMessage());
		    }
		}
	 
	 
	public static void acceptAlert(WebDriver driver) {
        try {
            // Switch to the alert
            Alert alert = driver.switchTo().alert();
            // Accept the alert
            alert.accept();
            System.out.println("Alert accepted successfully.");
        } catch (Exception e) {
            System.out.println("No alert present or failed to accept the alert. " + e.getMessage());
        }
    }
}
