package AdminPage;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

public class Admin_Page {
	
	WebDriver driver = null;
	
	public Admin_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
		        
			@FindBy(xpath = "/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
	        private WebElement usernameFiled;
	        
			@FindBy(xpath = "/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
	        private WebElement passwordField;
	        
			@FindBy(xpath = "/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
			private WebElement loginButton;
		
			@FindBy(xpath = "/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")
			private WebElement AdminButton;
			
			public void enterUsername(String username) {
				usernameFiled.sendKeys(username);
			}
			
			public void enterPassword(String password) {
				passwordField.sendKeys(password);
			}
			
			public void clickLoginButton() {
				loginButton.click();
			}
			
			public void clickAdminButton() {
				AdminButton.click();
			}
	}