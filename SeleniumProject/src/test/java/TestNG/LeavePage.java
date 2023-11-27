package TestNG;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

public class LeavePage {

	WebDriver driver = null;
	
	public LeavePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
	private WebElement usernameField;
	
	@FindBy(xpath = "/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
	private WebElement passwordlField;
	
	@FindBy(xpath = "/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	private WebElement loginButton;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[3]/a/span")
	private WebElement leaveButton;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[1]/a")
	private WebElement applyButton;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]")
	private WebElement typeButton;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/div/div/input")
	private WebElement canButton;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/div/div/i")
	private WebElement startdateButton;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/div")
	private WebElement dateButton;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/div/div/i")
	private WebElement enddateButton;

	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/div")
	private WebElement date1Button;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[4]/button")
	private WebElement apply1Button;
	
	public void enterUsername(String username) {
		usernameField.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		passwordlField.sendKeys(password);
	}
	
	public void clickLoginButton() {
		loginButton.click();
	}
	
	public void clickLeaveButton() {
		leaveButton.click();
	}
	
	public void clickApplyButton() {
		applyButton.click();
	}
	
	public void clickTypeButton() {
		typeButton.click();
	}
	
	public void clickCanButton() {
		canButton.click();
	}
	
	public void clickStartDateButton() {
		startdateButton.click();
	}
	
	public void clickDateButton() {
		dateButton.click();
	}
	
	public void clickEndDateButton() {
		enddateButton.click();
	}
	
	public void clickDate1Button() {
		date1Button.click();
	}
	
	public void clickApply1Button() {
		apply1Button.click();
	}
}