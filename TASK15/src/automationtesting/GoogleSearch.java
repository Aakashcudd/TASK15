package automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		 driver.get("https://www.google.com");

	        // Find the search input element
	        WebElement searchBox = driver.findElement(By.name("q"));

	        // Enter the search query
	       // searchBox.sendKeys("selenium Browser Driver");

	        // Submit the search query
	        searchBox.submit();

	        // Wait for the search results page to load
	        // You may need to add a wait here to ensure the page is fully loaded before proceeding

	        // Get the title of the search results page
	        String pageTitle = driver.getTitle();
	        System.out.println("Title of the search results page: " + pageTitle);

	        // Close the browser
	        driver.quit();

	}

}
