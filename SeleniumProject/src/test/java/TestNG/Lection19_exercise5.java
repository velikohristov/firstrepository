package TestNG;

	import org.junit.BeforeClass;
import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;

public class Lection19_exercise5 {

	private WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set up WebDriver (e.g., instantiate ChromeDriver)
    }

    @DataProvider(name = "productData")
    public Object[][] getProductData() {
        // Return a 2D array with test data
        return new Object[][] {
                {"category1", "sortingOption1"},
                {"category2", "sortingOption2"},
                {"category3", "sortingOption3"},                
                {"category1", "sortingOption2"},
                {"category1", "sortingOption3"},
                {"category2", "sortingOption1"},
                {"category2", "sortingOption3"},
                {"category3", "sortingOption1"},
                {"category3", "sortingOption2"},
                // Add more test data sets
        };
    }
}    