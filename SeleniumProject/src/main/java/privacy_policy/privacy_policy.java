package privacy_policy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class privacy_policy {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver = new FirefoxDriver();
		 driver.get("https://magento.softwaretestingboard.com/");
		 
		 WebElement privacyandcookiepolicy = driver.findElement(By.xpath("/html/body/div[2]/footer/div/ul/li[2]/a"));
		 privacyandcookiepolicy.click();
	     
	     Thread.sleep(1000);
	     
	     WebElement lumaprivacypolicy = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/div[2]/div[2]/ul/li[2]/a"));
	     lumaprivacypolicy.click();
	     
	     Thread.sleep(5000);
	     
	}
}