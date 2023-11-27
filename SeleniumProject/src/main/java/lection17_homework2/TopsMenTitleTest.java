package lection17_homework2;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

public class TopsMenTitleTest {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		driver = new FirefoxDriver();
		driver.get("https://magento.softwaretestingboard.com/men/tops-men.html");
				
	}
	
	@Test
	public void TopsMenTitle() {
		TopsMenPage topsMenPage = new TopsMenPage(driver);
	

		topsMenPage.clickAtlasFitnessTankButton();
		
	}	

	@AfterTest
	public void tearDown() {
		driver.close();
	}
}