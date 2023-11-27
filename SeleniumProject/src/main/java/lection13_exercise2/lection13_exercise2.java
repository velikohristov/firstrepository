package lection13_exercise2;

	import java.util.ArrayList;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;

public class lection13_exercise2 {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");

		WebElement usernameField = driver.findElement(By.id("user-name"));
		usernameField.sendKeys("standard_user");

		WebElement passwordField = driver.findElement(By.id("password"));
		passwordField.sendKeys("secret_sauce");

		WebElement loginElement = driver.findElement(By.id("login-button"));
		loginElement.click();
		
		WebElement addtocartElement = driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
		addtocartElement.click();

		WebElement cartElement = driver.findElement(By.className("shopping_cart_link"));
		cartElement.click();
		
	}
}