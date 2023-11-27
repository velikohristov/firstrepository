package TestNG;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

public class Lection18_exercise8_TitleTest {
	
WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test
	public void Lection18_exercise8Title() {
		Lection18_exercise8 Lection18_exercise8 = new Lection18_exercise8(driver);
		
		Lection18_exercise8.enterUsername("Admin");
		Lection18_exercise8.enterPassword("admin123");
		Lection18_exercise8.clickUsernamesortButton();
		Lection18_exercise8.clickAscButton();
		Lection18_exercise8.clickUsernamesortButton();
		Lection18_exercise8.clickdescButton();
		Lection18_exercise8.clicUserrolesortButton();
		Lection18_exercise8.clickasc1Button();
		Lection18_exercise8.clicUserrolesortButton();
		Lection18_exercise8.clickdesc1Button();
		Lection18_exercise8.clickEmployeenameButton();
		Lection18_exercise8.clickAsc2Button();
		Lection18_exercise8.clickEmployeenameButton();
		Lection18_exercise8.clickDesc2Button();
		Lection18_exercise8.clickStatusButton();
		Lection18_exercise8.clickAsc3Button();
		Lection18_exercise8.clickStatusButton();
		Lection18_exercise8.clickDesc3Button();
	
	}

	@AfterTest
	public void tearDown() {
		driver.close();
		
	}
}