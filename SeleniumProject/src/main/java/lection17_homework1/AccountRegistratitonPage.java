package lection17_homework1;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

public class AccountRegistratitonPage {

	WebDriver driver = null;
	
	public AccountRegistratitonPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "/html/body/div[2]/main/div[2]/div[1]/div[3]/div[2]/div/div[2]/a[1]/span")
	private WebElement textElement1;
	
	public void EditAccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "firstname")
	private WebElement FirstNameField;
	
	@FindBy(id = "lastname")
	private WebElement LastNameField;
	
	@FindBy(id = "change-email")
	private WebElement ChangeEmailButton;
	
	@FindBy(id = "change-password")
	private WebElement ChangePasswordButton;
	
	@FindBy(id = "email")
	private WebElement NewEmailField;
	
	@FindBy(id = "current-password")
	private WebElement CurrentPasswordField;
	
	@FindBy(id = "password")
	private WebElement NewPasswordField;
	
	@FindBy(id = "password-confirmation")
	private WebElement ConfirmNewPasswordField;
	
	@FindBy(xpath = "/html/body/div[2]/main/div[2]/div[1]/form/div/div[1]/button")
	private WebElement SaveButton;

	public void enterFirstName(String FirstName) {
		FirstNameField.sendKeys(FirstName);
	}
	
	public void enterLastName(String LastName) {
		LastNameField.sendKeys(LastName);
	}
	
	public void clickChangeEmail() {
		ChangeEmailButton.click();
	}
	
	public void clickChangePassword() {
		ChangePasswordButton.click();
	}
	
	public void enterNewEmail(String NewEmail) {
		NewEmailField.sendKeys(NewEmail);
	}
	
	public void enterCurrentPassword(String CurrentPassword) {
		CurrentPasswordField.sendKeys(CurrentPassword);
	}
		
	public void enterNewPassword(String NewPassword) {
		NewPasswordField.sendKeys(NewPassword);
	}
	
	public void enterConfirmNewPassword(String ConfirmNewPassword) {
		ConfirmNewPasswordField.sendKeys(ConfirmNewPassword);
	}
	
	public void clickSave() {
		SaveButton.click();
	}
}