package lection11_exercises;

import org.openqa.selenium.By;
import java.util.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class create_account {

	public static void main(String[] args) {
		try {
			FirefoxDriver driver = new FirefoxDriver();
			
			driver.get("https://magento.softwaretestingboard.com");
			
			WebElement createAccountElement = driver.findElement(By.linkText("Create an Account"));
			createAccountElement.click();
			
			WebElement firstnameField = driver.findElement(By.id("firstname"));
			firstnameField.sendKeys("Veliko");
			
			WebElement lastnameField = driver.findElement(By.id("lastname"));
			lastnameField.sendKeys("Hristov");
			
			WebElement emailField = driver.findElement(By.id("email_address"));
			emailField.sendKeys("veliko123@abv.bg");
			
			WebElement passField = driver.findElement(By.id("password"));
			passField.sendKeys("Pass1234!");
			
			WebElement confirmpassword = driver.findElement(By.id("password-confirmation"));
			confirmpassword.sendKeys("Pass1234!");
			
			WebElement button = driver.findElement(By.cssSelector(".action.submit.primary"));
			button.click();
			
		} catch(NoSuchElementException exception) {
			System.out.println("Element not found");
		}
	}
}