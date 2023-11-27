package TestNG;

	import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

import AdminPage.Admin_Page;

public class lection18_exercise7_TitleTest {

WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test
	public void AdminTitle() {
		Admin_Page adminPage = new Admin_Page(driver);
		
		adminPage.enterUsername("Admin");
		adminPage.enterPassword("admin123");
		adminPage.clickLoginButton();
		
		WebElement adminButton = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[3]/a/span"))));
		adminButton.click();
		
		lection18_exercise7 leavePage = new lection18_exercise7(driver);
		leavePage.clickLeaveButton();
		
	}

	@AfterTest
	public void tearDown() {
		driver.close();
		
	}
}
