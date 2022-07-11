package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver() {
        WebDriverManager.chromiumdriver().setup();
        driver = new ChromeDriver();
    }

    public static void closeDriver() {
        driver.quit();
    }
}
