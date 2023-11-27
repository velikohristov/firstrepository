package TestNG;

	import java.time.Duration;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

public class lection18_exercise7 {
	
	WebDriver driver = null;
	
	public lection18_exercise7(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	    		
		@FindBy(name = "username") 
		private WebElement usernameField;
        
        @FindBy(name = "password")
        private WebElement passwordField;
        
        @FindBy(xpath = "/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
		private WebElement loginButton;
		
		@FindBy(xpath = "/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[3]/a/span")
		private WebElement LeaveButton;
		
		public void clickLeaveButton() {
			
		}
}	