package TestNG;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class wait_exercise2 {

WebDriver driver = null;
	
	public void testSetup () {
		
		WebDriver driver = new FirefoxDriver ();
		driver.get("https://www.saucedemo.com/");
		
	}
		
		@SuppressWarnings("deprecation")
		public void login() {
		
        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys("standard_user");
        
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");
        
        WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement element = driver.findElement(By.id("inventory_item_img"));
	    element.click();
	    
	    WebElement addtocartButton = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
	    addtocartButton.click();
	    
	    WebElement cartButton = driver.findElement(By.className("shopping_cart_link"));
	    cartButton.click();
	    
		}
		
		@AfterTest
		public void tearDown() {
			driver.quit();
			System.out.println("Test Completed Successfully");

		}		
}