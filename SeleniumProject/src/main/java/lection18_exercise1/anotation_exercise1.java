package lection18_exercise1;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;

public class anotation_exercise1 {

	WebDriver driver = null;

	public void testSetup() {
		driver = new FirefoxDriver();	        	
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	public void login() {
        
		loginpage login = new loginpage(driver);
		
		login.enterEmail("Admin");
        
        login.enterPassword("admin123");
        
		login.clickLoginButton();
			
    }
}