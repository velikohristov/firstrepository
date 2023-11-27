package lection19_exercise2;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

import lection17_exercise2.LoginPage;

public class CreateAccountTitleTest {

WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		driver = new FirefoxDriver();
		driver.get("https://magento.softwaretestingboard.com/");
	}
	
	@Test
	public void CreateAccountPageTitle() {
		CreateAccountPage CreateAccountPage = new CreateAccountPage(driver);
		
		CreateAccountPage.clickCreateaccountButton();
		CreateAccountPage.enterFirstname("Todor");
		CreateAccountPage.enterLastname("Petkov");
		CreateAccountPage.enterEmail("derib427856@newnime.com");
		CreateAccountPage.enterPassword("Pass_3456");
		CreateAccountPage.clickCreateaccountButton();
	}
	 
	@AfterTest
	public void tearDown() {
		driver.close();
		
	}
}
