package lection11_homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class compare_this_product {

	public static void main(String[] args) {
		
			FirefoxDriver driver = new FirefoxDriver();			
			driver.get("https://magento.softwaretestingboard.com/jupiter-all-weather-trainer.html");
			
			WebElement CompareThisProductbutton = ((WebDriver) driver).findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[1]/div[5]/div/a[2]/span"));			
			CompareThisProductbutton.click(); 
				
	}
}