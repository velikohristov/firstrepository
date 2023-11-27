package lection13_homework3;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class lection13_homework3 {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");

		WebElement usernameField = driver.findElement(By.id("user-name"));
		usernameField.sendKeys("standard_user");

		WebElement input = driver.findElement(By.id("password"));
		input.sendKeys("secret_sauce");

		WebElement input1 = driver.findElement(By.id("login-button"));
		input1.click();
		
		WebElement input2 = driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
		input2.click();
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
		FirefoxDriver driver1 = new FirefoxDriver();
		driver1.get("https://www.saucedemo.com/");
		
		WebElement input3 = driver.findElement(By.id("user-name"));
		input3.sendKeys("standard_user");

		WebElement input4 = driver.findElement(By.id("password"));
		input4.sendKeys("secret_sauce");

		WebElement input5 = driver.findElement(By.id("login-button"));
		input5.click();
		
		WebElement input6 = driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
		input6.click();
		
		WebElement input7 = driver.findElement(By.id("user-name"));
		input7.sendKeys("standard_user");

		WebElement input8 = driver.findElement(By.id("password"));
		input8.sendKeys("secret_sauce");

		WebElement loginElement = driver.findElement(By.id("login-button"));
		loginElement.click();
		
		WebElement addtocartLink = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		addtocartLink.click();
		
	}
}