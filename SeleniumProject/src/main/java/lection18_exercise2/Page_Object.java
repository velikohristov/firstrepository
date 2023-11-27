package lection18_exercise2;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;

public class Page_Object {
	
	WebDriver driver = null;

	public void testSetup() {
		driver = new FirefoxDriver();	        	
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	public void dashboard() {
        
		Dashboard dashboard = new Dashboard(driver);
		
		dashboard.enterEmail("Admin");
        
		dashboard.enterPassword("admin123");
        
		dashboard.clickLoginButton();
		
		dashboard.enterSearch("Dashboard");
		
		dashboard.clickDashboardButton();
		
		dashboard.clickAdminButton();
		
		dashboard.clickPIMButton();
		
		dashboard.clickLeaveButton();
		
		dashboard.clickTimeButton();
		
		dashboard.clickRecruitmentButton();
		
		dashboard.clickMyInfoButton();
		
		dashboard.clickPerformanceButton();
		
		dashboard.clickDirectoryButton();
		
		dashboard.clickMaintenanceButton();
		
		dashboard.clickClaimButton();
		
		dashboard.clickBuzzButton();
					
    }
}