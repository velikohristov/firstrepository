package lection17_homework3;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

import lection17_exercise2.LoginPage;

public class AddToCartTitleTest {

WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		driver = new FirefoxDriver();
		driver.get("https://magento.softwaretestingboard.com/atlas-fitness-tank.html");
	}
	
	@Test
	public void AddToCartTitle() {
		AddToCartPage AddToCartPage = new AddToCartPage(driver);
		
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		
	}
}