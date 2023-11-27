package TestNG;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

public class Lection18_exercise8 {
	
	WebDriver driver = null;
	
	public Lection18_exercise8(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
			@FindBy(xpath = "/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
	        private WebElement UsernameFiled;
	        
			@FindBy(xpath = "/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
	        private WebElement PasswordField;
	        
			@FindBy(id = "/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
			private WebElement LoginButton;
			
			@FindBy(xpath = "/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")
			private WebElement AdminButton;
			
			@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[1]/div/div[2]/div/i")
			private WebElement usernamesortButton;
			
			@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[1]/div/div[2]/div/div/ul/li[1]/span")
			private WebElement ascButton;
			
			@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[1]/div/div[2]/div/i")
			private WebElement usernamesortButton1;
			
			@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[1]/div/div[2]/div/div/ul/li[2]/span")
			private WebElement descButton;
			
			@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[1]/div/div[3]/div/i")
			private WebElement userrolesortButton;
			
			@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[1]/div/div[3]/div/div/ul/li[1]/span")
			private WebElement asc1Button;
			
			@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[1]/div/div[3]/div/i")
			private WebElement userrolesort1Button;
			
			@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[1]/div/div[3]/div/div/ul/li[2]/span")
			private WebElement desc1Button;
			
			@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[1]/div/div[4]/div/i")
			private WebElement employeenameButton;
			
			@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[1]/div/div[4]/div/div/ul/li[1]/span")
			private WebElement asc2ButtonButton;
			
			@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[1]/div/div[4]/div/i")
			private WebElement employeename1Button;
			
			@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[1]/div/div[4]/div/div/ul/li[2]/span")
			private WebElement desc2ButtonButton;
			
			@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[1]/div/div[5]/div/i")
			private WebElement statusButton;
			
			@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[1]/div/div[5]/div/div/ul/li[1]/span")
			private WebElement asc3ButtonButton;
			
			@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[1]/div/div[5]/div/i")
			private WebElement status1Button;
			
			@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[1]/div/div[5]/div/div/ul/li[2]/span")
			private WebElement desc3Button;
			
			public void enterUsername(String username) {
				UsernameFiled.sendKeys(username);
			}
			
			public void enterPassword(String password) {
				PasswordField.sendKeys(password);
			}
			
			public void clickLoginButton() {
				LoginButton.click();
			}
			
			public void clickAdminButton() {
				AdminButton.click();
			}
			
			public void clickUsernamesortButton() {
				usernamesortButton.click();
			}
			
			public void clickAscButton() {
				ascButton.click();
			}
			
			public void clickusernamesortButton() {
				usernamesortButton.click();
			}
			
			public void clickdescButton() {
				descButton.click();
			}
			
			public void userrolesortButton() {
				userrolesortButton.click();
			}
			
			public void clickasc1Button() {
				asc1Button.click();
			}
			
			public void clicUserrolesortButton() {
				userrolesortButton.click();
			}
			
			public void clickdesc1Button() {
				desc1Button.click();
			}
			
			public void clickEmployeenameButton() {
				employeenameButton.click();
			}
			
			public void clickAsc2Button() {
				ascButton.click();
			}
			
			public void clickEmployeename1Button() {
				employeename1Button.click();
			}
			
			public void clickDesc2Button() {
				desc1Button.click();
			}
			
			public void clickStatusButton() {
				statusButton.click();
			}
			
			public void clickAsc3Button() {
				asc1Button.click();
			}
			
			public void clickStatus1Button() {
				status1Button.click();
			}
			
			public void clickDesc3Button() {
				desc3Button.click();
			}
	 }