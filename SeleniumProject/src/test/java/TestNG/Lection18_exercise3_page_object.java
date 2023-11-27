package TestNG;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

public class Lection18_exercise3_page_object {

WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test
	public void LeaveTitle() {
		LeavePage leavePage = new LeavePage(driver);
		
		leavePage.enterUsername("Admin");
		leavePage.enterPassword("admin123");
		leavePage.clickLoginButton();
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		
	}
}