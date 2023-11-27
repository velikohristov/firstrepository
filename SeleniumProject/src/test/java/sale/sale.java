package sale;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sale {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
	    driver.get("https://magento.softwaretestingboard.com/");
	    
	    Thread.sleep(1000);
	    
	    WebElement sale = driver.findElement(By.id("ui-id-8"));
	    sale.click();
	    
	    Thread.sleep(1000);
	    
	    WebElement HoodiesAndSweatshirts = driver.findElement(By.xpath("/html/body/div[2]/main/div[4]/div[2]/div/div/ul[2]/li[1]/a"));
	    HoodiesAndSweatshirts.click();
	    
	    Thread.sleep(3000);
	    
	    WebElement MachStreetSweatshirt = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[3]/ol/li[4]/div/a/span/span/img"));
	    MachStreetSweatshirt.click();
	    
	}
}