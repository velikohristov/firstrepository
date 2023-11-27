package search;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class search {

	    public static void main(String[] args) {

	        try {
	        	WebDriver driver = new FirefoxDriver();
	            driver.get("https://magento.softwaretestingboard.com"); 
	            
	            WebElement searchInput = driver.findElement(By.id("search"));
	            searchInput.sendKeys("product");
	            
	            WebElement searchButton = driver.findElement(By.cssSelector(".action.search"));
	            searchButton.click();
	            
	            WebElement searchResults = driver.findElement(By.className("search-results"));
	            if (!searchResults.isDisplayed()) {
	                System.out.println("No search results found.");
	            } else {
	                System.out.println("Search results found.");
	            }
	        } catch (NoSuchElementException e) {
	            System.out.println("Custom error message: No search results found.");
	        }
	    }
	}