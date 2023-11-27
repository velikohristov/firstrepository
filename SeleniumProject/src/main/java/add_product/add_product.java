package add_product;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class add_product {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();		
		driver.get("https://magento.softwaretestingboard.com");
		
		try {
			WebElement searchInput = driver.findElement(By.id("search"));
            searchInput.sendKeys("Ida Workout Parachute Pant");
            
            WebElement searchButton = driver.findElement(By.cssSelector(".action.search"));
            searchButton.click();
			
			WebElement addToCartButton = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[2]/div[2]/ol/li[1]/div/a/span/span/img"));
			addToCartButton.click();
			
			WebElement sizeButton = driver.findElement(By.xpath("//*[@id=\"option-label-size-143-item-171\"]"));
			sizeButton.click();
			
			WebElement colorButton = driver.findElement(By.xpath("//*[@id=\"option-label-color-93-item-50\"]"));
			colorButton.click();
			
			WebElement addtocartbutton = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[1]/div[4]/form/div[2]/div/div/div[2]/button/span"));
			addtocartbutton.click();

			System.out.println("Product added to cart successfully!");
		} catch (NoSuchElementException e) {
			System.out.println("The product is not available.");
			if (driver.findElements(By.xpath("//button[@title='Add to Cart']")).size() == 0) {
				System.out.println("Product is not available.");

			}
		}
	}
}