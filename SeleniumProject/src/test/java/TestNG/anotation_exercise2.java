package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class anotation_exercise2 {
	
	public class anotation_exercise {
		
		WebDriver driver = null;

		@BeforeSuite
		public void Setup() {
			driver = new FirefoxDriver();	        	
		    driver.get("https://www.saucedemo.com/");
		}

		 @Test
		    public void login() {
			        
		        WebElement usernameField = driver.findElement(By.id("user-name"));
		        usernameField.sendKeys("error_user");
		        
		        WebElement passwordField = driver.findElement(By.id("password"));
		        passwordField.sendKeys("secret_sauce");
		        
		        WebElement loginButton = driver.findElement(By.id("login-button"));
				loginButton.click();
				
		 }
				
				@AfterSuite
				public void Cleanup() {
					//test cleanup code
					
					WebElement burgerMenu = driver.findElement(By.id("react-burger-menu-btn"));
					burgerMenu.click();
									
				    WebElement logoutButton = driver.findElement(By.id("logout_sidebar_link"));
					logoutButton.click();
	
				}
		 }
}