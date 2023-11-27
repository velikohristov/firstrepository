package lection17_homework4;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

public class TestCaseTitleTest {
	
WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		driver = new FirefoxDriver();
		driver.get("https://magento.softwaretestingboard.com");
	}
	
	@Test
	public void TestCasePageTitle() throws InterruptedException {
		TestCasePage TestCasePage = new TestCasePage(driver);
		
		TestCasePage.clickSignInButton();
		TestCasePage.enterEmail("derib55363@newnime.com");
		TestCasePage.enterPassword("Pass_1234");
		TestCasePage.clickLoginButton();
		
		Thread.sleep(1000);
		
		TestCasePage.clickMenButton();
		TestCasePage.clickTopsButton();
		TestCasePage.clickLandoGymJacketTankButton();
		
		Thread.sleep(2000);
		
		TestCasePage.clickSizeButton();
		TestCasePage.clickColorButton();
		TestCasePage.clickQtyButton();
		TestCasePage.clickAddToCartButton();

	}
	 
	@AfterTest
	public void tearDown() {
		//driver.close();
		
	}
}