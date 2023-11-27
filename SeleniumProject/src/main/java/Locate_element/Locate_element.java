package Locate_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locate_element {
			
		    public static void main(String[] args) {
		       
		    	try {
		    	
		        WebDriver driver = new FirefoxDriver();
		        driver.get("https://magento.softwaretestingboard.com");
		        
		        WebElement element = driver.findElement(By.id("nonexistent-id"));
		        System.out.println("Element found with incorrect locator.");

		        } catch (Exception e) {
		            
		            System.out.println("Element location using incorrect locator failed.");
		       
		}
	}
}