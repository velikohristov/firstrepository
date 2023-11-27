package lection17_homework4;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

public class TestCasePage {

WebDriver driver = null;
	
	public TestCasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[2]/a")
	private WebElement SignInButton;
	
	@FindBy(id = "email")
	private WebElement emailField;
	
	@FindBy(id = "pass")
	private WebElement passwordlField;
	
	@FindBy(xpath = "/html/body/div[2]/main/div[3]/div/div[2]/div[1]/div[2]/form/fieldset/div[4]/div[1]/button/span")
	private WebElement LogInButton;
	
	@FindBy(id = "ui-id-5")
	private WebElement MenButton;
	
	@FindBy(xpath = "/html/body/div[2]/main/div[4]/div[2]/div[1]/div[2]/dl/dd/ol/li[1]/a")
	private WebElement TopsButton;
	
	@FindBy(xpath = "/html/body/div[2]/main/div[3]/div[1]/div[3]/ol/li[1]/div/a/span/span/img")
	private WebElement LandoGymJacketButton;
	
	@FindBy(id = "option-label-size-143-item-166")
	private WebElement SizeButton;
	
	@FindBy(id = "option-label-color-93-item-50")
	private WebElement ColorButton;
	
	@FindBy(id = "qty")
	private WebElement QtyButton;
	
	@FindBy(id = "product-addtocart-button")
	private WebElement AddToCartButton;
	
	public void clickSignInButton() {
		SignInButton.click();
	}

	public void enterEmail(String email) {
		emailField.sendKeys(email);
	}
	
	public void enterPassword(String password) {
		passwordlField.sendKeys(password);
	}
	
	public void clickLoginButton() {
		LogInButton.click();
	}
	
	public void clickMenButton() {
		MenButton.click();
	}
	
	public void clickTopsButton() {
		TopsButton.click();
	}
	
	public void clickLandoGymJacketTankButton() {
		LandoGymJacketButton.click();
	}	
	
	public void clickSizeButton() {
		SizeButton.click();
	}	
	
	public void clickColorButton() {
		ColorButton.click();
	}	
	
	public void clickQtyButton() {
		QtyButton.click();
	}	
	
	public void clickAddToCartButton() {
		AddToCartButton.click();
	}	
}