package remove_product;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class remove_product {

		    public static void main(String[] args) {

		        try {
		        	WebDriver driver = new FirefoxDriver();		            
		            driver.get("https://magento.softwaretestingboard.com");

		            WebElement removeButton = driver.findElement(By.className("action action-delete"));
		            removeButton.click();

		            System.out.println("Product removed from the cart!");

		        } catch (Exception e) {
		            System.out.println("Product removal failed.");     
		    }
		}
	}