package homework2;

	import java.util.ArrayList;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;

public class homework2 {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		
		WebElement usernameField = driver.findElement(By.id("user-name"));
		usernameField.sendKeys("standard_user");

		WebElement passwordField = driver.findElement(By.id("password"));
		passwordField.sendKeys("secret_sauce");

		WebElement loginElement = driver.findElement(By.id("login-button"));
		loginElement.click();
		
		WebElement facebookButton = driver.findElement(By.partialLinkText("Facebook"));
		facebookButton.click();
		
		String expectedURL = "https://facebook.com/saucelabs";

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

		if (driver.getCurrentUrl().equals(expectedURL)) {
			System.out.println("This is the correct URL.");
		} else {
			System.out.println("This is not correct URL.");
		}
	}
}