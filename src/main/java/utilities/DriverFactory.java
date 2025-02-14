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

    public static void close_browser() {
        if (driver != null) {
            driver.quit();
            driver = null;  // Reset driver instance
        }
    }

    public static void open_url(String url) {
//        if (driver != null) {
//            driver.get(url);
//        } else {
//            throw new IllegalStateException("WebDriver is not initialized! Call open_browser() first.");
//        }
        getDriver().get(url);
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            throw new IllegalStateException("WebDriver is null. Call open_browser() before accessing the driver.");
        }
        return driver;
    }

}


