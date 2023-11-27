package lection19_exercise2;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage {

WebDriver driver = null;
	
	public CreateAccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[3]/a")
	private WebElement CreateaccountButton;
	
	@FindBy(id = "firstname")
	private WebElement firstnameField;
	
	@FindBy(id = "lastname")
	private WebElement lastnameField;
	
	@FindBy(id = "email_address")
	private WebElement emailField;
	
	@FindBy(id = "password")
	private WebElement passwordField;
	
	@FindBy(id = "password-confirmation")
	private WebElement confirmpasswordField;
	
	@FindBy(xpath = "/html/body/div[2]/main/div[3]/div/form/div/div[1]/button/span")
	private WebElement createaccountButton;

	public void clickCreateaccountButton() {
		CreateaccountButton.click();
	}
	
	public void enterFirstname(String firstname) {
		firstnameField.sendKeys(firstname);
	}
	
	public void enterLastname(String lastname) {
		lastnameField.sendKeys(lastname);
	}
	
	public void enterEmail(String email) {
		emailField.sendKeys(email);
	}
	
	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}
	
	public void enterconfirmpassword(String confirmpassword) {
		confirmpasswordField.sendKeys(confirmpassword);
	}
	
	public void clickcreateaccountButton() {
		createaccountButton.click();
	}
}