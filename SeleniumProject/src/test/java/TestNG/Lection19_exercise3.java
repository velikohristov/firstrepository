package TestNG;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Lection19_exercise3 {
	
	@DataProvider(name = "searchData")
    public Object[][] getSearchData() {
        // Return a 2D array with test data
        return new Object[][] {
                {"keyword1"},
                {"keyword2"},
                {"keyword3"},
                {"keyword4"},
                {"keyword5"},
                {"keyword6"},
                {"keyword7"},
                {"keyword8"},
                {"keyword9"},
                {"keyword10"},
                {"keyword11"},
                {"keyword12"},
                // Add more test data sets
        };
    }

    @Test(dataProvider = "searchData")
    public void testSearch(String searchKeyword) {
        // Your test logic will go here
    }
}