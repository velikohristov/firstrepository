package lection13_exercise3;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class lection13_exercise3 {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");

		WebElement usernameField = driver.findElement(By.id("user-name"));
		usernameField.sendKeys("standard_user");

		WebElement passwordField = driver.findElement(By.id("password"));
		passwordField.sendKeys("secret_sauced");

		WebElement loginElement = driver.findElement(By.id("login-button"));
		loginElement.click();
		
		String text =driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/span")).getText();
		
		System.out.println(text);
		
		if (text.equals("Products")) {
            System.out.println("You logged in successfully.");
        } else {
            System.out.println("You are not logged in successfully.");
        }
	}
}