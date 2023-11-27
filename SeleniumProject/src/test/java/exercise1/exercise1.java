package exercise1;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class exercise1 {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");

		WebElement usernameField = driver.findElement(By.id("user-name"));
		usernameField.sendKeys("standard_user");

		WebElement passwordField = driver.findElement(By.id("password"));
		passwordField.sendKeys("secret_sauce");

		WebElement loginElement = driver.findElement(By.id("login-button"));
		loginElement.click();

		WebElement twitterButton = driver.findElement(By.cssSelector(".social_twitter > a"));
		twitterButton.click();

		String expectedURL = "https://twitter.com/saucelabs";

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

		Thread.sleep(1000);

		if (driver.getCurrentUrl().equals(expectedURL)) {
			System.out.println("This is the correct URL.");
		} else {
			System.out.println("This is not correct URL.");
		}
	}
}