package lection17_exercise2;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver = null;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "email")
	private WebElement emailField;
	
	@FindBy(id = "pass")
	private WebElement passwordlField;
	
	@FindBy(id = "send2")
	private WebElement loginButton;

	public void enterEmail(String email) {
		emailField.sendKeys(email);
	}
	
	public void enterPassword(String password) {
		passwordlField.sendKeys(password);
	}
	
	public void clickLoginButton() {
		loginButton.click();
	}
}