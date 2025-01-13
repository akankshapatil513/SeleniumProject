package PageObjectModel;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoginBaseClass {

    public ChromeDriver driver;
    Properties envprop = new Properties();
    @BeforeTest
    public void loadEnvironment()throws IOException {
        Properties globalprop = new Properties();
        globalprop.load(new FileInputStream(new File
                ("C:\\Users\\HEMANT\\IdeaProjects\\SeleniumProject\\config\\global.properties")));
        String envname = globalprop.getProperty("env");
        System.out.println(envname);


        envprop.load(new FileInputStream(new File
                ("C:\\Users\\HEMANT\\IdeaProjects\\SeleniumProject\\config/" + envname + ".properties")));

    }

    @BeforeClass
    public void url()
    {
        driver = new ChromeDriver();
        driver.get(envprop.getProperty("url"));
    }
    @AfterClass(enabled = false)
    public void close()
    {
        driver.close();
    }
    @DataProvider(name="Logindata")
    public static Object[][]TestData()
    {
        Object[][] testdata=
                {
                        {"standard_user","secret_sauce",""},
                        //{"standard_user","secret_sace" ,"Epic sadface: Username and password do not match any user in this service"},
                       // {"standarduser","secret_sauce" ,"Epic sadface: Username and password do not match any user in this service"},
                       // {"","secret_sauce","Epic sadface: Username is required"},
                       // {"standard_user","","Epic sadface: Password is required"}
                };
        return testdata;
    }
    @DataProvider(name="formdata")
    public static Object[][]orderdata()
    {
        Object[][]orderData={
                {
                 "Akanksha" ,"Patil","415212"
                }

        };
        return orderdata();
    };

}
