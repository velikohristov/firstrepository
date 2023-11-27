package lection17_exercise1.exercise1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTitleTest {
	WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		driver = new FirefoxDriver();
		driver.get("https://magento.softwaretestingboard.com/");
	}
	
	@Test
	public void HomePageTitle() {
		HomePage homePage = new HomePage(driver);
		
		String title = homePage.getText();
		
		if(title.equals("Click “Write for us” link in the footer to submit a guest post")) {
			System.out.println("Texts are equal!");
		} else {
			System.out.println("Texts are not equal!");
		}
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
}