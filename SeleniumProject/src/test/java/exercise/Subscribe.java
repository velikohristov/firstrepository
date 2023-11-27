package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Subscribe {

		    public static void main(String[] args) throws InterruptedException {

		        WebDriver driver = new FirefoxDriver();
		        driver.get("https://magento.softwaretestingboard.com/");

		        WebElement signUpButton = driver.findElement(By.linkText("Subscribe to our mailing list"));
		        signUpButton.click();

		        WebElement emailField = driver.findElement(By.id("mce-EMAIL"));
		        emailField.sendKeys("adrian.dilov1994@gmail.com");
		        
		        emailField.sendKeys(Keys.RETURN);
		        
		        Thread.sleep(2000);
		        
		        String ConfirmedEmailAddress = driver.findElement(By.id("mce-success-response")).getText();
		        
		        System.out.println(ConfirmedEmailAddress);

		        if (ConfirmedEmailAddress.contains("Almost finished")) {
	                System.out.println("You have subscribed successfully");
	            } else {
	                System.out.println("Not subscribed");
	            }
		}
}