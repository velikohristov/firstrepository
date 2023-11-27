package lection15_exercise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class lection15_exercise1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();	        	
        driver.get("https://magento.softwaretestingboard.com");
        
        WebElement loginButton = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a"));
        loginButton.click();
        
        WebElement emailField1 = driver.findElement(By.id("email"));
        emailField1.sendKeys("lajalaw802@wanbeiz.com");
        
        WebElement passwordField1 = driver.findElement(By.id("pass"));
        passwordField1.sendKeys("Password_224466");
        
        WebElement signinButton1 = driver.findElement(By.id("send2"));
		signinButton1.click();
		
		Thread.sleep(2000);
		
		WebElement womenCategory = driver.findElement(By.id("ui-id-4"));
		womenCategory.click();
		
		WebElement topsLink = driver.findElement(By.xpath("/html/body/div[2]/main/div[4]/div[2]/div[1]/div[2]/dl/dd/ol/li[1]/a"));
		topsLink.click();
		
		WebElement sortDropdown = driver.findElement(By.id("sorter"));
		sortDropdown.click();
		
		WebElement priceElement = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[2]/div[4]/select/option[3]"));
		priceElement.click();
		
		WebElement radiantteeElement = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[3]/ol/li[1]/div/a/span/span/img"));
		radiantteeElement.click();
		
		Thread.sleep(2000);
		
		WebElement sizeElement = driver.findElement(By.id("option-label-size-143-item-168"));
		sizeElement.click();
		
		WebElement colorElement = driver.findElement(By.id("option-label-color-93-item-50"));
		colorElement.click();
		
		String addedProductHeader = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[1]/div[1]/h1/span")).getText();
		
		WebElement addtocartElement = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[1]/div[4]/form/div[2]/div/div/div[2]/button/span"));
		addtocartElement.click();
		
		System.out.println("reached here1");
		
		Thread.sleep(2000);
		
		WebElement womenCategory2 = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/nav/ul/li[2]/a/span[2]"));
		womenCategory2.click();
		
		System.out.println("reached here2");
		
		Thread.sleep(2000);
		
		WebElement womenBottoms = driver.findElement(By.xpath("/html/body/div[2]/main/div[4]/div[2]/div[1]/div[2]/dl/dd/ol/li[2]/a"));
		womenBottoms.click();
		
		WebElement erikaRunningShortElement = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[3]/ol/li[1]/div/a/span/span/img"));
		erikaRunningShortElement.click();
		
		Thread.sleep(2000);
		
		WebElement sizeElement1 = driver.findElement(By.id("option-label-size-143-item-171"));
		sizeElement1.click();
		
		WebElement colorElement1 = driver.findElement(By.id("option-label-color-93-item-58"));
		colorElement1.click();
		
		WebElement addtocartElement1 = driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]"));
		addtocartElement1.click();
		
		Thread.sleep(2000);
		
		WebElement cartElement = driver.findElement(By.cssSelector(".action.showcart"));
		cartElement.click();
		
		Thread.sleep(2000);
		
		String addedToCartElementHeader = driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/div/div/div/div[2]/div[4]/ol/li[2]/div/div/strong/a")).getText();
		
		WebElement chekoutElement = driver.findElement(By.id("top-cart-btn-checkout"));
		chekoutElement.click();
		
		Thread.sleep(5000);
		
		if(addedProductHeader.equals(addedToCartElementHeader)) {
			System.out.println("Correct product is added");
		}
		else {
			System.out.println("Incorrect product is displayed in the cart");
		}
		
		WebElement shippingmethodElement = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[2]/div/div[3]/form/div[1]/table/tbody/tr[1]/td[1]/input"));
		shippingmethodElement.click();
		
		Thread.sleep(2000);
		
		WebElement nextElement = driver.findElement(By.cssSelector(".button.action.continue.primary"));
		nextElement.click();
		
	}
}