package automationtestng;

import Module.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

class Base {

    public static ChromeDriver driver;
   public Properties envprop = new Properties();
    public LoginModule loginModule;
    public  AddCartModule addCartModule;
   public RemoveCartItemModule removcartitemModule;
    public CheckOutModule checkoutModule;
    public UserdetailModule userdetailModule;
    public FinishOrderModule finisordermodule;


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

    @BeforeMethod
    public void url()
    {
        driver = new ChromeDriver();
        driver.get(envprop.getProperty("url"));
        //driver.get(envprop.getProperty("user"));
        loginModule=new LoginModule(driver);
    addCartModule=new AddCartModule(driver);
      removcartitemModule=new RemoveCartItemModule(driver);
      checkoutModule=new CheckOutModule(driver);
        userdetailModule=new UserdetailModule(driver);
        finisordermodule=new FinishOrderModule(driver);


    }
//    @AfterMethod
//    public void reports()
//    {
//        ExtentReports extent;
//        extent = new ExtentReports();
//        ExtentTest test = extent.createTest("Login Test");
//        test.log(Status.PASS, "Test Passed");
//        extent.flush();
//
//    }

    @AfterMethod
    public void close()
    {
        driver.close();
    }
    @DataProvider(name="Logindata")
    public Object[][]TestData()
    {
        Object[][] testdata=
                {
                       {
                          "standard_user","secret_sauce",""},
                       {"standard_user","secret_sace" ,"Epic sadface: Username and password do not match any user in this service"},
                    {"standarduser","secret_sauce" ,"Epic sadface: Username and password do not match any user in this service"},
                      {"","secret_sauce","Epic sadface: Username is required"},
                        {"standard_user","","Epic sadface: Password is required"}
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
