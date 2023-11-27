package homework5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class homework5 {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");

		WebElement usernameField = driver.findElement(By.id("user-name"));
		usernameField.sendKeys("standard_user");

		WebElement passwordField = driver.findElement(By.id("password"));
		passwordField.sendKeys("secret_sauce");

		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
		
		WebElement addtocartButton = driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
		addtocartButton.click();

		WebElement cartButton = driver.findElement(By.className("shopping_cart_link"));
		cartButton.click();
		
		WebElement checkoutButton = driver.findElement(By.cssSelector("#checkout"));
		checkoutButton.click();
		
		WebElement firstnameField = driver.findElement(By.id("first-name"));
		firstnameField.sendKeys("Veliko");

		WebElement lastnameField = driver.findElement(By.id("last-name"));
		lastnameField.sendKeys("Hristov");
		
		WebElement zippostalcodeField = driver.findElement(By.id("last-name"));
		zippostalcodeField.sendKeys("1000");
		
		WebElement continueButton = driver.findElement(By.id("continue"));
		continueButton.click();
		
		WebElement finishButton = driver.findElement(By.id("finish"));
		finishButton.click();
				
	}
}