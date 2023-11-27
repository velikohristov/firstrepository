package TestNG;

	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

public class lection18_exercise6_TitleTest {
	
WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test
	public void lection18_exercise6Title() {
		lection18_exercise6 lection18_exercise6 = new lection18_exercise6(driver);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		lection18_exercise6.enterUsername("Admin");
		lection18_exercise6.enterPassword("admin123");
		lection18_exercise6.clickLoginButton();
		lection18_exercise6.clickAdminButton();
		lection18_exercise6.clickPimButton();
		lection18_exercise6.clickLeaveButton();
		lection18_exercise6.clickTimeButton();
		lection18_exercise6.clickRecruitmentButton();
		lection18_exercise6.clickMyInfoButton();
		lection18_exercise6.clickPerformanceButton();
		lection18_exercise6.clickDashboardButton();
		lection18_exercise6.clickDirectoryButton();
		lection18_exercise6.clickMaintenanceButton();
		lection18_exercise6.clickClaimButton();
		lection18_exercise6.clickBuzzButton();
		
	}

	@AfterTest
	public void tearDown() {
		driver.close();
		
	}
}