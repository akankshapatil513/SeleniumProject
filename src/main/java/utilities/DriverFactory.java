package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.SplittableRandom;

public class DriverFactory {

    public static WebDriver driver;

    public static void open_browser()
    {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static void open_url(String url)
    {
        driver.get(url);
    }
    public static WebDriver getDriver()
    {
        return driver;
    }
}
