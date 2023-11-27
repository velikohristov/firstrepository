package lection11_exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class forgot_password {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = (WebDriver) new FirefoxDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		
		WebElement signinButton = driver.findElement(By.partialLinkText("Sign In"));
		signinButton.click();

		WebElement forgotPasswordButton = driver.findElement(By.partialLinkText("Forgot Your Password?"));
		forgotPasswordButton.click();

		WebElement emailField = driver.findElement(By.id("email_address"));
		emailField.sendKeys("adrian.dilov1994@gmail.com");
		
		Thread.sleep(1000);

		WebElement resetPasswordbutton = driver.findElement(By.cssSelector(".submit > span:nth-child(1)"));
		resetPasswordbutton.click();
	
	}
}