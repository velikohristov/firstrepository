package exercise5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class exercise5 {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		
		WebElement addtocartElement = driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-fleece-jacket"));
		addtocartElement.click();

	}
}