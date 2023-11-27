package lection13_homework5;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class lection13_homework5 {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");

		WebElement usernameField = driver.findElement(By.id("user-name"));
		usernameField.sendKeys("rtyhrewe");

		WebElement passwordField = driver.findElement(By.id("password"));
		passwordField.sendKeys("dsfsdfsd");

		WebElement loginElement = driver.findElement(By.id("login-button"));
		loginElement.click();

	}
}