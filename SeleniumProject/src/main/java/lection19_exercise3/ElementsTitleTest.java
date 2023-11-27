package lection19_exercise3;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

public class ElementsTitleTest {
	
WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		driver = new FirefoxDriver();
		driver.get("https://magento.softwaretestingboard.com");
	}
	
	@Test
	public void ElementsTitle() throws InterruptedException{
		ElementsPage ElementsPage = new ElementsPage(driver);
				
		ElementsPage.clickWhatsNewButton();
		
		Thread.sleep(3000);
		
		ElementsPage.clickWomanButton();
		ElementsPage.clickMenButton();
		ElementsPage.clickGearButton();
		ElementsPage.clickTrainingButton();
		ElementsPage.clickSaleButton();
		
	}	
		@AfterTest
		public void tearDown() {
			//driver.close();
			
	}
}