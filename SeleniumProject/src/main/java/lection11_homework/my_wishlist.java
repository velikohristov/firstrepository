package lection11_homework;

	import org.openqa.selenium.By;
	import org.openqa.selenium.NoSuchElementException;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;

public class my_wishlist {

	public static void main(String[] args, By driver) {
			
		try {
	
			FirefoxDriver driver1 = new FirefoxDriver();			
			driver1.get("https://magento.softwaretestingboard.com");
			
			WebElement loginButton = driver1.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a"));
            loginButton.click();
            
            WebElement emailField = driver1.findElement(By.id("email"));
            emailField.sendKeys("adrian.dilov1994@gmail.com");
            
            WebElement passwordField = driver1.findElement(By.id("pass"));
            passwordField.sendKeys("Pass1234!");
            
            WebElement signinButton = driver1.findElement(By.id("send2"));
    		signinButton.click();
			
			WebElement mywishlistbutton = ((WebDriver) driver1).findElement(By.name("My_wishlist"));
			mywishlistbutton.click(); 
			
		} catch (NoSuchElementException e) {
			System.out.println("Your wishlist was not found.");
			}
		}
	}