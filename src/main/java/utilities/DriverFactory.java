package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
    private static WebDriver driver;

    public static void open_browser() {
        if (driver == null) { // ✅ Prevent multiple instances
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
    }
    public static void open_url(String url) {

        getDriver().get(url);
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            throw new IllegalStateException("WebDriver is null. Call open_browser() before accessing the driver.");
        }
        return driver;
    }

    public static void close_browser() {
        if (driver != null) {
            driver.quit();
            driver = null;  // Reset driver instance
        }
    }

}


