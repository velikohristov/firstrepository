package homework4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.google.common.collect.ArrayListMultimap;

public class homework4 {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		
		WebElement usernameField = driver.findElement(By.id("user-name"));
		usernameField.sendKeys("standard_user");

		WebElement passwordField = driver.findElement(By.id("password"));
		passwordField.sendKeys("secret_sauce");

		WebElement loginElement = driver.findElement(By.id("login-button"));
		loginElement.click();
		
		WebElement burgerButton = driver.findElement(By.id("react-burger-menu-btn"));
		burgerButton.click();
	}
}