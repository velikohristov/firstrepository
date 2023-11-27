package lection17_homework1;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;


public class AccountPageTitleTest {
	
WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		driver = new FirefoxDriver();
		driver.get("https://magento.softwaretestingboard.com/customer/account/edit/");
	}
	
	@Test
	public void EditPageTitle() {
		AccountRegistratitonPage editPage = new AccountRegistratitonPage(driver);
		
		editPage.enterFirstName("Todor");
		editPage.enterLastName("Petrov");
		editPage.clickChangeEmail();
		editPage.clickChangePassword();
		editPage.enterNewEmail("derib4682@newnime.com");
		editPage.enterCurrentPassword("Pass_1234");
		editPage.enterNewPassword("Pass_3456");
		editPage.enterConfirmNewPassword("Pass_3456");
		editPage.clickSave();
		
	}
		@AfterTest
		public void tearDown() {
			driver.close();
			
	}
}