package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class anotation_homework {
		
	WebDriver driver = null;

	@BeforeTest
	public void testSetup() {
		driver = new FirefoxDriver();	        	
	    driver.get("https://www.saucedemo.com/");
	}
    
    @Test
    public void login() {
	        
        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys("standard_user");
        
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");
        
        WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
			
    }
    
    @AfterTest
	public void testOpencart() {
    		
    		WebElement cartButton = driver.findElement(By.id("shopping_cart_container"));
    		cartButton.click();
    						
    }
}