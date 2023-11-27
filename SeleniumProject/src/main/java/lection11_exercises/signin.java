package lection11_exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class signin {

	public static void main(String[] args) {

			
			FirefoxDriver driver = new FirefoxDriver();			
			driver.get("https://magento.softwaretestingboard.com");
			
			WebElement signInLink = ((WebDriver) driver).findElement(By.linkText("Sign In"));			
			signInLink.click();
			
	}
}