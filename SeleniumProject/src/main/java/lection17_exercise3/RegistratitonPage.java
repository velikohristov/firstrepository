package lection17_exercise3;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

public class RegistratitonPage {

	WebDriver driver = null;
	
	public RegistratitonPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "firstname")
	private WebElement firstNameField;
	
	public void enterFirstName(String firstName) {
		firstNameField.sendKeys(firstName);
	}
}