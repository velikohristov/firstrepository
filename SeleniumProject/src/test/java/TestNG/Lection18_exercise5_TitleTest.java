package TestNG;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

import AdminPage.Admin_Page;

public class Lection18_exercise5_TitleTest {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test
	public void AdminTitle() {
		Admin_Page Admin_Page = new Admin_Page(driver);
		
		Admin_Page.enterUsername("Admin");
		Admin_Page.enterPassword("admin123");
		Admin_Page.clickLoginButton();
		Admin_Page.clickAdminButton();
		
	}

	@AfterTest
	public void tearDown() {
		driver.close();
		
	}
}