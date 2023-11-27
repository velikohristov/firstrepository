package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class login {

	    public static void main(String[] args) {
	    	
	        try {
	        	WebDriver driver = new FirefoxDriver();	        	
	            driver.get("https://magento.softwaretestingboard.com");
	            
	            WebElement loginButton = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a"));
	            loginButton.click();
	            
	            WebElement emailField = driver.findElement(By.id("email"));
	            emailField.sendKeys("adrian.dilov1994@gmail.com");
	            
	            WebElement passwordField = driver.findElement(By.id("pass"));
	            passwordField.sendKeys("Pass1234!");
	            
	            WebElement signinButton = driver.findElement(By.id("send2"));
	    		signinButton.click();

	            System.out.println("Login successful!");

	        } catch (Exception e) {
	            System.out.println("Login not successfull!");
	       
	        }
	    }
}