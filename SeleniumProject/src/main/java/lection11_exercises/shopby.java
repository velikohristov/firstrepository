package lection11_exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class shopby {

	public static void main(String[] args) {		
		try {
			
			FirefoxDriver driver = new FirefoxDriver();			
			driver.get("https://magento.softwaretestingboard.com");
			
			WebElement ShopByLink = ((WebDriver) driver).findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/div[1]/a/div"));			
			ShopByLink.click();

		} catch(NoSuchElementException exception) {
			System.out.println("Element not found");
		}
	}
}