package non_existent_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class non_existent_page {

	    public static void main(String[] args) {
	    	
	        try {
	        	WebDriver driver = new FirefoxDriver();
	            driver.get("https://magento.softwaretestingboard.com");

	            if (driver.getPageSource().contains("404 Error: Page not found")) {
	                System.out.println("Page not found. Custom error message: 404 Error");
	            } else {
	                System.out.println("Unknown error occurred.");
	            }

	        } catch (Exception e) {
	            System.out.println("Navigation to non-existent page failed.");
	        }
	   }
}