package lection11_exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class newswetter_subscription {

	public static void main(String[] args) {
		try {
			FirefoxDriver driver = new FirefoxDriver();			
			driver.get("https://magento.softwaretestingboard.com");
			
			WebElement NewsLetter_SubscriptionLink = driver.findElement(By.linkText("Subscribe to our mailing list"));			
			NewsLetter_SubscriptionLink.click();
			
			WebElement emailField = driver.findElement(By.id("mce-EMAIL"));			
			emailField.sendKeys("valeto_il@gmail.com");			
			
			WebElement button = driver.findElement(By.id("mc-embedded-subscribe"));			
			button.click();
			
		} catch(NoSuchElementException exception) {
			System.out.println("Element not found");
		}
	}
}