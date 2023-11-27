package lection11_homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class add_to_wishlist {

	public static void main(String[] args) throws InterruptedException {

		
		FirefoxDriver driver = new FirefoxDriver();		
		driver.get("https://magento.softwaretestingboard.com/hero-hoodie.html");
		
		WebElement AddtowishlistLink = ((WebDriver) driver).findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[1]/div[5]/div/a[1]/span"));
		AddtowishlistLink.click(); 
		
		Thread.sleep(1000);
	}
}