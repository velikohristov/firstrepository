package invalid_option;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class invalid_option {


		    public static void main(String[] args) {
		    	try {
		        WebDriver driver = new FirefoxDriver();

		            driver.get("https://magento.softwaretestingboard.com");

		            WebElement dropdown = driver.findElement(By.id("dropdown-id"));

		            Select select = new Select(dropdown);
		            select.selectByValue("invalid-option-value");
		            
		            System.out.println("Invalid option selected.");

		        } catch (Exception e) {
		            System.out.println("Invalid option selection failed.");

		}
	}
}