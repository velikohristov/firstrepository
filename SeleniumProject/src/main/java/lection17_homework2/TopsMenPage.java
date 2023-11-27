package lection17_homework2;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

public class TopsMenPage {

	WebDriver driver = null;
	
	public TopsMenPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
		
		@FindBy(xpath = "/html/body/div[2]/div[1]/div/div[2]/nav/ul/li[3]/a/span[2]")
		private WebElement MenButton;
		
		@FindBy(xpath = "/html/body/div[2]/div[1]/div/div[2]/nav/ul/li[3]/ul/li[1]/a/span[2]")
		private WebElement MenTopsButton;
		
		@FindBy(xpath = "/html/body/div[2]/main/div[3]/div[1]/div[3]/ol/li[2]/div/a/span/span/img")
		private WebElement AtlasFitnessTankButton;
		
		public void MenButton() {
			MenButton.click();
		}
		
		public void MenTopsButton() {
			MenTopsButton.click();
		}
		
		public void clickAtlasFitnessTankButton() {
			AtlasFitnessTankButton.click();
		}
}