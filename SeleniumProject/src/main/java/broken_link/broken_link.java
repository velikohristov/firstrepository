package broken_link;
		
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
		
public class broken_link {

	public static void main(String[] args) {
			
		try {
		        WebDriver driver = new FirefoxDriver();

		            driver.get("https://magento.softwaretestingboard.com");
		            WebElement link = driver.findElement(By.linkText("Broken Link"));
		            link.click();

		            String newPageTitle = null;
					if (newPageTitle.contains("404 Error")) {
		                System.out.println("Broken link clicked. Custom error message: 404 Error");
		            } else {
		                System.err.println("Unknown error occurred.");
		            }
					
		        } catch (Exception e) {
		            System.out.println("Broken link click failed.");
		}
	}
}