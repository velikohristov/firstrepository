package TestNG;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

public class lection19_exercise1 {
	
	WebDriver driver = null;

	@Test(dataProvider = "testData")
	public void testLogin (String username, String password) {
	// perform login with username and password
	// assert that login is successful
		
	driver.get("https://magento.softwaretestingboard.com/?ref=hackernoon.com");
	}
	
	@DataProvider(name = "testData")
	public Object[][] testData() {
	return new
	Object[][]{
	{"user1", "password1"},
	{"user1", "password2"},
	{"user1", "password3"},
	{"user1", "password4"},
	{"user2", "password1"},
	{"user2", "password2"},
	{"user2", "password3"},
	{"user2", "password4"},
	{"user3", "password1"},
	{"user3", "password2"},
	{"user3", "password3"},
	{"user3", "password4"},
	};
	}
}