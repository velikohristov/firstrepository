package TestNG;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

import lection17_exercise2.LoginPage;

public class LeaveTitleTest {
	

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
		leavePage.clickLeaveButton();
		leavePage.clickApplyButton();
		leavePage.clickTypeButton();
		leavePage.clickCanButton();
		leavePage.clickStartDateButton();
		leavePage.clickDateButton();
		leavePage.clickEndDateButton();
		leavePage.clickDate1Button();
		leavePage.clickApply1Button();
				
	}
	 
	@AfterTest
	public void tearDown() {
		driver.close();
		
	}
}