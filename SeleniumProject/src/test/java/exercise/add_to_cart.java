package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class add_to_cart {

	public static void main(String[] args) throws InterruptedException {

		  WebDriver driver = new FirefoxDriver();
	      driver.get("https://magento.softwaretestingboard.com/");
	      
	      
	      WebElement searchField = driver.findElement(By.id("search"));
	      searchField.sendKeys("Olivia");
	      searchField.sendKeys(Keys.RETURN);
	      
	      WebElement product = driver.findElement(By.cssSelector(".product-image-photo"));
	      product.click();
	      
	      Thread.sleep(1000);
	      
	      WebElement size = driver.findElement(By.id("option-label-size-143-item-166"));
	      size.click();
	      
	      WebElement color = driver.findElement(By.id("option-label-color-93-item-50"));
	      color.click();
	      
	      WebElement addToCartButton = driver.findElement(By.id("product-addtocart-button"));
	      addToCartButton.click();
	      
	      Thread.sleep(5000);
	      
	      WebElement cartIcon = driver.findElement(By.cssSelector(".action.showcart"));
	      cartIcon.click();
	      
	      Thread.sleep(3000);
	      
	      WebElement checkoutButton = driver.findElement(By.id("top-cart-btn-checkout"));
	      checkoutButton.click();
	      
	      Thread.sleep(5000);
	      
	      WebElement emailField = driver.findElement(By.id("customer-email"));
	      emailField.sendKeys("tes126573t@test.test");
	      
	      Thread.sleep(5000);
	      
	      WebElement nameField = driver.findElement(By.name("firstname"));
	      nameField.sendKeys("Veliko");
	      
	      WebElement lastNameField = driver.findElement(By.name("lastname"));
	      lastNameField.sendKeys("Hristov");
	      
	      WebElement nextButton = driver.findElement(By.cssSelector(".button.action.continue.primary"));
	      nextButton.click();
	}
}