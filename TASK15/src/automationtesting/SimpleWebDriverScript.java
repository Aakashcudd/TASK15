package automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleWebDriverScript {

	public static void main(String[] args) {

		// Step 1: Set up WebDriver Environment
        System.setProperty("webdriver.chrome.driver", "E:\\\\Software\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");

        // Step 2: Instantiate WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Step 3: Navigate to a Webpage
            driver.get("https://www.example.com");

            // Step 4: Interact with Web Elements
            // Find and interact with a specific element (e.g., search input)
            WebElement searchInput = driver.findElement(By.name("q"));
            //searchInput.sendKeys("Selenium WebDriver");

            // Submit the search query (if applicable)
            searchInput.submit();

            // Step 5: Perform Assertions or Validations
            // For example, verify the title of the page
            String pageTitle = driver.getTitle();
            if (pageTitle.contains("Example")) {
                System.out.println("Page title contains 'Example'. Test passed!");
            } else {
                System.out.println("Page title does not contain 'Example'. Test failed!");
            }
        } finally {
            // Step 6: Close the Browser
            driver.quit();
        }
	}
}


