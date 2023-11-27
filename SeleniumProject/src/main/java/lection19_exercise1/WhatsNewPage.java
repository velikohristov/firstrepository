package lection19_exercise1;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

public class WhatsNewPage {

WebDriver driver = null;
	
	public WhatsNewPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "ui-id-3")
	private WebElement WhatsNewButton;
	
	public void WhatsNewButton() {
		WhatsNewButton.click();
	}
}