package TestNG;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

import AdminPage.Admin_Page;

public class Lection18_exercise9_TitleTest {
	
WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test
	public void Lection18_exercise9Title() {
		Lection18_exercise9 Lection18_exercise9 = new Lection18_exercise9(driver);
		
		Lection18_exercise9.enterUsername("Admin");
		Lection18_exercise9.enterPassword("admin123");
		Lection18_exercise9.clickLoginButton();
		Lection18_exercise9.clickLeaveButton();
		Lection18_exercise9.clickAssingLeaveButton();
				
	}

	@AfterTest
	public void tearDown() {
		driver.close();
		
	}
}