package lection11_homework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class search {

	public static void main(String[] args) {

			
			FirefoxDriver driver = new FirefoxDriver();			
			driver.get("https://magento.softwaretestingboard.com");
			
			WebElement searchField = driver.findElement(By.id("search"));
			searchField.sendKeys("Magento");
			searchField.sendKeys(Keys.RETURN);
			      
	}
}