package invalid_data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class invalid_data {

		    public static void main(String[] args) {
		    
		        try {
		        	WebDriver driver = new FirefoxDriver();
		            driver.get("https://magento.softwaretestingboard.com");

		            WebElement nameField = driver.findElement(By.id("email"));
		            nameField.sendKeys("Invalid email");

		            WebElement emailField = driver.findElement(By.id("password"));
		            emailField.sendKeys("invalid password");

		            WebElement submitButton = driver.findElement(By.id("submit-button"));
		            submitButton.click();
		            WebElement errorMessage = driver.findElement(By.id("error-message"));

		            if (errorMessage.isDisplayed()) {
		                System.out.println("Form data is invalid.");
		            } else {
		                System.err.println("Unknown error occurred.");
		            }

		        } catch (Exception e) {
		            System.out.println("Form submission failed.");
		    }
		}
}