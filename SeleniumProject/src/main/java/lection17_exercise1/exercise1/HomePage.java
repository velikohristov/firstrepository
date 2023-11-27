package lection17_exercise1.exercise1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver = null;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[4]/ul/li[1]/span")
	private WebElement textElement;

	public String getText() {
		String text = textElement.getText();
		return text;
	}
}