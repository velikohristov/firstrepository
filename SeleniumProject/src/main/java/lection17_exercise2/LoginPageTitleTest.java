package lection17_exercise2;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

public class LoginPageTitleTest {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		driver = new FirefoxDriver();
		driver.get("https://magento.softwaretestingboard.com/customer/account/login/");
	}
	
	@Test
	public void LoginPageTitle() {
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.enterEmail("derib55363@newnime.com");
		loginPage.enterPassword("Pass_1234");
		loginPage.clickLoginButton();
	}
	 
	@AfterTest
	public void tearDown() {
		driver.close();
		
	}
}