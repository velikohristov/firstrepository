package homework3;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class homework3 {

	public static <Select> void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		
		WebElement usernameField = driver.findElement(By.id("user-name"));
		usernameField.sendKeys("standard_user");

		WebElement passwordField = driver.findElement(By.id("password"));
		passwordField.sendKeys("secret_sauce");

		WebElement loginElement = driver.findElement(By.id("login-button"));
		loginElement.click();
		
		WebElement sortDropdown = driver.findElement(By.className("product_sort_container"));
		sortDropdown.click();
		
		WebElement option = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select/option[2]"));
		option.click();
	}
}