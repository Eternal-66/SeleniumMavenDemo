package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleTest {
    @Test
    public void openGoogle() {
        // Set ChromeDriver path if not in system PATH
        // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println("Page title is: " + driver.getTitle());
        driver.quit();
    }
}
