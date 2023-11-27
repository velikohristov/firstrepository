package lection19_exercise3;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

public class ElementsPage {

WebDriver driver = null;
	
	public ElementsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "ui-id-3")
	private WebElement whatsnewButton;
	
	@FindBy(id = "ui-id-4")
	private WebElement womanButton;
	
	@FindBy(id = "ui-id-5")
	private WebElement menButton;
	
	@FindBy(id = "ui-id-6")
	private WebElement gearButton;	
	
	@FindBy(id = "ui-id-7")
	private WebElement trainingButton;
	
	@FindBy(id = "ui-id-8")
	private WebElement saleButton;
	
	public void clickWhatsNewButton() {
		whatsnewButton.click();
	}
	
	public void clickWomanButton() {
		womanButton.click();
	}
	
	public void clickMenButton() {
		menButton.click();
	}
	
	public void clickGearButton() {
		gearButton.click();
	}
	
	public void clickTrainingButton() {
		trainingButton.click();
	}
	
	public void clickSaleButton() {
		saleButton.click();
	}
}