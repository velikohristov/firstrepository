package lection13_exercise5;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class lection13_exercise5 {

	public static void main(String[] args) throws InterruptedException {

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");

		WebElement userNameField = driver.findElement(By.id("user-name"));
		userNameField.sendKeys("standard_user");

		WebElement passwordField = driver.findElement(By.id("password"));
		passwordField.sendKeys("secret_sauce");

		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
		
		String parentWindow = driver.getWindowHandle();
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
		
		Set<String> allHandles = driver.getWindowHandles();
        for(String handle : allHandles) {
            if(!handle.equals(parentWindow)) {
                driver.switchTo().window(handle);
                break;
            }
        }
        
		driver.get("https://www.saucedemo.com/");
		
		Thread.sleep(5000);

		WebElement userNameField2 = driver.findElement(By.id("user-name"));
		userNameField2.sendKeys("locked_out_user");

		WebElement passwordField2 = driver.findElement(By.id("password"));
		passwordField2.sendKeys("secret_sauce");

		WebElement loginButton2 = driver.findElement(By.id("login-button"));
		loginButton2.click();
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
		
		Set<String> allHandles2 = driver.getWindowHandles();
        for(String handle : allHandles2) {
            if(!handle.equals(parentWindow)) {
                driver.switchTo().window(handle);
                break;
            }
        }
        
		driver.get("https://www.saucedemo.com/");
		
		Thread.sleep(5000);

		WebElement userNameField3 = driver.findElement(By.id("user-name"));
		userNameField3.sendKeys("problem_user");

		WebElement passwordField3 = driver.findElement(By.id("password"));
		passwordField3.sendKeys("secret_sauce");

		WebElement loginButton3 = driver.findElement(By.id("login-button"));
		loginButton3.click();
	
	}
}