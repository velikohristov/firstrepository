package lection18_exercise2;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

public class Dashboard {
	
WebDriver driver = null;
	
	public Dashboard(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
	private WebElement emailField;
	
	@FindBy(xpath = "/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
	private WebElement passwordlField;
	
	@FindBy(id = "/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	private WebElement loginButton;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[1]/aside/nav/div[2]/div/div/input")
	private WebElement searchField;

	@FindBy(xpath = "/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[8]/a")
	private WebElement DashboardButton;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")
	private WebElement AdminButton;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")
	private WebElement PIMButton;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[3]/a")
	private WebElement LeaveButton;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[4]/a")
	private WebElement TimeButton;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a")
	private WebElement RecruitmentButton;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a")
	private WebElement MyInfoButton;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[7]/a/span")
	private WebElement PerformanceButton;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[9]/a")
	private WebElement DirectoryButton;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[10]/a/span")
	private WebElement MaintenanceButton;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[11]/a")
	private WebElement ClaimButton;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[12]/a")
	private WebElement BuzzButton;
	
	public void enterEmail(String email) {
		emailField.sendKeys(email);
	}
	
	public void enterPassword(String password) {
		passwordlField.sendKeys(password);
	}
	
	public void clickLoginButton() {
		loginButton.click();
	}	
		
	public void enterSearch(String search) {
		searchField.sendKeys(search);
	}
	
	public void clickDashboardButton() {
		DashboardButton.click();
	}
	
	public void clickAdminButton() {
		AdminButton.click();
	}
	
	public void clickPIMButton() {
		PIMButton.click();
	}
	
	public void clickLeaveButton() {
		LeaveButton.click();
	}
	
	public void clickTimeButton() {
		TimeButton.click();
	}
	
	public void clickRecruitmentButton() {
		RecruitmentButton.click();
	}
	
	public void clickMyInfoButton() {
		AdminButton.click();
	}
	
	public void clickPerformanceButton() {
		PerformanceButton.click();
	}
	
	public void clickDirectoryButton() {
		DirectoryButton.click();
	}
	
	public void clickMaintenanceButton() {
		MaintenanceButton.click();
	}
	
	public void clickClaimButton() {
		ClaimButton.click();
	}
	
	public void clickBuzzButton() {
		BuzzButton.click();
	}
}