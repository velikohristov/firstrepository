package whats_new;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class whats_new {

	public static void main(String[] args) {
		
			 WebDriver driver = new FirefoxDriver();
			 driver.get("https://magento.softwaretestingboard.com/");
			
			 WebElement wathsnew = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/nav/ul/li[1]/a/span"));
		     wathsnew.click();

		     
		     WebElement ZoltanGymTee = driver.findElement(By.xpath("/html/body/div[2]/main/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[4]/div/a/span/span/img"));
		     ZoltanGymTee.click();
		     
	}
}