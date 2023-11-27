package lection18_exercise1;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

public class loginpage {

	WebDriver driver = null;
	
	public loginpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
	private WebElement emailField;
	
	@FindBy(xpath = "/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
	private WebElement passwordlField;
	
	@FindBy(id = "/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
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