package lection17_exercise3;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

public class RegistrationPageTitleTest {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		driver = new FirefoxDriver();
		driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
	}
	
	@Test
	public void RegistrationPageTitle() {
		RegistratitonPage registrationPage = new RegistratitonPage(driver);
		
		registrationPage.enterFirstName("veliko");	
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		
	}
}