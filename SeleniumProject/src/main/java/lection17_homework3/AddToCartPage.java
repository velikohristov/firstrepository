package lection17_homework3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	
WebDriver driver = null;
	
	public AddToCartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "/html/body/div[2]/div[1]/div/div[2]/nav/ul/li[3]/a/span[2]")
	private WebElement ManButton;
	
	@FindBy(xpath = "/html/body/div[2]/div[1]/div/div[2]/nav/ul/li[3]/ul/li[1]/a/span[2]")
	private WebElement Tops;
	
	@FindBy(xpath = "/html/body/div[2]/main/div[3]/div[1]/div[3]/ol/li[2]/div/a/span/span/img")
	private WebElement AtlasFitnessTank;
	
	@FindBy(xpath = "//*[@id=\"option-label-size-143-item-169\"]")
	private WebElement Size;
	
	@FindBy(xpath = "//*[@id=\"option-label-color-93-item-50\"]")
	private WebElement Color;
	
	@FindBy(xpath = "/html/body/div[2]/main/div[2]/div/div[1]/div[4]/form/div[2]/div/div/div[2]/button/span")
	private WebElement AddToCartButton;
		
}