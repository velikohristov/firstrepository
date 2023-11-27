package lection13_homework4;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class lection13_homework4 {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");

		WebElement input = driver.findElement(By.id("user-name"));
		input.sendKeys("performance_glitch_user");

		WebElement input1 = driver.findElement(By.id("password"));
		input1.sendKeys("secret_sauce");

		WebElement input2 = driver.findElement(By.id("login-button"));
		input2.click();
		
		String parentWindow = driver.getWindowHandle();
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
		FirefoxDriver driver1 = new FirefoxDriver();
		driver1.get("https://www.saucedemo.com/");

		WebElement input3 = driver.findElement(By.id("user-name"));
		input3.sendKeys("error_user");

		WebElement input4 = driver.findElement(By.id("password"));
		input4.sendKeys("secret_sauce");

		WebElement input5 = driver.findElement(By.id("login-button"));
		input5.click();
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
		FirefoxDriver driver2 = new FirefoxDriver();
		driver2.get("https://www.saucedemo.com/");

		WebElement input6 = driver.findElement(By.id("user-name"));
		input6.sendKeys("visual_user");

		WebElement input7 = driver.findElement(By.id("password"));
		input7.sendKeys("secret_sauce");

		WebElement input8 = driver.findElement(By.id("login-button"));
		input8.click();
	
	}
}