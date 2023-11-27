package lection19_exercise1;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

public class WhatsNewTitleTest {

WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		driver = new FirefoxDriver();
		driver.get("https://magento.softwaretestingboard.com");
	}
	
	@Test
	public void WhatsNewTitle() throws InterruptedException {
		WhatsNewPage WhatsNewPage = new WhatsNewPage(driver);
		
		Thread.sleep(1000);
		
		WhatsNewPage.WhatsNewButton();
		
		String text = driver.findElement(By.xpath("/html/body/div[2]/div[2]/ul/li[2]/strong")).getText();
		
		System.out.println(text);
	}	
		
		@AfterTest
		public void tearDown() {
			//driver.close();
			
	}
}