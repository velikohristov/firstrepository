package lection11_homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class all_products {

	public static void main(String[] args) {
			
			FirefoxDriver driver = new FirefoxDriver();			
			driver.get("https://magento.softwaretestingboard.com");
			
			WebElement saleLink = ((WebDriver) driver).findElement(By.partialLinkText("Sale"));
			saleLink.click(); 
			
	}
}